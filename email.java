

import java.util.Scanner;

public class email {
   private String firstName;
   private String lastName;
   private String password;
   private String department;
   private String email;
   private int mailboxCapacity=500;
   private int defaultPasswordLength=10;
   private String alternateEmail;
   private String companySuffix="company.com";
   //constructor to receive firstname and last name;
    public email(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("Email created "+this.firstName+" "+this.lastName);
        this.department=setDepartment();
        System.out.println("Department:" +this.department);
        this.password=randomPassword(defaultPasswordLength);
        System.out.println("your password is:" +this.password);
        email=firstName.toLowerCase() +"." + lastName.toLowerCase() +"@"+department +companySuffix;
        System.out.println("ur email is:" +email);

    }
    //ask for department
    private String setDepartment(){
        System.out.println("DEPARTMENT CODES\n 1.for sales \n 2.Development\n 3.Accounting\n 0 for nothing\n enter department:");
        Scanner in=new Scanner(System.in);
        int choice=in.nextInt();
        if(choice==1){return "sales";}
        else if(choice==2){ return "dev";}
        else if(choice==3){return "acct";}
        else{return "";}
    }
    private String randomPassword(int length){
        String paswordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password=new char[length];
        for(int i=0;i<length;i++){
            int rand=(int) (Math.random() * paswordSet.length());
            password[i]=paswordSet.charAt(rand);
        }
        return new String(password);
    }
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity=capacity;

    }

     public void setAlternateEmail(String altEmail){
        this.alternateEmail= altEmail;
     }
     public void changePassword(String password){
        this.password=password;
     }
     public int  getMailboxCapacity(){
        return mailboxCapacity;
     }
     public String getAlternateEmail(){
        return alternateEmail;
     }

    public String getPassword() {
        return password;
    }
    public String showInfo(){
        return "Display name:" +firstName+""+lastName +
                " company Email:"+email+
                " mailbox capacity"+mailboxCapacity;

    }
    // generate random password
    //set mailbox capacity;
    //set alternate email;
    //change pasword


}