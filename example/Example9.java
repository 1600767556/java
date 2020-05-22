package example;

public  class Example9 {
    public static void main(String[] args) {
        Example9Telphone t1 = new Example9Cellphone();
        t1.call();
        t1.message();
        Example9Telphone t2 = new Example9Smartphone();
        t2.call();
        t2.message();
        Example9IPlayGames ip1 = new Example9Smartphone();
        ip1.playGames();
        Example9IPlayGames ip2 = new Example9Psp();
        ip2.playGames();
        Example9IPlayGames ip3 = new Example9IPlayGames() {
            @Override
            public void playGames() {
                System.out.println("使用匿名内部类的方式实现接口");
            }
        };
        ip3.playGames();

        new Example9IPlayGames(){

            @Override
            public void playGames() {
                System.out.println("使用匿名内部类的方式实现接口2");
            }
        }.playGames();


    }
}
