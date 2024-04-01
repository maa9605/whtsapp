package X;

import android.net.Uri;

/* renamed from: X.1nS  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38041nS implements C0J9 {
    public final String A00;
    public final String A01;

    public C38041nS(String str) {
        this.A01 = str;
        String authority = Uri.parse(str).getAuthority();
        if (authority == null) {
            throw null;
        }
        this.A00 = authority;
    }

    @Override // X.C0J9
    public String A8B(C05080Nf c05080Nf, C01B c01b, boolean z) {
        return this.A01;
    }
}
