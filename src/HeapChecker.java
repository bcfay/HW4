import java.util.LinkedList;

public class HeapChecker {


    /**
     * Checks whether an IBinTree represents a correctly added element to a given IHeap, and is a heap
     * @param hOrig Original heap
     * @param elt Element added to hOring
     * @param hAdded IBinTree being checked
     * @return Whether or not hAdded passes the test
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
     * Checks whether an IBinTree represents the original heap with the minimum element removed, and is a heap
     * @param hOrig Original heap
     * @param hRemoved IBinTree being checked
     * @return Whether or not hRemoved passes the test
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
     * Checks if the data contained within the modified heap contains only the data within the original
     * @param hOrig the original heap
     * @param elt the element added to the original heap
     * @param hAdded IBinTree being checked
     * @return Whether or not hRemoved passes the test
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
     * Checks if the data contained within the modified heap contains only the data within the original minus the minimum value
     * @param hOrig the original heap
     * @param hRemoved IBinTree being checked
     * @return Whether or not hRemoved passes the test
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
        if(origList.size()>0) {
            if (min == origList.getFirst()) {
                return true;
            }
        }
        return false;
    }
}
