import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCounterTest {
    ArrayCounter arr;
    @BeforeEach
    void init(){
        arr=new ArrayCounter(3,4,5,3,2,2);
    }
    @Test
    void TestConstructorAndMax(){
        assertEquals(5,arr.getMax());
        arr=new ArrayCounter(7);
        assertEquals(7,arr.getMax());
    }
    @Test
    void makeArrCounter(){
        int[]counter=arr.arrCounter();
        assertEquals(2,counter[3]);
        assertEquals(1,counter[5]);
    }
    @Test
    void readTheCounter(){
        String expected=
                "num 0 called 0 time(s)"+"\n"+
                "num 1 called 0 time(s)"+"\n"+
                "num 2 called 2 time(s)"+"\n"+
                "num 3 called 2 time(s)"+"\n"+
                "num 4 called 1 time(s)"+"\n"+
                "num 5 called 1 time(s)"+"\n";
        assertEquals(expected,Main.readCounter(arr.arrCounter()));
    }
}