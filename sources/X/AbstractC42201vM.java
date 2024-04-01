package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.InputStream;

/* renamed from: X.1vM  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC42201vM {
    public final C001200o A02;
    public final C41451tw A03;
    public final AnonymousClass035 A04;
    public final InterfaceC002901k A05;
    public volatile boolean A07 = false;
    public volatile boolean A06 = true;
    public int A00 = 1;
    public int A01 = 1;

    public abstract String A01();

    public abstract void A02();

    public abstract boolean A03();

    public abstract boolean A04(InputStream inputStream);

    public abstract boolean A05(String str, byte[] bArr);

    public AbstractC42201vM(C001200o c001200o, InterfaceC002901k interfaceC002901k, AnonymousClass035 anonymousClass035, C41451tw c41451tw) {
        this.A02 = c001200o;
        this.A05 = interfaceC002901k;
        this.A04 = anonymousClass035;
        this.A03 = c41451tw;
    }

    public synchronized File A00(String str) {
        File file = new File(this.A02.A00.getFilesDir(), str);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SimpleAssetDownloader/getAssetDir/Could not make directory ");
        sb.append(file.getAbsolutePath());
        Log.e(sb.toString());
        return null;
    }
}
