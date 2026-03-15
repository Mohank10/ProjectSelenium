package adactin.in;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinBookingPojo extends BaseClass{
	
	public AdactinBookingPojo() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy (name="location")
	
	private WebElement locationBox;
	
	@FindBy (id="hotels")
	 private WebElement hotelsBox;
	
	@FindBy (name="room_type")
	
	private WebElement roomBox;
	
	@FindBy(name="room_nos")
	
	private WebElement roomNoBox;
	
	@FindBy(id="datepick_in")
	
	private WebElement checkInBox;
	
   @FindBy(name="datepick_out")
	
	private WebElement checkOutBox;
	
   @FindBy(id="adult_room")
	
	private WebElement adultRoomBox;
   
   @FindBy(id="child_room")
	
	private WebElement childRoomBox;
   
   @FindBy(id="Submit")
	
	private WebElement searchBtn;
	
	@FindBy(name="radiobutton_0")
	private WebElement radioBtn;
	
   @FindBy(xpath="//input[@type='submit']")
   private WebElement contBtn;
	
	
	public WebElement getRadioBtn() {
	return radioBtn;
}


   public void setRadioBtn(WebElement radioBtn) {
	this.radioBtn = radioBtn;
   }


   public WebElement getContBtn() {
	return contBtn;
   }


   public void setContBtn(WebElement contBtn) {
	this.contBtn = contBtn;
   }


	public WebElement getLocationBox() {
	return locationBox;
}


   public void setLocationBox(WebElement locationBox) {
	this.locationBox = locationBox;
   }


   public WebElement getHotelsBox() {
	return hotelsBox;
   }


   public void setHotelsBox(WebElement hotelsBox) {
	this.hotelsBox = hotelsBox;
   }


   public WebElement getRoomBox() {
	return roomBox;
   }


   public void setRoomBox(WebElement roomBox) {
	this.roomBox = roomBox;
   }


   public WebElement getRoomNoBox() {
	return roomNoBox;
   }


   public void setRoomNoBox(WebElement roomNoBox) {
	this.roomNoBox = roomNoBox;
   }


   public WebElement getCheckInBox() {
	return checkInBox;
   }


   public void setCheckInBox(WebElement checkInBox) {
	this.checkInBox = checkInBox;
   }


   public WebElement getCheckOutBox() {
	return checkOutBox;
   }


   public void setCheckOutBox(WebElement checkOutBox) {
	this.checkOutBox = checkOutBox;
   }


   public WebElement getAdultRoomBox() {
	return adultRoomBox;
   }


   public void setAdultRoomBox(WebElement adultRoomBox) {
	this.adultRoomBox = adultRoomBox;
   }


   public WebElement getChildRoomBox() {
	return childRoomBox;
   }


   public void setChildRoomBox(WebElement childRoomBox) {
	this.childRoomBox = childRoomBox;
   }


   public WebElement getSearchBtn() {
	return searchBtn;
   }


   public void setSearchBtn(WebElement searchBtn) {
	this.searchBtn = searchBtn;
   }

		
	
	
}
