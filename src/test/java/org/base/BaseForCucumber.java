package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseForCucumber {
	WebDriver driver;
	public String attribute(WebElement element) {
String attribute = element.getAttribute("value");
		return attribute;
	}

}
