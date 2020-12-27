package com.ethiop.assi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void counter(View view) {

                    //counter event listner hanling
                    TextView cv = (TextView)   findViewById(R.id.coutView);

        String s = (String) cv.getText();

        int counting = Integer.parseInt(s);

                                                   counting++;

                                                   cv.setText(String.valueOf(counting));
    }

    public void sayHello(View view) {
        Intent next = new Intent(this,MainActivity2.class);
      
              TextView count = (TextView) findViewById(R.id.coutView);

          String getView = (String) count.getText();

         int getInt = Integer.parseInt(getView);

                   next.putExtra("count",getInt);

          startActivity(next);

    }
}