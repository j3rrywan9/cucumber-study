package me.jerrywang.java.cucumber.nicebank.stepdefinitions;

import cucumber.api.java8.En;
import cucumber.api.PendingException;

public class CashWithdrawalSteps implements En {
  public CashWithdrawalSteps() {
    Given("^I have deposited \\$(\\d+) in my account$", (Integer arg1) -> {
      // Write code here that turns the phrase above into concrete actions
      throw new PendingException();
    });

    When("^I request \\$(\\d+)$", (Integer arg1) -> {
      // Write code here that turns the phrase above into concrete actions
      throw new PendingException();
    });

    Then("^\\$(\\d+) should be dispensed$", (Integer arg1) -> {
      // Write code here that turns the phrase above into concrete actions
      throw new PendingException();
    });
  }
}
