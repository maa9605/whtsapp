package X;

import android.app.Application;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.WindowManager;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.HomeActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.notification.AndroidWear;
import com.whatsapp.notification.DirectReplyService;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.24q */
/* loaded from: classes2.dex */
public class RunnableC460224q extends RunnableEmptyBase implements Runnable {
    public final int A00;
    public final Context A01;
    public final C03020Dv A02;
    public final AbstractC000600i A03;
    public final C012005w A04;
    public final C018508q A05;
    public final C02L A06;
    public final C03150Ej A07;
    public final C01B A08;
    public final C0L8 A09;
    public final C0LA A0A;
    public final C03160Eo A0B;
    public final C03170Ep A0C;
    public final C0L7 A0D;
    public final C05W A0E;
    public final C018708s A0F;
    public final C0L5 A0G;
    public final C03120Eg A0H;
    public final C02E A0I;
    public final C005102h A0J;
    public final C000500h A0K;
    public final C002301c A0L;
    public final C05M A0M;
    public final C0CA A0N;
    public final C0C9 A0O;
    public final C0C8 A0P;
    public final C05O A0Q;
    public final C40421sE A0R;
    public final C0L9 A0S;
    public final AbstractC005302j A0T;
    public final C40301ry A0U;
    public final C0DU A0V;
    public final C459724l A0W;
    public final C0FQ A0X;
    public final AnonymousClass092 A0Y;
    public final C05G A0Z;
    public final C0CB A0a;
    public final C43101wr A0b;
    public final C03070Ea A0c;
    public final C0H9 A0d;
    public final C459824m A0e;
    public final C0L6 A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;

    public RunnableC460224q(Application application, C018508q c018508q, C02L c02l, C03070Ea c03070Ea, AbstractC000600i abstractC000600i, C05M c05m, C012005w c012005w, C05O c05o, C01B c01b, C0L5 c0l5, C0L6 c0l6, C03160Eo c03160Eo, C03170Ep c03170Ep, C0L7 c0l7, C05W c05w, C02E c02e, C018708s c018708s, C002301c c002301c, C0FQ c0fq, C43101wr c43101wr, C0H9 c0h9, C0C9 c0c9, C0CB c0cb, C0DU c0du, C0L8 c0l8, C0L9 c0l9, C40301ry c40301ry, C40421sE c40421sE, C000500h c000500h, C0CA c0ca, C005102h c005102h, C03150Ej c03150Ej, C0C8 c0c8, C459724l c459724l, C05G c05g, C03020Dv c03020Dv, C0LA c0la, C03120Eg c03120Eg, C459824m c459824m, AnonymousClass092 anonymousClass092, boolean z, boolean z2, boolean z3, AbstractC005302j abstractC005302j, int i, boolean z4) {
        this.A01 = application;
        this.A05 = c018508q;
        this.A06 = c02l;
        this.A0c = c03070Ea;
        this.A03 = abstractC000600i;
        this.A0M = c05m;
        this.A04 = c012005w;
        this.A0Q = c05o;
        this.A08 = c01b;
        this.A0G = c0l5;
        this.A0f = c0l6;
        this.A0B = c03160Eo;
        this.A0C = c03170Ep;
        this.A0D = c0l7;
        this.A0E = c05w;
        this.A0I = c02e;
        this.A0F = c018708s;
        this.A0L = c002301c;
        this.A0X = c0fq;
        this.A0b = c43101wr;
        this.A0d = c0h9;
        this.A0O = c0c9;
        this.A0a = c0cb;
        this.A0V = c0du;
        this.A09 = c0l8;
        this.A0S = c0l9;
        this.A0U = c40301ry;
        this.A0R = c40421sE;
        this.A0K = c000500h;
        this.A0N = c0ca;
        this.A0J = c005102h;
        this.A07 = c03150Ej;
        this.A0P = c0c8;
        this.A0W = c459724l;
        this.A0Z = c05g;
        this.A02 = c03020Dv;
        this.A0A = c0la;
        this.A0H = c03120Eg;
        this.A0e = c459824m;
        this.A0Y = anonymousClass092;
        this.A0j = z;
        this.A0i = z2;
        this.A0h = z3;
        this.A0T = abstractC005302j;
        this.A00 = i;
        this.A0g = z4;
        this.A0k = c03170Ep.A09();
    }

