package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2mV  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC55982mV extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ AnonymousClass271 A04;
    public final /* synthetic */ UserJid A05;
    public final /* synthetic */ C05200Ns A06;
    public final /* synthetic */ C05200Ns A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    public /* synthetic */ RunnableC55982mV(AnonymousClass271 anonymousClass271, UserJid userJid, int i, int i2, String str, String str2, C05200Ns c05200Ns, C05200Ns c05200Ns2, int i3, int i4) {
        this.A04 = anonymousClass271;
        this.A05 = userJid;
        this.A00 = i;
        this.A01 = i2;
        this.A08 = str;
        this.A09 = str2;
        this.A06 = c05200Ns;
        this.A07 = c05200Ns2;
        this.A02 = i3;
        this.A03 = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnonymousClass271 anonymousClass271 = this.A04;
        UserJid userJid = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        String str = this.A08;
        String str2 = this.A09;
        C05200Ns c05200Ns = this.A06;
        C05200Ns c05200Ns2 = this.A07;
        int i3 = this.A02;
        int i4 = this.A03;
        C05W c05w = anonymousClass271.A02;
        C06C A0A = c05w.A0A(userJid);
        c05w.A0G();
        anonymousClass271.A05.A03(A0A);
        anonymousClass271.A04.A0L(userJid, new C0KN(i, i2, str, str2, c05200Ns, c05200Ns2, false, i3, i4));
    }
}
