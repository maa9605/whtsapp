package X;

import android.os.Build;
import android.os.ConditionVariable;
import android.os.LocaleList;
import android.os.Message;
import android.text.format.DateFormat;
import android.util.Base64;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.2AV */
/* loaded from: classes2.dex */
public class C2AV {
    public static volatile C2AV A0L;
    public final AbstractC000600i A00;
    public final C02L A01;
    public final C01B A02;
    public final C002301c A03;
    public final C0CA A04;
    public final C03180Eq A05;
    public final C22X A06;
    public final C0EB A07;
    public final C03880Hm A08;
    public final C0EN A09;
    public final C0EG A0A;
    public final C41681uL A0B;
    public final C25w A0C;
    public final C451520p A0D;
    public final C451720r A0E;
    public final C41521u3 A0F;
    public final AnonymousClass247 A0G;
    public final C0CB A0H;
    public final InterfaceC002901k A0I;
    public final C41981up A0J;
    public final C41991uq A0K;

    public C2AV(AbstractC000600i abstractC000600i, C02L c02l, InterfaceC002901k interfaceC002901k, C41981up c41981up, C41991uq c41991uq, C0EG c0eg, C01B c01b, C0EB c0eb, C0EN c0en, C41521u3 c41521u3, C002301c c002301c, C03880Hm c03880Hm, C451520p c451520p, C03180Eq c03180Eq, C0CB c0cb, AnonymousClass247 anonymousClass247, C451720r c451720r, C22X c22x, C0CA c0ca, C41681uL c41681uL, C25w c25w) {
        this.A00 = abstractC000600i;
        this.A01 = c02l;
        this.A0I = interfaceC002901k;
        this.A0J = c41981up;
        this.A0K = c41991uq;
        this.A0A = c0eg;
        this.A02 = c01b;
        this.A07 = c0eb;
        this.A09 = c0en;
        this.A0F = c41521u3;
        this.A03 = c002301c;
        this.A08 = c03880Hm;
        this.A0D = c451520p;
        this.A05 = c03180Eq;
        this.A0H = c0cb;
        this.A0G = anonymousClass247;
        this.A0E = c451720r;
        this.A06 = c22x;
        this.A04 = c0ca;
        this.A0B = c41681uL;
        this.A0C = c25w;
    }

    public static C2AV A00() {
        if (A0L == null) {
            synchronized (C2AV.class) {
                if (A0L == null) {
                    A0L = new C2AV(AbstractC000600i.A00(), C02L.A00(), C002801j.A00(), C41981up.A00(), C41991uq.A00(), C0EG.A00(), C01B.A00(), C0EB.A00(), C0EN.A00(), C41521u3.A00(), C002301c.A00(), C03880Hm.A00(), C451520p.A00(), C03180Eq.A00(), C0CB.A00(), AnonymousClass247.A00(), C451720r.A00(), C22X.A00(), C0CA.A00(), C41681uL.A00(), C25w.A00());
                }
            }
        }
        return A0L;
    }

