/**
 * @suthor liangfeng
 * @create 2018-10-21 19:10)
 */
public class Main {
    public static void main(String[] args) {
        UserAdminUI userAdminUI = new UserAdminUI();
        userAdminUI.loadUI();

        MainLooper mainLooper = new MainLooper();
        mainLooper.loop();
    }
}
