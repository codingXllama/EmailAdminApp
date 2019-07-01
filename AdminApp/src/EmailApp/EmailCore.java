package EmailApp;
import java.util.*;

public class EmailCore {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String alt_Email;
    private String email;
    private int passwordLength;
    private String companySuffix;



    //1.Building the constructor to receive the first name and last name from the user

    public EmailCore(String firstName, String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        //System.out.println("YAY! YOU HAVE CREATED YOUR EMAIL! "+firstName+" "+lastName);

        //After user enters their first and last name, we want them to enter their department
        //to do this we will call the setDepartment()
        this.department=setDepartment();
        System.out.println("Your Department is: "+department);


        //After we make the user give us what department they are in
        //we will generate a random password for the user and store in the instance variable
        //before that we must get the random Generated password length
        this.passwordLength=GetPasswordLength();
        this.password=GenerateRandomPassword(passwordLength);
        //System.out.println("Your random generated password is: "+password);

        //Allowing the Admin to enter their company suffix
        this.companySuffix=GetCompanySuffix();
        //After we get the company suffix we will combine all the fName and Lname and companySuffix to form a single email
        email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department.toLowerCase()+"."+companySuffix.toLowerCase();
        System.out.println("The company email is: "+email);

        //Getting the email capacity
        this.mailBoxCapacity=SetEmailCapacity();
        System.out.println("The email capacity is: "+mailBoxCapacity);
    }

git 

    //2.Asking for the department
    private String setDepartment()
    {
        //creating user prompt
        System.out.print("DEPARTMENT CODE #\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nENTER YOUR CODE #: ");
        Scanner userInput=  new Scanner(System.in);
        int userDepartment_Selection= userInput.nextInt();

        //checking the value for userDepartment_Selection
        switch (userDepartment_Selection){
            case 0: return "NONE"; //if the userDepartment Selection is 0
            case 1: return "Sales";
            case 2: return "Development";
            case 3: return "Accounting";
            default:
                System.out.println("Invalid input, please try again!");
        }
        return "";
    }


    //3a. prompting user to give us a password length
    private int GetPasswordLength()
    {
        System.out.print("Enter a # for how long you want the password to be: ");
        Scanner userInput= new Scanner(System.in);
        //returning the password length from the user
        return userInput.nextInt();

    }



    //3b. Generating a random password
    private String GenerateRandomPassword(int passwordLength)
    {
        //This string variable will store the possible characters that can make up a password
        //This variable acts like an array, we will just select select a random character from it and store it in the char[] password variable
        String password_Possible_Characters="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        //this char[] array will store the random generated password up to the size of the passwordLength that is passed in by this method
        char[] randomGeneratedPassword= new char[passwordLength];

        //Generating a random password
        for(int index=0; index<passwordLength;index++)
        {
            //generating a random index from 0 to the size of the password_Possible_Characters
            int randomIndex = (int)(Math.random()*password_Possible_Characters.length());

            //Selecting a random character from the possible pw characters and storing it into the randomGeneratedPassword char variable
            randomGeneratedPassword[index]=password_Possible_Characters.charAt(randomIndex);
        }
        //converting a char array variable into a String using the `new String` keyword
        return new String(randomGeneratedPassword);

    }


    //3c. Allowing the user to enter their company suffix
    private String GetCompanySuffix()
    {
        System.out.print("Enter the company suffix: ");
        Scanner userInput=  new Scanner(System.in);

        return userInput.next()+".com";
    }


    //4. Setting the mailbox capacity

    //4a.
    private int SetEmailCapacity()
    {
        System.out.print("Enter the Email Capacity: ");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

    //5. Setting the alternative email


    //6. Changing the password



}
