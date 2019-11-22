import java.lang.Math;
import java.util.LinkedList;

interface IBinTree {
    // determines whether element is in the tree
    boolean hasElt(int e);
    // returns number of nodes in the tree; counts duplicate elements as separate items
    int size();
    // returns depth of longest branch in the tree
    int height();

    /**
     * gets the data held in the IBinTree
     * @return the data held in the IBinTree
     */
    int getData();

    /**
     * checks whether the IBinTree is a valid heap
     * @return whether the IBinTree is a valid heap
     */
    boolean validHeap();


    /**
     * Checks if the tree has a value less than a given int
     * @param min the value checked against
     * @return whether the tree passed the test
     */
    //checks whether the IBinTree contains an element less than a given value
    boolean hasLessThan(int min);

    /**
     * gets all data contained in a heap
     * @param dataList the linked list to add to
     * @return the linked list with all of the data added to it
     */
    LinkedList<Integer> getAllData(LinkedList dataList);


    /**
     * gets all data contained in a heap
     * @return the linked list with all of the data added to it
     */
    LinkedList<Integer> getAllData();
}

class MtBT implements IBinTree {
    MtBT(){}

    // returns false since empty tree has no elements
    public boolean hasElt(int e) {
        return false;
    }

    // returns 0 since enpty tree has no elements
    public int size() {
        return 0;
    }

    // returns 0 since empty tree has no branches
    public int height() {
        return 0;
    }

    /**
     * gets the data held in the MtBT
     * @return 0 for an empty tree
     */
    @Override
    public int getData() {
        return 0;
    }


    /**
     * checks whether the MtBT is a valid heap
     * @return true as an empty tree is always a valid heap
     */
    @Override
    //an empty IBinTree is a valid heap
    public boolean validHeap() {
        return true;
    }


    /**
     * Checks if the tree has a value less than a given int
     * @param min the value checked against
     * @return 0 as an empty IBinTree will not contain a number less than any number
     */
    @Override
    public boolean hasLessThan(int min) {
        return false;
    }


    /**
     * gets all data contained in a heap
     * @param dataList the linked list to add to
     * @return dataList as the empty heap has no data
     */
    @Override
    public LinkedList<Integer> getAllData(LinkedList dataList) {
        return dataList;
    }


    /**
     * gets all data contained in a heap
     * @return an empty linked list as the empty heap has no data
     */
    @Override
    public LinkedList<Integer> getAllData() {
        return new LinkedList();
    }
}

class DataBT implements IBinTree {
    int data;
    IBinTree left;
    IBinTree right;

    DataBT(int data, IBinTree left, IBinTree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    // an alternate constructor for when both subtrees are empty
    DataBT(int data) {
        this.data = data;
        this.left = new MtBT();
        this.right = new MtBT();
    }

    // determines whether this node or node in subtree has given element
    public boolean hasElt(int e) {
        return this.data == e || this.left.hasElt(e) || this.right.hasElt(e) ;
    }

    // adds 1 to the number of nodes in the left and right subtrees
    public int size() {
        return 1 + this.left.size() + this.right.size();
    }

    // adds 1 to the height of the taller subtree
    public int height() {
        return 1 + Math.max(this.left.height(), this.right.height());
    }

    /**
     * gets the data held in the DataBT
     * @return the tree's data
     */
    @Override
    public int getData() {
        return this.data;
    }


    /**
     * checks whether the DataBT is a valid heap
     * @return whether the DataBT is a valid heap
     */
    @Override
    public boolean validHeap() {
        if(this.left.hasLessThan(this.data)||this.right.hasLessThan(this.data)){
            return false;
        }else{
            return (this.left.validHeap()&&this.right.validHeap());
        }
    }


    /**
     * Checks if the tree has a value less than a given int
     * @param min the value checked against
     * @return false if neither this node or any of its children contain a value less than the min
     */
    @Override
    //checks if the DataBT contains a value less than min
    //if this node has a value less than min, returns true. Otherwise checks if either of its children have a value less than the min
    public boolean hasLessThan(int min) {
        if(this.data<min){
            return true;
        }else{
            return this.left.hasLessThan(min)||this.right.hasLessThan(min);
        }

    }


    /**
     * gets all data contained in a heap
     * @param dataList the linked list to add to
     * @return the given linkedlist with all of the data added to it
     */
    @Override
    public LinkedList<Integer> getAllData(LinkedList dataList) {
        dataList.add(this.data);
        return this.right.getAllData(this.left.getAllData(dataList));
    }


    /**
     * gets all data contained in a heap
     * @return a linkedList with all of the data added to it
     */
    public LinkedList<Integer> getAllData() {
        LinkedList allData = new LinkedList();
        allData.add(this.data);
        return this.right.getAllData(this.left.getAllData());
    }
}