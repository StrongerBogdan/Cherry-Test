package wYBCCsFMvDpu12Co18Mm0Qosb7ZQOHJBbNLI0;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

public final /* synthetic */ class bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf implements Callable {
    public final /* synthetic */ Context P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
    public final /* synthetic */ Intent YmFIHVAy6MFnHbke10dLWI57IXCp;

    public /* synthetic */ bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf(Context context, Intent intent) {
        this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = context;
        this.YmFIHVAy6MFnHbke10dLWI57IXCp = intent;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r9 = this;
            android.content.Context r0 = r9.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d
            android.content.Intent r1 = r9.YmFIHVAy6MFnHbke10dLWI57IXCp
            wYBCCsFMvDpu12Co18Mm0Qosb7ZQOHJBbNLI0.gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG r2 = wYBCCsFMvDpu12Co18Mm0Qosb7ZQOHJBbNLI0.gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG.HcGgqmTrfEBzZy0CmDiIV3ZElJEuPtc3JIfGYgq465Eh()
            r2.getClass()
            java.lang.String r3 = "FirebaseMessaging"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x001b
            java.lang.String r3 = "FirebaseMessaging"
            java.lang.String r5 = "Starting service"
            android.util.Log.d(r3, r5)
        L_0x001b:
            java.lang.Object r3 = r2.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            r3.offer(r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = "com.google.firebase.MESSAGING_EVENT"
            r1.<init>(r3)
            java.lang.String r3 = r0.getPackageName()
            r1.setPackage(r3)
            java.lang.String r3 = "Error resolving target intent service, skipping classname enforcement. Resolved service was: "
            monitor-enter(r2)
            java.lang.Object r5 = r2.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9     // Catch:{ all -> 0x007e }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x003c
            monitor-exit(r2)
            goto L_0x00b5
        L_0x003c:
            android.content.pm.PackageManager r5 = r0.getPackageManager()     // Catch:{ all -> 0x007e }
            r6 = 0
            android.content.pm.ResolveInfo r5 = r5.resolveService(r1, r6)     // Catch:{ all -> 0x007e }
            r6 = 0
            if (r5 == 0) goto L_0x00ac
            android.content.pm.ServiceInfo r5 = r5.serviceInfo     // Catch:{ all -> 0x007e }
            if (r5 != 0) goto L_0x004d
            goto L_0x00ac
        L_0x004d:
            java.lang.String r7 = r0.getPackageName()     // Catch:{ all -> 0x007e }
            java.lang.String r8 = r5.packageName     // Catch:{ all -> 0x007e }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x007e }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = r5.name     // Catch:{ all -> 0x007e }
            if (r7 != 0) goto L_0x005e
            goto L_0x008c
        L_0x005e:
            java.lang.String r3 = "."
            boolean r3 = r7.startsWith(r3)     // Catch:{ all -> 0x007e }
            if (r3 == 0) goto L_0x0081
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            r3.<init>()     // Catch:{ all -> 0x007e }
            java.lang.String r6 = r0.getPackageName()     // Catch:{ all -> 0x007e }
            r3.append(r6)     // Catch:{ all -> 0x007e }
            java.lang.String r5 = r5.name     // Catch:{ all -> 0x007e }
            r3.append(r5)     // Catch:{ all -> 0x007e }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x007e }
            r2.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = r3     // Catch:{ all -> 0x007e }
            goto L_0x0085
        L_0x007e:
            r0 = move-exception
            goto L_0x011d
        L_0x0081:
            java.lang.String r3 = r5.name     // Catch:{ all -> 0x007e }
            r2.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = r3     // Catch:{ all -> 0x007e }
        L_0x0085:
            java.lang.Object r3 = r2.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9     // Catch:{ all -> 0x007e }
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x007e }
            monitor-exit(r2)
            goto L_0x00b5
        L_0x008c:
            java.lang.String r7 = "FirebaseMessaging"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            r8.<init>(r3)     // Catch:{ all -> 0x007e }
            java.lang.String r3 = r5.packageName     // Catch:{ all -> 0x007e }
            r8.append(r3)     // Catch:{ all -> 0x007e }
            java.lang.String r3 = "/"
            r8.append(r3)     // Catch:{ all -> 0x007e }
            java.lang.String r3 = r5.name     // Catch:{ all -> 0x007e }
            r8.append(r3)     // Catch:{ all -> 0x007e }
            java.lang.String r3 = r8.toString()     // Catch:{ all -> 0x007e }
            android.util.Log.e(r7, r3)     // Catch:{ all -> 0x007e }
            monitor-exit(r2)
        L_0x00aa:
            r5 = r6
            goto L_0x00b5
        L_0x00ac:
            java.lang.String r3 = "FirebaseMessaging"
            java.lang.String r5 = "Failed to resolve target intent service, skipping classname enforcement"
            android.util.Log.e(r3, r5)     // Catch:{ all -> 0x007e }
            monitor-exit(r2)
            goto L_0x00aa
        L_0x00b5:
            if (r5 == 0) goto L_0x00d1
            java.lang.String r3 = "FirebaseMessaging"
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x00ca
            java.lang.String r3 = "FirebaseMessaging"
            java.lang.String r4 = "Restricting intent to a specific service: "
            java.lang.String r4 = r4.concat(r5)
            android.util.Log.d(r3, r4)
        L_0x00ca:
            java.lang.String r3 = r0.getPackageName()
            r1.setClassName(r3, r5)
        L_0x00d1:
            boolean r2 = r2.qk6QoGpJ7mUVRHlBbEKbscA2uzM6o8hlNA4O9PJXfYl0gWws0Zlal(r0)     // Catch:{ SecurityException -> 0x00de, IllegalStateException -> 0x00dc }
            if (r2 == 0) goto L_0x00e0
            android.content.ComponentName r0 = wYBCCsFMvDpu12Co18Mm0Qosb7ZQOHJBbNLI0.ivQeO4ds3AzMpcwdFgIxEkbF7HY5gW00DxiVZ17i8v6rvihjoQqVYGLPAIExy5KvIXHLnlK4MidLXOlZaod51FPBoffarUoAzUEp85WgjVEiTVDF6GNATC4L7XMB2wUR2nPosKIgnHxzr.DrqQ8C7rtVRDTSclHGsDImq(r0, r1)     // Catch:{ SecurityException -> 0x00de, IllegalStateException -> 0x00dc }
            goto L_0x00eb
        L_0x00dc:
            r0 = move-exception
            goto L_0x00f9
        L_0x00de:
            r0 = move-exception
            goto L_0x010f
        L_0x00e0:
            android.content.ComponentName r0 = r0.startService(r1)     // Catch:{ SecurityException -> 0x00de, IllegalStateException -> 0x00dc }
            java.lang.String r1 = "FirebaseMessaging"
            java.lang.String r2 = "Missing wake lock permission, service start may be delayed"
            android.util.Log.d(r1, r2)     // Catch:{ SecurityException -> 0x00de, IllegalStateException -> 0x00dc }
        L_0x00eb:
            if (r0 != 0) goto L_0x00f7
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "Error while delivering the message: ServiceIntent not found."
            android.util.Log.e(r0, r1)     // Catch:{ SecurityException -> 0x00de, IllegalStateException -> 0x00dc }
            r0 = 404(0x194, float:5.66E-43)
            goto L_0x0118
        L_0x00f7:
            r0 = -1
            goto L_0x0118
        L_0x00f9:
            java.lang.String r1 = "FirebaseMessaging"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to start service while in background: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.e(r1, r0)
            r0 = 402(0x192, float:5.63E-43)
            goto L_0x0118
        L_0x010f:
            java.lang.String r1 = "FirebaseMessaging"
            java.lang.String r2 = "Error while delivering the message to the serviceIntent"
            android.util.Log.e(r1, r2, r0)
            r0 = 401(0x191, float:5.62E-43)
        L_0x0118:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x011d:
            monitor-exit(r2)     // Catch:{ all -> 0x007e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wYBCCsFMvDpu12Co18Mm0Qosb7ZQOHJBbNLI0.bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf.call():java.lang.Object");
    }
}
