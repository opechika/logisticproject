package co.uk.next.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import co.uk.next.helper.Helper;

public class ResultPage extends Helper
{
	WebElement resultTitle;
	
	public void isResultTitleDisplayed(String item) throws Exception
	{
		resultTitle = getElementByClassName("spell-correct");
		String titleText = resultTitle.getText();
		Assert.assertTrue(titleText.toLowerCase().contains(item.toLowerCase()));
	}

}
