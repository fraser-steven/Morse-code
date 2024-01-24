import java.util.Scanner;

public class main {
    

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name; 
        String userText;
        byte userChoice;
        Translator translatorMachine = new Translator();

        System.out.println("===MORSE CODE TRANSLATOR===")
        System.out.println("What is your name?");
        name = input.nextLine();
        translatorMachine.printChoiceList();
        System.out.println("Hello " + name + ", please input your choice : ");
        userChoice = Byte.parseByte(input.nextLine());
    }

    translatorMachine.SetChoice(userChoice);
    if(userChoice == 1) {

        System.out.println("Input your text : ");
    } else {

        System.out.println("Input your morse code : ");
        userText = input.nextLine();
    }

    translatorMachine.RunTranslation(userText);
    translatorMachine.printResult();
}
