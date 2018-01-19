package coding.mvp.android.com.demo_mvp.mvpdemo1;

/**
 * Created by fanlongbo on 2018/1/19.
 */

public class MainPresenter {
    private MainCallBackListen callBackListen;
    private MainModel model;

    public MainPresenter(){
        model = new MainModel();
    }

    public void setCallBackListen(MainCallBackListen callBackListen) {
        this.callBackListen = callBackListen;
    }

    public void requestMainData() {
        model.requestMainData(new MainCallBackListen() {
            @Override
            public void onPrepare() {

            }

            @Override
            public void onFail() {
                if(callBackListen != null){
                    callBackListen.onFail();
                }
            }

            @Override
            public void onExcepiton() {
                if(callBackListen != null){
                    callBackListen.onExcepiton();
                }
            }

            @Override
            public void onSuccess(String msg) {
                if(callBackListen != null){
                    callBackListen.onSuccess(msg);
                }
            }
        });
    }
}
