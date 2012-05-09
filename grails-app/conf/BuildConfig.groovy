grails.project.work.dir = 'target'
grails.project.docs.output.dir = 'docs/manual' // for gh-pages branch
grails.project.source.level = 1.6

grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		grailsCentral()
	}

	plugins {
		build(':release:2.0.0', ':rest-client-builder:1.0.2') {
			export = false
		}
	}

	dependencies {
		String jettyVersion = '8.1.3.v20120416'
		compile("org.eclipse.jetty:jetty-continuation:${jettyVersion}",
		        "org.eclipse.jetty:jetty-http:${jettyVersion}",
		        "org.eclipse.jetty:jetty-jndi:$jettyVersion",
		        "org.eclipse.jetty:jetty-jsp:$jettyVersion",
		        "org.eclipse.jetty:jetty-plus:$jettyVersion",
		        "org.eclipse.jetty:jetty-security:${jettyVersion}",
		        "org.eclipse.jetty:jetty-server:$jettyVersion",
		        "org.eclipse.jetty:jetty-servlet:${jettyVersion}",
		        "org.eclipse.jetty:jetty-util:$jettyVersion",
		        "org.eclipse.jetty:jetty-webapp:${jettyVersion}",
				  "org.eclipse.jetty:jetty-websocket:${jettyVersion}") {
			excludes 'ant', 'commons-el', 'derby', 'jcl104-over-slf4j', 'jetty-jmx',
			         'jetty-io', 'jetty-test-helper', 'jetty-xml', 'junit', 'mockito-core',
			         'slf4j-api', 'slf4j-jdk14', 'slf4j-simple', 'xercesImpl'
			exclude(group: 'org.eclipse.jetty.orbit', ext: 'orbit')
		}
	}
}