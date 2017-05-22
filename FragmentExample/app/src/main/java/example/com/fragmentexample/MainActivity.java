package example.com.fragmentexample;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    Fragment fr;
    @Override

   //called when first activity is created
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.eText1);
        button = (Button) findViewById(R.id.button);

        // get an instance of FragmentTransaction
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //adding  a fragment
        fr = new Fragment();
        fragmentTransaction.add(R.id.fragment,fr);
        fragmentTransaction.commit();

        button.setOnClickListener(new View.OnClickListener() {

            //Sending  input text from activity to fragment
            @Override
            public void onClick(View v) {

                // TODO Auto-generated method stub
                String text = editText.getText().toString();
                TextView textFrag = (TextView) findViewById(R.id.textview);
                textFrag.setText(text);
            }
        });
    }
}


