package coding.mvp.android.com.demo_mvp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import coding.mvp.android.com.demo_mvp.mvpDemo3.Main3Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
}
