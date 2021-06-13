package ch3;

public class LabP110_3_34 {
	public static void main(String[] args) {
		int num=(int)(Math.random()*1000);
		num=num%52;
		String []rank={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String []suit={"Clubs","Diamonds","Hearts","Spades"};
		System.out.print("The card you picked is "+rank[num%13]+" of "+suit[num/13]);
	}

}
