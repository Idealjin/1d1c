package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split(){
        String[] divide = "1,2".split(",");
        String[] divide2 = "1".split(",");
        assertThat(divide).contains("1");
        assertThat(divide).contains("2");

        assertThat(divide2).containsExactly("1");
    }

    @Test
    void substring(){
        String subStr = "(1,2)".substring(1,4);
        assertThat(subStr).isEqualTo("1,2");
    }

    @DisplayName("charAt테스트")
    @Test
    void charAt(){
        char chaAt = "abc".charAt(1);
        assertThat(chaAt).isEqualTo('b');
    }

    @DisplayName("인덱스벗어났을떄 오류 발생")
    @Test
    void CahrAtException(){

        assertThatThrownBy(() -> {
            char chaAt = "ab".charAt(2);
            assertThat(chaAt).isEqualTo('a');
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("index: 2, Size: 2");
    }

}
