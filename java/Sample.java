  class FullStaticMem {
  static int a;
  static void showVal(){
    System.out.println("Value of the object is:" + a);
  }
  public void setVal(int x){
    FullStaticMem(x);
  }
  private FullStaticMem(int x){
    a=x;
  }
}
class Sample {
  public static void main(String[] args){
    FullStaticMem A;
    A.setVal(10);
    FullStaticMem.showVal();
  }
}
