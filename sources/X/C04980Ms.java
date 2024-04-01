package X;

import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Ms  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04980Ms {
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public C04980Ms(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3) {
        this.A09 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A06 = str4;
        this.A08 = str5;
        this.A07 = str6;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
    }

    public static final void A00(List list, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        list.add(new C04P(str, str2, null, (byte) 0));
    }

    public C02590Ca A01(boolean z) {
        return new C02590Ca("sticker", (C04P[]) ((AbstractCollection) A02(z)).toArray(new C04P[0]), null, null);
    }

    public List A02(boolean z) {
        ArrayList arrayList = new ArrayList();
        A00(arrayList, "url", this.A09);
        A00(arrayList, "media_key", this.A07);
        A00(arrayList, "enc_filehash", this.A05);
        A00(arrayList, "direct_path", this.A04);
        A00(arrayList, "filehash", this.A06);
        A00(arrayList, "mimetype", this.A08);
        if (z) {
            A00(arrayList, "weight", this.A03);
        }
        arrayList.add(new C04P("size", Integer.toString(this.A01), null, (byte) 0));
        arrayList.add(new C04P("width", Integer.toString(this.A02), null, (byte) 0));
        arrayList.add(new C04P("height", Integer.toString(this.A00), null, (byte) 0));
        return arrayList;
    }
}
