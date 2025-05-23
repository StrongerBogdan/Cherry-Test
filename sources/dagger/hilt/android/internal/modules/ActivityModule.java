package dagger.hilt.android.internal.modules;

import android.app.Activity;
import android.content.Context;
import x77whet9CTnHyLJrJ8tDB12ZHs5cLjagRoeBF3vcKHicKwi4mYreFuuoCcINtVYoJZeVQaHvTynCv64MKEvDJKB48EaHfLZsCyuacC8JEI1iaQ3NBgqxhiY2rDd1Biw76b2zeDHMOFnMUPT0o1LSs.XIoAX8Ngr0eP0FzlPvsQCr8abQeqBh68H5a4qv9M;

abstract class ActivityModule {
    private ActivityModule() {
    }

    public static XIoAX8Ngr0eP0FzlPvsQCr8abQeqBh68H5a4qv9M provideFragmentActivity(Activity activity) {
        try {
            return (XIoAX8Ngr0eP0FzlPvsQCr8abQeqBh68H5a4qv9M) activity;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: " + activity, e);
        }
    }

    public abstract Context provideContext(Activity activity);
}
