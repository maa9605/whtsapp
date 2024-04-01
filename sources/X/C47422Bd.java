package X;

import android.content.ContentValues;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.2Bd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47422Bd {
    public static volatile C47422Bd A02;
    public final C47482Bj A00;
    public final AnonymousClass012 A01;

    public C47422Bd(C001200o c001200o, AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, C04Z c04z) {
        this.A00 = new C47482Bj(c001200o.A00, abstractC000600i, c04z);
        this.A01 = anonymousClass012;
    }

    public static C47422Bd A00() {
        if (A02 == null) {
            synchronized (C47422Bd.class) {
                if (A02 == null) {
                    A02 = new C47422Bd(C001200o.A01, AnonymousClass012.A00(), AbstractC000600i.A00(), C04Z.A00());
                }
            }
        }
        return A02;
    }

    public void A01(Locale locale, String str) {
        long A05 = this.A01.A05() / 1000;
        C0CD c0cd = new C0CD(null, this.A00, true);
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("timestamp", Long.valueOf(A05));
            if (c0cd.A02.A00("packs", contentValues, "lg = ? AND lc = ? AND namespace = ?", new String[]{locale.getLanguage(), locale.getCountry(), str}) > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("language-pack-store/touch-language-pack updated timestamp for ");
                sb.append(locale);
                sb.append(" ns=");
                sb.append(str);
                Log.i(sb.toString());
            }
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

    /* JADX WARN: Finally extract failed */
    public void A02(Locale locale, String str, String str2, byte[] bArr) {
        long A05 = this.A01.A05() / 1000;
        if (str == null) {
            str = "";
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        C0CD c0cd = new C0CD(null, this.A00, true);
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("lg", locale.getLanguage());
            contentValues.put("lc", locale.getCountry());
            contentValues.put("hash", str);
            contentValues.put("namespace", str2);
            contentValues.put("timestamp", Long.valueOf(A05));
            contentValues.put("data", bArr);
            c0cd.A02.A05("packs", contentValues);
            c0cd.close();
            StringBuilder sb = new StringBuilder("language-pack-store/save-language-pack saved pack ");
            sb.append(AbstractC003201n.A05(locale));
            sb.append(" (");
            sb.append(str);
            sb.append(") ns=");
            sb.append(str2);
            Log.i(sb.toString());
        } finally {
        }
    }
}
