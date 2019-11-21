import org.junit.Test;
import static org.junit.Assert.*;



class Examples {

    Examples(){}

    HeapChecker HT = new HeapChecker();
    TestHeap Heap6 = new TestHeap(22,null,null);
    TestHeap Heap7 = new TestHeap(32,null,null);
    TestHeap Heap4 = new TestHeap(12,null,null);
    TestHeap Heap5 = new TestHeap(19,null,Heap7);
    TestHeap Heap2 = new TestHeap(9,Heap4,null);
    TestHeap Heap3 = new TestHeap(14,Heap5, Heap6);
    TestHeap Heap1 = new TestHeap(6,Heap2,Heap3);




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
}
