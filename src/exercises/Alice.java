package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String aliceFirstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("Please enter a search term to attempt to locate in the first sentence of 'Alice's Adventure in Wonderland':");
        String searchText = input.nextLine();
        input.close();
        boolean found = aliceFirstSentence.toLowerCase().contains(searchText);
        int indexOfTerm = aliceFirstSentence.indexOf(searchText);
        int lengthOfTerm = searchText.length();
        System.out.println("Was the search term located: " + found);

        System.out.println("the index is " + indexOfTerm +". The length of the search term is " + lengthOfTerm +".");
        String modifiedSentence = aliceFirstSentence.substring(0,indexOfTerm).concat(aliceFirstSentence.substring((indexOfTerm+lengthOfTerm)));
        System.out.println(modifiedSentence);
    }
}
