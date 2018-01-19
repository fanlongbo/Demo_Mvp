package coding.mvp.android.com.demo_mvp.mvpDemo3.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import java.util.Map;

/**
 * Created by fanlongbo on 2018/1/19.
 */

public abstract class BaseMvpActivity<P extends BasePresenter> extends Activity {
    private P presenter;
    private Map<String ,BaseCallBackListen> callBackMap;

    public abstract P createPresenter();

    public abstract Map<String ,BaseCallBackListen> createCallBackListen();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
        callBackMap = createCallBackListen();
        if (presenter != null) {
            presenter.setCallBackListen(callBackMap);
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
