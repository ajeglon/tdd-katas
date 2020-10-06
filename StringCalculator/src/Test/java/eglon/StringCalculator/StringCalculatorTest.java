package eglon.StringCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    @Test
    public void shouldReturnZero(){
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void singleNumberReturnsValue(){
        assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void shouldReturnTwo(){
        assertEquals(2, StringCalculator.add("2"));
    }

    @Test
    public void shouldReturn8(){
        assertEquals(8, StringCalculator.add("8"));
    }

    @Test
    public void onePlusTwoEquals3(){
        assertEquals(3, StringCalculator.add("1,2"));
    }

    @Test
    public void addingTwoNumbers(){
        assertEquals(91, StringCalculator.add("40,51"));
    }

    @Test
    public void newlineDelimitedReturnsSum(){
        assertEquals(3, StringCalculator.add("1\n2"));
    }

    @Test
    public void newLineAddsTwoNumbers(){
        assertEquals(70, StringCalculator.add("20\n50"));
    }

    @Test
    public void newLineAddsLargeNumber(){
        assertEquals(2500, StringCalculator.add("1000\n1500"));
    }

    @Test
    public void delimitedEitherWayAdds(){
        assertEquals(10, StringCalculator.add("1\n2,3\n4"));
    }
}



