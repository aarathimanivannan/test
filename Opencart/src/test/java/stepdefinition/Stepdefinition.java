package stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import hackathon.Opencart.Libraryfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {

	WebDriver Driver;

	public static WebDriver driver;

	@Given("Initialize the Chrome browser and launch the Opencart Website")
	public void initialize_the_chrome_browser_and_launch_the_opencart_website() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		driver.get("https://demo.opencart.com/");

		WebDriverWait wait = new WebDriverWait(driver, 60);

		Libraryfile get = new Libraryfile(driver);

		get.getacc().click();

		// registration

		// l.register().click();

		/*
		 * l.firstname().sendKeys("Aarathi"); l.lastname().sendKeys("Manivannan");
		 * 
		 * l.email().sendKeys("aarathi91@gmail.com");
		 * l.telephone().sendKeys("994123245");
		 * 
		 * l.pass().sendKeys("Welcome@123");
		 * l.confirmpassword().sendKeys("Welcome@123");
		 * 
		 * l.licensecheckbox().click();
		 * 
		 * l.clickcontinue().click();
		 * 
		 */

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// login

		get.login().click();

		File src = new File("C:\\Users\\91994\\Documents\\opencart.xlsx");
		FileInputStream input = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		String uname = sheet.getRow(1).getCell(0).getStringCellValue();
		get.username().sendKeys(uname);

		String pass = sheet.getRow(1).getCell(1).getStringCellValue();
		get.password().sendKeys(pass);
		get.submit().click();

		System.out.println(driver.getTitle());

		Actions actions = new Actions(driver);

		actions.moveToElement(get.desktop()).build().perform();

		actions.moveToElement(get.mac());
		actions.click().build().perform();

		get.selectmac().click();
		get.addtocart().click();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src1, new File("C:\\Users\\91994\\Documents\\hackathon5\\reports\\snap.png"));

		} catch (Exception e) {
			e.printStackTrace();
		}

		actions.moveToElement(get.laptopsnotebooks()).build().perform();

		actions.moveToElement(get.showall());
		actions.click().build().perform();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		get.hplaptop().click();

		get.datebox().clear();

		get.datebox().sendKeys("2021-04-20");

		get.addtocart1().click();

		get.itembasket().click();

		get.checkout().click();

		// actions.moveToElement(l.itembasket()).build().perform();
		// actions.moveToElement(l.checkout());
		// actions.click().build().perform();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		get.removemac().click();

		Thread.sleep(5000);

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		js.executeScript("window.scrollBy(0,1000)");

		get.finalcheckout().click();

		get.guestcheckout().click();

		get.radiobutton().click();

		String payfirstname = sheet.getRow(1).getCell(3).getStringCellValue();
		get.payfirstname().sendKeys(payfirstname);

		String paylastname = sheet.getRow(1).getCell(4).getStringCellValue();
		get.paylastname().sendKeys(paylastname);

		String address = sheet.getRow(1).getCell(5).getStringCellValue();
		get.address1().sendKeys(address);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String city = sheet.getRow(1).getCell(6).getStringCellValue();
		get.city().sendKeys(city);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// String postcode = sheet.getRow(1).getCell(7).getStringCellValue();
		get.postcode().sendKeys("9090900");

		Thread.sleep(5000);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Select select = new Select(get.getcountry());
		select.selectByVisibleText("India");

		Select select2 = new Select(get.region());
		select2.selectByVisibleText("Tamil Nadu");

		get.billcontinue().click();
		Thread.sleep(3000);

		get.shippingcontinue().click();
		Thread.sleep(3000);

		get.flatshippingbtn1().click();
		Thread.sleep(3000);

		get.comments().sendKeys("ABCDEF");
		Thread.sleep(3000);

		get.commentscontinue().click();
		Thread.sleep(3000);

		get.paymentcheckbox().click();
		Thread.sleep(3000);

		get.paymentcontinue().click();
		Thread.sleep(3000);
		get.confirmorder().click();

		Thread.sleep(3000);

		File src2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileHandler.copy(src2, new File("C:\\Users\\91994\\Documents\\hackathon5\\reports\\snap1.png"));

		} catch (Exception e) {
			e.printStackTrace();
		}

		Thread.sleep(5000);

		get.acc().click();
		get.myacc().click();
		get.editaccount().click();

		get.updatelastname().clear();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		get.updatelastname().sendKeys("nm");
		// String updatelastname = sheet.getRow(1).getCell(8).getStringCellValue();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		get.updatecontinue().click();

		Thread.sleep(5000);

		File src3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileHandler.copy(src3, new File("C:\\Users\\91994\\Documents\\hackathon5\\reports\\snap2.png"));

		} catch (Exception e) {
			e.printStackTrace();
		}

		Thread.sleep(5000);

		js.executeScript("window.scrollBy(0,500)");
		get.logout().click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		get.homepagecontinue().click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		actions.moveToElement(get.components()).build().perform();
		actions.moveToElement(get.monitors());
		actions.click().build().perform();

		get.apple3D().click();
		get.applecheckbox().click();

		js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(5000);

 Select select3=new Select(get.selectdropdown());
select.selectByValue("3");
Thread.sleep(5000);
get.textarea().clear();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 get.textarea().sendKeys("test");

 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

 get.uploadfile().sendKeys("C:\\Users\\91994\\Documents\\hackathon5\\hack5.xlsx");

get.datefield().clear();
 get.datefield().sendKeys("2021-04-21");

 get.datetimefield().clear();
get.datetimefield().sendKeys("2021-04-21 22:25");

 get.appleaddtocart().click();

//@When("User enters Username")
//public void user_enters_username() {
// System.out.println("Aarathi");
//}

//@When("User enters Password")
//public void user_enters_password() {
// System.out.println("abcdef");
//}

//@Then("click on Login")
//public void click_on_login() {
//    System.out.println("login");

}}
