package coding.mvp.android.com.demo_mvp.mvpdemo2.base;

/**
 * Created by fanlongbo on 2018/1/19.
 */

public class BasePresenter<T extends BaseCallBackListen> {
    private T callBackListen;
    public void setCallBackListen(T t) {
        this.callBackListen = t;
    }

    public T getCallBackListen(){
        return callBackListen;
    }
}
