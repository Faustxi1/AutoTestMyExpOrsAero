import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;

public class NewTestOrsAero {
    @Test
    void TestOrsAero() {
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 10000;
        //Открываю страницу
        open("https://ors.aero/");
        // перехожу на вкладку продукты
        $("nav.t228__centercontainer").$$("ul li").get(1).click();
        // проверка перехода
        $("div.t902__bottommargin").shouldHave(Condition.text("ЦЕНТРОВКА ВС"));
        //перехожу в подробнее в CRS
        $("[id=cardbtn7_554000463]").click();
        // проверка перехода
        $("div.tn-elem__5707840821680174698429").shouldHave(Condition.text("интерфейс к системам резервирования"));
    }
}
