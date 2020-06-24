package homepage;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestScenerios {

	@BeforeTest
	public static void URLaunch()
	{
		Testcases.Sitelaunch();
	}
	
	@Test(priority=1)
	public static void ContactUS_VERIFY() throws InterruptedException, IOException
	{		
		Testcases.homepage_contactus();
		Testcases.covid19_contactus();
		Testcases.Setupremote_contactus();
		Testcases.Covidsafe_contactus();
	}
	@Test(priority=2)
	public static void GetInTouch_VERIFY() throws InterruptedException, IOException
	{		
		Testcases.GetInTouch();
		Testcases.Contact_GetInTouch();
		
	}	
	@Test(priority=3)
	public static void KOBZOLINK_VERIFY() throws InterruptedException, IOException
		{	
		
		Testcases.validatecontactusform();
		Testcases.verifyhomelinks();
		Testcases.blogpage1();
		Testcases.blogpage2();
		Testcases.blogpage3();
		
		Testcases.verifydigitalinks();
		Testcases.verifyogapage1();
		Testcases.verifyogapage2();
		Testcases.verifyogapage3();
		Testcases.verifyogapage4();
		Testcases.verifyogapage5();
		Testcases.verifyogapage6();
		
		Testcases.verifysetuplinks();
		Testcases.prodistpage();
		
		Testcases.verifyaboutlinks();
		Testcases.verifycontactlinks();
		
		Testcases.verifycovidsafelinks();
		Testcases.verifycovidprodlinks();
		Testcases.verifycovidservicelinks();
		
	}
	@Test(priority=4)
	public static void ProductOrders() throws InterruptedException
	{
		Testcases.Ordersplace();
	}
}
