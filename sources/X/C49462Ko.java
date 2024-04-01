package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2Ko */
/* loaded from: classes2.dex */
public class C49462Ko {
    public static volatile C49462Ko A08;
    public String A00;
    public final C02L A01;
    public final AnonymousClass075 A02;
    public final AnonymousClass011 A03;
    public final Random A06 = new Random();
    public final AtomicInteger A07 = new AtomicInteger();
    public final HashSet A05 = new HashSet(Arrays.asList(31, 28, 30, 29, 32, 37, 33, 12, 4, 27, 35, 36, 34));
    public final AnonymousClass015 A04 = AnonymousClass014.DEFAULT_SAMPLING_RATE;

    public C49462Ko(C02L c02l, AnonymousClass011 anonymousClass011, AnonymousClass075 anonymousClass075) {
        this.A01 = c02l;
        this.A03 = anonymousClass011;
        this.A02 = anonymousClass075;
    }

    public static C49462Ko A00() {
        if (A08 == null) {
            synchronized (C49462Ko.class) {
                if (A08 == null) {
                    A08 = new C49462Ko(C02L.A00(), AnonymousClass011.A00(), AnonymousClass075.A00());
                }
            }
        }
        return A08;
    }

    public void A01(int i) {
        this.A00 = Long.toHexString(this.A06.nextLong());
        this.A07.set(i);
    }

    public void A02(int i, Integer num, String str, UserJid userJid) {
        A03(i, num, str, userJid, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A03(int i, Integer num, String str, UserJid userJid, Long l, String str2, Boolean bool, Integer num2, Boolean bool2) {
        C36711lF c36711lF;
        AnonymousClass015 anonymousClass015 = this.A04;
        boolean A01 = anonymousClass015.A01(this.A00);
        if (!this.A01.A0A(userJid)) {
            HashSet hashSet = this.A05;
            Integer valueOf = Integer.valueOf(i);
            if (!hashSet.contains(valueOf) && !A01) {
                return;
            }
            C36711lF c36711lF2 = new C36711lF();
            c36711lF2.A05 = valueOf;
            c36711lF2.A0A = this.A00;
            c36711lF2.A0C = str;
            c36711lF2.A06 = num2;
            c36711lF2.A08 = userJid.getRawString();
            c36711lF2.A07 = l;
            c36711lF2.A0B = str2;
            c36711lF2.A02 = bool;
            c36711lF2.A00 = bool2;
            if (!A01) {
                c36711lF2.A01 = Boolean.TRUE;
            }
            c36711lF2.A03 = Integer.valueOf(AnonymousClass088.A09(this.A02.A04.A0E(userJid)));
            int andSet = this.A07.getAndSet(0);
            if (andSet != 0) {
                c36711lF2.A04 = Integer.valueOf(andSet);
            }
            c36711lF2.A0C = null;
            c36711lF2.A08 = null;
            c36711lF2.A0B = null;
            c36711lF = c36711lF2;
        } else if (!A01) {
            return;
        } else {
            C36701lE c36701lE = new C36701lE();
            c36701lE.A02 = num;
            c36701lE.A06 = this.A00;
            c36701lE.A08 = str;
            c36701lE.A04 = num2;
            c36701lE.A05 = l;
            c36701lE.A07 = str2;
            c36701lE.A01 = bool;
            c36701lE.A00 = bool2;
            int andSet2 = this.A07.getAndSet(0);
            c36711lF = c36701lE;
            if (andSet2 != 0) {
                c36701lE.A03 = Integer.valueOf(andSet2);
                c36711lF = c36701lE;
            }
        }
        this.A03.A08(c36711lF, A01 ? anonymousClass015.A02 : 1);
    }
}
