package coding.mvp.android.com.demo_mvp.mvpDemo3;


import coding.mvp.android.com.demo_mvp.mvpDemo3.base.BasePresenter;

/**
 * Created by fanlongbo on 2018/1/19.
 */

public class Main3Presenter extends BasePresenter {
    private Main3Model model;

    public Main3Presenter() {
        model = new Main3Model();
    }


    public void requestMainData() {
        model.requestMain3Data(new Main3CallBackListen() {
            @Override
            public void onPrepare() {

            }

            @Override
            public void onFail() {
                if (getCallBackListen(Main3CallBackListen.NAME) != null) {
                    getCallBackListen(Main3CallBackListen.NAME).onFail();
                }
            }

            @Override
            public void onExcepiton() {
                if (getCallBackListen(Main3CallBackListen.NAME) != null) {
                    getCallBackListen(Main3CallBackListen.NAME).onExcepiton();
                }
            }

            @Override
            public void onSuccess(String msg) {
                if(getCallBackListen(Main3CallBackListen.NAME) != null){
                    getCallBackListen(Main3CallBackListen.NAME).onSuccess(msg);
                }
            }
        });
    }

    public void requestMainNumberData() {
        model.requestMain3IntegerData(new Main3CallBackNumberListen() {
            @Override
            public void onPrepare() {

            }

            @Override
            public void onFail() {
                if (getCallBackListen(Main3CallBackNumberListen.NAME) != null) {
                    getCallBackListen(Main3CallBackNumberListen.NAME).onFail();
                }
            }

            @Override
            public void onExcepiton() {
                if (getCallBackListen(Main3CallBackNumberListen.NAME) != null) {
                    getCallBackListen(Main3CallBackNumberListen.NAME).onExcepiton();
                }
            }

            @Override
            public void onSuccess(Integer msg) {
                if(getCallBackListen(Main3CallBackNumberListen.NAME) != null){
                    getCallBackListen(Main3CallBackNumberListen.NAME).onSuccess(msg);
                }
            }
        });
    }
}
