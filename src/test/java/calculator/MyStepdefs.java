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

    private String operation;
    private double result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @When("^I operate on the two values$")
    public void iOperateOnTheTwoValues() {
        try {
            result = calculator.operate(value1, value2, operation);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Then("^I expect the result (-?\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(result, arg0, 0.00001);
    }

    @Then("^I expect the result (-?\\d+\\.\\d+)$")
    public void iExpectTheResult(double arg0) {
        Assert.assertEquals(result, arg0, 0.00001);
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+), and operation ([*/^])$")
    public void twoInputValuesFirstAndSecondAndOperation(int arg0, int arg1, String operation0) {
        value1 = arg0;
        value2 = arg1;
        operation = operation0;
    }
}
