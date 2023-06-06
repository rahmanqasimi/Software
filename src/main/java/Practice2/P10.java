package Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;
import utils.Constants;
import utils.ExcelReader;

import java.io.IOException;
import java.util.Map;

public class P10 {
    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22%22");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.cssSelector("#txtUsername"));
        String userName= ConfigReader.getProperty("userName");
        username.sendKeys(userName);
        WebElement passwordField = driver.findElement(By.cssSelector("#txtPassword"));
        String password=ConfigReader.getProperty("password");
        passwordField.sendKeys(password);

        WebElement login = driver.findElement(By.cssSelector(".button"));
        login.click();

        var excel = ExcelReader.read("Sheet1", Constants.EXCEL_FILE_PATH);
        for (Map<String,String> map:excel){
            driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='menu_pim_addEmployee']")).click();
            Thread.sleep(1000);
            String firstName = map.get("FirstName");
            String lastName = map.get("LastName");
            String middleName = map.get("MiddleName");

            driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys(firstName);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='middleName']")).sendKeys(lastName);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys(middleName);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='btnSave']")).click();
            Thread.sleep(1000);
        }
        driver.close();


    }
}
