package amortization;

import java.util.Arrays;

public class HelperMethods {
    public static String checkDoubleQuotes(String word) {
        String[] letters = word.split("");
        String s = "";
        int count = 0;
        
        for (int i = 0; i < letters.length; i++) 
        {
            s += letters[i];
        }
        s = s.replace("\"", "\" ");
        word = s;
   
        return word;
    }

    public static String[] readingHandler(InputFile file) {
        String line = file.readLine();
        String[] words = line.split("\\s+");
        
        return words;
    }

    public static String separatePeople(String[] words) {
        int count = 0;
        int upperBound = words.length - 1;
        OutputFile bill = new OutputFile("./bill.txt");
        OutputFile mary = new OutputFile("./mary.txt");
        OutputFile austin = new OutputFile("./austin.txt");
        do {
            count++;
            if(count < 16) {
                bill.writeWord(words[count]);
                bill.writeEOL();
            }
            if(count > 15 && count < 30) {
                mary.writeWord(words[count]);
                mary.writeEOL();
            }
            if(count > 30) {
                austin.writeWord(words[count]);
                austin.writeEOL();
            }

            System.out.println(words[count]);
        } while(count < upperBound);
        bill.close();
        mary.close();
        austin.close();
        return "";
    }
}
