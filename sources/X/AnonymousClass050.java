package X;

import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.050  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass050 {
    public final C04u A00;
    public final C01J A01;
    public final C01R A02;

    public AnonymousClass050(C01R c01r, C01J c01j, C04u c04u) {
        this.A02 = c01r;
        this.A01 = c01j;
        this.A00 = c04u;
    }

    public C1RM A00(C0XS c0xs) {
        this.A02.A01();
        if (c0xs != null) {
            C27291Mu A00 = this.A00.A00(C002701i.A0V(c0xs));
            try {
                if (A00 == null) {
                    return new C1RM();
                }
                return new C1RM(A00.A01);
            } catch (IOException e) {
                Log.w("axolotl ioexception while reading fast ratchet sender key record", e);
                return new C1RM();
            }
        }
        throw null;
    }
}
