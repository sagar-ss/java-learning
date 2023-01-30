class Calculator{

    int a ;

    public int add(int n1, int n2)
    {
        int result = n1 + n2;
        return result;
    }
}

public class classAndObject {

    public static void main(String a[])
    {
        int num1 = 5;
        int num2 = 6;

        Calculator calc = new Calculator(); // here calc is reference variable of object of Calculator.

        int result = calc.add(num1, num2);

        System.out.println(result);

    }
    
}
