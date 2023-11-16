import java.util.Scanner;
public class Text_encrypt{
    public static void main(String[] args) {
        System.out.println("Encrypt Program");

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter Your Text: ");
        String userInput = reader.nextLine();

        reader = new Scanner(System.in);
        System.out.print("Enter Your Seed: ");
        int seed = reader.nextInt();

        reader = new Scanner(System.in);
        System.out.println("Type Y to Encrypt");
        System.out.println("Type N to UnEncrypt");
        System.out.println("Type EXIT to Close the Program");
        System.out.print(">: ");
        String enun = reader.nextLine();
        enun = enun.toUpperCase();
        System.out.println(enun);


        String UperUserInput = userInput.toUpperCase();
        int lenthOfInput = UperUserInput.length();
        int place = 0;
        String encry = (">");
        String auf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";

        while (place < lenthOfInput) {
            char letter = UperUserInput.charAt(place);

            int NumberinAuf = auf.indexOf(letter);
            if (NumberinAuf != -1) {
                if (enun.equals("Y")) {    
                    int AfterNumberinAuf = (NumberinAuf + seed) % auf.length();

                    if (AfterNumberinAuf < 0) {
                        AfterNumberinAuf = AfterNumberinAuf + 27;
                    }
                    char encryLetter = auf.charAt(AfterNumberinAuf);
                    String lencry = encry + encryLetter;
                    encry = lencry;
                    //System.out.println(encry);
                }
                if (enun.equals("N")) {
                    int AfterNumberinAuf = (NumberinAuf - seed) % auf.length();

                    if (AfterNumberinAuf < 0) {
                        AfterNumberinAuf = AfterNumberinAuf + 27;
                    }
                    char encryLetter = auf.charAt(AfterNumberinAuf);
                    String lencry = encry + encryLetter;
                    encry = lencry;
                    //System.out.println(encry);
                }
            }

            place = place + 1;
        }
        System.out.println(UperUserInput);
        System.out.println(encry);
        }        
}
//Made By Kai 