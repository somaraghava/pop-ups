package handling_popups;

import java.util.Set;

public class ChildBrowserPopup extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
	
		driver.get("http://www.naukri.com");
		//using the getWindowHandle() get the id of the all browser windows
		Set<String> allwh = driver.getWindowHandles();
	    //using size() count the no of  browser windows
		int count = allwh.size();
		System.out.println("the number of browser windows opened on the susystem is:"+count);
		//switch to each browsers
		for(String wh:allwh) {
			
			driver.switchTo().window(wh);
			//get the window title
			String title = driver.getTitle();
			System.out.println("window handle id of page-->:"+title+"-->is:"+wh);
			driver.close();
		}
		//Thread.sleep(4000);
		//driver.quit();
		
		
		
		
		
		
	}

}
