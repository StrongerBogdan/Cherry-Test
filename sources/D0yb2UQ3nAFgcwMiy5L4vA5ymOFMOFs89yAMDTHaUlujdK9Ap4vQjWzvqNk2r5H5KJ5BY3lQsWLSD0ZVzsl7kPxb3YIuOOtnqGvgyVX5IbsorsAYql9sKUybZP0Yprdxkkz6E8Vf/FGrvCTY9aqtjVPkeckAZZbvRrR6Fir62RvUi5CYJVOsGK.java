package D0yb2UQ3nAFgcwMiy5L4vA5ymOFMOFs89yAMDTHaUlujdK9Ap4vQjWzvqNk2r5H5KJ5BY3lQsWLSD0ZVzsl7kPxb3YIuOOtnqGvgyVX5IbsorsAYql9sKUybZP0Yprdxkkz6E8Vf;

import java.security.InvalidKeyException;
import java.util.Arrays;

public final class FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK extends pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1 {
    public final /* synthetic */ int DrqQ8C7rtVRDTSclHGsDImq;

    public FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK(byte[] bArr, int i, int i2) {
        this.DrqQ8C7rtVRDTSclHGsDImq = i2;
        if (bArr.length == 32) {
            this.YmFIHVAy6MFnHbke10dLWI57IXCp = wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.DrqQ8C7rtVRDTSclHGsDImq(bArr);
            this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public final int[] DrqQ8C7rtVRDTSclHGsDImq(int[] iArr, int i) {
        switch (this.DrqQ8C7rtVRDTSclHGsDImq) {
            case 0:
                if (iArr.length == 3) {
                    int[] iArr2 = new int[16];
                    int[] iArr3 = wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
                    System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
                    System.arraycopy((int[]) this.YmFIHVAy6MFnHbke10dLWI57IXCp, 0, iArr2, iArr3.length, 8);
                    iArr2[12] = i;
                    System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                    return iArr2;
                }
                throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)}));
            default:
                if (iArr.length == 6) {
                    int[] iArr4 = new int[16];
                    int[] iArr5 = new int[16];
                    int[] iArr6 = wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
                    System.arraycopy(iArr6, 0, iArr5, 0, iArr6.length);
                    System.arraycopy((int[]) this.YmFIHVAy6MFnHbke10dLWI57IXCp, 0, iArr5, iArr6.length, 8);
                    iArr5[12] = iArr[0];
                    iArr5[13] = iArr[1];
                    iArr5[14] = iArr[2];
                    iArr5[15] = iArr[3];
                    wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.YmFIHVAy6MFnHbke10dLWI57IXCp(iArr5);
                    iArr5[4] = iArr5[12];
                    iArr5[5] = iArr5[13];
                    iArr5[6] = iArr5[14];
                    iArr5[7] = iArr5[15];
                    int[] copyOf = Arrays.copyOf(iArr5, 8);
                    System.arraycopy(iArr6, 0, iArr4, 0, iArr6.length);
                    System.arraycopy(copyOf, 0, iArr4, iArr6.length, 8);
                    iArr4[12] = i;
                    iArr4[13] = 0;
                    iArr4[14] = iArr[4];
                    iArr4[15] = iArr[5];
                    return iArr4;
                }
                throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)}));
        }
    }

    public final int Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X() {
        switch (this.DrqQ8C7rtVRDTSclHGsDImq) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}
