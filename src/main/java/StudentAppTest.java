import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StudentAppTest {
    @Test
    public void openStudentApp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://acodemystudentapp-env.eba-d2vctp4d.eu-north-1.elasticbeanstalk.com/%22");

                driver.close();
        driver.quit();
    }
}
