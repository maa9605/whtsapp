package X;

import com.whatsapp.jid.GroupJid;
import java.util.LinkedHashMap;

/* renamed from: X.2Ia  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C49022Ia {
    public long A00 = -1;
    public final int A01;
    public final GroupJid A02;
    public final String A03;
    public final LinkedHashMap A04;
    public final boolean A05;
    public final boolean A06;

    public C49022Ia(String str, LinkedHashMap linkedHashMap, boolean z, GroupJid groupJid, int i, boolean z2) {
        this.A03 = str;
        this.A04 = linkedHashMap;
        this.A05 = z;
        this.A02 = groupJid;
        this.A01 = i;
        this.A06 = z2;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("callId=");
        A0P.append(this.A03);
        A0P.append(" isVideoCall=");
        A0P.append(this.A05);
        A0P.append(" groupJid=");
        A0P.append(this.A02);
        A0P.append(" jids=[ ");
        for (Object obj : this.A04.keySet()) {
            A0P.append(obj);
            A0P.append(" ");
        }
        A0P.append("]");
        return A0P.toString();
    }
}
