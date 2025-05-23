package dagger.hilt.android.internal.lifecycle;

import androidx.lifecycle.s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.internal.Preconditions;
import hYTq85NYTmpBSDuMVl7IaElgHIlwNLbmBabZyaUoQ6GcmC8LPZyp.M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh;
import java.util.Map;
import x77whet9CTnHyLJrJ8tDB12ZHs5cLjagRoeBF3vcKHicKwi4mYreFuuoCcINtVYoJZeVQaHvTynCv64MKEvDJKB48EaHfLZsCyuacC8JEI1iaQ3NBgqxhiY2rDd1Biw76b2zeDHMOFnMUPT0o1LSs.Gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY;

public final class DefaultViewModelFactories {

    public interface ActivityEntryPoint {
        InternalFactoryFactory getHiltInternalFactoryFactory();
    }

    public interface ActivityModule {
        Map<Class<?>, Boolean> viewModelKeys();
    }

    public interface FragmentEntryPoint {
        InternalFactoryFactory getHiltInternalFactoryFactory();
    }

    public static final class InternalFactoryFactory {
        private final Map<Class<?>, Boolean> keySet;
        private final ViewModelComponentBuilder viewModelComponentBuilder;

        public InternalFactoryFactory(Map<Class<?>, Boolean> map, ViewModelComponentBuilder viewModelComponentBuilder2) {
            this.keySet = map;
            this.viewModelComponentBuilder = viewModelComponentBuilder2;
        }

        private s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM getHiltViewModelFactory(s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM s1qyxwygk6rlwnnfbrictunuzzgmkhvuskjfesgmimsbjolzrepk75ypfyl8rslhoe5bo0cm) {
            return new HiltViewModelFactory(this.keySet, (s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM) Preconditions.checkNotNull(s1qyxwygk6rlwnnfbrictunuzzgmkhvuskjfesgmimsbjolzrepk75ypfyl8rslhoe5bo0cm), this.viewModelComponentBuilder);
        }

        public s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM fromActivity(M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh m3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh, s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM s1qyxwygk6rlwnnfbrictunuzzgmkhvuskjfesgmimsbjolzrepk75ypfyl8rslhoe5bo0cm) {
            return getHiltViewModelFactory(s1qyxwygk6rlwnnfbrictunuzzgmkhvuskjfesgmimsbjolzrepk75ypfyl8rslhoe5bo0cm);
        }

        public s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM fromFragment(Gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY, s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM s1qyxwygk6rlwnnfbrictunuzzgmkhvuskjfesgmimsbjolzrepk75ypfyl8rslhoe5bo0cm) {
            return getHiltViewModelFactory(s1qyxwygk6rlwnnfbrictunuzzgmkhvuskjfesgmimsbjolzrepk75ypfyl8rslhoe5bo0cm);
        }
    }

    private DefaultViewModelFactories() {
    }

    public static s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM getActivityFactory(M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh m3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh, s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM s1qyxwygk6rlwnnfbrictunuzzgmkhvuskjfesgmimsbjolzrepk75ypfyl8rslhoe5bo0cm) {
        return ((ActivityEntryPoint) EntryPoints.get(m3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh, ActivityEntryPoint.class)).getHiltInternalFactoryFactory().fromActivity(m3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh, s1qyxwygk6rlwnnfbrictunuzzgmkhvuskjfesgmimsbjolzrepk75ypfyl8rslhoe5bo0cm);
    }

    public static s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM getFragmentFactory(Gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY, s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM s1qyxwygk6rlwnnfbrictunuzzgmkhvuskjfesgmimsbjolzrepk75ypfyl8rslhoe5bo0cm) {
        return ((FragmentEntryPoint) EntryPoints.get(gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY, FragmentEntryPoint.class)).getHiltInternalFactoryFactory().fromFragment(gq0K3IDrcB6MKo1uwraHSDISQCav0u7hXSV8wNNkQHpwU5RxffzuQg6yPfs2rK47Evh067PJSv5dmFSQlmy62xtM513UxTY, s1qyxwygk6rlwnnfbrictunuzzgmkhvuskjfesgmimsbjolzrepk75ypfyl8rslhoe5bo0cm);
    }
}
