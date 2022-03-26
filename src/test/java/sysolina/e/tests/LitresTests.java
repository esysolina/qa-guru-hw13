package sysolina.e.tests;

import com.codeborne.selenide.Condition;
import sysolina.e.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class LitresTests extends TestBase {
    @Test
    @Description("Тест поисковой строки")
    @DisplayName("Успешный поиск автора")
    void generatedTest() {
        step("Открыть 'https://www.litres.ru/'", () ->
                open("https://www.litres.ru/"));

        step("Ввести в поисковую строку 'Акунин'", () -> {
            $(".Search-module__input").setValue("Акунин");
        });

        step("Сделать элемент видимым", () -> {
            $(".Search-module__input").shouldBe(visible);
        });

        step("Нажать кнопку поиска", () -> {
            $(".Search-module__button").click();
        });

        step("Проверить наличие в выдаче 'Акунин'", () -> {
            $(".search__found").shouldHave(Condition.text("Акунин"));
        });
    }

    @Test
    @Description("Тест заголовка")
    @DisplayName("Проверка заголовка на содержание текста")
    void titleTest() {
        step("Открыть 'https://www.litres.ru/'", () ->
                open("https://www.litres.ru/"));

        step("Заголовок страницы должен содержать текст 'ЛитРес – библиотека электронных книг, скачать в fb2 или читать онлайн на LitRes'", () -> {
            String expectedTitle = "ЛитРес – библиотека электронных книг, скачать в fb2 или читать онлайн на LitRes";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Тест на ошибки в консоли")
    @DisplayName("В логах страницы не должно быть ошибок")
    void consoleShouldNotHaveErrorsTest() {
        step("Открыть 'https://www.litres.ru/'", () ->
                open("https://www.litres.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }

    @Test
    @Description("Тест выдачи жанров в поиске")
    @DisplayName("Проверка жанра в выдаче")
    void genreTest(String testData, String expectedResult) {
        step("Открыть 'https://www.litres.ru/'", () ->
                open("https://www.litres.ru/"));

        step("Ввести в поисковую строку 'Цвейг'", () -> {
            $(".Search-module__input").setValue("Цвейг");
        });

        step("Нажать кнопку поиска", () -> {
            $(".Search-module__button").click();
        });

        step("Проверить наличие в выдаче жанра", () -> {
            $(".rmd-genre-href").shouldHave(Condition.text("зарубежная классика"));
        });
    }

    @Test
    @Description("Тест выдачи авторов по названию в поиске")
    @DisplayName("Проверка автора по названию произведения")
    void nameTest(String testsData, String expectedResults) {
        step("Открыть 'https://www.litres.ru/'", () ->
                open("https://www.litres.ru/"));

        step("Ввести в поисковую строку 'Сто лет одиночества'", () -> {
            $(".Search-module__input").setValue("Сто лет одиночества");
        });

        step("Нажать кнопку поиска", () -> {
            $(".Search-module__button").click();
        });

        step("Проверить в выдаче наличие автора 'Маркес'", () -> {
            $(".art-item__author_label").shouldHave(Condition.text("Габриэль Гарсиа Маркес"));
        });
    }
}
