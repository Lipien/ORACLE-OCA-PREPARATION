package polymorphism_and_casts;

public class SmartPhone extends Phone {
    public void sendEmail(String message, String address) {
        System.out.println("SmartPhone: Sending Email");
        /* Logic to send email message */
    }

    public String retrieveEmail() {
        System.out.println("SmartPhone: Retrieving Email");
        String messages = new String();
        /* Return a String containing all of the messages*/
        return messages;
    }

    @Override
    public boolean isRinging() {
        System.out.println("SmartPhone: Checking if phone is ringing");
        boolean ringing = false;
        /* Check for email activity and only continue when there is none. */
        /* Check if the phone is ringing and set the ringing variable */
        return ringing;
    }
}
