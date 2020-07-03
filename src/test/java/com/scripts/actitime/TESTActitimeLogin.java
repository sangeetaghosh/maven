package com.scripts.actitime;

import java.io.IOException;
import org.testng.annotations.Test;
import com.generics.actitime.BaseTest;
import com.pages.actitime.POMActitimeLogin;

public class TESTActitimeLogin extends BaseTest
{
	@Test
	public void login() throws IOException, InterruptedException
	{
		POMActitimeLogin login=new POMActitimeLogin(driver);
		login.login();
	}
}
