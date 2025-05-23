package Wr0aUHuieAhrlGWy5tDsoxFlCXwCxUbh4yvvDsA71v2GAhbHmbpWWIl6FMJJu7Co9sWE0SuBiYGot8SydedsiqftM9ypVcu3XpjwactgNITd6U;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

public final class MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s implements LineHeightSpan {
    public final float P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;

    public MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s(float f) {
        this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = f;
    }

    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i5 > 0) {
            int ceil = (int) ((float) Math.ceil((double) this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d));
            int ceil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((((float) ceil) * 1.0f) / ((float) i5))));
            fontMetricsInt.descent = ceil2;
            fontMetricsInt.ascent = ceil2 - ceil;
        }
    }
}
