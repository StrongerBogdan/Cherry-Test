package io.ktor.utils.io;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kEoBhu4WVmUn9re08c6rLWS0tJV13RSJvMx5LCey4qaBYQi506rUKVXo8JgCj8hKq9tXtBDkKSDjELr8sOJx17ksFYlgHZ7ZtU8WMQz.D8GgZbzcKj5rilKnkj8e7mJ1giKXr7PVzF6Rm3iAMV12GPJFjJsP85ro8B5TqnDd3HSKa30yTfOnQUxiSzoUz76iRkaUnM8auyBFxe5kbLQOgcMjtAdyoJ8gOPES2QZYZSBpUK6Mt0I5HQrX8aYczk;
import wQHIhZJqxGpxVvC40dPLgAjr2Ens6.Hfv852lbufjqS9YvuotOQGMlAwbT93xAB7vm4I08c6qrPUQoF33xZ7tgcFr07lRFO0AjYBoYHfH7ytkOI;
import wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5;
import yeQgNBzuxw2ebu2Wi0w7CWOQuWbdiUQk5tfB.aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX;

public abstract class ivQeO4ds3AzMpcwdFgIxEkbF7HY5gW00DxiVZ17i8v6rvihjoQqVYGLPAIExy5KvIXHLnlK4MidLXOlZaod51FPBoffarUoAzUEp85WgjVEiTVDF6GNATC4L7XMB2wUR2nPosKIgnHxzr {
    public static final WeakHashMap DrqQ8C7rtVRDTSclHGsDImq = new WeakHashMap();
    public static final int P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(-1, Throwable.class);
    public static final ReentrantReadWriteLock YmFIHVAy6MFnHbke10dLWI57IXCp = new ReentrantReadWriteLock();

