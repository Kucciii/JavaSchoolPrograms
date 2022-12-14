// Step 1: Input a string
// Step 2: Extract the first word.
// Step 3: Biggest Word = Smallest Word = First Word
// Step 4: Extract next word
// Step 5: If next word > biggest word, biggest word = next word
// Step 6: If next word < smallest word, smallest word = next word

import java.io.DataInputStream;

public class stringprog {
    public static void main(String[] args) throws Exception {
        DataInputStream ob = new DataInputStream(System.in);
        String s, w1="", w2="", bg="", sm="";
        System.out.print("Enter a string: ");
        s = ob.readLine();
        s = s.trim();
        s = s + " ";
        w1 = s.substring(0, s.indexOf(" "));
        bg = w1;
        sm = w1;

        for(int x=s.indexOf(" ")+1; x<s.length(); x++)
        {
            char c = s.charAt(x);
            if(c!=' ')
            {
                w2 = w2 + c;
            }
            else
            {
                if(w2.length() > bg.length()) 
                    bg = w2;
                else if(w2.length() < sm.length())
                    sm = w2;
                w2 = "";
            }
        }
        System.out.println("Smallest Word: " + sm);
        System.out.println("Biggest Word: " + bg);
    }
}

