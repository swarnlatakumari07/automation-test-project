

#BDD Automation test Project
This test project used Cucumber BDD and Selemiun WebDriver for test automation.
Cucumber is a BDD testing framework that allows people without programming background write specifications that 
can be translated to unit test requirements almost automatically.

The feature file that has all functionality requirements that the application must fulfill

## Table of Contents

- [Features](#features)
- [Requirements](#requirements)
- [Getting Started](#getting-started)
- [Project Walkthough](#project-walk-through)

## Features
This project contains automation Framework for end to end testing for web Application

## Requirements

* JDK 1.8 at a minimum
* Maven 3.1 or newer
* Git client 
* TestNG
* Selenium WebDriver
* Cucumber
* MacOS

## Getting Started
To Run the test scripts need to import project in ItelliJ IDEA
 install maven
 
    mvn clean install
    
A Build success message should appear

    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 6.308 s
    [INFO] Finished at: 2018-12-13T11:35:54+05:30
    [INFO] Final Memory: 32M/479M
    [INFO] ------------------------------------------------------------------------

## Project Walk Through
 This project contain mainly 3 packages and 1 folder :
 * org.automation.test.page.object
 * org.automation.test.runner
 * org.automation.test.stepDifinition
 * resources/feature
 
 org.automation.test.page.object contains all the pageObject java classes(here loactors are their used methods
  are written here).
 
 org.automation.test.stepDifinition Step definition maps the Test Case Steps in the feature files
 (introduced by Given/When/Then) to code.
 
 feature file contains steps needed to execute scenarios in simple English Language.
 (It has user Requirement scenarios in English Language which uses Gherkin language
  so that readability and understandability of the requirement should be easy)
 
 org.automation.test.runner contains TestRunner class which is used to access the 
 feature file.It actually we provide the link of StepDefinition class and feature file.

rg.automation.test.Utils and rg.automation.test.model contain all helping methods.

All the test and and drivers are kepts in resources folder.
