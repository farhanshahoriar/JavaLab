import java.util.Random;

public class ArrayLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE=20;
		int[] array=new int [SIZE];
		int[] runSize =new int [SIZE];
		int i,j;
		int maxrun=0;
		Random rand=new Random();
		System.out.println("Printing Array Noramlly: ");
		for( i=0;i<SIZE;i++) {
			array[i]=rand.nextInt(80)%6;
			System.out.print(array[i]+" ");	
		}
		System.out.println("");
		for(i=0;i<SIZE;i++) {
			for(j=i+1;j<SIZE;j++) {
				if(array[i]!=array[j])break;
			}
			runSize[i]=j-i;
			if(runSize[i]>maxrun)maxrun=i;
		}
		System.out.println("Printing Array Selecting Long Runs: ");
		//System.out.println(maxrun);
		for(i=0;i<SIZE;i++) {
			if(i==maxrun) {
				System.out.print("(");
				for(j=i;j<i+runSize[i];j++) {
					System.out.print(array[j]+" ");
				}
				i=j-1;
				System.out.print(")");
			}
			else System.out.print(array[i]+" ");
		}	
	}
}
