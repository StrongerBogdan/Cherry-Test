package u7WSURlE4UdW83Fpzp6QuhjxNinQRIdijMWqRq2SzYzZwLHMYceV3WdoH3Sxb54y3kpveUEWmbK3WyUaeaGQmc8HZT4kEZkfdoey9cENBRl54QRnr2FfxNrXW3n9zyKmVjJO0;

import BCs5w7KHK7GEDZJIRQEV0DAdch99r0WwJXx8TNNgl3iK4H3Ow0LS0kLgwNhBopBhXIeKB2qFt0SsGi04a2UgjGFZkJOqF4li.Um9b2ks8Y0LiK3u4FrDpXIUf9CDB20azqNED8tqUF5QXjqNMzV6NToOBBjWfuzhJwt8AdCxM1KC0y54xLsKDQKV5vpV75DQjOjBEi7ECY0uxjR1BVNeGxeMiDLdAwy33RHeQ9vkNdSttO818vnfVccP8CWp;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.Log;
import iX70oJ0R8DoyHiGTNKhpvukZOnP3ftm7I6udhF7zz0IRpWPrrmhlpbog5Ut.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr;
import java.security.MessageDigest;

public final class D8GgZbzcKj5rilKnkj8e7mJ1giKXr7PVzF6Rm3iAMV12GPJFjJsP85ro8B5TqnDd3HSKa30yTfOnQUxiSzoUz76iRkaUnM8auyBFxe5kbLQOgcMjtAdyoJ8gOPES2QZYZSBpUK6Mt0I5HQrX8aYczk extends Um9b2ks8Y0LiK3u4FrDpXIUf9CDB20azqNED8tqUF5QXjqNMzV6NToOBBjWfuzhJwt8AdCxM1KC0y54xLsKDQKV5vpV75DQjOjBEi7ECY0uxjR1BVNeGxeMiDLdAwy33RHeQ9vkNdSttO818vnfVccP8CWp {
    public static final byte[] YmFIHVAy6MFnHbke10dLWI57IXCp = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(Um9b2ks8Y0LiK3u4FrDpXIUf9CDB20azqNED8tqUF5QXjqNMzV6NToOBBjWfuzhJwt8AdCxM1KC0y54xLsKDQKV5vpV75DQjOjBEi7ECY0uxjR1BVNeGxeMiDLdAwy33RHeQ9vkNdSttO818vnfVccP8CWp.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d);

    public final Bitmap DrqQ8C7rtVRDTSclHGsDImq(wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr, Bitmap bitmap, int i, int i2) {
        Paint paint = Woxkfd2QILsoDtnr3UH45ujk2A6Cy5L4dZrAA8Gc5VM0y65T1.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
                float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
                int round = Math.round(((float) bitmap.getWidth()) * min);
                int round2 = Math.round(((float) bitmap.getHeight()) * min);
                if (bitmap.getWidth() != round || bitmap.getHeight() != round2) {
                    Bitmap GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT = wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
                    GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT.setHasAlpha(bitmap.hasAlpha());
                    if (Log.isLoggable("TransformationUtils", 2)) {
                        Log.v("TransformationUtils", "request: " + i + "x" + i2);
                        Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
                        Log.v("TransformationUtils", "toReuse: " + GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT.getWidth() + "x" + GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT.getHeight());
                        StringBuilder sb = new StringBuilder("minPct:   ");
                        sb.append(min);
                        Log.v("TransformationUtils", sb.toString());
                    }
                    Matrix matrix = new Matrix();
                    matrix.setScale(min, min);
                    Woxkfd2QILsoDtnr3UH45ujk2A6Cy5L4dZrAA8Gc5VM0y65T1.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(bitmap, GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT, matrix);
                    return GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT;
                } else if (!Log.isLoggable("TransformationUtils", 2)) {
                    return bitmap;
                } else {
                    Log.v("TransformationUtils", "adjusted target size matches input, returning input");
                    return bitmap;
                }
            } else if (!Log.isLoggable("TransformationUtils", 2)) {
                return bitmap;
            } else {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
                return bitmap;
            }
        } else if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        } else {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            return bitmap;
        }
    }

    public final void P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(MessageDigest messageDigest) {
        messageDigest.update(YmFIHVAy6MFnHbke10dLWI57IXCp);
    }

    public final boolean equals(Object obj) {
        return obj instanceof D8GgZbzcKj5rilKnkj8e7mJ1giKXr7PVzF6Rm3iAMV12GPJFjJsP85ro8B5TqnDd3HSKa30yTfOnQUxiSzoUz76iRkaUnM8auyBFxe5kbLQOgcMjtAdyoJ8gOPES2QZYZSBpUK6Mt0I5HQrX8aYczk;
    }

    public final int hashCode() {
        return -670243078;
    }
}
