package com.example.Lock;

import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            ((DevicePolicyManager) getSystemService(Context.DEVICE_POLICY_SERVICE)).lockNow();
        }
        catch (Exception e) {
            Toast.makeText(this, R.string.toast, Toast.LENGTH_LONG).show();
        }
        finally {
            finish();
        }
    }
}