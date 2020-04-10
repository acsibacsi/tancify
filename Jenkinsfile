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
        sh 'mvn clean install'
      }
    }

    stage('Deploy') {
      agent none
      steps {
        sh 'apt-get install at'
        sh 'echo "mvn spring-boot:run" | at now'
      }
    }

  }
}