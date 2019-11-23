import java.util.ArrayList;

class BoxUnbox {
   public static void main(String[] args ) {
      int iPrimitive = 10;
      int x;
      Integer iWrapper = new Integer(iPrimitive);
   
      System.out.println("Boxing: " + iWrapper);

      x=iWrapper.intValue();
      System.out.println("UnBoxing: " + x);
      Integer a = new Integer(5);
      Integer b =  new Integer(5);

      try {
         if (a==b) {
            System.out.println("Same Object");
         }

         if(a.equals(b)) {
            System.out.println("Same value ");
         }
      }catch (Exception e){
         System.out.println(e.getMessage());
      }
      
      Integer jWrapper = iPrimitive;
      

      System.out.println("jWrapper: " + jWrapper);
      iPrimitive = ++jWrapper + 10;
      
      System.out.println("iPrimitive: " + iPrimitive);

   }
   
   ArrayList<Integer> T = new ArrayList<Integer>();
   T.add(iWrapper);
   T.add(jWrapper);

   for( Integer item: T ) {
      System.out.println("i:" + item);
   }
}