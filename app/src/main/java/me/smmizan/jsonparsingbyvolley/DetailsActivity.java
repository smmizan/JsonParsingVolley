package me.smmizan.jsonparsingbyvolley;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView t1,t2,t3;

    Intent intent = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle bundle = getIntent().getExtras();

        String TempItem = getIntent().getStringExtra("ListViewValue");

        t1 = (TextView) findViewById(R.id.e1);
        t1.setText(TempItem);



    }
}
