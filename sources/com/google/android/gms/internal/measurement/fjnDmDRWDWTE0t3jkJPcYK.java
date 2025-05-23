package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

public final class fjnDmDRWDWTE0t3jkJPcYK extends oQihSwLqd0g1qHMxAej6id7aYVUnpbxuEKRkhjwJDibJQxBBNor3YJDepREGWtZc0FHtpBDqOzhyoDTYB3IuPeq6GaWZDWy2iMz implements pndyUOdR5HXvqxOa7sLzbN6vRhTOHmcQZ0wAP8FZQjV4RgLxrboRFzoskcfWWUlvlOCkIxYNX17DBQqEEoOW2uHarRx9LIh6kfAzXgo2ooaIbs {
    public final AtomicReference P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = new AtomicReference();
    public boolean YmFIHVAy6MFnHbke10dLWI57IXCp;

    public fjnDmDRWDWTE0t3jkJPcYK() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public static Object H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            String canonicalName = cls.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            Log.w("AM", "Unexpected object type. Expected, Received: " + canonicalName + ", " + canonicalName2, e);
            throw e;
        }
    }

    public final void VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(Bundle bundle) {
        synchronized (this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d) {
            try {
                this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d.set(bundle);
                this.YmFIHVAy6MFnHbke10dLWI57IXCp = true;
                this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean YmFIHVAy6MFnHbke10dLWI57IXCp(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        uKo7OCHL2lMivEF7eLsPf5oYebQSCeIRWH.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(parcel);
        VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU((Bundle) uKo7OCHL2lMivEF7eLsPf5oYebQSCeIRWH.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(long r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d
            monitor-enter(r0)
            boolean r1 = r2.YmFIHVAy6MFnHbke10dLWI57IXCp     // Catch:{ all -> 0x000d }
            if (r1 != 0) goto L_0x0012
            java.util.concurrent.atomic.AtomicReference r1 = r2.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d     // Catch:{ InterruptedException -> 0x000f }
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x000f }
            goto L_0x0012
        L_0x000d:
            r3 = move-exception
            goto L_0x001c
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            r3 = 0
            return r3
        L_0x0012:
            java.util.concurrent.atomic.AtomicReference r3 = r2.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d     // Catch:{ all -> 0x000d }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x000d }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x000d }
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            return r3
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.fjnDmDRWDWTE0t3jkJPcYK.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(long):android.os.Bundle");
    }
}
