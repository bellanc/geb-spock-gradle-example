import io.github.bonigarcia.wdm.ChromeDriverManager
import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver

ChromeDriverManager.getInstance().setup()
driver = { new ChromeDriver() }
