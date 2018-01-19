package coding.mvp.android.com.demo_mvp.mvpDemo3;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

import coding.mvp.android.com.demo_mvp.R;
import coding.mvp.android.com.demo_mvp.mvpDemo3.base.BaseCallBackListen;
import coding.mvp.android.com.demo_mvp.mvpDemo3.base.BaseMvpActivity;

public class Main3Activity extends BaseMvpActivity<Main3Presenter> {
    private TextView tv01;
    private TextView tv02;

    @Override
    public Main3Presenter createPresenter() {
        return new Main3Presenter();
    }

    @Override
    public Map<String, BaseCallBackListen> createCallBackListen() {
        Map<String ,BaseCallBackListen> map = new HashMap<>();
        Main3CallBackListen callBackListen = new Main3CallBackListen() {
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
            public void onSuccess(String s) {
                tv01.setText(s);
            }
        };

        Main3CallBackNumberListen callBackNumberListen = new Main3CallBackNumberListen() {
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
            public void onSuccess(Integer integer) {
                tv02.setText("--->"+integer);
            }
        };

        map.put(Main3CallBackListen.NAME,callBackListen);
        map.put(Main3CallBackNumberListen.NAME,callBackNumberListen);
        return map;
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

        tv02 = findViewById(R.id.tv_item02);
        tv02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().requestMainNumberData();
            }
        });
    }
}
