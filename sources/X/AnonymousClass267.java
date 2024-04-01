package X;

import android.graphics.Bitmap;
import android.graphics.Point;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: X.267 */
/* loaded from: classes2.dex */
public class AnonymousClass267 {
    public static volatile AnonymousClass267 A08;
    public final C0HK A00 = new C0HK();
    public final C01B A01;
    public final C0E7 A02;
    public final C001200o A03;
    public final C003701t A04;
    public final AnonymousClass268 A05;
    public final C26B A06;
    public final Executor A07;

    public AnonymousClass267(C001200o c001200o, C003701t c003701t, InterfaceC002901k interfaceC002901k, C01B c01b, C26B c26b, C0E7 c0e7, AnonymousClass268 anonymousClass268) {
        this.A03 = c001200o;
        this.A04 = c003701t;
        this.A01 = c01b;
        this.A07 = interfaceC002901k.AGj();
        this.A06 = c26b;
        this.A02 = c0e7;
        this.A05 = anonymousClass268;
    }

    public static AnonymousClass267 A00() {
        if (A08 == null) {
            synchronized (AnonymousClass267.class) {
                C001200o c001200o = C001200o.A01;
                C003701t A00 = C003701t.A00();
                C01B A002 = C01B.A00();
                InterfaceC002901k A003 = C002801j.A00();
                if (C26B.A03 == null) {
                    synchronized (C26B.class) {
                        AnonymousClass035 A004 = AnonymousClass035.A00();
                        C41451tw A005 = C41451tw.A00();
                        if (C26B.A03 == null) {
                            C26B.A03 = new C26B(c001200o, A004, A005);
                        }
                    }
                }
                C26B c26b = C26B.A03;
                C0E7 A006 = C0E7.A00();
                if (AnonymousClass268.A03 == null) {
                    synchronized (AnonymousClass268.class) {
                        C0EL A007 = C0EL.A00();
                        C02C A008 = C02C.A00();
                        if (AnonymousClass268.A03 == null) {
                            AnonymousClass268.A03 = new AnonymousClass268(c001200o, A007, A008);
                        }
                    }
                }
                AnonymousClass268 anonymousClass268 = AnonymousClass268.A03;
                if (A08 == null) {
                    A08 = new AnonymousClass267(c001200o, A00, A003, A002, c26b, A006, anonymousClass268);
                }
            }
        }
        return A08;
    }

    public Bitmap A01(File file) {
        Point A00 = AbstractC40441sG.A00(this.A03.A00);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            Bitmap bitmap = C002701i.A0M(fileInputStream, AbstractC40441sG.A01(A00, true, this.A04)).A02;
            fileInputStream.close();
            return bitmap;
        } catch (IOException | OutOfMemoryError e) {
            Log.e("DownloadableWallpaperManager/error when loading wallpaper resource", e);
            return null;
        }
    }

    public void A02() {
        if (C03410Fp.A08(this.A01)) {
            this.A07.execute(new RunnableEBaseShape6S0100000_I0_6(this, 24));
        }
    }
}
