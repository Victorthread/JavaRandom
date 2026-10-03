import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   Scanner scanner = new  Scanner(System.in);
   System.out.println("Enter your name: ");

   String name = scanner.next();
System.out.print("Hello " + name);

System.out.print("How old are you?");

int age = scanner.nextInt();

System.out.print("You are " + age + " years old");
   scanner.close();
    }
}
