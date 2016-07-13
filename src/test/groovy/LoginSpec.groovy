import geb.Page
import geb.spock.GebSpec

import io.github.bonigarcia.wdm.ChromeDriverManager
import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver



class LoginSpec extends GebSpec {

    def "can get to the current Manifest Home Page"() {
        when:
        println ''
        then:

        to LoginPage
    }

}