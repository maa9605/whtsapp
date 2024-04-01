package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2AL  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2AL {
    public static volatile C2AL A08;
    public final C000500h A00;
    public final C06T A01;
    public final C22X A02;
    public final C0EB A03;
    public final C0EN A04;
    public final C41681uL A05;
    public final C41521u3 A06;
    public final C0CB A07;

    public C2AL(C0EB c0eb, C0EN c0en, C41521u3 c41521u3, C0CB c0cb, C06T c06t, C22X c22x, C000500h c000500h, C41681uL c41681uL) {
        this.A03 = c0eb;
        this.A04 = c0en;
        this.A06 = c41521u3;
        this.A07 = c0cb;
        this.A01 = c06t;
        this.A02 = c22x;
        this.A00 = c000500h;
        this.A05 = c41681uL;
    }

    public static C2AL A00() {
        if (A08 == null) {
            synchronized (C2AL.class) {
                if (A08 == null) {
                    AnonymousClass012.A00();
                    A08 = new C2AL(C0EB.A00(), C0EN.A00(), C41521u3.A00(), C0CB.A00(), C06T.A02, C22X.A00(), C000500h.A00(), C41681uL.A00());
                }
            }
        }
        return A08;
    }

    public void A01(UserJid userJid, boolean z) {
        C0CB c0cb = this.A07;
        C03370Fl A07 = c0cb.A07(userJid);
        boolean z2 = false;
        if (!A07.A0G) {
            z2 = true;
            A07.A0G = true;
            c0cb.A0J(A07);
            c0cb.A0R.A02(userJid);
        }
        StringBuilder sb = new StringBuilder("statusmanager/mute-status-user returned ");
        sb.append(z2);
        sb.append(" for ");
        sb.append(userJid);
        Log.i(sb.toString());
        if (z2 && z) {
            this.A05.A04(userJid);
        }
    }

    public void A02(UserJid userJid, boolean z) {
        C0CB c0cb = this.A07;
        C03370Fl A07 = c0cb.A07(userJid);
        boolean z2 = false;
        if (A07.A0G) {
            A07.A0G = false;
            c0cb.A0J(A07);
            c0cb.A0R.A02(userJid);
            z2 = true;
        }
        StringBuilder sb = new StringBuilder("statusmanager/unmute-status-user returned ");
        sb.append(z2);
        sb.append(" for ");
        sb.append(userJid);
        Log.i(sb.toString());
        if (z2 && z) {
            this.A05.A04(userJid);
        }
    }
}
