package studentsResults;

public class  StudentsResults{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		
		int mark [] [] = new int [3] [3] ;
		mark [0] [0] = 80;
		mark [0] [1] = 89;
		mark [0] [2] = 79;
		mark [1] [0] = 90;
		mark [1] [1] = 78;
		mark [1] [2] = 87;
		mark [2] [0] = 78;
		mark [2] [1] = 90;
		mark [2] [2] = 79;
		System.out.println("\t \t \tMark 1\t\tMark 2\t\tMark 3");
		for ( i=0 ; i<mark.length ; i++ )
		{
			System.out.print("Student " +(i+1));
			for ( j=0 ; j<mark.length ; j++ )
			{
				System.out.print("\t\t"+mark [i] [j] );
			}
			
			System.out.println();
			System.out.println();
		}
				
		
				

	}

}

