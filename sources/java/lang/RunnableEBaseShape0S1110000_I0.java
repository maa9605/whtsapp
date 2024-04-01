package java.lang;

import X.AnonymousClass060;
import X.AnonymousClass061;
import X.C000700j;
import X.C002501g;
import X.C003101m;
import X.C02L;
import X.C05W;
import X.C06C;
import X.C0CD;
import X.C0HC;
import X.C25L;
import X.C41681uL;
import android.database.Cursor;
import com.whatsapp.voipcalling.Voip;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class RunnableEBaseShape0S1110000_I0 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public String A01;
    public boolean A02;
    public final int A03;

    public RunnableEBaseShape0S1110000_I0(Object obj, String str, boolean z, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = str;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A03) {
            case 0:
                C41681uL c41681uL = (C41681uL) this.A00;
                String str = this.A01;
                boolean z = this.A02;
                ArrayList arrayList = new ArrayList();
                C05W c05w = c41681uL.A04;
                c05w.A05.A0V(arrayList, 0, false, false);
                ArrayList arrayList2 = new ArrayList();
                AnonymousClass060 anonymousClass060 = c05w.A05;
                Iterator it = anonymousClass060.A0F().iterator();
                while (it.hasNext()) {
                    C06C c06c = (C06C) it.next();
                    if (C003101m.A0V(c06c.A02())) {
                        arrayList2.add(c06c);
                    }
                }
                arrayList2.removeAll(arrayList);
                arrayList.addAll(arrayList2);
                if (anonymousClass060 != null) {
                    C0HC A06 = AnonymousClass061.A06();
                    arrayList.size();
                    C0CD A0A = anonymousClass060.A0A();
                    try {
                        Cursor A05 = AnonymousClass061.A05(A0A, "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)", AnonymousClass060.A07, "wa_contacts.jid LIKE '%broadcast'", null, null, "CONTACTS");
                        if (A05 == null) {
                            C000700j.A08(false, "contact-mgr-db/unable to get all broadcastlist chats");
                            A0A.close();
                        } else {
                            while (A05.moveToNext()) {
                                C06C A04 = C002501g.A04(A05);
                                if (A04.A09 != null) {
                                    arrayList.add(A04);
                                }
                            }
                            A05.close();
                            A0A.close();
                            arrayList.size();
                            A06.A00();
                        }
                        c41681uL.A0A.A03(str, c41681uL.A02(arrayList), z ? 8 : 2, z, c41681uL.A01());
                        return;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            try {
                                A0A.close();
                            } catch (Throwable unused) {
                            }
                            throw th2;
                        }
                    }
                }
                throw null;
            case 1:
                boolean z2 = this.A02;
                String str2 = this.A01;
                C02L c02l = ((C25L) this.A00).A1L;
                if (c02l != null) {
                    c02l.A05();
                    if (c02l.A01 != null) {
                        if (z2) {
                            Voip.endCallAndAcceptPendingCall(str2);
                            return;
                        } else {
                            Voip.acceptCall();
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
