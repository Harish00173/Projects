package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	WebDriver driver;
@Given("User should launch the Adactin Hotel Web Application Url")
public void userShouldLaunchTheAdactinHotelWebApplicationUrl() {
	driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/index.php");
	driver.manage().window().maximize();
	
  
}

@When("User should enter valid username and password")
public void userShouldEnterValidUsernameAndPassword() {
	driver.findElement(By.id("username")).sendKeys("Harsha73");
	driver.findElement(By.id("password")).sendKeys("6A3334");   
  
}

@When("Click login Button")
public void clickLoginButton() throws Exception {
	driver.findElement(By.id("login")).click();
	Thread.sleep(4000);
}
/*	@Then("verify and Search Hotel page should be displayed to the User")
public void verifyAndSearchHotelPageShouldBeDisplayedToTheUser() throws Exception {
	System.out.println("Search Hotel page Displayed successfully ");
	Thread.sleep(4000);
}

@Given("user should enter valid credentials and click login button")
public void userShouldEnterValidCredentialsAndClickLoginButton() {
	System.out.println("user should entered valid credentials Successfully");
}*/
@When("User should select location from dropdown")
public void userShouldSelectLocationFromDropdown() {

	WebElement ddnLoc = driver.findElement(By.id("location"));
	Select s = new Select(ddnLoc);
	s.selectByValue("Sydney");

  
}

@When("User should select Hotel from dropdown")
public void userShouldSelectHotelFromDropdown() {
	WebElement ddnhotels = driver.findElement(By.id("hotels"));
	Select s1 = new Select(ddnhotels);
	s1.selectByValue("Hotel Creek");
  
}

@When("User should select Room Type from dropdown")
public void userShouldSelectRoomTypeFromDropdown() {
	WebElement ddnRmt = driver.findElement(By.id("room_type"));
	Select s2 = new Select(ddnRmt);
	s2.selectByValue("Deluxe");

}

@When("User should select No of Rooms from dropdown")
public void userShouldSelectNoOfRoomsFromDropdown() {
	WebElement ddnNo = driver.findElement(By.id("room_nos"));
	Select s3 = new Select(ddnNo);
	s3.selectByValue("2");

}

@When("User should Enter Checkin Date as per the Format mentioned")
public void userShouldEnterCheckinDateAsPerTheFormatMentioned() {
	driver.findElement(By.id("datepick_in")).sendKeys("07/09/2023");
    

}

@When("User should Enter Checkout Date as per the Format mentioned")
public void userShouldEnterCheckoutDateAsPerTheFormatMentioned() {
	driver.findElement(By.id("datepick_out")).sendKeys("09/09/2023");
    

}

@When("User should select Adults per Room from dropdown")
public void userShouldSelectAdultsPerRoomFromDropdown() {
	WebElement ddnAdlt = driver.findElement(By.id("adult_room"));
	Select s4 = new Select(ddnAdlt);
	s4.selectByValue("2");
    

}

@When("User should select Children per Room from dropdown")
public void userShouldSelectChildrenPerRoomFromDropdown() {
	WebElement ddnchild = driver.findElement(By.id("child_room"));
	Select s5 = new Select(ddnchild);
	s5.selectByValue("2");
    

}

@When("click Search button")
public void clickSearchButton()throws Exception {
	driver.findElement(By.id("Submit")).click();
	Thread.sleep(4000);
}

/*	@Then("verify and Search Hotel Cart page should be displayed to the User")
	public void verifyAndSearchHotelCartPageShouldBeDisplayedToTheUser() {
		System.out.println("Search Hotel Cart page Displayed Successfully");
	}

	@Given("user should enter valid credentials and click Search button")
	public void userShouldEnterValidCredentialsAndClickSearchButton() {
		System.out.println("user should entered valid credentials Successfully");
}*/
@When("user should select the checklist")
public void userShouldSelectTheChecklist() {
	driver.findElement(By.id("radiobutton_0")).click();    
}

@When("click Continue button")
public void clickContinueButton()  throws Exception {
	driver.findElement(By.id("continue")).click();
	Thread.sleep(4000);
}



/*	@Then("verify and Book A Hotel Page should be displayed to the user")
	public void verifyAndBookAHotelPageShouldBeDisplayedToTheUser() {
		System.out.println("Book A Hotel Page is Displayed Successfully");
	}

	@Given("user should select valid checklist and click Continue button")
	public void userShouldSelectValidChecklistAndClickContinueButton() {
		System.out.println("user should Selected valid Checklist Successfully");
	}*/
	
	@When("User should Enter First Name in the TextBox")
	public void userShouldEnterFirstNameInTheTextBox() {
		driver.findElement(By.id("first_name")).sendKeys("hkjgkashdk");		
	}

	@When("User should Enter Last Name in the TextBox")
	public void userShouldEnterLastNameInTheTextBox() {
		driver.findElement(By.id("last_name")).sendKeys("kjghkhgkas");
	}

	@When("User should Enter Billing Address in the TextBox")
	public void userShouldEnterBillingAddressInTheTextBox() {
		driver.findElement(By.id("address")).sendKeys("hggjagdygiygqiuiu");

	}

	@When("User should Enter Credit Card No as per the Format mentioned in the TextBox")
	public void userShouldEnterCreditCardNoAsPerTheFormatMentionedInTheTextBox() {
		driver.findElement(By.id("cc_num")).sendKeys("2323241357868723");

	}

	@When("User should select Credit Card Type from dropdown")
	public void userShouldSelectCreditCardTypeFromDropdown() {
		WebElement ddncctype = driver.findElement(By.id("cc_type"));
		Select c = new Select(ddncctype);
		c.selectByValue("VISA");
	}

	@When("User should select  Month and Year from Expiry Date dropdown")
	public void userShouldSelectMonthAndYearFromExpiryDateDropdown() {
		
		WebElement ddnMonth = driver.findElement(By.id("cc_exp_month"));
		Select c1 = new Select(ddnMonth);
		c1.selectByValue("1");
		
		WebElement ddnEx = driver.findElement(By.id("cc_exp_year"));
		Select c2 = new Select(ddnEx);
		c2.selectByValue("2012");
	}

	@When("User should Enter CVV Number in the CVV Number TextBox")
	public void userShouldEnterCVVNumberInTheCVVNumberTextBox() {
		driver.findElement(By.id("cc_cvv")).sendKeys("1233");

	}

	@When("click BookNow button")
	public void clickBookNowButton() throws Exception {
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(10000);
	}
	
	

	@Then("verify and Order id should be displayed to the User")
	public void verifyAndOrderIdShouldBeDisplayedToTheUser() {

		WebElement Order = driver.findElement(By.id("order_no"));
		String text = Order.getAttribute("value");
		System.out.println(text);
		System.out.println("Order ID is Displayed Successfully");

	}
	@When("User should enter valid {string} and {string}")
	public void userShouldEnterValidAnd(String username, String pass) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pass);
	}

	@Then("user able view error message")
	public void userAbleViewErrorMessage() {
		driver.findElement(By.id("login")).click();
	}

}
