package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class oQihSwLqd0g1qHMxAej6id7aYVUnpbxuEKRkhjwJDibJQxBBNor3YJDepREGWtZc0FHtpBDqOzhyoDTYB3IuPeq6GaWZDWy2iMz extends Binder implements IInterface {
    public oQihSwLqd0g1qHMxAej6id7aYVUnpbxuEKRkhjwJDibJQxBBNor3YJDepREGWtZc0FHtpBDqOzhyoDTYB3IuPeq6GaWZDWy2iMz(String str) {
        attachInterface(this, str);
    }

    public abstract boolean YmFIHVAy6MFnHbke10dLWI57IXCp(int i, Parcel parcel, Parcel parcel2);

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return YmFIHVAy6MFnHbke10dLWI57IXCp(i, parcel, parcel2);
    }
}
