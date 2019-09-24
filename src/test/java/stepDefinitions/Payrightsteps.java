package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Payrightsteps {
    WebDriver driver;
    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver=new ChromeDriver();
    }

    @When("I open  payright homepage")
    public void i_open_payright_homepage() {
        driver.get("https://payrighttestmerchant.payright.com.au");
    }

    @Then("I verify that login present on page")
    public void i_verify_that_login_present_on_page() {
    boolean status=driver.findElement(By.xpath("//*[@id=\"menu-primary\"]/li[1]/a")).isDisplayed();
    Assert.assertEquals(true,status);
    }

    @Then("Close browser")
    public void close_browser() {
    driver.close();
    }

}
