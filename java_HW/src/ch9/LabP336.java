package ch9;

public class LabP336 {
	public static void main(String[] args) {
		String a="_+_+_+AAaa4341_+_";
		int n=countLetters(a);
		System.out.print(n);
	}
	public static int countLetters(String s){
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
				count++;
			else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
				count++;
		}
		return count;
	}

}
