package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.22n  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C455522n {
    public static volatile C455522n A06;
    public final C001200o A00;
    public final AnonymousClass011 A01;
    public final C456222u A02;
    public final C455622o A03;
    public final C455922r A04;
    public final C41961un A05;

    public C455522n(C001200o c001200o, AnonymousClass011 anonymousClass011, C41961un c41961un, C455622o c455622o, C455922r c455922r, C456222u c456222u) {
        this.A00 = c001200o;
        this.A01 = anonymousClass011;
        this.A05 = c41961un;
        this.A03 = c455622o;
        this.A04 = c455922r;
        this.A02 = c456222u;
    }

    public final File A00(File file, String str) {
        long j;
        if (file == null) {
            Log.w("mediaprocessmanager/gettranscodedfile/originalFile is null");
        }
        C41961un c41961un = this.A05;
        if (file != null) {
            j = file.length();
        } else {
            j = -1;
        }
        return c41961un.A0d(str, j);
    }
}
