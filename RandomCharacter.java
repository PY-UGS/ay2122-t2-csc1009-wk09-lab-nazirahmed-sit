import java.util.Random;
import java.util.Arrays;

public class RandomCharacter {

    public char getRandomLowerCaseLetter() {
        Random random = new Random();

        char lowercaseletter = (char)(random.nextInt(26) + 'a');
        return lowercaseletter;
    }

    public char getRandomUpperCaseLetter() {
        Random random = new Random();

        char uppercaseletter = (char)(random.nextInt(26) + 'A');
        return uppercaseletter;
    }

    public char getRandomDigitCharacter() {
        Random random = new Random();

        char digitchar = (char) (random.nextInt(10) + '0');
        return digitchar;
    }

    public char getRandomCharacter(){
        Random random = new Random();

        char randomchar = (char) (random.nextInt(95) + 32);
        return randomchar;
    }

    private static boolean isPrime(int inputNum){
        if (inputNum <= 3 || inputNum % 2 == 0)
            return inputNum == 2 || inputNum == 3; //this returns false if number is <=1 & true if number = 2 or 3
        int divisor = 3;
        while ((divisor <= Math.sqrt(inputNum)) && (inputNum % divisor != 0))
            divisor += 2; //iterates through all possible divisors
        return inputNum % divisor != 0; //returns true/false
    }

    public int getPrime(){
        int num = 0;
        Random random = new Random();
        num = random.nextInt(1000) + 1;

        while (!isPrime(num)) {
            num = random.nextInt(1000) + 1;
        }
        return num;
    }

    public static void main(String[] args) {
        char[] lowerCaseLetter=new char[15];
        char[] upperCaseLetter=new char[15];
        char[] digitCharacter=new char[15];
        char[] randomCharacter=new char[15];
        int[] primeNo = new int[15];

        RandomCharacter random = new RandomCharacter();

        System.out.println("Random 15 characters");
        for(int i=0;i<15;i++){
            lowerCaseLetter[i]=random.getRandomLowerCaseLetter();
            upperCaseLetter[i]=random.getRandomUpperCaseLetter();
            digitCharacter[i]=random.getRandomDigitCharacter();
            randomCharacter[i]=random.getRandomCharacter();
            primeNo[i]=random.getPrime();
        }

        System.out.println("Lower Case Letters: "+Arrays.toString(lowerCaseLetter));
        System.out.println("Upper Case Letters: " +Arrays.toString(upperCaseLetter));
        System.out.println("Digit Characters: "+Arrays.toString(digitCharacter));
        System.out.println("Random Characters: " +Arrays.toString(randomCharacter));
        System.out.println("Prime Numbers: "+Arrays.toString(primeNo));

    }

}
