import java.util.Scanner;

public class Text_encrypt{
    public static void main(String[] args) {
        System.out.println("Encrypt Program");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Your Text: ");
        String userInput = myObj.nextLine();
        int seed = 7;
        String UperUserInput = userInput.toUpperCase();
        int lenthOfInput = UperUserInput.length();
        int place = 0;
        String encry = (">");
        String auf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";

        while (place < lenthOfInput) {
            char letter = UperUserInput.charAt(place);

            int NumberinAuf = auf.indexOf(letter);
            if (NumberinAuf != -1) {
                int AfterNumberinAuf = (NumberinAuf + seed) % auf.length();
                char encryLetter = auf.charAt(AfterNumberinAuf);
                String lencry = encry + encryLetter;
                encry = lencry;
                //System.out.println(encry);
            }

            place = place + 1;
        }
        System.out.println(UperUserInput);
        System.out.println(encry);
        }        
}
//Made By Kai 