package coding.mvp.android.com.demo_mvp.mvpdemo1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import coding.mvp.android.com.demo_mvp.R;


public class Main1Activity extends Activity {
    private TextView tv01;
    private MainPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        presenter = new MainPresenter();
        initView();
        initDataCallBack();
    }

    private void initDataCallBack() {
        MainCallBackListen callBackListen = new MainCallBackListen() {
            @Override
            public void onPrepare() {

            }

            @Override
            public void onFail() {

            }

            @Override
            public void onExcepiton() {

            }

            @Override
            public void onSuccess(String msg) {
                tv01.setText(msg);
            }
        };

        presenter.setCallBackListen(callBackListen);
    }

    private void initView() {
        tv01 = findViewById(R.id.tv_item01);
        tv01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.requestMainData();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.setCallBackListen(null);
    }
}
