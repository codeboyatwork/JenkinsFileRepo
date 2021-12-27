package tests.selenium.first;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.searchengine.google.GoogleSearchHomePage;

public class TestOne {
    
    WebDriver driver;
    GoogleSearchHomePage pomHomePage =  new GoogleSearchHomePage();
    
    @BeforeClass
    public void prepareEnvironment( ) {
        driver = new ChromeDriver();
    }
    
    @Test
    public void myTest() {
        driver.get("https://www.google.com");
        WebElement searchBar = driver.findElement(pomHomePage.searchBar);
        searchBar.sendKeys("Hello");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        assertEquals(driver.getTitle(), "Google");
    }
    
    @AfterClass
    public void closeDriver() {
        driver.quit(); 
    }
    
}
