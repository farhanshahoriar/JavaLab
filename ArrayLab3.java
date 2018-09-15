
public class HomeTask3 {

	public static void main(String[] args) {
		final int SIZE=15;
		boolean[] restroom =new boolean[SIZE];
		int i,j,k,stalls=3,StartMaxFree,MaxFree;
		for(i=0;i<SIZE;i++) {
			restroom[i]=false;
		}
		
		for(i=0;i<stalls;i++){
			StartMaxFree=MaxFree=0;
			for(j=0,k=0;j<SIZE;j++) {
				
				if(restroom[j]) {
					k=0;
				}
				else {
					k++;
					if(k>MaxFree){
						MaxFree=k;
						StartMaxFree=j+1-MaxFree;
					}
				}
			}
			restroom[StartMaxFree+MaxFree/2]=true;
		}
		
		for(i=0;i<SIZE;i++) {
			if(restroom[i]) {
				System.out.print("X");
			}
			else {
				System.out.print("_");
			}
		}

	}
}
