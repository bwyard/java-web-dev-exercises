package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrListPractice {
    public static Integer addEvens(ArrayList<Integer> numList){
        int sumOfEvnes =  0;
        for (Integer i: numList){
            if (i%2 == 0){
                sumOfEvnes += i;
            }
        }
        return sumOfEvnes;
    }
    public static void printXLetterWords(List<String> wordList){
        Scanner input = new Scanner(System.in);
        System.out.println("What size words would you like to see?:");
        double xNum = input.nextDouble();
        input.close();
        for(String wordCheck: wordList){
            if (wordCheck.length() == xNum){
                System.out.println(wordCheck);
            }
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(2);
        numberList.add(7);
        numberList.add(12);
        numberList.add(4);
        numberList.add(6);
        numberList.add(5);
        numberList.add(7);
        numberList.add(17);
        numberList.add(8);
        numberList.add(111);
        System.out.println(addEvens(numberList));

//        ArrayList<String> listOfWords = new ArrayList<>();
//        listOfWords.add("hello");
//        listOfWords.add("brent");
//        listOfWords.add("sausage");
//        listOfWords.add("kite");
//        listOfWords.add("killer");
//        listOfWords.add("one");
//        listOfWords.add("two");
//        listOfWords.add("three");

        String practiceString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] strOfArray = practiceString.split(" ");
        List<String> practiceArrayString = Arrays.asList(strOfArray);

        printXLetterWords( practiceArrayString);
    }
}
