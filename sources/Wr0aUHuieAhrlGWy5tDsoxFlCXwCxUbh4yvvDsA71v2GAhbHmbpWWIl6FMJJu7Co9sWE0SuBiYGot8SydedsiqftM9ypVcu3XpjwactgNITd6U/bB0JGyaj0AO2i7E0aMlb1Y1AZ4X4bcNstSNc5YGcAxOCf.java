package Wr0aUHuieAhrlGWy5tDsoxFlCXwCxUbh4yvvDsA71v2GAhbHmbpWWIl6FMJJu7Co9sWE0SuBiYGot8SydedsiqftM9ypVcu3XpjwactgNITd6U;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

public final class bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf implements LineHeightSpan {
    public int BrinjKkMNX0Ww9FldCotLl2;
    public final boolean DrqQ8C7rtVRDTSclHGsDImq;
    public int Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X = Integer.MIN_VALUE;
    public int H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ = Integer.MIN_VALUE;
    public int N5pXJ15tlNKatG0sBkhrXfiY7co2blYTvm3kVKApSyrf0tWXKlKPrkuHPRi2aPYj45VAoMTWa6sKGS2ZcLrtOpdnNxkt95tZnbpxQYN1985ys62TvSqA;
    public final float P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
    public final boolean VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU;
    public final int YmFIHVAy6MFnHbke10dLWI57IXCp;
    public final float oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU;
    public int peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6 = Integer.MIN_VALUE;
    public int uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn = Integer.MIN_VALUE;

    public bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf(float f, int i, boolean z, boolean z2, float f2) {
        this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = f;
        this.YmFIHVAy6MFnHbke10dLWI57IXCp = i;
        this.DrqQ8C7rtVRDTSclHGsDImq = z;
        this.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU = z2;
        this.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU = f2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 > 0) {
            boolean z = false;
            boolean z2 = i == 0;
            if (i2 == this.YmFIHVAy6MFnHbke10dLWI57IXCp) {
                z = true;
            }
            boolean z3 = this.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU;
            boolean z4 = this.DrqQ8C7rtVRDTSclHGsDImq;
            if (!z2 || !z || !z4 || !z3) {
                if (this.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ == Integer.MIN_VALUE) {
                    int i7 = i5 - i6;
                    int ceil = (int) ((float) Math.ceil((double) this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d));
                    int i8 = ceil - i7;
                    float f = this.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU;
                    if (f == -1.0f) {
                        f = Math.abs((float) fontMetricsInt.ascent) / ((float) (fontMetricsInt.descent - fontMetricsInt.ascent));
                    }
                    int ceil2 = (int) ((float) (i8 <= 0 ? Math.ceil((double) (((float) i8) * f)) : Math.ceil((double) ((1.0f - f) * ((float) i8)))));
                    int i9 = fontMetricsInt.descent;
                    int i10 = ceil2 + i9;
                    this.peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6 = i10;
                    int i11 = i10 - ceil;
                    this.uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn = i11;
                    if (z4) {
                        i11 = fontMetricsInt.ascent;
                    }
                    this.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ = i11;
                    if (z3) {
                        i10 = i9;
                    }
                    this.Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X = i10;
                    this.BrinjKkMNX0Ww9FldCotLl2 = fontMetricsInt.ascent - i11;
                    this.N5pXJ15tlNKatG0sBkhrXfiY7co2blYTvm3kVKApSyrf0tWXKlKPrkuHPRi2aPYj45VAoMTWa6sKGS2ZcLrtOpdnNxkt95tZnbpxQYN1985ys62TvSqA = i10 - i9;
                }
                fontMetricsInt.ascent = z2 ? this.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ : this.uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn;
                fontMetricsInt.descent = z ? this.Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X : this.peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6;
            }
        }
    }
}
