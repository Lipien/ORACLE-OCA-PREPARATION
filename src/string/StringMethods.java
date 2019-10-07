package string;

public class StringMethods {
    private char index;

    public static void main(String[] args) {
        String pirateMessage = " Buried Treasure Chest! ";

        char c1 = pirateMessage.charAt(4);
        System.out.println(c1);

        int i1 = pirateMessage.indexOf('u');
        System.out.println(i1);

        int i4 = pirateMessage.indexOf("Treasure", 10);
        System.out.println(i4);

        String string = "box";
        int value1 = string.length();
        System.out.println(value1);

        String c = pirateMessage.concat("Weigh anchor!");
        System.out.println(c);

        String s1 = pirateMessage.replace('B', 'J');
        System.out.println(s1);

        boolean b1 = pirateMessage.startsWith(" Buried Treasure");
        System.out.println(b1);

        boolean e1 = pirateMessage.endsWith("Treasure Chest! ");
        System.out.println(e1);

        String ss2 = pirateMessage.substring(9, 10);
        System.out.println(ss2);

        String ss3 = pirateMessage.substring(9, 23);
        System.out.println(ss3);

        String l1 = pirateMessage.trim(); //erases spaces in front and end
        System.out.println(l1);

        String msg = " Maroon the First Mate with a flagon of water and a pistol! ";
        msg = msg.trim().replace("First Mate","Quartermaster")
                .substring(0,47) + ".";
        System.out.println(msg);

        Boolean b13 = pirateMessage.equalsIgnoreCase
                (" Buried TREASURE Chest! ");
        System.out.println(b13);
    }
}
