public class Calculator {

    public Calculator(){

    }

    public double add(double a, double b){
        return a + b;
    }

    public double multiply(double a, double b){
        return a + b;
    }

    public static void main(String[] args){

        Calculator myCalc = new Calculator();

        System.out.println(myCalc.add(5,4));
        System.out.println(myCalc.add(5,5));
        System.out.println(myCalc.multiply(5,4));
        System.out.println(myCalc.multiply(2,4));


    }

}
