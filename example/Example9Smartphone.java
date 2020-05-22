package example;


public  class Example9Smartphone extends Example9Telphone implements Example9IPlayGames{
    @Override
    public void call() {
        System.out.println("通过语音打电话");
    }

    @Override
    public void message() {
        System.out.println("通过语音发信息");
    }

    @Override
    public void playGames() {
        System.out.println("智能手机可以玩游戏");
    }
}
