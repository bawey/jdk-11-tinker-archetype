package $package;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;


public class AppTest {
    @ParameterizedTest
    @MethodSource("provideEasyCases")
    public void shouldAnswerWithTrue(String expected, String inputOne, String inputTwo) {
        assertThat(inputOne.replaceAll(inputTwo, "_")).isEqualTo(expected);
    }

    static Stream<Arguments> provideEasyCases() {
        return Stream.of(Arguments.of("foobar42", "foobar42", "zen"), Arguments.of("f_b_42", "fooboo42", "oo"));
    }
}
