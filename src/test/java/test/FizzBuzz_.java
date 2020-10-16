package test;
import fizzbuzz.FizzBuzz;
import org.junit.*;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzz_ {
    private FizzBuzz fizzbuzz;

    @Before
    public void setUp(){
        fizzbuzz = new FizzBuzz();
    }

    @Test
    public void should_return_num_if_not_is_3_or_5_multiple(){
        assertThat(fizzbuzz.of(1)).isEqualTo("1");
        assertThat(fizzbuzz.of(4)).isEqualTo("4");
    }

    @Test
    public void should_return_fizz_if_receive_3_or_multiple(){
        assertThat(fizzbuzz.of(3)).isEqualTo("Fizz");
        assertThat(fizzbuzz.of(9)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_buzz_if_receive_5_or_multiple(){
        assertThat(fizzbuzz.of(5)).isEqualTo("Buzz");
        assertThat(fizzbuzz.of(20)).isEqualTo("Buzz");
    }
    @Test
    public void should_return_fizzbuzz_if_receive_15_or_multiple(){
        assertThat(fizzbuzz.of(15)).isEqualTo("FizzBuzz");
        assertThat(fizzbuzz.of(45)).isEqualTo("FizzBuzz");
    }


}


