package application;

public class Model {
	static double calculate(int opr1,int opr2,String op) {
		
			double ans=0;
			switch (op) {
			case "+":
				ans=opr1+opr2;
				break;
			case "-":
				ans=opr1-opr2;
				break;
			case "*":
				ans=opr1*opr2;
				break;
			case "/":
				ans=opr1/opr2;
				break;
			
			}
			return ans;
	}

}
