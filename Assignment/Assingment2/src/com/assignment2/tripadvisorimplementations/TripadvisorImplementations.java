package com.assignment2.tripadvisorimplementations;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.assigment2.constants.BrowserOperations;
import com.assignment2.tripadvisorspecifications.TripadvisorSpecifications;




public class TripadvisorImplementations extends BrowserOperations{
	
	public void tripAdvisor() throws Exception {
		
		driver.get("https://www.tripadvisor.in");
		
		driver.findElement(TripadvisorSpecifications.search).click();
		driver.findElement(TripadvisorSpecifications.main_search).sendKeys("club mahindra");
		driver.findElement(TripadvisorSpecifications.search_button).click();
		driver.findElement(TripadvisorSpecifications.firstoption).click();

	}
	
	public void review() throws Exception{
		
		
		Set<String> total_windows=driver.getWindowHandles();
		Object windows[]=total_windows.toArray();
		String child_window=windows[1].toString();
		driver.switchTo().window(child_window);

		Thread.sleep(10000);
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("window.scrollBy(0,1200)");
			
		WebDriverWait wait=new WebDriverWait(driver,25);
		WebElement click_ok =wait.until(ExpectedConditions.visibilityOf(driver.findElement(TripadvisorSpecifications.reviews))); 
		driver.findElement(TripadvisorSpecifications.reviews).click();
			}

	public void writingreview() throws Exception
	{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement click_ok =wait.until(ExpectedConditions.visibilityOf(driver.findElement(TripadvisorSpecifications.write_review))); 

		driver.findElement(TripadvisorSpecifications.write_review).click();
		
		Set<String> total_windows=driver.getWindowHandles();
		Object windows[]=total_windows.toArray();
		String child_window=windows[2].toString();
		driver.switchTo().window(child_window);

		Actions a =new Actions(driver);
		int bubbleratingX=driver.findElement(TripadvisorSpecifications.bubble_rating).getLocation().getX();
		
		int bubbleratingY=driver.findElement(TripadvisorSpecifications.bubble_rating).getLocation().getY();
		System.out.println(bubbleratingX+","+bubbleratingY);
		int overallratingX=driver.findElement(By.xpath("//em[@id='overallRatingFlagText']")).getLocation().getX();
		int overallratingY=driver.findElement(By.xpath("//em[@id='overallRatingFlagText']")).getLocation().getY();
		System.out.println(overallratingX+","+overallratingY);
		
		a.moveByOffset(330, 317).click().build().perform();

		driver.findElement(TripadvisorSpecifications.title_review).sendKeys("review for club mahindra");
		
		driver.findElement(TripadvisorSpecifications.text_review).sendKeys("text review for club mahindra");
	}
	
	public void review2() throws Exception{
		
		Actions a =new Actions(driver);
		int serviceratingX=driver.findElement(TripadvisorSpecifications.service).getLocation().getX();
		
		int serviceratingY=driver.findElement(TripadvisorSpecifications.service).getLocation().getY();
		
		a.moveByOffset(serviceratingX, serviceratingY).click().build().perform();
		
        int valueratingX=driver.findElement(TripadvisorSpecifications.Value).getLocation().getX();
		
		int valueratingY=driver.findElement(TripadvisorSpecifications.Value).getLocation().getY();
		
		a.moveByOffset(serviceratingX, serviceratingY).click().build().perform();
		
        int cleanlinessratingX=driver.findElement(TripadvisorSpecifications.cleanliness).getLocation().getX();
		
		int cleanllinessratingY=driver.findElement(TripadvisorSpecifications.cleanliness).getLocation().getY();
		
		a.moveByOffset(serviceratingX, serviceratingY).click().build().perform();
		
		driver.findElement(TripadvisorSpecifications.submit_button).click(); 
	
	}
}
