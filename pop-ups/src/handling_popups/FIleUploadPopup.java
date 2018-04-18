package handling_popups;

import org.openqa.selenium.By;

public class FIleUploadPopup extends BaseClass{

	
	public static void main(String[] args) throws InterruptedException {
		
	
	driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
	String xp="(//input[@type='file'])[2]";
	Thread.sleep(3000);
	String absoluteFilePath = "D:\\CRM.txt";
	Thread.sleep(3000);
	driver.findElement(By.xpath(xp)).sendKeys(absoluteFilePath);
	}
}



