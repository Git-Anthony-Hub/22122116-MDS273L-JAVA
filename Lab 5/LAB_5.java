// # scanner class to read the file
import java.util.Scanner;
// main class
public class LAB_5{
    // static scanner object so that it can be used thoughtout the program.
    static Scanner scan = new Scanner(System.in);

    // students class.
    static class students{
        // requried variables
        int no, phn;
        String name, email, cls, department;

        // construtors to initialize the values to varaibles
        students(int objNo){
            no = objNo;
            System.out.println("Enter the name of student: ");
            name = scan.next();
            System.out.println("Enter email: ");
            email = scan.next();
            System.out.println("Enter class of student: ");
            cls = scan.next();
            System.out.println("Enter deparment: ");
            department = scan.next();
            System.out.print("Enter phone number: ");
            phn = scan.nextInt();
        }

        // function to print the student details.
        void display(){
            System.out.println("--------------------------------------------------------");
            System.out.println("Student Details: ");
            System.out.println("Registration Number: "+ no);
            System.out.println("Name: "+name);
            System.out.println("Email: "+email);
            System.out.println("Phone: "+phn);
            System.out.println("Class: "+cls);
            System.out.println("Department: "+department);
            System.out.println("--------------------------------------------------------");
        }   

        // function to display specific student details as per object.
        void search(){            
            this.display();
        }
    }

    // main funtion
    public static void main(String args[]){
        int ans, num;
        int objNo = -1;

        // student class array of object creation.
        students[] obj = new students[100];


        // do-whle loop to drive menu and perform the logic of program withing.
        do{
            // menu
            System.out.println("Menu: ");
            System.out.println("1) Add student");
            System.out.println("2) Search a student");
            System.out.println("3) Display students");
            System.out.println("4) exit");
            ans = scan.nextInt();

            // switch case to perform specific funtion as user selects.
            switch(ans){
                // creating objects to initilize details of students.
                case 1:
                    objNo++;
                    obj[objNo] = new students(objNo);
                    break;
                // searching the specific students as per his/her registration number.
                case 2:
                    System.out.println("Enter the registration number: ");
                    num = scan.nextInt();
                    obj[num].search();
                    break;
                // displaying details of all students.
                case 3:
                    for(int i=0; i<= objNo; i++){
                        obj[i].display();
                    }
            }
        }while(ans != 4);
    }
}