package coding.mvp.android.com.demo_mvp.mvpdemo1;

/**
 * Created by fanlongbo on 2018/1/19.
 */

public interface MainCallBackListen {
    void onPrepare();
    void onFail();
    void onExcepiton();
    void onSuccess(String msg);
}