    public static final int P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(int i, Class cls) {
        Object obj;
        Hfv852lbufjqS9YvuotOQGMlAwbT93xAB7vm4I08c6qrPUQoF33xZ7tgcFr07lRFO0AjYBoYHfH7ytkOI.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(cls);
        int i2 = 0;
        do {
            try {
                Field[] declaredFields = cls.getDeclaredFields();
                LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(declaredFields, "declaredFields");
                int i3 = 0;
                for (Field modifiers : declaredFields) {
                    if (!Modifier.isStatic(modifiers.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                obj = aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX.yY0Yc5sPaZSYCL0bdTcevx7ABnXkQlKd3EpshlFldxtWb01ZPTjz2XoFnsZBK8oCDGLLaHFtrvKumkvfV0W(th);
            }
        } while (cls != null);
        obj = Integer.valueOf(i2);
        Object valueOf = Integer.valueOf(i);
        if (obj instanceof D8GgZbzcKj5rilKnkj8e7mJ1giKXr7PVzF6Rm3iAMV12GPJFjJsP85ro8B5TqnDd3HSKa30yTfOnQUxiSzoUz76iRkaUnM8auyBFxe5kbLQOgcMjtAdyoJ8gOPES2QZYZSBpUK6Mt0I5HQrX8aYczk) {
            obj = valueOf;
        }
        return ((Number) obj).intValue();
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static final java.lang.Throwable YmFIHVAy6MFnHbke10dLWI57IXCp(java.lang.Throwable r12, java.lang.Throwable r13) {
        /*
            java.lang.String r0 = "exception"
            wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(r12, r0)
            java.lang.String r0 = "cause"
            wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(r13, r0)
            boolean r0 = r12 instanceof jdxzDmFMbg07IjI7PcEPkz1VanpkwzwtfbCexn664xTLWcPT19DMVQM8hDZEAhKtK8Ty4LKyafeJAl8bLKf.EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH
            r1 = 0
            if (r0 == 0) goto L_0x0024
            jdxzDmFMbg07IjI7PcEPkz1VanpkwzwtfbCexn664xTLWcPT19DMVQM8hDZEAhKtK8Ty4LKyafeJAl8bLKf.EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH r12 = (jdxzDmFMbg07IjI7PcEPkz1VanpkwzwtfbCexn664xTLWcPT19DMVQM8hDZEAhKtK8Ty4LKyafeJAl8bLKf.EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH) r12     // Catch:{ all -> 0x0016 }
            java.lang.Throwable r12 = r12.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d()     // Catch:{ all -> 0x0016 }
            goto L_0x001b
        L_0x0016:
            r12 = move-exception
            kEoBhu4WVmUn9re08c6rLWS0tJV13RSJvMx5LCey4qaBYQi506rUKVXo8JgCj8hKq9tXtBDkKSDjELr8sOJx17ksFYlgHZ7ZtU8WMQz.D8GgZbzcKj5rilKnkj8e7mJ1giKXr7PVzF6Rm3iAMV12GPJFjJsP85ro8B5TqnDd3HSKa30yTfOnQUxiSzoUz76iRkaUnM8auyBFxe5kbLQOgcMjtAdyoJ8gOPES2QZYZSBpUK6Mt0I5HQrX8aYczk r12 = yeQgNBzuxw2ebu2Wi0w7CWOQuWbdiUQk5tfB.aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX.yY0Yc5sPaZSYCL0bdTcevx7ABnXkQlKd3EpshlFldxtWb01ZPTjz2XoFnsZBK8oCDGLLaHFtrvKumkvfV0W(r12)
        L_0x001b:
            boolean r13 = r12 instanceof kEoBhu4WVmUn9re08c6rLWS0tJV13RSJvMx5LCey4qaBYQi506rUKVXo8JgCj8hKq9tXtBDkKSDjELr8sOJx17ksFYlgHZ7ZtU8WMQz.D8GgZbzcKj5rilKnkj8e7mJ1giKXr7PVzF6Rm3iAMV12GPJFjJsP85ro8B5TqnDd3HSKa30yTfOnQUxiSzoUz76iRkaUnM8auyBFxe5kbLQOgcMjtAdyoJ8gOPES2QZYZSBpUK6Mt0I5HQrX8aYczk
            if (r13 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r1 = r12
        L_0x0021:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            return r1
        L_0x0024:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = YmFIHVAy6MFnHbke10dLWI57IXCp
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            r2.lock()
            java.util.WeakHashMap r3 = DrqQ8C7rtVRDTSclHGsDImq
            java.lang.Class r4 = r12.getClass()     // Catch:{ all -> 0x0175 }
            java.lang.Object r4 = r3.get(r4)     // Catch:{ all -> 0x0175 }
            BfOJyZqKageCXvQ662yV4N4haMDzZchZjZJtJRHdUgXuZbihJRgnAUWAneMEWBv5d4IhRxvYQfkKIljMVFDCwca8XfoJWHvdNB4zvZT5jGunB5Ub2oTmbkzk1ZBN32YhXavKS.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK r4 = (BfOJyZqKageCXvQ662yV4N4haMDzZchZjZJtJRHdUgXuZbihJRgnAUWAneMEWBv5d4IhRxvYQfkKIljMVFDCwca8XfoJWHvdNB4zvZT5jGunB5Ub2oTmbkzk1ZBN32YhXavKS.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK) r4     // Catch:{ all -> 0x0175 }
            r2.unlock()
            if (r4 == 0) goto L_0x0045
            java.lang.Object r12 = r4.invoke(r12)
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            return r12
        L_0x0045:
            java.lang.Class r2 = r12.getClass()
            r4 = 0
            int r2 = P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(r4, r2)
            int r5 = P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d
            if (r5 == r2) goto L_0x0094
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r13 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            if (r2 != 0) goto L_0x0061
            int r2 = r0.getReadHoldCount()
            goto L_0x0062
        L_0x0061:
            r2 = r4
        L_0x0062:
            r5 = r4
        L_0x0063:
            if (r5 >= r2) goto L_0x006b
            r13.unlock()
            int r5 = r5 + 1
            goto L_0x0063
        L_0x006b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.lang.Class r12 = r12.getClass()     // Catch:{ all -> 0x0087 }
            io.ktor.utils.io.Woxkfd2QILsoDtnr3UH45ujk2A6Cy5L4dZrAA8Gc5VM0y65T1 r5 = io.ktor.utils.io.Woxkfd2QILsoDtnr3UH45ujk2A6Cy5L4dZrAA8Gc5VM0y65T1.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw     // Catch:{ all -> 0x0087 }
            r3.put(r12, r5)     // Catch:{ all -> 0x0087 }
        L_0x007b:
            if (r4 >= r2) goto L_0x0083
            r13.lock()
            int r4 = r4 + 1
            goto L_0x007b
        L_0x0083:
            r0.unlock()
            return r1
        L_0x0087:
            r12 = move-exception
        L_0x0088:
            if (r4 >= r2) goto L_0x0090
            r13.lock()
            int r4 = r4 + 1
            goto L_0x0088
        L_0x0090:
            r0.unlock()
            throw r12
        L_0x0094:
            java.lang.Class r2 = r12.getClass()
            java.lang.reflect.Constructor[] r2 = r2.getConstructors()
            java.lang.String r5 = "exception.javaClass.constructors"
            wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(r2, r5)
            AZ01SxCf0B60y1M5JcdvY2LdMPhsmEUx3lMBD4A1LIJE6LpAGXIh5Lji1eoLiP7er9b4QVfWrJ62U53RkWkcOoFBJSboz4BAVAu1j5qpVLFgmgeIFGg.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5 r5 = new AZ01SxCf0B60y1M5JcdvY2LdMPhsmEUx3lMBD4A1LIJE6LpAGXIh5Lji1eoLiP7er9b4QVfWrJ62U53RkWkcOoFBJSboz4BAVAu1j5qpVLFgmgeIFGg.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5
            r6 = 5
            r5.<init>(r6)
            int r6 = r2.length
            r7 = 1
            if (r6 != 0) goto L_0x00ac
            goto L_0x00bc
        L_0x00ac:
            int r6 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)
            java.lang.String r6 = "copyOf(...)"
            wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(r2, r6)
            int r6 = r2.length
            if (r6 <= r7) goto L_0x00bc
            java.util.Arrays.sort(r2, r5)
        L_0x00bc:
            java.util.List r2 = fNBbXJeSM2O6ieyfI1rEx2tJ5bx6XDy9P8rm9KMo193X7h2KrNTxq8NUUJAyzFs7qbjwLzqOfrBbzLO1N6YYtBzJkGNgaoNP0n4EIAuOXxJp2bew5avyC92k3zMilfdBqOgMMk.D8GgZbzcKj5rilKnkj8e7mJ1giKXr7PVzF6Rm3iAMV12GPJFjJsP85ro8B5TqnDd3HSKa30yTfOnQUxiSzoUz76iRkaUnM8auyBFxe5kbLQOgcMjtAdyoJ8gOPES2QZYZSBpUK6Mt0I5HQrX8aYczk.clrwhPukEsfrq9j9C16o0r9kuYd3V(r2)
            java.util.Iterator r2 = r2.iterator()
            r5 = r1
        L_0x00c5:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0125
            java.lang.Object r5 = r2.next()
            java.lang.reflect.Constructor r5 = (java.lang.reflect.Constructor) r5
            java.lang.String r6 = "constructor"
            wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(r5, r6)
            java.lang.Class[] r6 = r5.getParameterTypes()
            int r8 = r6.length
            if (r8 == 0) goto L_0x011c
            java.lang.Class<java.lang.Throwable> r9 = java.lang.Throwable.class
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            if (r8 == r7) goto L_0x0100
            r11 = 2
            if (r8 == r11) goto L_0x00e8
        L_0x00e6:
            r5 = r1
            goto L_0x0123
        L_0x00e8:
            r8 = r6[r4]
            boolean r8 = wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(r8, r10)
            if (r8 == 0) goto L_0x00e6
            r6 = r6[r7]
            boolean r6 = wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(r6, r9)
            if (r6 == 0) goto L_0x00e6
            io.ktor.utils.io.XIoAX8Ngr0eP0FzlPvsQCr8abQeqBh68H5a4qv9M r6 = new io.ktor.utils.io.XIoAX8Ngr0eP0FzlPvsQCr8abQeqBh68H5a4qv9M
            r8 = 0
            r6.<init>(r5, r8)
        L_0x00fe:
            r5 = r6
            goto L_0x0123
        L_0x0100:
            r6 = r6[r4]
            boolean r8 = wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(r6, r9)
            if (r8 == 0) goto L_0x010f
            io.ktor.utils.io.XIoAX8Ngr0eP0FzlPvsQCr8abQeqBh68H5a4qv9M r6 = new io.ktor.utils.io.XIoAX8Ngr0eP0FzlPvsQCr8abQeqBh68H5a4qv9M
            r8 = 1
            r6.<init>(r5, r8)
            goto L_0x00fe
        L_0x010f:
            boolean r6 = wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(r6, r10)
            if (r6 == 0) goto L_0x00e6
            io.ktor.utils.io.XIoAX8Ngr0eP0FzlPvsQCr8abQeqBh68H5a4qv9M r6 = new io.ktor.utils.io.XIoAX8Ngr0eP0FzlPvsQCr8abQeqBh68H5a4qv9M
            r8 = 2
            r6.<init>(r5, r8)
            goto L_0x00fe
        L_0x011c:
            io.ktor.utils.io.XIoAX8Ngr0eP0FzlPvsQCr8abQeqBh68H5a4qv9M r6 = new io.ktor.utils.io.XIoAX8Ngr0eP0FzlPvsQCr8abQeqBh68H5a4qv9M
            r8 = 3
            r6.<init>(r5, r8)
            goto L_0x00fe
        L_0x0123:
            if (r5 == 0) goto L_0x00c5
        L_0x0125:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            int r6 = r0.getWriteHoldCount()
            if (r6 != 0) goto L_0x0134
            int r6 = r0.getReadHoldCount()
            goto L_0x0135
        L_0x0134:
            r6 = r4
        L_0x0135:
            r7 = r4
        L_0x0136:
            if (r7 >= r6) goto L_0x013e
            r2.unlock()
            int r7 = r7 + 1
            goto L_0x0136
        L_0x013e:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.lang.Class r12 = r12.getClass()     // Catch:{ all -> 0x014e }
            if (r5 != 0) goto L_0x0150
            io.ktor.utils.io.Woxkfd2QILsoDtnr3UH45ujk2A6Cy5L4dZrAA8Gc5VM0y65T1 r7 = io.ktor.utils.io.Woxkfd2QILsoDtnr3UH45ujk2A6Cy5L4dZrAA8Gc5VM0y65T1.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT     // Catch:{ all -> 0x014e }
            goto L_0x0151
        L_0x014e:
            r12 = move-exception
            goto L_0x0169
        L_0x0150:
            r7 = r5
        L_0x0151:
            r3.put(r12, r7)     // Catch:{ all -> 0x014e }
        L_0x0154:
            if (r4 >= r6) goto L_0x015c
            r2.lock()
            int r4 = r4 + 1
            goto L_0x0154
        L_0x015c:
            r0.unlock()
            if (r5 == 0) goto L_0x0168
            java.lang.Object r12 = r5.invoke(r13)
            r1 = r12
            java.lang.Throwable r1 = (java.lang.Throwable) r1
        L_0x0168:
            return r1
        L_0x0169:
            if (r4 >= r6) goto L_0x0171
            r2.lock()
            int r4 = r4 + 1
            goto L_0x0169
        L_0x0171:
            r0.unlock()
            throw r12
        L_0x0175:
            r12 = move-exception
            r2.unlock()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ivQeO4ds3AzMpcwdFgIxEkbF7HY5gW00DxiVZ17i8v6rvihjoQqVYGLPAIExy5KvIXHLnlK4MidLXOlZaod51FPBoffarUoAzUEp85WgjVEiTVDF6GNATC4L7XMB2wUR2nPosKIgnHxzr.YmFIHVAy6MFnHbke10dLWI57IXCp(java.lang.Throwable, java.lang.Throwable):java.lang.Throwable");
    }
}
