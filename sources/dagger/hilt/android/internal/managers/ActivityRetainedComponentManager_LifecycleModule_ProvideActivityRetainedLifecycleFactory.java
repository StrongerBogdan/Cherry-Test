package dagger.hilt.android.internal.managers;

import UKVIoeT4sUmB74mTgXvgpttUhEgiUN08LCWD3BNHWHwyfv59o52bOWlIJwyXN.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager;

public final class ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory implements FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory INSTANCE = new ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory();

        private InstanceHolder() {
        }
    }

    public static ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ActivityRetainedLifecycle provideActivityRetainedLifecycle() {
        ActivityRetainedLifecycle provideActivityRetainedLifecycle = ActivityRetainedComponentManager.LifecycleModule.provideActivityRetainedLifecycle();
        if (provideActivityRetainedLifecycle != null) {
            return provideActivityRetainedLifecycle;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public ActivityRetainedLifecycle get() {
        return provideActivityRetainedLifecycle();
    }
}
