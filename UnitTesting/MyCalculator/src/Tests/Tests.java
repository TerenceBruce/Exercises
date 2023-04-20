import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    @org.junit.jupiter.api.Test
    void TwoPlusTwoShouldEqualFour(){
        var cal = new Calculator();
        assertEquals(4,cal.add(2,2));
    }
    @org.junit.jupiter.api.Test
    void TwoPlusThreeShouldEqualFour(){
        var cal = new Calculator();
        assertEquals(5,cal.add(2,3));
    }
}
