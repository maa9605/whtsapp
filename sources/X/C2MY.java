package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;

/* renamed from: X.2MY  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2MY implements C08o {
    public static volatile C2MY A07;
    public final C018308n A00;
    public final C018508q A01;
    public final C002301c A02;
    public final C0GZ A03;
    public final C0GR A04;
    public final C0DV A05;
    public final C014406v A06 = C014406v.A00("PaymentActivityLauncher", "infra", "COMMON");

    public C2MY(C018508q c018508q, C018308n c018308n, C002301c c002301c, C0DV c0dv, C0GZ c0gz, C0GR c0gr) {
        this.A01 = c018508q;
        this.A00 = c018308n;
        this.A02 = c002301c;
        this.A05 = c0dv;
        this.A03 = c0gz;
        this.A04 = c0gr;
    }

    public static C2MY A00() {
        if (A07 == null) {
            synchronized (C2MY.class) {
                if (A07 == null) {
                    A07 = new C2MY(C018508q.A00(), C018308n.A02(), C002301c.A00(), C0DV.A00(), C0GZ.A00(), C0GR.A00());
                }
            }
        }
        return A07;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r4.A05.A0D.A00.A0E(X.C01C.A1t) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.content.Intent A01(android.content.Context r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            r2 = 1
            if (r7 != 0) goto L15
            if (r6 != 0) goto L14
            X.0DV r0 = r4.A05
            X.0DW r0 = r0.A0D
            X.01B r1 = r0.A00
            X.03B r0 = X.C01C.A1t
            boolean r0 = r1.A0E(r0)
            r6 = 0
            if (r0 != 0) goto L15
        L14:
            r6 = 1
        L15:
            java.lang.String r3 = "extra_setup_mode"
            if (r6 != 0) goto L5a
            X.0GZ r1 = r4.A03
            boolean r0 = r1.A07()
            if (r0 != 0) goto L4a
            boolean r0 = r1.A09()
            if (r0 != 0) goto L4a
            X.0DV r1 = r4.A05
            X.0DX r0 = r1.A03()
            boolean r0 = r0.A5y()
            if (r0 != 0) goto L4a
            X.0DX r0 = r1.A03()
            java.lang.Class r1 = r0.A8H()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r5, r1)
            r1 = 2
            r0.putExtra(r3, r1)
        L44:
            java.lang.String r1 = "extra_is_pay_money_only"
            r0.putExtra(r1, r6)
            return r0
        L4a:
            X.0DV r0 = r4.A05
            X.0DX r0 = r0.A03()
            java.lang.Class r1 = r0.AD3()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r5, r1)
            goto L44
        L5a:
            X.0GZ r1 = r4.A03
            boolean r0 = r1.A07()
            if (r0 != 0) goto L85
            boolean r0 = r1.A08()
            if (r0 != 0) goto L85
            X.0DV r1 = r4.A05
            X.0DX r0 = r1.A03()
            boolean r0 = r0.A5y()
            if (r0 != 0) goto L85
            X.0DX r0 = r1.A03()
            java.lang.Class r1 = r0.A8H()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r5, r1)
            r0.putExtra(r3, r2)
            goto L44
        L85:
            X.0DV r0 = r4.A05
            X.0DX r0 = r0.A03()
            java.lang.Class r1 = r0.AD3()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r5, r1)
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2MY.A01(android.content.Context, boolean, boolean):android.content.Intent");
    }

    @Override // X.C08o
    public void AS7(Context context, Uri uri) {
        if (uri == null) {
            this.A06.A04("start-activity/uri-is-null");
            return;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if ("wapay".equals(uri.getScheme()) && !TextUtils.isEmpty(lastPathSegment)) {
            Intent A01 = A01(context, false, true);
            A01.putExtra("extra_payment_handle", lastPathSegment);
            this.A00.A06(context, A01);
            return;
        }
        this.A06.A04("start-activity/uri-is-not-wapay-compatible");
        this.A01.A07(R.string.activity_not_found, 0);
    }
}
