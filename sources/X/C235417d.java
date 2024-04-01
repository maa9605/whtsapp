package X;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.17d  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C235417d implements IInterface {
    public final IBinder A00;
    public final String A01;

    public C235417d(IBinder iBinder, String str) {
        this.A00 = iBinder;
        this.A01 = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.A00;
    }
}
