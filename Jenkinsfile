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
      agent any
      steps {
        sh 'sudo apt-get install at'
        sh 'echo "java -jar /var/jenkins_home/workspace/tancify_master/target/tancify-0.1.0-SNAPSHOT.jar" | at now'
      }
    }

  }
}