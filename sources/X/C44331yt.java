package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1yt */
/* loaded from: classes2.dex */
public class C44331yt implements InterfaceC41551u8 {
    public static volatile C44331yt A07;
    public final C42961wc A00;
    public final AnonymousClass012 A01;
    public final C01J A02;
    public final C44351yv A03;
    public final AnonymousClass011 A04;
    public final Map A06 = new HashMap();
    public final Map A05 = new HashMap();

    public C44331yt(AnonymousClass012 anonymousClass012, AnonymousClass011 anonymousClass011, C01J c01j, C44351yv c44351yv, C42961wc c42961wc, C41301th c41301th) {
        this.A01 = anonymousClass012;
        this.A04 = anonymousClass011;
        this.A02 = c01j;
        this.A03 = c44351yv;
        this.A00 = c42961wc;
        c41301th.A00(this);
    }

    public static C44331yt A00() {
        if (A07 == null) {
            synchronized (C44331yt.class) {
                if (A07 == null) {
                    A07 = new C44331yt(AnonymousClass012.A00(), AnonymousClass011.A00(), C01J.A00(), C44351yv.A00(), C42961wc.A00(), C41301th.A00);
                }
            }
        }
        return A07;
    }

    public String A01(C0IP c0ip) {
        if (c0ip == null) {
            return null;
        }
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(AnonymousClass029.A1h(this.A02.A0B().A01.A00.A01, new byte[]{95}, c0ip.A00.A01)), 2);
        } catch (NoSuchAlgorithmException e) {
            Log.e("sync-stats-manager/createBootstrapSessionId unable to create id because sha256 instance could not created.", e);
            return null;
        }
    }

    public void A02(int i) {
        C0JZ c0jz = new C0JZ();
        c0jz.A00 = Integer.valueOf(i);
        this.A04.A0B(c0jz, null, false);
    }

    public void A03(String str) {
        C04180Ja c04180Ja;
        if (str == null || (c04180Ja = (C04180Ja) this.A06.get(str)) == null) {
            return;
        }
        c04180Ja.A01 = 2;
        c04180Ja.A05 = Long.valueOf(this.A01.A05());
        this.A04.A0B(c04180Ja, null, false);
    }

    public void A04(String str, boolean z) {
        if (str == null) {
            return;
        }
        C0Jb c0Jb = new C0Jb();
        c0Jb.A04 = str;
        c0Jb.A03 = Long.valueOf(this.A01.A05());
        c0Jb.A01 = 2;
        c0Jb.A02 = Integer.valueOf(z ? 1 : 2);
        c0Jb.A00 = 1;
        this.A04.A0B(c0Jb, null, false);
    }

    public void A05(String str, boolean z, int i) {
        if (str == null) {
            return;
        }
        C0Jb c0Jb = new C0Jb();
        c0Jb.A04 = str;
        c0Jb.A03 = Long.valueOf(this.A01.A05());
        c0Jb.A01 = 1;
        c0Jb.A02 = Integer.valueOf(z ? 1 : 2);
        c0Jb.A00 = Integer.valueOf(i);
        this.A04.A0B(c0Jb, null, false);
    }

    public void A06(String str, boolean z, long j, long j2, int i) {
        if (str == null) {
            return;
        }
        C04190Jc c04190Jc = new C04190Jc();
        c04190Jc.A05 = str;
        c04190Jc.A04 = Long.valueOf(this.A01.A05());
        c04190Jc.A02 = Long.valueOf(j);
        c04190Jc.A00 = Integer.valueOf(i);
        c04190Jc.A01 = Integer.valueOf(z ? 1 : 2);
        c04190Jc.A03 = Long.valueOf(j2);
        this.A04.A0B(c04190Jc, null, false);
    }

    public void A07(boolean z, long j) {
        C0Jd c0Jd = new C0Jd();
        c0Jd.A00 = Boolean.valueOf(z);
        c0Jd.A01 = Long.valueOf(this.A01.A05() - j);
        this.A04.A0B(c0Jd, null, false);
    }

    @Override // X.InterfaceC41551u8
    public void AKA(C0JU c0ju) {
        C04180Ja c04180Ja;
        if ((c0ju instanceof C04200Je) && (c04180Ja = (C04180Ja) this.A05.remove(Long.valueOf(c0ju.A0p))) != null) {
            c04180Ja.A01 = 1;
            c04180Ja.A05 = Long.valueOf(this.A01.A05());
            this.A04.A0B(c04180Ja, null, false);
        }
    }
}
