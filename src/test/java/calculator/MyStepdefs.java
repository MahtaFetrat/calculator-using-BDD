package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

public class MyStepdefs {
    private Calculator calculator;
    private int value1;
    private int value2;
    private int intResult;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("^I multiply the two values$")
    public void iMultiplyTheTwoValues() {
        intResult = (int) calculator.mult(value1, value2);
    }

    @Then("^I expect the integer result (-?\\d+)$")
    public void iExpectTheIntegerResult(int arg0) {
        Assert.assertEquals(intResult, arg0);

    }
}