import org.junit.jupiter.api.Test;
import tests.TestBase;

import static com.codeborne.selenide.Selenide.*;

public class YandexTest extends TestBase {
    @Test
    public void searchWeather (){

        $x("//input[@id='text']").val("Weather in Gomel").pressEnter();
        $x("//div[@class='OrganicTitle-LinkText organic__url-text']").click();

        sleep(5000);


    }

}
