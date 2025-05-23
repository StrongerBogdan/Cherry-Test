package OVC4nRQWrbcRSebgXE5VyWcUfBfAzkVZpXwamqxvhJJ7n7ZWPrLdCijwrYedU8DvFGFCaoKl46d9FUId2m6JPZfax9ZfWbPV3CxqADQeCUCFfVyKxa2JOSbGAtmujXFZAZDXvHUr9bNQ3hRqzM4vtxgEqBZA;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh {
    public static final AtomicIntegerFieldUpdater DrqQ8C7rtVRDTSclHGsDImq;
    public static final AtomicIntegerFieldUpdater VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU;
    public static final AtomicReferenceFieldUpdater YmFIHVAy6MFnHbke10dLWI57IXCp;
    public static final AtomicIntegerFieldUpdater oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU;
    public final AtomicReferenceArray P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    static {
        Class<M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh> cls = M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh.class;
        YmFIHVAy6MFnHbke10dLWI57IXCp = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        DrqQ8C7rtVRDTSclHGsDImq = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    public final bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf DrqQ8C7rtVRDTSclHGsDImq(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
        bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf = (bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf) atomicReferenceArray.get(i2);
        if (bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf != null) {
            boolean z2 = true;
            if (bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d != 1) {
                z2 = false;
            }
            if (z2 == z) {
                while (!atomicReferenceArray.compareAndSet(i2, bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf, (Object) null)) {
                    if (atomicReferenceArray.get(i2) != bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf) {
                    }
                }
                if (z) {
                    oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU.decrementAndGet(this);
                }
                return bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf;
            }
        }
        return null;
    }

    public final bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = DrqQ8C7rtVRDTSclHGsDImq;
        if (atomicIntegerFieldUpdater.get(this) - VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU.get(this) == 127) {
            return bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf;
        }
        if (bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d == 1) {
            oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
            if (atomicReferenceArray.get(i) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i, bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    public final bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf YmFIHVAy6MFnHbke10dLWI57IXCp() {
        bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - DrqQ8C7rtVRDTSclHGsDImq.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf = (bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf) this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d.getAndSet(i2, (Object) null)) != null) {
                if (bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d == 1) {
                    oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU.decrementAndGet(this);
                }
                return bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf;
            }
        }
    }
}
