package dagger.hilt.android;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.internal.Contexts;
import wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5;
import x77whet9CTnHyLJrJ8tDB12ZHs5cLjagRoeBF3vcKHicKwi4mYreFuuoCcINtVYoJZeVQaHvTynCv64MKEvDJKB48EaHfLZsCyuacC8JEI1iaQ3NBgqxhiY2rDd1Biw76b2zeDHMOFnMUPT0o1LSs.Gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY;

public final class EntryPointAccessors {
    public static final EntryPointAccessors INSTANCE = new EntryPointAccessors();

    private EntryPointAccessors() {
    }

    public static final <T> T fromActivity(Activity activity, Class<T> cls) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(activity, "activity");
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(cls, "entryPoint");
        return EntryPoints.get(activity, cls);
    }

    public static final <T> T fromApplication(Context context, Class<T> cls) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(context, "context");
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(cls, "entryPoint");
        return EntryPoints.get(Contexts.getApplication(context.getApplicationContext()), cls);
    }

    public static final <T> T fromFragment(Gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY, Class<T> cls) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY, "fragment");
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(cls, "entryPoint");
        return EntryPoints.get(gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY, cls);
    }

    public static final <T> T fromView(View view, Class<T> cls) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(view, "view");
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(cls, "entryPoint");
        return EntryPoints.get(view, cls);
    }

    public final <T> T fromActivity(Activity activity) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(activity, "activity");
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public final <T> T fromApplication(Context context) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(context, "context");
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public final <T> T fromFragment(Gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY, "fragment");
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public final <T> T fromView(View view) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(view, "view");
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }
}
