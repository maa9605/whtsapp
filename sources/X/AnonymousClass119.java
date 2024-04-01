package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.119  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass119 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final List A06 = new ArrayList();
    public final List A07 = new ArrayList();
    public final StringBuilder A05 = new StringBuilder();

    public AnonymousClass119(int i, int i2) {
        A02(i);
        this.A01 = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
        if (r6 == (-1)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
        if (r16 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
        if (r10 == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
        if (r1 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
        r10 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.text.SpannableString A00() {
        /*
            r17 = this;
            r12 = r17
            java.lang.StringBuilder r0 = r12.A05
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>(r0)
            int r8 = r7.length()
            r9 = -1
            r11 = 0
            r10 = -1
            r6 = -1
            r5 = 0
            r4 = -1
            r16 = 0
            r13 = -1
        L16:
            java.util.List r14 = r12.A06
            int r0 = r14.size()
            r3 = 33
            if (r11 >= r0) goto L89
            java.lang.Object r15 = r14.get(r11)
            X.118 r15 = (X.AnonymousClass118) r15
            boolean r1 = r15.A02
            int r2 = r15.A01
            r0 = 8
            if (r2 == r0) goto L3b
            r0 = 7
            r16 = 1
            if (r2 == r0) goto L3b
            r16 = 0
            if (r2 == r0) goto L3b
            int[] r0 = X.C24431Au.A0I
            r13 = r0[r2]
        L3b:
            int r2 = r15.A00
            int r11 = r11 + 1
            int r0 = r14.size()
            if (r11 >= r0) goto L87
            java.lang.Object r0 = r14.get(r11)
            X.118 r0 = (X.AnonymousClass118) r0
            int r0 = r0.A00
        L4d:
            if (r2 == r0) goto L16
            if (r10 == r9) goto L83
            if (r1 != 0) goto L80
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r7.setSpan(r0, r10, r2, r3)
            r10 = -1
        L5c:
            if (r6 == r9) goto L7c
            if (r16 != 0) goto L79
            r1 = 2
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r1)
            r7.setSpan(r0, r6, r2, r3)
            r6 = -1
        L6a:
            if (r13 == r4) goto L16
            if (r4 == r9) goto L76
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r4)
            r7.setSpan(r0, r5, r2, r3)
        L76:
            r5 = r2
            r4 = r13
            goto L16
        L79:
            if (r6 != r9) goto L6a
            goto L7e
        L7c:
            if (r16 == 0) goto L6a
        L7e:
            r6 = r2
            goto L6a
        L80:
            if (r10 != r9) goto L5c
            goto L85
        L83:
            if (r1 == 0) goto L5c
        L85:
            r10 = r2
            goto L5c
        L87:
            r0 = r8
            goto L4d
        L89:
            if (r10 == r9) goto L95
            if (r10 == r8) goto L95
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r7.setSpan(r0, r10, r8, r3)
        L95:
            if (r6 == r9) goto La2
            if (r6 == r8) goto La2
            r1 = 2
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r1)
            r7.setSpan(r0, r6, r8, r3)
        La2:
            if (r5 == r8) goto Lae
            if (r4 == r9) goto Lae
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r4)
            r7.setSpan(r0, r5, r8, r3)
        Lae:
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass119.A00():android.text.SpannableString");
    }

    public void A01() {
        StringBuilder sb = this.A05;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            List list = this.A06;
            for (int size = list.size() - 1; size >= 0; size--) {
                AnonymousClass118 anonymousClass118 = (AnonymousClass118) list.get(size);
                int i = anonymousClass118.A00;
                if (i != length) {
                    return;
                }
                anonymousClass118.A00 = i - 1;
            }
        }
    }

    public void A02(int i) {
        this.A00 = i;
        this.A06.clear();
        this.A07.clear();
        this.A05.setLength(0);
        this.A03 = 15;
        this.A02 = 0;
        this.A04 = 0;
    }

    public String toString() {
        return this.A05.toString();
    }
}
