package polymorphism_and_casts;

public class Phone {
    public void callNumber(long number) {
        System.out.println("Phone: Calling number " + number);
        /* Logic to dial number and maintain connection. */
    }

    public boolean isRinging() {
        System.out.println("Phone: Checking if phone is ringing");
        boolean ringing = false;
        /* Check if the phone is ringing and set the ringing variable */
        return ringing;
    }
}
