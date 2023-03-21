package org.testing.assertions;

import org.testing.utilities.LogsCapture;

public class Assertion1
{
	public static void assertion1(String expected,String actual,String classname)
	{
		System.out.println("expected - "+ expected );
		System.out.println("actual - "+ actual);
		if(expected.equals(actual))
		{
			LogsCapture.takelogs(classname,"Soft Assertion1 is getting passed");
		}
		else
		{
			LogsCapture.takelogs(classname,"Soft Assertion1 is getting failed");
		}
	}
}
