package X;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

/* renamed from: X.09I */
/* loaded from: classes.dex */
public class C09I {
    public static volatile C09I A09;
    public int A00;
    public final AnonymousClass034 A01;
    public final C0E7 A02;
    public final AnonymousClass012 A03;
    public final C001200o A04;
    public final C000500h A05;
    public final AnonymousClass035 A06;
    public final C004902f A07;
    public final InterfaceC002901k A08;

    public C09I(C001200o c001200o, AnonymousClass012 anonymousClass012, C004902f c004902f, InterfaceC002901k interfaceC002901k, AnonymousClass034 anonymousClass034, AnonymousClass035 anonymousClass035, C0E7 c0e7, C000500h c000500h) {
        this.A04 = c001200o;
        this.A03 = anonymousClass012;
        this.A07 = c004902f;
        this.A08 = interfaceC002901k;
        this.A01 = anonymousClass034;
        this.A06 = anonymousClass035;
        this.A02 = c0e7;
        this.A05 = c000500h;
    }

    public static C09I A00() {
        if (A09 == null) {
            synchronized (C09I.class) {
                if (A09 == null) {
                    A09 = new C09I(C001200o.A01, AnonymousClass012.A00(), C004902f.A00(), C002801j.A00(), AnonymousClass034.A00(), AnonymousClass035.A00(), C0E7.A00(), C000500h.A00());
                }
            }
        }
        return A09;
    }

    public Uri A01() {
        if (!A02()) {
            return Uri.parse("https://www.whatsapp.com/android/current/WhatsApp.apk");
        }
        return Uri.parse("market://details?id=com.whatsapp");
    }

    public boolean A02() {
        try {
            PackageManager packageManager = this.A04.A00.getPackageManager();
            packageManager.getPackageInfo("com.android.vending", 0);
            return new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.whatsapp")).resolveActivity(packageManager) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
