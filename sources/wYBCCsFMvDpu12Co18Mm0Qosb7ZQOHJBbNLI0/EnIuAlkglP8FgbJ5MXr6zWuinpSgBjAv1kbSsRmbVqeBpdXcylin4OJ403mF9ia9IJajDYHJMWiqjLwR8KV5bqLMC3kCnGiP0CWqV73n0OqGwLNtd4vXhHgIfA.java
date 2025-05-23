package wYBCCsFMvDpu12Co18Mm0Qosb7ZQOHJBbNLI0;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH {
    public static final long VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU = TimeUnit.DAYS.toMillis(7);
    public final long DrqQ8C7rtVRDTSclHGsDImq;
    public final String P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
    public final String YmFIHVAy6MFnHbke10dLWI57IXCp;

    public EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH(long j, String str, String str2) {
        this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = str;
        this.YmFIHVAy6MFnHbke10dLWI57IXCp = str2;
        this.DrqQ8C7rtVRDTSclHGsDImq = j;
    }

    public static String P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(long j, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    public static EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH YmFIHVAy6MFnHbke10dLWI57IXCp(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH(0, str, (String) null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e);
            return null;
        }
    }
}
