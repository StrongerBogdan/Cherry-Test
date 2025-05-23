package jUm0oATCQnUzyzX3iMtpUUnuW9DH2AnnPm6ZTzHCRBP1siBqW6juZzVh8lmzWO1eInzp7aPGAovflj3NOCAIQd;

import X6vkJx4QztMOT7eQQNXaS1GVrQupXP9lWshNdTRHS2rsg2wgITJfmrJgmGlR6dmDGYpoXZhiZ14GFQTpm.D8GgZbzcKj5rilKnkj8e7mJ1giKXr7PVzF6Rm3iAMV12GPJFjJsP85ro8B5TqnDd3HSKa30yTfOnQUxiSzoUz76iRkaUnM8auyBFxe5kbLQOgcMjtAdyoJ8gOPES2QZYZSBpUK6Mt0I5HQrX8aYczk;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class zfocMDrnJnbYtdsnKHCh6s implements ThreadFactory {
    public final Object DrqQ8C7rtVRDTSclHGsDImq;
    public final /* synthetic */ int P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
    public final String YmFIHVAy6MFnHbke10dLWI57IXCp;

    public zfocMDrnJnbYtdsnKHCh6s(String str) {
        this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = 1;
        this.DrqQ8C7rtVRDTSclHGsDImq = Executors.defaultThreadFactory();
        this.YmFIHVAy6MFnHbke10dLWI57IXCp = str;
    }

    public final Thread newThread(Runnable runnable) {
        switch (this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d) {
            case 0:
                Thread newThread = Executors.defaultThreadFactory().newThread(new Gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY(runnable));
                newThread.setName(this.YmFIHVAy6MFnHbke10dLWI57IXCp + ((AtomicLong) this.DrqQ8C7rtVRDTSclHGsDImq).getAndIncrement());
                return newThread;
            default:
                Thread newThread2 = ((ThreadFactory) this.DrqQ8C7rtVRDTSclHGsDImq).newThread(new D8GgZbzcKj5rilKnkj8e7mJ1giKXr7PVzF6Rm3iAMV12GPJFjJsP85ro8B5TqnDd3HSKa30yTfOnQUxiSzoUz76iRkaUnM8auyBFxe5kbLQOgcMjtAdyoJ8gOPES2QZYZSBpUK6Mt0I5HQrX8aYczk(runnable, 1));
                newThread2.setName(this.YmFIHVAy6MFnHbke10dLWI57IXCp);
                return newThread2;
        }
    }

    public zfocMDrnJnbYtdsnKHCh6s(String str, AtomicLong atomicLong) {
        this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = 0;
        this.YmFIHVAy6MFnHbke10dLWI57IXCp = str;
        this.DrqQ8C7rtVRDTSclHGsDImq = atomicLong;
    }
}
