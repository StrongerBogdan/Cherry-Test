package com.google.crypto.tink.shaded.protobuf;

import JLvzIuqEX93tapBtpmMf2B3O0AWulp9nfDxsp3GouMjtODBL5o0cRn5LzOfYBvs53WsHUfa3ifRI1YSy78FMWBNo4uIUawX2H3YzGWtACXYbjj.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr;

public abstract class GqoZWU5wsH3nsAXt30e5vtv4Ko7DcHyUUMZBz3uaOmuhwcTYuIZVw5uxz3jQTIDmzZeXn3RBnCSNatAT8SSmspPq5WGkXz6RQVEpBMLr0P8FWfyqRruFFan6bgEXdU1S98fDCsk9Xd2 {
    public static final wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = ((!TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU || !TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU || FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d()) ? new Jkck4tyMRqw4KS7fdzysA1QM1p6LiMd0MqjnrUvt0vyGgPbAGpSxpXXz0re4C8rlzUQVDH89lnfN57ty9FRqj3P(0) : new Jkck4tyMRqw4KS7fdzysA1QM1p6LiMd0MqjnrUvt0vyGgPbAGpSxpXXz0re4C8rlzUQVDH89lnfN57ty9FRqj3P(1));

    public static int DrqQ8C7rtVRDTSclHGsDImq(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                b = -1;
            }
            return b;
        } else if (i3 == 1) {
            return DrqQ8C7rtVRDTSclHGsDImq(b, bArr[i]);
        } else {
            if (i3 == 2) {
                return VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(b, bArr[i], bArr[i + 1]);
            }
            throw new AssertionError();
        }
    }

    public static int VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static int YmFIHVAy6MFnHbke10dLWI57IXCp(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new Ok9jcYAy1dWKtbzfZaJufrEBY5Bu9fOF3Qsk76ZcfKpAilukWE21KNkYS93snaKr(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }

    public static boolean oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(byte[] bArr, int i, int i2) {
        return P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d.OKEFRhs6OXFJKyry5Z71CY76oDnwhW5FJg2OAPnj9ulD5LM4Kq5Bjc83bCfwXFNmMjv6yp6Ftre2cNRkaH0Q3xMOZ2hMufJD0zymR1CE8pqwQRzY(bArr, i, i2) == 0;
    }
}
