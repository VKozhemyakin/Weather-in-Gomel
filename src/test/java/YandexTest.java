import org.junit.jupiter.api.Test;
import tests.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static java.awt.SystemColor.text;

public class YandexTest extends TestBase {
    String weather = "Weather in Gomel";

    @Test
    public void searchWeather (){

        $x("//input[@id='text']").val("Weather in Gomel").pressEnter();
        $x("//div[@class='OrganicTitle-LinkText organic__url-text']").click();


        sleep(5000);


    }

}
