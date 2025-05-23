package io.ktor.utils.io.internal;

import Xl1fS84ifTfDIVd462oyI4uximijChWvbQGxSPFGZkUYuO2hFcgMJlvaAAOFzarX1k2ap6Owv2LzjHqMKk0DngVbj86K0XK3ITxX0Glxic4HytmA5IKRwdTNDCa.gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class QUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI {
    public static final /* synthetic */ AtomicIntegerFieldUpdater DrqQ8C7rtVRDTSclHGsDImq;
    public static final /* synthetic */ AtomicIntegerFieldUpdater VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU;
    public static final /* synthetic */ AtomicIntegerFieldUpdater YmFIHVAy6MFnHbke10dLWI57IXCp;
    public final int P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
    public volatile /* synthetic */ int _availableForRead$internal = 0;
    public volatile /* synthetic */ int _availableForWrite$internal;
    volatile /* synthetic */ int _pendingToFlush;

    static {
        Class<QUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI> cls = QUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI.class;
        YmFIHVAy6MFnHbke10dLWI57IXCp = AtomicIntegerFieldUpdater.newUpdater(cls, "_availableForRead$internal");
        DrqQ8C7rtVRDTSclHGsDImq = AtomicIntegerFieldUpdater.newUpdater(cls, "_availableForWrite$internal");
        VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU = AtomicIntegerFieldUpdater.newUpdater(cls, "_pendingToFlush");
    }

    public QUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI(int i) {
        this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = i;
        this._availableForWrite$internal = i;
        this._pendingToFlush = 0;
    }

    public final boolean DrqQ8C7rtVRDTSclHGsDImq() {
        int andSet = VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU.getAndSet(this, 0);
        return andSet == 0 ? this._availableForRead$internal > 0 : YmFIHVAy6MFnHbke10dLWI57IXCp.addAndGet(this, andSet) > 0;
    }

    public final void H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ() {
        this._availableForRead$internal = 0;
        this._pendingToFlush = 0;
        this._availableForWrite$internal = this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
    }

    public final void P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(int i) {
        int i2;
        int i3;
        do {
            i2 = this._availableForWrite$internal;
            i3 = i2 + i;
            if (i3 > this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d) {
                StringBuilder uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8 = gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8("Completed read overflow: ", i2, " + ", i, " = ");
                uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8.append(i3);
                uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8.append(" > ");
                uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8.append(this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d);
                throw new IllegalArgumentException(uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8.toString());
            }
        } while (!DrqQ8C7rtVRDTSclHGsDImq.compareAndSet(this, i2, i3));
    }

    public final boolean VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU() {
        return this._availableForWrite$internal == 0;
    }

    public final void YmFIHVAy6MFnHbke10dLWI57IXCp(int i) {
        int i2;
        int i3;
        do {
            i2 = this._pendingToFlush;
            i3 = i2 + i;
            if (i3 > this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d) {
                StringBuilder uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8 = gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8("Complete write overflow: ", i2, " + ", i, " > ");
                uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8.append(this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d);
                throw new IllegalArgumentException(uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8.toString());
            }
        } while (!VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU.compareAndSet(this, i2, i3));
    }

    public final void oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU() {
        this._availableForRead$internal = this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
        this._availableForWrite$internal = 0;
        this._pendingToFlush = 0;
    }

    public final int peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6(int i) {
        int i2;
        int min;
        do {
            i2 = this._availableForWrite$internal;
            min = Math.min(i, i2);
            if (min == 0) {
                return 0;
            }
        } while (!DrqQ8C7rtVRDTSclHGsDImq.compareAndSet(this, i2, i2 - min));
        return Math.min(i, i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RingBufferCapacity[read: ");
        sb.append(this._availableForRead$internal);
        sb.append(", write: ");
        sb.append(this._availableForWrite$internal);
        sb.append(", flush: ");
        sb.append(this._pendingToFlush);
        sb.append(", capacity: ");
        return gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9(sb, this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d, ']');
    }

    public final boolean uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn() {
        int i;
        do {
            i = this._availableForWrite$internal;
            if (this._pendingToFlush > 0 || this._availableForRead$internal > 0 || i != this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d) {
                return false;
            }
        } while (!DrqQ8C7rtVRDTSclHGsDImq.compareAndSet(this, i, 0));
        return true;
    }
}
