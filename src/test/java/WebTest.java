import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest {

    public static void main(String[] args) {

        WebDriver auto = new ChromeDriver();
//        auto.get("https://ibs.ru/");
//        auto.findElement(By.className("header-search")).click();
        auto.get("https://ibs.ru/contacts/");
//        auto.findElement(By.xpath("//div[@class='header-link']//a[@class='/contacts/']")).click();
        auto.findElement(By.id("bx_651765591_2403")).click();
    }
}
