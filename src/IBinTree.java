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
     * Searches for a book with a matching title.
     * @param hOrig The title we're searching for.
     * @return True if a matching book is found.
     */
    int getData();
    /**
     * Searches for a book with a matching title.
     * @param hOrig The title we're searching for.
     * @return True if a matching book is found.
     */
    //checks whether the IBinTree is a valid heap
    boolean validHeap();


    /**
     * Searches for a book with a matching title.
     * @param hOrig The title we're searching for.
     * @return True if a matching book is found.
     */
    //checks whether the IBinTree contains an element less than a given value
    boolean hasLessThan(int min);
    LinkedList<Integer> getAllData(LinkedList dataList);


    /**
     * Searches for a book with a matching title.
     * @param hOrig The title we're searching for.
     * @return True if a matching book is found.
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

    @Override
    public int getData() {
        return 0;
    }


    /**
     * Searches for a book with a matching title.
     * @param hOrig The title we're searching for.
     * @return True if a matching book is found.
     */
    @Override
    //an empty IBinTree is a valid heap
    public boolean validHeap() {
        return true;
    }


    /**
     * Searches for a book with a matching title.
     * @param hOrig The title we're searching for.
     * @return True if a matching book is found.
     */
    @Override
    //an empty IBinTree will not contain a number less than any number
    public boolean hasLessThan(int min) {
        return false;
    }


    /**
     * Searches for a book with a matching title.
     * @param hOrig The title we're searching for.
     * @return True if a matching book is found.
     */
    @Override
    public LinkedList<Integer> getAllData(LinkedList dataList) {
        return dataList;
    }


    /**
     * Searches for a book with a matching title.
     * @param hOrig The title we're searching for.
     * @return True if a matching book is found.
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

    @Override
    public int getData() {
        return this.data;
    }


    /**
     * Searches for a book with a matching title.
     * @param hOrig The title we're searching for.
     * @return True if a matching book is found.
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
     * Searches for a book with a matching title.
     * @param hOrig The title we're searching for.
     * @return True if a matching book is found.
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
     * Searches for a book with a matching title.
     * @param hOrig The title we're searching for.
     * @return True if a matching book is found.
     */
    @Override
    public LinkedList<Integer> getAllData(LinkedList dataList) {
        dataList.add(this.data);

        return this.right.getAllData(this.left.getAllData(dataList));
    }


    /**
     * Searches for a book with a matching title.
     * @param hOrig The title we're searching for.
     * @return True if a matching book is found.
     */
    public LinkedList<Integer> getAllData() {
        return this.right.getAllData(new LinkedList());
    }
}