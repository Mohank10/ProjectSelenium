package adactin.in;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPagePojo extends BaseClass {

	public BookingPagePojo() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "first_name")
	private WebElement firstNameBox;
	@FindBy(id = "last_name")
	private WebElement lastnameBox;

	@FindBy(id = "address")
	private WebElement addressBox;

	@FindBy(name = "cc_num")
	private WebElement ccBox;

	@FindBy(id = "cc_type")
	private WebElement cardTypeBox;

	@FindBy(id = "cc_exp_month")
	private WebElement cardMonthBox;

	@FindBy(id = "cc_exp_year")
	private WebElement cardYearBox;

	@FindBy(name = "cc_cvv")
	private WebElement cvvBox;

	public WebElement getFirstNameBox() {
		return firstNameBox;
	}

	public void setFirstNameBox(WebElement firstNameBox) {
		this.firstNameBox = firstNameBox;
	}

	public WebElement getLastnameBox() {
		return lastnameBox;
	}

	public void setLastnameBox(WebElement lastnameBox) {
		this.lastnameBox = lastnameBox;
	}

	public WebElement getAddressBox() {
		return addressBox;
	}

	public void setAddressBox(WebElement addressBox) {
		this.addressBox = addressBox;
	}

	public WebElement getCcBox() {
		return ccBox;
	}

	public void setCcBox(WebElement ccBox) {
		this.ccBox = ccBox;
	}

	public WebElement getCardTypeBox() {
		return cardTypeBox;
	}

	public void setCardTypeBox(WebElement cardTypeBox) {
		this.cardTypeBox = cardTypeBox;
	}

	public WebElement getCardMonthBox() {
		return cardMonthBox;
	}

	public void setCardMonthBox(WebElement cardMonthBox) {
		this.cardMonthBox = cardMonthBox;
	}

	public WebElement getCardYearBox() {
		return cardYearBox;
	}

	public void setCardYearBox(WebElement cardYearBox) {
		this.cardYearBox = cardYearBox;
	}

	public WebElement getCvvBox() {
		return cvvBox;
	}

	public void setCvvBox(WebElement cvvBox) {
		this.cvvBox = cvvBox;
	}

	public WebElement getBookBtn() {
		return bookBtn;
	}

	public void setBookBtn(WebElement bookBtn) {
		this.bookBtn = bookBtn;
	}

	@FindBy(name = "book_now")
	private WebElement bookBtn;

}
