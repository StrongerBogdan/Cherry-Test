package JYJjVrtoNPH0ZPVFuXUUUodrW1lMAjpTvOe744s6s17UKUwuiHWN7QnbHz0A94mKrW23YzpGAZQ1TBH6hRnR;

import BBLgU2sZePRB1X9JRGvMPg1Mwx1Zs997nBMSutiVbXn4Hz8t8sj8RKKj76TkXM1opLAZ71SD9qNfXni.Um9b2ks8Y0LiK3u4FrDpXIUf9CDB20azqNED8tqUF5QXjqNMzV6NToOBBjWfuzhJwt8AdCxM1KC0y54xLsKDQKV5vpV75DQjOjBEi7ECY0uxjR1BVNeGxeMiDLdAwy33RHeQ9vkNdSttO818vnfVccP8CWp;
import java.security.KeyStore;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5;

public final class bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf extends nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC {
    public static final boolean VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU;
    public final Provider DrqQ8C7rtVRDTSclHGsDImq;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, Um9b2ks8Y0LiK3u4FrDpXIUf9CDB20azqNED8tqUF5QXjqNMzV6NToOBBjWfuzhJwt8AdCxM1KC0y54xLsKDQKV5vpV75DQjOjBEi7ECY0uxjR1BVNeGxeMiDLdAwy33RHeQ9vkNdSttO818vnfVccP8CWp.class.getClassLoader());
            if (Conscrypt.isAvailable() && Um9b2ks8Y0LiK3u4FrDpXIUf9CDB20azqNED8tqUF5QXjqNMzV6NToOBBjWfuzhJwt8AdCxM1KC0y54xLsKDQKV5vpV75DQjOjBEi7ECY0uxjR1BVNeGxeMiDLdAwy33RHeQ9vkNdSttO818vnfVccP8CWp.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d()) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU = z;
    }

    public bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf() {
        Provider newProvider = Conscrypt.newProvider();
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(newProvider, "newProvider()");
        this.DrqQ8C7rtVRDTSclHGsDImq = newProvider;
    }

    public final String H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    public final SSLContext N5pXJ15tlNKatG0sBkhrXfiY7co2blYTvm3kVKApSyrf0tWXKlKPrkuHPRi2aPYj45VAoMTWa6sKGS2ZcLrtOpdnNxkt95tZnbpxQYN1985ys62TvSqA() {
        SSLContext instance = SSLContext.getInstance("TLS", this.DrqQ8C7rtVRDTSclHGsDImq);
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(instance, "getInstance(\"TLS\", provider)");
        return instance;
    }

    public final X509TrustManager Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.DrqQ8C7rtVRDTSclHGsDImq(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d);
                return x509TrustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }

    public final void VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(SSLSocket sSLSocket, String str, List list) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) Um9b2ks8Y0LiK3u4FrDpXIUf9CDB20azqNED8tqUF5QXjqNMzV6NToOBBjWfuzhJwt8AdCxM1KC0y54xLsKDQKV5vpV75DQjOjBEi7ECY0uxjR1BVNeGxeMiDLdAwy33RHeQ9vkNdSttO818vnfVccP8CWp.DrqQ8C7rtVRDTSclHGsDImq(list).toArray(new String[0]));
            return;
        }
        super.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(sSLSocket, str, list);
    }

    public final SSLSocketFactory xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9(X509TrustManager x509TrustManager) {
        SSLContext N5pXJ15tlNKatG0sBkhrXfiY7co2blYTvm3kVKApSyrf0tWXKlKPrkuHPRi2aPYj45VAoMTWa6sKGS2ZcLrtOpdnNxkt95tZnbpxQYN1985ys62TvSqA = N5pXJ15tlNKatG0sBkhrXfiY7co2blYTvm3kVKApSyrf0tWXKlKPrkuHPRi2aPYj45VAoMTWa6sKGS2ZcLrtOpdnNxkt95tZnbpxQYN1985ys62TvSqA();
        N5pXJ15tlNKatG0sBkhrXfiY7co2blYTvm3kVKApSyrf0tWXKlKPrkuHPRi2aPYj45VAoMTWa6sKGS2ZcLrtOpdnNxkt95tZnbpxQYN1985ys62TvSqA.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
        SSLSocketFactory socketFactory = N5pXJ15tlNKatG0sBkhrXfiY7co2blYTvm3kVKApSyrf0tWXKlKPrkuHPRi2aPYj45VAoMTWa6sKGS2ZcLrtOpdnNxkt95tZnbpxQYN1985ys62TvSqA.getSocketFactory();
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }
}
