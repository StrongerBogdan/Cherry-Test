package dagger.hilt.android.internal.modules;

import UKVIoeT4sUmB74mTgXvgpttUhEgiUN08LCWD3BNHWHwyfv59o52bOWlIJwyXN.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK;
import android.content.Context;

public final class ApplicationContextModule_ProvideContextFactory implements FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK {
    private final ApplicationContextModule module;

    public ApplicationContextModule_ProvideContextFactory(ApplicationContextModule applicationContextModule) {
        this.module = applicationContextModule;
    }

    public static ApplicationContextModule_ProvideContextFactory create(ApplicationContextModule applicationContextModule) {
        return new ApplicationContextModule_ProvideContextFactory(applicationContextModule);
    }

    public static Context provideContext(ApplicationContextModule applicationContextModule) {
        Context provideContext = applicationContextModule.provideContext();
        if (provideContext != null) {
            return provideContext;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public Context get() {
        return provideContext(this.module);
    }
}
