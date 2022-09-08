import java.util.ArrayList;
import java.util.Scanner;
public class ArraylistforOddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);//scanner object
		System.out.println("Enter the no");
		
		ArrayList<Integer> l1 = new ArrayList<>();// array list 
		while (true) {
			int user_no = obj.nextInt();
			if (user_no ==0) {
				break;
			}
			else {
		l1.add(user_no);
			}
		}
		for(int i: l1) {
			if(i%2 != 0) {
				System.out.print(i);
				System.out.print(" ");
			}
		}
		

	}

}
