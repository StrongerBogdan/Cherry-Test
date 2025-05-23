package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class rvh43jacaJiH3b3o9XeSMDe544 implements IInterface {
    public final String DrqQ8C7rtVRDTSclHGsDImq;
    public final /* synthetic */ int P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
    public final IBinder YmFIHVAy6MFnHbke10dLWI57IXCp;

    public /* synthetic */ rvh43jacaJiH3b3o9XeSMDe544(IBinder iBinder, String str, int i) {
        this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = i;
        this.YmFIHVAy6MFnHbke10dLWI57IXCp = iBinder;
        this.DrqQ8C7rtVRDTSclHGsDImq = str;
    }

    public Parcel H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.DrqQ8C7rtVRDTSclHGsDImq);
        return obtain;
    }

    public Parcel HcGgqmTrfEBzZy0CmDiIV3ZElJEuPtc3JIfGYgq465Eh(Parcel parcel, int i) {
        parcel = Parcel.obtain();
        try {
            this.YmFIHVAy6MFnHbke10dLWI57IXCp.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public Parcel YmFIHVAy6MFnHbke10dLWI57IXCp() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.DrqQ8C7rtVRDTSclHGsDImq);
        return obtain;
    }

    public final IBinder asBinder() {
        switch (this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d) {
            case 0:
                return this.YmFIHVAy6MFnHbke10dLWI57IXCp;
            default:
                return this.YmFIHVAy6MFnHbke10dLWI57IXCp;
        }
    }

    public void osWaXDDeLSz3xTdh9JMsF4w1V14Qp6qQcOS(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.YmFIHVAy6MFnHbke10dLWI57IXCp.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(Parcel parcel, int i) {
        parcel = Parcel.obtain();
        try {
            this.YmFIHVAy6MFnHbke10dLWI57IXCp.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
