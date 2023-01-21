import java.util.List;
import java.util.ArrayList;
public class Shuffle{


    public static void main(String[] args) {
        System.out.println("/******************Shuffle strings*****************/");
        String str;

        str="eating";
        System.out.println("str: "+str);
        System.out.println("shuffle(str): "+shuffle(str));

        str="drinking";
        System.out.println("str: "+str);
        System.out.println("shuffle(str): "+shuffle(str));

        str="We're gonnna learn how to shuffle strings in java";
        System.out.println("str: "+str);
        System.out.println("shuffle(str): "+shuffle(str));
        

        
    }

    public static String shuffle(String input){
        List<Character> characters = new ArrayList<>();
        for(char c:input.toCharArray()){
            characters.add(c);
        }
        StringBuilder output = new StringBuilder(input.length());
        while(characters.size()!=0){
            int randPicker = (int)(Math.random()*characters.size());
            output.append(characters.remove(randPicker));
        }
        return output.toString();

    }
}