@Library('devops-selenium-functional-tests@develop')

node {

    stage('Preparation') { // for display purposes
        sh 'echo Preparation from pipeline file' 
    }
    stage('Build') {
        sh 'echo Build from pipeline file' 
    }
    stage('Results') {
         sh 'echo Results from pipeline file' 
    }
}