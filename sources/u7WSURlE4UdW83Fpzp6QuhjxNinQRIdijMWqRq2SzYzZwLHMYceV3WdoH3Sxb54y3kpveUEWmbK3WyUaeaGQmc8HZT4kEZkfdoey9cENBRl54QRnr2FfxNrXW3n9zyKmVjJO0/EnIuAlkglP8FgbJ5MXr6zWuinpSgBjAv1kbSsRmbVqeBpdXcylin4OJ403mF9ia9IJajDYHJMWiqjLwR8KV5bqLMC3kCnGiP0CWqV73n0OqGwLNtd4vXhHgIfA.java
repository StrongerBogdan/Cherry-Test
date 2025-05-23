package u7WSURlE4UdW83Fpzp6QuhjxNinQRIdijMWqRq2SzYzZwLHMYceV3WdoH3Sxb54y3kpveUEWmbK3WyUaeaGQmc8HZT4kEZkfdoey9cENBRl54QRnr2FfxNrXW3n9zyKmVjJO0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import iX70oJ0R8DoyHiGTNKhpvukZOnP3ftm7I6udhF7zz0IRpWPrrmhlpbog5Ut.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr;
import java.util.concurrent.locks.Lock;
import oCLc1lIGdQy9mm1kIVILcltBYvOpd2pMDgQqBBmoSrzbv4yor7w6.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK;

public abstract class EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH {
    public static final gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = new FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK(16);

    /* JADX INFO: finally extract failed */
    public static aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i2 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i2 = current.getIntrinsicHeight();
                    }
                    Lock lock = Woxkfd2QILsoDtnr3UH45ujk2A6Cy5L4dZrAA8Gc5VM0y65T1.YmFIHVAy6MFnHbke10dLWI57IXCp;
                    lock.lock();
                    Bitmap GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT = wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT(i, i2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT);
                        current.setBounds(0, 0, i, i2);
                        current.draw(canvas);
                        canvas.setBitmap((Bitmap) null);
                        lock.unlock();
                        bitmap = GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT;
                        z = true;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            bitmap = null;
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr = P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
        }
        return aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(bitmap, wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr);
    }
}
