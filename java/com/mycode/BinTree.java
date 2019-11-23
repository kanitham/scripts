import java.util.ArrayList;
class BinTree {
  static ArrayList <Integer> iArray = new ArrayList<Integer>(arr.length);

  static void showArray(String[] arr) {
    ArrayList <Integer> iArray = new ArrayList<Integer>(arr.length);
    for(int i=0;i< arr.length;i++ ){
      iArray.add(Integer.valueOf(arr[i]));
    }
    System.out.println("The input array is: \n " + iArray.toString() +"\n");
  }

  static int getNode(int key) {
      int index = 0;
      while (index < iArray.size())
          fnode=(iArray.get(index++)==key)?1:0;
      if(fnode) {
          System.out.println(index);
          return True;
      }else{
         return False;
      }
  }

  static int getIndex(int key) {
      int index = 0;
      while (index < iArray.size()) {
          cnode=(iArray.get(index)==key)?index:-1;
          index++;
      }
      return cnode;
  }

  static void printBTree(ArrayList<Integer> intArr){
      /* scan array to find value root Node
       print the index and */
       int index=0;
       if(getNode(-1)) {
          int index = getIndex(-1);
          while(child=getIndex(getNode)) {

          }
       }

  }
  public static void main (String[] args) {
    showArray(args);
  }
}
