package X;

/* renamed from: X.2CI  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2CI {
    public final int[] A00;

    public C2CI(String str) {
        int codePointCount = str.codePointCount(0, str.length());
        this.A00 = new int[codePointCount];
        int i = 0;
        for (int i2 = 0; i2 < codePointCount; i2++) {
            this.A00[i2] = str.codePointAt(i);
            i += Character.charCount(this.A00[i2]);
        }
    }

    public C2CI(int[] iArr) {
        this.A00 = iArr;
    }

    public static String A00(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            sb.appendCodePoint(i);
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2CI.class == obj.getClass()) {
            int[] iArr = this.A00;
            int[] iArr2 = ((C2CI) obj).A00;
            if (iArr == iArr2) {
                return true;
            }
            int length = iArr.length;
            if (length != iArr2.length) {
                return false;
            }
            for (int i = 0; i < length; i++) {
                if (iArr[i] != iArr2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 : this.A00) {
            i = (i * 31) + i2;
        }
        return i;
    }

    public String toString() {
        return A00(this.A00);
    }
}
