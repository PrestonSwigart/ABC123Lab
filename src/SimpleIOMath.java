import java.util.Scanner;

/**
 * simple io math project
 * @version 9.27.22
 * @author PSwigart
 */
public class SimpleIOMath {
    private String name;
    private int age;
    private int favNumber;

    /**
     * prompts user with questions and prints text
     */
    public void promptUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("* Sit yourself down, take a seat *");
        System.out.println("* All you gotta do is repeat after me *");
        System.out.print("Enter Your Name: ");
        name = in.nextLine();
        System.out.print("Enter Your Age: ");
        age = in.nextInt();
        System.out.print("Enter Your Favorite Number: ");
        favNumber = in.nextInt();
        System.out.println("I'm gonna teach you how to sing it out");
        System.out.println("Come on, come on, come on");
        System.out.println("Let me tell you what it's all about");
        System.out.println("Reading, writing, arithmetic");
        System.out.println("Are the branches of the learning tree");
    }

    /**
     * prints out info at end of program
     */
    public void printInfo(){
        System.out.println("Your name is: " + name);
        System.out.println("Your age is " + age);
        System.out.println("At your next birthday, you will be " + (age + 1));
        System.out.println("The first prime factor of " + age + " is " + smallestPrimeFactor(age));
        System.out.println("Your favorite number is: " + favNumber);
        System.out.println("Your favorite number squared is: " + favNumber * favNumber);
        System.out.println("* end of program *");

    }

    /**
     * figures out if number is prime
     */
    private boolean isPrime(int num) {
        for(int i = 2; i <= Math.sqrt(num)+1; i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }

    /**
     * finds smallest prime factor
     */
    private int smallestPrimeFactor(int num){
        for(int i = 2; i  <= num; i++){
            if(isPrime(i)){
                if(num % i == 0)
                    return i;
            }
        }
        return num;
    }

    /**
     * Main method for class SimpleIOMath
     * @param args command-line arguments if needed
     */
    public static void main(String[] args) {
        SimpleIOMath doofus = new SimpleIOMath();
        doofus.promptUser();
        doofus.printInfo();
    }
}
