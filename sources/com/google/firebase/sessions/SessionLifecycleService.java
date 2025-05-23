package com.google.firebase.sessions;

import LpJrvPJZgfMWhzDqYlD5h2rrEkHInLSqeG19dMLEUepln6GC1EX3oXOEKIA4hj2lSfZGJJ2x3n3mSMX6.asQX8JK5HmDXPcoA9YxLn7cpuBp3KP6Kb3odxWwo12KJ5d8EadSLwry1kNCpB2BMyI1q8ppamvM7V8TMZX0u4yLfB75z4Zfx44zbxotyq8ZtBder4E2Ym1q0028YzDwhrBpztS4K5wnrw39ja;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5;

public final class SessionLifecycleService extends Service {
    public Messenger GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT;
    public asQX8JK5HmDXPcoA9YxLn7cpuBp3KP6Kb3odxWwo12KJ5d8EadSLwry1kNCpB2BMyI1q8ppamvM7V8TMZX0u4yLfB75z4Zfx44zbxotyq8ZtBder4E2Ym1q0028YzDwhrBpztS4K5wnrw39ja Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
    public final HandlerThread xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = new HandlerThread("FirebaseSessions_HandlerThread");

    public final IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        Messenger messenger = Build.VERSION.SDK_INT >= 33 ? (Messenger) intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
        if (messenger != null) {
            Message obtain = Message.obtain((Handler) null, 4, 0, 0);
            obtain.replyTo = messenger;
            asQX8JK5HmDXPcoA9YxLn7cpuBp3KP6Kb3odxWwo12KJ5d8EadSLwry1kNCpB2BMyI1q8ppamvM7V8TMZX0u4yLfB75z4Zfx44zbxotyq8ZtBder4E2Ym1q0028YzDwhrBpztS4K5wnrw39ja asqx8jk5hmdxpcoa9yxln7cpubp3kp6kb3odxwwo12kj5d8eadslwry1kncpb2bmyi1q8ppamvm7v8tmzx0u4ylfb75z4zfx44zbxotyq8ztbder4e2ym1q0028yzdwhrbpzts4k5wnrw39ja = this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
            if (asqx8jk5hmdxpcoa9yxln7cpubp3kp6kb3odxwwo12kj5d8eadslwry1kncpb2bmyi1q8ppamvm7v8tmzx0u4ylfb75z4zfx44zbxotyq8ztbder4e2ym1q0028yzdwhrbpzts4k5wnrw39ja != null) {
                asqx8jk5hmdxpcoa9yxln7cpubp3kp6kb3odxwwo12kj5d8eadslwry1kncpb2bmyi1q8ppamvm7v8tmzx0u4ylfb75z4zfx44zbxotyq8ztbder4e2ym1q0028yzdwhrbpzts4k5wnrw39ja.sendMessage(obtain);
            }
        }
        Messenger messenger2 = this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT;
        if (messenger2 != null) {
            return messenger2.getBinder();
        }
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(looper, "handlerThread.looper");
        this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw = new asQX8JK5HmDXPcoA9YxLn7cpuBp3KP6Kb3odxWwo12KJ5d8EadSLwry1kNCpB2BMyI1q8ppamvM7V8TMZX0u4yLfB75z4Zfx44zbxotyq8ZtBder4E2Ym1q0028YzDwhrBpztS4K5wnrw39ja(looper);
        this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT = new Messenger(this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9.quit();
    }
}
