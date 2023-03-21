package org.testing.utilities;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelFileHandling
{
	public void readParticularCell(int row,int col, String filename) throws BiffException, IOException
	{
		System.out.println("This method reads data from particular cell");
		File f = new File(filename);
		Workbook wbook = Workbook.getWorkbook(f);
		Sheet wsheet = wbook.getSheet(0);
		System.out.println("Row  : "+ row);
		System.out.println("Column : "+ col);
		if(row>0) row--;
		if(col>0) col--;
		
				Cell c1 = wsheet.getCell(row,col);
				System.out.println(c1.getContents());
		
	}
	public void readParticulatRow(int rownum, String filename) throws IOException, BiffException
	{
		System.out.println("This method reads data from particular row");
		File f = new File(filename);
		Workbook wbook = Workbook.getWorkbook(f);
		Sheet wsheet = wbook.getSheet(0);
		System.out.println("Row num : "+ rownum);
		
		if(rownum>0) rownum--;
		
		int columns = wsheet.getColumns();
		//for(int i=0;i<=rownum;i++)
		//{
			System.out.println("Row number: "+ rownum);
			for (int col = 0; col < columns; col++) 
			{
				//System.out.println("Col number: "+ col);
            Cell cell = wsheet.getCell(col, rownum);
            System.out.print(cell.getContents() + " ");
			}
			System.out.println();
		//}
     
	}
	public void readParticulatRange(int startRow, int endRow,String filename) throws BiffException, IOException
	{
		System.out.println("This method reads data from particular range");
		
		File f = new File(filename);
		Workbook wbook = Workbook.getWorkbook(f);
		Sheet wsheet = wbook.getSheet(0);
		System.out.println("Start Row : "+ startRow);
		System.out.println("End Row : "+ endRow);
		if(startRow>0) startRow--;
		if(endRow>0) endRow--;
		int columns = wsheet.getColumns();
		for(int i=startRow;i<=endRow;i++)
		{
			for (int col = 0; col < columns; col++) 
			{
            Cell cell = wsheet.getCell(col, i);
            System.out.print(cell.getContents() + " ");
			}
			System.out.println();
		}
        
	}
}


