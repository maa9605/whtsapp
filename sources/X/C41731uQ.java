package X;

import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.1uQ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41731uQ {
    public static volatile C41731uQ A01;
    public final JniBridge A00;

    public C41731uQ(JniBridge jniBridge) {
        this.A00 = jniBridge;
    }

    public static C41731uQ A00() {
        if (A01 == null) {
            synchronized (C41731uQ.class) {
                if (A01 == null) {
                    A01 = new C41731uQ(JniBridge.getInstance());
                }
            }
        }
        return A01;
    }
}
