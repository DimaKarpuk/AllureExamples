package test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class HhTest extends TestBase {
    @Test
    void hhSearchTest() {
        step("Открываем главную страницу hh",() ->{
            open();
        });
        step("Проверяем что мы находимся на главной странице по заголовку", () ->{
            $(".bloko-header-promo-3").shouldHave(text("Работа найдётся для каждого"));
        });
        step("Вводим в поле для поиска вакансии AQA", () ->{
            $("#a11y-search-input").setValue("AQA").pressEnter();
        });
        step("Закраваем модальное окно", () -> {
            $(".bloko-modal-close-button").click();
        });
        step("Проверяем результат поиска", () -> {
            $(".vacancysearch-xs-header").shouldBe(visible);
        });
    }
}
