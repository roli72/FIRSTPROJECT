public class Operatii {

    public double sum(double first, double second) {
        double result = first + second;
        return result;
    }

    public double division(double first, double second) {
        double result = first / second;
        return result;
    }

    public double calculus(double first, double second, double third) {
        double result = first + (second * third);
        return result;
    }

    public double calculus1(double first, double second){
        double result = (first + second) % second;
        return result;
    }

    public double calculus2(double first, double second, double third, double fourth){
        double result = first + (second * third / fourth);
        return result;
    }

    public double calculus3(double x8, double x9, double x10, double x11, double x12){
        double result = x8 + ((x10 / x11)*x12 ) - ( x9 % x11);
        return result;

    }













}