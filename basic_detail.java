import java.util.Scanner;

public class basic_detail{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String Name = scan.next("Enter your name: ");
        System.out.print("Enter your roll number: ");
        int RNo = scan.nextInt();
        String State = scan.next("Enter your state name: ");
        char gen = scan.nextLine().charAt(0);

        System.out.println("Student Details \nName: " + Name + "\nRoll No:" + RNo + "\nState: "+State + "\nGender: " + gen);

        if(gen == 'm' || gen == 'M'){
            System.out.println("Male");
        }
        else if(gen == 'F' || gen == 'F'){
            System.out.println("Female");
        }

        String[] north = {"Delhi",
            "Haryana",
            "Jammu and Kashmir",
            "Himachal Pradesh",
            "Uttarpradesh",
            "Punjab",
            "Uttarakhand",
            "Rajasthan",
            "Ladakh",
            "Chandigarh"};

        String[] south = {"Andaman & Nicobar",

            "Andhra Pradesh",
            
            "Karnataka",
            
            "Kerala",
            
            "Lakshadweep",
            
            "Pondicherry",
            
            "Tamilnadu"};

        String ans = "";
        String zone = "";
        do{
            for(int i = 0; i<north.length; i++){
                if (State == north[i]){
                    zone = "north";
                    ans = "done";
                    break;
                }
            };

            for(int i = 0; i<south.length; i++){
                if (State == south[i]){
                    zone = "south";
                    ans = "done";
                    break;
                }
            }
        }while(ans != "done");

        String direction;
        switch(zone){
            case "north":
            direction = "The Student is from the northern states of India";
            break;

            case "south":
            direction = "The Student is from the southern states of India";
            break;
        }

    }
}