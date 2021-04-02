package multiDimensionalArray;
//import java.util.Scanner;
public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String details[][]=new String[2][4];
		details[0][0]="Joan";
		details[0][1]="10";
		details[0][2]="20";
		details[0][3]="30";
		details[1][0]="Mary";
		details[1][1]="50";
		details[1][2]="60";
		details[1][3]="70";
		int i,j;
		System.out.println("\t\t Mark1\tMark2\tMark3");
		for (i=0;i<2;i++)
		{
			//System.out.print(details[i][0]);
			for(j=0;j<4;j++)
			{
				System.out.print("\t "+details[i][j]);
			}
			System.out.println();
		}
		
	}
}
