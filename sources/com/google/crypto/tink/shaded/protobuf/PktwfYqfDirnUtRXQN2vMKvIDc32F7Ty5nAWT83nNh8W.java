package com.google.crypto.tink.shaded.protobuf;

public final class PktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W {
    public final Object[] DrqQ8C7rtVRDTSclHGsDImq;
    public final wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
    public final int VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU;
    public final String YmFIHVAy6MFnHbke10dLWI57IXCp;

    public PktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W(wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr, String str, Object[] objArr) {
        this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr;
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

    public final wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d() {
        return this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
    }

    public final int VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU() {
        return (this.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU & 1) == 1 ? 1 : 2;
    }

    public final Object[] YmFIHVAy6MFnHbke10dLWI57IXCp() {
        return this.DrqQ8C7rtVRDTSclHGsDImq;
    }
}
