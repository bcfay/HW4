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




//    TestHeap2 Heap1 = new TestHeap2(6);
//    TestHeap2 Heap2 = new TestHeap2(9);
//    TestHeap2 Heap3 = new TestHeap2(14);
//    TestHeap2 Heap4 = new TestHeap2(12);
//    TestHeap2 Heap5 = new TestHeap2(19);
//    TestHeap2 Heap6 = new TestHeap2(22);
//    TestHeap2 Heap7 = new TestHeap2(32);
//    TestHeap2 Heap8 = new TestHeap2(5,Heap2,Heap3);
//    TestHeap2 Heap9 = new TestHeap2(22, Heap1, Heap2);

//    TestHeap3 Heap1 = new TestHeap3(6);
//    TestHeap3 Heap2 = new TestHeap3(9);
//    TestHeap3 Heap3 = new TestHeap3(14);
//    TestHeap3 Heap4 = new TestHeap3(12);
//    TestHeap3 Heap5 = new TestHeap3(19);
//    TestHeap3 Heap6 = new TestHeap3(22);
//    TestHeap3 Heap7 = new TestHeap3(32);
//    TestHeap3 Heap8 = new TestHeap3(5,Heap2,Heap3);
//    TestHeap3 Heap9 = new TestHeap3(22, Heap1, Heap2);

//    TestHeap4 Heap1 = new TestHeap4(6);
//    TestHeap4 Heap2 = new TestHeap4(9);
//    TestHeap4 Heap3 = new TestHeap4(14);
//    TestHeap4 Heap4 = new TestHeap4(12);
//    TestHeap4 Heap5 = new TestHeap4(19);
//    TestHeap4 Heap6 = new TestHeap4(22);
//    TestHeap4 Heap7 = new TestHeap4(42);
//    TestHeap4 Heap8 = new TestHeap4(5,Heap2,Heap4);
//    TestHeap4 Heap9 = new TestHeap4(22, Heap1, Heap2);



//    TestHeap5 Heap1 = new TestHeap5(6);
//    TestHeap5 Heap2 = new TestHeap5(9);
//    TestHeap5 Heap3 = new TestHeap5(15);
//    TestHeap5 Heap4 = new TestHeap5(12);
//    TestHeap5 Heap5 = new TestHeap5(19);
//    TestHeap5 Heap6 = new TestHeap5(22);
//    TestHeap5 Heap7 = new TestHeap5(52);
//    TestHeap5 Heap8 = new TestHeap5(5,Heap2,Heap5);
//    TestHeap5 Heap9 = new TestHeap5(22, Heap1, Heap2);



    /**
     * Tests 1-10 Tests the addEltTester method
     */

    //Tests for passes auto-test for valid heap

    //Tests for detects result that's not a heap

    //Tests for detects result where added elt occurs wrong number of times

    //Tests for detects result where other elts occur wrong number of times

    //Tests for detects result where total number of elements is incorrect

