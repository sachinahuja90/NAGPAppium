# GUI Test Automation using Appium

## Features supported
1. Dependency management and project management by using MAVEN 
2. Functional UI Automation by using Appium Java Client 
3. Cucumber BDD framework
4. TestNG runner to run Cucumber features 
5. GIT as distributed version-control system
6. Modular Approach via Page Object model
7. Device supported - Android VM and Real Devices
8. HTML Report by including Cucumber Extent Reports
9. Logging via Log4j
10. Property Reader to read Test data from properties files.
11. Archived Last execution results by utilizing `java.util.zip`. 
12. Custom exception is created to avoid reading false files, Object Not Found, Zip Creation Exception.
13. Soft assert and Hard Assert used.
14. Capture screen shots for failed testcases.
15. Implicit and Explicit waits are considered for Windows to Load and Mobile Element to load.


## Pre-requisite
1. Java above 1.8.
2. Maven version above 3.0.
3. TestNG 7.0.0

## How to install & Run using command prompt
1. Please extract the project at your desired path.
2. Go to `src/test/resources/config/config.properties` file and update configurations. 
3. Open the command prompt and go to the project path.
4. Run the command "mvn clean install"


## Installing

Refer to the documents attached in `referenceDocument` Folder

		
## To view Report 
1. Go to the root directory under `AppiumProject/Current_test_results/<yyyy-mm-dd hh-mm-ss>/cucumber_report.html`
2. All past reports are saved under `AppiumProject/Arhived_test_results/<yyyy-mm-dd hh-mm-ss>.zip/cucumber_report.html` 

## Git Repository for the source.
`https://github.com/sachinahuja90/NAGPSeleniumAssignment`

