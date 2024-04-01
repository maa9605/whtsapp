package X;

import android.content.ContentResolver;
import android.net.Uri;

/* renamed from: X.3BK  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3BK implements InterfaceC52102a4 {
    public final long A00;
    public final long A01;
    public final long A02;
    public final ContentResolver A03;
    public final Uri A04;
    public final String A05;
    public final String A06;

    @Override // X.InterfaceC52102a4
    public long A9q() {
        return 0L;
    }

    public C3BK(C001200o c001200o, long j, Uri uri, String str, String str2, long j2, long j3) {
        this.A03 = c001200o.A00.getContentResolver();
        this.A02 = j;
        this.A04 = uri;
        this.A05 = str;
        this.A06 = str2;
        this.A01 = j2;
        this.A00 = j3;
    }

    @Override // X.InterfaceC52102a4
    public Uri A88() {
        return this.A04;
    }

    @Override // X.InterfaceC52102a4
    public String A9f() {
        return this.A05;
    }

    @Override // X.InterfaceC52102a4
    public long A9h() {
        return this.A01;
    }

    @Override // X.InterfaceC52102a4
    public String ABN() {
        return this.A06;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C3BK)) {
            return false;
        }
        return this.A04.equals(((C3BK) obj).A04);
    }

    @Override // X.InterfaceC52102a4
    public long getContentLength() {
        return this.A00;
    }

    public int hashCode() {
        return this.A04.hashCode();
    }

    public String toString() {
        return this.A04.toString();
    }
}
