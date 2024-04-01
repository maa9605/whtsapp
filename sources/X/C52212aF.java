package X;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;

/* renamed from: X.2aF  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52212aF implements InterfaceC52102a4, InterfaceC52182aC {
    public final long A00;
    public final Uri A01;
    public final File A02;

    @Override // X.InterfaceC52102a4
    public long A9h() {
        return 0L;
    }

    @Override // X.InterfaceC52102a4
    public long A9q() {
        return 0L;
    }

    @Override // X.InterfaceC52102a4
    public String ABN() {
        return "video/*";
    }

    @Override // X.InterfaceC52182aC
    public int ACu() {
        return 0;
    }

    @Override // X.InterfaceC52182aC
    public byte ADz() {
        return (byte) 3;
    }

    @Override // X.InterfaceC52182aC
    public boolean AFH() {
        return false;
    }

    @Override // X.InterfaceC52102a4
    public int getType() {
        return 1;
    }

    public C52212aF(File file) {
        Uri fromFile = Uri.fromFile(file);
        long length = file.length();
        this.A01 = fromFile;
        this.A00 = length;
        this.A02 = file;
    }

    @Override // X.InterfaceC52102a4
    public Uri A88() {
        return this.A01;
    }

    @Override // X.InterfaceC52102a4
    public String A9f() {
        return this.A01.getPath();
    }

    @Override // X.InterfaceC52182aC
    public File AAA() {
        return this.A02;
    }

    @Override // X.InterfaceC52102a4
    public Bitmap AVV(int i) {
        String A9f = A9f();
        return C02180Ae.A0I(A9f == null ? null : new File(A9f));
    }

    @Override // X.InterfaceC52102a4
    public long getContentLength() {
        return this.A00;
    }
}
