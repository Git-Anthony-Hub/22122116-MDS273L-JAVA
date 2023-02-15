import java.util.Scanner;
import java.util.Arrays;

public class mean_median_mode{
	static int n;
	// static int[] int_arr = new int[100];
	public int[] intake(int[] int_arr){
		Scanner scan = new Scanner(System.in);
		System.out.print("how many elements you want to enter: ");
		n = scan.nextInt();
		System.out.println();
	
		for(int i=0; i<n;i++){
			System.out.print("Enter number: "+i+": ");
			int_arr[i] = scan.nextInt();			
		}
		return int_arr ;
		
	}

	public double mean(int[] int_arr){
		double sum = 0;
		for(int i=0; i<n;i++){
			sum += int_arr[i];
		}

		double avg = sum/n;
		return avg;
	}

    public double median(int[] int_arr){
        double med;
		int l = int_arr.length;
		// int_arr = Arrays.sort(int_arr);
		if(l%2 == 0){
			med = ((double)int_arr[l/2] + (double)int_arr[l/2 - 1]) /2;
		}
		else{
			med = (double)int_arr[l/2];
		}
		return med;
    } 

	public double mode(int[] int_arr){
		int no;
		int max = 0;
		int count = 0;
		double m = 0;
		int[] mode_n = new int[10];

		for(int i=0;i<int_arr.length;i+=1){
			no = int_arr[i];
			for(int j=0;j<int_arr.length; j+=1){
				if(int_arr[j]==n){
					count += 1;
				}
			}
			
			if(count >= max){
				m = (double)n;
				max = count;
			}
			count = 0;
		}
		return m;
		
	}
	public static void main(String[] args){
        int[] int_arr = new int[100];
		mean_median_mode obj = new mean_median_mode();
		int_arr = obj.intake(int_arr) ;
		
		System.out.print("Elements in array: ");
		for(int i=0; i<n;i++){
			System.out.print(int_arr[i] + ", ");
		}

		double r1,r2,r3;
		r1 = obj.mean(int_arr);
		r2 = obj.mode(int_arr);
		r3 = obj.median(int_arr);

		System.out.println("The average is: " + r1);
		System.out.println("The mode is: " + r2);
		System.out.println("The median is: " + r3);
	}
}