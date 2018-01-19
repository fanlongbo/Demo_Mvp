package coding.mvp.android.com.demo_mvp.mvpDemo3.base;

import java.util.Map;

/**
 * Created by fanlongbo on 2018/1/19.
 */

public class BasePresenter {
    private Map<String ,? extends BaseCallBackListen> callBackMap;
    public void setCallBackListen(Map<String ,BaseCallBackListen> t) {
        this.callBackMap = t;
    }

    public BaseCallBackListen getCallBackListen(String methodName){
        if(callBackMap != null){
            return callBackMap.get(methodName);
        }else{
            return null;
        }
    }
}
