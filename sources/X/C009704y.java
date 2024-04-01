package X;

import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.04y  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C009704y {
    public final C04q A00;
    public final C01J A01;
    public final C01R A02;

    public C009704y(C01R c01r, C01J c01j, C04q c04q) {
        this.A02 = c01r;
        this.A01 = c01j;
        this.A00 = c04q;
    }

    public C1RO A00(C0XS c0xs) {
        this.A02.A01();
        if (c0xs != null) {
            C27311Mw A00 = this.A00.A00(C002701i.A0V(c0xs));
            try {
                if (A00 == null) {
                    return new C1RO();
                }
                return new C1RO(A00.A01);
            } catch (IOException e) {
                Log.w("axolotl ioexception while reading sender key record", e);
                return new C1RO();
            }
        }
        throw null;
    }
}
