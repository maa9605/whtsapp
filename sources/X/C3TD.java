package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3TD  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3TD extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ AnonymousClass220 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public /* synthetic */ C3TD(AnonymousClass220 anonymousClass220, long j, UserJid userJid, long j2, String str, String str2) {
        this.A03 = anonymousClass220;
        this.A00 = j;
        this.A02 = userJid;
        this.A01 = j2;
        this.A04 = str;
        this.A05 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnonymousClass220 anonymousClass220 = this.A03;
        long j = this.A00;
        UserJid userJid = this.A02;
        long j2 = this.A01;
        String str = this.A04;
        String str2 = this.A05;
        C05140Nm A04 = anonymousClass220.A0E.A04(j);
        if (A04 != null) {
            A04.A00(3);
        }
        anonymousClass220.A05.A0L(userJid, j2, str);
        anonymousClass220.A0C.A09(str2, j, userJid, null, "status");
    }
}
