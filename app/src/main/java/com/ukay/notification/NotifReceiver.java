package com.ukay.notification;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class NotifReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        String pesan = intent.getStringExtra("toastPesan");
        Toast.makeText(context, pesan, Toast.LENGTH_SHORT).show();
    }
}
