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

            String word = "";

            switch(State){
                case "Delhi":
                word = "The Student is from the southern states of India";
                break;

                case "Haryana":
                word = "The Student is from the southern states of India";
                break;

                case "Jammu and Kashmir":
                word = "The Student is from the southern states of India";
                break;

                case "Himachal Pradesh":
                word = "The Student is from the southern states of India";
                break;

                case "Uttarpradesh":
                word = "The Student is from the southern states of India";
                break;

                case "Punjab":
                word = "The Student is from the southern states of India";
                break;

                case "Uttarakhand":
                word = "The Student is from the southern states of India";
                break;

                case "Rajasthan":
                word = "The Student is from the southern states of India";
                break;

                case "Ladakh":
                word = "The Student is from the southern states of India";
                break;

                case "Chandigarh":
                word = "The Student is from the southern states of India";
                break;

                
                case "Andaman & Nicobar":
                word = "The Student is from the northern states of India";
                break;

                case "Andhra Pradesh":
                word = "The Student is from the northern states of India";
                break;

                case "Karnataka":
                word = "The Student is from the northern states of India";
                break;
                
                case "Lakshadweep":
                word = "The Student is from the northern states of India";
                break;

                case "Pondicherry":
                word = "The Student is from the northern states of India";
                break;

                case "Tamilnadu":
                word = "The Student is from the northern states of India";
                break;


                case "Bihar":
                word = "The Student is from the eastern states of India";
                break;
                
                case "West Bengal":
                word = "The Student is from the eastern states of India";
                break;
                case "Jharkhand":
                word = "The Student is from the eastern states of India";
                break;
                case "Orissa":
                word = "The Student is from the eastern states of India";
                break;

                case "Dadra & Nagar Haveli":
                word = "The Student is from the eastern states of India";
                break;
                case "Daman & Diu":
                word = "The Student is from the eastern states of India";
                break;
                case "Goa":
                word = "The Student is from the eastern states of India";
                break;
                case "Gujarat":
                word = "The Student is from the eastern states of India";
                break;
                case "Maharashtra":
                word = "The Student is from the eastern states of India";
                break;
                
                case "Rajashthan":
                word = "The Student is from the eastern states of India";
                break;

            }

            System.out.println(word)




        // String ans = "";
        // String zone = "";
        // do{
        //     for(int i = 0; i<north.length; i++){
        //         if (State == north[i]){
        //             zone = "north";
        //             ans = "done";
        //             break;
        //         }
        //     };

        //     for(int i = 0; i<south.length; i++){
        //         if (State == south[i]){
        //             zone = "south";
        //             ans = "done";
        //             break;
        //         }
        //     }
        // }while(ans != "done");

        // String direction;
        // switch(zone){
        //     case "north":
        //     direction = "The Student is from the northern states of India";
        //     break;

        //     case "south":
        //     direction = "The Student is from the southern states of India";
        //     break;
        // }

    }
}