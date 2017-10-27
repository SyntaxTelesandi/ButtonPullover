package id.kataponcoe.buttonpullover;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Poncoe on 16/07/17.
 */

public class ButtonPullover extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.button_pullover);


        Button b1 = (Button) findViewById(R.id.btn_a);
        Button b2 = (Button) findViewById(R.id.btn_b);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Memanggil Button A
                Intent i = new Intent(ButtonPullover.this, ButtonA.class);
                startActivity(i);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Memanggil Button B
                Intent i = new Intent(ButtonPullover.this, ButtonB.class);
                startActivity(i);

            }
        });
    }


    public void onBackPressed() {
        finish();
    }
}