package com.example.madhusai.fake;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Calendar;

import static com.example.madhusai.fake.R.id.fakenumber;


public class fake_call extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton firstOption;
    private RadioButton secondOption;
    private RadioButton thirdOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"detected",Toast.LENGTH_SHORT).show();
    }
        /*
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


//        radioGroup = (RadioGroup) findViewById(R.id.radioGroup1);
//        firstOption = (RadioButton)findViewById(R.id.radio0);
//        secondOption = (RadioButton)findViewById(R.id.radio1);
//        thirdOption = (RadioButton)findViewById(R.id.radio2);

        //Button fakeCallButton = (Button)findViewById(R.id.fakecalls);
        //fakeCallButton.setOnClickListener(new View.OnClickListener(){


        // public void onClick(View v) {
        int selectedTime = 0;

        //int radioSelected = radioGroup.getCheckedRadioButtonId();
        int radioTimeSelected = 10; //getSelectedAnswer(radioSelected);

        if (radioGroup.getCheckedRadioButtonId() == -1) {
            Toast.makeText(fake_call.this, "You must select a time", Toast.LENGTH_SHORT).show();
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(Calendar.SECOND, radioTimeSelected);
        long currentFakeTime = calendar.getTimeInMillis();

        String fakeNameEntered = "mmaaaad";
        String fakeNumberEntered = "99322993939";
//                if(fakeNameEntered.equals("") || fakeNumberEntered.equals("")){
//                    Toast.makeText(MainActivity.this, "You must both name and number", Toast.LENGTH_SHORT).show();
//                    return;
//                }
        System.out.println("Fake name" + fakeNameEntered);
        System.out.println("Fake number" + fakeNumberEntered);

        setUpAlarm(currentFakeTime, fakeNameEntered, fakeNumberEntered);
    }
    //});


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private int getSelectedAnswer(int radioSelected) {
        int answerSelected = 0;
        if (radioSelected == R.id.radio0) {
            answerSelected = 10;
        }
        if (radioSelected == R.id.radio1) {
            answerSelected = 30;
        }
        if (radioSelected == R.id.radio2) {
            answerSelected = 60;
        }
        return answerSelected;
    }

    public void setUpAlarm(long selectedTimeInMilliseconds, String fakeName, String fakeNumber) {

        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(this, FakeCallReceiver.class);

        intent.putExtra("FAKENAME", fakeName);
        intent.putExtra("FAKENUMBER", fakeNumber);

        PendingIntent fakePendingIntent = PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
        alarmManager.set(AlarmManager.RTC_WAKEUP, selectedTimeInMilliseconds, fakePendingIntent);
        Toast.makeText(getApplicationContext(), "Your fake call time has been set", Toast.LENGTH_SHORT).show();

        Intent intents = new Intent(this, fake_call.class);
        startActivity(intents);

    }*/
}

