package coding.mvp.android.com.demo_mvp.mvpdemo2.base;

/**
 * Created by fanlongbo on 2018/1/19.
 */

public interface BaseCallBackListen<T> {
    void onPrepare();
    void onFail();
    void onExcepiton();
    void onSuccess(T t);
}
