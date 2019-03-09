package co.uk.next.hooks;

import co.uk.next.helper.Helper;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class NextHook extends Helper
{
	@Before
	public void setup() throws Exception
	{
		LaunchBrowser("chrome");
		launchUrl("https://www.next.co.uk/");
	}
	
	@After
	public void tearDown() throws Exception
	{
		closeBrowser();
	}
}
