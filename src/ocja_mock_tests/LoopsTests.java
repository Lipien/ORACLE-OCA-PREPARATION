package ocja_mock_tests;

public class LoopsTests {
    public static void main(String[] args) {

       // EXAMPLE 1
        int count = 0;
        ROW_LOOP:
        for(int row =1; row <=3; row++)
            for (int col = 1; col<=2;col++){
                if(row*col % 2 ==0) continue  ROW_LOOP;
                count ++; //separate statement; works when if is false
            }
        System.out.println(count); // 2
    }
}
