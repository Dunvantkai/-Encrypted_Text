public class Text_unencrypt {
    public static void main(String[] args) {
        String userInput = "rhp";
        String UperUserInput = userInput.toUpperCase();
        int lenthOfInput = UperUserInput.length();
        int seed = 7;
        int place = 0;
        String encry = (">");
        String auf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";

        while (place < lenthOfInput) {
            char letter = UperUserInput.charAt(place);

            int NumberinAuf = auf.indexOf(letter);
            if (NumberinAuf != -1) {
                int AfterNumberinAuf = (NumberinAuf - seed) % auf.length();
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
//made by kai