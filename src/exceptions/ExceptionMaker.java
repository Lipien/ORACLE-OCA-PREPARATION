package exceptions;

public class ExceptionMaker {
    public static void main(String[] args) {
        ExceptionMaker exceptionMaker = new ExceptionMaker();
        try {
            exceptionMaker.throwTestException();
            System.out.println("System works fine");
        } catch (UnpresentObjectException u) {
            System.out.println("Test exception has occurred" + u);
        } finally {
            System.out.println("Always on-line");
        }
    }

    public void throwTestException() throws UnpresentObjectException {
        System.out.println("throwTestException method working");
        throw new UnpresentObjectException("Exception message");
    }
}
