public class Main2 {

    public static int n1= 10;
    public static int n2=  3;
    public static int m1 = -5;
    public static int m2 = 8;
    public static int m3 = 6;
    public static int m4 =  55;
    public static int m5 =  9 ;
    public static double m6 = 20;
    public static double m7 = -3;
    public static double m8 = 5;
    public static double m9 = 8;
    public static double m10 = 15;
    public static double m11 = 3;
    public static double m12 = 2;

    public static void main(String[] args){
            Afiseaza afis = new Afiseaza();
            afis.afiseazaNume();

        Operatii opera  = new Operatii();

        double result = opera.sum(n1, n2);
        System.out.println(result);

        double divisionResult = opera.division(n1, n2);
        System.out.println(divisionResult);

        double calculusResult = opera.calculus(m1, m2, m3);
        System.out.println(calculusResult);

        double calculus1Result = opera.calculus1(m4,m5);
        System.out.println(calculus1Result);

        double calculus2Result = opera.calculus2(m6, m7, m8, m9);
        System.out.println(calculus2Result);

        double calculus3Result = opera.calculus3(m8, m10, m11, m12, m9);
        System.out.println(calculus3Result);




    }

}
