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
    /*The algorith of this method is
     * 1 to create a list of char from the input char, *
     * 2 create a string builder with the same length as the input string
     * 3 for each index of the list of char:
     * a) generate a random index from the size of this list minus 1 
     * b) remove the char at that index from  the list of char 
     * c) push it back to the string builder
     * 4 finaly return the string value of the string builder
     */

    public static String shuffle(String input){
        //create a list of characters from the input string
        List<Character> characters = new ArrayList<>();
        for(char c:input.toCharArray()){
            characters.add(c);
        }
        //create a new string builder object with the same lenght as the input string
        StringBuilder output = new StringBuilder(input.length());

        while(characters.size()!=0){

            //generate random index from 0 to the size of 'characters' minus -1
            int randPicker = (int)(Math.random()*characters.size());

        /*characters.remove(randPicker): that call removes and removes the char 
        at the index randPicker from the characters list 'characters'  */
            //push the char removed from the characters list to the back of output
            output.append(characters.remove(randPicker));
        }
        //return the string value of output
        return output.toString();

    }
}