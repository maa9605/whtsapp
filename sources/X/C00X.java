package X;

import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.00X */
/* loaded from: classes.dex */
public class C00X extends C00Y {
    public final C00S A00;
    public final C00C A01;
    public final C00W A02;
    public final C00E A03;

    public C00X(C00E c00e, C00C c00c, C00S c00s, C00W c00w) {
        this.A03 = c00e;
        this.A01 = c00c;
        this.A00 = c00s;
        this.A02 = c00w;
    }

    @Override // X.C00Y
    public void A00() {
        if (this.A01.A01()) {
            Iterator it = ((AbstractCollection) this.A03.A04()).iterator();
            while (it.hasNext()) {
                A01((String) it.next());
            }
        }
    }

    @Override // X.C00Y
    public void A01(String str) {
        if (this.A01.A01()) {
            C00R c00r = (C00R) this.A00;
            if (c00r.A03.A01()) {
                C00D c00d = c00r.A04;
                try {
                    if (c00d.A03.A02(str).A03) {
                        C00J c00j = (C00J) c00d.A00.A00.A00.get(str);
                        if (c00j != null) {
                            ((C07G) c00j.get()).A01();
                        }
                        C00F c00f = c00d.A02;
                        if (c00f != null) {
                            if (Build.VERSION.SDK_INT >= 26) {
                                c00f.A00.A00.revokeUriPermission(str, Uri.parse("content://com.whatsapp.provider.instrumentation"), 3);
                            } else {
                                c00f.A00.A00.revokeUriPermission(Uri.parse("content://com.whatsapp.provider.instrumentation"), 3);
                            }
                        } else {
                            throw null;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                C000200d.A15("InstrumentationChangeDispatcher/verification failed, dropping event for package - ", str);
            }
            this.A03.A05(str);
        }
    }
}
