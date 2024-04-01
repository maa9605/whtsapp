package X;

import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0EA  reason: invalid class name */
/* loaded from: classes.dex */
public class C0EA {
    public static volatile C0EA A08;
    public final C01B A00;
    public final AnonymousClass075 A01;
    public final AnonymousClass012 A02;
    public final C05M A03;
    public final C05C A04;
    public final C0FN A05;
    public final AnonymousClass011 A06;
    public final C0EY A07;

    public C0EA(AnonymousClass012 anonymousClass012, C0FN c0fn, C05M c05m, AnonymousClass011 anonymousClass011, C01B c01b, C05C c05c, AnonymousClass075 anonymousClass075, C0EY c0ey) {
        this.A02 = anonymousClass012;
        this.A05 = c0fn;
        this.A03 = c05m;
        this.A06 = anonymousClass011;
        this.A00 = c01b;
        this.A04 = c05c;
        this.A01 = anonymousClass075;
        this.A07 = c0ey;
    }

    public static C0EA A00() {
        if (A08 == null) {
            synchronized (C0EA.class) {
                if (A08 == null) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    if (C0FN.A04 == null) {
                        synchronized (C0FN.class) {
                            if (C0FN.A04 == null) {
                                C0FN.A04 = new C0FN(C05A.A00(), C05M.A00(), C06T.A02, C05N.A00());
                            }
                        }
                    }
                    A08 = new C0EA(A00, C0FN.A04, C05M.A00(), AnonymousClass011.A00(), C01B.A00(), C05C.A00(), AnonymousClass075.A00(), C0EY.A00());
                }
            }
        }
        return A08;
    }

    public final int A01(AbstractC005302j abstractC005302j) {
        if (C003101m.A0Y(abstractC005302j)) {
            return 1;
        }
        C0IT A07 = this.A03.A07(abstractC005302j);
        int i = !A05(abstractC005302j);
        if (A07 == null) {
            return i ^ 1;
        }
        if (i != 0) {
            return A07.A02;
        }
        return 1;
    }

    public final List A02() {
        String A02 = this.A04.A02("call_not_spam_jids");
        if (A02 == null || A02.length() <= 0) {
            return null;
        }
        return C003101m.A0F(AbstractC005302j.class, Arrays.asList(A02.split(",")));
    }

    public final void A03(AbstractC005302j abstractC005302j, Integer num) {
        C37491mV c37491mV = new C37491mV();
        c37491mV.A00 = num;
        c37491mV.A01 = 1;
        c37491mV.A02 = abstractC005302j.getRawString();
        AnonymousClass011 anonymousClass011 = this.A06;
        anonymousClass011.A0B(c37491mV, null, false);
        anonymousClass011.A03();
    }

    public void A04(AbstractC005302j abstractC005302j, boolean z, Integer num) {
        C0EY c0ey = this.A07;
        long A05 = this.A02.A05();
        if (c0ey != null) {
            try {
                JSONObject A02 = c0ey.A02(abstractC005302j);
                if (A02 == null) {
                    A02 = new JSONObject();
                }
                A02.put("tb_last_action_ts", A05);
                c0ey.A03(abstractC005302j, A02);
            } catch (JSONException unused) {
            }
            if (z) {
                A03(abstractC005302j, num);
                return;
            }
            return;
        }
        throw null;
    }

    public boolean A05(AbstractC005302j abstractC005302j) {
        if (abstractC005302j == null) {
            StringBuilder sb = new StringBuilder("spamManager/isCallNotSpamProp/invalid jid: ");
            sb.append(abstractC005302j);
            Log.e(sb.toString());
            return false;
        }
        List A02 = A02();
        return A02 != null && A02.contains(abstractC005302j);
    }

    public boolean A06(AbstractC005302j abstractC005302j) {
        int A01 = A01(abstractC005302j);
        return A01 == -1 || A01 == -2 || A01 == 0;
    }

    public boolean A07(AbstractC005302j abstractC005302j) {
        C0EY c0ey = this.A07;
        long A05 = this.A02.A05();
        if (c0ey != null) {
            try {
                JSONObject A02 = c0ey.A02(abstractC005302j);
                if (A02 == null || !A02.has("tb_expired_ts") || !A02.has("tb_cooldown") || A02.getLong("tb_expired_ts") < A05) {
                    return false;
                }
                if (A02.has("tb_last_action_ts")) {
                    if (A02.getLong("tb_last_action_ts") + A02.getLong("tb_cooldown") > A05) {
                        return false;
                    }
                }
                return true;
            } catch (JSONException unused) {
                return false;
            }
        }
        throw null;
    }
}
