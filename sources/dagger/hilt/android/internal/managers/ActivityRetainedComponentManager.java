package dagger.hilt.android.internal.managers;

import Cm3UOe0P3gzeR8ADJg4EKIsI.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK;
import HevDK09eybta9sIedOWa4gOXscsiOfP7kXok89N8k5kpHcz66ug1uFgw5377IUVchzbWWplKR3v6Pq.LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA;
import android.content.Context;
import androidx.lifecycle.PktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W;
import androidx.lifecycle.fo9TgqYVvhowqEry4TEwIKgoCTy05UiNtIEbmF5RfffRDUBYTN9K;
import androidx.lifecycle.s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM;
import androidx.lifecycle.tesoyBtHZ8RPf9nBL7HNn64VUK5a3dngXz07MIVPOrEHfmLAcFoaP61EAQSHGlHSlM;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.lifecycle.RetainedLifecycleImpl;
import dagger.hilt.internal.GeneratedComponentManager;
import hYTq85NYTmpBSDuMVl7IaElgHIlwNLbmBabZyaUoQ6GcmC8LPZyp.M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh;

final class ActivityRetainedComponentManager implements GeneratedComponentManager<ActivityRetainedComponent> {
    private volatile ActivityRetainedComponent component;
    private final Object componentLock = new Object();
    private final Context context;
    private final tesoyBtHZ8RPf9nBL7HNn64VUK5a3dngXz07MIVPOrEHfmLAcFoaP61EAQSHGlHSlM viewModelStoreOwner;

    public interface ActivityRetainedComponentBuilderEntryPoint {
        ActivityRetainedComponentBuilder retainedComponentBuilder();
    }

    public static final class ActivityRetainedComponentViewModel extends PktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W {
        private final ActivityRetainedComponent component;
        private final SavedStateHandleHolder savedStateHandleHolder;

        public ActivityRetainedComponentViewModel(ActivityRetainedComponent activityRetainedComponent, SavedStateHandleHolder savedStateHandleHolder2) {
            this.component = activityRetainedComponent;
            this.savedStateHandleHolder = savedStateHandleHolder2;
        }

        public ActivityRetainedComponent getComponent() {
            return this.component;
        }

        public SavedStateHandleHolder getSavedStateHandleHolder() {
            return this.savedStateHandleHolder;
        }

        public void onCleared() {
            super.onCleared();
            ((RetainedLifecycleImpl) ((ActivityRetainedLifecycleEntryPoint) EntryPoints.get(this.component, ActivityRetainedLifecycleEntryPoint.class)).getActivityRetainedLifecycle()).dispatchOnCleared();
        }
    }

    public interface ActivityRetainedLifecycleEntryPoint {
        ActivityRetainedLifecycle getActivityRetainedLifecycle();
    }

    public static abstract class LifecycleModule {
        public static ActivityRetainedLifecycle provideActivityRetainedLifecycle() {
            return new RetainedLifecycleImpl();
        }
    }

    public ActivityRetainedComponentManager(M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh m3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh) {
        this.viewModelStoreOwner = m3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh;
        this.context = m3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh;
    }

    private ActivityRetainedComponent createComponent() {
        return ((ActivityRetainedComponentViewModel) getViewModelProvider(this.viewModelStoreOwner, this.context).P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(ActivityRetainedComponentViewModel.class)).getComponent();
    }

    private fo9TgqYVvhowqEry4TEwIKgoCTy05UiNtIEbmF5RfffRDUBYTN9K getViewModelProvider(tesoyBtHZ8RPf9nBL7HNn64VUK5a3dngXz07MIVPOrEHfmLAcFoaP61EAQSHGlHSlM tesoybthz8rpf9nbl7hnn64vuk5a3dngxz07mivporehfmlacfoap61eaqshglhslm, final Context context2) {
        return new fo9TgqYVvhowqEry4TEwIKgoCTy05UiNtIEbmF5RfffRDUBYTN9K(tesoybthz8rpf9nbl7hnn64vuk5a3dngxz07mivporehfmlacfoap61eaqshglhslm, (s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM) new s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM() {
            public /* bridge */ /* synthetic */ PktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W create(LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA lKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA, FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK) {
                return super.create(lKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA, fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK);
            }

            public /* bridge */ /* synthetic */ PktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W create(Class cls) {
                super.create(cls);
                throw null;
            }

            public <T extends PktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W> T create(Class<T> cls, FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK) {
                SavedStateHandleHolder savedStateHandleHolder = new SavedStateHandleHolder(fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK);
                return new ActivityRetainedComponentViewModel(((ActivityRetainedComponentBuilderEntryPoint) EntryPointAccessors.fromApplication(context2, ActivityRetainedComponentBuilderEntryPoint.class)).retainedComponentBuilder().savedStateHandleHolder(savedStateHandleHolder).build(), savedStateHandleHolder);
            }
        });
    }

    public SavedStateHandleHolder getSavedStateHandleHolder() {
        return ((ActivityRetainedComponentViewModel) getViewModelProvider(this.viewModelStoreOwner, this.context).P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(ActivityRetainedComponentViewModel.class)).getSavedStateHandleHolder();
    }

    public ActivityRetainedComponent generatedComponent() {
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
}
