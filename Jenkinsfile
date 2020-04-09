pipeline {
  agent {
    docker {
      image 'maven'
      args '-p 8006:8080'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean install -e'
      }
    }

    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }

    stage('Deploy') {
      steps {
        sh 'su'
        sh 'yum install at'
        sh 'echo "mvn spring-boot:run" | at now'
      }
    }

  }
}