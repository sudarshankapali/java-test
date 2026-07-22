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
        stage('Deploy') {
            steps {
                echo 'Running unit tests...'
            }
        }
    }
}
