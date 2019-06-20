package test;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainMethod  implements Objects {
	public static WebDriver driver;
	
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		XSSFWorkbook workbook;
		XSSFSheet sheet;
		XSSFCell cell;

	 System.setProperty("webdriver.chrome.driver","C:\\selenium g\\chromedriver.exe");//change path to your driver
	 File src=new File("C:\\Users\\MohanKarthick\\Desktop\\rently\\ct.xlsx");//change path to your XLSX file
	 FileInputStream finput = new FileInputStream(src);
	 workbook = new XSSFWorkbook(finput);
	 sheet =workbook.getSheetAt(0);
	
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cleartrip.com/");
	ReuseFun s1=new ReuseFun();
	int len=sheet.getLastRowNum();
	for(int i=1;i<len;i++)
	{
	// Booking flight
	s1.mAction(roundTrip);
	cell=sheet.getRow(i).getCell(0);
	s1.clearValue(fFrom);
	s1.sendValue(fFrom, cell);

	cell=sheet.getRow(i).getCell(1);
	s1.clearValue(fTo);
	s1.sendValue(fTo, cell);
	cell=sheet.getRow(i).getCell(5);
	s1.clearValue(fDep);
	s1.sendValue(fDep,cell);
	cell=sheet.getRow(i).getCell(6);
	s1.clearValue(fRet);
	s1.sendValue(fRet,cell);
	cell=sheet.getRow(i).getCell(2);
	s1.select1(fAdult,cell);
	cell=sheet.getRow(i).getCell(3);
	s1.select1(fChild,cell);
	cell=sheet.getRow(i).getCell(4);
	s1.select1(fInfants,cell);
	s1.ClickFun(fSearch);
	
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebDriverWait wait = new WebDriverWait(driver, 100);
	s1.ClickFun(fSort1,wait);
	s1.ClickFun(fSort2);
	s1.ClickFun(fDtime);
	s1.ClickFun(fBook);
	s1.ClickFun(fAgree);
	s1.ClickFun(conBk);
	//s1.alertFun();
	//s1.ClickFun(hotels);
	if((i+1)<len)
	{
		
		driver.navigate().to("https://www.cleartrip.com/");
		driver.navigate().refresh();
		//driver.manage().deleteAllCookies();
	}
	else
	{
		driver.quit();
	}
	}
	}
}