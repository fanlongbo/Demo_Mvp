package coding.mvp.android.com.demo_mvp.mvpdemo2.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by fanlongbo on 2018/1/19.
 */

public abstract class BaseMvpActivity<T extends BaseCallBackListen<?>, P extends BasePresenter<T>> extends Activity {
    private P presenter;
    private T callBackListen;

    public abstract P createPresenter();

    public abstract T createCallBackListen();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
        callBackListen = createCallBackListen();
        if (presenter != null) {
            presenter.setCallBackListen(callBackListen);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.setCallBackListen(null);
        }
    }

    public P getPresenter() {
        return presenter;
    }
}
