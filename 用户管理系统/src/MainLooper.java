
/**
 * @suthor liangfeng
 * @create 2018-10-21 19:03)
 */
public class MainLooper {
    private boolean flag = true;
    public UserInputIO userInputIO;
    public MainLooper(){
        userInputIO = new UserInputIO();
    }
    public void loop(){
        while(flag){
            String input = userInputIO.getInputLine();
            System.out.println(input);
        }
    }

}
