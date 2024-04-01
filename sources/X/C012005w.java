package X;

import com.whatsapp.NativeMediaHandler;

/* renamed from: X.05w */
/* loaded from: classes.dex */
public class C012005w extends AbstractC012105x {
    public static volatile C012005w A00;

    public C012005w(C001200o c001200o, AnonymousClass034 anonymousClass034, NativeMediaHandler nativeMediaHandler, C02C c02c) {
        super(c001200o, anonymousClass034, nativeMediaHandler, c02c);
    }

    public static C012005w A00() {
        if (A00 == null) {
            synchronized (C012005w.class) {
                if (A00 == null) {
                    C001200o c001200o = C001200o.A01;
                    AnonymousClass034 A002 = AnonymousClass034.A00();
                    if (NativeMediaHandler.A01 == null) {
                        synchronized (NativeMediaHandler.class) {
                            if (NativeMediaHandler.A01 == null) {
                                NativeMediaHandler.A01 = new NativeMediaHandler(c001200o);
                            }
                        }
                    }
                    A00 = new C012005w(c001200o, A002, NativeMediaHandler.A01, C02C.A00());
                }
            }
        }
        return A00;
    }
}
