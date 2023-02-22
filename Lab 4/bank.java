import java.util.Scanner;

public class bank{
    static Scanner scan = new Scanner(System.in);

    // creating a class customer which will take care of remebering all customer related details and doing related tasks.
    static public class customer{
    int i = -1;
    int acc_no;
    String name;
    int bal;
    int[] prev_bal = new int[10];
    int[] new_bal = new int[10]; 
    int[] dept_amt = new int[10]; 
    int[] with_amt = new int[10]; 

    // function to get customer details from user.
    public void add_cus(){
        System.out.print("Enter customre name: ");
        name = scan.next();
        acc_no = 4578976;
    }

    // funciton to get deposit amount from user and make changes in current balance of the user.
    public void deposit(){
        System.out.print("\nEnter money that you want to deposit: ");
        int money = scan.nextInt();
        i += 1;
        // saving current amount in an array for printing transaction detail purpose.
        prev_bal[i] = bal;
        // saving deposit amount in an array for printing transaction detail purpose.
        dept_amt[i] = money;
        // Adding the deposit money ammoun to current balance of the customer.
        bal = bal + money;
        // saving new balance in an array for printing transaction detail purpose.
        new_bal[i] = bal;
    }

    // function to withdraw amount from current balance of the user.
    public void withdraw(){
        System.out.print("Enter amount to withdraw");
        int with = scan.nextInt();

        // if condition to check the entered withdraw amount should be less than the available balance.
        if(with <= bal){
            i += 1;
            // saving withdraw amount in an array for printing transaction detail purpose.
            with_amt[i] = with;
            // saving current amount in an array for printing transaction detail purpose.
            prev_bal[i] = bal;
            // deuducting the withdraw amount from current balance.
            bal = bal - with;
            // saving new balance in an array for printing transaction detail purpose.
            new_bal[i] = bal;
            // as here we are dealing with only withdraw amount, assigning 0 value to dept_amt array record so that while array index may remain same for all varaible for customer.
            dept_amt[i] = 0;
        }
        else{
            System.out.println("Enter withdraw amount is greater than available balance!!!");
        }
    }

    // function to print transactions of user.
    /*
    it prints detailed details about previous and new balance before and after withdrawing or depositing the money by the user.
    we are printing this arrays resulting detail report of every deposit, withdraw done by the user and its effect on the current
    and total balance.
     */
    public void transactions(){
        System.out.println("\nYour transactions: ");
        System.out.println("Previous balance | Withdrawen amount   |  deposite amount  |   New balance");
        for(int j=0;j<=i;j++){
            System.out.println(prev_bal[j] +"                    "+ with_amt[j] +"                    "+ dept_amt[j] + "                           "+ new_bal[j]);
        }
    }

    // function to print summary of user: account number, customer name and current balance.
    public void summary(){
        System.out.println("\nCustomer account no: "+ acc_no +"\nCustomer name: "+name+" \nCusomter current balance: "+bal);
    }

    }


    // main funcition of class.
    public static void main(String[] args){
        // creating customer class obj to access its functions.
        customer obj = new customer();
        int ans = 0;

        // using do while loop to run the the menu of the program.
        do{
            System.out.println("\nMenu: \n1) Add customer \n2) deposite money \n3) Withdraw money \n4) show transactions \n5) account summary \n6) Exit");
            ans = scan.nextInt();

            // using switch case logic to call the right function as per desired seletion of user.
            switch(ans){
                case 1:
                obj.add_cus();
                break;

                case 2:
                obj.deposit();
                break;

                case 3:
                obj.withdraw();
                break;

                case 4:
                obj.transactions();
                break;

                case 5:
                obj.summary();
                break;
            }
            
        }while(ans != 6);
    }


}