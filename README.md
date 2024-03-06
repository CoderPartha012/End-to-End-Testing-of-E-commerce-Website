# TestNG-Project
Build A Selenium Java Framework Project from Scratch using Page Object Model

**Project Overview:**

This Mavenized framework is designed for automated testing using the Page Object Model (POM) approach. It supports multiple browser executions such as Chrome, Firefox, and Edge. The framework utilizes Selenium WebDriver for browser automation, TestNG for test execution, WebDriverManager for managing browser drivers, and AventStack ExtentReports for generating comprehensive test reports in HTML format.

---

**Project Structure:**

- **pom.xml:** Maven configuration file containing project dependencies for Selenium, TestNG, WebDriverManager, and AventStack ExtentReports.

- **src/main/java:**
  - **base:** Contains BaseTest.java, a class providing setup and teardown methods, initializing WebDriver instances, and handling test results and Extent reports.
  - **pageEvents:** Houses LoginPageEvents.java, offering methods to verify the login page's loading and entering login credentials.
  - **pageObjects:** Stores LoginPageElements.java, defining XPath expressions for elements on the login page.
  - **utils:** Contains various utility classes:
    - **Constants.java:** Centralizes commonly used values, such as URLs, to maintain consistency.
    - **ElementFetch.java:** Provides methods for fetching web elements using Selenium WebDriver based on different types of identifiers.
    - **RetryAnalyzer.java:** Controls the retry behavior of failed tests in TestNG.
    - **SuiteListener.java:** Captures screenshots of failed test cases and configures TestNG to use RetryAnalyzer for handling test method retries.

- **src/test/java:**
  - **qa.tests:** Contains Testcase1.java, a test class executing steps to verify login page loading and entering login credentials.

- **Folders:**
  - **logs:** For logging purposes.
  - **driver:** Contains browser drivers managed by WebDriverManager.
  - **reports:** Stores generated test reports in HTML format.
  - **screenshots:** Captures screenshots of failed test cases for debugging.

---

**Execution:**

1. Ensure Maven is installed.
2. Clone the repository.
3. Run `mvn clean test` to execute tests.
4. TestNG will execute the defined test scenarios in parallel for Chrome, Firefox, and Edge browsers.
5. SuiteListener captures screenshots of failed tests, and RetryAnalyzer controls test method retries.

---

**Note:** Ensure proper configuration of WebDriverManager and browser versions for seamless test execution across different environments.

--- 
