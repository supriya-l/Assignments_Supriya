import java.util.*;
class ResultDeclaration{
	public String declareResults(double subject1marks, double subject2marks, double subject3marks) {
		String result = " ";
		if(subject1marks >= 60 && subject2marks >=60 && subject3marks >=60){
				result = "Passed";
				System.out.print(result);
			} else if ((subject1marks>60 && subject2marks>60) ||  
					(subject2marks>60 && subject3marks>60) ||
			        (subject3marks>60 && subject1marks>60)) {
				result = "Promoted";
				System.out.print(result);
			} else if((subject1marks<60 && subject2marks <60 && subject3marks <60)
					||(subject1marks>=60 && subject2marks <60 && subject3marks <60)
					||(subject1marks<60 && subject2marks >=60 && subject3marks <60)
					||(subject1marks<60 && subject2marks <60 && subject3marks >=60)) {
				result = "Failed";
				System.out.print(result);
			}
		return result;
	}
}
 class Assignment1Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double sub1, sub2, sub3;
		
		System.out.println("Enter the marks of subject 1: ");
		sub1 = sc.nextDouble();
		System.out.println("Enter the marks of subject 2: ");
		sub2 = sc.nextDouble();
		System.out.println("Enter the marks of subject 3: ");
		sub3 = sc.nextDouble();
		
		ResultDeclaration res = new ResultDeclaration();
		res.declareResults(sub1, sub2, sub3);
	}

}