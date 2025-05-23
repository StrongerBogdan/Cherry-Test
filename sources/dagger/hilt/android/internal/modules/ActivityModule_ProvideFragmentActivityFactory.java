package dagger.hilt.android.internal.modules;

import UKVIoeT4sUmB74mTgXvgpttUhEgiUN08LCWD3BNHWHwyfv59o52bOWlIJwyXN.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK;
import android.app.Activity;
import oeTk8hHe96IAC794Pv7BYj2bUodgiTS6VIlJbHR4ij6qU35n6YCCJb.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr;
import x77whet9CTnHyLJrJ8tDB12ZHs5cLjagRoeBF3vcKHicKwi4mYreFuuoCcINtVYoJZeVQaHvTynCv64MKEvDJKB48EaHfLZsCyuacC8JEI1iaQ3NBgqxhiY2rDd1Biw76b2zeDHMOFnMUPT0o1LSs.XIoAX8Ngr0eP0FzlPvsQCr8abQeqBh68H5a4qv9M;

public final class ActivityModule_ProvideFragmentActivityFactory implements FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK {
    private final wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr activityProvider;

    public ActivityModule_ProvideFragmentActivityFactory(wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr) {
        this.activityProvider = wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr;
    }

    public static ActivityModule_ProvideFragmentActivityFactory create(wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr) {
        return new ActivityModule_ProvideFragmentActivityFactory(wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr);
    }

    public static XIoAX8Ngr0eP0FzlPvsQCr8abQeqBh68H5a4qv9M provideFragmentActivity(Activity activity) {
        XIoAX8Ngr0eP0FzlPvsQCr8abQeqBh68H5a4qv9M provideFragmentActivity = ActivityModule.provideFragmentActivity(activity);
        if (provideFragmentActivity != null) {
            return provideFragmentActivity;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public XIoAX8Ngr0eP0FzlPvsQCr8abQeqBh68H5a4qv9M get() {
        return provideFragmentActivity((Activity) this.activityProvider.get());
    }
}
