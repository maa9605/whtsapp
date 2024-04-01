package X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.provider.MediaStore;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0F2 */
/* loaded from: classes.dex */
public class C0F2 {
    public static volatile C0F2 A07;
    public ExecutorC004702d A00;
    public final C012005w A01;
    public final C02E A02;
    public final C001200o A03;
    public final C0H1 A04;
    public final C02O A05;
    public final InterfaceC002901k A06;

    public C0F2(C001200o c001200o, InterfaceC002901k interfaceC002901k, C012005w c012005w, C02E c02e, C0H1 c0h1, C02O c02o) {
        this.A03 = c001200o;
        this.A06 = interfaceC002901k;
        this.A01 = c012005w;
        this.A02 = c02e;
        this.A04 = c0h1;
        this.A05 = c02o;
    }

    public static C0F2 A00() {
        if (A07 == null) {
            synchronized (C0F2.class) {
                if (A07 == null) {
                    A07 = new C0F2(C001200o.A01, C002801j.A00(), C012005w.A00(), C02E.A00(), C0H1.A00(), C02O.A00());
                }
            }
        }
        return A07;
    }

    public int A01(File file, byte b, boolean z, int i) {
        if (A0A(file)) {
            int A02 = A02(file, i);
            if (z && A02 < 0) {
                file.getAbsolutePath();
                if (this.A01 != null) {
                    AnonymousClass024.A0f(file);
                    A06(b, file);
                } else {
                    throw null;
                }
            }
            return A02;
        }
        return 0;
    }

    /* JADX WARN: Finally extract failed */
    public final int A02(File file, int i) {
        int i2;
        C0H1 c0h1 = this.A04;
        String absolutePath = file.getAbsolutePath();
        if (c0h1 != null) {
            C000700j.A07(i >= 0);
            C0CD A04 = c0h1.A01.A04();
            try {
                C03790Hb A00 = A04.A00();
                int A01 = c0h1.A01(absolutePath);
                if (A01 <= i) {
                    A04.A02.A01("media_refs", "path = ?", new String[]{absolutePath});
                } else {
                    C0CF A012 = c0h1.A02.A01("UPDATE media_refs SET ref_count = ref_count + ? WHERE path = ?");
                    A012.A04(1, -i);
                    A012.A05(2, absolutePath);
                    if (A012.A00() == 0) {
                        i2 = -1;
                        A00.A00();
                        A00.close();
                        A04.close();
                        file.getAbsolutePath();
                        return i2;
                    }
                }
                i2 = A01 - i;
                A00.A00();
                A00.close();
                A04.close();
                file.getAbsolutePath();
                return i2;
            } finally {
            }
        } else {
            throw null;
        }
    }

    public File A03() {
        C012005w c012005w = this.A01;
        if (c012005w != null) {
            File file = new File(c012005w.A03.A00.getFilesDir(), "Stickers");
            AbstractC012105x.A03(file, false);
            return file;
        }
        throw null;
    }

    public File A04(String str) {
        File A05 = A05(str);
        if (A05.exists()) {
            A08(A05, 1, true);
            return A05;
        }
        return null;
    }

    public File A05(String str) {
        File A03 = A03();
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace('/', '-'));
        sb.append(".webp");
        return new File(A03, sb.toString());
    }

    public void A06(byte b, final File file) {
        final Uri uri;
        ExecutorC004702d executorC004702d;
        if (b == 1) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (b != 2) {
            uri = (b == 3 || b == 13) ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : null;
        } else {
            uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        }
        synchronized (this) {
            executorC004702d = this.A00;
            if (executorC004702d == null) {
                executorC004702d = new ExecutorC004702d(this.A06, false);
                this.A00 = executorC004702d;
            }
        }
        executorC004702d.execute(new Runnable() { // from class: X.1IO
            {
                C0F2.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0F2 c0f2 = C0F2.this;
                Uri uri2 = uri;
                File file2 = file;
                if (uri2 != null) {
                    ContentResolver A072 = c0f2.A02.A07();
                    if (A072 == null) {
                        Log.w("ReferenceCountedFileManager/deleteFileFromMediaProvider content resolver is null");
                        return;
                    }
                    try {
                        A072.delete(uri2, "_data=?", new String[]{file2.getAbsolutePath()});
                    } catch (IllegalArgumentException e) {
                        e = e;
                        Log.e("ReferenceCountedFileManager/deleteFileFromMediaProvider", e);
                    } catch (NullPointerException e2) {
                        e = e2;
                        Log.e("ReferenceCountedFileManager/deleteFileFromMediaProvider", e);
                    } catch (SecurityException e3) {
                        e = e3;
                        Log.e("ReferenceCountedFileManager/deleteFileFromMediaProvider", e);
                    } catch (UnsupportedOperationException e4) {
                        e = e4;
                        Log.e("ReferenceCountedFileManager/deleteFileFromMediaProvider", e);
                    } catch (RuntimeException e5) {
                        String message = e5.getMessage();
                        if (message != null && message.contains("android.os.DeadSystemException")) {
                            Log.e("ReferenceCountedFileManager/deleteFileFromMediaProvider", e5);
                            return;
                        }
                        throw e5;
                    }
                }
            }
        });
    }

    public void A07(File file, int i, boolean z) {
        if (A0A(file)) {
            A08(file, i, z);
        }
    }

    public final void A08(File file, int i, boolean z) {
        if (!z) {
            i--;
        }
        C0H1 c0h1 = this.A04;
        String absolutePath = file.getAbsolutePath();
        if (c0h1 != null) {
            if (i != 0) {
                C000700j.A07(i > 0);
                C0CD A04 = c0h1.A01.A04();
                try {
                    C03790Hb A00 = A04.A00();
                    C0CF A01 = c0h1.A02.A01("UPDATE media_refs SET ref_count = ref_count + ? WHERE path = ?");
                    A01.A04(1, i);
                    A01.A05(2, absolutePath);
                    if (A01.A00() == 0) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("path", absolutePath);
                        contentValues.put("ref_count", Integer.valueOf(i));
                        A04.A02.A02("media_refs", contentValues);
                    }
                    A00.A00();
                    A00.close();
                } finally {
                }
            }
            file.getAbsolutePath();
            return;
        }
        throw null;
    }

    public void A09(String str) {
        File A05 = A05(str);
        if (A02(A05, 1) < 0) {
            A05.getAbsolutePath();
            if (this.A01 == null) {
                throw null;
            }
            AnonymousClass024.A0f(A05);
        }
    }

    public final boolean A0A(File file) {
        try {
            C012005w c012005w = this.A01;
            if (!c012005w.A0S(file) && !c012005w.A0R(file)) {
                if (!file.getCanonicalPath().startsWith(c012005w.A04().A08.getCanonicalPath())) {
                    return false;
                }
            }
            return true;
        } catch (IOException e) {
            Log.e("ReferenceCountedFileManager/isExternalManagedMediaFile ", e);
            return false;
        }
    }
}
