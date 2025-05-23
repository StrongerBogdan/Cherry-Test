package JYJjVrtoNPH0ZPVFuXUUUodrW1lMAjpTvOe744s6s17UKUwuiHWN7QnbHz0A94mKrW23YzpGAZQ1TBH6hRnR;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.openjsse.net.ssl.OpenJSSE;
import wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5;

public final class tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 extends nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC {
    public static final boolean VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU;
    public final Provider DrqQ8C7rtVRDTSclHGsDImq = new OpenJSSE();

    static {
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU = z;
    }

    public final String H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(SSLSocket sSLSocket) {
        return null;
    }

    public final SSLContext N5pXJ15tlNKatG0sBkhrXfiY7co2blYTvm3kVKApSyrf0tWXKlKPrkuHPRi2aPYj45VAoMTWa6sKGS2ZcLrtOpdnNxkt95tZnbpxQYN1985ys62TvSqA() {
        SSLContext instance = SSLContext.getInstance("TLSv1.3", this.DrqQ8C7rtVRDTSclHGsDImq);
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(instance, "getInstance(\"TLSv1.3\", provider)");
        return instance;
    }

    public final X509TrustManager Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.DrqQ8C7rtVRDTSclHGsDImq);
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.DrqQ8C7rtVRDTSclHGsDImq(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }

    public final void VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(SSLSocket sSLSocket, String str, List list) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(list, "protocols");
        super.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(sSLSocket, str, list);
    }
}
