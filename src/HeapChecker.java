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
        if(hRemoved.validHeap()){ //check that hAdded is a heap
            if(listContRem(hOrig, hRemoved)){ //check that hAdded contains the elements from hOrig and elt, and no additional elements
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
    boolean listContAdd(IHeap hOrig, int elt, IBinTree hAdded){

        Object added = elt;

        LinkedList origList = hOrig.getAllData();
        LinkedList testList = hAdded.getAllData();

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



    /**
     * Searches for a book with a matching title.
     * @param hOrig The title we're searching for.
     * @return True if a matching book is found.
     */
    boolean listContRem(IHeap hOrig, IBinTree hRemoved){

        Object min = hOrig.getData();// gets minimum from original heap (the data contained in the top node as this is a valid heap)

        LinkedList origList = hOrig.getAllData();
        LinkedList testList = hRemoved.getAllData();

        for (Object e : testList) {
            if (!origList.remove(e)) {
                return false;
            }
        }
        if(min == origList.getFirst()){
            return true;
        }
        return false;
    }
}
