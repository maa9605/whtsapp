package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.2h0  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC53492h0 implements InterfaceC52102a4 {
    public AnonymousClass097 A00;
    public final long A01;
    public final long A02;
    public final Uri A03;
    public final File A04;

    public AbstractC53492h0(Uri uri, long j) {
        this.A04 = null;
        this.A03 = uri;
        this.A01 = 0L;
        this.A02 = j;
    }

    public AbstractC53492h0(File file, long j) {
        this.A04 = file;
        this.A03 = Uri.fromFile(file);
        this.A01 = file.length();
        this.A02 = j;
    }

    @Override // X.InterfaceC52102a4
    public final Uri A88() {
        return this.A03;
    }

    @Override // X.InterfaceC52102a4
    public String A9f() {
        File file = this.A04;
        if (file != null) {
            return file.getAbsolutePath();
        }
        return null;
    }

    @Override // X.InterfaceC52102a4
    public final long A9h() {
        return this.A02;
    }

    @Override // X.InterfaceC52102a4
    public final long getContentLength() {
        return this.A01;
    }
}
