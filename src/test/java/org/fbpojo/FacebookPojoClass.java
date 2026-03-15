package org.fbpojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FacebookPojoClass extends BaseClass {
	
	public FacebookPojoClass(){
		PageFactory.initElements(driver, this);
		
	}
@FindBy(id="email")
private WebElement emailBox;

@FindBys({
		@FindBy(id="pass"),
		@FindBy(xpath="//input[@type='password']")
		
		})
private WebElement passBox;
		
@FindBy(xpath="//button[contains(text(),'Log in')]")
private WebElement logBtn;

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

public WebElement getLogBtn() {
	return logBtn;
}

public void setLogBtn(WebElement logBtn) {
	this.logBtn = logBtn;
}

		
		
		
		
	


	

	
	
	
	
	
	
	
	
	
}
