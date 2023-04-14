import java.util.*;
import java.io.*;
import java.util.Arrays;

public class Lab_7{
//     to calculate the rows
    static int nrow = -1;
    
//     function to calculate the mean of the values.
    public static void Mean(String[][] data){
        double setosa_sl = 0;
        double setosa_sw = 0;
        double setosa_pl = 0;
        double setosa_pw = 0;
        double versicolor_sl = 0;
        double versicolor_sw = 0;
        double versicolor_pl = 0;
        double versicolor_pw = 0;
        double virginica_sl = 0;
        double virginica_sw = 0;
        double virginica_pl = 0;
        double virginica_pw = 0;

        for(int i = 1; i <= 50; i++){
            setosa_sl +=  Double.parseDouble(data[i][1]);
            setosa_sw +=  Double.parseDouble(data[i][2]);
            setosa_pl +=  Double.parseDouble(data[i][3]);
            setosa_pw +=  Double.parseDouble(data[i][4]);
        }
        for(int i = 51; i <= 100; i++){
            versicolor_sl +=  Double.parseDouble(data[i][1]);
            versicolor_sw +=  Double.parseDouble(data[i][2]);
            versicolor_pl +=  Double.parseDouble(data[i][3]);
            versicolor_pw +=  Double.parseDouble(data[i][4]);
        }
        for(int i = 101; i <= 150; i++){
            virginica_sl +=  Double.parseDouble(data[i][1]);
            virginica_sw +=  Double.parseDouble(data[i][2]);
            virginica_pl +=  Double.parseDouble(data[i][3]);
            virginica_pw +=  Double.parseDouble(data[i][4]);
        }
        
        System.out.println("----------------Mode------------------")        
        System.out.println("Iris-setosa: ");
        System.out.println(data[0][1] + ": " + setosa_sl/50);
        System.out.println(data[0][2] + ": " + setosa_sw/50);
        System.out.println(data[0][3] + ": " + setosa_pl/50);
        System.out.println(data[0][4] + ": " + setosa_pw/50 + "\n");
        System.out.println("Iris-versicolor: ");
        System.out.println(data[0][1] + ": " + versicolor_sl/50);
        System.out.println(data[0][2] + ": " + versicolor_sw/50);
        System.out.println(data[0][3] + ": " + versicolor_pl/50);
        System.out.println(data[0][4] + ": " + versicolor_pw/50 + "\n");
        System.out.println("Iris-virginica: ");
        System.out.println(data[0][1] + ": " + virginica_sl/50);
        System.out.println(data[0][2] + ": " + virginica_sw/50);
        System.out.println(data[0][3] + ": " + virginica_pl/50);
        System.out.println(data[0][4] + ": " + virginica_pw/50 + "\n");       
        
    }

    //     function to calculate the meadin of the values.
    static void Median(double[] sl, double[] sw, double[] pl, double[] pw){   

        
        if(50 % 2 == 0){
            System.out.println("sepalLength= "+sl[((50/2)+1 + (50/2))/2]);
            System.out.println("sepalWidth= "+sw[((50/2)+1 + (50/2))/2]);
            System.out.println("petalLength= "+pl[((50/2)+1 + (50/2))/2]);
            System.out.println("PetalWidth= "+pw[((50/2)+1 + (50/2))/2] + "\n");
        } 

    }
    
    //     function to calculate the mode of the values.
    public static void Mode(double[] sl, double[] sw, double[] pl, double[] pw){
        System.out.println("sepalLength: "+ MaxFrequency(sl));
        System.out.println("sepalWidth: "+ MaxFrequency(sw));
        System.out.println("petalLength: "+ MaxFrequency(pl));
        System.out.println("PetalWidth: "+ MaxFrequency(pw) + "\n");
    }

    
    //     function to calculate the frequence of occurance of the given values.
    public static double MaxFrequency(double[] arr){
        HashMap<Double, Integer> count = new HashMap<>();
        for(double num : arr){
            if(!count.containsKey(num)){
                count.put(num, 1);
            }
            else{
                count.put(num, count.get(num) + 1);
            }
        }

        int max = 0;
        double key = 0;
        for(double num : arr){
            if(count.get(num) > max){
                max = count.get(num);
                key = num;
            }
        }

        return key;

    }
    
    
//     function to fetch the max value.
    public static void Max(double[] sl, double[] sw, double[] pl, double[] pw){
        
        System.out.println("sepalLength: "+ sl[sl.length - 1]);
        System.out.println("sepalWidth: "+ sw[sl.length - 1]);
        System.out.println("petalLength: "+ pl[sl.length - 1]);
        System.out.println("PetalWidth: "+ pw[sl.length - 1] + "\n");
    }

    
    //     function to fetch the max value.
    public static void Min(double[] sl, double[] sw, double[] pl, double[] pw){
        
        System.out.println("sepalLength: "+ sl[1]);
        System.out.println("sepalWidth: "+ sw[1]);
        System.out.println("petalLength: "+ pl[1]);
        System.out.println("PetalWidth: "+ pw[1] + "\n");
    }

