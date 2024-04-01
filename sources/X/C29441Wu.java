package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* renamed from: X.1Wu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C29441Wu extends AbstractRunnableC18610u1 {
    public final /* synthetic */ C29451Wv A00;

    public C29441Wu(C29451Wv c29451Wv) {
        this.A00 = c29451Wv;
    }

    @Override // X.AbstractRunnableC18610u1, java.lang.Runnable
    public void run() {
        C29451Wv c29451Wv = this.A00;
        final Bitmap decodeFile = BitmapFactory.decodeFile(c29451Wv.A05);
        if (decodeFile == null) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    InputStream openStream = new URL(c29451Wv.A06).openStream();
                    try {
                        fileOutputStream = ((C0SK) c29451Wv).A09.openFileOutput("copyright_logo", 0);
                        byte[] bArr = new byte[2048];
                        while (true) {
                            int read = openStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        decodeFile = BitmapFactory.decodeFile(c29451Wv.A05);
                        try {
                            openStream.close();
                        } catch (IOException unused) {
                        }
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        if (openStream != null) {
                            try {
                                openStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    } catch (Throwable th) {
                        if (openStream != null) {
                            try {
                                openStream.close();
                            } catch (IOException unused4) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (IOException unused5) {
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (IOException unused6) {
            }
        }
        C18620u2.A02.post(new AbstractRunnableC18610u1() { // from class: X.1Wt
            @Override // X.AbstractRunnableC18610u1, java.lang.Runnable
            public void run() {
                Bitmap bitmap = decodeFile;
                if (bitmap != null) {
                    C29451Wv c29451Wv2 = C29441Wu.this.A00;
                    c29451Wv2.A04 = bitmap;
                    c29451Wv2.A00 = bitmap.getHeight();
                    c29451Wv2.A0A();
                    c29451Wv2.A01();
                }
                C29441Wu.this.A00.A08 = false;
            }
        });
    }
}
