package adactin.in;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPojo extends BaseClass {

	public AdactinPojo() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement logBox;

	@FindBy(id = "password")
	private WebElement passBox;

	@FindBy(name = "login")

	private WebElement logBtn;

	public WebElement getLogBox() {
		return logBox;
	}

	public void setLogBox(WebElement logBox) {
		this.logBox = logBox;
	}

	public WebElement getPassBox() {
		return passBox;
	}

	public void setPassBox(WebElement passBox) {
		this.passBox = passBox;
	}

	public WebElement getLogBtn() {
		return logBtn;
	}

	public void setLogBtn(WebElement logBtn) {
		this.logBtn = logBtn;
	}

}
