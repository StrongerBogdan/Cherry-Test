package fohPtkVj3dJ58KoN1S9SLHKA3ge0ghORQnzrtckcLrA17hCKcoM4ItKnFCUlHEaAnFuYy2LxHriUQxQmkFz2sDMHu9Mtt5vmtf9Pg6SEd5PhK63w7h6FgE285eKg18EL6EhHjIM;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import flpKXtkxsYs6HzZU6JlcZT0W6k0hSkhHAMmrAYMHm7uThy4GCN2k3f1dOwGQhtd0ak9RrNhLL5P9QUoMZt0BAigZvbe8xa2XMO8RJUFU2gDYqwCZIiejUs4bvVhZvhi6duKPhA1nTsnXIbWud9enjgHU1.Hfv852lbufjqS9YvuotOQGMlAwbT93xAB7vm4I08c6qrPUQoF33xZ7tgcFr07lRFO0AjYBoYHfH7ytkOI;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr implements ServiceConnection {
    public final LinkedBlockingQueue Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw = new LinkedBlockingQueue();
    public boolean xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = false;

    public final IBinder P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(TimeUnit timeUnit) {
        Hfv852lbufjqS9YvuotOQGMlAwbT93xAB7vm4I08c6qrPUQoF33xZ7tgcFr07lRFO0AjYBoYHfH7ytkOI.uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9) {
            this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = true;
            IBinder iBinder = (IBinder) this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw.poll(10000, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
