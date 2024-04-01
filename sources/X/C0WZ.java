package X;

import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import com.whatsapp.Me;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.0WZ */
/* loaded from: classes.dex */
public class C0WZ {
    public static volatile C0WZ A04;
    public final C0DZ A00;
    public final C02L A01;
    public final C01B A02;
    public final C002301c A03;

    public C0WZ(C02L c02l, C01B c01b, C002301c c002301c, C0DZ c0dz) {
        this.A01 = c02l;
        this.A02 = c01b;
        this.A03 = c002301c;
        this.A00 = c0dz;
    }

    public static C0WZ A00() {
        if (A04 == null) {
            synchronized (C0WZ.class) {
                if (A04 == null) {
                    A04 = new C0WZ(C02L.A00(), C01B.A00(), C002301c.A00(), C0DZ.A00());
                }
            }
        }
        return A04;
    }

    public Set A01(AnonymousClass092 anonymousClass092, String str, AbstractC005302j abstractC005302j) {
        if (str == null || anonymousClass092.A0n.A02 || !this.A02.A0E(C01C.A2P)) {
            return null;
        }
        return A02(str, abstractC005302j);
    }

    public Set A02(String str, AbstractC005302j abstractC005302j) {
        String str2;
        String host = Uri.parse(str).getHost();
        if (host == null) {
            return null;
        }
        try {
            C10090fH A0F = this.A00.A0F(C04630Le.A02(abstractC005302j), null);
            str2 = C006602x.A02(Integer.toString(A0F.countryCode_), C0DZ.A01(A0F));
        } catch (C24581Cb unused) {
            str2 = "ZZ";
        }
        C02L c02l = this.A01;
        c02l.A05();
        Me me = c02l.A00;
        String A02 = me != null ? C006602x.A02(me.cc, me.number) : "ZZ";
        HashSet hashSet = new HashSet();
        Locale A0I = this.A03.A0I();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList = LocaleList.getDefault();
            for (int i = 0; i < localeList.size(); i++) {
                hashSet.add(localeList.get(i));
            }
        }
        hashSet.add(A0I);
        return C59752tG.A00(host, str2, A02, hashSet);
    }
}
