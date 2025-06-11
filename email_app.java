
import java.util.*;

public class email_app {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name:");
        String name1=sc.nextLine();
        System.out.println("Enter last name");
        String name2=sc.nextLine();

        email em1 = new email(name1, name2);
        System.out.println(em1.showInfo());


    }
}
