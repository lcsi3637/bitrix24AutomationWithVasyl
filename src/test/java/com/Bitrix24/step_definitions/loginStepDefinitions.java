package com.Bitrix24.step_definitions;

import com.Bitrix24.pages.LoginPage;
import com.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDefinitions {

    LoginPage loginPage=new LoginPage();
    @Given("User is on the loginpage")
    public void user_is_on_the_loginpage() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
    }


    @When("User enter {string} and {string}")
    public void user_enter_and(String string, String string2) {
        System.out.println("");
    }
    @Then("user should be able to see {string}")
    public void user_should_be_able_to_see(String string, io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println("");
    }
    @Given("user is on the portal page")
    public void user_is_on_the_portal_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("");
    }
    @When("user click on upload files icon")
    public void user_click_on_upload_files_icon() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("");
    }
    @Then("user select files from local disk")
    public void user_select_files_from_local_disk() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("");
    }
    @Then("user download files from external drive")
    public void user_download_files_from_external_drive() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("");
    }
    @Then("user creates files to upload")
    public void user_creates_files_to_upload() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("");
    }



    @When("user click Add Persons button")
    public void user_click_add_persons_button() {
        System.out.println("");
    }
    @Then("user able to see add users from {string}")
    public void user_able_to_see_add_users_from(String string, io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println("");
    }

    @Given("user is in the portal page")
    public void user_is_in_the_portal_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("");
    }
    @When("user clicking on the link icon")
    public void user_clicking_on_the_link_icon() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("");
    }
    @Then("user attachs link succesfully")
    public void user_attachs_link_succesfully() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("");
    }
}
