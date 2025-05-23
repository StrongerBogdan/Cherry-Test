package com.google.protobuf;

public abstract class QEEQ34VXSIVgchThLz7NhbnJbvkpjhaSon0FqCpWizq674rByCE01pPBy2TRg5TaVyaxtJISKE9fR6hPDx9oG1BnTU1CLwP0o81O73jl6 {
    public static final MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = ((!sSHt2cgWVlGG7tF8g0c8FxCFcKtdgbADgmBm2ZaqcXsor768RsNuVhty5CBrNY7LuWPAk9whPzd.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU || !sSHt2cgWVlGG7tF8g0c8FxCFcKtdgbADgmBm2ZaqcXsor768RsNuVhty5CBrNY7LuWPAk9whPzd.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU || FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d()) ? new sf5yYnATChb4N34uWnHFtrrBlbzF3JNTlnJmO8gEeD8vz8c3srHwAYU6gtDm3iEHGTlc5yonjWHvIcsCBi8BEHK8T6WxhBKFH7nRLcvWM8yBh3SDFg1wT4PCJ0KbzcqoL6b7Z8Asf2BvEVqa3O7QqjDDkl(0) : new sf5yYnATChb4N34uWnHFtrrBlbzF3JNTlnJmO8gEeD8vz8c3srHwAYU6gtDm3iEHGTlc5yonjWHvIcsCBi8BEHK8T6WxhBKFH7nRLcvWM8yBh3SDFg1wT4PCJ0KbzcqoL6b7Z8Asf2BvEVqa3O7QqjDDkl(1));

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
                                throw new rIfFRI0PHufK7vvLxcA4gWTZjXFSkcMNZWs9OsTC3h2VeXWkIOXdt20DVZNRgIJmMsg0JlURqCLfi7jcYeWqWIHZEPKZgD2FK8Rmh3IM60UTJfCJGL7MA8ZEDTq2xC72Dt(i2, length2);
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
        return P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d.Z6zkjisgtP978NC0DhZRz5ziFJjUpwIskJ7XiIo3WBRg27V3d7xuJ312iZtXVP8g9adhweHYGfBbqL1MltSMQUpYVtmgB4L58PyvqoEZwAIYrlLBAApPRNeNAAypcmetgiG(bArr, i, i2) == 0;
    }
}
