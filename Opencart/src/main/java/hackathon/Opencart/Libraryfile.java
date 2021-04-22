package hackathon.Opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Libraryfile {

	public WebDriver driver;
	
	//Register 
	By account	= By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
	
	By myaccount = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
	
	By register = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
	
	By firstname = By.xpath("//*[@id=\"input-firstname\"]");
	
	By lastname = By.xpath("//*[@id=\"input-lastname\"]");
	
	By email = By.xpath("//*[@id=\"input-email\"]");
	
	By telephone = By.xpath("//*[@id=\"input-telephone\"]");
	
	By pass = By.xpath("//*[@id=\"input-password\"]");
	
	By confirmpassword = By.xpath("//*[@id=\"input-confirm\"]");
	
	By licensecheckbox = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
	
	By clickcontinue = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");

//Login
	
	By login = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
	
	By username = By.xpath("//*[@id=\"input-email\"]");
	
	By password = By.xpath("//*[@id=\"input-password\"]");
	
	By submit = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	
    By desktop = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a");
    
    By mac = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a");
    
    By selectmac = By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[1]/h4/a");
    
    By addtocart = By.xpath("//button[@id=\"button-cart\"]");
    
    By laptopsnotebooks = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/a");
    
    By showall = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a");
    
    By hplaptop = By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[1]/h4/a");
    
    // By calendar = By.xpath("//i[@class=\"fa fa-calendar\"]");
    
    By datebox = By.xpath("//*[@id=\"input-option225\"]");
    
    By addtocart1 = By.xpath("//*[@id=\"button-cart\"]");
    
    By itembasket = By.xpath("//*[@id=\"cart\"]/button");
    
    By checkout = By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong");
    
    By finalcheckout = By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a");
   
    By removemac = By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[4]/div/span/button[2]/i");
    
    By radiobutton = By.xpath("//*[@id=\"collapse-payment-address\"]/div/form/div[3]/label/input");
    
    By payfirstname = By.xpath("//*[@id=\"input-payment-firstname\"]");
    
    By paylastname = By.xpath("//*[@id=\"input-payment-lastname\"]");
    
    By address1 = By.xpath("//*[@id=\"input-payment-address-1\"]");
    
    By city = By.xpath("//*[@id=\"input-payment-city\"]");
    
    By postcode = By.xpath("//*[@id=\"input-payment-postcode\"]");
    
    By country = By.xpath("//*[@id='input-payment-country']");
    
    By region = By.xpath("//*[@id='input-payment-zone']");
    
    By billcontinue = By.xpath("//*[@id=\"button-payment-address\"]");
    
    By shippingcontinue = By.xpath("//*[@id=\"button-shipping-address\"]");
    
    By comments = By.xpath("//*[@id=\"collapse-shipping-method\"]/div/p[4]/textarea");
    
    By commentscontinue = By.xpath("//*[@id=\"button-shipping-method\"]");
    
    By paymentcheckbox = By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]");
    
    By paymentcontinue = By.xpath("//*[@id=\"button-payment-method\"]");
    
    By confirmorder = By.xpath("//*[@id=\"button-confirm\"]");
    
    By acc = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
    
    By myacc = By.xpath(("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a"));
        
    By editaccount = By.xpath("//*[@id=\"column-right\"]/div/a[2]");
    
    By updatelastname = By.xpath("//*[@id=\"input-lastname\"]");
    
    By updatecontinue = By.xpath("//*[@id=\"content\"]/form/div/div[2]/input");
    
    By logout = By.xpath("//*[@id=\"column-right\"]/div/a[13]");
    
    By homepagecontinue = By.xpath("//*[@id=\"content\"]/div/div/a");
    
    By components = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/a");
    
    By monitors = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/div/div/ul/li[2]/a");
    
    By apple3D = By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[1]/h4/a");
    
    By applecheckbox = By.xpath("//*[@id=\"input-option223\"]/div[1]/label/input");
    
    By appletextbox = By.xpath("//*[@id=\"input-option208\"]");
    
    By selectdropdown = By.xpath("//select[@id='input-option217']");
    
    By textarea = By.xpath("//*[@id=\"input-option209\"]");
    
    By uploadfile = By.xpath("//*[@id=\"button-upload222\"]/i");
    
    By datefield = By.xpath("//*[@id=\"input-option219\"]");
    
    By timefield = By.xpath("//*[@id=\"input-option221\"]");
    
    By datetimefield = By.xpath("//*[@id=\"input-option220\"]");
    
    By appleaddtocart = By.xpath("//*[@id=\"button-cart\"]");
    
    By search = By.xpath("//*[@id=\"search\"]/input");
    
    By searchbtn = By.xpath("//button[@class=\"btn btn-default btn-lg\"]");
    
    By iphone = By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/h4/a");
    
    By iphoneaddtocart = By.xpath("//*[@id=\"button-cart\"]");
    
    By iphoneremove = By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[4]/div/span/button[2]");
    
    By shoppingcart = By.xpath("//span[@class=\"hidden-xs hidden-sm hidden-md\"]");
    
    By hpremovecart = By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[2]/td[4]/div/span/button[2]/i");
    
    By hpquantity = By.xpath("//*[@id=\"input-quantity\"]");
    	
    By couponcode = By.xpath("//*[@id=\"accordion\"]/div[1]/div[1]/h4/a");
    
    By entercoupon = By.xpath("//*[@id=\"input-coupon\"]");
    
    By applycoupon = By.xpath("//*[@id=\"button-coupon\"]");
    
    By estimation = By.xpath("//*[@id=\"accordion\"]/div[2]/div[1]/h4/a");
    
    By shippingcountry = By.xpath("//*[@id=\"input-country\"]");
    
    By shippingregion = By.xpath("//*[@id=\"input-zone\"]");
    
    By zipcode = By.xpath("//*[@id=\"input-postcode\"]");
    
    By getquotes = By.xpath("//*[@id=\"button-quote\"]");
    
    By flatshippingbtn = By.xpath("//*[@id=\"modal-shipping\"]/div/div/div[2]/div/label/input");
    
    By applyshipping = By.xpath("//*[@id=\"button-shipping\"]");
    
    By shippingcheckout = By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a");
    
    By sort = By.xpath("//*[@id=\"input-sort\"]");
    
    By addtowishlist = By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[2]/button[2]/i");
    
    By wishlisticon = By.xpath("//*[@id=\"wishlist-total\"]/i");
    
    By addtowishcart = By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr/td[6]/button/i");
    
	By guestcheckout = By.xpath("//*[@id=\"checkout-checkout\"]/ul/li[3]/a");
	
	By flatshippingbtn1 = By.xpath("//*[@id=\"collapse-shipping-method\"]/div/div[1]/label/input");
	
	
	
	
	public Libraryfile(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getacc(){
		return driver.findElement(account);
	}
	
	public WebElement myaccount(){
		return driver.findElement(myaccount);
	}
	
	public WebElement register(){
		return driver.findElement(register);
	}
	
	public WebElement firstname(){
		return driver.findElement(firstname);
	}
	
	public WebElement lastname(){
		return driver.findElement(lastname);
	}
	
		public WebElement email(){
		return driver.findElement(email);
	}
	
		public WebElement telephone(){
			return driver.findElement(telephone);
	}
		
		public WebElement pass(){
			return driver.findElement(pass);
	}
		
		public WebElement confirmpassword(){
			return driver.findElement(confirmpassword);
	}
		
		public WebElement licensecheckbox(){
			return driver.findElement(licensecheckbox);
	}
		
		public WebElement clickcontinue(){
			return driver.findElement(clickcontinue);		
	}
		
		public WebElement username(){
			return driver.findElement(username);		
	}
		
		public WebElement password(){
			return driver.findElement(password);			
	}
		
		public WebElement login(){
			return driver.findElement(login);	
	}
		
		public WebElement submit(){
			return driver.findElement(submit);	
	}
	
		public WebElement desktop(){
			return driver.findElement(desktop);	
	}
 
		public WebElement mac(){
			return driver.findElement(mac);	
	}
		
		public WebElement selectmac(){
			return driver.findElement(selectmac);	
	}
		
		public WebElement addtocart(){
			return driver.findElement(addtocart);	
	}
		
		public WebElement laptopsnotebooks(){
			return driver.findElement(laptopsnotebooks);	
	}
		
		public WebElement showall(){
			return driver.findElement(showall);	
	}
		
		public WebElement hplaptop(){
			return driver.findElement(hplaptop);	
	}
		
		public WebElement addtocart1(){
			return driver.findElement(addtocart1);	
	}
		
		public WebElement datebox(){
			return driver.findElement(datebox);	
	}
		
		public WebElement itembasket(){
			return driver.findElement(itembasket);	
	}
		
		public WebElement checkout(){
			return driver.findElement(checkout);	
	}
		
		public WebElement finalcheckout(){
			return driver.findElement(finalcheckout);	
	}
		
		public WebElement removemac() {
			return driver.findElement(removemac);
	}
		
		public WebElement radiobutton() {
			return driver.findElement(radiobutton);
	}
		
		public WebElement payfirstname(){
			return driver.findElement(payfirstname);	
	}
		
		public WebElement paylastname(){
			return driver.findElement(paylastname);	
	}
		
		public WebElement address1(){
			return driver.findElement(address1);	
	}
		
		public WebElement city(){
			return driver.findElement(city);	
	}
		
		public WebElement postcode(){
			return driver.findElement(postcode);	
	}
		
		public WebElement getcountry(){
			return driver.findElement(country);	
	}
		
		public WebElement region(){
			return driver.findElement(region);	
	}
		
		public WebElement billcontinue(){
			return driver.findElement(billcontinue);	
	}
		public WebElement shippingcontinue(){
			return driver.findElement(shippingcontinue);	
	}
		public WebElement comments(){
			return driver.findElement(comments);	
	}
		public WebElement commentscontinue(){
			return driver.findElement(commentscontinue);	
	}
		public WebElement paymentcheckbox(){
			return driver.findElement(paymentcheckbox);	
	}
		public WebElement paymentcontinue(){
			return driver.findElement(paymentcontinue	);	
	}
		public WebElement confirmorder(){
			return driver.findElement(confirmorder);	
	}
		
		public WebElement acc(){
			return driver.findElement(acc);
	}
		
		public WebElement myacc(){
			return driver.findElement(myacc);
	}
		
		public WebElement editaccount(){
			return driver.findElement(editaccount);
	}
	
		public WebElement updatelastname(){
			return driver.findElement(updatelastname);
	}
		public WebElement updatecontinue(){
			return driver.findElement(updatecontinue);
	}
		public WebElement logout(){
			return driver.findElement(logout);
	}
		public WebElement homepagecontinue(){
			return driver.findElement(homepagecontinue);
	}
	    public WebElement components(){
			return driver.findElement(components);
	}
	    
	    public WebElement monitors(){
			return driver.findElement(monitors);
	}
	    
	    public WebElement apple3D(){
			return driver.findElement(apple3D);
	}
	    
	    public WebElement applecheckbox(){
			return driver.findElement(applecheckbox);
	}
	    
	    public WebElement appletextbox(){
			return driver.findElement(appletextbox);
	}
	    
		public WebElement selectdropdown(){
			return driver.findElement(selectdropdown);
	}
		public WebElement textarea(){
			return driver.findElement(textarea);
	}
		public WebElement uploadfile(){
			return driver.findElement(uploadfile);
	}
		public WebElement datefield(){
			return driver.findElement(datefield);
	}
		public WebElement timefield(){
			return driver.findElement(timefield);
	}
		public WebElement datetimefield(){
			return driver.findElement(datetimefield);
	}
		public WebElement appleaddtocart(){
			return driver.findElement(appleaddtocart);
	}
		public WebElement search(){
			return driver.findElement(search);
	}
		
		public WebElement searchbtn(){
			return driver.findElement(searchbtn);
	}
		
		public WebElement iphone(){
			return driver.findElement(iphone);
	}
		
		public WebElement iphoneaddtocart(){
			return driver.findElement(iphoneaddtocart);
	}
		
		public WebElement iphoneremove(){
			return driver.findElement(iphoneremove);
	}
		
		public WebElement shoppingcart(){
			return driver.findElement(shoppingcart);
	}
		
		public WebElement hpremovecart(){
			return driver.findElement(hpremovecart);
	}
		
		public WebElement hpquantity(){
			return driver.findElement(hpquantity);
	}
		public WebElement couponcode(){
			return driver.findElement(couponcode);
	}
		
		public WebElement entercoupon(){
			return driver.findElement(entercoupon);
	}
		
		public WebElement applycoupon(){
			return driver.findElement(applycoupon);
	}
		
		
		public WebElement estimation(){
			return driver.findElement(estimation);
	}
		
		
		public WebElement shippingcountry(){
			return driver.findElement(shippingcountry);
	}
	
		
		public WebElement shippingregion(){
			return driver.findElement(shippingregion);
	}
	
		
		public WebElement zipcode(){
			return driver.findElement(zipcode);
	}
	
		
		public WebElement getquotes(){
			return driver.findElement(getquotes);
	}
	
		
		public WebElement flatshippingbtn(){
			return driver.findElement(flatshippingbtn);
	}
	
		
		public WebElement applyshipping(){
			return driver.findElement(applyshipping);
	}
	
		
		public WebElement shippingcheckout(){
			return driver.findElement(shippingcheckout);
	}
	
		
		public WebElement sort(){
			return driver.findElement(sort);
	}
	
		
		public WebElement addtowishlist(){
			return driver.findElement(addtowishlist);
	}
		
		public WebElement wishlisticon(){
			return driver.findElement(wishlisticon);
	}
		
		public WebElement addtowishcart(){
			return driver.findElement(addtowishcart);
	}
		

		public WebElement guestcheckout(){
			return driver.findElement(guestcheckout);
	}
		
		public WebElement flatshippingbtn1(){
			return driver.findElement(flatshippingbtn1);
	}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
	
		
	
	
	
	