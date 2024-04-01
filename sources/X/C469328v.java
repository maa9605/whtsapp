package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;

/* renamed from: X.28v  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C469328v {
    public HashSet A00;
    public final C001200o A01;

    public C469328v(C001200o c001200o) {
        this.A01 = c001200o;
    }

    /* JADX WARN: Finally extract failed */
    public HashSet A00() {
        HashSet hashSet = this.A00;
        if (hashSet != null) {
            return hashSet;
        }
        File file = new File(this.A01.A00.getFilesDir(), "invalid_numbers");
        if (file.exists() && file.canRead()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                    this.A00 = (HashSet) objectInputStream.readObject();
                    objectInputStream.close();
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused) {
                        }
                        throw th2;
                    }
                }
            } catch (IOException | ClassNotFoundException | IllegalArgumentException e) {
                Log.e(e);
            }
        }
        HashSet hashSet2 = this.A00;
        if (hashSet2 == null) {
            HashSet hashSet3 = new HashSet();
            this.A00 = hashSet3;
            return hashSet3;
        }
        return hashSet2;
    }
}
