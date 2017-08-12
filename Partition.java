package partitions;

public class Partition {
	public static int count=0;
	public static int part(int n){
		part(n,n);
		return count;
	}
	public static void part(int n,int max){
		if(n==0){
			
			count++;
			return;
		}
		int i;
		for(i=Math.min(max-1, n);i>0;i--){
			part(n-i,i);
			
		}
	}
}
