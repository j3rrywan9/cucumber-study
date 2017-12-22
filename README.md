# Cucumber

We call them acceptance tests because they express what the software needs to do in order for the stakeholders to find it *acceptable*.

It sometimes said that unit tests ensure you *build the thing right*, whereas acceptance tests ensure you *build the right thing*.

## BDD

### Ubiquitous language

Cucumber tests interact directly with the developer's code, but they're written in a medium and language that business stakeholders can understand.

What makes Cucumber stand out from the crowd of other tools is that it has been designed specifically to ensure the acceptance tests can easily be read and written by anyone on the team.

Notice how the test is specified as *examples* of the way we want the system to behave in particular scenarios.

Acceptance tests written in this style become more than just tests;
they become *executable specifications*.

## Living Documentation

Cucumber *feature files* share the benefit of traditional specification documents in that they can be written and read by business stakeholders, but they have a distinct advantage in that a computer can understand them too.

## How Cucumber Works

When you run Cucumber, it reads in your specifications from plain-language text files called *features*, examines them for scenarios to test, and runs the scenarios against your system.
Each scenario is a list of *steps* for Cucumber to work through.
So that Cucumber can understand these feature files, they must follow some basic syntax rules.
The name for this set of rules is *Gherkin*.

Along with the features, you give Cucumber a set of *step definitions*, which map the business-readable language of each step into code to carry out whatever action is being described by the step.
In a mature test suite, the step definition itself will probably just be one or two lines of code that delegate to a library of support code, specific to the domain of your application, that knows how to carry out common tasks on the system.
Sometimes that may involve using an *automation library*, like the browser automation library Selenium, to interact with the system itself.

If the code in the step definition executes without error, Cucumber proceeds to the next step in the scenario.
If it gets to the end of the scenario without any of the steps raising an error, it marks the scenario as having passed.
If any of the steps in the scenario fail, however, Cucumber marks the scenario as having failed and moves on to the next one.
As the scenarios run, Cucumber prints out the results showing you exactly what is working and what isn’t.

## Creating a Feature

Download the latest versions for the following JARs from the public Maven repository and copy them into the `jars` folder.
* cucumber-core
* cucumber-java
* cucumber-jvm-deps
* gherkin

Each Cucumber test is called a *scenario*, and each scenario contains *steps* that tell Cucumber what to do.

We start with features, which contain our scenarios and steps.
The steps of our scenarios call step definitions that provide the link between the Gherkin features and the application being built.

## Creating Step Definitions

## Making It Pass

We've turned our scenario into a `Scenario Outline`, which lets us specify multiple scenarios using a table.

Each row in the `Examples` table is expanded into a scenario when Cucumber runs the scenario outline.

## References

[http://repo1.maven.org/maven2/info/cukes/](http://repo1.maven.org/maven2/info/cukes/)

