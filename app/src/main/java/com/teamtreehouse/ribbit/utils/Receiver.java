package com.teamtreehouse.ribbit.utils;

import android.content.Context;
import android.content.Intent;

import com.parse.ParsePushBroadcastReceiver;
import com.teamtreehouse.ribbit.RibbitApplication;

/**
 * Created by Yana on 24.02.2015.
 */
public class Receiver extends ParsePushBroadcastReceiver {

    @Override
    public void onPushOpen(Context context, Intent intent) {
        Intent i = new Intent(context, RibbitApplication.class);
        i.putExtras(intent.getExtras());
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
