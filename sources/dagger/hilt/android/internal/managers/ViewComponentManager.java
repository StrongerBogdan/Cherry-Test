package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.Hfv852lbufjqS9YvuotOQGMlAwbT93xAB7vm4I08c6qrPUQoF33xZ7tgcFr07lRFO0AjYBoYHfH7ytkOI;
import androidx.lifecycle.nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.internal.Contexts;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.Preconditions;
import x77whet9CTnHyLJrJ8tDB12ZHs5cLjagRoeBF3vcKHicKwi4mYreFuuoCcINtVYoJZeVQaHvTynCv64MKEvDJKB48EaHfLZsCyuacC8JEI1iaQ3NBgqxhiY2rDd1Biw76b2zeDHMOFnMUPT0o1LSs.Gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY;

public final class ViewComponentManager implements GeneratedComponentManager<Object> {
    private volatile Object component;
    private final Object componentLock = new Object();
    private final boolean hasFragmentBindings;
    private final View view;

    public interface ViewComponentBuilderEntryPoint {
        ViewComponentBuilder viewComponentBuilder();
    }

    public interface ViewWithFragmentComponentBuilderEntryPoint {
        ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder();
    }

    public ViewComponentManager(View view2, boolean z) {
        this.view = view2;
        this.hasFragmentBindings = z;
    }

    private Object createComponent() {
        GeneratedComponentManager<?> parentComponentManager = getParentComponentManager(false);
        return this.hasFragmentBindings ? ((ViewWithFragmentComponentBuilderEntryPoint) EntryPoints.get(parentComponentManager, ViewWithFragmentComponentBuilderEntryPoint.class)).viewWithFragmentComponentBuilder().view(this.view).build() : ((ViewComponentBuilderEntryPoint) EntryPoints.get(parentComponentManager, ViewComponentBuilderEntryPoint.class)).viewComponentBuilder().view(this.view).build();
    }

    private GeneratedComponentManager<?> getParentComponentManager(boolean z) {
        Class<GeneratedComponentManager> cls = GeneratedComponentManager.class;
        if (this.hasFragmentBindings) {
            Context parentContext = getParentContext(FragmentContextWrapper.class, z);
            if (parentContext instanceof FragmentContextWrapper) {
                return (GeneratedComponentManager) ((FragmentContextWrapper) parentContext).getFragment();
            }
            if (z) {
                return null;
            }
            Context parentContext2 = getParentContext(cls, z);
            Preconditions.checkState(!(parentContext2 instanceof GeneratedComponentManager), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.view.getClass(), parentContext2.getClass().getName());
        } else {
            Context parentContext3 = getParentContext(cls, z);
            if (parentContext3 instanceof GeneratedComponentManager) {
                return (GeneratedComponentManager) parentContext3;
            }
            if (z) {
                return null;
            }
        }
        Class<?> cls2 = this.view.getClass();
        throw new IllegalStateException(cls2 + ", Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.");
    }

    private Context getParentContext(Class<?> cls, boolean z) {
        Context unwrap = unwrap(this.view.getContext(), cls);
        if (unwrap != Contexts.getApplication(unwrap.getApplicationContext())) {
            return unwrap;
        }
        Preconditions.checkState(z, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.view.getClass());
        return null;
    }

    private static Context unwrap(Context context, Class<?> cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
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

    public GeneratedComponentManager<?> maybeGetParentComponentManager() {
        return getParentComponentManager(true);
    }

    public static final class FragmentContextWrapper extends ContextWrapper {
        /* access modifiers changed from: private */
        public LayoutInflater baseInflater;
        /* access modifiers changed from: private */
        public Gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY fragment;
        private final androidx.lifecycle.Gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY fragmentLifecycleObserver;
        /* access modifiers changed from: private */
        public LayoutInflater inflater;

        public FragmentContextWrapper(Context context, Gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY) {
            super((Context) Preconditions.checkNotNull(context));
            AnonymousClass1 r2 = new androidx.lifecycle.Gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY() {
                public void onStateChanged(Hfv852lbufjqS9YvuotOQGMlAwbT93xAB7vm4I08c6qrPUQoF33xZ7tgcFr07lRFO0AjYBoYHfH7ytkOI hfv852lbufjqS9YvuotOQGMlAwbT93xAB7vm4I08c6qrPUQoF33xZ7tgcFr07lRFO0AjYBoYHfH7ytkOI, nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcoc) {
                    if (nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcoc == nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC.ON_DESTROY) {
                        Gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY unused = FragmentContextWrapper.this.fragment = null;
                        LayoutInflater unused2 = FragmentContextWrapper.this.baseInflater = null;
                        LayoutInflater unused3 = FragmentContextWrapper.this.inflater = null;
                    }
                }
            };
            this.fragmentLifecycleObserver = r2;
            this.baseInflater = null;
            Gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY2 = (Gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY) Preconditions.checkNotNull(gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY);
            this.fragment = gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY2;
            gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY2.Z6zkjisgtP978NC0DhZRz5ziFJjUpwIskJ7XiIo3WBRg27V3d7xuJ312iZtXVP8g9adhweHYGfBbqL1MltSMQUpYVtmgB4L58PyvqoEZwAIYrlLBAApPRNeNAAypcmetgiG.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(r2);
        }

        public Gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY getFragment() {
            Preconditions.checkNotNull(this.fragment, "The fragment has already been destroyed.");
            return this.fragment;
        }

        public Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.inflater == null) {
                if (this.baseInflater == null) {
                    this.baseInflater = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.inflater = this.baseInflater.cloneInContext(this);
            }
            return this.inflater;
        }

        public FragmentContextWrapper(LayoutInflater layoutInflater, Gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY) {
            super((Context) Preconditions.checkNotNull(((LayoutInflater) Preconditions.checkNotNull(layoutInflater)).getContext()));
            AnonymousClass1 r0 = new androidx.lifecycle.Gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY() {
                public void onStateChanged(Hfv852lbufjqS9YvuotOQGMlAwbT93xAB7vm4I08c6qrPUQoF33xZ7tgcFr07lRFO0AjYBoYHfH7ytkOI hfv852lbufjqS9YvuotOQGMlAwbT93xAB7vm4I08c6qrPUQoF33xZ7tgcFr07lRFO0AjYBoYHfH7ytkOI, nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcoc) {
                    if (nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcoc == nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC.ON_DESTROY) {
                        Gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY unused = FragmentContextWrapper.this.fragment = null;
                        LayoutInflater unused2 = FragmentContextWrapper.this.baseInflater = null;
                        LayoutInflater unused3 = FragmentContextWrapper.this.inflater = null;
                    }
                }
            };
            this.fragmentLifecycleObserver = r0;
            this.baseInflater = layoutInflater;
            Gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY2 = (Gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY) Preconditions.checkNotNull(gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY);
            this.fragment = gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY2;
            gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY2.Z6zkjisgtP978NC0DhZRz5ziFJjUpwIskJ7XiIo3WBRg27V3d7xuJ312iZtXVP8g9adhweHYGfBbqL1MltSMQUpYVtmgB4L58PyvqoEZwAIYrlLBAApPRNeNAAypcmetgiG.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(r0);
        }
    }
}
