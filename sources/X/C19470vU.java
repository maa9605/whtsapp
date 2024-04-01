package X;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: X.0vU  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19470vU {
    public final InterfaceC19020ui A00;

    public C19470vU(final C19570ve c19570ve) {
        this.A00 = new InterfaceC19020ui() { // from class: X.1Xy
            @Override // X.InterfaceC19020ui
            public void ARa(C19070un c19070un, Throwable th) {
                String obj;
                if (C19570ve.this != null) {
                    Object[] objArr = new Object[4];
                    objArr[0] = Integer.valueOf(System.identityHashCode(this));
                    objArr[1] = Integer.valueOf(System.identityHashCode(c19070un));
                    objArr[2] = c19070un.A00().getClass().getName();
                    if (th == null) {
                        obj = "";
                    } else {
                        StringWriter stringWriter = new StringWriter();
                        th.printStackTrace(new PrintWriter(stringWriter));
                        obj = stringWriter.toString();
                    }
                    objArr[3] = obj;
                    C18960uc.A00.A00(5, "Fresco", String.format(null, "Finalized without closing: %x %x (type = %s).\nStack:\n%s", objArr));
                    return;
                }
                throw null;
            }

            @Override // X.InterfaceC19020ui
            public boolean ARh() {
                if (C19570ve.this != null) {
                    return false;
                }
                throw null;
            }
        };
    }
}
