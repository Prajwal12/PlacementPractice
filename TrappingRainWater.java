import java.util.*;
public class TrappingRainWater
{
   
    public static int trapedWater(int A[]){
        int a=0;
        int b=A.length-1;
        int leftmax=0;
        int rightmax=0;
        int max=0;
        while(a<=b){
            leftmax = Math.max(leftmax,A[a]);
            rightmax = Math.max(rightmax,A[b]);
            if(leftmax<rightmax){
                max+=(leftmax-A[a]);       // leftmax is smaller than rightmax, so the (leftmax-A[a]) water can be stored
                a++;
            }
            else{
                max+=(rightmax-A[b]);
                b--;
            }
        }
        return max;
    } 
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
		System.out.println(trapedWater(arr));
	}
}
