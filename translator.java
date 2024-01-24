package java_project.morse_code_translator;

public class Translator {

    private String[] morseCode
            = { // minus = 1 dot = 0
                "10", //A
                "1000", //B
                "1010", //C
                "100", //D
                "0", //E
                "0010", //F
                "110", //G
                "0000", //H
                "00", //I
                "0111", //J
                "101", //K
                "0100", //L
                "11", //M
                "10", //N
                "111", //O
                "0110", //P
                "1101", //Q
                "010", //R
                "000", //S
                "1", //T
                "001", //U
                "0001", //V
                "011", //W
                "1001", //X
                "1011", //Y
                "1100", //Z
                "11111", // 0
                "01111", //1
                "00111", //2
                "00011", //3
                "00001", //4
                "00000", //5
                "10000", //6
                "11000", //7
                "11100", //8
                "11110", //9
            };

    private String plainText;
    private String morseText;
    private byte choice;

    public void SetChoice(byte input) {

        if (input == 1 || input == 2) {

            choice = input;
        }
    }

    public void printChoiceList() {

        System.out.println("Choice");
        System.out.println("1. Encode");
        System.out.println("2. Decode");
    }

    public boolean checkUserChoice(byte userChoice) {

        return userChoice == 1 || userChoice == 2;
    }

    public void printResult() {

        System.out.println("=== RESULT ===");
        if (option == 1) {

            System.out.println("Your input : " + morseCode);
            System.out.println("Morse Code :" + morseText);

        } else if (option == 2) {

            System.out.println("Your morse code : " + morseText);
            System.out.println("Your message : " + plainText);
        }
    }
}
