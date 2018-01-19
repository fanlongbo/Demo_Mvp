package coding.mvp.android.com.demo_mvp.mvpdemo1;

/**
 * Created by fanlongbo on 2018/1/19.
 */

public class MainModel {
    public void requestMainData(MainCallBackListen callBackListen){
        if(callBackListen != null){
            callBackListen.onSuccess("获取MainData 成功");
        }
    }
}
