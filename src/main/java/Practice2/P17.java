package Practice2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P17 {
    public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.google.com");
            try{
                driver.findElement(By.xpath("Hello"));

            }finally {
                driver.close();
            }


/*        Thread.sleep(2000);
        driver.close();*/




    }
}
