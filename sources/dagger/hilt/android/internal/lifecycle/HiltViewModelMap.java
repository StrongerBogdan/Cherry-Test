package dagger.hilt.android.internal.lifecycle;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.CLASS)
public @interface HiltViewModelMap {

    @Target({ElementType.METHOD, ElementType.PARAMETER})
    @Retention(RetentionPolicy.CLASS)
    public @interface KeySet {
    }
}
