package Example3;

public class Array2 {
    public static void main(String[] args) {
        if (args.length!=2){
            System.out.println("使用该系统时请输入用户名和密码...");
            return;
        }

//程序进入到这一步说明用户输入了用户名和密码
        //现在来判断一下用户输入的是否正确
        String username = args[0];
        String password = args[1];
        if ("huxinliang".equals(username) && "158120".equals(password)){
            System.out.println("欢迎您使用该系统");
        }else{
            System.out.println("用户名或者密码错误");
        }
    }
}
