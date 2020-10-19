import java.util.Scanner;

public class Driver {
	
	private static int max(int[] intArr) {
		int d = intArr[0];
		for (int i =1; i<intArr.length; i++) {
			if (intArr[i] > d) {
				d = intArr[i];
			}
		}
		return d;
	}
	
	public static void getGrades(int[] intArr , char[] charArr) {
		int best = max(intArr);
		
		for(int i=0; i< intArr.length; i++) {
			if (intArr[i] > best - 10) {
				charArr[i] = 'A';
			} else if (intArr[i] > best - 20) {
				charArr[i] = 'B';
			} else if (intArr[i] > best - 30) {
				charArr[i] = 'C';
			} else if (intArr[i] > best - 40) {
				charArr[i] = 'D';
			} else {
				charArr[i] = 'F';
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students");
	
		int[] scoresArray = new int[input.nextInt()];
		char[] gradeArray = new char[scoresArray.length];
		
		System.out.println("Enter " + scoresArray.length  + " scores : " );
		for(int i=0; i< scoresArray.length; i++) {
			scoresArray[i] = input.nextInt();
		}	
		
		//printing the data
		getGrades(scoresArray, gradeArray);
		
		for(int i=0; i< scoresArray.length; i++) {
			System.out.println("Student " + i + " score is " + scoresArray[i] + 
					" grade is " + gradeArray[i]);
		}
		
	}

}