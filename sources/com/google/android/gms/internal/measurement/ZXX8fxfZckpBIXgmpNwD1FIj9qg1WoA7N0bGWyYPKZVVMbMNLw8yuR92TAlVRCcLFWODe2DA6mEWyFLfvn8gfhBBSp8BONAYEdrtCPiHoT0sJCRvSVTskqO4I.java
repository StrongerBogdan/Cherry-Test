package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.HashMap;

public final class ZXX8fxfZckpBIXgmpNwD1FIj9qg1WoA7N0bGWyYPKZVVMbMNLw8yuR92TAlVRCcLFWODe2DA6mEWyFLfvn8gfhBBSp8BONAYEdrtCPiHoT0sJCRvSVTskqO4I {
    public static HashMap P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(ContentResolver contentResolver, String[] strArr) {
        Cursor query = contentResolver.query(Rf9noF1BWgUo2ypT0aO99tv2ZzG6RwLUG5pydnWvaymaAZFm2Tb9aL8gLzVhZek9OfyH6GaE6Z2kDK9qEuHqvJJ5QHKtEcRahXrREIiM12CwFXl1o1LDutMkaQpSl2cAe71QjWOL58YxedqPJ4vLZEsbvb.YmFIHVAy6MFnHbke10dLWI57IXCp, (String[]) null, (String) null, strArr, (String) null);
        if (query != null) {
            try {
                HashMap hashMap = new HashMap(query.getCount(), 1.0f);
                while (query.moveToNext()) {
                    hashMap.put(query.getString(0), query.getString(1));
                }
                query.close();
                return hashMap;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw new Exception("Failed to connect to GservicesProvider");
        }
        throw th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean YmFIHVAy6MFnHbke10dLWI57IXCp(byte[] r8, int r9, int r10) {
        /*
        L_0x0000:
            if (r9 >= r10) goto L_0x0009
            byte r0 = r8[r9]
            if (r0 < 0) goto L_0x0009
            int r9 = r9 + 1
            goto L_0x0000
        L_0x0009:
            r0 = 0
            if (r9 < r10) goto L_0x000f
        L_0x000c:
            r2 = r0
            goto L_0x0079
        L_0x000f:
            if (r9 < r10) goto L_0x0012
            goto L_0x000c
        L_0x0012:
            int r1 = r9 + 1
            byte r2 = r8[r9]
            if (r2 >= 0) goto L_0x007e
            r3 = -32
            r4 = -1
            r5 = -65
            if (r2 >= r3) goto L_0x002e
            if (r1 < r10) goto L_0x0022
            goto L_0x0079
        L_0x0022:
            r3 = -62
            if (r2 < r3) goto L_0x002c
            int r9 = r9 + 2
            byte r1 = r8[r1]
            if (r1 <= r5) goto L_0x000f
        L_0x002c:
            r2 = r4
            goto L_0x0079
        L_0x002e:
            r6 = -16
            if (r2 >= r6) goto L_0x0054
            int r6 = r10 + -1
            if (r1 < r6) goto L_0x003b
            int r2 = com.google.android.gms.internal.measurement.bGikb8Fdz0jququN5jOFyS41xN18nWHDMvqlSuGlsUtVhHE1oAI4h994RTNLMVxTF3TaXYF7MSWZbUd3exu1pqLklVa8SQX5LgxUgMxvyjes7L5Z0Rp0AfJ2NBasiVzbqdqEfmH.DrqQ8C7rtVRDTSclHGsDImq(r8, r1, r10)
            goto L_0x0079
        L_0x003b:
            int r6 = r9 + 2
            byte r1 = r8[r1]
            if (r1 > r5) goto L_0x002c
            r7 = -96
            if (r2 != r3) goto L_0x0047
            if (r1 < r7) goto L_0x002c
        L_0x0047:
            r3 = -19
            if (r2 != r3) goto L_0x004d
            if (r1 >= r7) goto L_0x002c
        L_0x004d:
            int r9 = r9 + 3
            byte r1 = r8[r6]
            if (r1 <= r5) goto L_0x000f
            goto L_0x002c
        L_0x0054:
            int r3 = r10 + -2
            if (r1 < r3) goto L_0x005d
            int r2 = com.google.android.gms.internal.measurement.bGikb8Fdz0jququN5jOFyS41xN18nWHDMvqlSuGlsUtVhHE1oAI4h994RTNLMVxTF3TaXYF7MSWZbUd3exu1pqLklVa8SQX5LgxUgMxvyjes7L5Z0Rp0AfJ2NBasiVzbqdqEfmH.DrqQ8C7rtVRDTSclHGsDImq(r8, r1, r10)
            goto L_0x0079
        L_0x005d:
            int r3 = r9 + 2
            byte r1 = r8[r1]
            if (r1 > r5) goto L_0x002c
            int r2 = r2 << 28
            int r1 = r1 + 112
            int r1 = r1 + r2
            int r1 = r1 >> 30
            if (r1 != 0) goto L_0x002c
            int r1 = r9 + 3
            byte r2 = r8[r3]
            if (r2 > r5) goto L_0x002c
            int r9 = r9 + 4
            byte r1 = r8[r1]
            if (r1 <= r5) goto L_0x000f
            goto L_0x002c
        L_0x0079:
            if (r2 != 0) goto L_0x007d
            r8 = 1
            return r8
        L_0x007d:
            return r0
        L_0x007e:
            r9 = r1
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ZXX8fxfZckpBIXgmpNwD1FIj9qg1WoA7N0bGWyYPKZVVMbMNLw8yuR92TAlVRCcLFWODe2DA6mEWyFLfvn8gfhBBSp8BONAYEdrtCPiHoT0sJCRvSVTskqO4I.YmFIHVAy6MFnHbke10dLWI57IXCp(byte[], int, int):boolean");
    }
}
