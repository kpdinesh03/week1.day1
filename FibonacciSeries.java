package week1.day1;
public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8; 
		int firstNum=0; 
		int secondNum=1; 
		int sum=0;
		System.out.println(firstNum);
		for(int i=1; i<range; i++)
		{
			System.out.println(secondNum);
			sum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;	
		}	
	}
}
