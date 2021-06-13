package ch4;

public class LabP194_5_18 {
	public static void main(String[] args) {
		System.out.print("Number\tSquareRoot\n");
		for(int i=0;i<=10;i++){
			System.out.print(2*i+"\t");
			System.out.printf("%.4f \n",Math.sqrt(2*i));
		}
		//System.out.printf is similar to the printf in C language
	}
}
