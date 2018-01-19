package coding.mvp.android.com.demo_mvp.mvpdemo2;


import coding.mvp.android.com.demo_mvp.mvpdemo2.base.BasePresenter;

/**
 * Created by fanlongbo on 2018/1/19.
 */

public class Main2Presenter extends BasePresenter<Main2CallBackListen> {
    private Main2Model model;

    public Main2Presenter() {
        model = new Main2Model();
    }


    public void requestMainData() {
        model.requestMainData(new Main2CallBackListen() {
            @Override
            public void onPrepare() {

            }

            @Override
            public void onFail() {
                if (getCallBackListen() != null) {
                    getCallBackListen().onFail();
                }
            }

            @Override
            public void onExcepiton() {
                if (getCallBackListen() != null) {
                    getCallBackListen().onExcepiton();
                }
            }

            @Override
            public void onSuccess(String msg) {
                if(getCallBackListen() != null){
                    getCallBackListen().onSuccess(msg);
                }
            }
        });
    }
}
