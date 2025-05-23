package LpJrvPJZgfMWhzDqYlD5h2rrEkHInLSqeG19dMLEUepln6GC1EX3oXOEKIA4hj2lSfZGJJ2x3n3mSMX6;

import CzCh11bKXsi2JUI0czy6u2bxV7chpbZv4iVdmzIm9MJSNPtMpTjVOqisSiWg1Uo7ZbonYcCmO708ekSHiD2A88x6J51.pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1;
import XrkPJ1A5oQzCLqcEr5evv82KNY9.Um9b2ks8Y0LiK3u4FrDpXIUf9CDB20azqNED8tqUF5QXjqNMzV6NToOBBjWfuzhJwt8AdCxM1KC0y54xLsKDQKV5vpV75DQjOjBEi7ECY0uxjR1BVNeGxeMiDLdAwy33RHeQ9vkNdSttO818vnfVccP8CWp;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import jdxzDmFMbg07IjI7PcEPkz1VanpkwzwtfbCexn664xTLWcPT19DMVQM8hDZEAhKtK8Ty4LKyafeJAl8bLKf.hcbD5JnYtZWRUplQnAKSB4K6rMgILsdqTepvJUiT5QvBVnKVg8pMGRAkHHhIH7CCrpe8RdZ04tGKL9Ow2M6iiLPGOgY9QUurTIjfxWKZ;
import wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5;

public final class asQX8JK5HmDXPcoA9YxLn7cpuBp3KP6Kb3odxWwo12KJ5d8EadSLwry1kNCpB2BMyI1q8ppamvM7V8TMZX0u4yLfB75z4Zfx44zbxotyq8ZtBder4E2Ym1q0028YzDwhrBpztS4K5wnrw39ja extends Handler {
    public final ArrayList DrqQ8C7rtVRDTSclHGsDImq = new ArrayList();
    public boolean P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
    public long YmFIHVAy6MFnHbke10dLWI57IXCp;

    public asQX8JK5HmDXPcoA9YxLn7cpuBp3KP6Kb3odxWwo12KJ5d8EadSLwry1kNCpB2BMyI1q8ppamvM7V8TMZX0u4yLfB75z4Zfx44zbxotyq8ZtBder4E2Ym1q0028YzDwhrBpztS4K5wnrw39ja(Looper looper) {
        super(looper);
    }

