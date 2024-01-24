public class translator {

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
        if (choice == 1) {

            System.out.println("Your input : " + morseCode);
            System.out.println("Morse Code :" + morseText);

        } else if (choice == 2) {

            System.out.println("Your morse code : " + morseText);
            System.out.println("Your message : " + plainText);
        }
    }

    public void RunTranslation(String input) {

        switch(choice) {

            case 1:
                plainText = input.toUpperCase()
                morseText = Encode();
                break;

            case 2:
                morseText = input;
                plainText = Decode();
                break;
        }
    }

    private String Encode() {

        String outputMorse = "";
        for(int i = 0; i < plainText.length(); i++) {

            if(((int) plainText.charAt(i) >= 65 && (int) plainText.charAt(i) <= 90)) {

                outputMorse += numToMorse((int) plainText,charAt(i) - 65) + " ";

            } else if ((int) plainText.charAt(i) == 32) {

                outputMorse += " ";
            } else if ((int) plainText.charAt(i) >= 48 && (int) plainText.charAt(i) <= 57) {

                outputMorse += numToMorse((int) plainText.charAt(i) - 22) + " ";
            }
        }
        return outputMorse;
    }

    private String numToMorse(int i) {

        String numToMorseSTR = "";
        for(int i = 0; j < morseCode[i].length(); i++) {

            if(morseCode[i].charAt(i) == '1') {
                
                numToMorseSTR += '-';
            } else {

                numToMorseSTR += '.';
            }
        }
        return numToMorseSTR;
    }

    private String Decode() {

        String outputPlainText = "";
        String save = "";
        boolean isMorse = false;
        for (int i = 0; i < morseText.length(); i++) {

            if(morseText.charAt(i) != ' ') {

                save += morseText.charAt(i);
                if(i == morseText.length() - 1){

                    for (int j = 0; j < morseCode.length; j++) {
                    if (morseToNum(save).equals(morseCode[j])) {

                        if (j < 26) {

                            outputPlainText += ((char) (j + 65)) + " ";
                        } else {

                            outputPlainText += ((char) (j + 10)) + " ";
                        }
                        isMorse = true;
                        break;
                    }
                }
                if(isMorse == false) {

                    outputPlainText += '#' + " ";
                }
                }
            } else {

                for(int j = 0; j < morseCode.length; j++) {

                    if (morseToNum(save).equals(morseCode[j])) {

                        if (j < 26) {

                            outputPlainText += ((char) (j + 65)) + " ";
                        } else {

                            outputPlainText += ((char) (j + 10)) + " ";
                        }
                        isMorse = true;
                        break;
                    }
                }
                if (isMorse == false) {

                    outputPlainText += '#' + " ";
                }
            save = "";
            }            
        }
        return outputPlainText;
    }

    public String morseToNum(String save) {

        String morseToNumSTR = ' ';
        for(int i = 0; i < save.length(); i++) {

            if(save.charAt(i) == '-' || save.charAt == '_') {

                morseToNumSTR += '1';

            }else if(save.charAt(i) == '.' || save.charAt(i) == '*') {

                morseToNumSTR += '0'
            }
        }
        return morseToNumSTR;
    }

}
