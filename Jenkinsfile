pipeline {
  agent none
  stages {
    stage('Build') {
        agent {
          docker {
            image 'maven'
            args '-p 8006:8080'
          }
        }
      steps {
        sh 'mvn clean install -e'
      }
    }

    stage('Deploy') {
      steps {
        sh 'apt-get install at'
        sh 'echo "mvn spring-boot:run" | at now'
      }
    }

  }
}