import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @suthor liangfeng
 * @create 2018-10-21 19:04)
 */
public class UserInputIO {
    private BufferedReader bufferedReader;
    public UserInputIO(){
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));//接收键盘输入
    }
    //读取键盘输入的一行
    public String getInputLine(){
        String inputline = null;
        try{
            inputline = bufferedReader.readLine();
        }catch(Exception e){
            e.printStackTrace();
        }
        return inputline;
    }
}
