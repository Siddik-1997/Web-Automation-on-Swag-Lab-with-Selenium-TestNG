# Web Automation on SauceDemo Website with Selenium TestNG

## What is Automation?

Automation is the process of using software tools and scripts to perform tasks that would typically be done manually by a human. In the context of software testing, automation involves using tools to execute test cases and compare the actual results with the expected results automatically.

## Why we use Selenium TestNG for Automation?

Selenium is a popular open-source testing tool widely used for automating web browsers. It allows developers and testers to automate web-based applications' testing across multiple browsers and platforms. Selenium provides a set of APIs to interact with web elements and manipulate their properties and behaviors, making it an ideal tool for automating UI tests.

TestNG is a testing framework for Java that is designed to be more flexible and powerful than JUnit. It supports a wide range of testing functionalities, including unit, integration, and end-to-end testing, as well as parallel execution, data-driven testing, and reporting. TestNG is often used with Selenium to create robust and scalable test automation frameworks.

## Technology used:
- Selenium Webdriver
- TestNG Framework
- Java
- Gradle
- Intellij idea
- Allure

## How to run this project

- Clone this project
- Hit the following command into the terminal:
 ```gradle clean test```
 
- For generating Allure Report use these commands:
```allure generate allure-results --clean -o allure-report``` and
```allure serve allure-results```

## Scenerio:

- Login to orange hrm demo site: https://www.saucedemo.com/v1/
- Add a few items to the cart
- Insert the Checkout Information
- Confirm the Order
- Do Logout

## Test case check list based on the Scenerio:

- Customer login with Invalid credentials. 
- Customer Login with valid credentials.
- Adding few items to the cart
- Inserting Checkout information
- Confirm the Order
- Logout the user

## Allure Report:


![image](https://github.com/Siddik-1997/Web-Automation-on-Swag-Lab-with-Selenium-TestNG/assets/123433625/758ab119-cfc3-4ec4-9dd6-7f5475a35a4b)


![image](https://github.com/Siddik-1997/Web-Automation-on-Swag-Lab-with-Selenium-TestNG/assets/123433625/3993a6e1-35d2-4673-b1f2-d3928af86cfc)


## Automation Output Video:

https://github.com/Siddik-1997/Web-Automation-on-Swag-Lab-with-Selenium-TestNG/assets/123433625/ba833611-083f-4bf2-96f6-26cc9bbf21ac






