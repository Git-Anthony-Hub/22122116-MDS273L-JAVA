import java.io.*;
import java.util.*;

public class Lab_6{
    // Vowel count function
    public static int[] vowels(String[] arr){
        int[] v_count = new int[5];

        for(int k=0;k<arr.length;k++){
            for(int j=0;j<arr[k].length(); j++){
                switch(arr[k].charAt(j)){
                    case 'a':
                    v_count[0] += 1;
                    break;
                    case 'e':
                    v_count[1] += 1;
                    break;
                    case 'i':
                    v_count[2] += 1;
                    break;
                    case 'o':
                    v_count[3] += 1;
                    break;
                    case 'u':
                    v_count[4] += 1;
                    break;

                    case 'A':
                    v_count[0] += 1;
                    break;
                    case 'E':
                    v_count[1] += 1;
                    break;
                    case 'I':
                    v_count[2] += 1;
                    break;
                    case 'O':
                    v_count[3] += 1;
                    break;
                    case 'U':
                    v_count[4] += 1;
                    break;
                }

            }

        }
        return v_count;
        // System.out.println("a: "+a+"\ne: "+e);
    }

    // digit count function
    public static int[] digit(String[] arr){
        int[] d_count = new int[10];
        for(int k=0;k<arr.length;k++){
            for(int j=0;j<arr[k].length(); j++){
                switch(arr[k].charAt(j)){
                    case '0':
                        d_count[0] += 1;
                        break;
                    case '1':
                        d_count[1] += 1;
                        break;
                    case '2':
                        d_count[2] += 1;
                        break;
                    case '3':
                        d_count[4] += 1;
                        break;
                    case '5':
                        d_count[5] += 1;
                        break;
                    case '6':
                        d_count[6] += 1;
                        break;
                    case '7':
                        d_count[7] += 1;
                        break;
                    case '8':
                        d_count[8] += 1;
                        break;
                    case '9':
                        d_count[9] += 1;
                        break;
                }
            }
        }

        // System.out.println("0: "+d_count[0] + " , 1:" + d_count[1]);
        return d_count;
        
    }

    // top 5 words
    public static HashMap top_5(String[] arr){
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : arr){
            if(map.containsKey(word)){
                map.put(word, map.get(word) + 1);
            }
            else{
                map.put(word, 1);
            }
        }

        Set<String> keys = map.keySet();
        HashMap<String, Integer> top_5 = new HashMap<>();
        for(int i = 0; i<5; i++){
            Integer max = 0;
            Integer count = 0;
            String maxKey = "";
            for (String key : keys){
                count = map.get(key);
                if (count >= max){
                    max = count;
                    maxKey = key;
                }
                
            }
            top_5.put(maxKey, max);
            map.remove(maxKey);
        }
        return top_5;        
    }

    // Least 5 words
    public static String least_5(String[] arr){
        HashMap<String, Integer> words = new HashMap<>();
        for(String word : arr){
            if(words.containsKey(word)){
                words.put(word, words.get(word) + 1);
            }
            else{
                words.put(word, 1);
            }
        }

        // Convert Map to List of Map entries
        List<Map.Entry<String, Integer>> list = new ArrayList<>(words.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
            public int compare(Map.Entry<String, Integer> o1,
                                Map.Entry<String, Integer> o2){
                                return o1.getValue().compareTo(o2.getValue());
                                }
        });

        Map<String, Integer> sortedMap = new LinkedHashMap<>();

        for(Map.Entry<String, Integer> entry : list){
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // System.out.println(sortedMap);
        
        int i = 0;
        String least_5_words = "";
        for(String key : sortedMap.keySet() ){
            least_5_words +=key  +" : "+ sortedMap.get(key) + "\n";
            i ++;
            if(i == 5){
                break;
            }
        }
                
        return least_5_words;

    }

    // top 5 characters
    public static String top_5_char(String[] arr){
        HashMap<Character, Integer> characters = new HashMap<>();
        for(String word : arr){
            for(int i=0; i<word.length();i++){
                if(characters.containsKey(word.charAt(i))){
                characters.put(word.charAt(i), characters.get(word.charAt(i)) + 1);
                }
            else{
                characters.put(word.charAt(i), 1);
                }
                
            }
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(characters.entrySet()); 

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1,
                                Map.Entry<Character, Integer> o2){
                                    return o1.getValue().compareTo(o2.getValue());
                                }
        });

        HashMap<Character, Integer> sortedChar = new LinkedHashMap<>();
        for(Map.Entry<Character, Integer> entry : list){
            sortedChar.put(entry.getKey(), entry.getValue());
        }

        int i = list.size() - 4;
        int j = 0;
        String top_5_char = "";
        for(Character c : sortedChar.keySet() ){            
            j++;
            if(j == i){
                top_5_char += c  +" = "+ sortedChar.get(c) + "\n";
                i++;
            }
        }
        
        return top_5_char;

    }

    // least 5 characters
    public static String least_5_char(String[] arr){
        HashMap<Character, Integer> characters = new HashMap<>();
        for(String word : arr){
            for(int i=0; i<word.length();i++){
                if(characters.containsKey(word.charAt(i))){
                characters.put(word.charAt(i), characters.get(word.charAt(i)) + 1);
                }
            else{
                characters.put(word.charAt(i), 1);
                }
                
            }
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(characters.entrySet()); 

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1,
                                Map.Entry<Character, Integer> o2){
                                    return o1.getValue().compareTo(o2.getValue());
                                }
        });

        HashMap<Character, Integer> sortedChar = new LinkedHashMap<>();
        for(Map.Entry<Character, Integer> entry : list){
            sortedChar.put(entry.getKey(), entry.getValue());
        }

        int j = 0;
        String least_5_char = "";
        for(Character c : sortedChar.keySet() ){            
            j++;
            least_5_char += c  +" = "+ sortedChar.get(c) + "\n";
            if(j == 5){
                break;
            }
        }
        
        return least_5_char;
    }

    public static void main(String args[]){
        try{
            // reading and saving file in variable.
            File file = new File("text.txt");
            Scanner read = new Scanner(file);
            String txt = "";
            while(read.hasNextLine()){
                txt += read.nextLine();
            }

            // splitting the file as per words and saving in string array..
            String[] arr = new String[10000];
            arr = txt.split(" ");
    
            // vowel count
            int[] v_count = vowels(arr);
            System.out.println("Vowels count: \na:"+v_count[0]+", e:"+v_count[1]+", i:"+v_count[2]+", o:"+v_count[3]+", u:"+v_count[4] + "\n");

            // digit count
            int[] d_count = digit(arr);
            System.out.println("Number count: \n0: "+d_count[0] + "\n" + "1: "+d_count[1] + "\n" + "2: "+d_count[2] + "\n" + "3: "+d_count[3] + "\n" + "4: "+d_count[4] + "\n" + "5: "+d_count[5] + "\n" +
            "6: "+d_count[6] + "\n" + "7: "+d_count[7] + "\n" + "8: "+d_count[8] + "\n" + "9: "+d_count[9] + "\n");

            // top 5 words
            HashMap top_5 =  top_5(arr);
            Set<String> topKeys = top_5.keySet();
            System.out.println("top 5 words and their count: ");
            for(String key : topKeys){
                System.out.println(key + ": " + top_5.get(key));
            }

            // least 5 words
            System.out.println("\nLeast 5 words and their count: \n" + least_5(arr));

            // top 5 characters
            System.out.println("Top 5 Characters are: \n" + top_5_char(arr));
            
            // least 5 characters
            System.out.println("Least 5 Characters are: \n" + least_5_char(arr));

        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}