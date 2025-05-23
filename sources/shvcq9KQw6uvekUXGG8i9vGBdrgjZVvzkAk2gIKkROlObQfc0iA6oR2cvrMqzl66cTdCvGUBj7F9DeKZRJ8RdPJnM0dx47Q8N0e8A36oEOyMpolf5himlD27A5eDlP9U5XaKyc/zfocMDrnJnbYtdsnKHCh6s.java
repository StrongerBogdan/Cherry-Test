package shvcq9KQw6uvekUXGG8i9vGBdrgjZVvzkAk2gIKkROlObQfc0iA6oR2cvrMqzl66cTdCvGUBj7F9DeKZRJ8RdPJnM0dx47Q8N0e8A36oEOyMpolf5himlD27A5eDlP9U5XaKyc;

import BE8JVrulQ7ijGztmAfDOtVT5YsrSogoWMTVkIaE0OkQ8wAF1jp6ASCcLAIcyXFwkObQduU4gkPUUXsxo99jIVxO0ZQMDqodZWUexvtAepDoWsMH3AfX91fDYPrZVDGYzU7jFKF3n1KKXCyuE.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr;
import ZXTIyj9SnLgWiARGZpKm0VzSM5AgT2DbV0Sp1jQhaeU1NRvdO82QN0pNkKj3oK9m10KkmTVGNGXrZgh5KIxnPHdFbe0N4Qk9B6HbuwHGL2AdXnjkYoO9E4fLv5WR6nNdYv8AzS5JYKjL6Y.aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import java.text.Bidi;
import kE0gUlH6W572hMMoIXmsr4o1WjGKn83OhpSpvsC7Y4oprTiqSKfBx6022PxEYPitQf6C0ZNrMuSNkCmjQJDPmROYAKRnvVOFii58vQT02Cpg6GoUhC0UufPEK.QUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI;

public abstract class zfocMDrnJnbYtdsnKHCh6s {
    public static final gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = new Object();

    public static final int DrqQ8C7rtVRDTSclHGsDImq(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        return (lineStart == i || layout.getLineEnd(lineForOffset) == i) ? lineStart == i ? z ? lineForOffset - 1 : lineForOffset : z ? lineForOffset : lineForOffset + 1 : lineForOffset;
    }

