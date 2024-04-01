package X;

import android.os.Bundle;
import android.util.Log;

/* renamed from: X.1C9  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1C9 {
    public final int A00;
    public final int A01;
    public final Bundle A02;
    public final C0NR A03 = new C0NR();

    public C1C9(int i, int i2, Bundle bundle) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = bundle;
    }

    public abstract void A00(Bundle bundle);

    public abstract boolean A03();

    public final void A01(C1C8 c1c8) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(c1c8);
            Log.d("MessengerIpcClient", C000200d.A08(valueOf2.length() + valueOf.length() + 14, "Failing ", valueOf, " with ", valueOf2));
        }
        this.A03.A00.A08(c1c8);
    }

    public final void A02(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(obj);
            Log.d("MessengerIpcClient", C000200d.A08(valueOf2.length() + valueOf.length() + 16, "Finishing ", valueOf, " with ", valueOf2));
        }
        this.A03.A00.A09(obj);
    }

    public String toString() {
        int i = this.A00;
        int i2 = this.A01;
        boolean A03 = A03();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(A03);
        sb.append("}");
        return sb.toString();
    }
}
