package ch6;
import java.util.Scanner;
public class LabP228_6_4 {
	public static void main(String[] args) {
		int []scores=new int [10];
		Scanner input= new Scanner(System.in);
		int count=0;
		for(int temp=input.nextInt();temp>0;temp=input.nextInt()){
			scores[count]=temp;
			count++;
		}
	    double avg=findSum(scores)/(count);
	    int bigger=0,smaller=0,equal=0;
	    for(int i=0;i<count;i++){
	    	if(scores[i]>avg)
	    		bigger++;
	    	else if(scores[i]<avg)
	    		smaller++;
	    	else if(scores[i]==avg)
	    		equal++;
	    }
	    System.out.print("There are "+bigger+" scores bigger than the average\n");
	    System.out.print("There are "+equal+" scores equal to the average\n");
	    System.out.print("There are "+smaller+" scores below the average\n");
	}
	public static double findSum(int[] array) {
	    int sum = 0;
	    for (int value : array) 
	        sum += value;
	    return sum;
	}

}
