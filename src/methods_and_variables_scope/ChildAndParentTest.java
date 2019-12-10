package methods_and_variables_scope;

public class ChildAndParentTest {
    public static void main(String[] args) {
        ChildClass childClass1 = new ChildClass();
        ChildClass childClass2 = new ChildClass("test");

        ChildClass childClass = new ChildClass();
        System.out.println(childClass.className());
        int j;
        for (j = 0; j <19; ){
            j++;
            ++j;
        }
        System.out.println(j);
    }
}
