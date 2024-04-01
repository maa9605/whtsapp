package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: X.3GC  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3GC implements C2zH {
    public final C000400f A00;
    public final File A01;

    public C3GC(C000400f c000400f, File file) {
        this.A00 = c000400f;
        this.A01 = file;
    }

    @Override // X.C2zH
    public OutputStream AQY(InterfaceC02170Ad interfaceC02170Ad) {
        if (interfaceC02170Ad.getContentLength() <= this.A00.A02()) {
            try {
                File file = this.A01;
                AnonymousClass024.A0f(file);
                return new FileOutputStream(file, false);
            } catch (FileNotFoundException e) {
                Log.e("plainfiledownload/FileNotFoundException", e);
                throw new C63122zA(9);
            }
        }
        StringBuilder A0P = C000200d.A0P("plainfiledownload/not enough space to store the file: ");
        A0P.append(this.A01);
        Log.w(A0P.toString());
        throw new C63122zA(4);
    }
}
