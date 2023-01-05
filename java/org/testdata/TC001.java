package org.testdata;

import org.BasePages.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.pages.LoginPages;
import org.pages.SearchHotalPage;
import org.seleniumBase.Locators;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TC001 extends BasePage {
	@BeforeTest
	public void setData() {
		fileName = "TC001";
		url="http://adactinhotelapp.com/";
		
	}
	public void lable() {
		LoginPages lp=new LoginPages();
		boolean usernameLable = lp.usernameLable();
		Assert.assertEquals(usernameLable, true);
		
		boolean passwordLable = lp.passwordLable();
		Assert.assertTrue(passwordLable);
		
		boolean loginLable = lp.loginLable();
		Assert.assertTrue(loginLable);
		
	}
		
	@Test(dataProvider="data",priority=0)
	public void testCases(String[] data) {
		
		lable();
		
		type(element(Locators.id, "username"), data[0]);
		
		type(element(Locators.id, "password"),data[1]);
		
		click(element(Locators.id,"login"));
		
			
	}
	
	@Test(priority=1)
	public void testCase2() {
		
		selectIndex(element(Locators.id, "location"), 1);
		
	}
	@Test(priority=2)
	public void testCase3() {
		
	selectIndex(element(Locators.id, "hotels"), 1);
	}

	@Test(priority=3)
	public void testCase4() {
		
	selectIndex(element(Locators.id, "room_type"), 1);}

	@Test(priority=4)
	public void testCase5() {
		
	
	selectIndex(element(Locators.xpath, "//select[@id='room_nos']"), 1);}

	@Test(priority=5)
	public void testCase6() {
		
	selectIndex(element(Locators.id, "adult_room"), 1);}

	@Test(priority=6)
	public void testCase7() {
		
	selectIndex(element(Locators.id, "child_room"), 1);}
	

	
	
	
	
}
















//WebElement element = element(Locators.id, "username");
//type(element(Locators.id, "username"), data[0]);

//WebElement element2 = element(Locators.id, "password");
//type(element(Locators.id, "password"),data[1]);

//WebElement element3 = element(Locators.id, "login");
//click(element(Locators.id,"login"));

//lp.enterUserName(data[0]);
//lp.enterPassword(data[1]);
//lp.enterLogin();
//


//WebElement element = element(Locators.xpath, "(//td[@align='right'])[1]");
//boolean enabled = element.isEnabled();
//Assert.assertEquals(enabled, true);
//System.out.println("finished");
//
//String title = getTitle();
//System.out.println(title);
//
//WebElement element = element(Locators.id, "username");
//type(element, data[0]);
//
//WebElement element2 = element(Locators.id, "password");
//type(element2, data[1]);
//
//type(element(Locators.id, "username"), data[0]);
//
//type(element(Locators.id,"password"),data[1]);
//
//WebElement element2 = element(Locators.id,"login");
//click(element2);
//
//




//
//System.out.println(SearchHotalPage.getLocationLabel());
//System.out.println(SearchHotalPage.getHotalLable());
//System.out.println(SearchHotalPage.getRoomTypeLable());
//System.out.println(SearchHotalPage.getNumberOfRoomLable());
//System.out.println(SearchHotalPage.getCheckInDateDateLable());
//System.out.println(SearchHotalPage.getCheckOutDateLable());
//System.out.println(SearchHotalPage.getAdultsPerRoomLable());
//System.out.println(SearchHotalPage.getChildrunPerRoomLable());
//System.out.println(SearchHotalPage.getSearchLable());
//System.out.println(SearchHotalPage.getResetLable());
//LoginPages.clickLogin().click();




////WebElement element = element(Locators.id, "username");
//String title = getTitle();
//System.out.println(title);

//LoginPages.LoginTestCase(data[0],data[1]);
//
//hotalSearchPageAssert();
//
//SearchHotalPage.Details();
//












































//SearchHotalPage.getLocationDropDown();
//SearchHotalPage.getLocationDropDown();
//SearchHotalPage.getHotalLocationDropDown();
//SearchHotalPage.getRoomTypeDropDown();
//SearchHotalPage.getNumberOfRoomDropDown();
//SearchHotalPage.getCheckInDropDown();
//SearchHotalPage.getcheckoutDropDown();
//SearchHotalPage.getAdaltPerRommDropDown();
//SearchHotalPage.getChildRunPerRoom();


// System.out.println(LoginPages.getUserLable());
// System.out.println(LoginPages.getPasswordLable());
// System.out.println(LoginPages.getLoginLable());

// LoginPages.enterUserName("Theanraj");
// LoginPages.enterPassword("Theanraj@123");
// LoginPages.loginClick();
