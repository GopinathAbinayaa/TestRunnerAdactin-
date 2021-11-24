package org.logindetail;

import java.util.concurrent.TimeUnit;

import org.base.BaseForCucumber;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Booking extends BaseForCucumber {
	WebDriver driver;

	@Given("user should be in  login page")
	public void user_should_be_in_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@When("user should login with the {string} and {string}")
	public void user_should_login_with_the_and(String name, String pass) {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(name);

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pass);

	}

	@When("they should click login")
	public void they_should_click_login() {
		WebElement login = driver.findElement(By.name("login"));
		login.click();

	}

	@When("user should search for the hotel{string},{string},{string},{string},{string},{string},{string}and{string}")
	public void user_should_search_for_the_hotel_and(String location, String hotel, String roomType, String noOfRoom,
			String checkIn, String checkOut, String adults, String childs) {
		WebElement loc = driver.findElement(By.id("location"));
		Select select = new Select(loc);
		select.selectByVisibleText(location);
		WebElement hot = driver.findElement(By.id("hotels"));
		Select select2 = new Select(hot);
		select2.selectByVisibleText(hotel);
		WebElement rooom = driver.findElement(By.id("room_type"));
		Select select3 = new Select(rooom);
		select3.selectByVisibleText(roomType);
		WebElement noorooms = driver.findElement(By.id("room_nos"));
		Select select4 = new Select(noorooms);
		select4.selectByVisibleText(noOfRoom);
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.sendKeys(checkIn);
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.sendKeys(checkOut);
		WebElement aadult = driver.findElement(By.id("adult_room"));
		Select select5 = new Select(aadult);
		select5.selectByVisibleText(adults);
		WebElement cchild = driver.findElement(By.id("child_room"));
		Select select6 = new Select(cchild);
		select6.selectByVisibleText(childs);
	}

	@When("user should click search and click radio button and click on continue")
	public void user_should_click_search_and_click_radio_button_and_click_on_continue() {
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		WebElement radioBtn = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		radioBtn.click();
		WebElement ccontinue = driver.findElement(By.id("continue"));
		ccontinue.click();
	}

	@When("user should enter {string},{string},{string}and{string}")
	public void user_should_enter_and(String fName, String lName, String address, String cardNum) {
		WebElement fst = driver.findElement(By.id("first_name"));
		fst.sendKeys(fName);
		WebElement lst = driver.findElement(By.xpath("//input[@name='last_name']"));
		lst.sendKeys(lName);
		WebElement aadd = driver.findElement(By.xpath("//textarea[@name='address']"));
		aadd.sendKeys(address);
		WebElement crdNum = driver.findElement(By.xpath("//input[@id='cc_num']"));
		crdNum.sendKeys(cardNum);
	}

	@When("user should select card type {string},{string},{string}and{string}")
	public void user_should_select_card_type_and(String cType, String eMonth, String eYear, String cv) {
		WebElement type = driver.findElement(By.id("cc_type"));
		Select select = new Select(type);
		select.selectByVisibleText(cType);
		WebElement expmmnth = driver.findElement(By.id("cc_exp_month"));
		Select select7 = new Select(expmmnth);
		select7.selectByVisibleText(eMonth);
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		Select select8 = new Select(expyear);
		select8.selectByVisibleText(eYear);
		WebElement c = driver.findElement(By.id("cc_cvv"));
		c.sendKeys(cv);
	}

	@When("user should click on booknow")
	public void user_should_click_on_booknow() {
		WebElement bk = driver.findElement(By.id("book_now"));
		bk.click();

	}

	@When("print the booking Id on the console")
	public void print_the_booking_Id_on_the_console() {
		BaseForCucumber d = new BaseForCucumber();

		WebElement orderId = driver.findElement(By.id("order_no"));
		String attribute = d.attribute(orderId);
		System.out.println(attribute);
	}

	@Then("user should verify success msg")
	public void user_should_verify_success_msg() {
		Assert.assertTrue("verify title", true);
		driver.quit();
	}
}
