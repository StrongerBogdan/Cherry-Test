package kfLVQOQ5ZaHf22AThS2NU1uk9bVT8Vjb05Ra0VBxI7g7m1VHjzsZTPOevdDPOD;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import pJa7QMMLe00Eu2RTHYVVwMClYmDLWBqSdXnh5ybcL0cqVv78NoJ9wqJ5qID5xCrU4oHfgBH4XvzJh1J9vSsZoIOqxNvC60IpOedBQtcMQdii9QRuNdg3Qh0LMK6H.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr;

public final class tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 implements Iterable {
    public final Context Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
    public final ArrayList xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = new ArrayList();

    public tygdzrfuG3bl1r2ouET5CaGhmt4ugo8(Context context) {
        this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw = context;
    }

    public final void DrqQ8C7rtVRDTSclHGsDImq() {
        ArrayList arrayList = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw.startActivities(intentArr, (Bundle) null);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    public final void YmFIHVAy6MFnHbke10dLWI57IXCp(Intent intent) {
        ComponentName component = intent.getComponent();
        Context context = this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
        if (component == null) {
            component = intent.resolveActivity(context.getPackageManager());
        }
        ArrayList arrayList = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
        if (component != null) {
            int size = arrayList.size();
            try {
                for (Intent clrwhPukEsfrq9j9C16o0r9kuYd3V = wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.clrwhPukEsfrq9j9C16o0r9kuYd3V(context, component); clrwhPukEsfrq9j9C16o0r9kuYd3V != null; clrwhPukEsfrq9j9C16o0r9kuYd3V = wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.clrwhPukEsfrq9j9C16o0r9kuYd3V(context, clrwhPukEsfrq9j9C16o0r9kuYd3V.getComponent())) {
                    arrayList.add(size, clrwhPukEsfrq9j9C16o0r9kuYd3V);
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
        arrayList.add(intent);
    }

    public final Iterator iterator() {
        return this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9.iterator();
    }
}
