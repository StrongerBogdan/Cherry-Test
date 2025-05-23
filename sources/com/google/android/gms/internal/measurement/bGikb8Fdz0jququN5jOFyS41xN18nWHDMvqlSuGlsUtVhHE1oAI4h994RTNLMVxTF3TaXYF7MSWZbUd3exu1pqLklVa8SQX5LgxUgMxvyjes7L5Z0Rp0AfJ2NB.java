package com.google.android.gms.internal.measurement;

import u7WSURlE4UdW83Fpzp6QuhjxNinQRIdijMWqRq2SzYzZwLHMYceV3WdoH3Sxb54y3kpveUEWmbK3WyUaeaGQmc8HZT4kEZkfdoey9cENBRl54QRnr2FfxNrXW3n9zyKmVjJO0.z52efL9sITeN00fGc8wSktz9BdxeUUQmE8Ce7GjgjfLj078qt5pFI51nPKpJU8b9iO2bJ8fkUbFzxkX37kDVOuZdHTaA;

public abstract class bGikb8Fdz0jququN5jOFyS41xN18nWHDMvqlSuGlsUtVhHE1oAI4h994RTNLMVxTF3TaXYF7MSWZbUd3exu1pqLklVa8SQX5LgxUgMxvyjes7L5Z0Rp0AfJ2NBasiVzbqdqEfmH {
    public static final ZXX8fxfZckpBIXgmpNwD1FIj9qg1WoA7N0bGWyYPKZVVMbMNLw8yuR92TAlVRCcLFWODe2DA6mEWyFLfvn8gfhBBSp8BONAYEdrtCPiHoT0sJCRvSVTskqO4I P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = new Object();

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.google.android.gms.internal.measurement.ZXX8fxfZckpBIXgmpNwD1FIj9qg1WoA7N0bGWyYPKZVVMbMNLw8yuR92TAlVRCcLFWODe2DA6mEWyFLfvn8gfhBBSp8BONAYEdrtCPiHoT0sJCRvSVTskqO4I] */
    static {
        if (s95uYzJOQOQ2WQNAq0cuohfmgtqBjH1aDa3u9OLRyg8xHHZUFskHk9TzgnF.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU) {
            boolean z = s95uYzJOQOQ2WQNAq0cuohfmgtqBjH1aDa3u9OLRyg8xHHZUFskHk9TzgnF.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU;
        }
    }

    public static /* synthetic */ int DrqQ8C7rtVRDTSclHGsDImq(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == 1) {
                byte b2 = bArr[i];
                if (b > -12 || b2 > -65) {
                    return -1;
                }
                return (b2 << 8) ^ b;
            } else if (i3 == 2) {
                byte b3 = bArr[i];
                byte b4 = bArr[i + 1];
                if (b > -12 || b3 > -65 || b4 > -65) {
                    return -1;
                }
                return (b4 << 16) ^ ((b3 << 8) ^ b);
            } else {
                throw new AssertionError();
            }
        } else if (b > -12) {
            return -1;
        } else {
            return b;
        }
    }

    public static int P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(String str) {
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
                                throw new eLIHV5I8b7LN1LwEKYh06LgglXFD15Aj0YX8vWLJQ2krRLH9(i2, length2);
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
        throw new IllegalArgumentException(z52efL9sITeN00fGc8wSktz9BdxeUUQmE8Ce7GjgjfLj078qt5pFI51nPKpJU8b9iO2bJ8fkUbFzxkX37kDVOuZdHTaA.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU("UTF-8 length does not fit in int: ", ((long) i3) + 4294967296L));
    }

    public static boolean VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(byte[] bArr, int i, int i2) {
        P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d.getClass();
        return ZXX8fxfZckpBIXgmpNwD1FIj9qg1WoA7N0bGWyYPKZVVMbMNLw8yuR92TAlVRCcLFWODe2DA6mEWyFLfvn8gfhBBSp8BONAYEdrtCPiHoT0sJCRvSVTskqO4I.YmFIHVAy6MFnHbke10dLWI57IXCp(bArr, i, i2);
    }

    public static int YmFIHVAy6MFnHbke10dLWI57IXCp(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char charAt;
        P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d.getClass();
        int length = str.length();
        int i5 = i2 + i;
        int i6 = 0;
        while (i6 < length && (i4 = i6 + i) < i5 && (charAt = str.charAt(i6)) < 128) {
            bArr[i4] = (byte) charAt;
            i6++;
        }
        if (i6 == length) {
            return i + length;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char charAt2 = str.charAt(i6);
            if (charAt2 < 128 && i7 < i5) {
                bArr[i7] = (byte) charAt2;
                i7++;
            } else if (charAt2 < 2048 && i7 <= i5 - 2) {
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((charAt2 >>> 6) | 960);
                i7 += 2;
                bArr[i8] = (byte) ((charAt2 & '?') | 128);
            } else if ((charAt2 < 55296 || 57343 < charAt2) && i7 <= i5 - 3) {
                bArr[i7] = (byte) ((charAt2 >>> 12) | 480);
                int i9 = i7 + 2;
                bArr[i7 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i7 += 3;
                bArr[i9] = (byte) ((charAt2 & '?') | 128);
            } else if (i7 <= i5 - 4) {
                int i10 = i6 + 1;
                if (i10 != str.length()) {
                    char charAt3 = str.charAt(i10);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                        bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i11 = i7 + 3;
                        bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i7 += 4;
                        bArr[i11] = (byte) ((codePoint & 63) | 128);
                        i6 = i10;
                    } else {
                        i6 = i10;
                    }
                }
                throw new eLIHV5I8b7LN1LwEKYh06LgglXFD15Aj0YX8vWLJQ2krRLH9(i6 - 1, length);
            } else if (55296 > charAt2 || charAt2 > 57343 || ((i3 = i6 + 1) != str.length() && Character.isSurrogatePair(charAt2, str.charAt(i3)))) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i7);
            } else {
                throw new eLIHV5I8b7LN1LwEKYh06LgglXFD15Aj0YX8vWLJQ2krRLH9(i6, length);
            }
            i6++;
        }
        return i7;
    }
}
