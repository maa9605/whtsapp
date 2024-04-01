package X;

import android.app.Application;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: X.0LM */
/* loaded from: classes.dex */
public class C0LM {
    public static volatile C0LM A0E;
    public final AbstractC000600i A00;
    public final C02L A01;
    public final C01B A02;
    public final C05W A03;
    public final AnonymousClass075 A04;
    public final C018708s A05;
    public final C001200o A06;
    public final C002301c A07;
    public final C0C8 A08;
    public final C018808t A09;
    public final C0EE A0A;
    public final C03740Gw A0B;
    public final C003401q A0C;
    public final C460524t A0D;

    public C0LM(AbstractC000600i abstractC000600i, C02L c02l, C001200o c001200o, C003401q c003401q, C01B c01b, C05W c05w, C018708s c018708s, C002301c c002301c, C0EE c0ee, C018808t c018808t, AnonymousClass075 anonymousClass075, C03740Gw c03740Gw, C0C8 c0c8, C460524t c460524t) {
        this.A00 = abstractC000600i;
        this.A01 = c02l;
        this.A06 = c001200o;
        this.A0C = c003401q;
        this.A02 = c01b;
        this.A03 = c05w;
        this.A05 = c018708s;
        this.A07 = c002301c;
        this.A0A = c0ee;
        this.A09 = c018808t;
        this.A04 = anonymousClass075;
        this.A0B = c03740Gw;
        this.A08 = c0c8;
        this.A0D = c460524t;
    }

    public static C0LM A00() {
        if (A0E == null) {
            synchronized (C0LM.class) {
                if (A0E == null) {
                    A0E = new C0LM(AbstractC000600i.A00(), C02L.A00(), C001200o.A01, C003401q.A00(), C01B.A00(), C05W.A00(), C018708s.A00(), C002301c.A00(), C0EE.A00(), C018808t.A00(), AnonymousClass075.A00(), C03740Gw.A00(), C0C8.A00(), C460524t.A00());
                }
            }
        }
        return A0E;
    }

