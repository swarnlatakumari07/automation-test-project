$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/features/SearchItem.feature");
formatter.feature({
  "name": "Search Item from Homepage",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Testing"
    }
  ]
});
formatter.scenario({
  "name": "Verify Search items",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Testing"
    }
  ]
});
formatter.step({
  "name": "Open chrome browser and enter url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDescriptor.open_chrome_browser_and_enter_url()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: Cannot find firefox binary in PATH. Make sure firefox is installed. OS appears to be: MAC\nBuild info: version: \u00273.13.0\u0027, revision: \u00272f0d292\u0027, time: \u00272018-06-25T15:24:21.231Z\u0027\nSystem info: host: \u0027Macbook-swk.local\u0027, ip: \u0027fe80:0:0:0:8ab:5801:ead9:8fa3%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.4\u0027, java.version: \u002711.0.5\u0027\nDriver info: driver.version: FirefoxDriver\n\tat org.openqa.selenium.firefox.FirefoxBinary.\u003cinit\u003e(FirefoxBinary.java:116)\n\tat java.base/java.util.Optional.orElseGet(Optional.java:369)\n\tat org.openqa.selenium.firefox.FirefoxOptions.getBinary(FirefoxOptions.java:217)\n\tat org.openqa.selenium.firefox.FirefoxDriver.toExecutor(FirefoxDriver.java:165)\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:125)\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:103)\n\tat org.automation.test.utils.BrowserUtility.OpenBrowser(BrowserUtility.java:21)\n\tat org.automation.test.stepDefinition.StepDescriptor.open_chrome_browser_and_enter_url(StepDescriptor.java:19)\n\tat ✽.Open chrome browser and enter url(src/main/resources/features/SearchItem.feature:5)\n",
  "status": "failed"
});
formatter.step({
  "name": "Verify homePage title",
  "keyword": "When "
});
formatter.match({
  "location": "StepDescriptor.verifyTitle()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter \"Java\" in for search",
  "keyword": "And "
});
formatter.match({
  "location": "StepDescriptor.enter_item_in_for_search(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Search Results",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDescriptor.verify_Search_Results()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException\n\tat org.automation.test.stepDefinition.StepDescriptor.afterScenario(StepDescriptor.java:59)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\n\tat cucumber.runner.TestCase.run(TestCase.java:48)\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\n\tat cucumber.api.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:65)\n\tat org.automation.test.runner.TestRunner.feature(TestRunner.java:32)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:583)\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:719)\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:989)\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\n\tat org.testng.TestRunner.privateRun(TestRunner.java:648)\n\tat org.testng.TestRunner.run(TestRunner.java:505)\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\n\tat org.testng.SuiteRunner.access$000(SuiteRunner.java:40)\n\tat org.testng.SuiteRunner$SuiteWorker.run(SuiteRunner.java:489)\n\tat org.testng.internal.thread.ThreadUtil$1.call(ThreadUtil.java:52)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)\n\tat java.base/java.lang.Thread.run(Thread.java:834)\n",
  "status": "failed"
});
});