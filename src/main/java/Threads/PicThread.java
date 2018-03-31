package Threads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PicThread implements Runnable {
    Thread t;
    WebElement element;
    WebDriver driver;
    int i;
    public PicThread(WebElement element, WebDriver driver, int i){
        t=new Thread(this,"text");
        this.element=element;
        this.driver=driver;
        this.i=i;
        t.run();
    }

    public void run() {
        for (WebElement elem : element.findElements(By.className("image_cover"))) {
            String str = elem.getAttribute("style");
            Writeror.write("image", str, i);
        }
    }
}