    public final String A01(C06C c06c) {
        String A08 = this.A05.A08(c06c, false);
        if (A08 == null) {
            return null;
        }
        return this.A07.A0E(A08);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x000b, code lost:
        if (r11 == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A02(X.AbstractC005302j r10, boolean r11, int r12) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LM.A02(X.02j, boolean, int):java.lang.String");
    }

    public final String A03(AnonymousClass094 anonymousClass094, int i, int i2) {
        if (anonymousClass094.A02) {
            return this.A0C.A03(null, i, new Object[0]);
        }
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        if (abstractC005302j != null) {
            return this.A0C.A03(abstractC005302j, i2, A01(this.A03.A0A(abstractC005302j)));
        }
        return "";
    }

    public final String A04(C04300Jq c04300Jq, int i, int i2) {
        List list = ((C04360Jw) c04300Jq).A01;
        if (list.size() == 1 && this.A01.A0A((Jid) list.get(0))) {
            return this.A06.A00.getString(i);
        }
        C002301c c002301c = this.A07;
        return String.format(c002301c.A0I(), c002301c.A08(i2, list.size()), c002301c.A0E(this.A05.A0C(list)));
    }

    public final String A05(C04300Jq c04300Jq, String str, int i, int i2, int i3) {
        if (C003101m.A0P(c04300Jq.A0n.A00)) {
            return this.A0C.A03(c04300Jq.A0A(), i, str);
        }
        if (this.A01.A0A(c04300Jq.A0A())) {
            return this.A06.A00.getString(i2);
        }
        return this.A0C.A03(c04300Jq.A0A(), i3, str);
    }

    public final String A06(C04300Jq c04300Jq, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        List list = ((C04360Jw) c04300Jq).A01;
        if (C003101m.A0P(c04300Jq.A0n.A00)) {
            C002301c c002301c = this.A07;
            return String.format(c002301c.A0I(), c002301c.A08(i6, list.size()), c002301c.A0E(this.A05.A0C(list)));
        }
        C02L c02l = this.A01;
        if (c02l.A0A(c04300Jq.A0A())) {
            return this.A06.A00.getString(i, this.A07.A0E(this.A05.A0C(list)));
        }
        if (str == null) {
            if (list.size() == 1 && c02l.A0A((Jid) list.get(0))) {
                return this.A06.A00.getString(i2);
            }
            return this.A06.A00.getString(i3, this.A07.A0E(this.A05.A0C(list)));
        } else if (list.size() == 1 && c02l.A0A((Jid) list.get(0))) {
            return this.A0C.A03(c04300Jq.A0A(), i4, str);
        } else {
            return this.A0C.A03(c04300Jq.A0A(), i5, str, this.A07.A0E(this.A05.A0C(list)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:1020:0x0a4e, code lost:
        if (X.AnonymousClass024.A0E(r1).equals(X.AnonymousClass024.A0E(r5)) == false) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1023:0x0a52, code lost:
        if (r0 != false) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1186:0x0da2, code lost:
        if (r5.lastIndexOf("\"") > r5.indexOf("\"")) goto L577;
     */
    /* JADX WARN: Removed duplicated region for block: B:1000:0x09d0  */
    /* JADX WARN: Removed duplicated region for block: B:1008:0x0a10  */
    /* JADX WARN: Removed duplicated region for block: B:1102:0x0b89  */
    /* JADX WARN: Removed duplicated region for block: B:1114:0x0bc4  */
    /* JADX WARN: Removed duplicated region for block: B:1125:0x0bef  */
    /* JADX WARN: Removed duplicated region for block: B:1127:0x0bfa  */
    /* JADX WARN: Removed duplicated region for block: B:1129:0x0c05  */
    /* JADX WARN: Removed duplicated region for block: B:1131:0x0c1c  */
    /* JADX WARN: Removed duplicated region for block: B:1133:0x0c3c  */
    /* JADX WARN: Removed duplicated region for block: B:1135:0x0c53  */
    /* JADX WARN: Removed duplicated region for block: B:1145:0x0cb3  */
    /* JADX WARN: Removed duplicated region for block: B:1147:0x0cba  */
    /* JADX WARN: Removed duplicated region for block: B:1153:0x0d05  */
    /* JADX WARN: Removed duplicated region for block: B:1161:0x0d24  */
    /* JADX WARN: Removed duplicated region for block: B:1163:0x0d32  */
    /* JADX WARN: Removed duplicated region for block: B:1169:0x0d5c  */
    /* JADX WARN: Removed duplicated region for block: B:1171:0x0d6a  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:776:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:784:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:791:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:793:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:805:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:817:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:828:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:830:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:832:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:834:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:836:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:838:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:856:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:861:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:863:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:865:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:882:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:909:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:911:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:913:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:915:0x07f7  */
    /* JADX WARN: Removed duplicated region for block: B:917:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:923:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:929:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:935:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:941:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:943:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:971:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:973:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:975:0x0955  */
    /* JADX WARN: Removed duplicated region for block: B:977:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:979:0x097d  */
    /* JADX WARN: Removed duplicated region for block: B:981:0x0989  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A07(X.C04300Jq r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 4092
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LM.A07(X.0Jq, boolean):java.lang.String");
    }

    public final String A08(C04370Jx c04370Jx, C06C c06c, String str, boolean z) {
        UserJid userJid = c04370Jx.A00;
        UserJid userJid2 = c04370Jx.A01;
        if (userJid2 != null) {
            userJid2.getRawString();
        }
        if (z) {
            if (c06c.A0A()) {
                if (userJid != null) {
                    String A02 = C04630Le.A02(userJid);
                    Application application = this.A06.A00;
                    Object[] objArr = new Object[2];
                    objArr[0] = str.replace(' ', (char) 160);
                    if (A02 != null) {
                        objArr[1] = this.A07.A0F(A02.replace(' ', (char) 160));
                        return application.getString(R.string.group_participant_changed_number_unknown_name, objArr);
                    }
                    throw null;
                }
                throw null;
            }
            return this.A06.A00.getString(R.string.group_participant_changed_number_known_name, str);
        } else if (userJid2 == null) {
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
            Object[] objArr2 = new Object[2];
            objArr2[0] = userJid == null ? "null" : "not-null";
            objArr2[1] = simpleDateFormat.format(new Date(c04370Jx.A0E));
            this.A00.A09("sys-msg/number-change/render-issue", String.format(locale, "oldJid=nul, newJid=%s, date=%s", objArr2), false);
            return "";
        } else {
            boolean equals = userJid2.equals(c04370Jx.A0n.A00);
            int i = R.string.chat_changed_number_new;
            if (equals) {
                i = R.string.chat_changed_number_old;
            }
            if (c06c.A0A()) {
                return this.A06.A00.getString(i, str.replace(' ', (char) 160));
            }
            return this.A06.A00.getString(i, str);
        }
    }

    public final String A09(boolean z, int i) {
        if (i <= 0) {
            C003401q c003401q = this.A0C;
            int i2 = R.string.ephemeral_setting_disabled;
            if (z) {
                i2 = R.string.ephemeral_setting_disabled_tap_to_change;
            }
            return c003401q.A03(null, i2, new Object[0]);
        }
        int i3 = R.plurals.ephemeral_setting_enabled_in_seconds;
        if (z) {
            i3 = R.plurals.ephemeral_setting_enabled_in_seconds_tap_to_change;
        }
        if (i > 86400) {
            i /= 86400;
            i3 = R.plurals.ephemeral_setting_enabled_in_days;
            if (z) {
                i3 = R.plurals.ephemeral_setting_enabled_in_days_tap_to_change;
            }
        } else if (i >= 3600) {
            i /= 3600;
            i3 = R.plurals.ephemeral_setting_enabled_in_hours;
            if (z) {
                i3 = R.plurals.ephemeral_setting_enabled_in_hours_tap_to_change;
            }
        } else if (i >= 60) {
            i /= 60;
            i3 = R.plurals.ephemeral_setting_enabled_in_minutes;
            if (z) {
                i3 = R.plurals.ephemeral_setting_enabled_in_minutes_tap_to_change;
            }
        }
        return this.A0C.A02(null, i3, i, Integer.valueOf(i));
    }
}
