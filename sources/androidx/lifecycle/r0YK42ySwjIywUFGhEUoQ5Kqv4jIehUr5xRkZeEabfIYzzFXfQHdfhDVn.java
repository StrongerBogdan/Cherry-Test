package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.UUtAgNzTj2jiPR9EkDXBkbhLdyE9LX8zEPE1EhyZlUlh3FbUBpcPK3kHpDSNHq6rc3;
import wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5;

public abstract class r0YK42ySwjIywUFGhEUoQ5Kqv4jIehUr5xRkZeEabfIYzzFXfQHdfhDVn {
    public static void P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(Activity activity, nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcoc) {
        Woxkfd2QILsoDtnr3UH45ujk2A6Cy5L4dZrAA8Gc5VM0y65T1 H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ;
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(activity, "activity");
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcoc, "event");
        if ((activity instanceof Hfv852lbufjqS9YvuotOQGMlAwbT93xAB7vm4I08c6qrPUQoF33xZ7tgcFr07lRFO0AjYBoYHfH7ytkOI) && (H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ = ((Hfv852lbufjqS9YvuotOQGMlAwbT93xAB7vm4I08c6qrPUQoF33xZ7tgcFr07lRFO0AjYBoYHfH7ytkOI) activity).H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ()) != null) {
            H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcoc);
        }
    }

    public static void YmFIHVAy6MFnHbke10dLWI57IXCp(Activity activity) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            UUtAgNzTj2jiPR9EkDXBkbhLdyE9LX8zEPE1EhyZlUlh3FbUBpcPK3kHpDSNHq6rc3.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new UUtAgNzTj2jiPR9EkDXBkbhLdyE9LX8zEPE1EhyZlUlh3FbUBpcPK3kHpDSNHq6rc3.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new UUtAgNzTj2jiPR9EkDXBkbhLdyE9LX8zEPE1EhyZlUlh3FbUBpcPK3kHpDSNHq6rc3(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
