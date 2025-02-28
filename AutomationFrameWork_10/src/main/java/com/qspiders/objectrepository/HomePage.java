package com.qspiders.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText="Log out")
	 private WebElement logoutLink;
	@FindBy(partialLinkText="BOOKS")
	 private WebElement booksLink;
	@FindBy(partialLinkText="COMPUTERS")
	 private WebElement computersLink;
	@FindBy(partialLinkText="JEWELRY")
	 private WebElement jewelryLink;
	
	

	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
}
	public WebElement getJewelryLink() {
		return jewelryLink;
	}
}
