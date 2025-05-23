package com.google.android.gms.internal.measurement;

public final class nlsQe0ha6QupapP09jJcetEtxl8PGPsY1T9aDMu60OuXxmcHmsm1Mdnb6ZY4u4v {
    public final Object[] DrqQ8C7rtVRDTSclHGsDImq;
    public final likXH5AJs5Yu4CVczjJ6Zk9AciZbA1HhtzTPQnUcfnytRdzAEHtrVYwzBHV4FTQZHlm4bmFQDi0ogk0Sgj7JgKKV1WooqkcupeauMPK3rPM2YN7JcJhw12tsC8BBGZZEdYLER5E8nVf P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
    public final int VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU;
    public final String YmFIHVAy6MFnHbke10dLWI57IXCp;

    public nlsQe0ha6QupapP09jJcetEtxl8PGPsY1T9aDMu60OuXxmcHmsm1Mdnb6ZY4u4v(likXH5AJs5Yu4CVczjJ6Zk9AciZbA1HhtzTPQnUcfnytRdzAEHtrVYwzBHV4FTQZHlm4bmFQDi0ogk0Sgj7JgKKV1WooqkcupeauMPK3rPM2YN7JcJhw12tsC8BBGZZEdYLER5E8nVf likxh5ajs5yu4cvczjj6zk9acizba1hhtztpqnucfnytrdzaehtrvywzbhv4ftqzhlm4bmfqdi0ogk0sgj7jgkkv1wooqkcupeaumpk3rpm2yn7jcjhw12tsc8bbgzzedyler5e8nvf, String str, Object[] objArr) {
        this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = likxh5ajs5yu4cvczjj6zk9acizba1hhtztpqnucfnytrdzaehtrvywzbhv4ftqzhlm4bmfqdi0ogk0sgj7jgkkv1wooqkcupeaumpk3rpm2yn7jcjhw12tsc8bbgzzedyler5e8nvf;
        this.YmFIHVAy6MFnHbke10dLWI57IXCp = str;
        this.DrqQ8C7rtVRDTSclHGsDImq = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 1;
        int i2 = 13;
        while (true) {
            int i3 = i + 1;
            char charAt2 = str.charAt(i);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i2;
                i2 += 13;
                i = i3;
            } else {
                this.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU = c | (charAt2 << i2);
                return;
            }
        }
    }

    public final String DrqQ8C7rtVRDTSclHGsDImq() {
        return this.YmFIHVAy6MFnHbke10dLWI57IXCp;
    }

    public final likXH5AJs5Yu4CVczjJ6Zk9AciZbA1HhtzTPQnUcfnytRdzAEHtrVYwzBHV4FTQZHlm4bmFQDi0ogk0Sgj7JgKKV1WooqkcupeauMPK3rPM2YN7JcJhw12tsC8BBGZZEdYLER5E8nVf P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d() {
        return this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
    }

    public final Object[] VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU() {
        return this.DrqQ8C7rtVRDTSclHGsDImq;
    }

    public final int YmFIHVAy6MFnHbke10dLWI57IXCp() {
        int i = this.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