    public void A01(int i, List list, boolean z, boolean z2, ConditionVariable conditionVariable, ConditionVariable conditionVariable2, AnonymousClass094 anonymousClass094) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A0G.A01((AnonymousClass092) it.next());
        }
        C25w c25w = this.A0C;
        if (c25w != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!C002701i.A1R((AnonymousClass092) it2.next())) {
                    throw new IllegalArgumentException("message thumb not loaded");
                }
            }
            if (c25w.A04()) {
                c25w.A03(null, list, i, z, z2, conditionVariable, conditionVariable2, 4, anonymousClass094, null);
                return;
            }
            return;
        }
        throw null;
    }

    public void A02(AbstractC005302j abstractC005302j, boolean z, Collection collection, int i) {
        if (abstractC005302j == null || collection == null || collection.size() == 0) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.A0G.A01((AnonymousClass092) it.next());
        }
        this.A0C.A01(abstractC005302j, z, collection, i);
    }

    public void A03(AnonymousClass092 anonymousClass092) {
        this.A0G.A01(anonymousClass092);
        C25w c25w = this.A0C;
        if (c25w != null) {
            if (C002701i.A1R(anonymousClass092)) {
                if (c25w.A03.A04() && c25w.A04()) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(anonymousClass092);
                    c25w.A03(null, arrayList, 3, false, false, null, null, 4, null, null);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("message thumb not loaded");
        }
        throw null;
    }

    public void A04(String str) {
        int i = 0;
        boolean z = str == null;
        ConditionVariable conditionVariable = new ConditionVariable();
        ConditionVariable conditionVariable2 = new ConditionVariable();
        HashMap hashMap = new HashMap();
        C0CA c0ca = this.A04;
        C0CB c0cb = this.A0H;
        c0ca.A00.A0C();
        ArrayList A09 = c0ca.A09(c0cb);
        ArrayList arrayList = new ArrayList();
        Iterator it = A09.iterator();
        while (it.hasNext()) {
            Jid jid = (Jid) it.next();
            if (!C003101m.A0a(jid)) {
                arrayList.add(jid);
            }
        }
        StringBuilder A0P = C000200d.A0P("web-message-send-methods/send-web-response-conversations: conversation list size is ");
        A0P.append(arrayList.size());
        Log.i(A0P.toString());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC005302j abstractC005302j = (AbstractC005302j) it2.next();
            AnonymousClass092 anonymousClass092 = null;
            if (i < 1000 || C003101m.A0P(abstractC005302j) || !z) {
                anonymousClass092 = this.A05.A01(abstractC005302j);
                i++;
            }
            hashMap.put(abstractC005302j, anonymousClass092);
        }
        try {
            this.A0I.AS1(new RunnableEBaseShape0S0410000_I0(this, hashMap, conditionVariable, z, conditionVariable2, 2));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("app/xmpp/send/qr_send_conv preempt:");
            sb.append(z);
            sb.append(" recents dispatch error ");
            Log.e(sb.toString(), e);
            conditionVariable2.open();
        }
        try {
            this.A0I.AS1(new C3MA(this, hashMap, str, z, conditionVariable, conditionVariable2));
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("app/xmpp/send/qr_send_conv preempt:");
            sb2.append(z);
            sb2.append(" chats/before dispatch error ");
            Log.e(sb2.toString(), e2);
            conditionVariable.open();
        }
    }

    public void A05(String str, String str2, String str3, String str4, int i) {
        String A05;
        C41981up c41981up = this.A0J;
        if (!c41981up.A04() && str != null) {
            C002301c c002301c = this.A03;
            String A03 = c002301c.A03();
            String A04 = c002301c.A04();
            byte[] bArr = new byte[32];
            this.A0K.A0P.nextBytes(bArr);
            String encodeToString = Base64.encodeToString(bArr, 2);
            if (Build.VERSION.SDK_INT >= 24) {
                A05 = LocaleList.getDefault().toLanguageTags();
            } else {
                A05 = AbstractC003201n.A05(Locale.getDefault());
            }
            byte[] A052 = c41981up.A05();
            C0EG c0eg = this.A0A;
            if (c0eg.A02.A06) {
                boolean is24HourFormat = DateFormat.is24HourFormat(c0eg.A05.A00);
                C0G3 c0g3 = c0eg.A03.A00;
                double A00 = c0g3.A00();
                c0eg.A07.A09(Message.obtain(null, 0, 43, 0, new C05590Pi(str, str2, str4, str3, encodeToString, i, A052, Double.isNaN(A00) ? 0 : (int) A00, c0g3.A01(), c0eg.A04.A00, A03, A04, A05, is24HourFormat)));
            }
        }
        C41991uq c41991uq = this.A0K;
        c41991uq.A0L.A02(str2, false);
        if (i == 0 || i == 1) {
            A04(null);
            C41681uL c41681uL = this.A0B;
            c41681uL.A0C.AS1(new RunnableEBaseShape0S1110000_I0(c41681uL, null, true, 0));
        }
        C41521u3 c41521u3 = this.A0F;
        c41521u3.A0E.AS1(new RunnableEBaseShape0S1100000_I0(c41521u3, c41991uq.A03(), 17));
    }

    public void A06(String str, List list, int i, HashMap hashMap) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A0G.A01((AnonymousClass092) it.next());
        }
        C25w c25w = this.A0C;
        if (c25w != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!C002701i.A1R((AnonymousClass092) it2.next())) {
                    throw new IllegalArgumentException("message thumb not loaded");
                }
            }
            c25w.A03(str, list, -1, true, false, null, null, i, null, hashMap);
            return;
        }
        throw null;
    }
}
