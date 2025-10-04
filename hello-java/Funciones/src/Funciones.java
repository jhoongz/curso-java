import java.util.ArrayList;
import java.util.Arrays;

public class Funciones {

    public static void main(String[] args) {

        for (int index = 0; index < 5; index++)
        {
            sendEmail();

            sendEmailToUser("wolf@mail.com");

            sendEmailToUser("lewolf@mail.com", "LeWolf");

            var users = new ArrayList<>(Arrays.asList("Lobo","Wolf"));
            sendEmailToUser(users);
        }

        sendEmail();
    }



    // Sin parametros

    public static void sendEmail()
    {
        System.out.println("Se envia el e-mail");
    }

    // Con 1 parametro
    public static void sendEmailToUser(String email)
    {
        System.out.println("Se envia el e-mail a "+email);
    }

    // Con 2+ parametros
    public static void sendEmailToUser(String email, String name)
    {
        System.out.println("Se envia el e-mail a "+name+": " + email);
    }

    // Con un Array

    public static void sendEmailToUser(ArrayList<String> emails)
    {
        for(String email: emails)
        {
            System.out.println("Se envia el e-mail a "+email);
        }
    }
}