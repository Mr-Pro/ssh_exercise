/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-08-03.
 */
public class TestMulThread {


    public static void main(String[] args){
        Test test = new Test();
       new Thread(() -> {
           int i = 0;
           while (true){
               if (i > 10000000){
                   break;
               }
               test.test();
               System.out.println("1");
               i++;
           }
       }).start();

        new Thread(() -> {
            int i = 0;
            while (true){
                if (i > 10000000){
                    break;
                }
                test.test();
                System.out.println("2");
                i++;
            }
        }).start();
    }

}

class Test{

    void test(){
        System.out.print("test");
    }
}