package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: X.1y9 */
/* loaded from: classes2.dex */
public abstract class AbstractC43881y9 extends AbstractC43891yA {
    public AbstractC43881y9(C001200o c001200o, AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C0EL c0el, C43911yC c43911yC, AnonymousClass035 anonymousClass035, C0E7 c0e7, C41451tw c41451tw, C000500h c000500h) {
        super(c001200o, anonymousClass012, abstractC000600i, interfaceC002901k, c0el, c43911yC, anonymousClass035, c0e7, c41451tw, c000500h);
    }

    @Override // X.AbstractC43891yA
    public boolean A0F(InterfaceC02170Ad interfaceC02170Ad, String str, int i) {
        C000700j.A06(i == 0);
        return A0J(interfaceC02170Ad, str);
    }

    public synchronized int A0G() {
        return A00(0);
    }

    public synchronized void A0H(int i) {
        A08(i, 0);
    }

    public boolean A0I() {
        boolean z;
        if (!(this instanceof C44011yN)) {
            C43951yH c43951yH = ((C43871y8) this).A01;
            if (c43951yH.A00() != 2) {
                String A02 = c43951yH.A02();
                if (!TextUtils.isEmpty(A02)) {
                    File file = new File(c43951yH.A04.A00.getFilesDir(), A02);
                    if (file.exists()) {
                        File file2 = new File(file, "flatfile");
                        File file3 = new File(file, "offsetfile.json");
                        if (!file2.exists() || !file3.exists()) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        C44011yN c44011yN = (C44011yN) this;
        synchronized (c44011yN) {
            z = !c44011yN.A0L().isEmpty();
        }
        return z;
    }

    public boolean A0J(InterfaceC02170Ad interfaceC02170Ad, String str) {
        C44011yN c44011yN = (C44011yN) this;
        C000700j.A00();
        C000700j.A07(c44011yN.A0G() == 3);
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new C43991yL(interfaceC02170Ad.AAe(), c44011yN.A06, 0));
            File A0K = c44011yN.A0K(str, true);
            if (!AnonymousClass024.A0h(A0K)) {
                Log.e("FilterManager/store/Could not prepare temporary cache subdirectory");
                zipInputStream.close();
                return false;
            }
            byte[] bArr = new byte[8192];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    File A08 = AnonymousClass024.A08(A0K.getCanonicalPath(), nextEntry.getName());
                    if (A08 == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("FilterManager/store/malicious zip file:");
                        sb.append(nextEntry.getName());
                        Log.e(sb.toString());
                        zipInputStream.close();
                        return false;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(A08);
                    while (true) {
                        try {
                            int read = zipInputStream.read(bArr);
                            if (read != -1) {
                                fileOutputStream.write(bArr, 0, read);
                            }
                        } finally {
                        }
                    }
                    fileOutputStream.close();
                } else {
                    synchronized (c44011yN) {
                        File A0K2 = c44011yN.A0K(str, false);
                        if (!AnonymousClass024.A0h(A0K2)) {
                            Log.e("FilterManager/store/Could not prepare filters subdirectory");
                            zipInputStream.close();
                            return false;
                        } else if (!A0K.renameTo(A0K2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("FilterManager/store : rename failed, from ");
                            sb2.append(A0K.toString());
                            sb2.append(" to ");
                            sb2.append(A0K2.toString());
                            Log.e(sb2.toString());
                            zipInputStream.close();
                            return false;
                        } else {
                            zipInputStream.close();
                            return true;
                        }
                    }
                }
            }
        } catch (IOException e) {
            Log.e("FilterManager/store/Failed!", e);
            return false;
        }
    }
}
