
public class RunTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test ts1=(str)-> "Hello "+str;
		System.out.println(ts1.addn("Shuvo"));
		System.out.println(ts1.addn("Nadim"));
		
		CompareBool isodd=(num)->(num%2)==1;
		CompareBool isPositive=(num)->(num>0);
		
		System.out.println(isodd.cmp(5));
		System.out.println(isodd.cmp(6));
		
		Test print=(str)->{	
			System.out.println(str+" DONE");
			return str+" Ok";
		};
		print.addn("Shuvo");
		
		System.out.println(isPositive.cmp(6));
		System.out.println(isPositive.cmp(-3));
		
		
	}

}
