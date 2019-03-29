
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class StringRegEx {
     
     
    public static void main(String args[]){
        String pattern = "((\\d){2,})";
        String pattern2 = "(^...(.))";
            Pattern p = Pattern.compile(pattern);
            Matcher s= p.matcher(args[0]);
         if(s.find()){
             System.out.println("Match Fount:" + s.group(0));
         }else{
             System.out.println("No Match Found");
         }

         p=Pattern.compile(pattern2);
         s=p.matcher(args[0]);
         System.out.println ("4th character in the input is: " +(s.group(0) );
    }
}