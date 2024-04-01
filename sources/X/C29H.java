package X;

import com.whatsapp.jid.DeviceJid;
import java.util.List;
import java.util.Map;

/* renamed from: X.29H  reason: invalid class name */
/* loaded from: classes2.dex */
public class C29H {
    public static volatile C29H A0A;
    public final AbstractC000600i A00;
    public final C018508q A01;
    public final C06K A02;
    public final C06M A03;
    public final C05W A04;
    public final AnonymousClass075 A05;
    public final C0C9 A06;
    public final AnonymousClass011 A07;
    public final C0EG A08;
    public final C41681uL A09;

    public C29H(C018508q c018508q, AbstractC000600i abstractC000600i, AnonymousClass011 anonymousClass011, C0EG c0eg, C05W c05w, C0C9 c0c9, AnonymousClass075 anonymousClass075, C41681uL c41681uL, C06K c06k, C06M c06m) {
        this.A01 = c018508q;
        this.A00 = abstractC000600i;
        this.A07 = anonymousClass011;
        this.A08 = c0eg;
        this.A04 = c05w;
        this.A06 = c0c9;
        this.A05 = anonymousClass075;
        this.A09 = c41681uL;
        this.A02 = c06k;
        this.A03 = c06m;
    }

    public void A00(DeviceJid deviceJid, Map map, List list) {
        C05200Ns c05200Ns;
        int i;
        int i2;
        String str;
        C05200Ns c05200Ns2;
        int i3;
        C018108l c018108l = (C018108l) map.get(deviceJid.userJid);
        C018108l A00 = this.A05.A00(deviceJid.userJid);
        String str2 = null;
        if (A00 != null) {
            c05200Ns = A00.A00();
        } else {
            c05200Ns = null;
        }
        int A002 = C0O2.A00(A00);
        if (A00 != null) {
            i = A00.A03;
            str2 = A00.A08;
        } else {
            i = 0;
        }
        if (c018108l != null) {
            i2 = c018108l.A03;
            str = c018108l.A08;
            c05200Ns2 = c018108l.A00();
            i3 = C0O2.A00(c018108l);
        } else {
            i2 = i;
            str = str2;
            c05200Ns2 = c05200Ns;
            i3 = A002;
        }
        list.add(deviceJid.userJid);
        this.A06.A0L(deviceJid.userJid, new C0KN(i2, i, str, str2, c05200Ns2, c05200Ns, false, i3, A002));
    }
}
