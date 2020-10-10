package navPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboardPage {
	
	public dashboardPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Login PageObject/WebElements
	@FindBy(id="welcome")
	private WebElement welcomeDrpDwn;
	@FindBy(xpath="//*[@id=\"welcome-menu\"]/ul/li[2]/a")
	private WebElement logoutBtn;
	
	public void logout() {
		welcomeDrpDwn.click();
		logoutBtn.click();
	}

}
