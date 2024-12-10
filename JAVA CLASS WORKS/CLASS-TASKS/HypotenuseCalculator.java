public class HypotenuseCalculator{
    public static void main(String [] args){
	double number1 = 3;
	double number2 = 4;
	System.out.println(pythagoras(number1, number2));
    
    }
        public static double pythagoras(double side1, double side2){
	    double hypotenuse = Math.sqrt(Math.pow(side1, 2)+ Math.pow(side2, 2));
	    return hypotenuse;
	}
} 