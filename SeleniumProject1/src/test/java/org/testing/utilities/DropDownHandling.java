package org.testing.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling
{
	public static void dropdownselectionbyindex(WebElement element,int indexNo)
	{
		Select s = new Select(element);
		s.selectByIndex(indexNo);
	}
	public static void dropdownselectionbyValue(WebElement element,String value)
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}
	public static void dropdownselectionbyVisibletext(WebElement element,String text)
	{
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

}
