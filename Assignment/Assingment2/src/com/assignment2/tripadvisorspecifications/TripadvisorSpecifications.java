package com.assignment2.tripadvisorspecifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TripadvisorSpecifications {
		
	//search text field
	public static By search=By.xpath("//div[@title='Search']");
	
	//main search text field
    public static By main_search=By.xpath("//input[@id='mainSearch']");
    
    //search button
    public static By search_button=By.xpath("//div[@id='SEARCH_BUTTON_CONTENT']/div");
    
    //clicking the first option
    public static By firstoption=By.xpath("//span[contains(text(),'Club Mahindra Madikeri, Coorg')]");
    
    //public static By firstoption=By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[1]/div/div[3]/div/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div[1]/div[1]/span");
	
    //click on reviews
    public static By reviews=By.xpath("//span[@title='Reviews']");
    
    //click on write a review
    public static  By write_review=By.xpath("//a[contains(text(),'Write a review')]");
    
    //click on bubble rating
    public static By bubble_rating=By.xpath("//span[@id='bubble_rating']");
    
    //title of your review
    public static By title_review=By.xpath("//input[@id='ReviewTitle']");
    
    //text review
    public static By text_review=By.xpath("//textarea[@id='ReviewText']");
    
    
    //hotel ratings service, value and cleanliness
    public static By service=By.xpath("//div[@class='questionBlock optionalQuestions']/div[3]/div[2]//child::div[1]/div/div[1]/label//following::span[1]");
    
    public static By Value=By.xpath("//div[@class='questionBlock optionalQuestions']/div[3]/div[2]//child::div[1]/div/div[1]/label//following::span[2]");
    
    public static By cleanliness=By.xpath("//div[@class='questionBlock optionalQuestions']/div[3]/div[2]//child::div[1]/div/div[1]/label//following::span[3]");
    
    //click on submit review
    public static By submit_button=By.xpath("//div[@id='SUBMIT']");
    
}
