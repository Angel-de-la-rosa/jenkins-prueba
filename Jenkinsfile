pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Angel-de-la-rosa/jenkins-prueba'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}