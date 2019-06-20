package test;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReuseFun extends MainMethod {

public void ClickFun(By obj1) 
{
	driver.findElement(obj1).click();
}
public void mAction(By obj1)
{
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(obj1)).click().perform();
}
public void ClickFun(By obj1, WebDriverWait wait) 
{
	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(obj1));
	element.click();
}
public void alertFun()
{
driver.switchTo().alert().accept();
}
public void sendValue(By obj1,String text1) 
{
	driver.findElement(obj1).sendKeys(text1);
}


public void sendValue(By obj1,XSSFCell cell) 
{
	String cd=cell.getStringCellValue();
	driver.findElement(obj1).sendKeys(cd);
}

public void clearValue(By fRet)
{
	driver.findElement(fRet).clear();
}
public void select1(By obj1,String value)
{
	Select sdp=new Select(driver.findElement(obj1));
	sdp.deselectByValue(value);
}


public void select1(By obj1,XSSFCell value)
{
	 value.setCellType(Cell.CELL_TYPE_STRING);
	 
	Select sdp=new Select(driver.findElement(obj1));
	sdp.selectByValue(value.getStringCellValue());
}
public void submitBtn(By obj1)
{
	driver.findElement(obj1).submit();
}
}
