package shvcq9KQw6uvekUXGG8i9vGBdrgjZVvzkAk2gIKkROlObQfc0iA6oR2cvrMqzl66cTdCvGUBj7F9DeKZRJ8RdPJnM0dx47Q8N0e8A36oEOyMpolf5himlD27A5eDlP9U5XaKyc;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

public abstract class pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1 {
    public static final BoringLayout P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, f, f2, metrics, z, truncateAt, i2);
    }

    public static final BoringLayout.Metrics YmFIHVAy6MFnHbke10dLWI57IXCp(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        if (!textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return BoringLayout.isBoring(charSequence, textPaint, (BoringLayout.Metrics) null);
        }
        return null;
    }
}
