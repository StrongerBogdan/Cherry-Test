package agrx6RbQ7UbWlG4ydYBlQd6g4yDau1jj6wVyChQt4abLW6dFBChabWPDls;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import k7E5adRDhz5TrQ52amP8wLo7HDbhrH2l5KpaWndX6GGTgMTxgSQneaXCWa2mPoOSZJ040aUJCrzVnziwwkci4knTDk5UrFr7180K7Lrs6FIFy7B.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr;
import zvzEC4oNm6t3liZP8fC4qPb9gqc7lJhwhU9nJzhKwOjyeo4qI9LNmyHY324wgRjxwdJTYUqlckfN8FFTfqGRI6GD6sbHdgGPt4JdmVbB.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK;

public abstract class LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5 {
    public static final CopyOnWriteArrayList P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = new CopyOnWriteArrayList();

    public static FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(String str) {
        boolean startsWith;
        Iterator it = P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d.iterator();
        while (it.hasNext()) {
            FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK = (FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK) it.next();
            synchronized (fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK) {
                startsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (startsWith) {
                return fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK;
            }
        }
        throw new GeneralSecurityException(wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ("No KMS client does support: ", str));
    }
}
