package handling_popups;

import java.util.Set;

public class ParentWindowId extends BaseClass {
	
	public static void main(String[] args) {
		
		driver.get("http://www.naukri.com");
		String parentwindowId = driver.getWindowHandle();
		String title = driver.getTitle();
		Set<String> childsId = driver.getWindowHandles();
	    int count = childsId.size();
	    System.out.println("total no of windows are:"+count);
	    for(String allwindows:childsId) {
	    	driver.switchTo().window(allwindows);
	    	if(!allwindows.equals(parentwindowId)) {
	    		System.out.println("main browser title:"+title+"---->is closed");
	    	    driver.close();
	    	}
	    	else {
	    		System.out.println("it is  a parent browser");
	    	}
	    	
	    	
	    }
	
	
	
	
	}
	}
