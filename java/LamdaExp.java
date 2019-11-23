import java.util.function.*;

interface Summable {
    int Combine(int a, int b);
}

interface Squarable {
    double Combine(int a, int b);
}

public class LamdaExp {
    UnaryOperator<String>  Print = (String s) -> {
        System.out.println(s);
        return s;
    };
    public  void main(String[] args) {
        Summable s = (x,y) -> x+y;
        Squarable t = (x,y) -> {
            int z = x*x + y*y + 1;
            return Math.sqrt(z);
        };
        System.out.println(s.Combine(10,20));
        System.out.println(t.Combine(5,6));

        Print.apply((Double.toString(t.Combine(10,20))));
    }
    
}