import java.util.Scanner;

public class bank{
    static Scanner scan = new Scanner(System.in);

    static public class customer{
    int i = -1;
    int acc_no;
    String name;
    int bal;
    int[] prev_bal = new int[10];
    int[] new_bal = new int[10]; 
    int[] dept_amt = new int[10]; 
    int[] with_amt = new int[10]; 
    int[] time; 

    public void add_cus(){
        System.out.print("Enter customre name: ");
        name = scan.next();
        acc_no = 4578976;
    }

    public void deposit(){
        System.out.print("\nEnter money that you want to deposit: ");
        int money = scan.nextInt();
        i += 1;
        prev_bal[i] = bal;
        dept_amt[i] = money;
        bal = bal + money;
        new_bal[i] = bal;
    }

    public void withdraw(){
        System.out.print("Enter amount to withdraw");
        int with = scan.nextInt();

        if(with <= bal){
            i += 1;
            with_amt[i] = with;
            prev_bal[i] = bal;
            bal = bal - with;
            new_bal[i] = bal;
            dept_amt[i] = 0;
        }
        else{
            System.out.println("Enter withdraw amount is greater than available balance!!!");
        }
    }

    public void transactions(){
        System.out.println("\nYour transactions: ");
        System.out.println("Previous balance | Withdrawen amount   |  deposite amount  |   New balance");
        for(int j=0;j<=i;j++){
            System.out.println(prev_bal[j] +"                    "+ with_amt[j] +"                    "+ dept_amt[j] + "                           "+ new_bal[j]);
        }
    }

    public void summary(){
        System.out.println("\nCustomer name: "+name+" \nCusomter current balance: "+bal);
    }

    }


    public static void main(String[] args){
        customer obj = new customer();
        int ans = 0;
        do{
            System.out.println("\nMenu: \n1) Add customer \n2) deposite money \n3) Withdraw money \n4) show transactions \n5) account summary \n6) Exit");
            ans = scan.nextInt();

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