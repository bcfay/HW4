import java.lang.Math;

interface IBinTree {
 // determines whether element is in the tree
 boolean hasElt(int e);
 // returns number of nodes in the tree; counts duplicate elements as separate items
 int size();
 // returns depth of longest branch in the tree
 int height();
 //checks whether the IBinTree is a valid heap
 boolean validHeap();
 //checks whether the IBinTree contains an element less than a given value
 boolean hasLessThan(int min);
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
 //an empty IBinTree is a valid heap
 public boolean validHeap() {
  return true;
 }

 @Override
 //an empty IBinTree will not contain a number less than any number
 public boolean hasLessThan(int min) {
  return false;
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
 public boolean validHeap() {
  if(this.left.hasLessThan(this.data)||this.right.hasLessThan(this.data)){
   return (this.left.validHeap()&&this.right.validHeap());
  }else{
   return false;
  }
 }

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
}