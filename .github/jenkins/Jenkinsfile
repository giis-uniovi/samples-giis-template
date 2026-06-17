node('slave-x1') {

	stage("Init")  {
	    deleteDir()
	    checkout scm
	}

	stage("test") {
	    sh "mvn test -U -ntp"
	}

}
