package MjFDmFAySGsKPkPsgU45BdgrQJszEQhLyZevDtLHLen1dzHCsRdO9AYPWV7PGZHTj4RZreLJHFajRTpVrSasUl5hOEjeXTS8hnKau5gQnvzbINJHYhov5knyBcr;

import android.graphics.Insets;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;

public abstract class LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA {
    public static Insets DrqQ8C7rtVRDTSclHGsDImq(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static void H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static Icon P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static void VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & -257 : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }

    public static CharSequence YmFIHVAy6MFnHbke10dLWI57IXCp(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static void uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
