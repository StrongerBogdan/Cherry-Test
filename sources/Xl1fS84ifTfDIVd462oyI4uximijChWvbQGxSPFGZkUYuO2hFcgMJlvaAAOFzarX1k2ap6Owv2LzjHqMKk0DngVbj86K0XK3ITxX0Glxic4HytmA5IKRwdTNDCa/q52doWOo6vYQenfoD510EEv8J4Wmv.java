package Xl1fS84ifTfDIVd462oyI4uximijChWvbQGxSPFGZkUYuO2hFcgMJlvaAAOFzarX1k2ap6Owv2LzjHqMKk0DngVbj86K0XK3ITxX0Glxic4HytmA5IKRwdTNDCa;

import wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5;

public abstract class q52doWOo6vYQenfoD510EEv8J4Wmv {
    public static final long[] P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = {-9187201950435737345L, -1};

    static {
        new hcbD5JnYtZWRUplQnAKSB4K6rMgILsdqTepvJUiT5QvBVnKVg8pMGRAkHHhIH7CCrpe8RdZ04tGKL9Ow2M6iiLPGOgY9QUurTIjfxWKZ(0);
    }

    public static final int DrqQ8C7rtVRDTSclHGsDImq(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static final int H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(int i) {
        if (i == 7) {
            return 8;
        }
        return ((i - 1) / 7) + i;
    }

    public static final void P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(long[] jArr, int i) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(jArr, "metadata");
        int i2 = (i + 7) >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = jArr[i3] & -9187201950435737472L;
            jArr[i3] = -72340172838076674L & ((~j) + (j >>> 7));
        }
        int length = jArr.length;
        int i4 = length - 1;
        int i5 = length - 2;
        jArr[i5] = (jArr[i5] & 72057594037927935L) | -72057594037927936L;
        jArr[i4] = jArr[0];
    }

    public static final int VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    public static final int YmFIHVAy6MFnHbke10dLWI57IXCp(long[] jArr, int i, int i2) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(jArr, "metadata");
        while (i < i2) {
            if (((jArr[i >> 3] >> ((i & 7) << 3)) & 255) == 128) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final int oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(int i) {
        if (i > 0) {
            return -1 >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }
}