    public final void DrqQ8C7rtVRDTSclHGsDImq(Messenger messenger, String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message obtain = Message.obtain((Handler) null, 3, 0, 0);
            obtain.setData(bundle);
            messenger.send(obtain);
        } catch (DeadObjectException unused) {
            Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
            this.DrqQ8C7rtVRDTSclHGsDImq.remove(messenger);
        } catch (Exception e) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e);
        }
    }

    public final void P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(Messenger messenger) {
        if (this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d) {
            Object YmFIHVAy6MFnHbke10dLWI57IXCp2 = Um9b2ks8Y0LiK3u4FrDpXIUf9CDB20azqNED8tqUF5QXjqNMzV6NToOBBjWfuzhJwt8AdCxM1KC0y54xLsKDQKV5vpV75DQjOjBEi7ECY0uxjR1BVNeGxeMiDLdAwy33RHeQ9vkNdSttO818vnfVccP8CWp.DrqQ8C7rtVRDTSclHGsDImq().YmFIHVAy6MFnHbke10dLWI57IXCp(HycJO58aoQSVGU2F34JBtS2EZZrIfZHu4QZkcKSzIiZV8DxfjbNE97av75khvbQkqKmNhRLAyjQoz30eNRpJW9lrQxAjrbdNYDV2QPkZd6DqsLtpHMUskvKfdBirTCrjsgRBywclpihL8M5OPD6.class);
            LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(YmFIHVAy6MFnHbke10dLWI57IXCp2, "Firebase.app[SessionGenerator::class.java]");
            DrqQ8C7rtVRDTSclHGsDImq(messenger, ((HycJO58aoQSVGU2F34JBtS2EZZrIfZHu4QZkcKSzIiZV8DxfjbNE97av75khvbQkqKmNhRLAyjQoz30eNRpJW9lrQxAjrbdNYDV2QPkZd6DqsLtpHMUskvKfdBirTCrjsgRBywclpihL8M5OPD6) YmFIHVAy6MFnHbke10dLWI57IXCp2).YmFIHVAy6MFnHbke10dLWI57IXCp().P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d);
            return;
        }
        Object YmFIHVAy6MFnHbke10dLWI57IXCp3 = Um9b2ks8Y0LiK3u4FrDpXIUf9CDB20azqNED8tqUF5QXjqNMzV6NToOBBjWfuzhJwt8AdCxM1KC0y54xLsKDQKV5vpV75DQjOjBEi7ECY0uxjR1BVNeGxeMiDLdAwy33RHeQ9vkNdSttO818vnfVccP8CWp.DrqQ8C7rtVRDTSclHGsDImq().YmFIHVAy6MFnHbke10dLWI57IXCp(oEviWAW8kWCMiO2chxu48VQJbWaJqTNxq1swuwpK5tQ.class);
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(YmFIHVAy6MFnHbke10dLWI57IXCp3, "Firebase.app[SessionDatastore::class.java]");
        nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcoc = (nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC) ((xym9wgZ7J542NQuCwCxgptMoKnFt4Dm6cyo359LJShJTrDIhKFNjvt1ODm7RIJtZ8mroo4ve5EKHNOjG5b8D9F0GnalEjEYtuzqgb8vVASbAzSRehgO4dST3nKJSldG3dE21BvcBtt851a) ((oEviWAW8kWCMiO2chxu48VQJbWaJqTNxq1swuwpK5tQ) YmFIHVAy6MFnHbke10dLWI57IXCp3)).DrqQ8C7rtVRDTSclHGsDImq.get();
        String str = nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcoc != null ? nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcoc.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d : null;
        Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + str);
        if (str != null) {
            DrqQ8C7rtVRDTSclHGsDImq(messenger, str);
        }
    }

    public final void YmFIHVAy6MFnHbke10dLWI57IXCp() {
        Class<HycJO58aoQSVGU2F34JBtS2EZZrIfZHu4QZkcKSzIiZV8DxfjbNE97av75khvbQkqKmNhRLAyjQoz30eNRpJW9lrQxAjrbdNYDV2QPkZd6DqsLtpHMUskvKfdBirTCrjsgRBywclpihL8M5OPD6> cls = HycJO58aoQSVGU2F34JBtS2EZZrIfZHu4QZkcKSzIiZV8DxfjbNE97av75khvbQkqKmNhRLAyjQoz30eNRpJW9lrQxAjrbdNYDV2QPkZd6DqsLtpHMUskvKfdBirTCrjsgRBywclpihL8M5OPD6.class;
        Object YmFIHVAy6MFnHbke10dLWI57IXCp2 = Um9b2ks8Y0LiK3u4FrDpXIUf9CDB20azqNED8tqUF5QXjqNMzV6NToOBBjWfuzhJwt8AdCxM1KC0y54xLsKDQKV5vpV75DQjOjBEi7ECY0uxjR1BVNeGxeMiDLdAwy33RHeQ9vkNdSttO818vnfVccP8CWp.DrqQ8C7rtVRDTSclHGsDImq().YmFIHVAy6MFnHbke10dLWI57IXCp(cls);
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(YmFIHVAy6MFnHbke10dLWI57IXCp2, "Firebase.app[SessionGenerator::class.java]");
        HycJO58aoQSVGU2F34JBtS2EZZrIfZHu4QZkcKSzIiZV8DxfjbNE97av75khvbQkqKmNhRLAyjQoz30eNRpJW9lrQxAjrbdNYDV2QPkZd6DqsLtpHMUskvKfdBirTCrjsgRBywclpihL8M5OPD6 hycJO58aoQSVGU2F34JBtS2EZZrIfZHu4QZkcKSzIiZV8DxfjbNE97av75khvbQkqKmNhRLAyjQoz30eNRpJW9lrQxAjrbdNYDV2QPkZd6DqsLtpHMUskvKfdBirTCrjsgRBywclpihL8M5OPD6 = (HycJO58aoQSVGU2F34JBtS2EZZrIfZHu4QZkcKSzIiZV8DxfjbNE97av75khvbQkqKmNhRLAyjQoz30eNRpJW9lrQxAjrbdNYDV2QPkZd6DqsLtpHMUskvKfdBirTCrjsgRBywclpihL8M5OPD6) YmFIHVAy6MFnHbke10dLWI57IXCp2;
        int i = hycJO58aoQSVGU2F34JBtS2EZZrIfZHu4QZkcKSzIiZV8DxfjbNE97av75khvbQkqKmNhRLAyjQoz30eNRpJW9lrQxAjrbdNYDV2QPkZd6DqsLtpHMUskvKfdBirTCrjsgRBywclpihL8M5OPD6.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU + 1;
        hycJO58aoQSVGU2F34JBtS2EZZrIfZHu4QZkcKSzIiZV8DxfjbNE97av75khvbQkqKmNhRLAyjQoz30eNRpJW9lrQxAjrbdNYDV2QPkZd6DqsLtpHMUskvKfdBirTCrjsgRBywclpihL8M5OPD6.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU = i;
        String P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d2 = i == 0 ? hycJO58aoQSVGU2F34JBtS2EZZrIfZHu4QZkcKSzIiZV8DxfjbNE97av75khvbQkqKmNhRLAyjQoz30eNRpJW9lrQxAjrbdNYDV2QPkZd6DqsLtpHMUskvKfdBirTCrjsgRBywclpihL8M5OPD6.DrqQ8C7rtVRDTSclHGsDImq : hycJO58aoQSVGU2F34JBtS2EZZrIfZHu4QZkcKSzIiZV8DxfjbNE97av75khvbQkqKmNhRLAyjQoz30eNRpJW9lrQxAjrbdNYDV2QPkZd6DqsLtpHMUskvKfdBirTCrjsgRBywclpihL8M5OPD6.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d();
        int i2 = hycJO58aoQSVGU2F34JBtS2EZZrIfZHu4QZkcKSzIiZV8DxfjbNE97av75khvbQkqKmNhRLAyjQoz30eNRpJW9lrQxAjrbdNYDV2QPkZd6DqsLtpHMUskvKfdBirTCrjsgRBywclpihL8M5OPD6.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU;
        hycJO58aoQSVGU2F34JBtS2EZZrIfZHu4QZkcKSzIiZV8DxfjbNE97av75khvbQkqKmNhRLAyjQoz30eNRpJW9lrQxAjrbdNYDV2QPkZd6DqsLtpHMUskvKfdBirTCrjsgRBywclpihL8M5OPD6.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d.getClass();
        hycJO58aoQSVGU2F34JBtS2EZZrIfZHu4QZkcKSzIiZV8DxfjbNE97av75khvbQkqKmNhRLAyjQoz30eNRpJW9lrQxAjrbdNYDV2QPkZd6DqsLtpHMUskvKfdBirTCrjsgRBywclpihL8M5OPD6.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU = new plBAtfzEVoIiOxmSnMxkpPiJx4OtWt23xs0cyaAy1hUFR6EUWEPtXjieR8yd4CJeFu3nG6nINmSzRJWsV7dIrmvJMWr38UkMlVTGSxwzTtM5DI9EuTnCCdMazLkRODnvHUo(P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d2, hycJO58aoQSVGU2F34JBtS2EZZrIfZHu4QZkcKSzIiZV8DxfjbNE97av75khvbQkqKmNhRLAyjQoz30eNRpJW9lrQxAjrbdNYDV2QPkZd6DqsLtpHMUskvKfdBirTCrjsgRBywclpihL8M5OPD6.DrqQ8C7rtVRDTSclHGsDImq, i2, 1000 * System.currentTimeMillis());
        hycJO58aoQSVGU2F34JBtS2EZZrIfZHu4QZkcKSzIiZV8DxfjbNE97av75khvbQkqKmNhRLAyjQoz30eNRpJW9lrQxAjrbdNYDV2QPkZd6DqsLtpHMUskvKfdBirTCrjsgRBywclpihL8M5OPD6.YmFIHVAy6MFnHbke10dLWI57IXCp();
        StringBuilder sb = new StringBuilder("Generated new session ");
        Object YmFIHVAy6MFnHbke10dLWI57IXCp3 = Um9b2ks8Y0LiK3u4FrDpXIUf9CDB20azqNED8tqUF5QXjqNMzV6NToOBBjWfuzhJwt8AdCxM1KC0y54xLsKDQKV5vpV75DQjOjBEi7ECY0uxjR1BVNeGxeMiDLdAwy33RHeQ9vkNdSttO818vnfVccP8CWp.DrqQ8C7rtVRDTSclHGsDImq().YmFIHVAy6MFnHbke10dLWI57IXCp(cls);
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(YmFIHVAy6MFnHbke10dLWI57IXCp3, "Firebase.app[SessionGenerator::class.java]");
        sb.append(((HycJO58aoQSVGU2F34JBtS2EZZrIfZHu4QZkcKSzIiZV8DxfjbNE97av75khvbQkqKmNhRLAyjQoz30eNRpJW9lrQxAjrbdNYDV2QPkZd6DqsLtpHMUskvKfdBirTCrjsgRBywclpihL8M5OPD6) YmFIHVAy6MFnHbke10dLWI57IXCp3).YmFIHVAy6MFnHbke10dLWI57IXCp().P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d);
        Log.d("SessionLifecycleService", sb.toString());
        StringBuilder sb2 = new StringBuilder("Broadcasting new session: ");
        Object YmFIHVAy6MFnHbke10dLWI57IXCp4 = Um9b2ks8Y0LiK3u4FrDpXIUf9CDB20azqNED8tqUF5QXjqNMzV6NToOBBjWfuzhJwt8AdCxM1KC0y54xLsKDQKV5vpV75DQjOjBEi7ECY0uxjR1BVNeGxeMiDLdAwy33RHeQ9vkNdSttO818vnfVccP8CWp.DrqQ8C7rtVRDTSclHGsDImq().YmFIHVAy6MFnHbke10dLWI57IXCp(cls);
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(YmFIHVAy6MFnHbke10dLWI57IXCp4, "Firebase.app[SessionGenerator::class.java]");
        sb2.append(((HycJO58aoQSVGU2F34JBtS2EZZrIfZHu4QZkcKSzIiZV8DxfjbNE97av75khvbQkqKmNhRLAyjQoz30eNRpJW9lrQxAjrbdNYDV2QPkZd6DqsLtpHMUskvKfdBirTCrjsgRBywclpihL8M5OPD6) YmFIHVAy6MFnHbke10dLWI57IXCp4).YmFIHVAy6MFnHbke10dLWI57IXCp());
        Log.d("SessionLifecycleService", sb2.toString());
        Object YmFIHVAy6MFnHbke10dLWI57IXCp5 = Um9b2ks8Y0LiK3u4FrDpXIUf9CDB20azqNED8tqUF5QXjqNMzV6NToOBBjWfuzhJwt8AdCxM1KC0y54xLsKDQKV5vpV75DQjOjBEi7ECY0uxjR1BVNeGxeMiDLdAwy33RHeQ9vkNdSttO818vnfVccP8CWp.DrqQ8C7rtVRDTSclHGsDImq().YmFIHVAy6MFnHbke10dLWI57IXCp(rvh43jacaJiH3b3o9XeSMDe544.class);
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(YmFIHVAy6MFnHbke10dLWI57IXCp5, "Firebase.app[SessionFirelogPublisher::class.java]");
        Object YmFIHVAy6MFnHbke10dLWI57IXCp6 = Um9b2ks8Y0LiK3u4FrDpXIUf9CDB20azqNED8tqUF5QXjqNMzV6NToOBBjWfuzhJwt8AdCxM1KC0y54xLsKDQKV5vpV75DQjOjBEi7ECY0uxjR1BVNeGxeMiDLdAwy33RHeQ9vkNdSttO818vnfVccP8CWp.DrqQ8C7rtVRDTSclHGsDImq().YmFIHVAy6MFnHbke10dLWI57IXCp(cls);
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(YmFIHVAy6MFnHbke10dLWI57IXCp6, "Firebase.app[SessionGenerator::class.java]");
        H9OjTzyn59eJfMyqcnpyYaumjyF0T8gPaVRLAQsSLd1H0g9w92lSoUZtlUrw8eNs1aBkPJOLJTt06hQ1DFl2Ct13EVBd8cy h9OjTzyn59eJfMyqcnpyYaumjyF0T8gPaVRLAQsSLd1H0g9w92lSoUZtlUrw8eNs1aBkPJOLJTt06hQ1DFl2Ct13EVBd8cy = (H9OjTzyn59eJfMyqcnpyYaumjyF0T8gPaVRLAQsSLd1H0g9w92lSoUZtlUrw8eNs1aBkPJOLJTt06hQ1DFl2Ct13EVBd8cy) ((rvh43jacaJiH3b3o9XeSMDe544) YmFIHVAy6MFnHbke10dLWI57IXCp5);
        hcbD5JnYtZWRUplQnAKSB4K6rMgILsdqTepvJUiT5QvBVnKVg8pMGRAkHHhIH7CCrpe8RdZ04tGKL9Ow2M6iiLPGOgY9QUurTIjfxWKZ.OKEFRhs6OXFJKyry5Z71CY76oDnwhW5FJg2OAPnj9ulD5LM4Kq5Bjc83bCfwXFNmMjv6yp6Ftre2cNRkaH0Q3xMOZ2hMufJD0zymR1CE8pqwQRzY(hcbD5JnYtZWRUplQnAKSB4K6rMgILsdqTepvJUiT5QvBVnKVg8pMGRAkHHhIH7CCrpe8RdZ04tGKL9Ow2M6iiLPGOgY9QUurTIjfxWKZ.DrqQ8C7rtVRDTSclHGsDImq(h9OjTzyn59eJfMyqcnpyYaumjyF0T8gPaVRLAQsSLd1H0g9w92lSoUZtlUrw8eNs1aBkPJOLJTt06hQ1DFl2Ct13EVBd8cy.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU), (CzCh11bKXsi2JUI0czy6u2bxV7chpbZv4iVdmzIm9MJSNPtMpTjVOqisSiWg1Uo7ZbonYcCmO708ekSHiD2A88x6J51.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5) null, 0, new uKo7OCHL2lMivEF7eLsPf5oYebQSCeIRWH(h9OjTzyn59eJfMyqcnpyYaumjyF0T8gPaVRLAQsSLd1H0g9w92lSoUZtlUrw8eNs1aBkPJOLJTt06hQ1DFl2Ct13EVBd8cy, ((HycJO58aoQSVGU2F34JBtS2EZZrIfZHu4QZkcKSzIiZV8DxfjbNE97av75khvbQkqKmNhRLAyjQoz30eNRpJW9lrQxAjrbdNYDV2QPkZd6DqsLtpHMUskvKfdBirTCrjsgRBywclpihL8M5OPD6) YmFIHVAy6MFnHbke10dLWI57IXCp6).YmFIHVAy6MFnHbke10dLWI57IXCp(), (pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1) null), 3);
        Iterator it = new ArrayList(this.DrqQ8C7rtVRDTSclHGsDImq).iterator();
        while (it.hasNext()) {
            Messenger messenger = (Messenger) it.next();
            LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(messenger, "it");
            P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(messenger);
        }
        Object YmFIHVAy6MFnHbke10dLWI57IXCp7 = Um9b2ks8Y0LiK3u4FrDpXIUf9CDB20azqNED8tqUF5QXjqNMzV6NToOBBjWfuzhJwt8AdCxM1KC0y54xLsKDQKV5vpV75DQjOjBEi7ECY0uxjR1BVNeGxeMiDLdAwy33RHeQ9vkNdSttO818vnfVccP8CWp.DrqQ8C7rtVRDTSclHGsDImq().YmFIHVAy6MFnHbke10dLWI57IXCp(oEviWAW8kWCMiO2chxu48VQJbWaJqTNxq1swuwpK5tQ.class);
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(YmFIHVAy6MFnHbke10dLWI57IXCp7, "Firebase.app[SessionDatastore::class.java]");
        Object YmFIHVAy6MFnHbke10dLWI57IXCp8 = Um9b2ks8Y0LiK3u4FrDpXIUf9CDB20azqNED8tqUF5QXjqNMzV6NToOBBjWfuzhJwt8AdCxM1KC0y54xLsKDQKV5vpV75DQjOjBEi7ECY0uxjR1BVNeGxeMiDLdAwy33RHeQ9vkNdSttO818vnfVccP8CWp.DrqQ8C7rtVRDTSclHGsDImq().YmFIHVAy6MFnHbke10dLWI57IXCp(cls);
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(YmFIHVAy6MFnHbke10dLWI57IXCp8, "Firebase.app[SessionGenerator::class.java]");
        xym9wgZ7J542NQuCwCxgptMoKnFt4Dm6cyo359LJShJTrDIhKFNjvt1ODm7RIJtZ8mroo4ve5EKHNOjG5b8D9F0GnalEjEYtuzqgb8vVASbAzSRehgO4dST3nKJSldG3dE21BvcBtt851a xym9wgz7j542nqucwcxgptmoknft4dm6cyo359ljshjtrdihkfnjvt1odm7rijtz8mroo4ve5ekhnojg5b8d9f0gnalejeytuzqgb8vvasbazsrehgo4dst3nkjsldg3de21bvcbtt851a = (xym9wgZ7J542NQuCwCxgptMoKnFt4Dm6cyo359LJShJTrDIhKFNjvt1ODm7RIJtZ8mroo4ve5EKHNOjG5b8D9F0GnalEjEYtuzqgb8vVASbAzSRehgO4dST3nKJSldG3dE21BvcBtt851a) ((oEviWAW8kWCMiO2chxu48VQJbWaJqTNxq1swuwpK5tQ) YmFIHVAy6MFnHbke10dLWI57IXCp7);
        String str = ((HycJO58aoQSVGU2F34JBtS2EZZrIfZHu4QZkcKSzIiZV8DxfjbNE97av75khvbQkqKmNhRLAyjQoz30eNRpJW9lrQxAjrbdNYDV2QPkZd6DqsLtpHMUskvKfdBirTCrjsgRBywclpihL8M5OPD6) YmFIHVAy6MFnHbke10dLWI57IXCp8).YmFIHVAy6MFnHbke10dLWI57IXCp().P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str, "sessionId");
        hcbD5JnYtZWRUplQnAKSB4K6rMgILsdqTepvJUiT5QvBVnKVg8pMGRAkHHhIH7CCrpe8RdZ04tGKL9Ow2M6iiLPGOgY9QUurTIjfxWKZ.OKEFRhs6OXFJKyry5Z71CY76oDnwhW5FJg2OAPnj9ulD5LM4Kq5Bjc83bCfwXFNmMjv6yp6Ftre2cNRkaH0Q3xMOZ2hMufJD0zymR1CE8pqwQRzY(hcbD5JnYtZWRUplQnAKSB4K6rMgILsdqTepvJUiT5QvBVnKVg8pMGRAkHHhIH7CCrpe8RdZ04tGKL9Ow2M6iiLPGOgY9QUurTIjfxWKZ.DrqQ8C7rtVRDTSclHGsDImq(xym9wgz7j542nqucwcxgptmoknft4dm6cyo359ljshjtrdihkfnjvt1odm7rijtz8mroo4ve5ekhnojg5b8d9f0gnalejeytuzqgb8vvasbazsrehgo4dst3nkjsldg3de21bvcbtt851a.YmFIHVAy6MFnHbke10dLWI57IXCp), (CzCh11bKXsi2JUI0czy6u2bxV7chpbZv4iVdmzIm9MJSNPtMpTjVOqisSiWg1Uo7ZbonYcCmO708ekSHiD2A88x6J51.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5) null, 0, new zI2fCdk9ITEkloGGf5BBXU6v5u827OrbBEU80RrMyiEiPccBbirKgpuOnTg85YCg1thGiwtifgTkgI3EUfQA6(xym9wgz7j542nqucwcxgptmoknft4dm6cyo359ljshjtrdihkfnjvt1odm7rijtz8mroo4ve5ekhnojg5b8d9f0gnalejeytuzqgb8vvasbazsrehgo4dst3nkjsldg3de21bvcbtt851a, str, (pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1) null), 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0125, code lost:
        if (lttZwWCLaH08VWRQuCNKMzcE9LoivKuVkz2BXDbIyh42vd8z4YdSkVPMhGpr.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.YmFIHVAy6MFnHbke10dLWI57IXCp(r8) == false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0153, code lost:
        if (lttZwWCLaH08VWRQuCNKMzcE9LoivKuVkz2BXDbIyh42vd8z4YdSkVPMhGpr.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.YmFIHVAy6MFnHbke10dLWI57IXCp(r8) == false) goto L_0x0160;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r12) {
        /*
            r11 = this;
            r0 = 0
            java.lang.String r1 = "msg"
            wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(r12, r1)
            long r1 = r11.YmFIHVAy6MFnHbke10dLWI57IXCp
            long r3 = r12.getWhen()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 46
            java.lang.String r3 = "SessionLifecycleService"
            if (r1 <= 0) goto L_0x0037
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Ignoring old message from "
            r0.<init>(r1)
            long r4 = r12.getWhen()
            r0.append(r4)
            java.lang.String r12 = " which is older than "
            r0.append(r12)
            long r4 = r11.YmFIHVAy6MFnHbke10dLWI57IXCp
            r0.append(r4)
            r0.append(r2)
            java.lang.String r12 = r0.toString()
            android.util.Log.d(r3, r12)
            return
        L_0x0037:
            int r1 = r12.what
            r4 = 1
            if (r1 == r4) goto L_0x00b3
            r0 = 2
            if (r1 == r0) goto L_0x0096
            r0 = 4
            if (r1 == r0) goto L_0x0058
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Received unexpected event from the SessionLifecycleClient: "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r3, r0)
            super.handleMessage(r12)
            goto L_0x0185
        L_0x0058:
            java.util.ArrayList r0 = r11.DrqQ8C7rtVRDTSclHGsDImq
            android.os.Messenger r1 = r12.replyTo
            r0.add(r1)
            android.os.Messenger r1 = r12.replyTo
            java.lang.String r2 = "msg.replyTo"
            wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(r1, r2)
            r11.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Client "
            r1.<init>(r2)
            android.os.Messenger r2 = r12.replyTo
            r1.append(r2)
            java.lang.String r2 = " bound at "
            r1.append(r2)
            long r4 = r12.getWhen()
            r1.append(r4)
            java.lang.String r12 = ". Clients: "
            r1.append(r12)
            int r12 = r0.size()
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            android.util.Log.d(r3, r12)
            goto L_0x0185
        L_0x0096:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Activity backgrounding at "
            r0.<init>(r1)
            long r1 = r12.getWhen()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            long r0 = r12.getWhen()
            r11.YmFIHVAy6MFnHbke10dLWI57IXCp = r0
            goto L_0x0185
        L_0x00b3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "Activity foregrounding at "
            r1.<init>(r5)
            long r5 = r12.getWhen()
            r1.append(r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r3, r1)
            boolean r1 = r11.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d
            if (r1 != 0) goto L_0x00db
            java.lang.String r0 = "Cold start detected."
            android.util.Log.d(r3, r0)
            r11.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = r4
            r11.YmFIHVAy6MFnHbke10dLWI57IXCp()
            goto L_0x017f
        L_0x00db:
            long r1 = r12.getWhen()
            long r5 = r11.YmFIHVAy6MFnHbke10dLWI57IXCp
            long r1 = r1 - r5
            StjY3vFV4grGYga81CvWBmJLFXPWSK3QCrZPevLnTimJEhEK1h2inZ8vZi2fxCtLhFbUDnRrvCU2kR2zemafxZHKieEMArrOjUYEfAnNu.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5 r5 = StjY3vFV4grGYga81CvWBmJLFXPWSK3QCrZPevLnTimJEhEK1h2inZ8vZi2fxCtLhFbUDnRrvCU2kR2zemafxZHKieEMArrOjUYEfAnNu.NrRzqnkwNu0nnqBOm1PWjgXM1XJmOU4AUNIao5PXqr65iPoidXJXhn2k0kJ93.DrqQ8C7rtVRDTSclHGsDImq
            r5.getClass()
            XrkPJ1A5oQzCLqcEr5evv82KNY9.Um9b2ks8Y0LiK3u4FrDpXIUf9CDB20azqNED8tqUF5QXjqNMzV6NToOBBjWfuzhJwt8AdCxM1KC0y54xLsKDQKV5vpV75DQjOjBEi7ECY0uxjR1BVNeGxeMiDLdAwy33RHeQ9vkNdSttO818vnfVccP8CWp r5 = XrkPJ1A5oQzCLqcEr5evv82KNY9.Um9b2ks8Y0LiK3u4FrDpXIUf9CDB20azqNED8tqUF5QXjqNMzV6NToOBBjWfuzhJwt8AdCxM1KC0y54xLsKDQKV5vpV75DQjOjBEi7ECY0uxjR1BVNeGxeMiDLdAwy33RHeQ9vkNdSttO818vnfVccP8CWp.DrqQ8C7rtVRDTSclHGsDImq()
            java.lang.Class<StjY3vFV4grGYga81CvWBmJLFXPWSK3QCrZPevLnTimJEhEK1h2inZ8vZi2fxCtLhFbUDnRrvCU2kR2zemafxZHKieEMArrOjUYEfAnNu.NrRzqnkwNu0nnqBOm1PWjgXM1XJmOU4AUNIao5PXqr65iPoidXJXhn2k0kJ93> r6 = StjY3vFV4grGYga81CvWBmJLFXPWSK3QCrZPevLnTimJEhEK1h2inZ8vZi2fxCtLhFbUDnRrvCU2kR2zemafxZHKieEMArrOjUYEfAnNu.NrRzqnkwNu0nnqBOm1PWjgXM1XJmOU4AUNIao5PXqr65iPoidXJXhn2k0kJ93.class
            java.lang.Object r5 = r5.YmFIHVAy6MFnHbke10dLWI57IXCp(r6)
            java.lang.String r6 = "Firebase.app[SessionsSettings::class.java]"
            wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(r5, r6)
            StjY3vFV4grGYga81CvWBmJLFXPWSK3QCrZPevLnTimJEhEK1h2inZ8vZi2fxCtLhFbUDnRrvCU2kR2zemafxZHKieEMArrOjUYEfAnNu.NrRzqnkwNu0nnqBOm1PWjgXM1XJmOU4AUNIao5PXqr65iPoidXJXhn2k0kJ93 r5 = (StjY3vFV4grGYga81CvWBmJLFXPWSK3QCrZPevLnTimJEhEK1h2inZ8vZi2fxCtLhFbUDnRrvCU2kR2zemafxZHKieEMArrOjUYEfAnNu.NrRzqnkwNu0nnqBOm1PWjgXM1XJmOU4AUNIao5PXqr65iPoidXJXhn2k0kJ93) r5
            StjY3vFV4grGYga81CvWBmJLFXPWSK3QCrZPevLnTimJEhEK1h2inZ8vZi2fxCtLhFbUDnRrvCU2kR2zemafxZHKieEMArrOjUYEfAnNu.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr r6 = r5.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d
            android.os.Bundle r6 = r6.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d
            java.lang.String r7 = "firebase_sessions_sessions_restart_timeout"
            boolean r8 = r6.containsKey(r7)
            if (r8 == 0) goto L_0x0114
            int r6 = r6.getInt(r7)
            lttZwWCLaH08VWRQuCNKMzcE9LoivKuVkz2BXDbIyh42vd8z4YdSkVPMhGpr.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK r7 = lttZwWCLaH08VWRQuCNKMzcE9LoivKuVkz2BXDbIyh42vd8z4YdSkVPMhGpr.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK.SECONDS
            long r6 = u58lgOvywmw8kbWliUc11VvzGXmU4LsKIRiiAI3yaRn0VpG29s8uxEiZ3NkP5O9TfnVffSrrwzrZv72jOUo5Ta0qwQDN2SLeLkMjquaQgM44Mi8rzE.pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1.jes8Po5CNJJMfpLzOU3ERgRK130pGdnvMYHFFn2KK76UTW01kiooVmKLA6uTwb7u7lEVMZfFmWasqYtkkgEjSfJzigF0sBUw(r6, r7)
            lttZwWCLaH08VWRQuCNKMzcE9LoivKuVkz2BXDbIyh42vd8z4YdSkVPMhGpr.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr r8 = new lttZwWCLaH08VWRQuCNKMzcE9LoivKuVkz2BXDbIyh42vd8z4YdSkVPMhGpr.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr
            r8.<init>(r6)
            goto L_0x0115
        L_0x0114:
            r8 = r0
        L_0x0115:
            r6 = 0
            if (r8 == 0) goto L_0x0128
            int r9 = lttZwWCLaH08VWRQuCNKMzcE9LoivKuVkz2BXDbIyh42vd8z4YdSkVPMhGpr.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8
            long r8 = r8.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 <= 0) goto L_0x0128
            boolean r10 = lttZwWCLaH08VWRQuCNKMzcE9LoivKuVkz2BXDbIyh42vd8z4YdSkVPMhGpr.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.YmFIHVAy6MFnHbke10dLWI57IXCp(r8)
            if (r10 != 0) goto L_0x0128
            goto L_0x0160
        L_0x0128:
            StjY3vFV4grGYga81CvWBmJLFXPWSK3QCrZPevLnTimJEhEK1h2inZ8vZi2fxCtLhFbUDnRrvCU2kR2zemafxZHKieEMArrOjUYEfAnNu.aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX r5 = r5.YmFIHVAy6MFnHbke10dLWI57IXCp
            StjY3vFV4grGYga81CvWBmJLFXPWSK3QCrZPevLnTimJEhEK1h2inZ8vZi2fxCtLhFbUDnRrvCU2kR2zemafxZHKieEMArrOjUYEfAnNu.QUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI r5 = r5.DrqQ8C7rtVRDTSclHGsDImq
            StjY3vFV4grGYga81CvWBmJLFXPWSK3QCrZPevLnTimJEhEK1h2inZ8vZi2fxCtLhFbUDnRrvCU2kR2zemafxZHKieEMArrOjUYEfAnNu.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s r5 = r5.YmFIHVAy6MFnHbke10dLWI57IXCp
            if (r5 == 0) goto L_0x0186
            java.lang.Integer r5 = r5.DrqQ8C7rtVRDTSclHGsDImq
            if (r5 == 0) goto L_0x0145
            int r0 = lttZwWCLaH08VWRQuCNKMzcE9LoivKuVkz2BXDbIyh42vd8z4YdSkVPMhGpr.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8
            int r0 = r5.intValue()
            lttZwWCLaH08VWRQuCNKMzcE9LoivKuVkz2BXDbIyh42vd8z4YdSkVPMhGpr.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK r5 = lttZwWCLaH08VWRQuCNKMzcE9LoivKuVkz2BXDbIyh42vd8z4YdSkVPMhGpr.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK.SECONDS
            long r8 = u58lgOvywmw8kbWliUc11VvzGXmU4LsKIRiiAI3yaRn0VpG29s8uxEiZ3NkP5O9TfnVffSrrwzrZv72jOUo5Ta0qwQDN2SLeLkMjquaQgM44Mi8rzE.pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1.jes8Po5CNJJMfpLzOU3ERgRK130pGdnvMYHFFn2KK76UTW01kiooVmKLA6uTwb7u7lEVMZfFmWasqYtkkgEjSfJzigF0sBUw(r0, r5)
            lttZwWCLaH08VWRQuCNKMzcE9LoivKuVkz2BXDbIyh42vd8z4YdSkVPMhGpr.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr r0 = new lttZwWCLaH08VWRQuCNKMzcE9LoivKuVkz2BXDbIyh42vd8z4YdSkVPMhGpr.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr
            r0.<init>(r8)
        L_0x0145:
            if (r0 == 0) goto L_0x0156
            int r5 = lttZwWCLaH08VWRQuCNKMzcE9LoivKuVkz2BXDbIyh42vd8z4YdSkVPMhGpr.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8
            long r8 = r0.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0156
            boolean r0 = lttZwWCLaH08VWRQuCNKMzcE9LoivKuVkz2BXDbIyh42vd8z4YdSkVPMhGpr.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.YmFIHVAy6MFnHbke10dLWI57IXCp(r8)
            if (r0 != 0) goto L_0x0156
            goto L_0x0160
        L_0x0156:
            int r0 = lttZwWCLaH08VWRQuCNKMzcE9LoivKuVkz2BXDbIyh42vd8z4YdSkVPMhGpr.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8
            r0 = 30
            lttZwWCLaH08VWRQuCNKMzcE9LoivKuVkz2BXDbIyh42vd8z4YdSkVPMhGpr.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK r5 = lttZwWCLaH08VWRQuCNKMzcE9LoivKuVkz2BXDbIyh42vd8z4YdSkVPMhGpr.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK.MINUTES
            long r8 = u58lgOvywmw8kbWliUc11VvzGXmU4LsKIRiiAI3yaRn0VpG29s8uxEiZ3NkP5O9TfnVffSrrwzrZv72jOUo5Ta0qwQDN2SLeLkMjquaQgM44Mi8rzE.pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1.jes8Po5CNJJMfpLzOU3ERgRK130pGdnvMYHFFn2KK76UTW01kiooVmKLA6uTwb7u7lEVMZfFmWasqYtkkgEjSfJzigF0sBUw(r0, r5)
        L_0x0160:
            int r0 = (int) r8
            r0 = r0 & r4
            if (r0 != r4) goto L_0x016d
            boolean r0 = lttZwWCLaH08VWRQuCNKMzcE9LoivKuVkz2BXDbIyh42vd8z4YdSkVPMhGpr.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.YmFIHVAy6MFnHbke10dLWI57IXCp(r8)
            if (r0 != 0) goto L_0x016d
            long r4 = r8 >> r4
            goto L_0x0173
        L_0x016d:
            lttZwWCLaH08VWRQuCNKMzcE9LoivKuVkz2BXDbIyh42vd8z4YdSkVPMhGpr.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK r0 = lttZwWCLaH08VWRQuCNKMzcE9LoivKuVkz2BXDbIyh42vd8z4YdSkVPMhGpr.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK.MILLISECONDS
            long r4 = lttZwWCLaH08VWRQuCNKMzcE9LoivKuVkz2BXDbIyh42vd8z4YdSkVPMhGpr.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.DrqQ8C7rtVRDTSclHGsDImq(r8, r0)
        L_0x0173:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x017f
            java.lang.String r0 = "Session too long in background. Creating new session."
            android.util.Log.d(r3, r0)
            r11.YmFIHVAy6MFnHbke10dLWI57IXCp()
        L_0x017f:
            long r0 = r12.getWhen()
            r11.YmFIHVAy6MFnHbke10dLWI57IXCp = r0
        L_0x0185:
            return
        L_0x0186:
            java.lang.String r12 = "sessionConfigs"
            wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.BrinjKkMNX0Ww9FldCotLl2(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: LpJrvPJZgfMWhzDqYlD5h2rrEkHInLSqeG19dMLEUepln6GC1EX3oXOEKIA4hj2lSfZGJJ2x3n3mSMX6.asQX8JK5HmDXPcoA9YxLn7cpuBp3KP6Kb3odxWwo12KJ5d8EadSLwry1kNCpB2BMyI1q8ppamvM7V8TMZX0u4yLfB75z4Zfx44zbxotyq8ZtBder4E2Ym1q0028YzDwhrBpztS4K5wnrw39ja.handleMessage(android.os.Message):void");
    }
}
