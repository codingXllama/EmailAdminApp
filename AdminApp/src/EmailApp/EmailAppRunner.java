package EmailApp;

import java.util.Scanner;

public class EmailAppRunner {

    public static  void main(String[] args)
    {
        EmailCore firstEmail= new EmailCore("Nuca","Nuci");
        Scanner userInput =  new Scanner(System.in);
        System.out.print("Enter alt email: ");
        String altEmail=userInput.next() +".com";
        firstEmail.setAltEmail(altEmail);

        firstEmail.SetEmailCapacity(firstEmail.getMailBoxCapacity());
       // System.out.println(firstEmail.getAltEmail());
        //System.out.println(firstEmail.getMailBoxCapacity());
        System.out.println(firstEmail.showAccountInfo());
    }

}
