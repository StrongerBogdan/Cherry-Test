package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.Method;

public final class PBNvgPQTsxcVT7V1y571pvQJVehXxhiBiaXTam5htIHHSDhhlaZxi5cIbgKk8KgS5zGoa8VGokxFbMiVhKVlRqzgCCg0WtRdcBl3GHYGsSHRS48NQPlrB5UiaoWTx64OqA2CuUR8 {
    public static final Method DrqQ8C7rtVRDTSclHGsDImq;
    public static final Method YmFIHVAy6MFnHbke10dLWI57IXCp;
    public final JobScheduler P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;

    static {
        Method method;
        Class<String> cls = String.class;
        Method method2 = null;
        try {
            method = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, cls, Integer.TYPE, cls});
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            }
            method = null;
        }
        YmFIHVAy6MFnHbke10dLWI57IXCp = method;
        try {
            method2 = UserHandle.class.getDeclaredMethod("myUserId", (Class[]) null);
        } catch (NoSuchMethodException unused2) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
        }
        DrqQ8C7rtVRDTSclHGsDImq = method2;
    }

    public PBNvgPQTsxcVT7V1y571pvQJVehXxhiBiaXTam5htIHHSDhhlaZxi5cIbgKk8KgS5zGoa8VGokxFbMiVhKVlRqzgCCg0WtRdcBl3GHYGsSHRS48NQPlrB5UiaoWTx64OqA2CuUR8(JobScheduler jobScheduler) {
        this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = jobScheduler;
    }
}
