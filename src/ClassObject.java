import java.util.Scanner;

public class ClassObject {

	public static void main(String[] args) {
}
		
		private String courseName;
		
		public void setCourseName( String name )
		{
		 courseName = name; 
		}
		
		public String getCourseName()
		{
			return courseName; }
			
			public void displayMessage()
			{
				System.out.printf( "Welcome to the grade book for\n%s!\n",
				getCourseName() );
				
		
Scanner input = new Scanner( System.in );

GradeBook myGradeBook = new GradeBook(); 

System.out.printf( "Initial course name is: %s\n\n",
		myGradeBook.getCourseName() );

System.out.println( "Java Programming Class:" );
String theName = input.nextLine();
myGradeBook.setCourseName( theName ); 
	
System.out.println();

myGradeBook.displayMessage();

	}

}
