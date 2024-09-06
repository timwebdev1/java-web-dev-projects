package org.launchcode;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String theSentence = "Alice was beginning to get very tired of sitting by her" +
                " sister on the bank, and of having nothing to do: once or twice she had " +
                "peeped into the book her sister was reading, but it had no pictures or " +
                "conversations in it, \'and what is the use of a book,\' thought Alice " +
                "\'without pictures or conversation?";
        System.out.println("Enter a word that might be in the first sentence: ");
        String userWordSearch = input.next().toLowerCase();
        System.out.println(theSentence.toLowerCase().contains(userWordSearch));

//        System.out.println(theSentence.substring(186,194));

        int stringRemovalIndex = theSentence.indexOf(userWordSearch);
        int stringRemovalLength = userWordSearch.length();
        System.out.println("The index location of " + userWordSearch + " is: " + stringRemovalIndex + ", and its length is " + stringRemovalLength);

        String newSentenceString = theSentence.substring(0, stringRemovalIndex) + theSentence.substring(stringRemovalIndex + stringRemovalLength);
        System.out.println(newSentenceString);

//        Replacement method used in chaper exercise solution
        String modifiedSentence = theSentence.replace(userWordSearch, "");
        System.out.println(modifiedSentence);
    }
}
