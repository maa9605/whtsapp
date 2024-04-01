package X;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: X.0Rp */
/* loaded from: classes.dex */
public abstract class AbstractBinderC06120Rp extends BinderC06130Rq implements InterfaceC06140Rr {
    public int A00;

    public abstract byte[] A02();

    public AbstractBinderC06120Rp(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        C07K.A1Y(bArr.length == 25);
        this.A00 = Arrays.hashCode(bArr);
    }

    public static byte[] A00(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // X.BinderC06130Rq
    public final boolean A01(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            IObjectWrapper AX3 = AX3();
            parcel2.writeNoException();
            C234516s.A00(parcel2, AX3);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int AX8 = AX8();
            parcel2.writeNoException();
            parcel2.writeInt(AX8);
            return true;
        }
    }

    @Override // X.InterfaceC06140Rr
    public final IObjectWrapper AX3() {
        return new BinderC06190Rw(A02());
    }

    @Override // X.InterfaceC06140Rr
    public final int AX8() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        IObjectWrapper AX3;
        if (obj != null && (obj instanceof InterfaceC06140Rr)) {
            try {
                InterfaceC06140Rr interfaceC06140Rr = (InterfaceC06140Rr) obj;
                if (interfaceC06140Rr.AX8() == this.A00 && (AX3 = interfaceC06140Rr.AX3()) != null) {
                    return Arrays.equals(A02(), (byte[]) BinderC06190Rw.A00(AX3));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.A00;
    }
}
