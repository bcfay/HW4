import java.util.LinkedList;

public class HeapChecker {


    /**
     * Searches for a book with a matching title.
     * @param hOrig The title we're searching for.
     * @return True if a matching book is found.
     */
    boolean addEltTester(IHeap hOrig, int elt, IBinTree hAdded) {
//      if(hAdded){
//
//      }

//    ...code to compare hOrig and hAdded around the addition of elt as appropriate...
    return true;
    }


    /**
     * Searches for a book with a matching title.
     * @param hOrig The title we're searching for.
     * @return True if a matching book is found.
     */
    boolean remMinEltTester(IHeap hOrig, IBinTree hRemoved) {

//    ...code to compare hOrig and hRemoved as appropriate...
        return false;
    }

    boolean listContAdd(IHeap hOrig, int elt, IBinTree hAdded){
        if (litsContains(hAdded, hOrig)){
            return hAdded.getData().remove((Object)elt);
        }
        return false;
    }

    boolean litsContains(IBinTree hAdded, IHeap hOrig){
        LinkedList origList = hOrig.getData();
        LinkedList testList = hAdded.getData();
        for (Object e : origList){
            if(!testList.contains(e)){
               return false;
            }
        }
        return true;

    }

}
