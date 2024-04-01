package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.4FH  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4FH extends C0HS {
    public final AnonymousClass094 A00;
    public final String A01;
    public final boolean A02;
    public final /* synthetic */ C4FI A03;

    public C4FH(C4FI c4fi, AnonymousClass094 anonymousClass094, String str, boolean z) {
        this.A03 = c4fi;
        this.A00 = anonymousClass094;
        this.A01 = str;
        this.A02 = z;
    }

    @Override // X.C0HS
    public void A06() {
        if (this.A02) {
            this.A03.A0H(true);
        }
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        ArrayList arrayList;
        C4FI c4fi = this.A03;
        C013306k c013306k = c4fi.A0K;
        AnonymousClass094 anonymousClass094 = this.A00;
        C0N2 c0n2 = null;
        AnonymousClass093 A0P = c013306k.A0P(anonymousClass094 == null ? null : anonymousClass094.A01, this.A01);
        if (A0P == null && c4fi == null) {
            throw null;
        }
        boolean z = true;
        if (A0P != null && ((TextUtils.isEmpty(A0P.A0F) || (c0n2 = c4fi.A0L.A08(A0P.A0F)) == null) && (arrayList = A0P.A0L) != null)) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0N2 c0n22 = ((C468128j) it.next()).A01;
                if (c0n22 != null) {
                    z = false;
                    c0n2 = c0n22;
                }
            }
        }
        return new C901849z(c0n2, z, A0P, c4fi.A0J.A0E(A0P));
    }

    @Override // X.C0HS
    public void A08() {
        if (this.A02) {
            this.A03.A0H(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r0 == false) goto L49;
     */
    @Override // X.C0HS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A09(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4FH.A09(java.lang.Object):void");
    }

    public /* synthetic */ void A0A(C901849z c901849z) {
        this.A03.A0M.A03(Collections.singletonList(c901849z.A01.A0I));
    }
}
