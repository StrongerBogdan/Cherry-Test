package dagger.hilt.android.internal.lifecycle;

import Cm3UOe0P3gzeR8ADJg4EKIsI.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK;
import Cm3UOe0P3gzeR8ADJg4EKIsI.LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA;
import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.PktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W;
import androidx.lifecycle.asQX8JK5HmDXPcoA9YxLn7cpuBp3KP6Kb3odxWwo12KJ5d8EadSLwry1kNCpB2BMyI1q8ppamvM7V8TMZX0u4yLfB75z4Zfx44zbxotyq8ZtBder4E2Ym1q0028YzDwhrBpztS4K5wnrw39ja;
import androidx.lifecycle.s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import hpZLfNv1UsZRbsLSpEfbINb7mI8RrPJRKJarLpqIXEMf2nnaOmS.Um9b2ks8Y0LiK3u4FrDpXIUf9CDB20azqNED8tqUF5QXjqNMzV6NToOBBjWfuzhJwt8AdCxM1KC0y54xLsKDQKV5vpV75DQjOjBEi7ECY0uxjR1BVNeGxeMiDLdAwy33RHeQ9vkNdSttO818vnfVccP8CWp;
import java.io.Closeable;
import java.util.Map;
import oeTk8hHe96IAC794Pv7BYj2bUodgiTS6VIlJbHR4ij6qU35n6YCCJb.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr;

public final class HiltViewModelFactory implements s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM {
    public static final LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA CREATION_CALLBACK_KEY = new LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA() {
    };
    private final s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM delegateFactory;
    private final s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM hiltViewModelFactory;
    private final Map<Class<?>, Boolean> hiltViewModelKeys;

    public interface ActivityCreatorEntryPoint {
        ViewModelComponentBuilder getViewModelComponentBuilder();

        Map<Class<?>, Boolean> getViewModelKeys();
    }

    public interface ViewModelFactoriesEntryPoint {
        Map<Class<?>, Object> getHiltViewModelAssistedMap();

        Map<Class<?>, wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr> getHiltViewModelMap();
    }

    public interface ViewModelModule {
        Map<Class<?>, Object> hiltViewModelAssistedMap();

        Map<Class<?>, PktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W> hiltViewModelMap();
    }

