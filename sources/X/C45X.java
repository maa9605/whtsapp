package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: X.45X */
/* loaded from: classes3.dex */
public class C45X {
    public static volatile C45X A02;
    public final C001200o A00;
    public final InterfaceC002901k A01;

    public C45X(C001200o c001200o, InterfaceC002901k interfaceC002901k) {
        this.A00 = c001200o;
        this.A01 = interfaceC002901k;
    }

    public static C45X A00() {
        if (A02 == null) {
            synchronized (C45X.class) {
                if (A02 == null) {
                    A02 = new C45X(C001200o.A01, C002801j.A00());
                }
            }
        }
        return A02;
    }

    public void A01(String str, InterfaceC889445b interfaceC889445b) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.A00.A00.getFilesDir(), C000200d.A0L(new StringBuilder(), C46Z.A0H, C000200d.A0M(new StringBuilder(), File.separator, str, ".json"))));
            C45Q.A0R(AnonymousClass024.A0D(fileInputStream), interfaceC889445b);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
