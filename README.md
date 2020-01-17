# Digital Bank

Digital Bank is a sample application that was developed for exploratory purposes to examine development frameworks and techniques. The application is an example online digital banking application with integrations into other services.

## Getting Started

* Using either an Eclipse IDE or IntelliJ, import the source code as an Existing Maven Project. 

## Prerequisites

* Java SDK 8 - Required only for JUnit tests using CodeSV mock services.
* Install [Apache Maven](https://maven.apache.org/install.html)
* Install [Eclipse IDE](https://www.eclipse.org/ide/), [Spring Tools Suite](https://spring.io/tools) or [IntelliJ](https://www.jetbrains.com/idea/)

## Executing Tests

* JUnit Tests - Execute "mvn clean test"
* Serenity BDD Acceptance Tests - Execute "mvn clean verify"
  * Serenity BDD tests use Cucumber Feature file definitions. 
    * UI Tests are executed using the Selenium Java framework.
    * API Test are executed using the Rest Assured Java framework.
  * Use '-Dcucumber.options="--tags {tag}"' mnv command line option to filter test execution based on Feature or Scenario tags defined within the [feature files](src/test/resources/features).

## Packaging

* To create a deployment package, execute "mvn clean package -DbuildNumber={###}"
* To create a new Docker image, update the [Dockerfile](Dockerfile) with the latest build number and then execute "docker build -t {imageName}:{imageTag} ."

## Deployment

Digital Bank can be deployed as a single standalone application service or be deployed and configured to integrate with Digital Credit.

* [WAR Package Deployment](https://dl.bintray.com/asburymr/digitalbank/)
  * Copy the WAR file into an existing Tomcat instance under ${catalina.base}/webapps folder. 
  * (Optional) Copy the digitalbank.properites file into the ${catalina.base}/conf folder. 
    * Use to customize the configuration of the application.
    * The digitalbank.properties file is configured to be a "watched resource" in the deployment context. Any updates to the digitalbank.properties file will automatically trigger Tomcat to recycle the application to pick up the new changes.
  * Start the Tomcat service.
  * A digitalbank.log file will be created within ${catalina.base}/logs.
* [Docker Deployment](https://hub.docker.com/r/asburymr/digitalbank)
* [Docker Compose Deployment](docker-compose.yml)
  * Use docker-compose up to deploy all of the defined services integrated together.

## Interfaces

* Web Interface @ http://{hostname}:{port}/bank
  * Sample user data is created when the application is started. User credentials for these user are as follows:
    * jsmith@demo.io/Demo123!
    * nsmith@demo.io/Demo123!
* Swagger UI @ http://{hostname}:{port}/bank/swagger-ui.html
  * The API Admin user credentials are as follows:
    * admin@demo.io/Demo123!

## Built With

* [Sufee Admin Dashboard](https://github.com/rockmantic2018/sufee-admin-dashboard-master) - A HTML5 Dashboard Template
* [Spring Boot](https://spring.io/projects/spring-boot) - Application Framework
* [Thymeleaf](https://www.thymeleaf.org/) - Server-Side Java Template
* [Swagger](https://swagger.io/) - API Documentation
* [Apache Maven](https://maven.apache.org/) - Software Project Management
* [Apache Tomcat](http://tomcat.apache.org/) - Application Server / Servlet Engine
* [Apache Artemis](https://activemq.apache.org/components/artemis/) - Messaging Broker
* [H2 Database Engine](https://www.h2database.com/html/main.html) - In-Memory Database
* [MSSQL Server Database Engine](https://www.microsoft.com/en-us/sql-server/default.aspx) - Microsoft SQL Server
* [MySQL Database Engine](https://www.mysql.com/) - MySQL 
* [PostgreSQL Database Engine](https://www.postgresql.org/) - PostgreSQL
* [Serenity BDD](http://www.thucydides.info/#/) - Acceptance Testing Framework
* [JUnit 5](https://junit.org/junit5/) - Unit Testing Framework
* [CodeSV](http://codesv.io/) - Unit Testing with Mock Services
* [BlazeMeter](https://www.blazemeter.com/) - Functional / Performance API & UI Testing Services


## Authors

[Mark Asbury](https://github.com/asburymr)

See the additional list of [contributors](https://github.com/asburymr/Digital-Bank/graphs/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
