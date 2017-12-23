# Step Definitions

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

### Given, When, Then are the Same

Under the hood, all of the annotations are aliases for `StepDefAnnotation`.
The annotations are really just there for extra documentation to help you express the intent of each step or step definition.

## Capturing Arguments

### Capture Groups

When you surround part of a regular expression with parentheses, it becomes a capture group.
In a Cucumber step definition, the text matched within each capture group is passed to the code block as an argument.

### Shorthand Character Classes

For common patterns of characters like `[0-9]`, there are a few *shorthand character classes* that you can use instead.

## Multiple Captures

Cucumber will pass an argument to your method for every capture group in your regular expression, so you can grab as many details as you like from a step.

## Flexibility

So, we want to encourage our feature authors to be consistent about the nouns and verbs they use in the Cucumber features, because it helps make features that can be readily understood by anyone on the team.

### Anchors

## Returning Results

### Undefined Steps

### Pending Steps

When you throw a `PendingException` from within a step definition, this tells Cucumber's runtime that the step has failed but in a particular way: the step definition is still being worked on.

### Failing Steps