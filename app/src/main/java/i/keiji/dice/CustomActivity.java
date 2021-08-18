package i.keiji.dice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class CustomActivity extends AppCompatActivity {

    Random random;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);

        Button button = findViewById(R.id.button);
        ClickListener listener = new ClickListener();
        button.setOnClickListener(listener);

    }



    private class ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {

            int id = v.getId();

            switch (id){

                case R.id.button:
                    EditText editText = findViewById(R.id.edit);

                    Custom custom = new Custom(editText.getText().toString());


                    TextView textView = findViewById(R.id.textView);

                    textView.setText(String.valueOf(custom.getNumber()));
                    break;


            }

        }




    }

}
