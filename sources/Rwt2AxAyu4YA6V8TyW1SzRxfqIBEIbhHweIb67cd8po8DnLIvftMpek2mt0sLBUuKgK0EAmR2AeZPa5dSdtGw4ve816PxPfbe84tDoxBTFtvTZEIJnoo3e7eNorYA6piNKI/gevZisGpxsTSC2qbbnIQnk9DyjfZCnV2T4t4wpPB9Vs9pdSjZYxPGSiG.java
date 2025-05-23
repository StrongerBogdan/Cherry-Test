package Rwt2AxAyu4YA6V8TyW1SzRxfqIBEIbhHweIb67cd8po8DnLIvftMpek2mt0sLBUuKgK0EAmR2AeZPa5dSdtGw4ve816PxPfbe84tDoxBTFtvTZEIJnoo3e7eNorYA6piNKI;

import OVC4nRQWrbcRSebgXE5VyWcUfBfAzkVZpXwamqxvhJJ7n7ZWPrLdCijwrYedU8DvFGFCaoKl46d9FUId2m6JPZfax9ZfWbPV3CxqADQeCUCFfVyKxa2JOSbGAtmujXFZAZDXvHUr9bNQ3hRqzM4vtxgEqBZA.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG {
    private volatile AtomicReferenceArray<Object> array;

    public gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final void DrqQ8C7rtVRDTSclHGsDImq(int i, wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr);
            return;
        }
        int i2 = i + 1;
        int i3 = length * 2;
        if (i2 < i3) {
            i2 = i3;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr);
        this.array = atomicReferenceArray2;
    }

    public final int P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d() {
        return this.array.length();
    }

    public final Object YmFIHVAy6MFnHbke10dLWI57IXCp(int i) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }
}
