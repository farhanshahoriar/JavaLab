package main;
/**
 * <h1>Small Calculator</h1>
 * Here I am making a small calculator to learn
 * Annotation. 
 * <p>
 * <b>Functions:</b> addtion, substruction
 * @author farhanshahoriar
 * @version 1.0
 * @since 29th October
 */
public class SmallCalculator {
	/**
	 * This static function takes two integer and returns their
	 * sum. this will be used later for calculator.
	 * @param operand1
	 * @param operand2
	 * @return
	 */
	public static int  sum(int operand1,int operand2) {
		
		return operand1+operand2;
	}
	
	/**
	 * This static function takes two integer and returns their
	 * difference. this will be used later for calculator.
	 * @param operand1
	 * @param operand2
	 * @return
	 */
	public static int difference(int operand1,int operand2) {		
		int d=operand1-operand2;
		
		if(d<0)d=-d;
		return d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(3,7));
		System.out.println(difference(3,5));

	}

}
