package FR5EjxHMlnhgT4g3Cx4ZlPTPTuR7VSyr9dS4OVpMDfBHg2BGe3HbA1bXzNKGQKMp0i40dVoHiWcnjoEpq4vvipBd2;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;

public abstract class HYy5buoEq9cltioL1Vju6g9fMXNHB2tQviUIdVgejnJXgtomQ4T0yTntgQwY1LlZPMN009diJgWUqwqWYFfpoGhWkMAB1vA {
    public static volatile Handler DrqQ8C7rtVRDTSclHGsDImq;
    public static final char[] P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = "0123456789abcdef".toCharArray();
    public static final char[] YmFIHVAy6MFnHbke10dLWI57IXCp = new char[64];

    public static boolean BrinjKkMNX0Ww9FldCotLl2(int i, int i2) {
        return Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X(i) && Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X(i2);
    }

    public static int DrqQ8C7rtVRDTSclHGsDImq(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        } else {
            throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
        }
    }

    public static boolean Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public static Handler H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ() {
        if (DrqQ8C7rtVRDTSclHGsDImq == null) {
            synchronized (HYy5buoEq9cltioL1Vju6g9fMXNHB2tQviUIdVgejnJXgtomQ4T0yTntgQwY1LlZPMN009diJgWUqwqWYFfpoGhWkMAB1vA.class) {
                try {
                    if (DrqQ8C7rtVRDTSclHGsDImq == null) {
                        DrqQ8C7rtVRDTSclHGsDImq = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return DrqQ8C7rtVRDTSclHGsDImq;
    }

    public static void P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static int VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = QUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    public static boolean YmFIHVAy6MFnHbke10dLWI57IXCp(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static ArrayList oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static int peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6(int i, Object obj) {
        return uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn(obj == null ? 0 : obj.hashCode(), i);
    }

    public static int uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn(int i, int i2) {
        return (i2 * 31) + i;
    }
}
