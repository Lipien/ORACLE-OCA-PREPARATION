package polymorphism_and_casts;

abstract class Writer {
    public static void write() {
        System.out.println("Writing...");
    }
}

class Author extends Writer {
    public static void write() {
        System.out.println("Writing book");
    }
}

class Programmer {
    public static void write() {
        System.out.println("Writing code");
    }

    public static void main(String[] args) {
        Programmer w = new Programmer();
        w.write(); // Writing code

       /* Writer u = new Programmer();
        u.write(); //Writing...
    }*/
    }
}