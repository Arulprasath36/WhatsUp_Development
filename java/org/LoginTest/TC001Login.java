package org.LoginTest;


import org.pages.LoginPages;
import org.testng.Assert;
import org.testng.annotations.Test;

import seleniumBase.BaseClass;

public class TC001Login extends BaseClass{
	@Test
	public void LoginTest() {
		LoginPages lp=new LoginPages();
		boolean userNameLabel = lp.getUserNameLabel();
		Assert.assertEquals(userNameLabel, true);
		boolean passWordLabel = lp.getPassWordLabel();
		Assert.assertTrue(passWordLabel);
		
	
//		LoginPages lp=new LoginPages();
//		lp.enterUserName("Thean");
		new LoginPages()
		.enterUserName("Theanraj")
		.enterPassword("Theanraj@123")
		.clickLoing();
		
	
		
	}

}
