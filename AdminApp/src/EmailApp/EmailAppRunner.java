package EmailApp;

public class EmailAppRunner {

    public static  void main(String[] args)
    {
        EmailCore firstEmail= new EmailCore("Nuca","Nuci");
        firstEmail.setAltEmail("zax@gmail.com");
        firstEmail.SetEmailCapacity(21);
        System.out.println(firstEmail.getAltEmail());
        System.out.println(firstEmail.getMailBoxCapacity());
    }

}
