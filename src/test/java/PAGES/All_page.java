package PAGES;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class All_page extends BASE {
	@FindBy(id="inputEmail")
	public static WebElement email;
	@FindBy(id="inputPassword")
	public static WebElement password;
	@FindBy(xpath="//button[conatins(text(),'Sign in')]")
	public  WebElement signIn ;
	@FindBy(xpath="//ul[@class='list-group']/li[2]")
	public static WebElement getvalueofsecondlist  ;
	@FindBy(xpath="//ul[@class='list-group']/li[2]/span")
	public static WebElement getbadgeofsecondlist  ;
	@FindBy(id="dropdownMenuButton")
	public static WebElement dropdownmenuButton;
	@FindBy(xpath="//a[contains(text(),'Option 2')]")
	public static WebElement selectoption2;
	@FindBy(xpath="//button[contains(text(),'Button')]")
	public static WebElement enabledbutton;
	@FindBy(xpath="//button[contains(text(),'Button')]")
	public static WebElement disabledbutton;
	@FindBy(id="test5-button")
	public WebElement test5button;
	@FindBy(id="test5-alert")
	public static WebElement alertmessage;
	@FindBy(xpath="//table[@class='table table-bordered table-dark']/tbody/tr[3]/td[3]")
	public static WebElement getvalueofcell;
	
	
	
	
	
	public  All_page(){
		PageFactory.initElements(driver, this);
		}
public void login(String a,String b) {
	email.sendKeys(a);
	password.sendKeys(b);
	signIn.click();
}
public int listofgroup() {
	List<WebElement> total=driver.findElements(By.xpath("//ul[@class='list-group']"));
	return total.size();
}
public String secondlistvaluetext() {
	return getvalueofsecondlist .getText();
}
public String secondlistvaluebadge() {
	return getbadgeofsecondlist.getText();
}
public String defaultoptiontext() {
return 	dropdownmenuButton.getText();
	 }
public void selectoption2() {
	selectoption2.click();
	 }
public Boolean enabledbutton() {
	return enabledbutton.isEnabled();
}
public Boolean disabledbutton() {
	return disabledbutton.isEnabled();
}
public void test5button() {
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.elementToBeClickable(test5button));
	
	test5button.click();
}
public String sucessmessage() {
	return alertmessage.getText();
}
public String getvalueofcell() {
return	getvalueofcell.getText();
	
}
}
