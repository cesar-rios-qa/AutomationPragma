# Automation Pragma


## Pre requirements

### Setting up the working environment:

•	Install Java 8 or 17 and configure the JAVA_HOME environment variable on your system.

•	Install maven.

•	Install IntelliJ IDEA.

•	Access to BrowserStack


## The project directory structure
The project has build scripts for Maven, and follows the standard directory structure used in most Serenity projects:
```Gherkin
src
  + main
  + test
    + java                        Test runners and supporting code
    + resources
      + features                  Feature files
```

## Executing the tests
To run the sample project, you can either just run the `CucumberTestSuite` test runner class, or run either `mvn clean verify` from the command line.

### Run tests locally
By default, the tests will run using Chrome and locally. You can run them in Firefox by overriding the `driver` system property, e.g.
```json
$ mvn clean verify -Dwebdriver.driver=firefox
```

### Running tests filtering by tags
```json
$ mvn clean verify -Dcucumber.filter.tags="@tag" 
```

### Run tests in BrowserStack

To run tests on it is necessary to use the `remote` driver, e.g.

```json
$ mvn clean verify -Dwebdriver.remote.url=https://<your-username>:<your-api-key>@hub-cloud.browserstack.com/wd/hub
```

#### Run test in BrowserStack filtering by tags and name for build in BrowserStack
```json
$ mvn clean verify -Dcucumber.filter.tags="@tag" "-Dwebdriver.remote.url=https://<your-username>:<your-api-key>@hub-cloud.browserstack.com/wd/hub" -Dbrowserstack.build="Name for build"
```

**The report with the test results will be recorded in the `target/site/serenity/index.html` directory**.

## Want to learn more?
For more information about Serenity BDD, you can read the [**Serenity BDD Book**](https://serenity-bdd.github.io/docs/guide/user_guide_intro), the official online Serenity documentation source. Other sources include:
* **[Byte-sized Serenity BDD](https://www.youtube.com/channel/UCav6-dPEUiLbnu-rgpy7_bw/featured)** - tips and tricks about Serenity BDD
* For regular posts on agile test automation best practices, join the **[Agile Test Automation Secrets](https://www.linkedin.com/groups/8961597/)** groups on [LinkedIn](https://www.linkedin.com/groups/8961597/) and [Facebook](https://www.facebook.com/groups/agiletestautomation/)
* [**Serenity BDD Blog**](https://johnfergusonsmart.com/category/serenity-bdd/) - regular articles about Serenity BDD
