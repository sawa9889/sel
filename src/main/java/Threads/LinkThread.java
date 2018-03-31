package Threads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkThread implements Runnable {
    Thread t;
    WebElement element;
    WebDriver driver;
    int i;
    public LinkThread(WebElement element, WebDriver driver, int i){
        t=new Thread(this,"link");
        this.element=element;
        this.driver=driver;
        this.i=i;
        t.run();
    }

    public void run() {
        Writeror.write("link",driver.findElement(By.className("wall_post")).getText(),i);
    }
}
