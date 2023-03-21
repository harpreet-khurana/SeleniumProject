package Selenium_Project.SeleniumProject1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CsvReadClass 
{

	public static void main(String[] args) throws IOException 
	{
	File f = new File("../SeleniumProject1/CSVRead.csv");
	FileReader fr = new FileReader(f);
	BufferedReader br = new BufferedReader(fr);
	String s;
	
	while((s=br.readLine())!=null)
	{
		String[] s1 = s.split(",");
		int l = s1.length;
		for(int i=0;i<l;i++)
		{
			System.out.println(s1[i]);
		}
	}
	br.close();
	}
}
