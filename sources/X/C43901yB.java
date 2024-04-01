package X;

import android.app.Application;
import android.util.SparseArray;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: X.1yB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43901yB extends AbstractC43891yA {
    public static volatile C43901yB A01;
    public final SparseArray A00;

    public C43901yB(C001200o c001200o, AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C0EL c0el, C43911yC c43911yC, AnonymousClass035 anonymousClass035, C0E7 c0e7, C41451tw c41451tw, C000500h c000500h) {
        super(c001200o, anonymousClass012, abstractC000600i, interfaceC002901k, c0el, c43911yC, anonymousClass035, c0e7, c41451tw, c000500h);
        this.A00 = new SparseArray();
    }

    @Override // X.AbstractC43891yA
    public Map A04(String str, int i, String str2, String str3, String str4) {
        Map A04 = super.A04(str, i, str2, str3, null);
        ((AbstractMap) A04).put("id", Integer.toString(i));
        return A04;
    }

    @Override // X.AbstractC43891yA
    public synchronized boolean A0F(InterfaceC02170Ad interfaceC02170Ad, String str, int i) {
        C000700j.A00();
        C000700j.A07(A00(i) == 3);
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new C43991yL(((C0JL) interfaceC02170Ad).AAe(), this.A06, 0));
            try {
                File A0H = A0H(str, true, i);
                if (!AnonymousClass024.A0h(A0H)) {
                    Log.e("DoodleEmojiManager/store/Could not prepare temporary cache subdirectory");
                    zipInputStream.close();
                    return false;
                }
                String canonicalPath = A0H.getCanonicalPath();
                while (true) {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null) {
                        File A08 = AnonymousClass024.A08(canonicalPath, nextEntry.getName());
                        if (A08 != null) {
                            AnonymousClass024.A0i(zipInputStream, A08);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("DoodleEmojiManager/store/Potentially malicious file:");
                            sb.append(nextEntry.getName());
                            Log.e(sb.toString());
                            zipInputStream.close();
                            return false;
                        }
                    } else {
                        File A0H2 = A0H(str, false, i);
                        if (!AnonymousClass024.A0h(A0H2)) {
                            Log.e("DoodleEmojiManager/store/Could not prepare emoji subdirectory");
                            zipInputStream.close();
                            return false;
                        } else if (!A0H.renameTo(A0H2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("DoodleEmojiManager/store : rename failed, from ");
                            sb2.append(A0H.toString());
                            sb2.append(" to ");
                            sb2.append(A0H2.toString());
                            Log.e(sb2.toString());
                            zipInputStream.close();
                            return false;
                        } else {
                            A0I(i, str);
                            zipInputStream.close();
                            return true;
                        }
                    }
                }
            } finally {
            }
        } catch (IOException e) {
            Log.e("DoodleEmojiManager/store/Failed!", e);
            return false;
        }
    }

    public synchronized SparseArray A0G(int i) {
        SparseArray sparseArray = this.A00;
        if (sparseArray.get(i) != null) {
            return sparseArray;
        }
        C44001yM A012 = A01();
        if (A012 == null) {
            return sparseArray;
        }
        A0I(i, A012.A01(i));
        return sparseArray;
    }

    public final File A0H(String str, boolean z, int i) {
        Application application = this.A09.A00;
        if (!z) {
            File filesDir = application.getFilesDir();
            StringBuilder sb = new StringBuilder();
            sb.append("downloadable/doodle_emoji_");
            sb.append(i);
            sb.append("_");
            sb.append(str);
            return new File(filesDir, sb.toString());
        }
        File cacheDir = application.getCacheDir();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("downloadable/doodle_emoji_");
        sb2.append(i);
        sb2.append("_");
        sb2.append(str);
        sb2.append("_tmp");
        return new File(cacheDir, sb2.toString());
    }

    public final void A0I(int i, String str) {
        if (str != null) {
            File A0H = A0H(str, false, i);
            if (!A0H.exists()) {
                A0D(null, null, i);
                return;
            }
            String[] list = A0H.list();
            if (list == null) {
                A0D(null, null, i);
                return;
            }
            String absolutePath = A0H.getAbsolutePath();
            for (String str2 : list) {
                this.A00.put(Integer.parseInt(str2.split("\\.")[0].split("e")[1]), new File(absolutePath, str2));
            }
        }
    }
}
