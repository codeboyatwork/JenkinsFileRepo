package pom.searchengine.google;

import org.openqa.selenium.By;

public class GoogleSearchHomePage {

    public By searchBar;
    
    public GoogleSearchHomePage() {
        searchBar = By.xpath("//input[@title='Search']");
    }
}
