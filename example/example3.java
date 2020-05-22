package example;

public class example3 {
    public static void main(String[] args) {
       nums();
        for (int i = 10; i >0 ; i--) {
            if (i==5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Ex");
    }
     public static void nums(){
         for (int i = 0; i < 10; i++) {
             if (i==6){
                 break;
             }
             System.out.println("i->"+i);
         }
         System.out.println("Hello!");

     }
}
