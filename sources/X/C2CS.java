package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.2CS  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2CS {
    public static volatile C2CS A0B;
    public final C02L A00;
    public final C03310Fe A01;
    public final AnonymousClass034 A02;
    public final C000400f A03;
    public final C001200o A04;
    public final C03290Fc A05;
    public final C47412Bc A06;
    public final C003701t A07;
    public final C0Fi A08;
    public final C03280Fb A09;
    public final File A0A;

    public C2CS(C001200o c001200o, C003701t c003701t, C03280Fb c03280Fb, C02L c02l, AnonymousClass034 anonymousClass034, C03290Fc c03290Fc, C03310Fe c03310Fe, C47412Bc c47412Bc, C000400f c000400f, C0Fi c0Fi) {
        this.A04 = c001200o;
        this.A07 = c003701t;
        this.A09 = c03280Fb;
        this.A00 = c02l;
        this.A02 = anonymousClass034;
        this.A05 = c03290Fc;
        this.A01 = c03310Fe;
        this.A06 = c47412Bc;
        this.A03 = c000400f;
        this.A08 = c0Fi;
        this.A0A = new File(anonymousClass034.A02(), "commerce_backup.db");
    }

    public static C2CS A00() {
        if (A0B == null) {
            synchronized (C2CS.class) {
                if (A0B == null) {
                    A0B = new C2CS(C001200o.A01, C003701t.A00(), C03280Fb.A00(), C02L.A00(), AnonymousClass034.A00(), C03290Fc.A00(), C03310Fe.A00(), C47412Bc.A00(), C000400f.A00(), C0Fi.A00());
                }
            }
        }
        return A0B;
    }

    public void A01() {
        EnumC03450Ft enumC03450Ft = EnumC03450Ft.CRYPT13;
        List A05 = C03460Fu.A05(enumC03450Ft, EnumC03450Ft.A00());
        ((AbstractCollection) A05).add(".crypt1");
        File file = this.A0A;
        ArrayList A04 = C03460Fu.A04(file, A05);
        C03460Fu.A0C(A04, file);
        if (A04.isEmpty()) {
            return;
        }
        File file2 = (File) A04.get(0);
        synchronized (this) {
            C47412Bc c47412Bc = this.A06;
            ReentrantReadWriteLock.WriteLock writeLock = c47412Bc.A05.writeLock();
            writeLock.lock();
            try {
                c47412Bc.A04();
                File A03 = c47412Bc.A03();
                if (!file2.exists()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("commerce_backup_store/backup/backup-file-not-found");
                    sb.append(file2);
                    Log.i(sb.toString());
                    writeLock.unlock();
                    return;
                }
                file2.length();
                int A00 = C03460Fu.A00(file2.getName(), "commerce_backup.db");
                if (A00 <= 0 || (A00 >= enumC03450Ft.version && (enumC03450Ft = EnumC03450Ft.A02(A00)) == null)) {
                    enumC03450Ft = EnumC03450Ft.UNENCRYPTED;
                }
                C0HN A02 = C0HH.A00(enumC03450Ft, this.A09, this.A00, this.A05, this.A01, this.A03, this.A08, file2).A02(this.A04, A03, 0, 0, false, null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("commerce_backup_store/restore/result ");
                sb2.append(A02);
                Log.i(sb2.toString());
                writeLock.unlock();
            } catch (C03840Hi | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
                Log.w("commerce_backup_store/restore/error", e);
                writeLock.unlock();
            }
        }
    }
}
