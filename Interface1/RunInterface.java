
public class RunInterface {
	
	public static void main(String[] args) {
		Measure arr[]=new Measure[3];
		arr[0]=new BankAC(16);
		arr[1]=new BankAC(24);
		arr[2]=new BankAC(36);
		double avg=Data.average(arr);
		System.out.println(avg);
		arr[0]=new Result(5);
		arr[1]=new Result(10);
		arr[2]=new Result(8);
		avg=Data.average(arr);
		System.out.println(avg);
	}
}
