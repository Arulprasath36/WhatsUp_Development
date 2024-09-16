package org.LoginTest;


import org.pages.LoginPages;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import seleniumBase.BaseClass;

public class TC001Login extends BaseClass{
	@BeforeTest
	public void setData() {
		filename="TC001";
	}
	
	@Test(dataProvider="data")
	public void LoginTest(String[] data) {
		LoginPages lp=new LoginPages();
		boolean userNameLabel = lp.getUserNameLabel();
		Assert.assertEquals(userNameLabel, true);
		boolean passWordLabel = lp.getPassWordLabel();
		Assert.assertTrue(passWordLabel);
		
	
//		LoginPages lp=new LoginPages();
//		lp.enterUserName("Thean");
		new LoginPages()
		.enterUserName(data[0])
		.enterPassword(data[1])
		.clickLoing();
		
	
		
	}

}
