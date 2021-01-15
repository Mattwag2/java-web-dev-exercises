package exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Studio3 {
    public static void main(String[] args) {
        HashMap<Character, Integer> charsInString = new HashMap<>();
        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = myString.toCharArray();
 //Now loop through string, put each char into the hashmap with the count (new char, new count)
        for (char i: charactersInString){
            if (charsInString.containsKey(i)) {
                int newCount = charsInString.get(i) + 1;
                charsInString.put(i, newCount);
            } else {
                charsInString.put(i,1);

            }


        }

        System.out.println(charsInString);

    }
}
