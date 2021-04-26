import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class YandexTest {
    @Test
    public void searchWeather (){

        Configuration.startMaximized = true;
        open("https://yandex.by/");

        $x("//input[@id='text']").val("Weather in Gomel").pressEnter();
        $x("//div[@class='OrganicTitle-LinkText organic__url-text']").click();

        sleep(5000);


    }

}
