package vn.miraway.myapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class BootReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        intent?.let { i ->
            if (i.action == Intent.ACTION_BOOT_COMPLETED){
                context?.let { context ->
                    context.startActivity(Intent(context, MainActivity::class.java).apply {
                        addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    })
                }
            }
        }
    }
}