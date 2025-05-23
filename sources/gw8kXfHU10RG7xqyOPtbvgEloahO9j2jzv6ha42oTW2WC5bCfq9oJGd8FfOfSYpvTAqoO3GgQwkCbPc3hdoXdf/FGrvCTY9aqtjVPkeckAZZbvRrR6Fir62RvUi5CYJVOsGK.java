package gw8kXfHU10RG7xqyOPtbvgEloahO9j2jzv6ha42oTW2WC5bCfq9oJGd8FfOfSYpvTAqoO3GgQwkCbPc3hdoXdf;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import k7E5adRDhz5TrQ52amP8wLo7HDbhrH2l5KpaWndX6GGTgMTxgSQneaXCWa2mPoOSZJ040aUJCrzVnziwwkci4knTDk5UrFr7180K7Lrs6FIFy7B.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr;
import wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5;

public abstract class FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK implements aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX {
    public static final AtomicLongFieldUpdater ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96;
    public final AtomicReferenceArray GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT;
    public final int Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
    private volatile long top;
    public final int[] uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8;
    public final int xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;

    static {
        AtomicLongFieldUpdater<U> newUpdater = AtomicLongFieldUpdater.newUpdater(FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK.class, "top");
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(newUpdater, "newUpdater(Owner::class.java, p.name)");
        ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96 = newUpdater;
    }

    public FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(i, "capacity should be positive but it is ").toString());
        } else if (i <= 536870911) {
            int highestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
            this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = highestOneBit;
            this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            int i2 = highestOneBit + 1;
            this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT = new AtomicReferenceArray(i2);
            this.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8 = new int[i2];
        } else {
            throw new IllegalArgumentException(wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(i, "capacity should be less or equal to 536870911 but it is ").toString());
        }
    }

    public final void BrinjKkMNX0Ww9FldCotLl2(Object obj) {
        long j;
        long j2;
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(obj, "instance");
        Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X(obj);
        int identityHashCode = ((System.identityHashCode(obj) * -1640531527) >>> this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw) + 1;
        int i = 0;
        while (i < 8) {
            AtomicReferenceArray atomicReferenceArray = this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT;
            while (!atomicReferenceArray.compareAndSet(identityHashCode, (Object) null, obj)) {
                if (atomicReferenceArray.get(identityHashCode) != null) {
                    identityHashCode--;
                    if (identityHashCode == 0) {
                        identityHashCode = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
                    }
                    i++;
                }
            }
            if (identityHashCode > 0) {
                do {
                    j = this.top;
                    j2 = ((((j >> 32) & 4294967295L) + 1) << 32) | ((long) identityHashCode);
                    this.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8[identityHashCode] = (int) (4294967295L & j);
                } while (!ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96.compareAndSet(this, j, j2));
                return;
            }
            throw new IllegalArgumentException("index should be positive");
        }
        DrqQ8C7rtVRDTSclHGsDImq(obj);
    }

    public void DrqQ8C7rtVRDTSclHGsDImq(Object obj) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(obj, "instance");
    }

    public void Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X(Object obj) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(obj, "instance");
    }

    public Object P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(Object obj) {
        return obj;
    }

    public final Object Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw() {
        Object peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6 = peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6();
        return peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6 != null ? P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6) : uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn();
    }

    public final void YmFIHVAy6MFnHbke10dLWI57IXCp() {
        while (true) {
            Object peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6 = peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6();
            if (peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6 != null) {
                DrqQ8C7rtVRDTSclHGsDImq(peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6);
            } else {
                return;
            }
        }
    }

    public final void close() {
        YmFIHVAy6MFnHbke10dLWI57IXCp();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6() {
        /*
            r10 = this;
        L_0x0000:
            long r2 = r10.top
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L_0x000a
            goto L_0x002d
        L_0x000a:
            r0 = 32
            long r4 = r2 >> r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            r8 = 1
            long r4 = r4 + r8
            long r6 = r6 & r2
            int r6 = (int) r6
            if (r6 != 0) goto L_0x001c
            goto L_0x002d
        L_0x001c:
            int[] r1 = r10.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8
            r1 = r1[r6]
            long r4 = r4 << r0
            long r0 = (long) r1
            long r4 = r4 | r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96
            r1 = r10
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            r1 = r6
        L_0x002d:
            r0 = 0
            if (r1 != 0) goto L_0x0031
            goto L_0x0037
        L_0x0031:
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r10.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT
            java.lang.Object r0 = r2.getAndSet(r1, r0)
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gw8kXfHU10RG7xqyOPtbvgEloahO9j2jzv6ha42oTW2WC5bCfq9oJGd8FfOfSYpvTAqoO3GgQwkCbPc3hdoXdf.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK.peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6():java.lang.Object");
    }

    public abstract Object uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn();
}
