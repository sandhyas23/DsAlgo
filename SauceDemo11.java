package NN_Assignment_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

	public static void main(String[] args) throws InterruptedException {
		 
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebElement userName=driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement login_btn=driver.findElement(By.id("login-button"));
		login_btn.click();
		
		WebElement product1=driver.findElement(By.className("inventory_item_img"));
		product1.click();
		
		WebElement addToCart_btn=driver.findElement(By.name("add-to-cart"));
		addToCart_btn.click();
		
		WebElement cart_link=driver.findElement(By.className("shopping_cart_link"));
		cart_link.click();
		
		WebElement continue_btn=driver.findElement(By.id("continue-shopping"));
		continue_btn.click();
		
		WebElement cart_link1=driver.findElement(By.className("shopping_cart_link"));
		cart_link1.click();
		
		WebElement checkOut_btn=driver.findElement(By.id("checkout"));
		checkOut_btn.click();
		
		WebElement firstName=driver.findElement(By.id("first-name"));
		firstName.sendKeys("Sangeetha");
		
		WebElement lastName=driver.findElement(By.id("last-name"));
		lastName.sendKeys("Krishna Kumar");
		
		WebElement zipCode=driver.findElement(By.id("postal-code"));
		zipCode.sendKeys("08830");

		WebElement continue_btn1=driver.findElement(By.id("continue"));
		continue_btn1.click();

		WebElement finish_btn=driver.findElement(By.id("finish"));
		finish_btn.click();
		
		WebElement msg=driver.findElement(By.className("complete-header"));
		String message=msg.getText();
		System.out.println(message);

		WebElement backToHome_btn=driver.findElement(By.id("back-to-products"));
		backToHome_btn.click();

		WebElement menu_btn=driver.findElement(By.id("react-burger-menu-btn"));
		menu_btn.click();

		WebElement logOut_btn=driver.findElement(By.id("logout_sidebar_link"));
		Thread.sleep(1000);
		//WebElement logOut_btn=driver.findElement(By.className("bm-item menu-item"));
		logOut_btn.click();
	}
}
