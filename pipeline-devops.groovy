@Library('devops-selenium-functional-tests@develop')

    node{
        stage("Preparation") {
          sh 'echo Preparation'
        }
        stage("Starting Test") {
            sh 'echo Test'
        }
        stage("Sending Report") {
             sh 'echo Report'
        }
    }