package dagger.hilt.android.internal.modules;

import android.app.Application;
import android.content.Context;
import dagger.hilt.android.internal.Contexts;

public final class ApplicationContextModule {
    private final Context applicationContext;

    public ApplicationContextModule(Context context) {
        this.applicationContext = context;
    }

    public Application provideApplication() {
        return Contexts.getApplication(this.applicationContext);
    }

    public Context provideContext() {
        return this.applicationContext;
    }
}
