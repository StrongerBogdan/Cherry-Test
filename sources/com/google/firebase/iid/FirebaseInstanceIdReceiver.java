package com.google.firebase.iid;

import YiQ1vlMrguP1eedEzNOgRt567pcdSUtmArJluxMufc3qx.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.zfocMDrnJnbYtdsnKHCh6s;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import yeQgNBzuxw2ebu2Wi0w7CWOQuWbdiUQk5tfB.aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX;

public final class FirebaseInstanceIdReceiver extends BroadcastReceiver {
    public static SoftReference P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
    public static SoftReference YmFIHVAy6MFnHbke10dLWI57IXCp;

    public static int P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(extras);
            if (!aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX.RjT0U5i946Gybz6DXccidXljfUHnYkuWeyP3IoANcwRRnisDLisitu9aT8ZN8kJ6AFZM2aqfCAaFXiKjGToldgfVSS3oT(putExtras)) {
                return -1;
            }
            aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX.qk6QoGpJ7mUVRHlBbEKbscA2uzM6o8hlNA4O9PJXfYl0gWws0Zlal("_nd", putExtras.getExtras());
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    public final void onReceive(Context context, Intent intent) {
        ExecutorService executorService;
        if (intent != null) {
            boolean isOrderedBroadcast = isOrderedBroadcast();
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (FirebaseInstanceIdReceiver.class) {
                try {
                    SoftReference softReference = P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
                    ExecutorService executorService2 = softReference != null ? (ExecutorService) softReference.get() : null;
                    if (executorService2 == null) {
                        executorService2 = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zfocMDrnJnbYtdsnKHCh6s("firebase-iid-executor")));
                        P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = new SoftReference(executorService2);
                    }
                    executorService = executorService2;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            executorService.execute(new LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5(this, intent, context, isOrderedBroadcast, goAsync));
        }
    }
}
