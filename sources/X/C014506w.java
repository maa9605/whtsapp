package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.UUID;

/* renamed from: X.06w  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C014506w {
    public static volatile C014506w A03;
    public long A00;
    public String A01;
    public final AnonymousClass012 A02;

    public C014506w(AnonymousClass012 anonymousClass012) {
        this.A02 = anonymousClass012;
        this.A00 = anonymousClass012.A01();
        this.A01 = UUID.randomUUID().toString().substring(0, 8);
    }

    public static void A00(String str, Throwable th) {
        if (TextUtils.isEmpty(str)) {
            Log.e(th);
        } else if (th == null) {
            Log.e(str);
        } else {
            Log.e(str, th);
        }
    }

    public void A01() {
        AnonymousClass012 anonymousClass012 = this.A02;
        if (Math.abs(anonymousClass012.A01() - this.A00) > 300) {
            this.A01 = UUID.randomUUID().toString().substring(0, 8);
        }
        this.A00 = anonymousClass012.A01();
    }
}
