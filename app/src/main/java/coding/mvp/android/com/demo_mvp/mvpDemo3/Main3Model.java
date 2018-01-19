package coding.mvp.android.com.demo_mvp.mvpDemo3;

/**
 * Created by fanlongbo on 2018/1/19.
 */

public class Main3Model {
    public void requestMain3Data(Main3CallBackListen callBackListen){
        if(callBackListen != null){
            callBackListen.onSuccess("Demo3 测试 成功");
        }
    }

    public void requestMain3IntegerData(Main3CallBackNumberListen callBackListen){
        if(callBackListen != null){
            callBackListen.onSuccess(333333);
        }
    }
}
