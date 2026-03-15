package adactin.in;

import java.io.IOException;
import java.util.List;

import org.baseclass.BaseClass;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ExecutionSample extends BaseClass {

	public static void main(String[] args) throws IOException {

		String data = xlDataGetAll(7, 1);
		String data2 = xlDataGetAll(7, 2);
		String data1 = xlDataGetAll(4, 3);
		String data3 = xlDataGetAll(2, 3);

		System.out.println(data);
		System.out.println(data2);
		System.out.println(data1);
		System.out.println(data3);

		launchChrome();
		launchUrl("https://adactinhotelapp.com/");
		titleFetch();
		getUrl();
		AdactinPojo ap = new AdactinPojo();

		passText(ap.getLogBox(), "Mohankumar10");
		passText(ap.getPassBox(), "Mohan@1234");
		clickBtn(ap.getLogBtn());

		AdactinBookingPojo ab = new AdactinBookingPojo();

		WebElement location = ab.getLocationBox();
		selectByIndex(location, 3);

		WebElement hotels = ab.getHotelsBox();
		selectByIndex(hotels, 1);

		WebElement room = ab.getRoomBox();
		selectByIndex(room, 1);

		WebElement roomNo = ab.getRoomNoBox();
		selectByIndex(roomNo, 2);

		passText(ab.getCheckInBox(), data1);
		passText(ab.getCheckOutBox(), data3);

		WebElement adultRoom = ab.getAdultRoomBox();
		selectByIndex(adultRoom, 1);

		WebElement childRoom = ab.getChildRoomBox();
		selectByIndex(childRoom, 2);

		clickBtn(ab.getSearchBtn());

		clickBtn(ab.getRadioBtn());

		clickBtn(ab.getContBtn());

		
		BookingPagePojo bp=new BookingPagePojo();
		
		passText(bp.getFirstNameBox(), xlDataGetAll(2, 2));
		passText(bp.getLastnameBox(), xlDataGetAll(4, 2));
		passText(bp.getAddressBox(), xlDataGetAll(2, 3));
		passText(bp.getCcBox(), xlDataGetAll(1, 2));
		WebElement cardType = bp.getCardTypeBox();
		selectByIndex(cardType, 2);
		WebElement cardMonth = bp.getCardMonthBox();
		selectByIndex(cardMonth, 2);
		WebElement cardYear= bp.getCardYearBox();
		selectByIndex(cardYear, 5);
		passText(bp.getCvvBox(), xlDataGetAll(3, 3));
		clickBtn(bp.getBookBtn());
		
		
		
		
		
	}

}
