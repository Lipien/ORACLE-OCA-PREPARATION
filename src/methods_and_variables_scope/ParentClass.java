package methods_and_variables_scope;

public class ParentClass {

    public ParentClass() {
        System.out.println("ParentClass Constructor");
    }

    public ParentClass(String s) {
        System.out.println("ParentClass Constructor " + s);
    }

    public String className() {
        return " ParentClass ";
    }
}

