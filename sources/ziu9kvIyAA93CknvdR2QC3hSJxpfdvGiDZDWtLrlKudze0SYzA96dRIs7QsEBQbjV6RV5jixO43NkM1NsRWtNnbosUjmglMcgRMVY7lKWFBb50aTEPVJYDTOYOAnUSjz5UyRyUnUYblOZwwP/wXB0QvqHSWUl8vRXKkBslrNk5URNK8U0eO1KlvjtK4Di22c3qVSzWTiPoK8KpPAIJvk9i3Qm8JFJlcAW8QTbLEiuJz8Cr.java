package ziu9kvIyAA93CknvdR2QC3hSJxpfdvGiDZDWtLrlKudze0SYzA96dRIs7QsEBQbjV6RV5jixO43NkM1NsRWtNnbosUjmglMcgRMVY7lKWFBb50aTEPVJYDTOYOAnUSjz5UyRyUnUYblOZwwP;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr extends Thread {
    public final CountDownLatch GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT = new CountDownLatch(1);
    public final long Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
    public boolean uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8 = false;
    public final WeakReference xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;

    public wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr(AdvertisingIdClient advertisingIdClient, long j) {
        this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = new WeakReference(advertisingIdClient);
        this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw = j;
        start();
    }

    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        WeakReference weakReference = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
        try {
            if (!this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT.await(this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw, TimeUnit.MILLISECONDS) && (advertisingIdClient = (AdvertisingIdClient) weakReference.get()) != null) {
                advertisingIdClient.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d();
                this.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8 = true;
            }
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = (AdvertisingIdClient) weakReference.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d();
                this.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8 = true;
            }
        }
    }
}
