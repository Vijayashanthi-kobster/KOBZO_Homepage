package homepage;

import java.io.IOException;

public class Testcases {
	
public static void Sitelaunch()
{
 Methods.launch();
}
	
public static void verifyhomelinks() throws InterruptedException
{
	System.out.println("HOME PAGE");
	Methods.Linkverify();
	System.out.println("COVID 19 PAGE ");
	Methods.linksclk(Locators.covid_19know);
	Methods.Linkverify();
}

public static void blogpage1() throws InterruptedException
{	System.out.println("BLOG 1 PAGE ");
	Methods.linksclk(Locators.Logo);
	Methods.linksclk(Locators.Blog1);
	Methods.Linkverify();
}

public static void blogpage2() throws InterruptedException
{	System.out.println("BLOG 2 PAGE");
	Methods.linksclk(Locators.Logo);
	Methods.linksclk(Locators.Blog2);
	Methods.Linkverify();
}

public static void blogpage3() throws InterruptedException
{	System.out.println("BLOG 3 PAGE ");
	Methods.linksclk(Locators.Logo);
	Methods.linksclk(Locators.Blog3);
	Methods.Linkverify();
}



public static void verifydigitalinks() throws InterruptedException
{	System.out.println("DIGITAL EMPLOYEE PAGE");
	Methods.linksclk(Locators.digitaempl);
	Methods.Linkverify();	
}

public static void verifyogapage1() throws InterruptedException
{
	System.out.println("Yoga For Lower Back Pain PAGE ");

	Methods.linksclk(Locators.yogapage1);
	Methods.Linkverify();
	
}

public static void verifyogapage2() throws InterruptedException
{
	System.out.println("Yoga For Quieting The Monkey Mind PAGE ");
	Methods.backpage();
	Methods.linksclk(Locators.yogapage2);
	Methods.Linkverify();
}
public static void verifyogapage3() throws InterruptedException
{
	System.out.println("Yoga For Boredom PAGE ");
	Methods.backpage();
	Methods.linksclk(Locators.yogapage3);
	Methods.Linkverify();
}
public static void verifyogapage4() throws InterruptedException
{
	System.out.println("Yoga For Habit Change PAGE ");
	Methods.backpage();
	Methods.linksclk(Locators.yogapage4);
	Methods.Linkverify();
}
public static void verifyogapage5() throws InterruptedException
{
	System.out.println("Yoga For Burnout PAGE ");
	Methods.backpage();
	Methods.linksclk(Locators.yogapage5);
	Methods.Linkverify();
}
public static void verifyogapage6() throws InterruptedException
{
	System.out.println("Yoga For Memory & Focus PAGE ");
	Methods.backpage();
	Methods.linksclk(Locators.yogapage6);
	Methods.Linkverify();
}


public static void verifysetuplinks() throws InterruptedException
{	System.out.println("SETUP REMOTE PAGE");
	Methods.linksclk(Locators.setupremote);
	Methods.Linkverify();	
}

public static void prodistpage() throws InterruptedException
{
	System.out.println("Produdt list page ");
	Methods.linksclk(Locators.prodlistpage);
	Methods.Linkverify();	
}

public static void verifycovidsafelinks() throws InterruptedException
{	System.out.println("COVID SAFE PAGE");
	Methods.linksclk(Locators.covidsafe);
	Methods.Linkverify();	
}

public static void verifycovidprodlinks() throws InterruptedException
{
	System.out.println("COVID SAFE - PRODUCTS PAGE");
	Methods.dropdownmenu("COVID-Safe Workplace Products");
	Methods.Linkverify();	
}

public static void verifycovidservicelinks() throws InterruptedException
{	System.out.println("COVID SAFE - SERVICES PAGE");
	Methods.dropdownmenu("COVID-Safe Workplace Services");
	Methods.Linkverify();		
}
public static void verifyaboutlinks() throws InterruptedException
{	System.out.println("ABOUT PAGE");
	Methods.linksclk(Locators.aboutus);
	Methods.Linkverify();	
}
public static void verifycontactlinks() throws InterruptedException
{	System.out.println("CONTACT PAGE");
	Methods.linksclk(Locators.contactus);
	Methods.Linkverify();		
}


public static void validatecontactusform() throws IOException, InterruptedException
{
	Methods.linksclk(Locators.contactbut);
	Methods.contactusform();
}

public static void homepage_contactus() throws IOException, InterruptedException
{
	Methods.linksclk(Locators.contactbut);
	Methods.contactusformvaliddata();
	
	Methods.linksclk(Locators.contprocure_reqform);
	Methods.contactusformvaliddata();
	
	Methods.linksclk(Locators.selltocor_reqform);
	Methods.contactusformvaliddata();
}

public static void covid19_contactus() throws InterruptedException, IOException
{
	Methods.linksclk(Locators.Logo);
	Methods.linksclk(Locators.covid_19know);
	Methods.linksclk(Locators.covid19_reqform);
	Methods.contactusformvaliddata();
	
	Methods.linksclk(Locators.covidinitative_reqform);
	Methods.contactusformvaliddata();
	
}

public static void Setupremote_contactus() throws InterruptedException, IOException
{
	Methods.linksclk(Locators.setupremote);
	Methods.linksclk(Locators.setupremote_reqform);
	Methods.contactusformvaliddata();
	
}

public static void Covidsafe_contactus() throws InterruptedException, IOException
{
	Methods.dropdownmenu("COVID-Safe Workplace Products");
	
	Methods.linksclk(Locators.Alcholdis_reqform);
	Methods.contactusformvaliddata();
	Methods.linksclk(Locators.Thermal_reqform);
	Methods.contactusformvaliddata();
	Methods.linksclk(Locators.UVlight_reqform);
	Methods.contactusformvaliddata();
	Methods.linksclk(Locators.Toiletseat_reqform);
	Methods.contactusformvaliddata();
	Methods.linksclk(Locators.Faceshield_reqform);
	Methods.contactusformvaliddata();
	Methods.linksclk(Locators.UVBlaster_reqform);
	Methods.contactusformvaliddata();
	Methods.linksclk(Locators.Mobilepouch_reqform);
	Methods.contactusformvaliddata();
	Methods.linksclk(Locators.Signboard_reqform);
	Methods.contactusformvaliddata();
	
	Methods.linksclk(Locators.Logo);
	Methods.dropdownmenu("COVID-Safe Workplace Services");
	
	Methods.linksclk(Locators.Disinfect_reqform);
	Methods.contactusformvaliddata();
	Methods.linksclk(Locators.Sanitisation_reqform);
	Methods.contactusformvaliddata();
	Methods.linksclk(Locators.Deepcleaning_reqform);
	Methods.contactusformvaliddata();
	Methods.linksclk(Locators.Personalhyg_reqform);
	Methods.contactusformvaliddata();
	Methods.linksclk(Locators.Carpetclean_reqform);
	Methods.contactusformvaliddata();
	Methods.linksclk(Locators.Officeclean_reqform);
	Methods.contactusformvaliddata();
	
	Methods.linksclk(Locators.Logo);
	Methods.linksclk(Locators.covidsafe);
	Methods.linksclk(Locators.covidsafeprod_reqform);
	Methods.contactusformvaliddata();
	
	Methods.linksclk(Locators.covidsafeserv_reqform);
	Methods.contactusformvaliddata();
}

public static void GetInTouch() throws InterruptedException, IOException
{
	Methods.linksclk(Locators.digitaempl);
	Methods.redirect_verify(Locators.Asphalt_game, Inputs.getintouchur);
	
	Methods.linksclk(Locators.digitaempl);
	Methods.redirect_verify(Locators.Pubg_game, Inputs.getintouchur);
	
	Methods.linksclk(Locators.digitaempl);
	Methods.redirect_verify(Locators.eigthball_game, Inputs.getintouchur);
	
	Methods.linksclk(Locators.digitaempl);
	Methods.redirect_verify(Locators.Ludo_game, Inputs.getintouchur);
	Methods.contactusformvaliddata();

}

public static void Contact_GetInTouch() throws InterruptedException, IOException
{
	Methods.linksclk(Locators.contactus);
	Methods.contactusformvaliddata();
}

public static void Ordersplace() throws InterruptedException
{
	Methods.linksclk(Locators.digitaempl);
	Methods.productbuy();
}

}
