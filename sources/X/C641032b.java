package X;

import android.app.Application;
import com.whatsapp.jid.UserJid;

/* renamed from: X.32b  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C641032b implements C0CR {
    public final Application A00;
    public final C06K A01;
    public final C06M A02;
    public final AnonymousClass075 A03;
    public final UserJid A04;
    public final InterfaceC002901k A05;

    public C641032b(InterfaceC002901k interfaceC002901k, Application application, AnonymousClass075 anonymousClass075, C06K c06k, C06M c06m, UserJid userJid) {
        this.A05 = interfaceC002901k;
        this.A00 = application;
        this.A03 = anonymousClass075;
        this.A01 = c06k;
        this.A02 = c06m;
        this.A04 = userJid;
    }

    @Override // X.C0CR
    public C0MU A6e(Class cls) {
        return new C68193Il(this.A05, this.A00, this.A03, this.A01, this.A02, this.A04);
    }
}
