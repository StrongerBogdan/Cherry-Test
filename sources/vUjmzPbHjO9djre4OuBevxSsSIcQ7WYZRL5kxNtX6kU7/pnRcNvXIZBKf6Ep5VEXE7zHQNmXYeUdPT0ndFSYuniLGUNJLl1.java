package vUjmzPbHjO9djre4OuBevxSsSIcQ7WYZRL5kxNtX6kU7;

import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

public abstract class pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1 {
    public static Boolean DrqQ8C7rtVRDTSclHGsDImq = null;
    public static final Method P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
    public static final Method YmFIHVAy6MFnHbke10dLWI57IXCp;

    static {
        Method method;
        Method method2;
        Class<String> cls = String.class;
        Class<WorkSource> cls2 = WorkSource.class;
        Process.myUid();
        try {
            method = cls2.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            method = null;
        }
        P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = method;
        try {
            method2 = cls2.getMethod("add", new Class[]{Integer.TYPE, cls});
        } catch (Exception unused2) {
            method2 = null;
        }
        YmFIHVAy6MFnHbke10dLWI57IXCp = method2;
        try {
            cls2.getMethod("size", (Class[]) null);
        } catch (Exception unused3) {
        }
        try {
            cls2.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception unused4) {
        }
        try {
            cls2.getMethod("getName", new Class[]{Integer.TYPE});
        } catch (Exception unused5) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                cls2.getMethod("createWorkChain", (Class[]) null);
            } catch (Exception e) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, cls});
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                cls2.getMethod("isEmpty", (Class[]) null).setAccessible(true);
            } catch (Exception unused6) {
            }
        }
    }
}
