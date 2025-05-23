package e85HM6RK69JRNoJaF8YK8I4A9u7jmZ48FCxnpCDtrRI88gQF5QWXCXbZR8zfG36YLVhKkXbBzVnf9j2O9fIWYNuMT;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import gwqTCLjn1BrT8cotu6epPkwAbDkLhCvDVcHhWhgLKUAS8gR2kk22aaswPCzkQVwtoMgOkMiuOc6MWf1FSMdOTGi6qgKSO01XGzXFq7S62e.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr;
import jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.zfocMDrnJnbYtdsnKHCh6s;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import wYBCCsFMvDpu12Co18Mm0Qosb7ZQOHJBbNLI0.gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG;

public final /* synthetic */ class qCxWN2OV3De886WQoEJYLSnRJE1LFENCu64bJaehf9R1n6ytq0vnnSAUIU8rpX2tjFLYxB3VkEZaVUd3R5RAYtBleURTu5rUz5baMvzkJCw6JX4Sqfr5DZvWUPtqb2v04QpVc4FJVjnNDbPMVKs implements Runnable {
    public Object GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT;
    public long Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
    public Object uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8;
    public final /* synthetic */ int xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = 0;

    public /* synthetic */ qCxWN2OV3De886WQoEJYLSnRJE1LFENCu64bJaehf9R1n6ytq0vnnSAUIU8rpX2tjFLYxB3VkEZaVUd3R5RAYtBleURTu5rUz5baMvzkJCw6JX4Sqfr5DZvWUPtqb2v04QpVc4FJVjnNDbPMVKs() {
    }

    public boolean P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8).YmFIHVAy6MFnHbke10dLWI57IXCp.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean YmFIHVAy6MFnHbke10dLWI57IXCp() {
        try {
            if (((FirebaseMessaging) this.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8).P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            } else {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
        } catch (IOException e) {
            String message = e.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
                return false;
            } else if (e.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    public final void run() {
        switch (this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9) {
            case 0:
                mnT19oGaMgOr9vtDe8gf6TiLXS3yRUCQYINjypSJYwoQPpsOdbLi998m5Pxsf4MaLA2cC0JYRcBFYH8bbuHZZmy9Wcys5JSXcjUAB mnt19ogamgor9vtde8gf6tilxs3yrucqyinjypsjywoqppsodbli998m5pxsf4mala2cc0jyrcbfyh8bbuhzzmy9wcys5jsxcjuab = (mnT19oGaMgOr9vtDe8gf6TiLXS3yRUCQYINjypSJYwoQPpsOdbLi998m5Pxsf4MaLA2cC0JYRcBFYH8bbuHZZmy9Wcys5JSXcjUAB) this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT;
                if (TextUtils.isEmpty(((WA15WLgheoV9pT1dmVjJCJIVunNbOEW9WiQXpjS29LdGYcIw31VmhiSBUw69qFHhtsNzV5dKfHpeDKSkCURZcVVw1asNlDkCby79fKSuTBxAtsKpFY7tINknAkxqNVZoe) mnt19ogamgor9vtde8gf6tilxs3yrucqyinjypsjywoqppsodbli998m5pxsf4mala2cc0jyrcbfyh8bbuhzzmy9wcys5jsxcjuab.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9).ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96().oXXcFIamw7ZjKxPeGpdtwcq6GThLG())) {
                    mnt19ogamgor9vtde8gf6tilxs3yrucqyinjypsjywoqppsodbli998m5pxsf4mala2cc0jyrcbfyh8bbuhzzmy9wcys5jsxcjuab.rwFNtLQPwDHQdQINzTzTw3EtqALAHvztEZMKjjqp2tky27GOxN0Vb5EDFEkUYcSN7dWAkxHYxr7biB91ch0sszKj0pO0IXHHankzEJtN9OPnb8uzi1CdGjMM((Bundle) this.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8, 0, this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw);
                    return;
                } else {
                    mnt19ogamgor9vtde8gf6tilxs3yrucqyinjypsjywoqppsodbli998m5pxsf4mala2cc0jyrcbfyh8bbuhzzmy9wcys5jsxcjuab.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ().SrQ6hfFWIINpJR4mCe55NWTAYCYhDGEKDZDHCaWbSzBXvxJwM75yE0fDcMjDmamNvEyEF0ZpP6bSkAX50Cqw6.DrqQ8C7rtVRDTSclHGsDImq("Using developer consent only; google app id found");
                    return;
                }
            case 1:
                VQdmCBrxGVtL9Hz5UZF7RDNdde5nAjm8QHzVN8xDX1SCj6b1LL vQdmCBrxGVtL9Hz5UZF7RDNdde5nAjm8QHzVN8xDX1SCj6b1LL = (VQdmCBrxGVtL9Hz5UZF7RDNdde5nAjm8QHzVN8xDX1SCj6b1LL) this.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8;
                vQdmCBrxGVtL9Hz5UZF7RDNdde5nAjm8QHzVN8xDX1SCj6b1LL.Z6zkjisgtP978NC0DhZRz5ziFJjUpwIskJ7XiIo3WBRg27V3d7xuJ312iZtXVP8g9adhweHYGfBbqL1MltSMQUpYVtmgB4L58PyvqoEZwAIYrlLBAApPRNeNAAypcmetgiG((SWqmrJBqcFjmtBeXOxMAWvJpYmez7znYG0mTj9Ufm1GwvNT6h9ro7iBRP) this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT, false, this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw);
                vQdmCBrxGVtL9Hz5UZF7RDNdde5nAjm8QHzVN8xDX1SCj6b1LL.ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96 = null;
                MgdJLLEFkfjyhDIN9hvj5DDuQi2KuKpcRMocQnwKOwCzcOfprZZ6jMh0Oa5x20 yY0Yc5sPaZSYCL0bdTcevx7ABnXkQlKd3EpshlFldxtWb01ZPTjz2XoFnsZBK8oCDGLLaHFtrvKumkvfV0W = ((WA15WLgheoV9pT1dmVjJCJIVunNbOEW9WiQXpjS29LdGYcIw31VmhiSBUw69qFHhtsNzV5dKfHpeDKSkCURZcVVw1asNlDkCby79fKSuTBxAtsKpFY7tINknAkxqNVZoe) vQdmCBrxGVtL9Hz5UZF7RDNdde5nAjm8QHzVN8xDX1SCj6b1LL.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9).yY0Yc5sPaZSYCL0bdTcevx7ABnXkQlKd3EpshlFldxtWb01ZPTjz2XoFnsZBK8oCDGLLaHFtrvKumkvfV0W();
                yY0Yc5sPaZSYCL0bdTcevx7ABnXkQlKd3EpshlFldxtWb01ZPTjz2XoFnsZBK8oCDGLLaHFtrvKumkvfV0W.WRObhtynMBUtwAaVkhNgquvo2GoPRHnlAqDMCovAg7G3UDfXgJj98Mc2FI0();
                yY0Yc5sPaZSYCL0bdTcevx7ABnXkQlKd3EpshlFldxtWb01ZPTjz2XoFnsZBK8oCDGLLaHFtrvKumkvfV0W.fFqIsJKfHjBDwU79lNmK3Ur3NkuxOx54lFxdfXRKkDiym5pLfc7qhQUGLF1l4PgotAM7T52yuH();
                yY0Yc5sPaZSYCL0bdTcevx7ABnXkQlKd3EpshlFldxtWb01ZPTjz2XoFnsZBK8oCDGLLaHFtrvKumkvfV0W.rwFNtLQPwDHQdQINzTzTw3EtqALAHvztEZMKjjqp2tky27GOxN0Vb5EDFEkUYcSN7dWAkxHYxr7biB91ch0sszKj0pO0IXHHankzEJtN9OPnb8uzi1CdGjMM(new wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr(25, (Object) yY0Yc5sPaZSYCL0bdTcevx7ABnXkQlKd3EpshlFldxtWb01ZPTjz2XoFnsZBK8oCDGLLaHFtrvKumkvfV0W, (Object) null, false));
                return;
            default:
                gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG HcGgqmTrfEBzZy0CmDiIV3ZElJEuPtc3JIfGYgq465Eh = gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG.HcGgqmTrfEBzZy0CmDiIV3ZElJEuPtc3JIfGYgq465Eh();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8;
                boolean qk6QoGpJ7mUVRHlBbEKbscA2uzM6o8hlNA4O9PJXfYl0gWws0Zlal = HcGgqmTrfEBzZy0CmDiIV3ZElJEuPtc3JIfGYgq465Eh.qk6QoGpJ7mUVRHlBbEKbscA2uzM6o8hlNA4O9PJXfYl0gWws0Zlal(firebaseMessaging.YmFIHVAy6MFnHbke10dLWI57IXCp);
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT;
                if (qk6QoGpJ7mUVRHlBbEKbscA2uzM6o8hlNA4O9PJXfYl0gWws0Zlal) {
                    wakeLock.acquire();
                }
                try {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X = true;
                    }
                    if (!firebaseMessaging.peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU()) {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X = false;
                        }
                        if (!gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG.HcGgqmTrfEBzZy0CmDiIV3ZElJEuPtc3JIfGYgq465Eh().qk6QoGpJ7mUVRHlBbEKbscA2uzM6o8hlNA4O9PJXfYl0gWws0Zlal(firebaseMessaging.YmFIHVAy6MFnHbke10dLWI57IXCp)) {
                            return;
                        }
                        wakeLock.release();
                        return;
                    } else if (!gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG.HcGgqmTrfEBzZy0CmDiIV3ZElJEuPtc3JIfGYgq465Eh().pzvYQirEyA45Ce30WTTeaG1l7TyqO0vvPbc3rH3Rn8bv5Kz2L9tGc4iFmGrnJaQ29FUQ0yHQYOQm5498Nr(firebaseMessaging.YmFIHVAy6MFnHbke10dLWI57IXCp) || P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d()) {
                        if (YmFIHVAy6MFnHbke10dLWI57IXCp()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X = false;
                            }
                        } else {
                            firebaseMessaging.uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn(this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw);
                        }
                        if (!gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG.HcGgqmTrfEBzZy0CmDiIV3ZElJEuPtc3JIfGYgq465Eh().qk6QoGpJ7mUVRHlBbEKbscA2uzM6o8hlNA4O9PJXfYl0gWws0Zlal(firebaseMessaging.YmFIHVAy6MFnHbke10dLWI57IXCp)) {
                            return;
                        }
                        wakeLock.release();
                        return;
                    } else {
                        sSHt2cgWVlGG7tF8g0c8FxCFcKtdgbADgmBm2ZaqcXsor768RsNuVhty5CBrNY7LuWPAk9whPzd ssht2cgwvlgg7tf8g0c8fxcfcktdgbadgmbm2zaqcxsor768rsnuvhty5cbrny7luwpak9whpzd = new sSHt2cgWVlGG7tF8g0c8FxCFcKtdgbADgmBm2ZaqcXsor768RsNuVhty5CBrNY7LuWPAk9whPzd();
                        ssht2cgwvlgg7tf8g0c8fxcfcktdgbadgmbm2zaqcxsor768rsnuvhty5cbrny7luwpak9whpzd.YmFIHVAy6MFnHbke10dLWI57IXCp = this;
                        ssht2cgwvlgg7tf8g0c8fxcfcktdgbadgmbm2zaqcxsor768rsnuvhty5cbrny7luwpak9whpzd.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d();
                        if (!gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG.HcGgqmTrfEBzZy0CmDiIV3ZElJEuPtc3JIfGYgq465Eh().qk6QoGpJ7mUVRHlBbEKbscA2uzM6o8hlNA4O9PJXfYl0gWws0Zlal(firebaseMessaging.YmFIHVAy6MFnHbke10dLWI57IXCp)) {
                            return;
                        }
                        wakeLock.release();
                        return;
                    }
                } catch (IOException e) {
                    try {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X = false;
                            if (!gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG.HcGgqmTrfEBzZy0CmDiIV3ZElJEuPtc3JIfGYgq465Eh().qk6QoGpJ7mUVRHlBbEKbscA2uzM6o8hlNA4O9PJXfYl0gWws0Zlal(firebaseMessaging.YmFIHVAy6MFnHbke10dLWI57IXCp)) {
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        if (gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG.HcGgqmTrfEBzZy0CmDiIV3ZElJEuPtc3JIfGYgq465Eh().qk6QoGpJ7mUVRHlBbEKbscA2uzM6o8hlNA4O9PJXfYl0gWws0Zlal(firebaseMessaging.YmFIHVAy6MFnHbke10dLWI57IXCp)) {
                            wakeLock.release();
                        }
                        throw th;
                    }
                }
                break;
        }
    }

    public qCxWN2OV3De886WQoEJYLSnRJE1LFENCu64bJaehf9R1n6ytq0vnnSAUIU8rpX2tjFLYxB3VkEZaVUd3R5RAYtBleURTu5rUz5baMvzkJCw6JX4Sqfr5DZvWUPtqb2v04QpVc4FJVjnNDbPMVKs(VQdmCBrxGVtL9Hz5UZF7RDNdde5nAjm8QHzVN8xDX1SCj6b1LL vQdmCBrxGVtL9Hz5UZF7RDNdde5nAjm8QHzVN8xDX1SCj6b1LL, SWqmrJBqcFjmtBeXOxMAWvJpYmez7znYG0mTj9Ufm1GwvNT6h9ro7iBRP sWqmrJBqcFjmtBeXOxMAWvJpYmez7znYG0mTj9Ufm1GwvNT6h9ro7iBRP, long j) {
        this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT = sWqmrJBqcFjmtBeXOxMAWvJpYmez7znYG0mTj9Ufm1GwvNT6h9ro7iBRP;
        this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw = j;
        this.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8 = vQdmCBrxGVtL9Hz5UZF7RDNdde5nAjm8QHzVN8xDX1SCj6b1LL;
    }

    public qCxWN2OV3De886WQoEJYLSnRJE1LFENCu64bJaehf9R1n6ytq0vnnSAUIU8rpX2tjFLYxB3VkEZaVUd3R5RAYtBleURTu5rUz5baMvzkJCw6JX4Sqfr5DZvWUPtqb2v04QpVc4FJVjnNDbPMVKs(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zfocMDrnJnbYtdsnKHCh6s("firebase-iid-executor"));
        this.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8 = firebaseMessaging;
        this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.YmFIHVAy6MFnHbke10dLWI57IXCp.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }
}
