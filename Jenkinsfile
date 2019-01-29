pipeline {
  agent {
    docker {
      args '-v /root/.m2:/root/.m2'
      image 'maven:3-jdk-8'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn package'
      }
    }
  }
}