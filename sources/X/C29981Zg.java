package X;

import android.net.Uri;

/* renamed from: X.1Zg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29981Zg implements C12F {
    public long A00;
    public long A01;
    public AnonymousClass126 A02;
    public boolean A03;
    public final Uri A04;
    public final InterfaceC21760zr A05;
    public final C21790zu A06;
    public final C218710c A07;
    public final C30291aE A08;
    public final C12T A09;
    public volatile boolean A0A;
    public final /* synthetic */ C39271pr A0B;

    public C29981Zg(C39271pr c39271pr, Uri uri, InterfaceC06380Sv interfaceC06380Sv, C218710c c218710c, InterfaceC21760zr interfaceC21760zr, C12T c12t) {
        this.A0B = c39271pr;
        this.A04 = uri;
        this.A08 = new C30291aE(interfaceC06380Sv);
        this.A07 = c218710c;
        this.A05 = interfaceC21760zr;
        this.A09 = c12t;
        C21790zu c21790zu = new C21790zu();
        this.A06 = c21790zu;
        this.A03 = true;
        this.A00 = -1L;
        this.A02 = new AnonymousClass126(uri, c21790zu.A00, -1L);
    }
}
