package org.instagrampojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramPojosample extends BaseClass {
	
	public InstagramPojosample() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	
	private WebElement emailBox;
	
	@FindBy(name="password")
	
	private WebElement passBox;
	
	@FindBy(xpath="(//div[@class='html-div xexx8yu xyri2b x18d9i69 x1c1uobl x9f619 xjbqb8w x78zum5 x15mokao x1ga7v0g x16uus16 xbiv7yw x1xmf6yo x1e56ztr x11hdunq x11gldyt x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1'])[1]")
	
	private WebElement logbtn;

	public WebElement getEmailBox() {
		return emailBox;
	}

	public void setEmailBox(WebElement emailBox) {
		this.emailBox = emailBox;
	}

	public WebElement getPassBox() {
		return passBox;
	}

	public void setPassBox(WebElement passBox) {
		this.passBox = passBox;
	}

	public WebElement getLogbtn() {
		return logbtn;
	}

	public void setLogbtn(WebElement logbtn) {
		this.logbtn = logbtn;
	}

}
