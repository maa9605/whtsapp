package X;

import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.0Kh */
/* loaded from: classes.dex */
public class C04470Kh {
    public static volatile C04470Kh A0A;
    public final C04480Ki A00;
    public final C018508q A01;
    public final C02L A02;
    public final C05W A03;
    public final AnonymousClass008 A04;
    public final C011505r A05;
    public final C000500h A06;
    public final C0C9 A07;
    public final C03180Eq A08;
    public final C03510Fz A09;

    public C04470Kh(C018508q c018508q, C02L c02l, C05W c05w, C04480Ki c04480Ki, AnonymousClass008 anonymousClass008, C0C9 c0c9, C03510Fz c03510Fz, C03180Eq c03180Eq, C011505r c011505r, C000500h c000500h) {
        this.A01 = c018508q;
        this.A02 = c02l;
        this.A03 = c05w;
        this.A00 = c04480Ki;
        this.A04 = anonymousClass008;
        this.A07 = c0c9;
        this.A09 = c03510Fz;
        this.A08 = c03180Eq;
        this.A06 = c000500h;
        this.A05 = c011505r;
    }

    public static C04470Kh A00() {
        if (A0A == null) {
            synchronized (C04470Kh.class) {
                if (A0A == null) {
                    A0A = new C04470Kh(C018508q.A00(), C02L.A00(), C05W.A00(), C04480Ki.A01, AnonymousClass008.A01, C0C9.A00(), C03510Fz.A03, C03180Eq.A00(), C011505r.A00(), C000500h.A00());
                }
            }
        }
        return A0A;
    }

    public void A01(C06C c06c) {
        C011505r c011505r = this.A05;
        if (c011505r != null) {
            c011505r.A06(c06c.A04());
            c06c.A0R = true;
            return;
        }
        throw null;
    }

    public void A02(C06C c06c, int i, int i2) {
        boolean A0A2 = this.A02.A0A(c06c.A02());
        c06c.A01 = i;
        c06c.A02 = i2;
        if (A0A2) {
            this.A06.A0D().putInt("profile_photo_full_id", i).putInt("profile_photo_thumb_id", i2).apply();
            return;
        }
        c06c.A06 = System.currentTimeMillis();
        this.A03.A0K(c06c);
    }

    public void A03(C06C c06c, byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            try {
                AnonymousClass024.A0b(bArr, this.A05.A03(c06c));
            } catch (IOException e) {
                Log.e("ContactPhotoUpdater/updatePhotoFiles", e);
                return;
            }
        }
        if (bArr2 != null) {
            AnonymousClass024.A0b(bArr2, this.A05.A04(c06c));
        }
    }

    public void A04(final AbstractC005302j abstractC005302j) {
        C04480Ki c04480Ki = this.A00;
        c04480Ki.A00.post(new Runnable() { // from class: X.1NP
            {
                C04470Kh.this = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0013, code lost:
                if (r5.A02 != (-1)) goto L15;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r8 = this;
                    X.0Kh r7 = X.C04470Kh.this
                    X.02j r6 = r2
                    X.05W r0 = r7.A03
                    X.06C r5 = r0.A0A(r6)
                    int r2 = r5.A01
                    r4 = 1
                    r1 = -1
                    if (r2 != r1) goto L15
                    int r0 = r5.A02
                    r3 = 1
                    if (r0 == r1) goto L16
                L15:
                    r3 = 0
                L16:
                    if (r2 != 0) goto L45
                    int r0 = r5.A02
                    if (r0 != 0) goto L45
                L1c:
                    X.05r r0 = r7.A05
                    r0.A05(r5)
                    r7.A02(r5, r1, r1)
                    X.0Fz r2 = r7.A09
                    java.lang.Class<X.02j> r0 = X.AbstractC005302j.class
                    com.whatsapp.jid.Jid r1 = r5.A03(r0)
                    X.0G0 r0 = r2.A01
                    r0.A01(r1)
                    X.0G0 r0 = r2.A02
                    r0.A01(r1)
                    if (r3 != 0) goto L44
                    X.08q r0 = r7.A01
                    X.1NM r1 = new X.1NM
                    r1.<init>()
                    android.os.Handler r0 = r0.A02
                    r0.post(r1)
                L44:
                    return
                L45:
                    r4 = 0
                    goto L1c
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1NP.run():void");
            }
        });
    }
}
