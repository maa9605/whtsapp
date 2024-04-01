package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.util.List;

/* renamed from: X.2Te  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C50792Te {
    public static volatile C50792Te A0E;
    public final C03020Dv A00;
    public final C01B A01;
    public final C0L7 A02;
    public final C05W A03;
    public final C018708s A04;
    public final C011505r A05;
    public final C0L5 A06;
    public final C0LF A07;
    public final C02E A08;
    public final C001200o A09;
    public final C005102h A0A;
    public final C0C8 A0B;
    public final C0CB A0C;
    public final InterfaceC002901k A0D;

    public C50792Te(C001200o c001200o, InterfaceC002901k interfaceC002901k, C01B c01b, C0L5 c0l5, C0L7 c0l7, C05W c05w, C02E c02e, C018708s c018708s, C0CB c0cb, C011505r c011505r, C005102h c005102h, C0C8 c0c8, C03020Dv c03020Dv, C0LF c0lf) {
        this.A09 = c001200o;
        this.A0D = interfaceC002901k;
        this.A01 = c01b;
        this.A06 = c0l5;
        this.A02 = c0l7;
        this.A03 = c05w;
        this.A08 = c02e;
        this.A04 = c018708s;
        this.A0C = c0cb;
        this.A05 = c011505r;
        this.A0A = c005102h;
        this.A0B = c0c8;
        this.A00 = c03020Dv;
        this.A07 = c0lf;
    }

    public static C005402l A00(Context context, long j) {
        C005402l A00 = C0DU.A00(context);
        A00.A0I = "call";
        A00.A03 = 1;
        A00.A0V = j > 0;
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        A00.A07.when = j;
        return A00;
    }

    public static final CharSequence A01(Context context, int i, int i2, int i3) {
        String string = context.getString(i2);
        if (Build.VERSION.SDK_INT < 25 || i != 1) {
            return string;
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(context.getColor(i3)), 0, spannableString.length(), 0);
        return spannableString;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x02c7, code lost:
        if (r2 == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02cc, code lost:
        if (r3 != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02ce, code lost:
        r3 = r37.A07;
        r2 = com.google.android.search.verification.client.R.color.call_notification_action_end_joinable_call;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02d3, code lost:
        if (r3 != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02d5, code lost:
        r2 = com.google.android.search.verification.client.R.color.call_notification_action_end_call;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02d8, code lost:
        r10.A0N.add(new X.C07940aL(com.google.android.search.verification.client.R.drawable.ic_action_end_call, A01(r35, r36, r11, r2), r13));
        r13 = r37.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02e9, code lost:
        if (r13 == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02f1, code lost:
        if (X.AnonymousClass029.A1O(r34.A01) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02f3, code lost:
        r3 = A03(r35, r37, r36);
        r3.putExtra("lobbyEntryPoint", 2);
        r11 = r37.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02fe, code lost:
        if (r11 == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0300, code lost:
        r3.setAction(com.whatsapp.voipcalling.VoipActivityV2.A1r);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0305, code lost:
        r12 = android.app.PendingIntent.getActivity(r35, 2, r3, 134217728);
        r2 = r37.A0C;
        r3 = com.google.android.search.verification.client.R.drawable.ic_action_call;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0310, code lost:
        if (r2 == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0312, code lost:
        r3 = com.google.android.search.verification.client.R.drawable.ic_action_videocall;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x031b, code lost:
        if (X.AnonymousClass029.A1O(r34.A01) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x031d, code lost:
        if (r13 == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x031f, code lost:
        r2 = com.google.android.search.verification.client.R.string.voip_joinable_open;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0322, code lost:
        r10.A0N.add(new X.C07940aL(r3, A01(r35, r36, r2, com.google.android.search.verification.client.R.color.call_notification_action_accept), r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x035b, code lost:
        r2 = com.google.android.search.verification.client.R.string.answer_the_call;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x035e, code lost:
        if (r11 == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0360, code lost:
        r2 = com.google.android.search.verification.client.R.string.voip_call_waiting_end_and_accept;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0364, code lost:
        r3.setAction("join_call");
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x036a, code lost:
        r11 = r37.A0B;
        r3 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x036d, code lost:
        if (r11 == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x036f, code lost:
        r3 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0371, code lost:
        r3 = com.whatsapp.voipcalling.VoipActivityV2.A00(r35, r3, r37.A04, !r34.A00.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:
        if (r37.A07 != false) goto L138;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Notification A02(final android.content.Context r35, final int r36, X.C2U6 r37, final X.C41641uH r38) {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50792Te.A02(android.content.Context, int, X.2U6, X.1uH):android.app.Notification");
    }

    public Intent A03(Context context, C2U6 c2u6, int i) {
        Intent A01 = VoipActivityV2.A01(context, c2u6.A02, Boolean.valueOf(!this.A00.A00));
        String str = c2u6.A04;
        A01.setData(Uri.parse(str));
        A01.putExtra("notification_type", i);
        A01.putExtra("call_id", str);
        if (c2u6.A0B) {
            A01.setAction(VoipActivityV2.A1r);
        }
        if (c2u6.A08 && c2u6.A03 == Voip.CallState.NONE) {
            A01.putExtra("joinable", true);
        }
        return A01;
    }

    public final void A04(Context context, boolean z, C005402l c005402l, C2U6 c2u6, String str) {
        String quantityString;
        if (z) {
            c005402l.A0A(context.getString(R.string.app_name));
        } else if (str != null) {
            c005402l.A0A(str);
        } else if (c2u6 != null) {
            if (!c2u6.A07) {
                c005402l.A0A(C002701i.A0p(this.A04.A08(this.A03.A0A(c2u6.A02), false)));
            } else if (c2u6.A00 > 0) {
            } else {
                C05W c05w = this.A03;
                C06C A0A = c05w.A0A(c2u6.A02);
                List list = c2u6.A05;
                if (list.size() == 2) {
                    C06C A0A2 = c05w.A0A((AbstractC005302j) list.get(0));
                    C06C A0A3 = c05w.A0A((AbstractC005302j) list.get(1));
                    C018708s c018708s = this.A04;
                    quantityString = context.getString(R.string.voip_call_log_two_participants, c018708s.A04(A0A2), c018708s.A04(A0A3));
                } else {
                    quantityString = context.getResources().getQuantityString(R.plurals.group_voip_call_participants_label, list.size() - 1, this.A04.A04(A0A), Integer.valueOf(list.size() - 1));
                }
                c005402l.A0A(quantityString);
            }
        }
    }

    public final void A05(C005402l c005402l, C06C c06c, int i, C2U6 c2u6) {
        C03400Fo c03400Fo;
        Voip.CallState callState;
        if (Build.VERSION.SDK_INT >= 26) {
            C0CB c0cb = this.A0C;
            Jid A03 = c06c.A03(AbstractC005302j.class);
            if (A03 != null) {
                c03400Fo = (C03400Fo) c0cb.A07((AbstractC005302j) A03);
            } else {
                throw null;
            }
        } else {
            c03400Fo = null;
        }
        if (i == 1 || (c2u6.A08 && ((callState = c2u6.A03) == Voip.CallState.NONE || callState == Voip.CallState.ACTIVE_ELSEWHERE))) {
            c005402l.A03 = 1;
            if (Build.VERSION.SDK_INT >= 26) {
                if (c03400Fo != null) {
                    C03490Fx c03490Fx = C03390Fn.A0N;
                    String A00 = c03490Fx.A00("voip_notification");
                    if (A00 == null) {
                        A00 = c03400Fo.A0N.A09();
                    } else {
                        C03390Fn c03390Fn = c03400Fo.A0N;
                        if (c03390Fn != null) {
                            String A01 = c03490Fx.A01(A00);
                            if ("voip_notification".equals(A01) && C03500Fy.A00(c03390Fn.A05(), A00).getImportance() < 4) {
                                StringBuilder A0P = C000200d.A0P("chat-settings-store/repairVoIPNotificationChannel repairing channel:");
                                A0P.append(C003101m.A0A(A01));
                                Log.i(A0P.toString());
                                c03390Fn.A0E(A01);
                                A00 = c03390Fn.A09();
                            }
                        } else {
                            throw null;
                        }
                    }
                    c005402l.A0J = A00;
                } else {
                    throw null;
                }
            }
        } else if (i == 2) {
            if (Build.VERSION.SDK_INT >= 26) {
                c005402l.A0J = c03400Fo.A0D();
            }
        } else {
            StringBuilder sb = new StringBuilder("UNKNOWN NOTIFICATION TYPE ");
            sb.append(i);
            C000700j.A08(false, sb.toString());
        }
        ContentResolver A07 = this.A08.A07();
        if (A07 != null) {
            Uri A04 = this.A03.A04(c06c, A07);
            if (A04 != null) {
                c005402l.A0P.add(A04.toString());
                return;
            }
            return;
        }
        Log.w("voip/CallNotificationBuilder/addContactToNotification cr == null");
    }
}
