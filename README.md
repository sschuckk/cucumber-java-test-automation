<!-- PROJECT LOGO -->
<div align="center">
  <h3 align="center">Cucumber Java Test Automation/</h3>
  <img src="images/cucumberTestResult.png" alt="cucumber-java-test-automation/">
  <p>
    <a href="https://github.com/sschuckk/cucumber-java-test-automation//issues">Report Bug</a>
    ·
    <a href="https://github.com/sschuckk/cucumber-java-test-automation/">Request Feature</a>
  </p>
</div>

<!-- ABOUT THE PROJECT -->
## About The Project

The objective of this project is to develop a basic Web Test Automation framework using Cucumber as a tool for writing tests in a BDD style (Behavior Driven Development).
This framework will facilitate the automated testing of web applications, ensuring functionality and performance align with expected behaviors.
It also utilizes the Page Object Model (POM) design pattern with Selenium, which can simplify the process of enhancing and updating the tests.


```
PROJECT FOLDER
├───src
│   ├───main
│   │   └───java
│   │       └───org
│   │           └───schuck
│   │               └───page_objects
│   │                       LoginPage.java          # Page Object representing WebElements and Actions
│   │
│   └───test
│       ├───java
│       │   ├───org
│       │   │   └───schuck
│       │   │       └───step_definitions
│       │   │               LoginPageSteps.java     # Test step definitions for the Login Page
│       │   │
│       │   └───runner
│       │           CucumberTestRunner.java         # Cucumber test runner
│       │
│       └───resources
│           │   testng.xml                          # TestNG suite configuration
│           │
│           └───features
│                   LoginPage.feature               # File describing the Login Page testing
│
└───target
    └───surefire-reports
            index.html                              # Results by surefire
```


>This is a basic project. If you want to see a POM design with Page Factory, you can check out this other project: https://github.com/sschuckk/selenium-java-test-automation.


### Built With
![Cucumber](https://img.shields.io/badge/Cucumber-43B02A?style=for-the-badge&logo=cucumber&logoColor=white)
![Java](https://img.shields.io/badge/Java_21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Selenium](https://img.shields.io/badge/-selenium_4-%43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![Java](https://img.shields.io/badge/TestNG-%23734F96.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)


---

<!-- GETTING STARTED -->
## Getting Started

### Prerequisites

* Git: https://git-scm.com/downloads
* Java: https://www.oracle.com/java/technologies/downloads/
* Maven: https://maven.apache.org/install.html

### Installation

#### Clone the repository to your machine.
   ```sh
   git clone https://github.com/sschuckk/cucumber-java-test-automation/
   ```


---


<!-- USAGE EXAMPLES -->
## Usage

The project can be run by a terminal or directly in your IDE.

In your terminal go to the project folder and run:

### Running the tests using Maven:

#### Basic execution:

   ```sh
   mvn test
   ```

#### Redirect the Maven terminal log to a file for debug purpose:

   ```sh
   mvn test --log-file ./target/mvn-test.log 
   ```


---


<!-- LOGS AND REPORTS -->
## Reports:

After the execution of all tests, a link will be provided where you can click to access an online report, as shown below:
![Reports](images/cucumberTestExecutionReport.png)
![Reports](images/cucumberReport.png)