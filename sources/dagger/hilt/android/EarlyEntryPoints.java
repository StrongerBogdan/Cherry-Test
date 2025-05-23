package dagger.hilt.android;

import android.app.Application;
import android.content.Context;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.internal.Contexts;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.TestSingletonComponentManager;
import java.lang.annotation.Annotation;

public final class EarlyEntryPoints {
    private EarlyEntryPoints() {
    }

    public static <T> T get(Context context, Class<T> cls) {
        Application application = Contexts.getApplication(context);
        Preconditions.checkState(application instanceof GeneratedComponentManagerHolder, "Expected application to implement GeneratedComponentManagerHolder. Check that you're passing in an application context that uses Hilt. Application class found: %s", application.getClass());
        GeneratedComponentManager<?> componentManager = ((GeneratedComponentManagerHolder) application).componentManager();
        if (!(componentManager instanceof TestSingletonComponentManager)) {
            return EntryPoints.get(application, cls);
        }
        Preconditions.checkState(hasAnnotationReflection(cls, EarlyEntryPoint.class), "%s should be called with EntryPoints.get() rather than EarlyEntryPoints.get()", cls.getCanonicalName());
        return cls.cast(((TestSingletonComponentManager) componentManager).earlySingletonComponent());
    }

    private static boolean hasAnnotationReflection(Class<?> cls, Class<? extends Annotation> cls2) {
        for (Annotation annotationType : cls.getAnnotations()) {
            if (annotationType.annotationType().equals(cls2)) {
                return true;
            }
        }
        return false;
    }
}
