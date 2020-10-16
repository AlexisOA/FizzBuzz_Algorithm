package fizzbuzz;
import static java.lang.String.valueOf;
public class FizzBuzz {
    public String of(int num){
        return (is(num).multipleOf(15)) ? "FizzBuzz" : (is(num).multipleOf(3)) ? "Fizz" : (is(num).multipleOf(5)) ? "Buzz" : valueOf(num);
    }
    public EvaluateLamba is(int num){
        return eval -> num % eval == 0;
    }

    public interface EvaluateLamba{
        boolean multipleOf(int eval);
    }
}
