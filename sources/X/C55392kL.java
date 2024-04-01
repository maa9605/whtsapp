package X;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2kL  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C55392kL {
    public byte[] A06;
    public String A01 = "";
    public String A02 = "";
    public List A03 = new ArrayList();
    public ContentValues A00 = new ContentValues();
    public Set A04 = new HashSet();
    public Set A05 = new HashSet();

    public boolean equals(Object obj) {
        if (obj instanceof C55392kL) {
            C55392kL c55392kL = (C55392kL) obj;
            String str = this.A01;
            if (str != null && str.equals(c55392kL.A01) && this.A00.equals(c55392kL.A00) && this.A04.equals(c55392kL.A04) && this.A05.equals(c55392kL.A05)) {
                byte[] bArr = this.A06;
                if (bArr == null || !Arrays.equals(bArr, c55392kL.A06)) {
                    if (this.A02.equals(c55392kL.A02)) {
                        return this.A03.equals(c55392kL.A03) || this.A03.size() == 1 || c55392kL.A03.size() == 1;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("propName: ");
        A0P.append(this.A01);
        A0P.append(", paramMap: ");
        A0P.append(this.A00.toString());
        A0P.append(", propmMap_TYPE: ");
        A0P.append(this.A04.toString());
        A0P.append(", propGroupSet: ");
        A0P.append(this.A05.toString());
        List list = this.A03;
        if (list != null && list.size() > 1) {
            A0P.append(", propValue_vector size: ");
            A0P.append(this.A03.size());
        }
        byte[] bArr = this.A06;
        if (bArr != null) {
            A0P.append(", propValue_bytes size: ");
            A0P.append(bArr.length);
        }
        A0P.append(", propValue: ");
        A0P.append(this.A02);
        return A0P.toString();
    }
}
