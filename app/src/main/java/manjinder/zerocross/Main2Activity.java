package manjinder.zerocross;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textView1, textView2, textView3;
    private int turn = 1;
    String p1,p2;
    String player1,player2;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, ok, reset, back;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        textView1= (TextView) findViewById(R.id.t1);
        textView2=(TextView)findViewById(R.id.t2);
        textView3= (TextView) findViewById(R.id.t3);

        reset = (Button) findViewById(R.id.reset);
        back= (Button) findViewById(R.id.Back);
        linearLayout= (LinearLayout) findViewById(R.id.l1);

         player1=getIntent().getExtras().getString("p1");
        player2=getIntent().getExtras().getString("p2");



            textView1.setText(player1);
            textView2.setText(player2);
        textView1.setTextColor(Color.RED);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                if (b1.getText().toString().equals("")) {
                    if (turn == 1) {
                        textView1.setTextColor(Color.BLACK);
                        textView2.setTextColor(Color.RED);
                        turn = 2;
                        b1.setText("X");
                    } else if (turn == 2) {
                        textView1.setTextColor(Color.RED);
                        textView2.setTextColor(Color.BLACK);
                        turn = 1;
                        b1.setText("0");
                    }
                }
                Game();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals("")) {
                    if (turn == 1) {
                        textView1.setTextColor(Color.BLACK);
                        textView2.setTextColor(Color.RED);
                        turn = 2;
                        b2.setText("X");
                    } else if (turn == 2) {
                        textView1.setTextColor(Color.RED);
                        textView2.setTextColor(Color.BLACK);
                        turn = 1;
                        b2.setText("0");
                    }
                }
                Game();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText().toString().equals("")) {
                    if (turn == 1) {
                        textView1.setTextColor(Color.BLACK);
                        textView2.setTextColor(Color.RED);
                        turn = 2;
                        b3.setText("X");
                    } else if (turn == 2) {
                        textView1.setTextColor(Color.RED);
                        textView2.setTextColor(Color.BLACK);
                        turn = 1;
                        b3.setText("0");
                    }
                }
                Game();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText().toString().equals("")) {
                    if (turn == 1) {
                        textView1.setTextColor(Color.BLACK);
                        textView2.setTextColor(Color.RED);
                        turn = 2;
                        b4.setText("X");
                    } else if (turn == 2) {
                        textView1.setTextColor(Color.RED);
                        textView2.setTextColor(Color.BLACK);
                        turn = 1;
                        b4.setText("0");
                    }
                }
                Game();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b5.getText().toString().equals("")) {
                    if (turn == 1) {
                        textView1.setTextColor(Color.BLACK);
                        textView2.setTextColor(Color.RED);
                        turn = 2;
                        b5.setText("X");
                    } else if (turn == 2) {
                        textView1.setTextColor(Color.RED);
                        textView2.setTextColor(Color.BLACK);
                        turn = 1;
                        b5.setText("0");
                    }
                }
                Game();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b6.getText().toString().equals("")) {
                    if (turn == 1) {
                        textView1.setTextColor(Color.BLACK);
                        textView2.setTextColor(Color.RED);
                        turn = 2;
                        b6.setText("X");
                    } else if (turn == 2) {
                        textView1.setTextColor(Color.RED);
                        textView2.setTextColor(Color.BLACK);
                        turn = 1;
                        b6.setText("0");
                    }
                }
                Game();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b7.getText().toString().equals("")) {
                    if (turn == 1) {
                        textView1.setTextColor(Color.BLACK);
                        textView2.setTextColor(Color.RED);
                        turn = 2;
                        b7.setText("X");
                    } else if (turn == 2) {
                        textView1.setTextColor(Color.RED);
                        textView2.setTextColor(Color.BLACK);
                        turn = 1;
                        b7.setText("0");
                    }
                }
                Game();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b8.getText().toString().equals("")) {
                    if (turn == 1) {
                        textView1.setTextColor(Color.BLACK);
                        textView2.setTextColor(Color.RED);
                        turn = 2;
                        b8.setText("X");
                    } else if (turn == 2) {
                        textView1.setTextColor(Color.RED);
                        textView2.setTextColor(Color.BLACK);
                        turn = 1;
                        b8.setText("0");
                    }
                }
                Game();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9.getText().toString().equals("")) {
                    if (turn == 1) {
                        textView1.setTextColor(Color.BLACK);
                        textView2.setTextColor(Color.RED);
                        turn = 2;
                        b9.setText("X");
                    } else if (turn == 2) {
                        textView1.setTextColor(Color.RED);
                        textView2.setTextColor(Color.BLACK);
                        turn = 1;
                        b9.setText("0");
                    }
                }
                Game();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setReset();

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });
    }


    public void Game(){
        String a,b,c,d,e,f,g,h,i;
        a=b1.getText().toString();
        b=b2.getText().toString();
        c=b3.getText().toString();
        d=b4.getText().toString();
        e=b5.getText().toString();
        f=b6.getText().toString();
        g=b7.getText().toString();
        h=b8.getText().toString();
        i=b9.getText().toString();

        if (a.equals("X") && b.equals("X") && c.equals("X")){
            textView3.setText(player1);
//            turn=1;
            linearLayout.setEnabled(false);
            setReset1();
        }
        if (a.equals("X") && d.equals("X") && g.equals("X")){
            textView3.setText(player1);
//            turn=1;
            linearLayout.setEnabled(false);
            setReset1();
        }
        if (a.equals("X") && e.equals("X") && i.equals("X")){
            textView3.setText(player1);
//            turn=1;
            linearLayout.setEnabled(false);
            setReset1();
        }
        if (b.equals("X") && e.equals("X") && h.equals("X")){
            textView3.setText(player1);
//            turn=1;
            linearLayout.setEnabled(false);
            setReset1();
        }
        if (c.equals("X") && f.equals("X") && i.equals("X")){
            textView3.setText(player1);
//            turn=1;
            linearLayout.setEnabled(false);
            setReset1();
        }

        if (c.equals("X") && e.equals("X") && g.equals("X")){
            textView3.setText(player1);
//            turn=1;
            linearLayout.setEnabled(false);
            setReset1();
        }
        if (d.equals("X") && e.equals("X") && f.equals("X")){
            textView3.setText(player1);
//            turn=1;
            linearLayout.setEnabled(false);
            setReset1();
        }
        if (g.equals("X") && h.equals("X") && i.equals("X")){
            textView3.setText(player1);
//            turn=1;
            linearLayout.setEnabled(false);
            setReset1();
        }


        if (a.equals("0") && b.equals("0") && c.equals("0")){
            textView3.setText(player2);
//            turn=2;
            linearLayout.setEnabled(false);
            setReset2();
        }
        if (a.equals("0") && d.equals("0") && g.equals("0")){
            textView3.setText(player2);
//            turn=2;
            linearLayout.setEnabled(false);
            setReset2();
        }
        if (a.equals("0") && e.equals("0") && i.equals("0")){
            textView3.setText(player2);
//            turn=2;
            linearLayout.setEnabled(false);
            setReset2();
        }
        if (b.equals("0") && e.equals("0") && h.equals("0")){
            textView3.setText(player2);
//            turn=2;
            linearLayout.setEnabled(false);
            setReset2();
        }
        if (c.equals("0") && f.equals("0") && i.equals("0")){
            textView3.setText(player2);
//            turn=2;
            linearLayout.setEnabled(false);
            setReset2();
        }
        if (c.equals("0") && e.equals("0") && g.equals("0")){
            textView3.setText(player2);
            setReset2();
//            turn=2;
            linearLayout.setEnabled(false);
        }
        if (d.equals("0") && e.equals("0") && f.equals("0")){
            textView3.setText(player2);
//            turn=2;
            linearLayout.setEnabled(false);
            setReset2();
        }
        if (g.equals("0") && h.equals("0") && i.equals("0")){
            textView3.setText(player2);
//            turn=2;
            linearLayout.setEnabled(false);
            setReset2();
        }
    }
    public void setReset(){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        textView3.setText("");
        textView1.setTextColor(Color.RED);
        textView2.setTextColor(Color.BLACK);
        turn=1;
       // linearLayout.setEnabled(true);
//        ed1.setText(null);
//        ed2.setText(null);
//        p1=ed1.getText().toString();
//        p2=ed2.getText().toString();
    }
    public void setReset1(){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        textView1.setTextColor(Color.RED);
        textView2.setTextColor(Color.BLACK);
        turn=1;
//
    }
    public void setReset2(){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        textView1.setTextColor(Color.BLACK);
        textView2.setTextColor(Color.RED);
        turn=2;
    }
}
