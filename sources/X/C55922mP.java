package X;

import android.graphics.Bitmap;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.2mP  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C55922mP {
    public static final Bitmap A05 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    public C43751xu A00;
    public final long A01;
    public final C06F A02;
    public final File A03;
    public final Object A04 = new Object();

    public C55922mP(File file, long j) {
        this.A03 = file;
        this.A01 = j;
        final int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 8192);
        this.A02 = new C06F(maxMemory) { // from class: X.329
            @Override // X.C06F
            public int A02(Object obj, Object obj2) {
                return ((Bitmap) obj2).getByteCount() >> 10;
            }
        };
    }

    public Bitmap A00(String str, int i, int i2) {
        C43781xx c43781xx;
        A01();
        synchronized (this.A04) {
            C43751xu c43751xu = this.A00;
            Bitmap bitmap = null;
            if (c43751xu != null) {
                try {
                    c43781xx = c43751xu.A08(str);
                } catch (IOException unused) {
                    Log.e("bitmapcache/journal corrupted");
                    c43781xx = null;
                }
                if (c43781xx != null) {
                    try {
                        InputStream inputStream = c43781xx.A00[0];
                        if (inputStream != null) {
                            try {
                                Bitmap bitmap2 = C002701i.A0M(inputStream, new C0DH(i, i2)).A02;
                                if (bitmap2 == null) {
                                    try {
                                        Log.e("bitmapcache/decode failed");
                                        try {
                                            return null;
                                        } catch (IOException unused2) {
                                            bitmap = bitmap2;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        try {
                                            throw th;
                                        } finally {
                                            try {
                                                inputStream.close();
                                            } catch (Throwable unused3) {
                                            }
                                        }
                                    }
                                } else {
                                    bitmap = bitmap2;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (IOException unused4) {
                    }
                }
            }
            return bitmap;
        }
    }

    public final void A01() {
        synchronized (this.A04) {
            C43751xu c43751xu = this.A00;
            if (c43751xu == null || c43751xu.A03 == null) {
                File file = this.A03;
                if (!file.exists() && !file.mkdirs() && !file.exists()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("bitmapcache/initDiskCache: unable to create cache dir ");
                    sb.append(file);
                    Log.e(sb.toString());
                }
                long usableSpace = file.getUsableSpace();
                long j = this.A01;
                if (usableSpace > j) {
                    try {
                        this.A00 = C43751xu.A00(file, j);
                    } catch (IOException e) {
                        Log.e("bitmapcache/initDiskCache ", e);
                    }
                }
            }
        }
    }

    public void A02(String str, InputStream inputStream) {
        A01();
        synchronized (this.A04) {
            C43751xu c43751xu = this.A00;
            if (c43751xu != null) {
                try {
                    C43781xx A08 = c43751xu.A08(str);
                    if (A08 == null) {
                        C43761xv A07 = this.A00.A07(str);
                        if (A07 != null) {
                            OutputStream A00 = A07.A00();
                            try {
                                AnonymousClass024.A0V(inputStream, A00);
                                if (A07.A00) {
                                    C43751xu c43751xu2 = A07.A02;
                                    C43751xu.A02(c43751xu2, A07, false);
                                    c43751xu2.A0B(A07.A01.A03);
                                } else {
                                    C43751xu.A02(A07.A02, A07, true);
                                }
                                A00.close();
                            } finally {
                            }
                        }
                    } else {
                        A08.A00[0].close();
                    }
                    synchronized (this.A00) {
                    }
                } catch (Exception e) {
                    Log.e("bitmapcache/download ", e);
                    synchronized (this.A00) {
                    }
                }
            }
        }
    }

    public void A03(boolean z) {
        C06F c06f = this.A02;
        synchronized (c06f) {
            c06f.A07(-1);
        }
        synchronized (this.A04) {
            C43751xu c43751xu = this.A00;
            if (c43751xu != null) {
                if (z) {
                    try {
                        c43751xu.close();
                        C43751xu.A04(c43751xu.A07);
                    } catch (IOException e) {
                        Log.e("bitmapcache/close ", e);
                    }
                }
                C43751xu c43751xu2 = this.A00;
                if (c43751xu2.A03 != null) {
                    c43751xu2.close();
                }
                this.A00 = null;
            }
        }
    }
}
