package X;

import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.0IX  reason: invalid class name */
/* loaded from: classes.dex */
public class C0IX {
    public static volatile C0IX A01;
    public final JniBridge A00;

    public C0IX(JniBridge jniBridge) {
        this.A00 = jniBridge;
    }

    public static C0IX A00() {
        if (A01 == null) {
            synchronized (C0IX.class) {
                if (A01 == null) {
                    A01 = new C0IX(JniBridge.getInstance());
                }
            }
        }
        return A01;
    }
}
