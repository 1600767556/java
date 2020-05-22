package Example3;

public class ArrayCopy {
    public static void main(String[] args) {
        int [] str = {1,2,3,4,5,6};
        int [] dest = new int[20];
        System.arraycopy(str,0,dest,3,5);
        for (int i = 0; i <dest.length ; i++) {
            System.out.println(dest[i]);
        }

        String [] strs = {"A","b","c","d"};
        String [] newString = new String[10];
        System.arraycopy(strs,0,newString,0,strs.length);
        for (int i = 0; i <newString.length ; i++) {
            System.out.println(newString[i]);
        }
        System.out.println("+++++++++++++++++++++++++");
        Object [] obj = {new Object(),new Object(),new Object()};
        Object [] newObj = new Object[10];
        System.arraycopy(obj,0,newObj,0,obj.length);
        for (int i = 0; i <newObj.length ; i++) {
            System.out.println(newObj[i]);
        }
    }
}
