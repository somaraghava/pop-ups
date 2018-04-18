package handling_popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertPopup extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		driver.get("http://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String errmsg = alert.getText();
		System.out.println(errmsg);
		//alert.accept();
		alert.dismiss();
		driver.close();
		
		
		

	}

}


//Asssignment