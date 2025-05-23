package androidx.profileinstaller;

import GAfZtakVLpoBFIWNNPQMlLUXIec.aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;
import java.io.Serializable;
import mfJrxjdVjYequJhpDv5jwLUcKkdkG2Bb2Y8li8ypFqi8S7eL5IAXIIOxR8Loyj5.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK;

public class ProfileInstallReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX.NAT8VFbvMD5oA1tDoaa8FFDMc2Rw14yQQAQYIZnXV5Cm7DH1wQODb9V441Ny0MOyjP5swHySdefYhY7cmsro3bTGtZnPkg0ygx(context, new com.bumptech.glide.aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX(1), new FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK(11, (Object) this), true);
            } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK = new FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK(11, (Object) this);
                        try {
                            aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                            fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(10, (Serializable) null);
                        } catch (PackageManager.NameNotFoundException e) {
                            fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(7, e);
                        }
                    } else if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                    }
                }
            } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                Process.sendSignal(Process.myPid(), 10);
                Log.d("ProfileInstaller", "");
                setResultCode(12);
            } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK2 = new FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK(11, (Object) this);
                if ("DROP_SHADER_CACHE".equals(string2)) {
                    if (aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX.DrqQ8C7rtVRDTSclHGsDImq(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                        fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK2.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(14, (Serializable) null);
                    } else {
                        fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK2.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(15, (Serializable) null);
                    }
                } else {
                    fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK2.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(16, (Serializable) null);
                }
            }
        }
    }
}
