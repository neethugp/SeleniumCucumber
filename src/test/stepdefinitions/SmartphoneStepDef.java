package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageaction.SmartphoneAction;

public class SmartphoneStepDef {
    WebDriver driver = DriverFactory.getDriver();
    SmartphoneAction smartphoneAction = new SmartphoneAction();

    @When("^User searches for the desired specifications$")
    public void user_searches_for_the_desired_specifications()  {
        smartphoneAction.selectDesiredSpec();
    }

    @When("^User will search with the option not displayed$")
    public void user_searches_for_the_undesired_specifications()  {
        smartphoneAction.selectUnDesiredSpec();
    }


    @Then("^User is displayed with the list of devices which are desired search results$")
    public void user_is_displayed_with_the_list_of_devices_which_are_desired_search_results()  {
        smartphoneAction.devicesCount();
    }

}
