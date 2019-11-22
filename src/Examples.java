import org.junit.Test;
import static org.junit.Assert.*;



 public class Examples {

    public Examples(){}

    HeapChecker HT = new HeapChecker();
    TestHeap Heap6 = new TestHeap(22,null,null);
    TestHeap Heap7 = new TestHeap(32,null,null);
    TestHeap Heap4 = new TestHeap(12,null,null);
    TestHeap Heap5 = new TestHeap(19,null,Heap7);
    TestHeap Heap2 = new TestHeap(9,Heap4,null);
    TestHeap Heap3 = new TestHeap(14,Heap5, Heap6);
    TestHeap Heap1 = new TestHeap(6,Heap2,Heap3);


    TestHeap Heap8 = new TestHeap(5,Heap2,Heap3);
    TestHeap Heap9 = new TestHeap(22,null,null);



    /**
     * Tests 1-10 Tests the addEltTester method
     */

    @Test
    public void test1(){

        assertTrue(HT.addEltTester(Heap1,5,Heap1.addElt(5)));

    }
    @Test
    public void test2(){

        assertTrue(HT.addEltTester(Heap1,9,Heap1.addElt(9)));

    }

    @Test
    public void test3(){
        assertTrue(HT.addEltTester(Heap3, 18, Heap3.addElt(18)));
    }

    @Test
    public void test4(){
        assertFalse(HT.addEltTester(Heap1,19,Heap1.addElt(7)));
    }
    @Test
    public void test5(){
        assertFalse(HT.addEltTester(Heap1,8,Heap1.addElt(12)));
    }
    @Test
    public void test6(){
        assertFalse(HT.addEltTester(Heap1,32,Heap1.addElt(24)));
    }

    @Test
    public void test7(){
        assertFalse(HT.addEltTester(Heap2,12,Heap1.addElt(13)));
    }
    @Test
    public void test8(){
        assertTrue(HT.addEltTester(Heap2,12,Heap1.addElt(12)));
    }
    @Test
    public void test9(){
        assertTrue(HT.addEltTester(Heap7,34,Heap7.addElt(34)));
    }
    @Test
    public void test10(){
        assertTrue(HT.addEltTester(Heap5,21,Heap6.addElt(21)));
    }
     @Test
     public void test28(){
         assertTrue(HT.addEltTester(Heap8,26,Heap8.addElt(26)));
     }
     @Test
     public void test31(){
        assertTrue(HT.addEltTester(Heap9,23,Heap9.addElt(29)));
     }

    /**
     * Tests 11-20 Tests the remMinEltTester method
     */

   @Test
    public void test11(){
        assertTrue(HT.remMinEltTester(Heap1,Heap1.remMinElt()));
    }
    @Test
    public void test12(){
        assertTrue(HT.remMinEltTester(Heap2,Heap2.remMinElt()));
    }
    @Test
    public void test13(){
        assertFalse(HT.remMinEltTester(Heap1,Heap5.remMinElt()));
    }
    @Test
    public void test14(){
        assertFalse(HT.remMinEltTester(Heap2,Heap1.remMinElt()));
    }
    @Test
    public void test15(){
        assertTrue(HT.remMinEltTester(Heap7,Heap7.remMinElt()));
    }
    @Test
    public void test16(){
        assertTrue(HT.remMinEltTester(Heap7,Heap7.remMinElt()));
    }
     @Test
     public void test17(){
         assertFalse(HT.remMinEltTester(Heap3,Heap2.remMinElt()));
     }
     @Test
     public void test18(){
         assertFalse(HT.remMinEltTester(Heap4,Heap1.remMinElt()));
     }
     @Test
     public void test19(){
         assertTrue(HT.remMinEltTester(Heap6,Heap6.remMinElt()));
     }
     @Test
     public void test20(){
         assertTrue(HT.remMinEltTester(Heap5,Heap5.remMinElt()));
     }
     @Test
     public void test27(){
         assertTrue(HT.remMinEltTester(Heap8,Heap8.remMinElt()));
     }


     /**
      * Tests 21+ Tests all other helper methods
      */
    @Test
     public void test21(){
        assertTrue(Heap1.validHeap());

     }
     @Test
     public void test22(){
         assertFalse(Heap7.validHeap());

     }
     @Test
     public void test23(){
         assertTrue(Heap2.validHeap());

     }
     @Test
     public void test24(){
        assertEquals(Heap1.getData(),Heap1.data);
     }

     @Test
     public void test25(){
         assertEquals(Heap6.getData(),Heap6.data);
     }
     @Test
     public void test26(){
         assertEquals(Heap3.getData(),Heap3.data);
     }
     @Test
     public void test29(){
        assertEquals(Heap9.getData(),Heap9.data);
     }
     @Test
     public void test30(){
        assertFalse(Heap9.validHeap());
     }




}
