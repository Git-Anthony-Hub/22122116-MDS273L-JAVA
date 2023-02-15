import java.util.Scanner;
import java.util.Arrays;

public class mean_median_mode{
	static int n;
	static Scanner scan = new Scanner(System.in);
	// function to take input values
	public int[] intake(int[] int_arr){
		System.out.print("how many elements you want to enter: ");
		n = scan.nextInt();
		System.out.println();
	
		for(int i=0; i<n;i++){
			System.out.print("Enter number: "+i+": ");
			int_arr[i] = scan.nextInt();			
		}
		return int_arr ;
		
	}

	// funciton to calculate mean.
	public double mean(int[] int_arr){
		double sum = 0;
		for(int i=0; i<n;i++){
			sum += int_arr[i];
		}

		double avg = sum/n;
		return avg;
	}

	// funciton to calculate median
    public double median(int[] int_arr){
        double med;
		// int_arr = Arrays.sort(int_arr);
		if(n%2 == 0){
			med = ((double)int_arr[n/2] + (double)int_arr[n/2 - 1]) /2;
		}
		else{
			med = (double)int_arr[n/2];
		}
		return med;
    } 

	// funciton to calculate mode.
	public double mode(int[] int_arr){
		int no;
		int max = 0;
		int count = 0;
		double m = 0;
		int[] mode_n = new int[10];
		int k = 0;
		for(int i=0;i<n;i+=1){
			no = int_arr[i];
			for(int j=0;j<n; j+=1){
				if(int_arr[j]==no){
					count += 1;
				}
			}
			
			if(count >= max){
				// if (count == max){
				// 	mode_n[k] = no;
				// 	k += 1;
				// }
				m = (double)no;
				max = count;
			}
			count = 0;
		}
		return m;
		
	}


	// main function
	public static void main(String[] args){
		// creating an array
        int[] int_arr = new int[100];

		// creating class object to call functions.
		mean_median_mode obj = new mean_median_mode();

		// getting array values as input from user.
		int_arr = obj.intake(int_arr) ;
		
		// for loop to print each elements of array
		System.out.print("Elements in array: ");
		for(int i=0; i<n;i++){
			System.out.print(int_arr[i] + ", ");
		}

		System.out.println("\n\nChoose one option: \n1) Mean \n2) Mode \n3) Median");
		int ans = scan.nextInt();

		double r1,r2, r3;
		// int[] r2 = new int[100];
		switch(ans){
			case 1:
			r1 = obj.mean(int_arr);
			System.out.println("The average is: " + r1);
			break;

			case 2:
			r2 = obj.mode(int_arr);
			System.out.println("The mode is: " + r2);
			break;

			case 3:
			r3 = obj.median(int_arr);
			System.out.println("The median is: " + r3);
			break;
		}		
		
		
	}
}