    public static final Rect P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        TextPaint textPaint2 = textPaint;
        CharSequence charSequence2 = charSequence;
        int i3 = i;
        int i4 = i2;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            Class<MetricAffectingSpan> cls = MetricAffectingSpan.class;
            if (spanned.nextSpanTransition(i3 - 1, i4, cls) != i4) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint3 = new TextPaint();
                while (i3 < i4) {
                    int nextSpanTransition = spanned.nextSpanTransition(i3, i4, cls);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, nextSpanTransition, cls);
                    textPaint3.set(textPaint2);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint3);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        HYy5buoEq9cltioL1Vju6g9fMXNHB2tQviUIdVgejnJXgtomQ4T0yTntgQwY1LlZPMN009diJgWUqwqWYFfpoGhWkMAB1vA.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(textPaint3, charSequence2, i3, nextSpanTransition, rect2);
                    } else {
                        textPaint3.getTextBounds(charSequence.toString(), i3, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            HYy5buoEq9cltioL1Vju6g9fMXNHB2tQviUIdVgejnJXgtomQ4T0yTntgQwY1LlZPMN009diJgWUqwqWYFfpoGhWkMAB1vA.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(textPaint2, charSequence2, i3, i4, rect3);
        } else {
            textPaint2.getTextBounds(charSequence.toString(), i3, i4, rect3);
        }
        return rect3;
    }

    public static final int VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(z52efL9sITeN00fGc8wSktz9BdxeUUQmE8Ce7GjgjfLj078qt5pFI51nPKpJU8b9iO2bJ8fkUbFzxkX37kDVOuZdHTaA z52efl9siten00fgc8wsktz9bdxeuuqme8ce7gjgjflj078qt5pfi51npkpju8b9io2bj8fkubfzxkx37kdvouzdhtaa, Layout layout, QUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI qUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI, int i, RectF rectF, aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux, wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr, boolean z) {
        nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC[] nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcocArr;
        int i2;
        nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC[] nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcocArr2;
        int i3;
        int i4;
        int oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU;
        int i5;
        int VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU;
        Bidi createLineBidi;
        boolean z2;
        float f;
        float f2;
        z52efL9sITeN00fGc8wSktz9BdxeUUQmE8Ce7GjgjfLj078qt5pFI51nPKpJU8b9iO2bJ8fkUbFzxkX37kDVOuZdHTaA z52efl9siten00fgc8wsktz9bdxeuuqme8ce7gjgjflj078qt5pfi51npkpju8b9io2bj8fkubfzxkx37kdvouzdhtaa2 = z52efl9siten00fgc8wsktz9bdxeuuqme8ce7gjgjflj078qt5pfi51npkpju8b9io2bj8fkubfzxkx37kdvouzdhtaa;
        Layout layout2 = layout;
        QUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI qUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI2 = qUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI;
        int i6 = i;
        RectF rectF2 = rectF;
        aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux2 = aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux;
        wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr2 = wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr;
        int lineTop = layout2.getLineTop(i6);
        int lineBottom = layout2.getLineBottom(i6);
        int lineStart = layout2.getLineStart(i6);
        int lineEnd = layout2.getLineEnd(i6);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i7 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i7];
        Layout layout3 = z52efl9siten00fgc8wsktz9bdxeuuqme8ce7gjgjflj078qt5pfi51npkpju8b9io2bj8fkubfzxkx37kdvouzdhtaa2.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ;
        int lineStart2 = layout3.getLineStart(i6);
        int H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ = z52efl9siten00fgc8wsktz9bdxeuuqme8ce7gjgjflj078qt5pfi51npkpju8b9io2bj8fkubfzxkx37kdvouzdhtaa2.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(i6);
        if (i7 >= (H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ - lineStart2) * 2) {
            M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh m3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh = new M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh(z52efl9siten00fgc8wsktz9bdxeuuqme8ce7gjgjflj078qt5pfi51npkpju8b9io2bj8fkubfzxkx37kdvouzdhtaa2);
            boolean z3 = false;
            boolean z4 = layout3.getParagraphDirection(i6) == 1;
            int i8 = 0;
            while (lineStart2 < H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ) {
                boolean isRtlCharAt = layout3.isRtlCharAt(lineStart2);
                if (z4 && !isRtlCharAt) {
                    f = m3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(lineStart2, z3, z3, true);
                    f2 = m3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(lineStart2 + 1, true, true, true);
                    z2 = z4;
                } else if (!z4 || !isRtlCharAt) {
                    z2 = z4;
                    if (isRtlCharAt) {
                        float P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d2 = m3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(lineStart2, false, false, true);
                        f = m3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(lineStart2 + 1, true, true, true);
                        f2 = P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d2;
                    } else {
                        f = m3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(lineStart2, false, false, false);
                        f2 = m3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(lineStart2 + 1, true, true, false);
                    }
                } else {
                    z2 = z4;
                    f2 = m3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(lineStart2, false, false, false);
                    f = m3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(lineStart2 + 1, true, true, false);
                }
                fArr[i8] = f;
                fArr[i8 + 1] = f2;
                i8 += 2;
                lineStart2++;
                z4 = z2;
                z3 = false;
            }
            Layout layout4 = (Layout) qUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI2.YmFIHVAy6MFnHbke10dLWI57IXCp;
            int lineStart3 = layout4.getLineStart(i6);
            int lineEnd2 = layout4.getLineEnd(i6);
            int BrinjKkMNX0Ww9FldCotLl2 = qUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI2.BrinjKkMNX0Ww9FldCotLl2(lineStart3, false);
            int N5pXJ15tlNKatG0sBkhrXfiY7co2blYTvm3kVKApSyrf0tWXKlKPrkuHPRi2aPYj45VAoMTWa6sKGS2ZcLrtOpdnNxkt95tZnbpxQYN1985ys62TvSqA = qUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI2.N5pXJ15tlNKatG0sBkhrXfiY7co2blYTvm3kVKApSyrf0tWXKlKPrkuHPRi2aPYj45VAoMTWa6sKGS2ZcLrtOpdnNxkt95tZnbpxQYN1985ys62TvSqA(BrinjKkMNX0Ww9FldCotLl2);
            int i9 = lineStart3 - N5pXJ15tlNKatG0sBkhrXfiY7co2blYTvm3kVKApSyrf0tWXKlKPrkuHPRi2aPYj45VAoMTWa6sKGS2ZcLrtOpdnNxkt95tZnbpxQYN1985ys62TvSqA;
            int i10 = lineEnd2 - N5pXJ15tlNKatG0sBkhrXfiY7co2blYTvm3kVKApSyrf0tWXKlKPrkuHPRi2aPYj45VAoMTWa6sKGS2ZcLrtOpdnNxkt95tZnbpxQYN1985ys62TvSqA;
            Bidi VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU2 = qUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI2.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(BrinjKkMNX0Ww9FldCotLl2);
            if (VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU2 == null || (createLineBidi = VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU2.createLineBidi(i9, i10)) == null) {
                nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcocArr = new nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC[]{new nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC(lineStart3, lineEnd2, layout4.isRtlCharAt(lineStart3))};
            } else {
                int runCount = createLineBidi.getRunCount();
                nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcocArr = new nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC[runCount];
                int i11 = 0;
                while (i11 < runCount) {
                    int i12 = runCount;
                    nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcocArr[i11] = new nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC(createLineBidi.getRunStart(i11) + lineStart3, createLineBidi.getRunLimit(i11) + lineStart3, createLineBidi.getRunLevel(i11) % 2 == 1);
                    i11++;
                    runCount = i12;
                }
            }
            aFrVtgGN8Wsc8fF7UODmjZfcTnIgJZCklRVrwrNwNInAifLkkLKX9ZXIEvddJ55Rvbm2id5N2fPH3xe0JvC7GqhFQ5usiOMJUU0mCAC3yBJpKdTwKUDCE5wtqxWHt28TJeoPwcO7.aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux3 = z ? new aFrVtgGN8Wsc8fF7UODmjZfcTnIgJZCklRVrwrNwNInAifLkkLKX9ZXIEvddJ55Rvbm2id5N2fPH3xe0JvC7GqhFQ5usiOMJUU0mCAC3yBJpKdTwKUDCE5wtqxWHt28TJeoPwcO7.aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX(0, nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcocArr.length - 1, 1) : new aFrVtgGN8Wsc8fF7UODmjZfcTnIgJZCklRVrwrNwNInAifLkkLKX9ZXIEvddJ55Rvbm2id5N2fPH3xe0JvC7GqhFQ5usiOMJUU0mCAC3yBJpKdTwKUDCE5wtqxWHt28TJeoPwcO7.aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX(nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcocArr.length - 1, 0, -1);
            int i13 = aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux3.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
            int i14 = aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux3.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
            int i15 = aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux3.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT;
            if ((i15 <= 0 || i13 > i14) && (i15 >= 0 || i14 > i13)) {
                return -1;
            }
            while (true) {
                nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcoc = nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcocArr[i13];
                boolean z5 = nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcoc.DrqQ8C7rtVRDTSclHGsDImq;
                int i16 = nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcoc.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
                int i17 = nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcoc.YmFIHVAy6MFnHbke10dLWI57IXCp;
                float f3 = z5 ? fArr[((i17 - 1) - lineStart) * 2] : fArr[(i16 - lineStart) * 2];
                float YmFIHVAy6MFnHbke10dLWI57IXCp = z5 ? YmFIHVAy6MFnHbke10dLWI57IXCp(i16, lineStart, fArr) : YmFIHVAy6MFnHbke10dLWI57IXCp(i17 - 1, lineStart, fArr);
                boolean z6 = nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcoc.DrqQ8C7rtVRDTSclHGsDImq;
                if (z) {
                    float f4 = rectF2.left;
                    if (YmFIHVAy6MFnHbke10dLWI57IXCp >= f4) {
                        nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcocArr2 = nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcocArr;
                        float f5 = rectF2.right;
                        if (f3 <= f5) {
                            if ((z6 || f4 > f3) && (!z6 || f5 < YmFIHVAy6MFnHbke10dLWI57IXCp)) {
                                int i18 = i16;
                                i5 = i17;
                                while (true) {
                                    i2 = i15;
                                    if (i5 - i18 <= 1) {
                                        break;
                                    }
                                    int i19 = (i5 + i18) / 2;
                                    float f6 = fArr[(i19 - lineStart) * 2];
                                    int i20 = i19;
                                    if ((z6 || f6 <= rectF2.left) && (!z6 || f6 >= rectF2.right)) {
                                        i18 = i20;
                                    } else {
                                        i5 = i20;
                                    }
                                    i15 = i2;
                                }
                                if (!z6) {
                                    i5 = i18;
                                }
                            } else {
                                i2 = i15;
                                i5 = i16;
                            }
                            int oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU2 = aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux2.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(i5);
                            if (oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU2 != -1 && (VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU = aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux2.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU2)) < i17) {
                                if (VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU >= i16) {
                                    i16 = VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU;
                                }
                                if (oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU2 > i17) {
                                    oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU2 = i17;
                                }
                                RectF rectF3 = new RectF(0.0f, (float) lineTop, 0.0f, (float) lineBottom);
                                int i21 = oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU2;
                                while (true) {
                                    rectF3.left = z6 ? fArr[((i21 - 1) - lineStart) * 2] : fArr[(i16 - lineStart) * 2];
                                    rectF3.right = z6 ? YmFIHVAy6MFnHbke10dLWI57IXCp(i16, lineStart, fArr) : YmFIHVAy6MFnHbke10dLWI57IXCp(i21 - 1, lineStart, fArr);
                                    if (((Boolean) wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr2.BrinjKkMNX0Ww9FldCotLl2(rectF3, rectF2)).booleanValue()) {
                                        break;
                                    }
                                    i16 = aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux2.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(i16);
                                    if (i16 == -1 || i16 >= i17) {
                                        break;
                                    }
                                    i21 = aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux2.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(i16);
                                    if (i21 > i17) {
                                        i21 = i17;
                                    }
                                }
                            }
                        } else {
                            i2 = i15;
                        }
                    } else {
                        i2 = i15;
                        nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcocArr2 = nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcocArr;
                    }
                    i16 = -1;
                } else {
                    i2 = i15;
                    nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcocArr2 = nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcocArr;
                    float f7 = rectF2.left;
                    if (YmFIHVAy6MFnHbke10dLWI57IXCp >= f7) {
                        float f8 = rectF2.right;
                        if (f3 <= f8) {
                            if ((z6 || f8 < YmFIHVAy6MFnHbke10dLWI57IXCp) && (!z6 || f7 > f3)) {
                                int i22 = i16;
                                int i23 = i17;
                                while (i23 - i22 > 1) {
                                    int i24 = (i23 + i22) / 2;
                                    float f9 = fArr[(i24 - lineStart) * 2];
                                    int i25 = i23;
                                    if ((z6 || f9 <= rectF2.right) && (!z6 || f9 >= rectF2.left)) {
                                        i23 = i25;
                                        i22 = i24;
                                    } else {
                                        i23 = i24;
                                    }
                                }
                                i4 = z6 ? i23 : i22;
                            } else {
                                i4 = i17 - 1;
                            }
                            int VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU3 = aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux2.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(i4 + 1);
                            if (VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU3 != -1 && (oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU = aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux2.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU3)) > i16) {
                                if (VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU3 < i16) {
                                    VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU3 = i16;
                                }
                                if (oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU <= i17) {
                                    i17 = oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU;
                                }
                                RectF rectF4 = new RectF(0.0f, (float) lineTop, 0.0f, (float) lineBottom);
                                int i26 = VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU3;
                                while (true) {
                                    rectF4.left = z6 ? fArr[((i17 - 1) - lineStart) * 2] : fArr[(i26 - lineStart) * 2];
                                    rectF4.right = z6 ? YmFIHVAy6MFnHbke10dLWI57IXCp(i26, lineStart, fArr) : YmFIHVAy6MFnHbke10dLWI57IXCp(i17 - 1, lineStart, fArr);
                                    if (!((Boolean) wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr2.BrinjKkMNX0Ww9FldCotLl2(rectF4, rectF2)).booleanValue()) {
                                        i17 = aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux2.uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn(i17);
                                        if (i17 == -1 || i17 <= i16) {
                                            break;
                                        }
                                        i26 = aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux2.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(i17);
                                        if (i26 < i16) {
                                            i26 = i16;
                                        }
                                    } else {
                                        i3 = i17;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    i3 = -1;
                    i16 = i3;
                }
                if (i16 >= 0) {
                    return i16;
                }
                if (i13 == i14) {
                    return -1;
                }
                i13 += i2;
                nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcocArr = nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcocArr2;
                i15 = i2;
            }
        } else {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
    }

    public static final float YmFIHVAy6MFnHbke10dLWI57IXCp(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    public static final boolean oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
