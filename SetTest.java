package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SetTest {
        private Set<Integer> numbers;

        @BeforeEach
        void setUp() {
            numbers = new HashSet<>();
            numbers.add(1);
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
        }

        // Test Case 구현
        @Test
        void setSize가_3인지_확인(){
            int size = numbers.size();
            assertThat(numbers.size() == 3).isTrue();
        }

        @ParameterizedTest
        @ValueSource(ints = {1, 2, 3})
        void set값_확인(int number){
            assertTrue(numbers.contains(number));
        }

        @ParameterizedTest
        @CsvSource(value={"1,True", "2,True", "3,True","4,false","5,false"})
        void set값_확인2(int input, boolean isTrue){
        boolean tempValue = false;
            if(numbers.contains(input)) tempValue = true;
            assertEquals(isTrue, tempValue);
        }






}
