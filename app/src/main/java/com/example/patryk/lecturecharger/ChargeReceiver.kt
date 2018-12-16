package com.example.patryk.lecturecharger

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class ChargeReceiver:BroadcastReceiver() {
    var ilosc:Int=0
    override fun onReceive(context: Context?, intent: Intent?) {
        ilosc++
        if (intent?.action.equals(Intent.ACTION_POWER_CONNECTED)) {
            Toast.makeText(context, "podłączono $ilosc", Toast.LENGTH_LONG).show()
        } else {
            intent?.action.equals(Intent.ACTION_POWER_DISCONNECTED);
            Toast.makeText(context, "odłączono $ilosc", Toast.LENGTH_LONG).show()
        }

    }
}