    //     function to to read csv file and store it in 2D array.
    static String[][] CSVReader_fun(){
        String[][] data = new String[200][6];
        try{
            File file = new File("Iris.csv");
            Scanner read = new Scanner(file);
            String[] line = new String[20];

            
            int j = -1;

            while(read.hasNextLine()){
                nrow++;
                line = read.nextLine().split(",");
                for(int k = 0; k < 6; k++){
                    data[nrow][++j] = line[k];
                    }
                j = -1; 
                
                }
            
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            return data;
            
        }
        
//     Main funtion.
    public static void main(String args[]){
        String[][] data = CSVReader_fun();
        String[][] setosa = new String[50][5];

        Mean(data);               

        
        double[] setosa_sl = new double[51];
        double[] setosa_sw = new double[51];
        double[] setosa_pl = new double[51];
        double[] setosa_pw = new double[51];
        double[] versicolor_sl = new double[51];
        double[] versicolor_sw = new double[51];
        double[] versicolor_pl = new double[51];
        double[] versicolor_pw = new double[51];
        double[] virginica_sl = new double[51];
        double[] virginica_sw = new double[51];
        double[] virginica_pl = new double[51];
        double[] virginica_pw = new double[51];

        int j = -1;
        for(int i = 1; i <= 50 ; i++){
            j++;
            setosa_sl[j] = Double.parseDouble(data[i][1]);
            setosa_sw[j] = Double.parseDouble(data[i][2]);
            setosa_pl[j] = Double.parseDouble(data[i][3]);
            setosa_pw[j] = Double.parseDouble(data[i][4]);
        }
        j = -1;
        for(int i = 51; i <= 100 ; i++){
            j++;
            versicolor_sl[j] = Double.parseDouble(data[i][1]);
            versicolor_sw[j] = Double.parseDouble(data[i][2]);
            versicolor_pl[j] = Double.parseDouble(data[i][3]);
            versicolor_pw[j] = Double.parseDouble(data[i][4]);
            
        }
        j = -1;
        for(int i = 101; i <= 150 ; i++){
            j++;
            virginica_sl[j] = Double.parseDouble(data[i][1]);
            virginica_sw[j] = Double.parseDouble(data[i][2]);
            virginica_pl[j] = Double.parseDouble(data[i][3]);
            virginica_pw[j] = Double.parseDouble(data[i][4]);
            
        }
        
        Arrays.sort(setosa_sl);
        Arrays.sort(setosa_sw);
        Arrays.sort(setosa_pl);
        Arrays.sort(setosa_pw);
        Arrays.sort(versicolor_sl);
        Arrays.sort(versicolor_sw);
        Arrays.sort(versicolor_pl);
        Arrays.sort(versicolor_pw);
        Arrays.sort(virginica_sl);
        Arrays.sort(virginica_sw);
        Arrays.sort(virginica_pl);
        Arrays.sort(virginica_pw);

        
        System.out.println("------------------------Median------------------------------");
        System.out.println("Setosa: ");
        Median(setosa_sl, setosa_sw, setosa_pl, setosa_pw);
        System.out.println("versicolor: ");
        Median(versicolor_sl, versicolor_sw, versicolor_pl, versicolor_pw);
        System.out.println("virginica: ");
        Median(virginica_sl, virginica_sw, virginica_pl, virginica_pw);

        System.out.println("---------------------Mode----------------------");
        System.out.println("Setosa: ");
        Mode(setosa_sl, setosa_sw, setosa_pl, setosa_pw);
        System.out.println("versicolor: ");
        Mode(versicolor_sl, versicolor_sw, versicolor_pl, versicolor_pw);
        System.out.println("virginica: ");
        Mode(virginica_sl, virginica_sw, virginica_pl, virginica_pw);

        System.out.println("-----------------Min-----------------------");
        System.out.println("Setosa: ");
        Min(setosa_sl, setosa_sw, setosa_pl, setosa_pw);
        System.out.println("versicolor: ");
        Min(versicolor_sl, versicolor_sw, versicolor_pl, versicolor_pw);
        System.out.println("virginica: ");
        Min(virginica_sl, virginica_sw, virginica_pl, virginica_pw);

        System.out.println("-----------------Max-----------------------");
        System.out.println("Setosa: ");
        Max(setosa_sl, setosa_sw, setosa_pl, setosa_pw);
        System.out.println("versicolor: ");
        Max(versicolor_sl, versicolor_sw, versicolor_pl, versicolor_pw);
        System.out.println("virginica: ");
        Max(virginica_sl, virginica_sw, virginica_pl, virginica_pw);
    }
}
