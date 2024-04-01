package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2AJ  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2AJ implements C0NA {
    public final C41541u6 A00;
    public final C05W A01;
    public final C41691uM A02;
    public final InterfaceC002901k A03;

    public C2AJ(InterfaceC002901k interfaceC002901k, C41541u6 c41541u6, C05W c05w, C41691uM c41691uM) {
        this.A03 = interfaceC002901k;
        this.A00 = c41541u6;
        this.A01 = c05w;
        this.A02 = c41691uM;
    }

    @Override // X.C0NA
    public void AJF(UserJid userJid) {
        C000200d.A0x("getstatus/delete jid=", userJid);
        C06C A09 = this.A01.A09(userJid);
        if (A09 != null) {
            A09.A0L = null;
            A09.A07 = 0L;
            this.A03.AS1(new RunnableEBaseShape3S0200000_I0_3(this, A09, 36));
        }
    }

    @Override // X.C0NA
    public void AJr(UserJid userJid, int i) {
        StringBuilder sb = new StringBuilder("getstatus/failed jid=");
        sb.append(userJid);
        sb.append(" code=");
        sb.append(i);
        Log.w(sb.toString());
    }

    @Override // X.C0NA
    public void AMS(UserJid userJid) {
        C000200d.A0x("getstatus/nochange jid=", userJid);
    }

    @Override // X.C0NA
    public void AP0(UserJid userJid, String str, long j) {
        C06C A09 = this.A01.A09(userJid);
        if (A09 != null) {
            A09.A0L = str;
            A09.A07 = j;
            StringBuilder A0U = C000200d.A0U("getstatus/received  jid=", userJid, " status=");
            A0U.append(A09.A0L);
            A0U.append(" timestamp=");
            C000200d.A1I(A0U, A09.A07);
            this.A03.AS1(new RunnableEBaseShape3S0200000_I0_3(this, A09, 36));
        }
    }
}
