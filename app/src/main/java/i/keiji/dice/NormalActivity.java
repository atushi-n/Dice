package i.keiji.dice;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class NormalActivity extends AppCompatActivity {

    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new ClickListener());






    }

    private class ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {

            int id = v.getId();

            switch (id){

                case R.id.button:
                    TextView textView = findViewById(R.id.textView);
                    random = new Random();
                    int score = random.nextInt(6) + 1;
                    textView.setText(String.valueOf(score));
                    break;


            }

        }




    }



}
