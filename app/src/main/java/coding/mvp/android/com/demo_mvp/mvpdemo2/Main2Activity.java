package coding.mvp.android.com.demo_mvp.mvpdemo2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import coding.mvp.android.com.demo_mvp.R;
import coding.mvp.android.com.demo_mvp.mvpdemo2.base.BaseMvpActivity;


public class Main2Activity extends BaseMvpActivity<Main2CallBackListen, Main2Presenter> {
    private TextView tv01;

    @Override
    public Main2Presenter createPresenter() {
        return new Main2Presenter();
    }

    @Override
    public Main2CallBackListen createCallBackListen() {
        return new Main2CallBackListen() {
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
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        tv01 = findViewById(R.id.tv_item01);
        tv01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().requestMainData();
            }
        });
    }
}
