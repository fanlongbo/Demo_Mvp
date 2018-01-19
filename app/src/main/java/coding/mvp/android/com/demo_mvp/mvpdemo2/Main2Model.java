package coding.mvp.android.com.demo_mvp.mvpdemo2;

/**
 * Created by fanlongbo on 2018/1/19.
 */

public class Main2Model {
    public void requestMainData(Main2CallBackListen callBackListen){
        if(callBackListen != null){
            callBackListen.onSuccess("获取MainData 成功");
        }
    }
}
