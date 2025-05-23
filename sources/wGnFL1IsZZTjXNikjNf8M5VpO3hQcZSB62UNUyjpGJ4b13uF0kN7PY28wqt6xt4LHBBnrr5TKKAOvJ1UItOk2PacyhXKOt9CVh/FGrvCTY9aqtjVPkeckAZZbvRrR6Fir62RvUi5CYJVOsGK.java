package wGnFL1IsZZTjXNikjNf8M5VpO3hQcZSB62UNUyjpGJ4b13uF0kN7PY28wqt6xt4LHBBnrr5TKKAOvJ1UItOk2PacyhXKOt9CVh;

import MjFDmFAySGsKPkPsgU45BdgrQJszEQhLyZevDtLHLen1dzHCsRdO9AYPWV7PGZHTj4RZreLJHFajRTpVrSasUl5hOEjeXTS8hnKau5gQnvzbINJHYhov5knyBcr.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executors;
import tOh5Ux7SYwriccajzHUyxJYcNyBv.zStuoHpnMIHxBnXJToxC6ooO09XlWHvJkE5I32xa9LkRFl7mjmosSVnwGfaCbRAUVHx2sX4;

public final class FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK extends zStuoHpnMIHxBnXJToxC6ooO09XlWHvJkE5I32xa9LkRFl7mjmosSVnwGfaCbRAUVHx2sX4 {
    public final Object DrqQ8C7rtVRDTSclHGsDImq = new Object();
    public volatile Handler VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU;

    public FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK() {
        Executors.newFixedThreadPool(4, new LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA());
    }

    public static Handler OeeoPovHoV5hBC8zt836QRQJNA9hAGQE9mcp3vgjobJymQznQF0YtFg4hX8IrbnoBnMyXMnfhRhsn9l88z8ijJb4bQlsyK2slDjSvcYyFfc1w5DYiNSRgkUt0pPIVmaNSRCtiV0I5jwB(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.YmFIHVAy6MFnHbke10dLWI57IXCp(looper);
        }
        try {
            return Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
