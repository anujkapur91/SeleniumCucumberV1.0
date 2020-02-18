$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/featureFile2.feature");
formatter.feature({
  "name": "Login to Amazon two",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login With Correct Credentials third",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Launches Amazon Webpage \"\u003cBrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User Navigates to Login Link",
  "keyword": "When "
});
formatter.step({
  "name": "User logins with Username  and Password",
  "keyword": "Then ",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "anujkapur91@gmail.com",
        "Rockye08$"
      ]
    },
    {
      "cells": [
        "anujkapur19@gmail.com",
        "Rockye08$"
      ]
    }
  ]
});
formatter.step({
  "name": "User types \"\u003cProduct\u003e\" \"\u003cModel\u003e\" name and searches and selects the first listing",
  "keyword": "Then "
});
formatter.step({
  "name": "User goes to cart and removes the product",
  "keyword": "Then "
});
formatter.step({
  "name": "User Logs Out",
  "keyword": "Then "
});
formatter.step({
  "name": "User closes Browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Browser",
        "Product",
        "Model"
      ]
    },
    {
      "cells": [
        "FireFox",
        "OnePlus",
        "7T"
      ]
    },
    {
      "cells": [
        "Chrome",
        "OnePlus",
        "7t pro"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login With Correct Credentials third",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launches Amazon Webpage \"FireFox\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.user_Launches_Amazon_Webpage_on(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.UnhandledAlertException: Dismissed user prompt dialog: http://inpnpxy3-wcg.corp.capgemini.com:8080 is requesting your username and password.: \nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LIN51007107\u0027, ip: \u002710.103.1.45\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 72.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200107212822, moz:geckodriverVersion: 0.25.0, moz:headless: false, moz:processID: 25808, moz:profile: C:\\Users\\ankapur\\AppData\\Lo..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 199f5e60-c549-4288-8564-c7b2ae68b548\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions$RemoteWindow.maximize(RemoteWebDriver.java:837)\r\n\tat UILibrary.Actions.getURL(Actions.java:107)\r\n\tat stepDefinations.StepDef.user_Launches_Amazon_Webpage_on(StepDef.java:87)\r\n\tat ✽.User Launches Amazon Webpage \"FireFox\"(src/test/java/features/featureFile2.feature:4)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User Navigates to Login Link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_Navigates_to_Login_Link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User logins with Username  and Password",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "anujkapur91@gmail.com",
        "Rockye08$"
      ]
    },
    {
      "cells": [
        "anujkapur19@gmail.com",
        "Rockye08$"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_logins_with_Username_and_Password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User types \"OnePlus\" \"7T\" name and searches and selects the first listing",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_types_name_and_searches_and_selects_the_first_listing(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User goes to cart and removes the product",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_goes_to_cart_and_removes_the_product()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Logs Out",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_Logs_Out()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User closes Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_closes_Browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login With Correct Credentials third",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launches Amazon Webpage \"Chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.user_Launches_Amazon_Webpage_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Navigates to Login Link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_Navigates_to_Login_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logins with Username  and Password",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "anujkapur91@gmail.com",
        "Rockye08$"
      ]
    },
    {
      "cells": [
        "anujkapur19@gmail.com",
        "Rockye08$"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_logins_with_Username_and_Password(DataTable)"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.xpath: //*[@id\u003d\"continue\"] (tried for 20 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat UILibrary.Actions.click(Actions.java:64)\r\n\tat stepDefinations.StepDef.user_logins_with_Username_and_Password(StepDef.java:117)\r\n\tat ✽.User logins with Username  and Password(src/test/java/features/featureFile2.feature:6)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: //*[@id\u003d\"continue\"]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LIN51007107\u0027, ip: \u002710.103.1.45\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 72.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200107212822, moz:geckodriverVersion: 0.25.0, moz:headless: false, moz:processID: 64916, moz:profile: C:\\Users\\ankapur\\AppData\\Lo..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: cd719f17-faba-4e34-9932-9ff15b27af6a\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"continue\"]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:205)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:201)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\r\n\tat UILibrary.Actions.click(Actions.java:64)\r\n\tat stepDefinations.StepDef.user_logins_with_Username_and_Password(StepDef.java:117)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:49)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:44)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:124)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:133)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:678)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User types \"OnePlus\" \"7t pro\" name and searches and selects the first listing",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_types_name_and_searches_and_selects_the_first_listing(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User goes to cart and removes the product",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_goes_to_cart_and_removes_the_product()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Logs Out",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_Logs_Out()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User closes Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_closes_Browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});