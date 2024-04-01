package X;

import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.GroupJid;
import java.util.HashMap;
import java.util.Timer;

/* renamed from: X.0Kl */
/* loaded from: classes.dex */
public class C04510Kl {
    public static HashMap A0O = new HashMap();
    public long A00;
    public C3T4 A01;
    public Long A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public byte[] A06;
    public byte[] A07;
    public final C018508q A08;
    public final C02L A09;
    public final C05W A0A;
    public final AnonymousClass008 A0B;
    public final C011505r A0C;
    public final C04470Kh A0D;
    public final AnonymousClass012 A0E;
    public final C0C9 A0F;
    public final C0C8 A0G;
    public final C03180Eq A0H;
    public final AnonymousClass011 A0I;
    public final AbstractC005302j A0J;
    public final C456723a A0K;
    public final C04500Kk A0L;
    public final C07A A0M;
    public final C41991uq A0N;

    public C04510Kl(AnonymousClass012 anonymousClass012, C018508q c018508q, C02L c02l, AnonymousClass011 anonymousClass011, C41991uq c41991uq, C05W c05w, AnonymousClass008 anonymousClass008, C0C9 c0c9, C03180Eq c03180Eq, C011505r c011505r, C04470Kh c04470Kh, C456723a c456723a, C07A c07a, C0C8 c0c8, AbstractC005302j abstractC005302j, byte[] bArr, byte[] bArr2, C04500Kk c04500Kk) {
        this.A0E = anonymousClass012;
        this.A08 = c018508q;
        this.A09 = c02l;
        this.A0I = anonymousClass011;
        this.A0N = c41991uq;
        this.A0A = c05w;
        this.A0B = anonymousClass008;
        this.A0F = c0c9;
        this.A0H = c03180Eq;
        this.A0C = c011505r;
        this.A0D = c04470Kh;
        this.A0K = c456723a;
        this.A0M = c07a;
        this.A0G = c0c8;
        this.A0J = abstractC005302j;
        this.A06 = bArr;
        this.A07 = bArr2;
        this.A0L = c04500Kk;
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.A02 = valueOf;
        A0O.put(valueOf.toString(), this);
        this.A00 = SystemClock.elapsedRealtime();
        this.A01 = new C3T4(this);
        new Timer().schedule(this.A01, 32000L);
    }

    public static boolean A00(AbstractC005302j abstractC005302j) {
        if (abstractC005302j == null) {
            return false;
        }
        for (C04510Kl c04510Kl : A0O.values()) {
            if (abstractC005302j.equals(c04510Kl.A0J)) {
                return true;
            }
        }
        return false;
    }

    public final void A01(int i) {
        C37361mI c37361mI = new C37361mI();
        byte[] bArr = this.A06;
        int length = bArr == null ? 0 : bArr.length;
        byte[] bArr2 = this.A07;
        c37361mI.A00 = Double.valueOf(length + (bArr2 != null ? bArr2.length : 0));
        c37361mI.A02 = Long.valueOf(SystemClock.elapsedRealtime() - this.A00);
        c37361mI.A01 = Integer.valueOf(i);
        this.A0I.A09(c37361mI, 1);
        AnonymousClass011.A01(c37361mI, "");
    }

    public final void A02(AbstractC005302j abstractC005302j) {
        this.A0D.A01(this.A0A.A0A(abstractC005302j));
        this.A0B.A03(abstractC005302j);
    }

    public final void A03(AbstractC005302j abstractC005302j, int i) {
        A02(abstractC005302j);
        this.A0K.A0G.A01(abstractC005302j, i);
        C018508q c018508q = this.A08;
        boolean A0U = C003101m.A0U(abstractC005302j);
        int i2 = R.string.failed_update_profile_photo;
        if (A0U) {
            i2 = R.string.failed_update_photo;
        }
        c018508q.A07(i2, 0);
    }

    public final void A04(GroupJid groupJid, int i) {
        A02(groupJid);
        this.A0K.A0G.A01(groupJid, i);
        this.A08.A07(R.string.failed_update_photo_not_authorized, 0);
    }
}
