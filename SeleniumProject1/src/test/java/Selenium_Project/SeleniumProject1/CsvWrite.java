package Selenium_Project.SeleniumProject1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CsvWrite 
{

	public static void main(String[] args) throws IOException 
	{
	File f = new File("../SeleniumProject1/CSVWriteFile.csv");
	FileWriter fw = new FileWriter(f);
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the data to write : ");
	String data;
	BufferedWriter bw = new BufferedWriter(fw);
		
	for(int i=0;i<2;i++)
		{
		for(int j=0;j<2;j++)
		{
			data=sc.next();
			 bw.write(data);
	         bw.write(",");
		}
		
		}
	bw.newLine();
	sc.close();
	bw.close();
	}
	
}

