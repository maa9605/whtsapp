package X;

import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: X.1tg */
/* loaded from: classes2.dex */
public class C41291tg {
    public static volatile C41291tg A06;
    public final C47422Bd A01;
    public final AnonymousClass012 A02;
    public final C04W A03 = new C04W(10);
    public final HashSet A05 = new HashSet();
    public final HashMap A04 = new HashMap();
    public final C47802Cq A00 = new C47802Cq();

    public C41291tg(AnonymousClass012 anonymousClass012, C47422Bd c47422Bd) {
        this.A02 = anonymousClass012;
        this.A01 = c47422Bd;
    }

    public static C41291tg A00() {
        if (A06 == null) {
            synchronized (C41291tg.class) {
                if (A06 == null) {
                    A06 = new C41291tg(AnonymousClass012.A00(), C47422Bd.A00());
                }
            }
        }
        return A06;
    }

    public static C47822Cs A01(C47812Cr c47812Cr, String str) {
        C47832Ct c47832Ct;
        if (!TextUtils.isEmpty(str)) {
            for (C47822Cs c47822Cs : c47812Cr.A02) {
                int i = c47822Cs.A01;
                if (i == 1) {
                    if (i == 1) {
                        c47832Ct = (C47832Ct) c47822Cs.A04;
                    } else {
                        c47832Ct = C47832Ct.A09;
                    }
                    if ((c47832Ct.A00 & 2) == 2 && c47832Ct.A06.equals(str)) {
                        return c47822Cs;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static Locale[] A02(C002301c c002301c, Locale locale) {
        Locale A0I = c002301c.A0I();
        if (locale == null || TextUtils.isEmpty(locale.getLanguage())) {
            locale = Locale.ENGLISH;
        }
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList = LocaleList.getDefault();
            int size = localeList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(localeList.get(i));
            }
            if (!arrayList.contains(A0I)) {
                arrayList.add(0, A0I);
            }
        } else {
            arrayList.add(A0I);
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            arrayList.add(size2 + 1, new Locale(((Locale) arrayList.get(size2)).getLanguage(), ""));
        }
        if (!arrayList.contains(locale)) {
            arrayList.add(locale);
        }
        return (Locale[]) arrayList.toArray(new Locale[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x00ca, code lost:
        if (r2.length == 0) goto L109;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:267:0x01c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C47812Cr A03(java.util.Locale[] r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41291tg.A03(java.util.Locale[], java.lang.String):X.2Cr");
    }

    public void A04() {
        C47422Bd c47422Bd = this.A01;
        if (c47422Bd != null) {
            Log.i("language-pack-store/delete-unused-language-packs");
            long A05 = (c47422Bd.A01.A05() - 604800000) / 1000;
            C47482Bj c47482Bj = c47422Bd.A00;
            C0CD c0cd = new C0CD(null, c47482Bj, true);
            try {
                C03790Hb A00 = c0cd.A00();
                C0CE c0ce = c0cd.A02;
                String l = Long.toString(A05);
                int A01 = c0ce.A01("packs", "length(data) == 0 AND timestamp < ?", new String[]{l});
                int A012 = c0ce.A01("packs", "length(data) > 0 AND timestamp < ?", new String[]{l});
                A00.A00();
                A00.close();
                c0cd.close();
                if (A01 > 0 || A012 > 0) {
                    C000200d.A0t("language-pack-store/delete-unused-language-packs empty=", A01, " unused=", A012);
                    C04W c04w = this.A03;
                    synchronized (c04w) {
                        c04w.clear();
                        this.A05.clear();
                    }
                    if (c47422Bd != null) {
                        Log.i("language-pack-store/vacuum");
                        c0cd = new C0CD(null, c47482Bj, true);
                        try {
                            c0cd.A02.A0C("VACUUM");
                            return;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } finally {
                                try {
                                    c0cd.close();
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    }
                    throw null;
                }
                return;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } finally {
                    try {
                        c0cd.close();
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
        throw null;
    }
}
