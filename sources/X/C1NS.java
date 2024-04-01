package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/* renamed from: X.1NS  reason: invalid class name */
/* loaded from: classes.dex */
public class C1NS {
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public String[] A04;
    public String[] A05;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
    public C1NS(String str, String str2, Locale locale, Locale locale2) {
        String A02;
        ?? arrayList;
        this.A02 = "";
        String A01 = AbstractC003201n.A01(locale2);
        String A012 = AbstractC003201n.A01(locale);
        boolean equals = A01.equals(A012);
        if ("1".equals(str) && str2.length() == 10 && "55501".equals(str2.substring(3, 8))) {
            A02 = "QQ";
            this.A03 = "QQ";
        } else {
            A02 = C006602x.A02(str, str2);
            this.A03 = A02;
        }
        String[] strArr = (String[]) C2Qt.A04.A01(A02);
        if (strArr == null) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(strArr.length);
            for (String str3 : strArr) {
                arrayList.add(C002701i.A0r(str3));
            }
        }
        if (arrayList.isEmpty() && equals) {
            return;
        }
        int size = arrayList.size() + 2;
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        arrayList2.add(C002701i.A0x(locale));
        arrayList3.add(AbstractC003201n.A05(locale));
        this.A00 = equals ? 0 : -1;
        StringBuffer stringBuffer = new StringBuffer();
        for (String str4 : arrayList) {
            Locale A09 = AbstractC003201n.A09(str4);
            String A013 = AbstractC003201n.A01(A09);
            if (!A013.equals(A012)) {
                if (!AbstractC59762tH.A00(A09)) {
                    StringBuilder sb = new StringBuilder("whatsapplocaledata/getlanguagepreferencesdata/non-renderable language: ");
                    sb.append(str4);
                    Log.i(sb.toString());
                    stringBuffer.append(str4);
                    stringBuffer.append(",");
                } else {
                    arrayList2.add(C002701i.A0x(A09));
                    arrayList3.add(AbstractC003201n.A05(A09));
                    if (this.A00 == -1 && A013.equals(A01)) {
                        this.A00 = arrayList2.size() - 1;
                    }
                }
            }
        }
        if (this.A00 == -1) {
            arrayList2.add(C002701i.A0x(locale2));
            arrayList3.add(AbstractC003201n.A05(locale2));
            this.A00 = arrayList2.size() - 1;
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.setLength(stringBuffer.length() - 1);
            this.A02 = stringBuffer.toString();
        }
        int size2 = arrayList2.size();
        this.A01 = size2;
        if (size2 < 2) {
            this.A01 = 0;
            return;
        }
        this.A04 = (String[]) arrayList2.toArray(new String[0]);
        this.A05 = (String[]) arrayList3.toArray(new String[0]);
    }
}
