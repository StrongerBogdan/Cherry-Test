package gRiOOrmha00ezoJwziMctLZ;

public final class wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr extends Thread {
    public final /* synthetic */ int xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = 0;

    public /* synthetic */ wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr(Runnable runnable) {
        super(runnable);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:12|13|14|15|(4:17|18|19|20)(2:21|(2:23|32)(1:31))|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0033, code lost:
        r0.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0036, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0015 A[LOOP:1: B:12:0x0015->B:29:0x0015, LOOP_START, SYNTHETIC, Splitter:B:12:0x0015] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            int r0 = r3.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9
            switch(r0) {
                case 0: goto L_0x0037;
                case 1: goto L_0x0015;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 19
            android.os.Process.setThreadPriority(r0)
            monitor-enter(r3)
        L_0x000b:
            r3.wait()     // Catch:{ InterruptedException -> 0x0011 }
            goto L_0x000b
        L_0x000f:
            r0 = move-exception
            goto L_0x0013
        L_0x0011:
            monitor-exit(r3)     // Catch:{ all -> 0x000f }
            return
        L_0x0013:
            monitor-exit(r3)     // Catch:{ all -> 0x000f }
            throw r0
        L_0x0015:
            java.util.concurrent.locks.ReentrantLock r0 = itI8obOTylimgh3aFvoSDqxOrGmvxvdJfI7MUZgbrVtQIiipeJOt6Lauz2sHzaWHJ0JwIfHxzJeuRWCE5L1eT294M0.aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX.peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6     // Catch:{ InterruptedException -> 0x0015 }
            r0.lock()     // Catch:{ InterruptedException -> 0x0015 }
            itI8obOTylimgh3aFvoSDqxOrGmvxvdJfI7MUZgbrVtQIiipeJOt6Lauz2sHzaWHJ0JwIfHxzJeuRWCE5L1eT294M0.aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX r1 = itI8obOTylimgh3aFvoSDqxOrGmvxvdJfI7MUZgbrVtQIiipeJOt6Lauz2sHzaWHJ0JwIfHxzJeuRWCE5L1eT294M0.LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA.YmFIHVAy6MFnHbke10dLWI57IXCp()     // Catch:{ all -> 0x0032 }
            itI8obOTylimgh3aFvoSDqxOrGmvxvdJfI7MUZgbrVtQIiipeJOt6Lauz2sHzaWHJ0JwIfHxzJeuRWCE5L1eT294M0.aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX r2 = itI8obOTylimgh3aFvoSDqxOrGmvxvdJfI7MUZgbrVtQIiipeJOt6Lauz2sHzaWHJ0JwIfHxzJeuRWCE5L1eT294M0.aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9     // Catch:{ all -> 0x0032 }
            if (r1 != r2) goto L_0x0029
            r1 = 0
            itI8obOTylimgh3aFvoSDqxOrGmvxvdJfI7MUZgbrVtQIiipeJOt6Lauz2sHzaWHJ0JwIfHxzJeuRWCE5L1eT294M0.aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = r1     // Catch:{ all -> 0x0032 }
            r0.unlock()     // Catch:{ InterruptedException -> 0x0015 }
            return
        L_0x0029:
            r0.unlock()     // Catch:{ InterruptedException -> 0x0015 }
            if (r1 == 0) goto L_0x0015
            r1.BrinjKkMNX0Ww9FldCotLl2()     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x0015
        L_0x0032:
            r1 = move-exception
            r0.unlock()     // Catch:{ InterruptedException -> 0x0015 }
            throw r1     // Catch:{ InterruptedException -> 0x0015 }
        L_0x0037:
            r0 = 9
            android.os.Process.setThreadPriority(r0)
            super.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gRiOOrmha00ezoJwziMctLZ.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.run():void");
    }

    public /* synthetic */ wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr(String str) {
        super(str);
    }

    public /* synthetic */ wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
