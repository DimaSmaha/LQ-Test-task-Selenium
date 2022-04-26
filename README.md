# LQ-Test-task-Selenium
## Test task login and exploratory flow for selenium

### Simple automated test with using of Page Object pattern. Test perfoms login to local step instance and extended with browse on step tabs with a check if page loaded

#### Requirements: Java,Maven,Selenium,JUnit 5

### Setup for local application
- Download and install the Open-Source version of step application (https://step.exense.ch/knowledgebase/3.18/getting-started/quick-setup/) 
- Download and install JDK 11(https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- Download and install Community MongoDB Server(https://fastdl.mongodb.org/win32/mongodb-win32-x86_64-2008plus-ssl-4.0.9-signed.msi)
- Download and unzip controller archive(https://github.com/exense/step/releases/latest)
- Run startController.bat

### Install software and check out the project
- Download and install JDK 11(https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- Download and install IntelliJ idea (https://www.jetbrains.com/ru-ru/idea/download/#section=windows)
- Download and install the appropriate version of ChromeDriver (https://chromedriver.chromium.org/downloads)
- Start new Maven Java project with JDK 11 in IntelliJ idea
- Open pom.xml file make new dependencies tag and write dependencies with latest versions from here
 Selenium(https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)
 JUnit(https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api)
 Webdrivermanager(https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager)
- Add project files to projectname>src>test>java and run the test

#### Expected results: 
- Tests to be ran successfully



