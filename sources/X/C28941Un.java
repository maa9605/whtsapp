package X;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* renamed from: X.1Un  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28941Un implements InterfaceC15860pS {
    public C15910pX A00;
    public boolean A01;
    public final Context A02;
    public final AbstractC15830pP A03;
    public final Object A04 = new Object();
    public final String A05;
    public final boolean A06;

    public C28941Un(Context context, String str, AbstractC15830pP abstractC15830pP, boolean z) {
        this.A02 = context;
        this.A05 = str;
        this.A03 = abstractC15830pP;
        this.A06 = z;
    }

    public final C15910pX A00() {
        C15910pX c15910pX;
        C15910pX c15910pX2;
        String str;
        synchronized (this.A04) {
            if (this.A00 == null) {
                C28931Um[] c28931UmArr = new C28931Um[1];
                if (Build.VERSION.SDK_INT >= 23 && (str = this.A05) != null && this.A06) {
                    Context context = this.A02;
                    c15910pX2 = new C15910pX(context, new File(context.getNoBackupFilesDir(), str).getAbsolutePath(), c28931UmArr, this.A03);
                    this.A00 = c15910pX2;
                } else {
                    c15910pX2 = new C15910pX(this.A02, this.A05, c28931UmArr, this.A03);
                    this.A00 = c15910pX2;
                }
                c15910pX2.setWriteAheadLoggingEnabled(this.A01);
            }
            c15910pX = this.A00;
        }
        return c15910pX;
    }

    @Override // X.InterfaceC15860pS
    public InterfaceC15820pO AE5() {
        return A00().A01();
    }

    @Override // X.InterfaceC15860pS
    public void AUD(boolean z) {
        synchronized (this.A04) {
            C15910pX c15910pX = this.A00;
            if (c15910pX != null) {
                c15910pX.setWriteAheadLoggingEnabled(z);
            }
            this.A01 = z;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        A00().close();
    }
}
