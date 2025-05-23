package wYBCCsFMvDpu12Co18Mm0Qosb7ZQOHJBbNLI0;

import OPYLydbr3oMhUxYtSadYW37XvKT4wJe0GyWfLmkVdbe1YH597Kh2dvsq3rZt1rvXRhuZBWYTH9kG006ntKTXWm4GBwQ8AjNpNKYy6dk434Ay4OiX03hm9txqbRr2BiHpLbBcGX.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;

public final /* synthetic */ class QUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI implements Runnable {
    public final /* synthetic */ LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5 GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT;
    public final /* synthetic */ boolean Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
    public final /* synthetic */ Context xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;

    public /* synthetic */ QUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI(Context context, boolean z, LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5 leskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5) {
        this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = context;
        this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw = z;
        this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT = leskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5;
    }

    public final void run() {
        Context context = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5 leskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5 = this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT;
        try {
            if (!(Binder.getCallingUid() == context.getApplicationInfo().uid)) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
            } else {
                SharedPreferences.Editor edit = HevDK09eybta9sIedOWa4gOXscsiOfP7kXok89N8k5kpHcz66ug1uFgw5377IUVchzbWWplKR3v6Pq.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.HcGgqmTrfEBzZy0CmDiIV3ZElJEuPtc3JIfGYgq465Eh(context).edit();
                edit.putBoolean("proxy_notification_initialized", true);
                edit.apply();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate((String) null);
                }
            }
        } finally {
            leskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.DrqQ8C7rtVRDTSclHGsDImq((Object) null);
        }
    }
}
