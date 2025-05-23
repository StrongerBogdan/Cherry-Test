package B3PwWri6DSCoKraVluZjHaYZBf4Lra3UOWVB2XDM1KMB7OhKt20cO66HHxEdolbRaQev0TMOd0xc0bCAhppBTe703AYmEST1PHX6D9o2QFzGpBJe85D0v1a3US;

import JYJjVrtoNPH0ZPVFuXUUUodrW1lMAjpTvOe744s6s17UKUwuiHWN7QnbHz0A94mKrW23YzpGAZQ1TBH6hRnR.M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import dagger.hilt.android.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr {
    public static volatile wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU;
    public static final Object oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU = new Object();
    public final Context DrqQ8C7rtVRDTSclHGsDImq;
    public final HashMap P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = new HashMap();
    public final HashSet YmFIHVAy6MFnHbke10dLWI57IXCp = new HashSet();

    public wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr(Context context) {
        this.DrqQ8C7rtVRDTSclHGsDImq = context.getApplicationContext();
    }

    public static wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr DrqQ8C7rtVRDTSclHGsDImq(Context context) {
        if (VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU == null) {
            synchronized (oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU) {
                try {
                    if (VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU == null) {
                        VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU = new wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU;
    }

    public final void P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(Bundle bundle) {
        HashSet hashSet;
        String string = this.DrqQ8C7rtVRDTSclHGsDImq.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.YmFIHVAy6MFnHbke10dLWI57IXCp;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    YmFIHVAy6MFnHbke10dLWI57IXCp((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final Object YmFIHVAy6MFnHbke10dLWI57IXCp(Class cls, HashSet hashSet) {
        Object obj;
        if (M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh.ZfmQc7UyuizQy39JhchF5HmgxuXdEJNPFf0R1xBA9eBvUHExIB4X2nqjbTYFpy214x7P4IvsnrX3KhRK3SWVA9BHCKob0SovWpGOLl8a0WfUWuFiXct9210InG57dHr5tBeZtdjGkGbAPpsBALg7tjsY()) {
            try {
                M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh.ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA lKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA = (LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                List<Class> P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d2 = lKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d();
                if (!P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d2.isEmpty()) {
                    for (Class cls2 : P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d2) {
                        if (!hashMap.containsKey(cls2)) {
                            YmFIHVAy6MFnHbke10dLWI57IXCp(cls2, hashSet);
                        }
                    }
                }
                obj = lKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA.YmFIHVAy6MFnHbke10dLWI57IXCp(this.DrqQ8C7rtVRDTSclHGsDImq);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } else {
                obj = hashMap.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        String name = cls.getName();
        throw new IllegalStateException("Cannot initialize " + name + ". Cycle detected.");
    }
}
