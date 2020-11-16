package amortization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelperMethods extends Dates 
{

  public static String checkDoubleQuotes(String word) 
  {
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

    public static String[] readingOneLineHandler(InputFile file) 
    {
        String line = file.readLine();
        String[] words = line.split("\\s+");

        return words;
    }

    public static String[] readingHandler(InputFile file) 
    {
        int count = 2;
        String str;
        List<String> list = new ArrayList<String>();

        while (!file.eof()) {
        str = file.readLine();
        count++;
        list.add(str);
        }
        String[] words = list.toArray(new String[0]);

        return words;
    }

  public static String separatePeople(String[] words) 
  {
    int count = 0;
    int upperBound = words.length - 1;
    OutputFile bill = new OutputFile("./bill.txt");
    OutputFile mary = new OutputFile("./mary.txt");
    OutputFile austin = new OutputFile("./austin.txt");
    do {
      count++;
      if (count < 16) 
      {
        bill.writeWord(words[count]);
        bill.writeEOL();
      }
      if (count > 15 && count < 30) 
      {
        mary.writeWord(words[count]);
        mary.writeEOL();
      }
      if (count >= 30) 
      {
        austin.writeWord(words[count]);
        austin.writeEOL();
      }
    } while (count < upperBound);
    bill.close();
    mary.close();
    austin.close();
    return "";
  }

  //only use if it has a trailing white space too
    public static String removeWhiteSpace(String string) 
    {
        string = string.replaceAll("\\s{1,}", ".");
        String str = "";
        String[] strArr = string.split("");
        strArr = Arrays.copyOf(strArr, strArr.length - 1);
        for (String s : strArr) str = str + s;

        return str;
    }
}
