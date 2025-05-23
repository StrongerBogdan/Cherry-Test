package com.android.installreferrer.api;

import WfFOicBMPs8f8M35Q4qSm9wyBA5M8xEyrmSiMx4ZwtKzFOGHcU03ZgPlHFNOzIl.LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA;
import android.content.Context;

public abstract class InstallReferrerClient {

    public static final class Builder {
        public final Context P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;

        public Builder(Context context) {
            this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = context;
        }

        public InstallReferrerClient build() {
            Context context = this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
            if (context != null) {
                return new LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    public static Builder newBuilder(Context context) {
        return new Builder(context);
    }

    public abstract void endConnection();

    public abstract ReferrerDetails getInstallReferrer();

    public abstract void startConnection(InstallReferrerStateListener installReferrerStateListener);
}
