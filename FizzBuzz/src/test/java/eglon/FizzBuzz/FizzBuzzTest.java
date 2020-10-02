package eglon.FizzBuzz;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void ShouldReturnFizz() {
        assertEquals("fizz", new FizzBuzz().FizzyBuzzy(101));
    }


    }
