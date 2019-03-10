package co.uk.next.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import co.uk.next.helper.Helper;

public class ResultPage extends Helper
{
	WebElement resultTitle;
	List<WebElement> searchResults;
	
	public void isResultTitleDisplayed(String item) throws Exception
	{
		resultTitle = getElementByClassName("spell-correct");
		String titleText = resultTitle.getText();
		Assert.assertTrue(titleText.toLowerCase().contains(item.toLowerCase()));
	}
	public void isResultDisplayed(String item) throws Exception
	{
		 searchResults = getElementsByClassName("Desc");
		 
		 for (WebElement result : searchResults )
		 {
			String name  = result.getText();
			Assert.assertTrue(name.toLowerCase().contains(item.toLowerCase()));
		 }
	}

}
