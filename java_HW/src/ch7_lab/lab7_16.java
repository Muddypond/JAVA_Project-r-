package ch7_lab;

public class lab7_16 {

	public static void main(String[] args) {
		int m[][]={{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
		sortTwo(m,1);
		sortTwo(m,0);
		for(int i=0;i<m.length;i++){
		    System.out.print("{"+m[i][0]+","+m[i][1]+"}");
		    System.out.print("\t");
		}
	}
	public static void sortTwo(int arr[][],int comparotr){
	    for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i][comparotr]>=arr[j][comparotr]){
                    int temp[]=arr[i];
                    shift(arr,j+1,i);
                    arr[j+1]=temp;//insert
                    break;
                }else if(j==0){
                    int temp[]=arr[i];
                    shift(arr,0,i);
                    arr[j]=temp;
                    break;
                }   
            }
        }
        return;
	}
    static void shift(int arr[][],int fromP,int toP){
        for(int i=toP;i>fromP;i--)
            arr[i]=arr[i-1];
        return;
    }
}
