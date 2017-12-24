# Installing Cucumber

Cucumber for Java is packaged as a series of JAR files.
You can install it simply by downloading the relevant JAR files and placing them on the Java classpath.
More likely you'll be using some dependency management tool in your build process, such as Maven or Ivy, but this still requires you to specify the leaves of the dependency tree.

## Choosing Your JARs

The current release of Cucumber for Java contains 19 JARs, which split into 4 groups.
You will need to select the JARs that are relevant to your environment.

### Core JARs

The core JAR `cucumber-core` is always needed.

If you're using a dependency management tool, then you'll never need to specify `cucumber-core` because the other Cucumber JARs that you have to specify depend on it, and so it will always be present in the dependency graph.

### Backend Modules

The choice of backend module specifies which language you are going to write your glue (step definitions and hooks) in.
The module defines the format of the snippets that are generated when Cucumber discovers a missing step definition and may also control how Cucumber searches for your glue code.

You must choose one, and only one, of these modules and have it on the Java classpath.

### Runners

The `cucumber-core` JAR provides a class that offers a command-line interface.
If, however, you want to run your features from within an IDE or from a CI server, you may want to interact with the features via a common test API, such as JUnit.

These runners are currently supported by Cucumber:

| Runner | JAR |
| --- | --- |
| JUnit | `cucumber-junit` |
| TestNG | `cucumber-testng` |

### Dependency Injection Modules

You can optionally choose to use one of several DI containers in your glue code.

| DI Container | JAR |
| --- | --- |
| Spring | `cucumber-spring` |

You may choose not to use a DI container, but you must not place more than one DI module on the classpath.

### Version Numbers

You should never mix different version numbers together.

Some of the JARs that Cucumber JVM depends on are not part of the release, and their version numbers are not directly linked to the version of Cucumber JVM you are using.
Specifically `cucumber-jvm-deps` and `gherkin` are released as required and have their own version numbers.

## External Dependencies

### Gherkin

### Cucumber Dependencies

