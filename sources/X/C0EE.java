package X;

import com.whatsapp.util.Log;

/* renamed from: X.0EE */
/* loaded from: classes.dex */
public class C0EE {
    public static volatile C0EE A08;
    public Boolean A00;
    public final AbstractC000600i A01;
    public final C01B A02;
    public final C000500h A03;
    public final C05E A04;
    public final C05C A05;
    public final C003701t A06;
    public final AnonymousClass011 A07;

    public C0EE(C003701t c003701t, AbstractC000600i abstractC000600i, AnonymousClass011 anonymousClass011, C01B c01b, C05C c05c, C05E c05e, C000500h c000500h) {
        this.A06 = c003701t;
        this.A01 = abstractC000600i;
        this.A07 = anonymousClass011;
        this.A02 = c01b;
        this.A05 = c05c;
        this.A04 = c05e;
        this.A03 = c000500h;
    }

    public static C0EE A00() {
        if (A08 == null) {
            synchronized (C0EE.class) {
                if (A08 == null) {
                    A08 = new C0EE(C003701t.A00(), AbstractC000600i.A00(), AnonymousClass011.A00(), C01B.A00(), C05C.A00(), C05E.A00(), C000500h.A00());
                }
            }
        }
        return A08;
    }

    public synchronized void A01(boolean z) {
        this.A00 = Boolean.valueOf(z);
        this.A03.A0D().putBoolean("md_messaging_enabled", z).apply();
    }

    public boolean A02() {
        if (A04()) {
            return this.A02.A07(C01C.A3K) == 3 || this.A03.A0k();
        }
        return false;
    }

    public boolean A03() {
        if (A04()) {
            int A07 = this.A02.A07(C01C.A3K);
            return A07 == 1 || A07 == 2 || A07 == 4;
        }
        return false;
    }

    public synchronized boolean A04() {
        if (this.A00 == null) {
            boolean z = true;
            if (this.A03.A00.getBoolean("md_messaging_enabled", false)) {
                A01(true);
            } else {
                C05E c05e = this.A04;
                c05e.A05();
                if (!c05e.A01) {
                    Log.w("MultiDeviceConfig/isMultiDeviceMessagingEnabled/message store isn't ready yet");
                    this.A01.A09("md-check-msgstore-not-ready", "true", true);
                    return false;
                }
                C05C c05c = this.A05;
                String A02 = c05c.A02("participant_user_ready");
                z = (A02 == null || Integer.parseInt(A02) != 2) ? false : false;
                StringBuilder sb = new StringBuilder();
                sb.append("MultiDeviceConfig/isMultiDeviceMessagingEnabled/M-D enabled: ");
                sb.append(z);
                Log.i(sb.toString());
                if (!z) {
                    C37171lz c37171lz = new C37171lz();
                    String A022 = c05c.A02("participant_user_ready");
                    c37171lz.A00 = Long.valueOf(A022 == null ? 0 : Integer.parseInt(A022));
                    this.A07.A0B(c37171lz, null, false);
                }
                A01(z);
            }
        }
        return this.A00.booleanValue();
    }
}