//    @Test
//    public void test1(){
//        assertTrue(HT.addEltTester(Heap1,5,Heap1.addElt(5)));
//
//    }
//    @Test
//    public void test2(){
//        assertTrue(HT.addEltTester(Heap1,9,Heap1.addElt(9)));
//
//    }
//    @Test
//    public void test3(){
//        assertTrue(HT.addEltTester(Heap3, 18, Heap3.addElt(18)));
//    }
//    @Test
//    public void test4(){
//        assertFalse(HT.addEltTester(Heap1,19,Heap1.addElt(7)));
//    }
//    @Test
//    public void test5(){
//        assertFalse(HT.addEltTester(Heap1,8,Heap1.addElt(12)));
//    }
//    @Test
//    public void test6(){
//        assertFalse(HT.addEltTester(Heap1,32,Heap1.addElt(24)));
//    }
//
//    @Test
//    public void test7(){
//        assertFalse(HT.addEltTester(Heap2,12,Heap1.addElt(13)));
//    }
//    @Test
//    public void test8(){
//        assertTrue(HT.addEltTester(Heap2,12,Heap1.addElt(12)));
//    }
//    @Test
//    public void test9(){
//        assertTrue(HT.addEltTester(Heap7,34,Heap7.addElt(34)));
//    }
//    @Test
//    public void test10(){
//        assertTrue(HT.addEltTester(Heap5,21,Heap6.addElt(21)));
//    }
//    @Test
//    public void test28(){
//        assertTrue(HT.addEltTester(Heap8,26,Heap8.addElt(26)));
//    }
//    @Test
//    public void test31(){
//        assertTrue(HT.addEltTester(Heap9,23,Heap9.addElt(29)));
//    }

    /**
     * Tests 11-20 Tests the remMinEltTester method
     */
    //Tests for passes auto-test for valid heap
    @Test
    public void testRem1(){
        assertTrue(HT.remMinEltTester(Heap8, Heap10));
    }
    //Tests for detects result that's not a heap

    //Tests for detects result where removed elt occurs wrong number of times

    //Tests for detects result where other elts occur wrong number of times

    //Tests for detects result where total number of elements is incorrect

//    @Test
//    public void test11(){
//        assertTrue(HT.remMinEltTester(Heap1,Heap1.remMinElt()));
//    }
//    @Test
//    public void test12(){
//        assertTrue(HT.remMinEltTester(Heap2,Heap2.remMinElt()));
//    }
//    @Test
//    public void test13(){
//        assertFalse(HT.remMinEltTester(Heap1,Heap5.remMinElt()));
//    }
//    @Test
//    public void test14(){
//        assertFalse(HT.remMinEltTester(Heap2,Heap1.remMinElt()));
//    }
//    @Test
//    public void test15(){
//        assertTrue(HT.remMinEltTester(Heap7,Heap7.remMinElt()));
//    }
//    @Test
//    public void test16(){
//        assertTrue(HT.remMinEltTester(Heap7,Heap7.remMinElt()));
//    }
//    @Test
//    public void test17(){
//        assertFalse(HT.remMinEltTester(Heap3,Heap2.remMinElt()));
//    }
//    @Test
//    public void test18(){
//        assertFalse(HT.remMinEltTester(Heap4,Heap1.remMinElt()));
//    }
//    @Test
//    public void test19(){
//        assertTrue(HT.remMinEltTester(Heap6,Heap6.remMinElt()));
//    }
//    @Test
//    public void test20(){
//        assertTrue(HT.remMinEltTester(Heap5,Heap5.remMinElt()));
//    }
//    @Test
//    public void test27(){
//        assertTrue(HT.remMinEltTester(Heap8,Heap8.remMinElt()));
//    }
//
//
//    /**
//     * Tests 21+ Tests all other helper methods
//     */
//    @Test
//    public void test21(){
//        assertTrue(Heap1.validHeap());
//
//    }
//    @Test
//    public void test22(){
//        assertTrue(Heap7.validHeap());
//
//    }
//    @Test
//    public void test23(){
//        assertTrue(Heap2.validHeap());
//
//    }
//    @Test
//    public void test24(){
//        assertEquals(Heap1.getData(),Heap1.data);
//    }
//
//    @Test
//    public void test25(){
//        assertEquals(Heap6.getData(),Heap6.data);
//    }
//    @Test
//    public void test26(){
//        assertEquals(Heap3.getData(),Heap3.data);
//    }
//    @Test
//    public void test29(){
//        assertEquals(Heap9.getData(),Heap9.data);
//    }
//    @Test
//    public void test30(){
//        assertFalse(Heap9.validHeap());
//    }
//    //hasLessThan() Tests
//    @Test
//    public void test32(){
//        assertFalse(Heap9.hasLessThan(5));
//    }
//    @Test
//    public void test33(){
//        assertTrue(Heap9.hasLessThan(100));
//    }

}
