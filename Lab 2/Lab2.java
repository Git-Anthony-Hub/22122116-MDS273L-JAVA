// importing scanner class to scan the user input to the defined variables.
import java.util.Scanner;
public class Lab2{
    public static void main(String[] args){  
        // creating scan object
        Scanner scan = new Scanner(System.in);
        int option;
        String name = "";
        String temp = "";
        int i;
        String[] names = new String[1024];
        i = -1;

            // creating do-while loop for making program recurring until user choose to exit.
            do{
                System.out.println("1. Insert a name to array");
                System.out.println("2. Search for a name");
                System.out.println("3. Remove a name");
                System.out.println("4. Show all names");
                System.out.println("5. Exit the program");
                System.out.print("Select one option: ");                
                option = scan.nextInt();

                // switch case for executing right logic accourding to what user chooses.
                switch(option){
                    // Inserting a name in array.
                    case 1:
                        i = i+1;
                        // getting name from user input.
                        System.out.print("Enter the name: ");
                        name = scan.next();
                        
                        for(int j=0;j<=i;j++){
                            // if(i != 0){
                                temp = names[j];
                                // chechking if the user entered name already exist in the array?
                                if(i != 0 && temp == name){
                                    System.out.println(name + " already exists in the array.");
                                    i = i - 1;
                                    break;
                                }
                                // if the entered name is unique then adding that name to array.
                            else{
                                names[i] = name;
                                break;
                            }
                            }
                            System.out.println("");
                            break;

                    // Searching the user entered name in the array.
                     case 2:
                        String ans="no";
                        System.out.print("Enter the name: ");
                        name = scan.next();
                        for(int j=0;j<=i;j++){
                            // comparing the user entered name with every available name in the array.
                            if(names[j].compareTo(name) == 0){
                                // if name exists in array then printing below message and breaking the loop.
                                System.out.println(name + " exists in the array at index number " + j);
                                ans = "yes";
                                break;                                
                            }
                            }
                        // if name does not exist then program will give below output.
                        if(ans == "no"){
                            System.out.println(name + " does not exist in the array.");
                        }                            
                        System.out.println("");
                        break;

                    // Removing a name from array.
                    case 3:
                        System.out.print("Enter the name that you want to remover from the array: ");
                        name = scan.next();
                        String[] temp_array = new String[1024];
                        int k = -1;
                        ans = "no";
                        for(int j=0;j<=i;j++){
                            // checking if the user entered name exist in the array or not.
                            if(names[j].compareTo(name) == 0){
                                System.out.println(name + "exists in the array at index number " + j + "And its deleted.");
                                // if the name exist then program will remove that name.
                                names[j] = "";
                                ans = "yes";
                            }

                                                    // else{
                                                    //     k = k +1;
                                                    //     temp_array[k] = names[j];
                                                    // }
                                                    // names = temp_array;
                            }
                            // if name does not exist in the array then below will print.
                            if(ans == "no"){
                                System.out.println(name + "does not exist in the array.");
                            }
                            System.out.println("");
                            break;
                        
                    // Displaying all the names from array.
                    case 4:
                        for(int j=0;j<=i;j++){
                            System.out.println("["+j+"]: "+ names[j]);
                        }
                        System.out.println("");
                        break;
                    }
            
            }while(option != 5);

    }
}