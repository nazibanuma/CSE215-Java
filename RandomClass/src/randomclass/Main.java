package randomclass;

public class Main {

    public static void main(String[] args) {

        char lowercase = RandomALL.getRandomLowerCaseLetter();
        char uppercase = RandomALL.getRandomUpperCaseLetter();
        char digitcase = RandomALL.getRandomDigitCharacter();
        char randomcase = RandomALL.getRandomCharacter();

        System.out.println(lowercase);
        System.out.println(uppercase);
        System.out.println(digitcase);
        System.out.println(randomcase);
       
    }
