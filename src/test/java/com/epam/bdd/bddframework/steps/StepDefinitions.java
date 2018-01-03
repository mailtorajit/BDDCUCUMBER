package com.epam.bdd.bddframework.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.epam.bdd.bddframework.utils.BaseSelenium;
import static org.testng.Assert.assertTrue;

public class StepDefinitions extends BaseSelenium {
	
	public StepDefinitions() {	
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath ="//input[@id='gh-ac']")
	private WebElement enterTextInSearchTextBox;

	@FindBy(xpath ="//ul[@id='ListViewInner']/li[1]//a")
	private WebElement clickFirstElementFromList;

	@FindBy(xpath ="//input[@id='gh-btn']")
	private WebElement clickSearchButton;
	
	@FindBy(id ="gh-btn")
	private WebElement searchButton;

	@FindBy(xpath ="//a[contains(text(),'Add to cart')]")
	private WebElement clickAddToCartButton;
	
	@Given("^I set search text \"([^\"]*)\"$")
	public void iSetSearchtext(String searchText) {
		driver.get("http://www.ebay.com");
		enterTextInSearchTextBox.sendKeys(searchText);
	}

	@When("^I perform search")
    public void iPerfomSearch() throws Throwable {    	
		WebDriverWait wait = new WebDriverWait(driver, 5); 
		wait.until(ExpectedConditions.elementToBeClickable(searchButton));    	
		clickSearchButton.click();
		assertTrue(true);
    }

	@Then("^click the first \"([^\"]*)\" element in the search result grid$")
	public void ClickTheFirstElementInThSearchResultGrid(String firstElement) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		wait.until(ExpectedConditions.elementToBeClickable(searchButton));  
		clickFirstElementFromList.click();
		assertTrue(true);
	}

	@Then("^click Add To Cart$")
	public void clickAddtoCart() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 5); 
		wait.until(ExpectedConditions.elementToBeClickable(clickAddToCartButton)); 
		clickAddToCartButton.click();
		assertTrue(true);
	}	
}
