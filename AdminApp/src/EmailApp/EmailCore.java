package EmailApp;
import java.util.*;

public class EmailCore {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String alt_Email;



    //1.Building the constructor to receive the first name and last name from the user

    public EmailCore(String firstName, String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("YAY! YOU HAVE CREATED YOUR EMAIL! "+firstName+" "+lastName);

        //After user enters their first and last name, we want them to enter their department
        //to do this we will call the setDepartment()
        this.department=setDepartment();
        System.out.println("You're in the "+this.department+" Department");

    }



    //2.Asking for the department
    private String setDepartment()
    {
        //creating user prompt
        System.out.print("DEPARTMENT CODE #\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nENTER YOUR CODE #:");
        Scanner userInput=  new Scanner(System.in);
        int userDepartment_Selection= userInput.nextInt();

        //checking the value for userDepartment_Selection
        switch (userDepartment_Selection){
            case 0: return ""; //if the userDepartment Selection is 0
            case 1: return "Sales";
            case 2: return "Development";
            case 3: return "Accounting";
            default:
                System.out.println("Invalid input, please try again!");
        }
        return "";
    }


    //3. Generating a random password

    //4. Setting the mailbox capacity


    //5. Setting the alternative email


    //6. Changing the password



}
