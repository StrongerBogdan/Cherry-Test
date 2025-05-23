package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.app.Application;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.internal.GeneratedComponentManager;
import hYTq85NYTmpBSDuMVl7IaElgHIlwNLbmBabZyaUoQ6GcmC8LPZyp.M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh;

public class ActivityComponentManager implements GeneratedComponentManager<Object> {
    protected final Activity activity;
    private final GeneratedComponentManager<ActivityRetainedComponent> activityRetainedComponentManager;
    private volatile Object component;
    private final Object componentLock = new Object();

    public interface ActivityComponentBuilderEntryPoint {
        ActivityComponentBuilder activityComponentBuilder();
    }

    public ActivityComponentManager(Activity activity2) {
        this.activity = activity2;
        this.activityRetainedComponentManager = new ActivityRetainedComponentManager((M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh) activity2);
    }

    public Object createComponent() {
        String str;
        if (this.activity.getApplication() instanceof GeneratedComponentManager) {
            return ((ActivityComponentBuilderEntryPoint) EntryPoints.get(this.activityRetainedComponentManager, ActivityComponentBuilderEntryPoint.class)).activityComponentBuilder().activity(this.activity).build();
        }
        StringBuilder sb = new StringBuilder("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(this.activity.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + this.activity.getApplication().getClass();
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    public Object generatedComponent() {
        if (this.component == null) {
            synchronized (this.componentLock) {
                try {
                    if (this.component == null) {
                        this.component = createComponent();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.component;
    }

    public final SavedStateHandleHolder getSavedStateHandleHolder() {
        return ((ActivityRetainedComponentManager) this.activityRetainedComponentManager).getSavedStateHandleHolder();
    }
}
