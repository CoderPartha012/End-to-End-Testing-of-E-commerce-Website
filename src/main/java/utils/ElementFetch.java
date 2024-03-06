package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class ElementFetch {

	public WebElement getWebElement(String indentifierType, String identifierValue)
	{
		switch(indentifierType) {

		case "XPATH":
			return BaseTest.driver.findElement(By.xpath(identifierValue));
		case "CSS":
			return BaseTest.driver.findElement(By.cssSelector(identifierValue));
		case "ID":
			return BaseTest.driver.findElement(By.id(identifierValue));
		case "NAME":
			return BaseTest.driver.findElement(By.name(identifierValue));
		case "TAGNAME":
			return BaseTest.driver.findElement(By.tagName(identifierValue));

		default:
			return null;
		}
	}
	public List<WebElement> getWebElements(String indentifierType, String identifierValue)
	{
		switch(indentifierType) {

		case "XPATH":
			return BaseTest.driver.findElements(By.xpath(identifierValue));
		case "CSS":
			return BaseTest.driver.findElements(By.cssSelector(identifierValue));
		case "ID":
			return BaseTest.driver.findElements(By.id(identifierValue));
		case "NAME":
			return BaseTest.driver.findElements(By.name(identifierValue));
		case "TAGNAME":
			return BaseTest.driver.findElements(By.tagName(identifierValue));

		default:
			return null;
		}
	}
}
