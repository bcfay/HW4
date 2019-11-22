import org.junit.Test;
import static org.junit.Assert.*;



public class Examples {

    public Examples(){}

    HeapChecker HT = new HeapChecker();

    TestHeap Heap1 = new TestHeap(6);
    TestHeap Heap2 = new TestHeap(9);
    TestHeap Heap3 = new TestHeap(14);
    TestHeap Heap4 = new TestHeap(12);
    TestHeap Heap5 = new TestHeap(19);
    TestHeap Heap6 = new TestHeap(22);
    TestHeap Heap7 = new TestHeap(32);
    TestHeap Heap8 = new TestHeap(5,Heap2,Heap3); //Valid Heap
    TestHeap Heap9 = new TestHeap(22, Heap1, Heap2); //Invalid Heap
    TestHeap Heap10 = new TestHeap(9, Heap3, new MtHeap());
    TestHeap Heap11 = new TestHeap(6,Heap1,Heap2);
    TestHeap Heap12 = new TestHeap(6, new MtHeap(),Heap2);
    TestHeap Heap13 = new TestHeap(6,Heap2,Heap3);
    TestHeap Heap14 = new TestHeap(6,Heap9,Heap8);
    TestHeap Heap15 = new TestHeap(25,Heap9,Heap8);
    TestHeap Heap16 = new TestHeap(34,Heap15,Heap3);
    TestHeap Heap17 = new TestHeap(5);
    TestHeap Heap18 = new TestHeap(18);


    TestHeap Test1 = new TestHeap(6,Heap17,new MtHeap());
    TestHeap Test2 = new TestHeap(6,Heap1,new MtHeap());
    TestHeap Test3 = new TestHeap(14,Heap18,new MtHeap());
    TestHeap Test4 = new TestHeap(6,Heap4,new MtHeap());
    TestHeap Test5 = new TestHeap(6,Heap2,Heap3);
    TestHeap Test6 = new TestHeap()

    /**
     * Tests 1-10 Tests the addEltTester method
     */


    //tests the general method
    @Test
    public void test1(){
        assertTrue(HT.addEltTester(Heap1,5,Test1));

    }
    //tests the general method
    @Test
    public void test2(){
        assertTrue(HT.addEltTester(Heap1,9,Test2));

    }
    //tests the general method
    @Test
    public void test3(){
        assertTrue(HT.addEltTester(Heap3, 18, Test3));
    }
    //tests the general method
    @Test
    public void test4(){
        assertFalse(HT.addEltTester(Heap1,19,Test4));
    }
    //tests when the method adds too many items to the heap

    @Test
    public void test5(){
        assertFalse(HT.addEltTester(Heap1,9,Test5));
    }
    //tests adding an element to an empty heap
    @Test
    public void test6(){
        assertTrue(HT.addEltTester(new MtHeap(),5,Heap12));
    }




    /**
     * testRem1-6 Tests the remMinEltTester method
     */

    //Tests for passes auto-test for valid heap
    @Test
    public void testRem1(){
        assertTrue(HT.remMinEltTester(Heap8, Heap10));
    }
    //Tests for detects result that's not a heap

    @Test
    public void testRem2(){
        assertFalse(HT.remMinEltTester(Heap8, Heap9));
    }
    //Tests for detects result where removed elt occurs wrong number of times
    @Test
    public void testRem3(){
        assertFalse(HT.remMinEltTester(Heap11, Heap1));
    }
    @Test
    public void testRem4(){
        assertTrue(HT.remMinEltTester(Heap11, Heap12));
    }
    //Tests for detects result where other elts occur wrong number of times
    @Test
    public void testRem5(){
        assertFalse(HT.remMinEltTester(Heap8, Heap13));
    }
    //Tests for detects result where total number of elements is incorrect
    @Test
    public void testRem6(){
        assertFalse(HT.remMinEltTester(Heap8, Heap14));
    }
    //Other
    @Test
    public void testRem7(){
        assertTrue(HT.remMinEltTester(Heap1, new MtHeap()));
    }


    //Other tests

    //validHeap() tests
    @Test
    public void test30(){
        assertFalse(Heap9.validHeap());
    }

    //hasLessThan() Tests
    @Test
    public void test32(){
        assertFalse(Heap9.hasLessThan(5));
    }
    @Test
    public void test33(){
        assertTrue(Heap9.hasLessThan(100));
    }

}
