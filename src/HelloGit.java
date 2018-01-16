import java.util.Scanner;
/**
 *
 * @author User
 */
public class HelloGit {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = input.nextLine();
        System.out.println("Hello" + name);
    }
    
}
