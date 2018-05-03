package dat2017.stepanabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Routes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routes);
        //below is Daron's Code
        addListenerOnCh1();
        addListenerOnCh2();
        addListenerOnCh3();
        addListenerOnCh4();
        addListenerOnCh5();
        addListenerOnCh6();
        addListenerOnCh7();
        addListenerOnCh8();
        addListenerOnCh9();
        addListenerOnCh10();

        addListenerOnButton();


/*        final Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });*/
    }

    public void sendMessage(View view){
       Intent intent= new Intent(this, MapsActivity.class);
      startActivity(intent);
    }
    public void addListenerOnCh1() {
        CheckBox ch1 = (CheckBox) findViewById(R.id.checkbox_1);
        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    public void addListenerOnCh2() {
        CheckBox ch2 = (CheckBox) findViewById(R.id.checkbox_2);
        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }
    public void addListenerOnCh3() {
        CheckBox ch1 = (CheckBox) findViewById(R.id.checkbox_3);
        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    public void addListenerOnCh4() {
        CheckBox ch2 = (CheckBox) findViewById(R.id.checkbox_4);
        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }
    public void addListenerOnCh5() {
        CheckBox ch1 = (CheckBox) findViewById(R.id.checkbox_5);
        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    public void addListenerOnCh6() {
        CheckBox ch2 = (CheckBox) findViewById(R.id.checkbox_6);
        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }
    public void addListenerOnCh7() {
        CheckBox ch1 = (CheckBox) findViewById(R.id.checkbox_7);
        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    public void addListenerOnCh8() {
        CheckBox ch2 = (CheckBox) findViewById(R.id.checkbox_8);
        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }
    public void addListenerOnCh9() {
        CheckBox ch1 = (CheckBox) findViewById(R.id.checkbox_9);
        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    public void addListenerOnCh10() {
        CheckBox ch2 = (CheckBox) findViewById(R.id.checkbox_10);
        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    public void onCheckboxClicked(android.view.View view){

    }


    public void addListenerOnButton(){
        final CheckBox ch1 = (CheckBox) findViewById(R.id.checkbox_1);
        final CheckBox ch2 = (CheckBox) findViewById(R.id.checkbox_2);
        final CheckBox ch3 = (CheckBox) findViewById(R.id.checkbox_3);
        final CheckBox ch4 = (CheckBox) findViewById(R.id.checkbox_4);
        final CheckBox ch5 = (CheckBox) findViewById(R.id.checkbox_5);
        final CheckBox ch6 = (CheckBox) findViewById(R.id.checkbox_6);
        final CheckBox ch7 = (CheckBox) findViewById(R.id.checkbox_7);
        final CheckBox ch8 = (CheckBox) findViewById(R.id.checkbox_8);
        final CheckBox ch9 = (CheckBox) findViewById(R.id.checkbox_9);
        final CheckBox ch10 = (CheckBox) findViewById(R.id.checkbox_10);

        Button btn = (Button) findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Routes.this, MapsActivity2.class);

                intent.putExtra("ch1", ch1.isChecked());
                intent.putExtra("ch2", ch2.isChecked());
                intent.putExtra("ch3", ch3.isChecked());
                intent.putExtra("ch4", ch4.isChecked());
                intent.putExtra("ch5", ch5.isChecked());
                intent.putExtra("ch6", ch6.isChecked());
                intent.putExtra("ch7", ch7.isChecked());
                intent.putExtra("ch8", ch8.isChecked());
                intent.putExtra("ch9", ch9.isChecked());
                intent.putExtra("ch10", ch10.isChecked());

                startActivity(intent);
            }
        });
    }
}
