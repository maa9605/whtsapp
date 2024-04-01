package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1j2  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C35371j2 implements C0NA {
    public final C0NA A00;
    public final /* synthetic */ C05X A01;

    public C35371j2(C05X c05x, C0NA c0na) {
        this.A01 = c05x;
        this.A00 = c0na;
    }

    @Override // X.C0NA
    public void AJF(UserJid userJid) {
        C0NA c0na = this.A00;
        if (c0na != null) {
            c0na.AJF(userJid);
        }
    }

    @Override // X.C0NA
    public void AJr(UserJid userJid, int i) {
        C0NA c0na = this.A00;
        if (c0na != null) {
            c0na.AJr(userJid, i);
        }
        this.A01.A02.post(new Runnable() { // from class: X.1I2
            @Override // java.lang.Runnable
            public final void run() {
                C05X c05x = C35371j2.this.A01;
                c05x.A01 = false;
                c05x.A05.A02();
            }
        });
    }

    @Override // X.C0NA
    public void AMS(UserJid userJid) {
        C0NA c0na = this.A00;
        if (c0na != null) {
            c0na.AMS(userJid);
        }
    }

    @Override // X.C0NA
    public void AP0(UserJid userJid, final String str, long j) {
        C0NA c0na = this.A00;
        if (c0na != null) {
            c0na.AP0(userJid, str, j);
        }
        this.A01.A02.post(new Runnable() { // from class: X.1I3
            @Override // java.lang.Runnable
            public final void run() {
                C35371j2 c35371j2 = C35371j2.this;
                c35371j2.A01.A03(str, null);
            }
        });
    }
}
