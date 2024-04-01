package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.3K2  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3K2 extends AbstractC83883sq {
    public final ActivityC02290Ap A00;
    public final C018508q A01;
    public final C018608r A02;
    public final C018708s A03;
    public final C000800k A04;
    public final C000400f A05;
    public final C001200o A06;
    public final C0DK A07;
    public final C42441vk A08;
    public final C42451vl A09;
    public final C67393Fi A0A;
    public final C09B A0B;

    public C3K2(C001200o c001200o, C018508q c018508q, C018608r c018608r, C018708s c018708s, C42441vk c42441vk, C000400f c000400f, C42451vl c42451vl, C000800k c000800k, C0DK c0dk, ActivityC02290Ap activityC02290Ap, C09B c09b, C67393Fi c67393Fi) {
        this.A06 = c001200o;
        this.A01 = c018508q;
        this.A02 = c018608r;
        this.A03 = c018708s;
        this.A08 = c42441vk;
        this.A05 = c000400f;
        this.A09 = c42451vl;
        this.A04 = c000800k;
        this.A07 = c0dk;
        this.A0B = c09b;
        this.A00 = activityC02290Ap;
        this.A0A = c67393Fi;
    }

    @Override // X.AnonymousClass124
    public InterfaceC06380Sv A6k() {
        File file;
        C09B c09b = this.A0B;
        C09H c09h = ((AnonymousClass097) c09b).A02;
        if (c09h != null) {
            if (c09h.A0P && (file = c09h.A0F) != null && file.exists()) {
                return new C66233Ag(this.A00, Uri.fromFile(c09h.A0F));
            }
            return new C86663y1(this.A06, this.A01, this.A02, this.A03, this.A08, this.A05, this.A09, this.A04, this.A07, this.A00, c09b, super.A00, this.A0A);
        }
        throw null;
    }
}
