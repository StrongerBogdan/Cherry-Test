package dagger.hilt.android.migration;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.view.View;
import dagger.hilt.android.internal.migration.InjectedByHilt;
import dagger.hilt.internal.Preconditions;
import hYTq85NYTmpBSDuMVl7IaElgHIlwNLbmBabZyaUoQ6GcmC8LPZyp.M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh;
import x77whet9CTnHyLJrJ8tDB12ZHs5cLjagRoeBF3vcKHicKwi4mYreFuuoCcINtVYoJZeVQaHvTynCv64MKEvDJKB48EaHfLZsCyuacC8JEI1iaQ3NBgqxhiY2rDd1Biw76b2zeDHMOFnMUPT0o1LSs.Gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY;

public final class OptionalInjectCheck {
    private OptionalInjectCheck() {
    }

    private static boolean check(Object obj) {
        Preconditions.checkNotNull(obj);
        Preconditions.checkArgument(obj instanceof InjectedByHilt, "'%s' is not an optionally injected android entry point. Check that you have annotated the class with both @AndroidEntryPoint and @OptionalInject.", obj.getClass());
        return ((InjectedByHilt) obj).wasInjectedByHilt();
    }

    public static boolean wasInjectedByHilt(M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh m3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh) {
        return check(m3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh);
    }

    public static boolean wasInjectedByHilt(BroadcastReceiver broadcastReceiver) {
        return check(broadcastReceiver);
    }

    public static boolean wasInjectedByHilt(Gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY) {
        return check(gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY);
    }

    public static boolean wasInjectedByHilt(Service service) {
        return check(service);
    }

    public static boolean wasInjectedByHilt(View view) {
        return check(view);
    }
}
