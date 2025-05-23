package u7WSURlE4UdW83Fpzp6QuhjxNinQRIdijMWqRq2SzYzZwLHMYceV3WdoH3Sxb54y3kpveUEWmbK3WyUaeaGQmc8HZT4kEZkfdoey9cENBRl54QRnr2FfxNrXW3n9zyKmVjJO0;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zfocMDrnJnbYtdsnKHCh6s {
    public static final boolean H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ;
    public static final boolean oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU;
    public static volatile zfocMDrnJnbYtdsnKHCh6s peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6;
    public static final File uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn = new File("/proc/self/fd");
    public boolean DrqQ8C7rtVRDTSclHGsDImq = true;
    public final int P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = 20000;
    public final AtomicBoolean VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU = new AtomicBoolean(false);
    public int YmFIHVAy6MFnHbke10dLWI57IXCp;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU = i < 29;
        if (i >= 28) {
            z = true;
        }
        H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ = z;
    }

    public static zfocMDrnJnbYtdsnKHCh6s P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d() {
        if (peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6 == null) {
            synchronized (zfocMDrnJnbYtdsnKHCh6s.class) {
                try {
                    if (peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6 == null) {
                        peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6 = new zfocMDrnJnbYtdsnKHCh6s();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6;
    }

    public final boolean DrqQ8C7rtVRDTSclHGsDImq(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        if (!z) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        } else if (!H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        } else if (oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU && !this.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU.get()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        } else if (z2) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        } else if (i < 0 || i2 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        } else {
            synchronized (this) {
                try {
                    int i3 = this.YmFIHVAy6MFnHbke10dLWI57IXCp + 1;
                    this.YmFIHVAy6MFnHbke10dLWI57IXCp = i3;
                    if (i3 >= 50) {
                        this.YmFIHVAy6MFnHbke10dLWI57IXCp = 0;
                        int length = uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn.list().length;
                        long YmFIHVAy6MFnHbke10dLWI57IXCp2 = (long) YmFIHVAy6MFnHbke10dLWI57IXCp();
                        boolean z4 = ((long) length) < YmFIHVAy6MFnHbke10dLWI57IXCp2;
                        this.DrqQ8C7rtVRDTSclHGsDImq = z4;
                        if (!z4 && Log.isLoggable("Downsampler", 5)) {
                            Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + YmFIHVAy6MFnHbke10dLWI57IXCp2);
                        }
                    }
                    z3 = this.DrqQ8C7rtVRDTSclHGsDImq;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (z3) {
                return true;
            }
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
            }
            return false;
        }
    }

    public final int YmFIHVAy6MFnHbke10dLWI57IXCp() {
        if (Build.VERSION.SDK_INT == 28) {
            for (String startsWith : Arrays.asList(new String[]{"GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013"})) {
                if (Build.MODEL.startsWith(startsWith)) {
                    return 500;
                }
            }
        }
        return this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
    }
}