    public HiltViewModelFactory(Map<Class<?>, Boolean> map, s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM s1qyxwygk6rlwnnfbrictunuzzgmkhvuskjfesgmimsbjolzrepk75ypfyl8rslhoe5bo0cm, final ViewModelComponentBuilder viewModelComponentBuilder) {
        this.hiltViewModelKeys = map;
        this.delegateFactory = s1qyxwygk6rlwnnfbrictunuzzgmkhvuskjfesgmimsbjolzrepk75ypfyl8rslhoe5bo0cm;
        this.hiltViewModelFactory = new s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM() {
            private <T extends PktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W> T createViewModel(ViewModelComponent viewModelComponent, Class<T> cls, FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK) {
                Class cls2 = ViewModelFactoriesEntryPoint.class;
                wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr = ((ViewModelFactoriesEntryPoint) EntryPoints.get(viewModelComponent, cls2)).getHiltViewModelMap().get(cls);
                BfOJyZqKageCXvQ662yV4N4haMDzZchZjZJtJRHdUgXuZbihJRgnAUWAneMEWBv5d4IhRxvYQfkKIljMVFDCwca8XfoJWHvdNB4zvZT5jGunB5Ub2oTmbkzk1ZBN32YhXavKS.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK2 = (BfOJyZqKageCXvQ662yV4N4haMDzZchZjZJtJRHdUgXuZbihJRgnAUWAneMEWBv5d4IhRxvYQfkKIljMVFDCwca8XfoJWHvdNB4zvZT5jGunB5Ub2oTmbkzk1ZBN32YhXavKS.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK) fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(HiltViewModelFactory.CREATION_CALLBACK_KEY);
                Object obj = ((ViewModelFactoriesEntryPoint) EntryPoints.get(viewModelComponent, cls2)).getHiltViewModelAssistedMap().get(cls);
                if (obj == null) {
                    if (fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK2 != null) {
                        throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                    } else if (wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr != null) {
                        return (PktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W) wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr.get();
                    } else {
                        throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                    }
                } else if (wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr != null) {
                    throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                } else if (fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK2 != null) {
                    return (PktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W) fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK2.invoke(obj);
                } else {
                    throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                }
            }

            public /* bridge */ /* synthetic */ PktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W create(HevDK09eybta9sIedOWa4gOXscsiOfP7kXok89N8k5kpHcz66ug1uFgw5377IUVchzbWWplKR3v6Pq.LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA lKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA, FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK) {
                return super.create(lKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA, fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK);
            }

            public /* bridge */ /* synthetic */ PktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W create(Class cls) {
                super.create(cls);
                throw null;
            }

            public <T extends PktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W> T create(Class<T> cls, FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK) {
                RetainedLifecycleImpl retainedLifecycleImpl = new RetainedLifecycleImpl();
                T createViewModel = createViewModel(viewModelComponentBuilder.savedStateHandle(asQX8JK5HmDXPcoA9YxLn7cpuBp3KP6Kb3odxWwo12KJ5d8EadSLwry1kNCpB2BMyI1q8ppamvM7V8TMZX0u4yLfB75z4Zfx44zbxotyq8ZtBder4E2Ym1q0028YzDwhrBpztS4K5wnrw39ja.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK)).viewModelLifecycle(retainedLifecycleImpl).build(), cls, fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK);
                createViewModel.addCloseable((Closeable) new wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr(retainedLifecycleImpl));
                return createViewModel;
            }
        };
    }

    public static s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM createInternal(Activity activity, Um9b2ks8Y0LiK3u4FrDpXIUf9CDB20azqNED8tqUF5QXjqNMzV6NToOBBjWfuzhJwt8AdCxM1KC0y54xLsKDQKV5vpV75DQjOjBEi7ECY0uxjR1BVNeGxeMiDLdAwy33RHeQ9vkNdSttO818vnfVccP8CWp um9b2ks8Y0LiK3u4FrDpXIUf9CDB20azqNED8tqUF5QXjqNMzV6NToOBBjWfuzhJwt8AdCxM1KC0y54xLsKDQKV5vpV75DQjOjBEi7ECY0uxjR1BVNeGxeMiDLdAwy33RHeQ9vkNdSttO818vnfVccP8CWp, Bundle bundle, s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM s1qyxwygk6rlwnnfbrictunuzzgmkhvuskjfesgmimsbjolzrepk75ypfyl8rslhoe5bo0cm) {
        return createInternal(activity, s1qyxwygk6rlwnnfbrictunuzzgmkhvuskjfesgmimsbjolzrepk75ypfyl8rslhoe5bo0cm);
    }

    public /* bridge */ /* synthetic */ PktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W create(HevDK09eybta9sIedOWa4gOXscsiOfP7kXok89N8k5kpHcz66ug1uFgw5377IUVchzbWWplKR3v6Pq.LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA lKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA, FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK) {
        return super.create(lKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA, fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK);
    }

    public static s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM createInternal(Activity activity, s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM s1qyxwygk6rlwnnfbrictunuzzgmkhvuskjfesgmimsbjolzrepk75ypfyl8rslhoe5bo0cm) {
        ActivityCreatorEntryPoint activityCreatorEntryPoint = (ActivityCreatorEntryPoint) EntryPoints.get(activity, ActivityCreatorEntryPoint.class);
        return new HiltViewModelFactory(activityCreatorEntryPoint.getViewModelKeys(), s1qyxwygk6rlwnnfbrictunuzzgmkhvuskjfesgmimsbjolzrepk75ypfyl8rslhoe5bo0cm, activityCreatorEntryPoint.getViewModelComponentBuilder());
    }

    public <T extends PktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W> T create(Class<T> cls, FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK) {
        if (this.hiltViewModelKeys.containsKey(cls)) {
            return this.hiltViewModelFactory.create((Class) cls, fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK);
        }
        return this.delegateFactory.create((Class) cls, fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK);
    }

    public <T extends PktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W> T create(Class<T> cls) {
        if (this.hiltViewModelKeys.containsKey(cls)) {
            return this.hiltViewModelFactory.create(cls);
        }
        return this.delegateFactory.create(cls);
    }
}
