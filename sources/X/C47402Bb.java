package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.Map;
import java.util.Random;

/* renamed from: X.2Bb */
/* loaded from: classes2.dex */
public class C47402Bb {
    public static volatile C47402Bb A0C;
    public SharedPreferences A00;
    public final C05W A01;
    public final AnonymousClass075 A02;
    public final C2BF A03;
    public final AnonymousClass012 A04;
    public final C05M A05;
    public final C0C9 A06;
    public final C43081wp A07;
    public final AnonymousClass011 A08;
    public final C02O A09;
    public final C0CB A0A;
    public final InterfaceC002901k A0B;

    public C47402Bb(AnonymousClass012 anonymousClass012, InterfaceC002901k interfaceC002901k, C05M c05m, AnonymousClass011 anonymousClass011, C05W c05w, C0C9 c0c9, C0CB c0cb, C43081wp c43081wp, AnonymousClass075 anonymousClass075, C41651uI c41651uI, C02O c02o) {
        C47462Bh c47462Bh = new C47462Bh(this);
        this.A03 = c47462Bh;
        this.A04 = anonymousClass012;
        this.A0B = interfaceC002901k;
        this.A05 = c05m;
        this.A08 = anonymousClass011;
        this.A01 = c05w;
        this.A06 = c0c9;
        this.A0A = c0cb;
        this.A07 = c43081wp;
        this.A02 = anonymousClass075;
        this.A09 = c02o;
        c41651uI.A00(c47462Bh);
    }

    public static C47402Bb A00() {
        if (A0C == null) {
            synchronized (C47402Bb.class) {
                if (A0C == null) {
                    A0C = new C47402Bb(AnonymousClass012.A00(), C002801j.A00(), C05M.A00(), AnonymousClass011.A00(), C05W.A00(), C0C9.A00(), C0CB.A00(), C43081wp.A00(), AnonymousClass075.A00(), C41651uI.A00, C02O.A00());
                }
            }
        }
        return A0C;
    }

    public static void A01(C47402Bb c47402Bb, AbstractC005302j abstractC005302j, boolean z, boolean z2) {
        long j;
        long j2;
        long j3;
        long j4;
        synchronized (c47402Bb) {
            SharedPreferences A02 = c47402Bb.A02();
            String rawString = abstractC005302j.getRawString();
            long j5 = 0;
            if (A02.contains(rawString)) {
                String[] split = A02.getString(rawString, "0,0,0,0").split(",");
                int length = split.length;
                if (length >= 2) {
                    j2 = AnonymousClass024.A03(split[0], 0L);
                    j4 = AnonymousClass024.A03(split[1], 0L);
                } else {
                    j2 = 0;
                    j4 = 0;
                }
                if (length == 4) {
                    j3 = AnonymousClass024.A03(split[2], 0L);
                    j = AnonymousClass024.A03(split[3], 0L);
                    j5 = j4;
                } else {
                    j = 0;
                    j5 = j4;
                    j3 = 0;
                }
            } else {
                j = 0;
                j2 = 0;
                j3 = 0;
            }
            if (z) {
                j2++;
                if (z2) {
                    j3++;
                }
            } else {
                j5++;
                if (z2) {
                    j++;
                }
            }
            SharedPreferences.Editor edit = A02.edit();
            StringBuilder sb = new StringBuilder();
            sb.append(j2);
            sb.append(",");
            sb.append(j5);
            sb.append(",");
            sb.append(j3);
            sb.append(",");
            sb.append(j);
            edit.putString(rawString, sb.toString()).apply();
        }
    }

    public final SharedPreferences A02() {
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            SharedPreferences A01 = this.A09.A01("chatCounts");
            this.A00 = A01;
            return A01;
        }
        return sharedPreferences;
    }

    public synchronized void A03() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        SharedPreferences A02 = A02();
        long j5 = 0;
        long j6 = A02.getLong("start_time_ms", 0L);
        long A05 = this.A04.A05();
        if (j6 == 0) {
            A02.edit().putLong("start_time_ms", A05 - new Random().nextInt(86400000)).apply();
            return;
        }
        long j7 = A05 - j6;
        if (j7 < 86400000) {
            return;
        }
        for (Map.Entry<String, ?> entry : A02.getAll().entrySet()) {
            String key = entry.getKey();
            if (!"start_time_ms".equals(key) && (entry.getValue() instanceof String)) {
                String[] split = ((String) entry.getValue()).split(",");
                boolean z = false;
                if (split.length >= 2) {
                    j = AnonymousClass024.A03(split[0], j5);
                    j2 = AnonymousClass024.A03(split[1], j5);
                } else {
                    j = 0;
                    j2 = 0;
                }
                if (split.length == 4) {
                    j4 = AnonymousClass024.A03(split[2], j5);
                    j3 = AnonymousClass024.A03(split[3], j5);
                } else {
                    j3 = 0;
                    j4 = 0;
                }
                C0PC c0pc = new C0PC();
                c0pc.A0D = Long.valueOf(j6 / 1000);
                c0pc.A0A = Long.valueOf(j);
                c0pc.A09 = Long.valueOf(j2);
                c0pc.A08 = Long.valueOf(j4);
                c0pc.A07 = Long.valueOf(j3);
                AbstractC005302j A022 = AbstractC005302j.A02(key);
                if (A022 != null) {
                    C06C A09 = this.A01.A09(A022);
                    if (A09 != null && A09.A0C()) {
                        c0pc.A01 = Boolean.TRUE;
                        UserJid A0D = this.A01.A0D((GroupJid) A09.A03(GroupJid.class));
                        if (A0D != null) {
                            A09 = this.A01.A09(A0D);
                        } else {
                            A09 = null;
                        }
                    } else {
                        c0pc.A01 = Boolean.FALSE;
                    }
                    boolean A092 = this.A0A.A07(A022).A09();
                    boolean z2 = this.A0A.A07(A022).A0F;
                    if (A09 != null && A09.A08 != null) {
                        z = true;
                    }
                    c0pc.A00 = Boolean.valueOf(z);
                    if (A092) {
                        i = 2;
                        if (z2) {
                            i = 3;
                        }
                    } else {
                        i = 1;
                    }
                    c0pc.A04 = Integer.valueOf(i);
                    if (A09 != null && A09.A0B()) {
                        c0pc.A05 = 2;
                        UserJid userJid = (UserJid) A09.A03(UserJid.class);
                        if (A09.A09() && userJid != null && this.A02.A02(userJid)) {
                            c0pc.A05 = 3;
                        }
                    } else {
                        c0pc.A05 = 1;
                    }
                    c0pc.A03 = Boolean.valueOf(this.A0A.A07(A022).A0E);
                    c0pc.A02 = Boolean.valueOf(this.A05.A0F(A022));
                    c0pc.A0C = Long.valueOf(this.A05.A01(A022));
                    c0pc.A0B = Long.valueOf(this.A07.A01(A022));
                    c0pc.A06 = Long.valueOf(AnonymousClass029.A05(this.A05, this.A01, A022));
                    this.A08.A09(c0pc, 1);
                    AnonymousClass011.A01(c0pc, "");
                }
            }
            j5 = 0;
        }
        long j8 = j6 + 86400000;
        if (A05 > j8 + 86400000) {
            long j9 = j7 / 86400000;
            Long.signum(j9);
            j8 = (j9 * 86400000) + j6;
        }
        A02.edit().clear().putLong("start_time_ms", j8).apply();
    }
}
