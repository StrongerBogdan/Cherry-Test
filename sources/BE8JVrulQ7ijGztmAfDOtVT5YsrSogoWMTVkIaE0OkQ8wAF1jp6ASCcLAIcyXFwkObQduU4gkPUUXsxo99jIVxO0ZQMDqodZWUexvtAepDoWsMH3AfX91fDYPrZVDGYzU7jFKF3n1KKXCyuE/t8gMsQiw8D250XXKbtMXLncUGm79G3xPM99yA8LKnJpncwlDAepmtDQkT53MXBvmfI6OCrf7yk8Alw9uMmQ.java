package BE8JVrulQ7ijGztmAfDOtVT5YsrSogoWMTVkIaE0OkQ8wAF1jp6ASCcLAIcyXFwkObQduU4gkPUUXsxo99jIVxO0ZQMDqodZWUexvtAepDoWsMH3AfX91fDYPrZVDGYzU7jFKF3n1KKXCyuE;

import D2SFNPT8hkiEzkQZZpQFcEpmofd4OOY3valAWANeTShzJVwwwkLuclzSNaWqKq8Poet5LeRMVje5Qh6K1I8LcEAYcIJJilbU5GqLq3ayB.uKo7OCHL2lMivEF7eLsPf5oYebQSCeIRWH;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

public final class t8gMsQiw8D250XXKbtMXLncUGm79G3xPM99yA8LKnJpncwlDAepmtDQkT53MXBvmfI6OCrf7yk8Alw9uMmQ implements CpOgHZvQr8IP1p4560FetMGHuywvMPF2M2kj6Glv6fO3ZUe6Pb7KHUOAltwgmEGaXg2GQGLsj3mjUl46bazaXaFTCmc7312yVKDzuC7H3nVeCt {
    public final Matrix P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = new Matrix();
    public final int[] YmFIHVAy6MFnHbke10dLWI57IXCp = new int[2];

    public void P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(View view, float[] fArr) {
        Matrix matrix = this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent viewParent = view.getParent();
        while (viewParent instanceof View) {
            view = (View) viewParent;
            viewParent = view.getParent();
        }
        int[] iArr = this.YmFIHVAy6MFnHbke10dLWI57IXCp;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate((float) (iArr[0] - i), (float) (iArr[1] - i2));
        uKo7OCHL2lMivEF7eLsPf5oYebQSCeIRWH.N6PwCtLZilQqv2HuGbZQ7SwIiPpRTSCJOi8G5CG6t7(matrix, fArr);
    }
}
