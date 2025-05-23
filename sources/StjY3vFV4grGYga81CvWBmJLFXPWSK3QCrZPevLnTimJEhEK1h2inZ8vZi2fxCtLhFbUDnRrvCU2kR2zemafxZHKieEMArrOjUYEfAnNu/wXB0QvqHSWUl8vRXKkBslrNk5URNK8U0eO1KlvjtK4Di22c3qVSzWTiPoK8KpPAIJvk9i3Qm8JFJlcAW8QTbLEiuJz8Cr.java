package StjY3vFV4grGYga81CvWBmJLFXPWSK3QCrZPevLnTimJEhEK1h2inZ8vZi2fxCtLhFbUDnRrvCU2kR2zemafxZHKieEMArrOjUYEfAnNu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
import wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5;

public final class wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr {
    public final Bundle P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;

    public wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr(Context context) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = bundle == null ? Bundle.EMPTY : bundle;
    }

    public static String Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static boolean uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public JSONArray DrqQ8C7rtVRDTSclHGsDImq(String str) {
        String H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ = H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str);
        if (TextUtils.isEmpty(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ)) {
            return null;
        }
        try {
            return new JSONArray(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X(str) + ": " + H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ + ", falling back to default");
            return null;
        }
    }

    public String H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(String str) {
        Bundle bundle = this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public boolean P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(String str) {
        String H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ = H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str);
        return "1".equals(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ) || Boolean.parseBoolean(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ);
    }

    public String VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(Resources resources, String str, String str2) {
        String[] strArr;
        String H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ = H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str2);
        if (!TextUtils.isEmpty(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ)) {
            return H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ;
        }
        String H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ2 = H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ2)) {
            return null;
        }
        int identifier = resources.getIdentifier(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray DrqQ8C7rtVRDTSclHGsDImq = DrqQ8C7rtVRDTSclHGsDImq(str2.concat("_loc_args"));
        if (DrqQ8C7rtVRDTSclHGsDImq == null) {
            strArr = null;
        } else {
            int length = DrqQ8C7rtVRDTSclHGsDImq.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = DrqQ8C7rtVRDTSclHGsDImq.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    public Integer YmFIHVAy6MFnHbke10dLWI57IXCp(String str) {
        String H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ = H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str);
        if (TextUtils.isEmpty(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X(str) + "(" + H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ + ") into an int");
            return null;
        }
    }

    public Boolean oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU() {
        Bundle bundle = this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    public Bundle peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6() {
        Bundle bundle = this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
        Bundle bundle2 = new Bundle(bundle);
        for (String next : bundle.keySet()) {
            if (!next.startsWith("google.c.a.") && !next.equals("from")) {
                bundle2.remove(next);
            }
        }
        return bundle2;
    }

    public wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr(Bundle bundle) {
        this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = new Bundle(bundle);
    }
}
