package vn.edu.poly.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CallListener extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "HELLO , SAC PIN VUA CAM!!!!", Toast.LENGTH_LONG).show();

    }

}
