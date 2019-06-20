package test;

import org.openqa.selenium.By;

public interface Objects {

By flightTab=By.xpath("//ul[@class='navGroup productNav withArrows']//li[@class='flightApp']//a[@href='/flights']");
By oneWay=By.xpath("//input[@id='OneWay']");
By roundTrip=By.xpath("//input[@id='RoundTrip']");
By multiCity=By.xpath("//input[@id='MultiCity']");
By fFrom=By.xpath("//input[@id='FromTag']");
By fTo=By.xpath("//input[@id='ToTag']");
By fDepart =By.xpath("//input[@id='DepartDate']");
By fAdult=By.xpath("//select[@id='Adults']");
By fChild=By.xpath("//select[@id='Childrens']");
By fInfants =By.xpath("//select[@id='Infants']");
By fMore=By.xpath("//a[@id='MoreOptionsLink']");
By fClass =By.xpath("//select[@id='Class']");
By fPref=By.xpath("//input[@id='AirlineAutocomplete']");
By fSearch = By.xpath("//input[@id='SearchBtn']");
 By fDep=By.xpath("//input[@id='DepartDate']");
 By fRet=By.xpath("//input[@title='Return date']");
 By fSort1 =By.xpath("//div[@class='colZero leg col12']//a[@data-sort='price']");
 By fSort2 =By.xpath("//div[@class='colZero leg col12 last']//a[@data-sort='price']");
 By fDtime=By.xpath("//label[@for='1_1_0_8_departureTime']");
 By fBook=By.xpath("//div[@id='ResultContainer_1_1']//button[@class='booking fRight']");
 By fAgree=By.xpath("//input[@name='insuranceConfirm']");
 By conBk=By.xpath("//input[@value='Continue booking']");
 
 
 //By fBook=By.xpath("//div[@id='ResultContainer_1_1']//section[@class='row content']//div[@class='center colZero col16 viewController']//form[@id='flightForm']//section[@class='resultsContainer']//div[@class='row roundTripHead']//div[@class='col col3 actionCol']//button[@class='booking fRight']");

 
 //Hotel objects
By hotels=By.xpath("//nav[@class='hasProductIcons']//a[@href='/hotels']");
By hWhere =By.xpath("//input[@id='Tags']");
By hDateIn=By.xpath("//input[@id='CheckInDate']");
By hDateOut=By.xpath("//input[@id='CheckOutDate']");
By hTrav = By.xpath("//select[@id='travellersOnhome']");
By hSearch = By.xpath("input[@id='SearchHotelsButton']");






}