    public static int A00(Context context, int i, int i2) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            Log.e("WindowManager was null");
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        int i3 = point.x * point.y;
        int i4 = 1;
        if (i3 != 0) {
            for (int i5 = i * i2; i5 > i3; i5 >>= 2) {
                i4 <<= 1;
            }
        }
        return i4;
    }

    public final Bitmap A01(C06C c06c) {
        Context context = this.A01;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(17104901);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(17104902);
        Bitmap A02 = this.A0G.A02(context, c06c, dimensionPixelSize, dimensionPixelSize2);
        if (A02 != null) {
            return A02;
        }
        C0L7 c0l7 = this.A0D;
        return c0l7.A04(c06c, Math.min(dimensionPixelSize, dimensionPixelSize2), c0l7.A01.A00.getResources().getDimension(R.dimen.small_avatar_radius));
    }

    public final C0FK A02(Context context, C06C c06c) {
        C0LA c0la = this.A0A;
        if (c0la.A02 && c0la.A00.A0E(C01C.A1C)) {
            return new C0FK(5, new Intent("com.whatsapp.intent.action.CHATS", ContentUris.withAppendedId(C50512Sb.A00, c06c.A01()), context, HomeActivity.class));
        }
        return new C0FK(2, new Intent("com.whatsapp.intent.action.OPEN", ContentUris.withAppendedId(C50512Sb.A00, c06c.A01()), context, Conversation.class).addFlags(335544320).putExtra("fromNotification", true));
    }

    public final CharSequence A03(int i, int i2, AnonymousClass092 anonymousClass092, C06C c06c) {
        if (i2 == 1) {
            if (i == 1 && this.A0k) {
                return this.A0V.A0E(anonymousClass092, c06c, false, false);
            }
            return this.A0L.A0A(R.plurals.notification_new_message, i, Integer.valueOf(i));
        }
        C002301c c002301c = this.A0L;
        return c002301c.A0A(R.plurals.notification_new_message_from_multiple_contacts_2, i2, c002301c.A0A(R.plurals.notification_new_message_from_multiple_contacts_1, i, Integer.valueOf(i)), Integer.valueOf(i2));
    }

    public final String A04(AnonymousClass092 anonymousClass092) {
        C05W c05w;
        C06C A0A;
        ContentResolver A07 = this.A0I.A07();
        if (A07 == null) {
            Log.w("messagenotification cr=null");
            return null;
        }
        AbstractC005302j A0A2 = anonymousClass092.A0A();
        AbstractC005302j abstractC005302j = anonymousClass092.A0n.A00;
        if (C003101m.A0U(abstractC005302j) && A0A2 != null) {
            c05w = this.A0E;
            A0A = c05w.A0A(A0A2);
        } else {
            c05w = this.A0E;
            if (abstractC005302j != null) {
                A0A = c05w.A0A(abstractC005302j);
            } else {
                throw null;
            }
        }
        Uri A04 = c05w.A04(A0A, A07);
        if (A04 != null) {
            return A04.toString();
        }
        return null;
    }

    public final void A05(C005402l c005402l, C06C c06c) {
        Context context = this.A01;
        Intent A01 = HomeActivity.A01(context);
        A01.putExtra("show_mute", true);
        A01.putExtra("mute_jid", C003101m.A07(c06c.A02()));
        c005402l.A0N.add(new C07940aL(R.drawable.ic_notif_mute, context.getString(R.string.mute_status), PendingIntent.getActivity(context, 4, A01, 134217728)));
    }

    public final void A06(C005402l c005402l, C06C c06c, int i) {
        if (DirectReplyService.A01()) {
            c005402l.A0N.add(DirectReplyService.A00(this.A01, c06c, DirectReplyService.A0A, i));
            return;
        }
        Context context = this.A01;
        Intent intent = new Intent(context, PopupNotification.class);
        intent.putExtra("popup_notification_extra_quick_reply_jid", C003101m.A07(c06c.A02()));
        intent.putExtra("popup_notification_extra_dismiss_notification", true);
        c005402l.A04(R.drawable.ic_action_reply, context.getString(R.string.notification_quick_reply), PendingIntent.getActivity(context, 0, intent, 134217728));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    public final void A07(C005402l c005402l, C06C c06c, AnonymousClass092 anonymousClass092, boolean z, boolean z2, boolean z3, boolean z4) {
        Bitmap bitmap;
        CharSequence charSequence;
        Context context = this.A01;
        C05O c05o = this.A0Q;
        C018708s c018708s = this.A0F;
        C002301c c002301c = this.A0L;
        C0C9 c0c9 = this.A0O;
        C0DU c0du = this.A0V;
        if (z3 && z2) {
            bitmap = this.A0G.A02(context, c06c, 400, 400);
        } else {
            bitmap = null;
        }
        C1T9 c1t9 = new C1T9();
        if (z && (anonymousClass092 instanceof AnonymousClass095) && ((AnonymousClass097) anonymousClass092).A02 != null) {
            C1T9 c1t92 = new C1T9();
            c1t92.A05 = 4 | c1t92.A05;
            C005402l c005402l2 = new C005402l(context, null);
            c1t92.A00(c005402l2);
            c1t9.A0D.add(c005402l2.A01());
        }
        if (z3) {
            C27661Og A08 = c0c9.A08((AbstractC005302j) c06c.A03(AbstractC005302j.class), 1L, 20, -1L);
            Cursor cursor = A08.A00;
            String str = "";
            if (cursor != null) {
                try {
                    if (cursor.moveToLast()) {
                        if (c05o.A08((AbstractC005302j) c06c.A03(AbstractC005302j.class), A08.A01)) {
                            charSequence = TextUtils.concat("", "…");
                        } else {
                            charSequence = "";
                        }
                        do {
                            Cursor cursor2 = A08.A00;
                            Jid A03 = c06c.A03(AbstractC005302j.class);
                            if (A03 != null) {
                                AnonymousClass092 A0D = c0c9.A0D(cursor2, (AbstractC005302j) A03);
                                String A0E = A0D != null ? c0du.A0E(A0D, c06c, false, true) : "";
                                if (A0E != "") {
                                    if (charSequence != "") {
                                        charSequence = TextUtils.concat(charSequence, "\n\n");
                                    }
                                    charSequence = TextUtils.concat(charSequence, A0E);
                                }
                            } else {
                                throw null;
                            }
                        } while (A08.A00.moveToPrevious());
                        str = charSequence;
                    }
                } finally {
                    A08.A00.close();
                }
            }
            C005402l c005402l3 = new C005402l(context, null);
            C05170Np c05170Np = new C05170Np();
            c05170Np.A07(str);
            c005402l3.A08(c05170Np);
            C1T9 c1t93 = new C1T9();
            c1t93.A05 = 8 | c1t93.A05;
            c1t93.A00(c005402l3);
            c1t9.A0D.add(c005402l3.A01());
        }
        if (z4) {
            C12830k9 c12830k9 = new C12830k9("android_wear_voice_input", context.getString(R.string.reply_to_label, c018708s.A08(c06c, false)), c002301c.A0O(AndroidWear.A09), new Bundle(), new HashSet());
            C12760k1 c12760k1 = new C12760k1(R.drawable.ic_full_reply, c12830k9.A01, PendingIntent.getService(context, 0, new Intent("com.whatsapp.intent.action.REPLY", ContentUris.withAppendedId(C50512Sb.A00, c06c.A01()), context, AndroidWear.class), 134217728));
            ArrayList arrayList = c12760k1.A01;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c12760k1.A01 = arrayList;
            }
            arrayList.add(c12830k9);
            c1t9.A0C.add(c12760k1.A00());
        }
        c1t9.A0C.add(AndroidWear.A00(context, c06c));
        if (bitmap != null) {
            c1t9.A09 = bitmap;
        }
        c1t9.A00(c005402l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:256:0x0167, code lost:
        if (A0A((X.AbstractC005302j) r2.A03(X.AbstractC005302j.class), r4, r8.A0C) == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x02b4, code lost:
        if (r1 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x02b7, code lost:
        if (r0 == false) goto L204;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:307:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x052a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A08(java.util.ArrayList r38, boolean r39, boolean r40, int r41, int r42, java.lang.StringBuilder r43, boolean r44, int r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 1327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC460224q.A08(java.util.ArrayList, boolean, boolean, int, int, java.lang.StringBuilder, boolean, int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x012a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A09(X.C005402l r18, X.C06C r19, X.AnonymousClass092 r20, boolean r21, boolean r22, java.lang.StringBuilder r23) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC460224q.A09(X.02l, X.06C, X.092, boolean, boolean, java.lang.StringBuilder):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x002d, code lost:
        if ((r5 + 86400000) >= r7) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0A(X.AbstractC005302j r11, int r12, long r13) {
        /*
            r10 = this;
            r9 = 0
            r0 = 50
            if (r12 > r0) goto L6
            return r9
        L6:
            X.00h r0 = r10.A0K
            android.content.SharedPreferences r3 = r0.A00
            java.lang.String r0 = "last_read_conversation_time"
            r1 = 0
            long r7 = r3.getLong(r0, r1)
            X.05M r0 = r10.A0M
            long r5 = r0.A06(r11)
            long r13 = r13 - r5
            r3 = 300000(0x493e0, double:1.482197E-318)
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            r3 = 0
            if (r0 >= 0) goto L22
            r3 = 1
        L22:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L2f
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r5 = r5 + r0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L30
        L2f:
            r0 = 0
        L30:
            if (r3 != 0) goto L34
            if (r0 == 0) goto L35
        L34:
            r9 = 1
        L35:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC460224q.A0A(X.02j, int, long):boolean");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RunnableC460224q.class != obj.getClass()) {
            return false;
        }
        RunnableC460224q runnableC460224q = (RunnableC460224q) obj;
        AnonymousClass092 anonymousClass092 = this.A0Y;
        AnonymousClass092 anonymousClass0922 = runnableC460224q.A0Y;
        return (anonymousClass092 == anonymousClass0922 || !(anonymousClass092 == null || anonymousClass0922 == null || !anonymousClass0922.A0n.equals(anonymousClass092.A0n))) && this.A0h == runnableC460224q.A0h && this.A0i == runnableC460224q.A0i && this.A0j == runnableC460224q.A0j && AnonymousClass024.A0l(this.A0T, runnableC460224q.A0T) && this.A00 == runnableC460224q.A00 && this.A0g == runnableC460224q.A0g;
    }

    public int hashCode() {
        AnonymousClass092 anonymousClass092 = this.A0Y;
        int hashCode = (((((((anonymousClass092 == null ? 0 : anonymousClass092.hashCode()) * 31) + (this.A0j ? 1 : 0)) * 31) + (this.A0i ? 1 : 0)) * 31) + (this.A0h ? 1 : 0)) * 31;
        AbstractC005302j abstractC005302j = this.A0T;
        return ((((hashCode + (abstractC005302j != null ? abstractC005302j.hashCode() : 0)) * 31) + this.A00) * 31) + (this.A0g ? 1 : 0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(48:221|(49:223|(2:227|(1:229))|230|(2:236|(4:238|(2:239|(3:241|(3:249|250|251)|252)(1:256))|257|(1:259)))|260|(1:262)|553|264|(1:266)|552|(2:273|(2:275|(35:277|278|(2:281|(9:283|(1:285)|342|(1:288)|341|(1:339)(1:(2:328|329))|(5:298|(2:318|(1:320))(2:304|(1:306)(1:317))|(1:310)|311|(2:313|(1:316)))|321|(2:323|(1:325)(1:326))(1:327))(1:343))|344|(1:346)|549|(1:548)(1:351)|352|(2:537|(2:542|(1:547)(1:546)))(1:365)|366|(3:(1:535)(1:373)|(1:534)(1:(1:386)(1:533))|387)(1:536)|388|(3:390|(1:392)(1:394)|393)|395|396|397|(4:401|(1:403)|404|(18:408|(2:410|411)|412|(8:415|(1:445)(1:426)|(1:428)|444|(1:431)|432|(1:434)(1:443)|(2:436|(1:(1:442))(1:439)))|446|(3:448|(1:454)|(1:456))|457|(1:459)|460|(4:463|(3:466|(1:468)(3:469|470|471)|464)|472|473)|474|475|476|(1:505)(1:479)|480|481|(1:484)|(1:486)(4:487|(2:489|(2:491|(1:493)))(1:503)|(1:495)|(4:497|(1:499)|500|501)(1:502))))|527|412|(9:415|(0)|445|(0)|444|(0)|432|(0)(0)|(0))|446|(0)|457|(0)|460|(4:463|(1:464)|472|473)|474|475|476|(0)|505|480|481|(1:484)|(0)(0)))(1:550))|551|278|(2:281|(0)(0))|344|(0)|549|(1:349)|548|352|(0)|537|(3:542|(1:544)|547)|366|(0)(0)|388|(0)|395|396|397|(5:399|401|(0)|404|(20:406|408|(0)|412|(0)|446|(0)|457|(0)|460|(0)|474|475|476|(0)|505|480|481|(0)|(0)(0)))|527|412|(0)|446|(0)|457|(0)|460|(0)|474|475|476|(0)|505|480|481|(0)|(0)(0))|554|260|(0)|553|264|(0)|552|(3:269|273|(0)(0))|551|278|(0)|344|(0)|549|(0)|548|352|(0)|537|(0)|366|(0)(0)|388|(0)|395|396|397|(0)|527|412|(0)|446|(0)|457|(0)|460|(0)|474|475|476|(0)|505|480|481|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:1042:0x0b0d, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1043:0x0b0e, code lost:
        r2 = X.C000200d.A0P("messagenotification/postSummaryNotification uid=");
        r2.append(android.os.Process.myUid());
        com.whatsapp.util.Log.i(r2.toString(), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1044:0x0b26, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 28) goto L509;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1045:0x0b28, code lost:
        if (r1 != null) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1046:0x0b2a, code lost:
        if (r0 != null) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1047:0x0b2c, code lost:
        r0 = X.C003101m.A0B(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1048:0x0b30, code lost:
        if (r0 != null) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1054:0x0b48, code lost:
        if (r0.A0H == false) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1055:0x0b4a, code lost:
        r0 = r0.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:1056:0x0b4e, code lost:
        r0.A0M(r0.A0C, android.provider.Settings.System.DEFAULT_NOTIFICATION_URI.toString());
        com.whatsapp.util.Log.i("chat-settings-store/set-underlying-message-tone-to-default updated message tone to default");
     */
    /* JADX WARN: Code restructure failed: missing block: B:1064:0x0bac, code lost:
        if (X.C0K7.A06(r6.toString()) == false) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1065:0x0bae, code lost:
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1082:0x0c2f, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1083:0x0c30, code lost:
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x004b, code lost:
        if (r0.A0H == false) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x02b5, code lost:
        if (r13 < 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x0320, code lost:
        if (r7 == null) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:804:0x05ef, code lost:
        if (r1.contains(r0.A03) == false) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x05fd, code lost:
        if (r0.A0A() != null) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:0x0663, code lost:
        if (r31 != false) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:833:0x066d, code lost:
        if (r0 == 0) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:842:0x069d, code lost:
        if (r1 == false) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:871:0x0771, code lost:
        if (r0.A00.A1g == false) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:972:0x095c, code lost:
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:973:0x095d, code lost:
        com.whatsapp.util.Log.e("androidwear/pairedcheck/failed", r12);
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:992:0x09ae, code lost:
        if (A0A((X.AbstractC005302j) r7.A03(X.AbstractC005302j.class), r47.A0M.A01(r8), r6.A0C) == false) goto L444;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:1000:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:1006:0x09df  */
    /* JADX WARN: Removed duplicated region for block: B:1017:0x0a2e  */
    /* JADX WARN: Removed duplicated region for block: B:1020:0x0a39 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:1024:0x0a4f  */
    /* JADX WARN: Removed duplicated region for block: B:1030:0x0ac7  */
    /* JADX WARN: Removed duplicated region for block: B:1038:0x0af2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:1059:0x0b88 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:1062:0x0ba3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:1066:0x0baf  */
    /* JADX WARN: Removed duplicated region for block: B:1086:0x0c33  */
    /* JADX WARN: Removed duplicated region for block: B:1087:0x0c34  */
    /* JADX WARN: Removed duplicated region for block: B:803:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:808:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:818:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:823:0x0638 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:826:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:870:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:874:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:879:0x07a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:893:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:912:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:924:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:927:0x0876 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:959:0x0914 A[Catch: Exception -> 0x095c, all -> 0x0c31, TryCatch #3 {Exception -> 0x095c, blocks: (B:957:0x090e, B:959:0x0914, B:961:0x091a, B:963:0x091e, B:964:0x0931, B:966:0x0935, B:968:0x093b), top: B:1100:0x090e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:963:0x091e A[Catch: Exception -> 0x095c, all -> 0x0c31, TryCatch #3 {Exception -> 0x095c, blocks: (B:957:0x090e, B:959:0x0914, B:961:0x091a, B:963:0x091e, B:964:0x0931, B:966:0x0935, B:968:0x093b), top: B:1100:0x090e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:970:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:977:0x0973 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:991:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:995:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:998:0x09b9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 3192
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC460224q.run():void");
    }
}
