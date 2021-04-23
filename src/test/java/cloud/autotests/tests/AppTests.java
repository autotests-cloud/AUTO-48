package cloud.autotests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class AppTests extends TestBase {
    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("test on selenide.org")
    void generatedTest() {
        step("i go to https://selenide.org", () -> {
            // todo
        });

        step("i do nothing", () -> {
            // todo
        });

        step("robots do", () -> {
            // todo
        });
    }

    @Test
    @Description("Autogenerated, because test steps contain text 'http...' and the page has 'title' tag")
    @DisplayName("Page title test")
    void titleTest() {
        step("Open url 'https://selenide.org'", () ->
            open("https://selenide.org"));

        step("Checking that page title is 'Selenide: concise UI tests in Java'", () -> {
            String expectedTitle = "Selenide: concise UI tests in Java";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }
}