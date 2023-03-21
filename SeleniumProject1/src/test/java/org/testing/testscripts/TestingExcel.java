package org.testing.testscripts;

import java.io.IOException;

import org.testing.utilities.ExcelFileHandling;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class TestingExcel 
{
	@Test
	public void TestCasetestexcel() throws BiffException, IOException
	{
		String f = "../SeleniumProject1/ExcelOld.xls";
		ExcelFileHandling test = new ExcelFileHandling();
		//test.readParticulatRow(2, f);
		//test.readParticularCell(0, 0, f);
		test.readParticulatRange(2, 3, f);
	}

}
