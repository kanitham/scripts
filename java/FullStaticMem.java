public class FullStaticMem {
  static int a;
  static void showVal(){
    System.out.println("Value of the object is:" + a);
  }
  private FullStaticMem(int x){
    a=x;
  }
}

public static void main(Strings[] args){
  FullStaticMem A(10);
  FullStaticMem B(-20);
  A.showVal();
  B.showVal();
}
