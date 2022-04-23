import org.junit.Test;

import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testDivideEven() {
        MyClass tester = new MyClass();
        assertEquals("yes",tester.divide(8));
    }
    @Test
    public void testDivideOdd(){
        MyClass tester = new MyClass();
        assertEquals("no",tester.divide(1));
    }
    @Test
    public void testDivideOddOutOfBound(){
        MyClass tester = new MyClass();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    tester.divide(101);
                }
                );
    }
    @Test
    public void testDividenegative(){
        MyClass tester = new MyClass();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    tester.divide(-2);
                }
        );
    }
}