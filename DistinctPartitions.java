package partitions;

import java.util.Scanner;

public class DistinctPartitions {
	public static void main(String ags[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to get its partitions: ");
		int n=sc.nextInt();
		System.out.print("Total number of Distinct Partitions for "+n+" are: "+Partition.part(n));
		sc.close();
	}
}
