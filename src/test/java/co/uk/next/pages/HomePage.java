package co.uk.next.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import co.uk.next.helper.Helper;

public class HomePage extends Helper 
{
WebElement logo;
WebElement searchbar;
WebElement button;

public void isLogoDisplayed() throws Exception
{
	logo = getElementById("header-logo");
Assert.assertTrue(logo.isDisplayed());	

}
public void enterAnItemIntoSearchBar(String item) throws Exception
{
	searchbar = getElementByClassName("SearchBox");
	searchbar.sendKeys(item);
}
public ResultPage clickOnButton() throws Exception
{
	button = getElementByClassName("SearchButton");
	button.click();
	return new ResultPage();
}
}
