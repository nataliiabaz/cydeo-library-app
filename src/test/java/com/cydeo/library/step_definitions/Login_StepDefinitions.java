package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LibraryLoginPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Login_StepDefinitions {
    LibraryLoginPage libraryLoginPage=new LibraryLoginPage();

    WebDriverWait wait=new WebDriverWait(Driver.getDriver(), 10);
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        libraryLoginPage.emailInput.sendKeys(ConfigurationReader.getProperty("lib22_user"));

    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        libraryLoginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("lib22_pass"));
        libraryLoginPage.loginButton.click();


    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        String expectedURL="dashboard";
        wait.until(ExpectedConditions.urlContains(expectedURL));
        String actualURL=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue("dashboard is not appear on URL", actualURL.contains(expectedURL));


    }
    @When("user enters student username")
    public void user_enters_student_username() {
        libraryLoginPage.emailInput.sendKeys(ConfigurationReader.getProperty("student55_user"));

    }
    @When("user enters student password")
    public void user_enters_student_password() {
        libraryLoginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("student55_pass"));
        libraryLoginPage.loginButton.click();
    }

        @Then("books should be displayed")
        public void books_should_be_displayed() {
            String expectedURL="books";
            wait.until(ExpectedConditions.urlContains(expectedURL));
            String actualURL=Driver.getDriver().getCurrentUrl();
            Assert.assertTrue("book is not appear on URL", actualURL.contains(expectedURL));

        }

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }
    @When("I enter username {string}")
    public void i_enter_username(String string) {
        libraryLoginPage.emailInput.sendKeys(string);


    }
    @When("I enter password {string}")
    public void i_enter_password(String string) {
        libraryLoginPage.inputPassword.sendKeys(string);

    }
    @When("click the sign in button")
    public void click_the_sign_in_button() {
        libraryLoginPage.loginButton.click();

    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        String expectedURL="dashboard";
        wait.until(ExpectedConditions.urlContains(expectedURL));
        String actualURL=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue("dashboard is not appear on URL", actualURL.contains(expectedURL));

    }
    @Then("there should be {int} users")
    public void there_should_be_users(Integer int1) {
        String actualUsers=libraryLoginPage.usersCount.getText();
        String expectedUsers=String.valueOf(int1);
        Assert.assertEquals(expectedUsers, actualUsers);

    }
    @When("I login using {string} and {string}")
    public void i_login_using_and(String string, String string2) {
    libraryLoginPage.login(string,string2);
    }
    @Then("there should be {int} {string}")
    public void there_should_be(Integer int1, String string) {

    }
    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
        libraryLoginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("lib22_pass"));
        libraryLoginPage.loginButton.click();


    }
    @Given("I click on {string} link")
    public void i_click_on_link(String string) {

    }
    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String> expectedColumnNames) {

    }
    @Then("account holder name should be {string}")
    public void account_holder_name_should_be(String string) {

    }

}
