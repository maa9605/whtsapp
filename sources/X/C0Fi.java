package X;

import com.whatsapp.util.Log;

/* renamed from: X.0Fi  reason: invalid class name */
/* loaded from: classes.dex */
public class C0Fi {
    public static volatile C0Fi A02;
    public boolean A00;
    public final StringBuilder A01 = new StringBuilder();

    public static C0Fi A00() {
        if (A02 == null) {
            synchronized (C0Fi.class) {
                if (A02 == null) {
                    A02 = new C0Fi();
                }
            }
        }
        return A02;
    }

    public void A01(String str, int i) {
        boolean z;
        if (i == 2) {
            Log.i(str);
        } else if (i == 3) {
            Log.w(str);
        } else if (i == 4) {
            Log.e(str);
        }
        synchronized (this) {
            z = this.A00;
        }
        if (z) {
            synchronized (this) {
                StringBuilder sb = this.A01;
                sb.append("\n");
                sb.append(str);
            }
        }
    }
}
