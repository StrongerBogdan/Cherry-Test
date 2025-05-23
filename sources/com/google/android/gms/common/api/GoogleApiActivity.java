package com.google.android.gms.common.api;

import ZviBeSijYOipWHLb8nLHZeNuP7DHxDYM3CZ7RZ5vOlMEMUEoaJUV5e0RDmKL7kEBlgbz4vHMvRkmX6BUiPZMRtDDv7LORvgEyWYohGLfn7aL7dPFOOH0cyoiu.pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.measurement.cEa3c8vSLSVxwUJcLf4f9n3Gm28VoElpOXpuEFrEU9s1mKvk7PRPvMsE3QGsDlHAMYk9j0YTqs8eAYU732M3SapHWpxkiM6pSFFn95qy86rVVLfUBQZEGGQc44RdDXl9GYcMpMebwPmZReMcrcWIIcb2;
import flpKXtkxsYs6HzZU6JlcZT0W6k0hSkhHAMmrAYMHm7uThy4GCN2k3f1dOwGQhtd0ak9RrNhLL5P9QUoMZt0BAigZvbe8xa2XMO8RJUFU2gDYqwCZIiejUs4bvVhZvhi6duKPhA1nTsnXIbWud9enjgHU1.Hfv852lbufjqS9YvuotOQGMlAwbT93xAB7vm4I08c6qrPUQoF33xZ7tgcFr07lRFO0AjYBoYHfH7ytkOI;
import fohPtkVj3dJ58KoN1S9SLHKA3ge0ghORQnzrtckcLrA17hCKcoM4ItKnFCUlHEaAnFuYy2LxHriUQxQmkFz2sDMHu9Mtt5vmtf9Pg6SEd5PhK63w7h6FgE285eKg18EL6EhHjIM.LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA;
import fohPtkVj3dJ58KoN1S9SLHKA3ge0ghORQnzrtckcLrA17hCKcoM4ItKnFCUlHEaAnFuYy2LxHriUQxQmkFz2sDMHu9Mtt5vmtf9Pg6SEd5PhK63w7h6FgE285eKg18EL6EhHjIM.aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX;

public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw = 0;
    public int xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = 0;

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1 VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU = pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(this);
                if (i2 == -1) {
                    cEa3c8vSLSVxwUJcLf4f9n3Gm28VoElpOXpuEFrEU9s1mKvk7PRPvMsE3QGsDlHAMYk9j0YTqs8eAYU732M3SapHWpxkiM6pSFFn95qy86rVVLfUBQZEGGQc44RdDXl9GYcMpMebwPmZReMcrcWIIcb2 cea3c8vslsvxwujclf4f9n3gm28voelpoxpuefreu9s1mkvk7prpvmse3qgsdlhamyk9j0ytqs8eayu732m3saphwpxkim6psffn95qy86rvvlfubqzeggqc44rddxl9gycmpmebwpmzremcrcwiicb2 = VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
                    cea3c8vslsvxwujclf4f9n3gm28voelpoxpuefreu9s1mkvk7prpvmse3qgsdlhamyk9j0ytqs8eayu732m3saphwpxkim6psffn95qy86rvvlfubqzeggqc44rddxl9gycmpmebwpmzremcrcwiicb2.sendMessage(cea3c8vslsvxwujclf4f9n3gm28voelpoxpuefreu9s1mkvk7prpvmse3qgsdlhamyk9j0ytqs8eayu732m3saphwpxkim6psffn95qy86rvvlfubqzeggqc44rddxl9gycmpmebwpmzremcrcwiicb2.obtainMessage(3));
                } else if (i2 == 0) {
                    VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(new LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = 0;
        setResult(0);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = bundle.getInt("resolution");
        }
        if (this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                    this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = 1;
                } catch (ActivityNotFoundException e) {
                    if (extras.getBoolean("notify_manager", true)) {
                        pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(this).oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(new LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA(22, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                    } else {
                        String obj = pendingIntent.toString();
                        StringBuilder sb = new StringBuilder(obj.length() + 36);
                        sb.append("Activity not found while launching ");
                        sb.append(obj);
                        sb.append(".");
                        String sb2 = sb.toString();
                        if (Build.FINGERPRINT.contains("generic")) {
                            sb2 = sb2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                        }
                        Log.e("GoogleApiActivity", sb2, e);
                    }
                    this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = 1;
                    finish();
                } catch (IntentSender.SendIntentException e2) {
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e2);
                    finish();
                }
            } else {
                Hfv852lbufjqS9YvuotOQGMlAwbT93xAB7vm4I08c6qrPUQoF33xZ7tgcFr07lRFO0AjYBoYHfH7ytkOI.peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6(num);
                aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU.DrqQ8C7rtVRDTSclHGsDImq(this, num.intValue(), this);
                this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = 1;
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9);
        super.onSaveInstanceState(bundle);
    }
}
