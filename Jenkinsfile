pipeline {
  agent none
  stages {
    stage('Build') {
        agent {
          docker {
            image 'maven'
            args '-u root -v /var/jenkins_home/workspace/tancify_master:/var/jenkins_home/workspace/tancify_master'
          }
        }

      }
      steps {
        sh 'mvn clean install'
      }
    }

    stage('Deploy') {
        agent {
          docker {
              image 'ubuntu'
              args '-p 8006:8090  -u root:sudo -v /var/jenkins_home/workspace/tancify_master:/var/jenkins_home/workspace/tancify_master'
          }
      }
      steps {
        sh 'apt-get update'
        sh 'apt-get upgrade'
        sh 'sudo apt-get install default-jdk'
        sh 'apt-get install at'
        sh 'echo "java -jar /var/jenkins_home/workspace/tancify_master/target/tancify-0.1.0-SNAPSHOT.jar" | at now'
      }
    }

  }
}