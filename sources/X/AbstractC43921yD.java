package X;

/* renamed from: X.1yD */
/* loaded from: classes2.dex */
public abstract class AbstractC43921yD {
    public static final boolean A00;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000f, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 19) goto L8;
     */
    static {
        /*
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "Sony"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L11
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            r0 = 1
            if (r2 < r1) goto L12
        L11:
            r0 = 0
        L12:
            X.AbstractC43921yD.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC43921yD.<clinit>():void");
    }

    public int A00() {
        if (!(this instanceof C43931yF)) {
            C43941yG c43941yG = (C43941yG) this;
            int i = c43941yG.A00;
            int[] iArr = c43941yG.A01;
            if (i >= iArr.length) {
                return 0;
            }
            int i2 = iArr[i];
            c43941yG.A00 = i + 1;
            return i2;
        }
        C43931yF c43931yF = (C43931yF) this;
        int i3 = c43931yF.A00;
        if (i3 >= c43931yF.A01) {
            return 0;
        }
        int codePointAt = Character.codePointAt(c43931yF.A02, i3);
        c43931yF.A00 = Character.charCount(codePointAt) + c43931yF.A00;
        int i4 = 65536 | codePointAt;
        return (A00 && C43981yK.A0F(i4)) ? i4 : codePointAt;
    }
}
