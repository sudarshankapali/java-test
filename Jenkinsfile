pipeline {
    agent any // 1. Where to run (which worker/node)
    
    stages {
        stage('Build') {
            steps {
                bat 'gradlew.bat clean build'
            }
        }
        stage('Test') {
            steps {
                bat 'gradlew.bat test'
            }
        }
        stage('Build Image') {
            steps {
                bat 'docker build -t test-app .'
            }
        }
        stage('Cleanup Old Container') {
            steps {
                bat 'docker stop my-running-app || exit 0'
                bat 'docker rm my-running-app || exit 0'
            }
        }
        stage('Run Container') {
            steps {
                bat 'docker run -d -p 8080:8080 --name my-running-app test-app'
            }
        }
    }
}
