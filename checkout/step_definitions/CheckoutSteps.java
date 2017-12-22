package step_definitions;

import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import implementation.*;

import static org.junit.Assert.*;

public class CheckoutSteps {
  int bananaPrice = 0;
  Checkout checkout;

  @Given("^the price of a \"([^\"]*)\" is (\\d+)c$")
  public void thePriceOfAIsC(String itemName, int price) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    bananaPrice = price;
  }

  @When("^I checkout (\\d+) \"([^\"]*)\"$")
  public void iCheckout(int itemCount, String itemName) throws Throwable {
    checkout = new Checkout();
    checkout.add(itemCount, bananaPrice);
  }

  @Then("^the total price should be (\\d+)c$")
  public void theTotalPriceShouldBeC(int total) throws Throwable {
    assertEquals(total, checkout.total());
  }
}

