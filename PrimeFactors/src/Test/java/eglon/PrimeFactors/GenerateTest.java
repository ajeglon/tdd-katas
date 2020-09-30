package eglon.PrimeFactors;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateTest {

    @Test
    public void ShouldReturnNothing() {
        assertEquals(Collections.emptyList(), new Generate().generate(1));
    }

    @Test
    void ShouldReturnTwo() {
        assertIterableEquals(Arrays.asList(2), new Generate().generate(2));
    }




}