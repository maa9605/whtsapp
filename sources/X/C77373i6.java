package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.3i6  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C77373i6 implements InterfaceC03590Gh {
    public final String A00;
    public final List A01 = new ArrayList();

    public C77373i6(String str) {
        C000700j.A03(str);
        this.A00 = str;
    }

    @Override // X.InterfaceC03590Gh
    public boolean A7g(String str) {
        return this.A00.equalsIgnoreCase(str);
    }

    @Override // X.InterfaceC03590Gh
    public void A7n(C69173Nk c69173Nk) {
        for (AbstractC77383i7 abstractC77383i7 : this.A01) {
            for (Map.Entry entry : abstractC77383i7.A00.entrySet()) {
                if (!((C0DX) abstractC77383i7.A00.get(entry.getKey())).AFy(c69173Nk)) {
                    abstractC77383i7.A00.remove(entry);
                }
            }
        }
    }

    @Override // X.InterfaceC03590Gh
    public C0DX ACJ(String str) {
        C0DX c0dx;
        if (str != null && !str.equals(C013806p.A06.A9K())) {
            for (AbstractC77383i7 abstractC77383i7 : this.A01) {
                if (!TextUtils.isEmpty(str)) {
                    String upperCase = str.toUpperCase(Locale.US);
                    if (abstractC77383i7.A00.containsKey(upperCase) && (c0dx = (C0DX) abstractC77383i7.A00.get(upperCase)) != null) {
                        return c0dx;
                    }
                }
            }
            return null;
        }
        for (AbstractC77383i7 abstractC77383i72 : this.A01) {
            for (C0DX c0dx2 : new ArrayList(abstractC77383i72.A00.values())) {
                if (c0dx2.AFA()) {
                    return c0dx2;
                }
            }
        }
        return null;
    }
}
