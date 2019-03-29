import java.util.regex.*;
class Grep {
  public static void main(String[] args) throws java.lang.Exception{
    String pattern = args[0];
    System.out.println(Pattern.matches(pattern,"Hello World! This is 200th program on 03/14/2019 "));

  }
}
