package id.kataponcoe.buttonpullover;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Poncoe on 16/07/17.
 */

public class ButtonA extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_a);
    }

    public void onClick(View arg0) {
        // TODO Auto-generated method stub
        finish();
    }
}