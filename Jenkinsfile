pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'whoami'
        sh 'mvn clean install'
      }
    }

    stage('Deploy') {
      steps {
        sh 'echo "java -jar /var/jenkins_home/workspace/tancify_master/target/tancify-0.1.0-SNAPSHOT.jar" | at now'
      }
    }

  }
}