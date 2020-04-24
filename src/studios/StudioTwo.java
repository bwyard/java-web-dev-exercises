package studios;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudioTwo {

    public static void main(String[] args) throws IOException{
        HashMap<Character, Integer> characterMap = new HashMap<>();
        //String hiddenQuote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        File text = new File("C:\\Users\\bwyar\\Documents\\lc101\\src\\studios\\wowmatrix-export.txt");
        Scanner fileScan = new Scanner(text);
        String add = "Added to file";
        Path path = Paths.get(text.getPath());
        int line = 21;


        OutputStream os;
        os = new FileOutputStream(text, true);
        os.write("\n".getBytes());
        os.write(add.getBytes());
        os.close();


//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a string");
//        String str = input.nextLine();
//        input.close();
        int lineNumber = 1;
        while (fileScan.hasNextLine()) {
            String str = fileScan.nextLine();

            if (lineNumber == line+1){
                //System.out.println(line+ " " + str);

                if (!str.toLowerCase().equals(add.toLowerCase())){
                    System.out.println(line + "" + str);
                    List<String> addLine = Files.readAllLines(path, StandardCharsets.UTF_8);
                    addLine.add(line,add);
                    Files.write(path,addLine, StandardCharsets.UTF_8);
                }
            }
            lineNumber++;
            str = str.toLowerCase();
            str = str.replaceAll("[^a-z]", "");
            //str = str.replaceAll(" ", "");
            char[] charactersInString = str.toCharArray();
            for (char c : charactersInString) {
                if (characterMap.containsKey(c)) {
                    characterMap.put(c, characterMap.get(c) + 1);
                } else {
                    characterMap.put(c, 1);
                }

            }
        }
        for (Map.Entry<Character, Integer> character : characterMap.entrySet()) {
              System.out.println(character.getKey() + " : " + character.getValue());
           }
       }
}

