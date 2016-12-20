package idv.tomazwang.nitrogen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StartupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_startup);
    }


    @Override
    protected void onResume() {
        super.onResume();
        MainActivity.start(this);
    }
}
