package androidx.startup;

import B3PwWri6DSCoKraVluZjHaYZBf4Lra3UOWVB2XDM1KMB7OhKt20cO66HHxEdolbRaQev0TMOd0xc0bCAhppBTe703AYmEST1PHX6D9o2QFzGpBJe85D0v1a3US.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr;
import JYJjVrtoNPH0ZPVFuXUUUodrW1lMAjpTvOe744s6s17UKUwuiHWN7QnbHz0A94mKrW23YzpGAZQ1TBH6hRnR.M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;

public class InitializationProvider extends ContentProvider {
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new RuntimeException("Context cannot be null");
        } else if (context.getApplicationContext() == null) {
            return true;
        } else {
            wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr DrqQ8C7rtVRDTSclHGsDImq = wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.DrqQ8C7rtVRDTSclHGsDImq(context);
            Context context2 = DrqQ8C7rtVRDTSclHGsDImq.DrqQ8C7rtVRDTSclHGsDImq;
            try {
                M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh.ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96("Startup");
                DrqQ8C7rtVRDTSclHGsDImq.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(context2.getPackageManager().getProviderInfo(new ComponentName(context2.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
                Trace.endSection();
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
