public class Main {
    public static void main(String[] args) {
        String text = "We make work HUMAN.\nUnlock full potential. Celebrate positive moments.\nEvery day.";
        String lengthOfString = text.substring(text.indexOf("\n"), text.lastIndexOf("\n"));
        char[] globoforce = "Globoforce".toCharArray();
        char[] temp = new char[globoforce.length];

        for (int i = 0; i < globoforce.length; i++) {
            if (globoforce[i] != 'b') {
                temp[i] = globoforce[i];

            } else {
                temp[i] = '$';
            }

        }


        System.out.println(text + "\n\n" + lengthOfString.length() + "\n\n" + text.toLowerCase() + "\n\n" +
                text.replace("e", "E") + "\n\n" + globoforce.length + "\n");

        for (char a : temp) {
            System.out.print(a);
        }

    }
}
