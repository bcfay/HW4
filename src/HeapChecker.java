import java.util.LinkedList;

public class HeapChecker {


    /**
     * Searches for a book with a matching title.
     * @param hOrig The title we're searching for.
     * @return True if a matching book is found.
     */
    boolean addEltTester(IHeap hOrig, int elt, IBinTree hAdded) {
      if(hAdded.validHeap()){ //check that hAdded is a heap
          if(listContAdd(hOrig, elt, hAdded)){ //check that hAdded contains the elements from hOrig and elt, and no additional elements
              return true;
          }
      }
    return false;
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

        Object added = elt;

        LinkedList origList = hOrig.getData();
        LinkedList testList = hAdded.getData();

        //time saving check that the added list is one element longer than the original list
        if((origList.size()+1)!=testList.size()){
            return false;
        }

        //checking that testList contains all elements in original list
        for (Object e : origList) {
            if (!testList.remove(e)) { //remove returns false if failed to find and remove element
                return false;
            }
        }

        //checking that testList contains the added element
        if(!testList.remove(added)){
            return false;
        }else if (testList.size()!=0) { //checking that testList contains no additional elements
            return false;
        }else{
            return true;
        }
    }

    boolean litsContains(IBinTree hAdded, IHeap hOrig){
        LinkedList origList = hOrig.getData();
        LinkedList testList = hAdded.getData();
        for (Object e : origList){
            if(!testList.remove(e)){
               return false;
            }
        }
        return true;
    }

    boolean listContRem(IHeap hOrig, IBinTree hRemoved){

        int hOrig.

        LinkedList origList = hOrig.getData();
        LinkedList testList = hRemoved.getData();

        for (Object e : origList) {
            if (!testList.remove(e)) {
                return false;
            }
        }
    }
}
