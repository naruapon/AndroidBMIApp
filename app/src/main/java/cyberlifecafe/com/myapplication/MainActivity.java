package cyberlifecafe.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText ed1 = (EditText) findViewById(R.id.editText);
        final EditText ed2 = (EditText) findViewById(R.id.editText2);
        final TextView tv = (TextView) findViewById(R.id.textView);


        Button b = (Button) findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){

               double result;
               double weight = Double.parseDouble(ed1.getText().toString());
               double height = Double.parseDouble(ed2.getText().toString());


               height = height/100;
               result = weight/(height*height);
               Toast.makeText(MainActivity.this, "BMI :"+result, Toast.LENGTH_SHORT).show();

               if(result>=30){
                   tv.setText("Fat LV3");
               }else if(result>=25){
                   tv.setText("Fat LV2");
               }else if(result>=23){
                   tv.setText("Fat LV1");
               }else if(result>=18.50) {
                   tv.setText("Normal");
               }else{
                   tv.setText("Thin");
               }

           }
        });
    }



}
