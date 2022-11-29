import basesettings.TestBase;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class StackOverFlowTest extends TestBase {
    @BeforeEach
    void setUp(){
        open("https://stackoverflow.com/");
    }


 @ValueSource(strings = {
         "About",
         "Products",
         "For Teams"

 })

@ParameterizedTest(name = "Find URL stackOverFlow {0}")
    @Tags({@Tag("Mainor"),@Tag("REGRES")})
    void findElenments(String searchElementsStackOverFlow){
        startScreen.checkWords(searchElementsStackOverFlow);
}

@Disabled
    @CsvFileSource(
            resources = "startscreen.csv"
    )
void findPages(String search){
    $("#search").setValue(search).pressEnter();
}


static Stream<Arguments> searchElementsButton(){
        return Stream.of(
                Arguments.of("About"),
                Arguments.of("Products"),
                Arguments.of("For Teams")
        );
}

@MethodSource
    @ParameterizedTest(name="Search button on page {0} find URL stackOverFlow {0}")
    @Tags({@Tag("Critical"),@Tag("Smoke")})
    void searchElementsButton(List<String> elemets){
        expectetResultWords.findElementsOnPage(elemets);
}



}
