import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
    public static WebDriver getWebDriver() {
        String browser = System.getProperty("browser", "chrome");

        switch (browser) {
            case "yandex":
                // Указываем путь к chromedriver для Яндекс.Браузера
                System.setProperty("webdriver.chrome.driver", "src/main/resources/yandexdriver.exe");
                return new ChromeDriver();

            default:
                // Указываем путь к chromedriver для Google Chrome
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                return new ChromeDriver();
        }
    }
  }



