package wYBCCsFMvDpu12Co18Mm0Qosb7ZQOHJBbNLI0;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;
import k7E5adRDhz5TrQ52amP8wLo7HDbhrH2l5KpaWndX6GGTgMTxgSQneaXCWa2mPoOSZJ040aUJCrzVnziwwkci4knTDk5UrFr7180K7Lrs6FIFy7B.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr;

public final class oEviWAW8kWCMiO2chxu48VQJbWaJqTNxq1swuwpK5tQ {
    public static final Pattern VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String DrqQ8C7rtVRDTSclHGsDImq;
    public final String P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
    public final String YmFIHVAy6MFnHbke10dLWI57IXCp;

    public oEviWAW8kWCMiO2chxu48VQJbWaJqTNxq1swuwpK5tQ(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        }
        if (str3 == null || !VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU.matcher(str3).matches()) {
            throw new IllegalArgumentException(wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = str3;
        this.YmFIHVAy6MFnHbke10dLWI57IXCp = str;
        this.DrqQ8C7rtVRDTSclHGsDImq = str + "!" + str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oEviWAW8kWCMiO2chxu48VQJbWaJqTNxq1swuwpK5tQ)) {
            return false;
        }
        oEviWAW8kWCMiO2chxu48VQJbWaJqTNxq1swuwpK5tQ oeviwaw8kwcmio2chxu48vqjbwajqtnxq1swuwpk5tq = (oEviWAW8kWCMiO2chxu48VQJbWaJqTNxq1swuwpK5tQ) obj;
        return this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d.equals(oeviwaw8kwcmio2chxu48vqjbwajqtnxq1swuwpk5tq.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d) && this.YmFIHVAy6MFnHbke10dLWI57IXCp.equals(oeviwaw8kwcmio2chxu48vqjbwajqtnxq1swuwpk5tq.YmFIHVAy6MFnHbke10dLWI57IXCp);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.YmFIHVAy6MFnHbke10dLWI57IXCp, this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d});
    }
}
