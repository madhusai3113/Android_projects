package com.example.madhusai.call;
        import android.app.Activity;
        import android.content.Context;
        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.telephony.PhoneStateListener;
        import android.telephony.TelephonyManager;
        import android.util.Log;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;

public class MainActivity extends Activity {

    final Context context = this;
    private Button btn;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);

        // add button listener
        btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent phoneCallIntent = new Intent(Intent.ACTION_CALL);
                phoneCallIntent.setData(Uri.parse("tel:9933932843"));
                startActivity(phoneCallIntent);

            }

        });

    }

  }