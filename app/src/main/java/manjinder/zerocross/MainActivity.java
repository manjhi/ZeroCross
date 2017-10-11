package manjinder.zerocross;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    Button ok;
    EditText editText1,editText2;


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ok = (Button) findViewById(R.id.ok);

//        again = (Button) findViewById(R.id.agn);

        editText1 = (EditText) findViewById(R.id.t1);
        editText2 = (EditText) findViewById(R.id.t2);
//        again.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//            if(p1.toString().equals("X")){
//                setReset1();
//            }
//                if (p2.toString().equals("0")){
//                    setReset2();
//                }
//            }
//        });
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                System.out.print("edit Ztextr1"+editText1.getText().toString());
                if (editText1.getText().toString().isEmpty() || editText2.getText().toString().isEmpty()) {

                    Toast.makeText(MainActivity.this, "Enter names", Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("p1", editText1.getText().toString());
                    intent.putExtra("p2", editText2.getText().toString());
                    startActivity(intent);
                }
            }
        });

    }
}
