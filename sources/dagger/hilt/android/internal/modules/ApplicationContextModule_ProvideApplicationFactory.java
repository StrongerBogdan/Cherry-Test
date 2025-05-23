package dagger.hilt.android.internal.modules;

import UKVIoeT4sUmB74mTgXvgpttUhEgiUN08LCWD3BNHWHwyfv59o52bOWlIJwyXN.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK;
import android.app.Application;

public final class ApplicationContextModule_ProvideApplicationFactory implements FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK {
    private final ApplicationContextModule module;

    public ApplicationContextModule_ProvideApplicationFactory(ApplicationContextModule applicationContextModule) {
        this.module = applicationContextModule;
    }

    public static ApplicationContextModule_ProvideApplicationFactory create(ApplicationContextModule applicationContextModule) {
        return new ApplicationContextModule_ProvideApplicationFactory(applicationContextModule);
    }

    public static Application provideApplication(ApplicationContextModule applicationContextModule) {
        Application provideApplication = applicationContextModule.provideApplication();
        if (provideApplication != null) {
            return provideApplication;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public Application get() {
        return provideApplication(this.module);
    }
}
