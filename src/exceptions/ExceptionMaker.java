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

/*class DoSomething {
public void go() {
        System.out.print("A");
        try {
             stop();
             } catch (ArithmeticException e) {
             System.out.print("B");
             } finally {
             System.out.print("C");
             }
         System.out.print("D");
         }
 public void stop() {
         System.out.print("E");
         Object x = null;
         x.toString();
         System.out.print("F");
         }
 public static void main(String[] args) {
         new DoSomething().go();
         }
 }*/

/*class Dog {
    public String name;

    public void parseName() {
        System.out.print("1");
        try {
            System.out.print("2");
            int x = Integer.parseInt(name);
            System.out.print("3");
        } catch (NumberFormatException e) {
            System.out.print("4");
        }
    }

    public static void main(String[] args) {
        Dog leroy = new Dog();
        leroy.name = "Leroy";
        leroy.parseName();
        System.out.print("5");
    }
}*/

/*class Cat {
public String name;
public void parseName() {
         System.out.print("1");
         try {
             System.out.print("2");
             int x = Integer.parseInt(name);
             System.out.print("3");
             } catch (NullPointerException e) {
             System.out.print("4");
             }
         System.out.print("5");
         }
public static void main(String[] args) {
         Cat leo = new Cat();
         leo.name = "Leo";
         leo.parseName();
         System.out.print("6");
         }
 }*/

/*
class Mouse {
    public String name;

    public void run() {
        System.out.print("1");
        try {
            System.out.print("2");
            name.toString();
            System.out.print("3");
        } catch (NullPointerException e) {
            System.out.print("4");
            throw e;
        }
        System.out.print("5");
    }

    public static void main(String[] args) {

         System.out.print("a");
         try {
             System.out.print("b");
             throw new IllegalArgumentException();
             } catch (IllegalArgumentException e) {
             System.out.print("c");
             throw new RuntimeException("1");
             } catch (RuntimeException e) {
             System.out.print("d");
             throw new RuntimeException("2");
             } finally {
             System.out.print("e");
             throw new RuntimeException("3");
             }
        }
}*/
