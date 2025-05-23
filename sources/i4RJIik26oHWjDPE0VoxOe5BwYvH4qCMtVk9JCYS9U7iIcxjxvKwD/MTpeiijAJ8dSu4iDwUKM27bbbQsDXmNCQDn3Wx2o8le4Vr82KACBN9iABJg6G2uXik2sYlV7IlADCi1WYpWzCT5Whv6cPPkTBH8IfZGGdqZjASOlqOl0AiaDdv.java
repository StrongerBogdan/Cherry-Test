package i4RJIik26oHWjDPE0VoxOe5BwYvH4qCMtVk9JCYS9U7iIcxjxvKwD;

import android.util.Log;
import c2yxYch4bf6VXBVNUy3NZX8oGW4t5Zg7Q8paKL0wjrgeivqvR4o84Q.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k7E5adRDhz5TrQ52amP8wLo7HDbhrH2l5KpaWndX6GGTgMTxgSQneaXCWa2mPoOSZJ040aUJCrzVnziwwkci4knTDk5UrFr7180K7Lrs6FIFy7B.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s {
    public static final Charset YmFIHVAy6MFnHbke10dLWI57IXCp = Charset.forName("UTF-8");
    public final FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;

    public MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s(FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK) {
        this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK;
    }

    public static void H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), (Throwable) null);
        }
    }

    public static HashMap P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, (String) null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public static ArrayList YmFIHVAy6MFnHbke10dLWI57IXCp(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(tygdzrfuG3bl1r2ouET5CaGhmt4ugo8.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(string));
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    public static String oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(tygdzrfuG3bl1r2ouET5CaGhmt4ugo8.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d.uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn(list.get(i))));
            } catch (JSONException e) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    public final Map DrqQ8C7rtVRDTSclHGsDImq(String str, boolean z) {
        Exception e;
        FileInputStream fileInputStream;
        FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK = this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
        File H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ = z ? fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str, "internal-keys") : fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str, "keys");
        if (!H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ.exists() || H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ.length() == 0) {
            H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ);
            try {
                HashMap P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d2 = P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.BrinjKkMNX0Ww9FldCotLl2(fileInputStream));
                jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(fileInputStream, "Failed to close user metadata file.");
                return P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d2;
            } catch (Exception e2) {
                e = e2;
                try {
                    Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                    H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ);
                    jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e3) {
            Exception exc = e3;
            fileInputStream = null;
            e = exc;
            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
            H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ);
            jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(fileInputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        } catch (Throwable th2) {
            th = th2;
            jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public final void Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X(String str, String str2) {
        File H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ = this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str, "user-data");
        BufferedWriter bufferedWriter = null;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userId", str2);
            String obj = jSONObject.toString();
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ), YmFIHVAy6MFnHbke10dLWI57IXCp));
            try {
                bufferedWriter2.write(obj);
                bufferedWriter2.flush();
                jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(bufferedWriter2, "Failed to close user metadata file.");
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                    jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(bufferedWriter, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
            jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(bufferedWriter, "Failed to close user metadata file.");
        }
    }

    public final String VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(String str) {
        FileInputStream fileInputStream;
        File H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ = this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str, "user-data");
        FileInputStream fileInputStream2 = null;
        if (!H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ.exists() || H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ.length() == 0) {
            String H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ2 = wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ("No userId set for session ", str);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ2, (Throwable) null);
            }
            H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ);
            try {
                JSONObject jSONObject = new JSONObject(jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.BrinjKkMNX0Ww9FldCotLl2(fileInputStream));
                String optString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", (String) null) : null;
                String str2 = "Loaded userId " + optString + " for session " + str;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str2, (Throwable) null);
                }
                jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(fileInputStream, "Failed to close user metadata file.");
                return optString;
            } catch (Exception e) {
                e = e;
                try {
                    Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                    H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ);
                    jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(fileInputStream, "Failed to close user metadata file.");
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
            H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ);
            jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(fileInputStream, "Failed to close user metadata file.");
            return null;
        } catch (Throwable th2) {
            th = th2;
            jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public final void peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6(String str, List list) {
        File H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ = this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str, "rollouts-state");
        if (list.isEmpty()) {
            H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ);
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            String oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU = oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(list);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ), YmFIHVAy6MFnHbke10dLWI57IXCp));
            try {
                bufferedWriter2.write(oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU);
                bufferedWriter2.flush();
                jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(bufferedWriter2, "Failed to close rollouts state file.");
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                    H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ);
                    jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Throwable th) {
                    th = th;
                    jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(bufferedWriter, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(bufferedWriter, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
            H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ);
            jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(bufferedWriter, "Failed to close rollouts state file.");
        }
    }

    public final void uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn(String str, Map map, boolean z) {
        FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK = this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
        File H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ = z ? fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str, "internal-keys") : fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str, "keys");
        BufferedWriter bufferedWriter = null;
        try {
            String jSONObject = new JSONObject(map).toString();
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ), YmFIHVAy6MFnHbke10dLWI57IXCp));
            try {
                bufferedWriter2.write(jSONObject);
                bufferedWriter2.flush();
                jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(bufferedWriter2, "Failed to close key/value metadata file.");
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                    H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ);
                    jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(bufferedWriter, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
            H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ);
            jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.DrqQ8C7rtVRDTSclHGsDImq(bufferedWriter, "Failed to close key/value metadata file.");
        }
    }
}
