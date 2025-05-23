package AFJwXvA7oVH31gQEQ4Na6nqT7ks6MkDfDBK9m8OoCiLcPgyglD8OizYDKM7bJotG87i9US8GO3UJUgMHVAE8AFlySq3UWNEJ0e0taugN3A25zFpYXKp5iwdskqoqYOTywFA;

import JYJjVrtoNPH0ZPVFuXUUUodrW1lMAjpTvOe744s6s17UKUwuiHWN7QnbHz0A94mKrW23YzpGAZQ1TBH6hRnR.M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh;
import Xl1fS84ifTfDIVd462oyI4uximijChWvbQGxSPFGZkUYuO2hFcgMJlvaAAOFzarX1k2ap6Owv2LzjHqMKk0DngVbj86K0XK3ITxX0Glxic4HytmA5IKRwdTNDCa.QUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI;
import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import cyMBI34GbF8CuRCy99XkVo58sgWctMSIkA9jnoh3QJ28vQt6QUEU9yz8oT6Uo4Ee3j0.LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1 {
    public static final QUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = new QUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI(2);
    public static final LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA YmFIHVAy6MFnHbke10dLWI57IXCp = new LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA(0);

    public static NrRzqnkwNu0nnqBOm1PWjgXM1XJmOU4AUNIao5PXqr65iPoidXJXhn2k0kJ93[] DrqQ8C7rtVRDTSclHGsDImq(Context context, aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux, String str) {
        ContentProviderClient acquireUnstableContentProviderClient;
        Cursor cursor;
        String str2 = str;
        M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh.ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str2).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
            acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            cursor = null;
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh.ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96("ContentQueryWrapper.query");
            try {
                String[] strArr2 = {aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux.DrqQ8C7rtVRDTSclHGsDImq};
                if (acquireUnstableContentProviderClient != null) {
                    cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, (String) null, (CancellationSignal) null);
                }
            } catch (RemoteException e) {
                Log.w("FontsProvider", "Unable to query the content provider", e);
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
            Trace.endSection();
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    arrayList2.add(new NrRzqnkwNu0nnqBOm1PWjgXM1XJmOU4AUNIao5PXqr65iPoidXJXhn2k0kJ93(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                }
                arrayList = arrayList2;
            }
            if (cursor != null) {
                cursor.close();
            }
            if (acquireUnstableContentProviderClient != null) {
                acquireUnstableContentProviderClient.close();
            }
            NrRzqnkwNu0nnqBOm1PWjgXM1XJmOU4AUNIao5PXqr65iPoidXJXhn2k0kJ93[] nrRzqnkwNu0nnqBOm1PWjgXM1XJmOU4AUNIao5PXqr65iPoidXJXhn2k0kJ93Arr = (NrRzqnkwNu0nnqBOm1PWjgXM1XJmOU4AUNIao5PXqr65iPoidXJXhn2k0kJ93[]) arrayList.toArray(new NrRzqnkwNu0nnqBOm1PWjgXM1XJmOU4AUNIao5PXqr65iPoidXJXhn2k0kJ93[0]);
            Trace.endSection();
            return nrRzqnkwNu0nnqBOm1PWjgXM1XJmOU4AUNIao5PXqr65iPoidXJXhn2k0kJ93Arr;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static D8GgZbzcKj5rilKnkj8e7mJ1giKXr7PVzF6Rm3iAMV12GPJFjJsP85ro8B5TqnDd3HSKa30yTfOnQUxiSzoUz76iRkaUnM8auyBFxe5kbLQOgcMjtAdyoJ8gOPES2QZYZSBpUK6Mt0I5HQrX8aYczk P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(Context context, List list) {
        M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh.ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux = (aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX) list.get(i);
                ProviderInfo YmFIHVAy6MFnHbke10dLWI57IXCp2 = YmFIHVAy6MFnHbke10dLWI57IXCp(context.getPackageManager(), aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux, context.getResources());
                if (YmFIHVAy6MFnHbke10dLWI57IXCp2 == null) {
                    D8GgZbzcKj5rilKnkj8e7mJ1giKXr7PVzF6Rm3iAMV12GPJFjJsP85ro8B5TqnDd3HSKa30yTfOnQUxiSzoUz76iRkaUnM8auyBFxe5kbLQOgcMjtAdyoJ8gOPES2QZYZSBpUK6Mt0I5HQrX8aYczk d8GgZbzcKj5rilKnkj8e7mJ1giKXr7PVzF6Rm3iAMV12GPJFjJsP85ro8B5TqnDd3HSKa30yTfOnQUxiSzoUz76iRkaUnM8auyBFxe5kbLQOgcMjtAdyoJ8gOPES2QZYZSBpUK6Mt0I5HQrX8aYczk = new D8GgZbzcKj5rilKnkj8e7mJ1giKXr7PVzF6Rm3iAMV12GPJFjJsP85ro8B5TqnDd3HSKa30yTfOnQUxiSzoUz76iRkaUnM8auyBFxe5kbLQOgcMjtAdyoJ8gOPES2QZYZSBpUK6Mt0I5HQrX8aYczk(0);
                    Trace.endSection();
                    return d8GgZbzcKj5rilKnkj8e7mJ1giKXr7PVzF6Rm3iAMV12GPJFjJsP85ro8B5TqnDd3HSKa30yTfOnQUxiSzoUz76iRkaUnM8auyBFxe5kbLQOgcMjtAdyoJ8gOPES2QZYZSBpUK6Mt0I5HQrX8aYczk;
                }
                arrayList.add(DrqQ8C7rtVRDTSclHGsDImq(context, aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux, YmFIHVAy6MFnHbke10dLWI57IXCp2.authority));
            }
            D8GgZbzcKj5rilKnkj8e7mJ1giKXr7PVzF6Rm3iAMV12GPJFjJsP85ro8B5TqnDd3HSKa30yTfOnQUxiSzoUz76iRkaUnM8auyBFxe5kbLQOgcMjtAdyoJ8gOPES2QZYZSBpUK6Mt0I5HQrX8aYczk d8GgZbzcKj5rilKnkj8e7mJ1giKXr7PVzF6Rm3iAMV12GPJFjJsP85ro8B5TqnDd3HSKa30yTfOnQUxiSzoUz76iRkaUnM8auyBFxe5kbLQOgcMjtAdyoJ8gOPES2QZYZSBpUK6Mt0I5HQrX8aYczk2 = new D8GgZbzcKj5rilKnkj8e7mJ1giKXr7PVzF6Rm3iAMV12GPJFjJsP85ro8B5TqnDd3HSKa30yTfOnQUxiSzoUz76iRkaUnM8auyBFxe5kbLQOgcMjtAdyoJ8gOPES2QZYZSBpUK6Mt0I5HQrX8aYczk(arrayList);
            Trace.endSection();
            return d8GgZbzcKj5rilKnkj8e7mJ1giKXr7PVzF6Rm3iAMV12GPJFjJsP85ro8B5TqnDd3HSKa30yTfOnQUxiSzoUz76iRkaUnM8auyBFxe5kbLQOgcMjtAdyoJ8gOPES2QZYZSBpUK6Mt0I5HQrX8aYczk2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [AFJwXvA7oVH31gQEQ4Na6nqT7ks6MkDfDBK9m8OoCiLcPgyglD8OizYDKM7bJotG87i9US8GO3UJUgMHVAE8AFlySq3UWNEJ0e0taugN3A25zFpYXKp5iwdskqoqYOTywFA.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK, java.lang.Object] */
    public static ProviderInfo YmFIHVAy6MFnHbke10dLWI57IXCp(PackageManager packageManager, aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux, Resources resources) {
        M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh.ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96("FontProvider.getProvider");
        try {
            List list = aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU;
            String str = aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
            String str2 = aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux.YmFIHVAy6MFnHbke10dLWI57IXCp;
            if (list == null) {
                list = LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(resources, 0);
            }
            ? obj = new Object();
            obj.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = str;
            obj.YmFIHVAy6MFnHbke10dLWI57IXCp = str2;
            obj.DrqQ8C7rtVRDTSclHGsDImq = list;
            QUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI qUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI = P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
            ProviderInfo providerInfo = (ProviderInfo) qUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI.YmFIHVAy6MFnHbke10dLWI57IXCp(obj);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            } else if (resolveContentProvider.packageName.equals(str2)) {
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature byteArray : signatureArr) {
                    arrayList.add(byteArray.toByteArray());
                }
                LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA lKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA = YmFIHVAy6MFnHbke10dLWI57IXCp;
                Collections.sort(arrayList, lKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA);
                for (int i = 0; i < list.size(); i++) {
                    ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                    Collections.sort(arrayList2, lKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA);
                    if (arrayList.size() == arrayList2.size()) {
                        int i2 = 0;
                        while (i2 < arrayList.size()) {
                            if (Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                                i2++;
                            }
                        }
                        qUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI.DrqQ8C7rtVRDTSclHGsDImq(obj, resolveContentProvider);
                        Trace.endSection();
                        return resolveContentProvider;
                    }
                }
                Trace.endSection();
                return null;
            } else {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
        } finally {
            Trace.endSection();
        }
    }
}
