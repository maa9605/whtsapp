package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.Conversation;
import com.whatsapp.conversation.conversationrow.ContactSyncActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2J8 */
/* loaded from: classes2.dex */
public class C2J8 {
    public static volatile C2J8 A0E;
    public final C018508q A00;
    public final C01B A01;
    public final C41541u6 A02;
    public final C05W A03;
    public final AnonymousClass008 A04;
    public final C018708s A05;
    public final C41691uM A06;
    public final C2L9 A07;
    public final C41321tj A08;
    public final C02E A09;
    public final AnonymousClass012 A0A;
    public final C02F A0B;
    public final C003701t A0C;
    public final InterfaceC002901k A0D;

    public C2J8(AnonymousClass012 anonymousClass012, C003701t c003701t, C018508q c018508q, InterfaceC002901k interfaceC002901k, C01B c01b, C41541u6 c41541u6, C05W c05w, C02E c02e, C018708s c018708s, AnonymousClass008 anonymousClass008, C2L9 c2l9, C41321tj c41321tj, C02F c02f, C41691uM c41691uM) {
        this.A0A = anonymousClass012;
        this.A0C = c003701t;
        this.A00 = c018508q;
        this.A0D = interfaceC002901k;
        this.A01 = c01b;
        this.A02 = c41541u6;
        this.A03 = c05w;
        this.A09 = c02e;
        this.A05 = c018708s;
        this.A04 = anonymousClass008;
        this.A07 = c2l9;
        this.A08 = c41321tj;
        this.A0B = c02f;
        this.A06 = c41691uM;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x03df, code lost:
        if (r8.equals("vnd.android.cursor.item/email_v2") == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x03e8, code lost:
        if (r8.equals("vnd.android.cursor.item/contact_event") == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x03f3, code lost:
        if (r8.equals("vnd.android.cursor.item/postal-address_v2") == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x03fe, code lost:
        if (r8.equals("vnd.android.cursor.item/phone_v2") == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0409, code lost:
        if (r8.equals("vnd.android.cursor.item/organization") == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0412, code lost:
        if (r8.equals("vnd.android.cursor.item/photo") == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x041b, code lost:
        if (r8.equals("vnd.android.cursor.item/im") == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0424, code lost:
        if (r8.equals("vnd.android.cursor.item/nickname") == false) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.Intent A00(android.app.Activity r28, X.C04110Ip r29, android.graphics.Bitmap r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2J8.A00(android.app.Activity, X.0Ip, android.graphics.Bitmap, boolean):android.content.Intent");
    }

    public void A01(Context context, UserJid userJid, String str) {
        C04460Kg c04460Kg;
        C05W c05w = this.A03;
        C06C A0A = c05w.A0A(userJid);
        C01B c01b = this.A01;
        C03B c03b = C01C.A0W;
        if (c01b.A0E(c03b) && !A0A.A0T && !TextUtils.isEmpty(str)) {
            context.startActivity(new Intent(context, ContactSyncActivity.class).putExtra("user_jid", C003101m.A07(userJid)).addFlags(335544320));
            return;
        }
        if (c01b.A0E(c03b) && (((c04460Kg = A0A.A08) == null || TextUtils.isEmpty(c04460Kg.A01)) && !A0A.A0W && !A0A.A0T)) {
            this.A0D.AS1(new RunnableEBaseShape1S0200000_I0_1(this, userJid, 1));
        }
        Intent A00 = Conversation.A00(context, c05w.A0A(userJid));
        C002701i.A1C(A00, "ShareContactUtil", this.A0A);
        context.startActivity(A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x00e5, code lost:
        if (r1 != null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(java.util.ArrayList r23, java.util.List r24, java.lang.String r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2J8.A02(java.util.ArrayList, java.util.List, java.lang.String, java.lang.String):void");
    }
}
