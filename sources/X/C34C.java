package X;

import android.app.Application;

/* renamed from: X.34C  reason: invalid class name */
/* loaded from: classes2.dex */
public class C34C implements C0CR {
    public final Application A00;
    public final C002301c A01;

    public C34C(Application application, C002301c c002301c) {
        this.A00 = application;
        this.A01 = c002301c;
    }

    @Override // X.C0CR
    public C0MU A6e(Class cls) {
        return new C68283Iw(this.A00, this.A01);
    }
}
