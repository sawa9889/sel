package Threads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextThred implements Runnable {
Thread t;
WebElement element;
WebDriver driver;
int i;
    TextThred(WebElement element, WebDriver driver, int i){
        t=new Thread(this,"text");
        this.element=element;
        this.i=i;
        this.driver=driver;
        t.run();
    }

    public void run() {
        Writeror.write("text",driver.findElement(By.className("wall_post")).getText(),i);
    }
}
