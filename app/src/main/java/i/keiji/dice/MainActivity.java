package i.keiji.dice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;



public class MainActivity extends AppCompatActivity {


    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.menu);
        listView.setOnItemClickListener(new ListClick());

    }



    private class ListClick implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



            if(id == 0){
                Intent intent = new Intent(MainActivity.this,NormalActivity.class); //インナークラスから外部クラスを指定したい場合はクラス名.this
                startActivity(intent);
            }
            if(id == 1){
                Intent intent = new Intent(MainActivity.this,CustomActivity.class);
                startActivity(intent);
            }
            if (id == 2){
                Intent intent = new Intent(MainActivity.this,ReadmeActivity.class);
                startActivity(intent);
            }



        }
    }
}


