package Example9.bean;
/*
用户业务类
 */
public class UserService {
    public boolean login(String name,String passwrod){
        /**
         * 登录方法
         */

        if ("admin".equals(name)&&"123".equals(passwrod)){
            return true;
        }
        return false;
    }

    public void login(int i){

    }
    public void logout(){
        System.out.println("系统已安全退出");

    }

}
