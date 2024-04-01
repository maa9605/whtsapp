package X;

import android.net.Uri;

/* renamed from: X.1nP  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38011nP implements C0J9 {
    public final Uri.Builder A00;
    public final String A01;
    public final String A02;

    public C38011nP(String str, String str2) {
        Uri parse = Uri.parse(str);
        this.A00 = parse.buildUpon();
        this.A01 = parse.getAuthority();
        this.A02 = str2;
    }

    @Override // X.C0J9
    public String A8B(C05080Nf c05080Nf, C01B c01b, boolean z) {
        return this.A00.encodedAuthority(c05080Nf.A02).build().toString();
    }
}
