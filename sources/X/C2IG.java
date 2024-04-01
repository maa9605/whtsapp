package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.2IG  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2IG extends C2IJ {
    public final C018508q A00;
    public final C02L A01;
    public final C05W A02;
    public final C04630Le A03;
    public final C0LF A04;
    public final C001200o A05;
    public final C002301c A06;
    public final C0C8 A07;
    public final C06C A08;
    public final WeakReference A09;
    public final boolean A0A;

    public C2IG(C001200o c001200o, C018508q c018508q, C02L c02l, C05W c05w, C002301c c002301c, C0DV c0dv, C03690Gr c03690Gr, C40411sD c40411sD, C43081wp c43081wp, C2NE c2ne, C0DW c0dw, C04630Le c04630Le, C0C8 c0c8, C0LF c0lf, ContactInfoActivity contactInfoActivity, C06C c06c) {
        super(c018508q, c0dv, c03690Gr, c40411sD, c43081wp, c2ne, c0dw, contactInfoActivity, c06c);
        this.A05 = c001200o;
        this.A00 = c018508q;
        this.A09 = new WeakReference(contactInfoActivity);
        this.A01 = c02l;
        this.A02 = c05w;
        this.A06 = c002301c;
        this.A08 = c06c;
        this.A0A = true;
        this.A03 = c04630Le;
        this.A07 = c0c8;
        this.A04 = c0lf;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        ChatInfoActivity chatInfoActivity = (ChatInfoActivity) this.A09.get();
        if (chatInfoActivity != null && !chatInfoActivity.AFE()) {
            chatInfoActivity.A0m(false);
            Log.i("contactinfo/updated");
            if (chatInfoActivity.findViewById(R.id.media_card_view).getVisibility() == 0) {
                chatInfoActivity.A1U();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x027b, code lost:
        if (r10 != null) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a3 A[Catch: all -> 0x031f, TryCatch #13 {all -> 0x031f, blocks: (B:79:0x01a9, B:81:0x01af, B:83:0x01b9, B:85:0x01bf, B:89:0x01e5, B:90:0x01f9, B:112:0x027d, B:114:0x0281, B:116:0x0291, B:117:0x029d, B:119:0x02a3, B:121:0x02b9, B:124:0x02c1, B:126:0x02c5, B:99:0x021a, B:101:0x021e, B:115:0x028e, B:110:0x026c, B:151:0x031b, B:88:0x01db, B:128:0x02cb, B:130:0x02d1, B:132:0x02db, B:138:0x0303, B:133:0x02e4, B:135:0x02ec, B:137:0x02f6, B:102:0x0228, B:109:0x0269, B:104:0x0247, B:105:0x025c, B:107:0x0262, B:108:0x0266, B:91:0x01fa, B:92:0x0202, B:94:0x0209, B:96:0x0217, B:98:0x0219), top: B:175:0x01a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02c1 A[SYNTHETIC] */
    @Override // X.C2IJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Void A0A(java.lang.Void... r28) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2IG.A0A(java.lang.Void[]):java.lang.Void");
    }
}
