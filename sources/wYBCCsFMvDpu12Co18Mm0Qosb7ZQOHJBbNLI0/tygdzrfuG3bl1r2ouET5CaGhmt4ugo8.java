package wYBCCsFMvDpu12Co18Mm0Qosb7ZQOHJBbNLI0;

import OPYLydbr3oMhUxYtSadYW37XvKT4wJe0GyWfLmkVdbe1YH597Kh2dvsq3rZt1rvXRhuZBWYTH9kG006ntKTXWm4GBwQ8AjNpNKYy6dk434Ay4OiX03hm9txqbRr2BiHpLbBcGX.HYy5buoEq9cltioL1Vju6g9fMXNHB2tQviUIdVgejnJXgtomQ4T0yTntgQwY1LlZPMN009diJgWUqwqWYFfpoGhWkMAB1vA;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;
import u58lgOvywmw8kbWliUc11VvzGXmU4LsKIRiiAI3yaRn0VpG29s8uxEiZ3NkP5O9TfnVffSrrwzrZv72jOUo5Ta0qwQDN2SLeLkMjquaQgM44Mi8rzE.pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1;

public final class tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 implements Closeable {
    public HYy5buoEq9cltioL1Vju6g9fMXNHB2tQviUIdVgejnJXgtomQ4T0yTntgQwY1LlZPMN009diJgWUqwqWYFfpoGhWkMAB1vA GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT;
    public volatile Future Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
    public final URL xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;

    public tygdzrfuG3bl1r2ouET5CaGhmt4ugo8(URL url) {
        this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = url;
    }

    public final Bitmap P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
        if (isLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: " + url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] TufTbjEo23g1q3gqrWPUlqeZBBG33DgWHWTYTdnwCBqchld8Q = pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1.TufTbjEo23g1q3gqrWPUlqeZBBG33DgWHWTYTdnwCBqchld8Q(new pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1(inputStream));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + TufTbjEo23g1q3gqrWPUlqeZBBG33DgWHWTYTdnwCBqchld8Q.length + " bytes from " + url);
                }
                if (TufTbjEo23g1q3gqrWPUlqeZBBG33DgWHWTYTdnwCBqchld8Q.length <= 1048576) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(TufTbjEo23g1q3gqrWPUlqeZBBG33DgWHWTYTdnwCBqchld8Q, 0, TufTbjEo23g1q3gqrWPUlqeZBBG33DgWHWTYTdnwCBqchld8Q.length);
                    if (decodeByteArray != null) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Successfully downloaded image: " + url);
                        }
                        return decodeByteArray;
                    }
                    throw new IOException("Failed to decode image: " + url);
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    public final void close() {
        this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw.cancel(true);
    }
}
