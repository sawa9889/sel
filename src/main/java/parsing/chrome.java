package parsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;

public class chrome {
    private void rollDown(WebDriver driver){
        WebElement element = driver.findElement(By.className("more_link"));
        Coordinates coordinate = ((Locatable)element).getCoordinates();
        coordinate.onPage();
        coordinate.inViewPort();
    }

    private WebDriver connect(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://vk.com/feed");
        return driver;
    }

    private void login(WebDriver driver){
        driver.findElement(By.id("pass")).sendKeys("Nerealniy_parol001");
        driver.findElement(By.id("email")).sendKeys("89035018407");
        driver.findElement(By.id("login_button")).click();
    }

}
