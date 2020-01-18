package com.assignment1.specifications;

import org.openqa.selenium.By;

public class IphonePricingSpecifications {
	
	public static String amazon_price;
	public static String flipkart_price;
	
	//Amazon_searchfield
	public static By search=By.xpath("//input[@id='twotabsearchtextbox']");
	
	//click
	public static By click_button=By.xpath("//div[@class='nav-search-submit nav-sprite']/input");
	
	//Amazon_selecting the phone
	public static By iphoneyellow=By.linkText("Apple iPhone XR (64GB) - Yellow");
	
	//Amazon_price of the iphone
	public static By price=By.xpath("//span[@id='priceblock_ourprice']");
	
	
	//flipkart
	public static By fx=By.xpath("//body[@class='fk-modal-visible']/div[2]/div[1]/div/button");
	
	//Flipkartsearchfield
	public static By fsearch=By.xpath("//input[@type='text']");
	
	//fclick
	public static By fclick_button=By.xpath("//button[@type='submit']");
	
	//flipkart selecting the phone
	public static By fiphoneyellow=By.xpath("//div[@id='container']/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]");
	
	//flipkart price
	public static By fprice=By.xpath("//div[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div[3]/div/div/div");
	
	//flipkart childwindow wait
	//public static By fwait=By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/h1/span");
	

}
