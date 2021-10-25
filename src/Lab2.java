public class Lab2 {
    public static int x = 3;
    public static int z = 3;

    public static void main(String[] args) {
        double result = sum(x, z);
        System.out.println(result);
        double substractresult = substract (x, z);
        System.out.println(substractresult);
        double division = division ( x, z);
        System.out.println(division);
        double multiply = multiply (x, z);
        System.out.println(multiply);
        double modulo = modulo ( x, z);
        System.out.println(modulo);
    }

    public static double sum(int first, double second){
        double result = first + second;
        return result;
    }

    public static int substract(int first, int second){
        int substractresult = first - second;
        return substractresult;
    }

    public static int division(int first, int second){
        int division = first / second;
        return division;

    }

    public static int multiply( int first , int second){
        int multiply = first * second;
        return multiply;

    }

    public static double modulo( int first , int second){
        double modulo = first % second;
        return modulo;
    }



















}
