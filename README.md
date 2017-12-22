# Cucumber

## Automated Acceptance Tests

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

## What's Gherkin For?

Better communication between developers and stakeholders is essential to help avoid this kind of wasted time.

## Concrete Examples

By using real-world examples to describe the desired behavior of the system we want to build, we stay grounded in language and terminology that makes sense to our stakeholders: *we're speaking their language*.

## Executable specifications

Another advantage of using concrete examples is that they're much easier to validate against the running system than vague requirement statements.
In fact, if we're neat and tidy about how we express them, we can get the computer to check them for us.
We call this *automated acceptance testing*.

Gherkin gives us a lightweight structure for documenting examples of the behavior our stakeholders want, in a way that can be easily understood both by the stakeholders and by Cucumber.

## Format and Syntax

Gherkin files use the `feature` file extension.
They're saved as plain text, meaning they can be read and edited with simple tools.

### Keywords

A Gherkin file is given its structure and meaning using a set of special keywords.

### Dry Run

The `--dry-run` switch tells Cucumber to parse the file without executing it.
It will tell you if your Gherkin is valid.

## Feature

Each Gherkin file begins with the `Feature` keyword.
This keyword doesn't really affect the behavior of your Cucumber tests at all;
it just gives you a convenient place to put some summary documentation about the group of tests that follow.

The text immediately following on the same line as the `Feature` keyword is the *name* of the feature, and the remaining lines are its *description*.

It's conventional to name the feature file by converting the feature's name to lowercase characters and replacing the spaces with underscores.

## Scenario

To actually express the behavior we want, each feature contains several scenarios.
Each scenario is a single concrete example of how the system should behave in a particular situation.
If you add together the behavior defined by all of the scenarios, that's the expected behavior of the feature itself.

### Given, When, Then

We use `Given` to set up the context where the scenario happens, `When` to interact with the system somehow, and `Then` to check that the outcome of that interaction was what we expected.

### And, But

Each of the lines in a scenario is known as a *step*.
We can add more steps to each `Given`, `When`, or `Then` section of the scenario using the keywords `And` and `But`.

### Stateless

Each scenario must make sense and be able to be executed independently of any other scenarios.

When writing a scenario, always assume that it will run against the system in a default, blank state.
Tell the story from beginning, using `Given` steps to set up all the state you need for that particular scenario.

### Name and Description

Just like `Feature`, a `Scenario` keyword can be followed by a name and description.

A good tip is to avoid putting anything about the outcome (the `Then` part) of the scenario into the name and concentrate on summarizing the context and event (`Given` and `When`) of the scenario.

## Comments

Comments start with a `#` character and have to be the first and only thing on a line (well, apart from whitespace).

We advise you to use them as sparingly as you can and put the important stuff into scenarios where it can be tested.

## Step Definitions

Step definitions sit right on the boundary between the business's domain and the programmer's domain.
You can write them in many JVM languages and their responsibility is to translate each plain-language step in your Gherkin scenarios into concrete actions in your code.

There are two sides to a step definition.
On the outside, it translate from plain language into code, and on the inside it tells your system what to do using automation code.

## Steps and Step Definitions

Each Gherkin scenario is made up of a series of steps, written in plain language.
On its own, a step is just documentation;
it needs a step definition to bring it to life.

When Cucumber tries to execute each step, it looks for a matching step definition to execute.

### Matching a Step

Gherkin steps are expressed in plain text.
Cucumber scans the text of each step for patterns that it recognizes, which you define using a *regular expression*.

### Creating a Step Definition

## References

[http://repo1.maven.org/maven2/info/cukes/](http://repo1.maven.org/maven2/info/cukes/)

