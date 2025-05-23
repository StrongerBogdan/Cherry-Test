package com.google.firebase.messaging;

import YiQ1vlMrguP1eedEzNOgRt567pcdSUtmArJluxMufc3qx.LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA;
import java.util.ArrayDeque;
import wYBCCsFMvDpu12Co18Mm0Qosb7ZQOHJBbNLI0.MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s;

public class FirebaseMessagingService extends MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s {
    public static final ArrayDeque NcFY6nnnD3zDVXsC1ujUmiLNn3XFBORW4CQPT3JG0ipXsN = new ArrayDeque(10);
    public LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG;

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void YmFIHVAy6MFnHbke10dLWI57IXCp(android.content.Intent r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 3
            r2 = 0
            java.lang.String r3 = r11.getAction()
            java.lang.String r4 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "FirebaseMessaging"
            if (r4 != 0) goto L_0x0040
            java.lang.String r4 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x001a
            goto L_0x0040
        L_0x001a:
            java.lang.String r0 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = "token"
            r11.getStringExtra(r0)
            goto L_0x01ac
        L_0x0029:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown intent action: "
            r0.<init>(r1)
            java.lang.String r11 = r11.getAction()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            android.util.Log.d(r5, r11)
            goto L_0x01ac
        L_0x0040:
            java.lang.String r3 = "google.message_id"
            java.lang.String r4 = r11.getStringExtra(r3)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r7 = "message_id"
            if (r6 == 0) goto L_0x004f
            goto L_0x007e
        L_0x004f:
            java.util.ArrayDeque r6 = NcFY6nnnD3zDVXsC1ujUmiLNn3XFBORW4CQPT3JG0ipXsN
            boolean r8 = r6.contains(r4)
            if (r8 == 0) goto L_0x0070
            boolean r6 = android.util.Log.isLoggable(r5, r1)
            if (r6 == 0) goto L_0x0140
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Received duplicate message: "
            r6.<init>(r8)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.util.Log.d(r5, r4)
            goto L_0x0140
        L_0x0070:
            int r8 = r6.size()
            r9 = 10
            if (r8 < r9) goto L_0x007b
            r6.remove()
        L_0x007b:
            r6.add(r4)
        L_0x007e:
            java.lang.String r4 = "message_type"
            java.lang.String r4 = r11.getStringExtra(r4)
            if (r4 != 0) goto L_0x0088
            java.lang.String r4 = "gcm"
        L_0x0088:
            r6 = -1
            int r8 = r4.hashCode()
            switch(r8) {
                case -2062414158: goto L_0x00b2;
                case 102161: goto L_0x00a7;
                case 814694033: goto L_0x009c;
                case 814800675: goto L_0x0091;
                default: goto L_0x0090;
            }
        L_0x0090:
            goto L_0x00bc
        L_0x0091:
            java.lang.String r8 = "send_event"
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L_0x009a
            goto L_0x00bc
        L_0x009a:
            r6 = r1
            goto L_0x00bc
        L_0x009c:
            java.lang.String r8 = "send_error"
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L_0x00a5
            goto L_0x00bc
        L_0x00a5:
            r6 = 2
            goto L_0x00bc
        L_0x00a7:
            java.lang.String r8 = "gcm"
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L_0x00b0
            goto L_0x00bc
        L_0x00b0:
            r6 = r0
            goto L_0x00bc
        L_0x00b2:
            java.lang.String r8 = "deleted_messages"
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L_0x00bb
            goto L_0x00bc
        L_0x00bb:
            r6 = r2
        L_0x00bc:
            switch(r6) {
                case 0: goto L_0x0140;
                case 1: goto L_0x00f0;
                case 2: goto L_0x00cf;
                case 3: goto L_0x00ca;
                default: goto L_0x00bf;
            }
        L_0x00bf:
            java.lang.String r6 = "Received message with unknown type: "
            java.lang.String r4 = r6.concat(r4)
            android.util.Log.w(r5, r4)
            goto L_0x0140
        L_0x00ca:
            r11.getStringExtra(r3)
            goto L_0x0140
        L_0x00cf:
            java.lang.String r4 = r11.getStringExtra(r3)
            if (r4 != 0) goto L_0x00d8
            r11.getStringExtra(r7)
        L_0x00d8:
            TVAwSaVV4j6bAz1hm1STzPDgb2QgdRQz2BNyCAOFzKcdn71IwUyjsf7ILVJ3Yop7l33jKLA9GzYKpGuV7aRpCIFOdiOxL0hmOHHDUUQNMG6uspTCp.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr r4 = new TVAwSaVV4j6bAz1hm1STzPDgb2QgdRQz2BNyCAOFzKcdn71IwUyjsf7ILVJ3Yop7l33jKLA9GzYKpGuV7aRpCIFOdiOxL0hmOHHDUUQNMG6uspTCp.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr
            java.lang.String r5 = "error"
            java.lang.String r5 = r11.getStringExtra(r5)
            r4.<init>(r5)
            if (r5 != 0) goto L_0x00e6
            goto L_0x0140
        L_0x00e6:
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r4 = r5.toLowerCase(r4)
            r4.getClass()
            goto L_0x0140
        L_0x00f0:
            yeQgNBzuxw2ebu2Wi0w7CWOQuWbdiUQk5tfB.aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX.pzvYQirEyA45Ce30WTTeaG1l7TyqO0vvPbc3rH3Rn8bv5Kz2L9tGc4iFmGrnJaQ29FUQ0yHQYOQm5498Nr(r11)
            android.os.Bundle r4 = r11.getExtras()
            if (r4 != 0) goto L_0x00fe
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
        L_0x00fe:
            java.lang.String r5 = "androidx.content.wakelockid"
            r4.remove(r5)
            boolean r5 = StjY3vFV4grGYga81CvWBmJLFXPWSK3QCrZPevLnTimJEhEK1h2inZ8vZi2fxCtLhFbUDnRrvCU2kR2zemafxZHKieEMArrOjUYEfAnNu.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn(r4)
            if (r5 == 0) goto L_0x0140
            StjY3vFV4grGYga81CvWBmJLFXPWSK3QCrZPevLnTimJEhEK1h2inZ8vZi2fxCtLhFbUDnRrvCU2kR2zemafxZHKieEMArrOjUYEfAnNu.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr r5 = new StjY3vFV4grGYga81CvWBmJLFXPWSK3QCrZPevLnTimJEhEK1h2inZ8vZi2fxCtLhFbUDnRrvCU2kR2zemafxZHKieEMArrOjUYEfAnNu.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr
            r5.<init>((android.os.Bundle) r4)
            jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.zfocMDrnJnbYtdsnKHCh6s r4 = new jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd.zfocMDrnJnbYtdsnKHCh6s
            java.lang.String r6 = "Firebase-Messaging-Network-Io"
            r4.<init>(r6)
            java.util.concurrent.ExecutorService r4 = java.util.concurrent.Executors.newSingleThreadExecutor(r4)
            irAD5LTjjVqQTztyMMOtzSalE6liKMF8h5orMAMmxgnQZpeAxnpbzDL0RGXfI.LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA r6 = new irAD5LTjjVqQTztyMMOtzSalE6liKMF8h5orMAMmxgnQZpeAxnpbzDL0RGXfI.LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA
            r6.<init>((com.google.firebase.messaging.FirebaseMessagingService) r10, (StjY3vFV4grGYga81CvWBmJLFXPWSK3QCrZPevLnTimJEhEK1h2inZ8vZi2fxCtLhFbUDnRrvCU2kR2zemafxZHKieEMArrOjUYEfAnNu.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr) r5, (java.util.concurrent.ExecutorService) r4)
            boolean r5 = r6.NcFY6nnnD3zDVXsC1ujUmiLNn3XFBORW4CQPT3JG0ipXsN()     // Catch:{ all -> 0x013b }
            if (r5 == 0) goto L_0x0128
            r4.shutdown()
            goto L_0x0140
        L_0x0128:
            r4.shutdown()
            boolean r4 = yeQgNBzuxw2ebu2Wi0w7CWOQuWbdiUQk5tfB.aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX.RjT0U5i946Gybz6DXccidXljfUHnYkuWeyP3IoANcwRRnisDLisitu9aT8ZN8kJ6AFZM2aqfCAaFXiKjGToldgfVSS3oT(r11)
            if (r4 == 0) goto L_0x0140
            java.lang.String r4 = "_nf"
            android.os.Bundle r5 = r11.getExtras()
            yeQgNBzuxw2ebu2Wi0w7CWOQuWbdiUQk5tfB.aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX.qk6QoGpJ7mUVRHlBbEKbscA2uzM6o8hlNA4O9PJXfYl0gWws0Zlal(r4, r5)
            goto L_0x0140
        L_0x013b:
            r11 = move-exception
            r4.shutdown()
            throw r11
        L_0x0140:
            YiQ1vlMrguP1eedEzNOgRt567pcdSUtmArJluxMufc3qx.LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA r4 = r10.qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG
            if (r4 != 0) goto L_0x014f
            YiQ1vlMrguP1eedEzNOgRt567pcdSUtmArJluxMufc3qx.LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA r4 = new YiQ1vlMrguP1eedEzNOgRt567pcdSUtmArJluxMufc3qx.LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA
            android.content.Context r5 = r10.getApplicationContext()
            r4.<init>(r5)
            r10.qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG = r4
        L_0x014f:
            YiQ1vlMrguP1eedEzNOgRt567pcdSUtmArJluxMufc3qx.LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA r4 = r10.qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG
            FR5EjxHMlnhgT4g3Cx4ZlPTPTuR7VSyr9dS4OVpMDfBHg2BGe3HbA1bXzNKGQKMp0i40dVoHiWcnjoEpq4vvipBd2.LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA r5 = r4.DrqQ8C7rtVRDTSclHGsDImq
            int r5 = r5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU()
            r6 = 233700000(0xdedfaa0, float:1.46665885E-30)
            if (r5 < r6) goto L_0x01a2
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = r11.getStringExtra(r3)
            if (r6 != 0) goto L_0x016b
            java.lang.String r6 = r11.getStringExtra(r7)
        L_0x016b:
            r5.putString(r3, r6)
            java.lang.String r3 = "google.product_id"
            boolean r6 = r11.hasExtra(r3)
            if (r6 == 0) goto L_0x017f
            int r11 = r11.getIntExtra(r3, r2)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x0180
        L_0x017f:
            r11 = 0
        L_0x0180:
            if (r11 == 0) goto L_0x0189
            int r11 = r11.intValue()
            r5.putInt(r3, r11)
        L_0x0189:
            android.content.Context r11 = r4.YmFIHVAy6MFnHbke10dLWI57IXCp
            YiQ1vlMrguP1eedEzNOgRt567pcdSUtmArJluxMufc3qx.tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 r11 = YiQ1vlMrguP1eedEzNOgRt567pcdSUtmArJluxMufc3qx.tygdzrfuG3bl1r2ouET5CaGhmt4ugo8.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT(r11)
            YiQ1vlMrguP1eedEzNOgRt567pcdSUtmArJluxMufc3qx.M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh r3 = new YiQ1vlMrguP1eedEzNOgRt567pcdSUtmArJluxMufc3qx.M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh
            monitor-enter(r11)
            int r4 = r11.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9     // Catch:{ all -> 0x019f }
            int r0 = r0 + r4
            r11.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = r0     // Catch:{ all -> 0x019f }
            monitor-exit(r11)
            r3.<init>(r4, r1, r5, r2)
            r11.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8(r3)
            goto L_0x01ac
        L_0x019f:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x019f }
            throw r0
        L_0x01a2:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r0 = "SERVICE_NOT_AVAILABLE"
            r11.<init>(r0)
            AjYBco8xr2us6yeB7hBfc4h55fWfnKyo5q0znUQ1YCmacP7oOhTEy71g8WGbaDsVMvDpiueebl1lpkzIrJQRwo9n2Ob4hlCiTFPK7jDNsE4pcXFpClIXBjhJU.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.yY0Yc5sPaZSYCL0bdTcevx7ABnXkQlKd3EpshlFldxtWb01ZPTjz2XoFnsZBK8oCDGLLaHFtrvKumkvfV0W(r11)
        L_0x01ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.YmFIHVAy6MFnHbke10dLWI57IXCp(android.content.Intent):void");
    }
}
