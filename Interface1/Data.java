
public class Data{
	public static double average(Measure[] obj) {
		double sum=0;
		for(Measure elm:obj) {
			sum=sum+elm.getvalue();
		}
		return sum/obj.length;
	}
}