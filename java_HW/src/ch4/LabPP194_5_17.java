package ch4;

public class LabPP194_5_17 {
	public static void main(String[] args) {
		int count=0;
		int req_prime=100;
		int number_of_primes_per_line=10;
		for(int i=10;count<req_prime;i++){
			if(isPrime(i)){
				int rev=getRever(i);//reverse the number
				if(rev!=i&&isPrime(rev)){ 
					count++;
					System.out.print(i+"\t");
					if(count%number_of_primes_per_line==0)
						System.out.print("\n");
				}
			}
		}
	}
	static boolean isPrime(int number){
		for(int divisor = 2; divisor <= (int)Math.sqrt(number); divisor++)
			if (number % divisor == 0) 
				return false;
		return true;
	}
	static int getRever(int number){
		int revNum=0;
		for(;number!=0;){
			revNum=revNum*10;
			revNum+=number%10;
			number=number/10;
		}
		return revNum;
	}
}
