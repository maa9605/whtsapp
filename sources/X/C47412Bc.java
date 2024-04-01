package X;

import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.2Bc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47412Bc {
    public static volatile C47412Bc A06;
    public C47472Bi A00;
    public final AbstractC000600i A01;
    public final C001200o A02;
    public final C04Z A03;
    public final String A04 = "commerce.db";
    public final ReentrantReadWriteLock A05 = new ReentrantReadWriteLock();

    public C47412Bc(AbstractC000600i abstractC000600i, C001200o c001200o, C04Z c04z) {
        this.A01 = abstractC000600i;
        this.A02 = c001200o;
        this.A03 = c04z;
    }

    public static C47412Bc A00() {
        if (A06 == null) {
            synchronized (C47412Bc.class) {
                if (A06 == null) {
                    A06 = new C47412Bc(AbstractC000600i.A00(), C001200o.A01, C04Z.A00());
                }
            }
        }
        return A06;
    }

    public C0CD A01() {
        return new C0CD(this.A05.readLock(), A02(), true);
    }

    public synchronized C47472Bi A02() {
        C47472Bi c47472Bi;
        c47472Bi = this.A00;
        if (c47472Bi == null) {
            c47472Bi = new C47472Bi(this.A02, this.A03, this.A04);
            this.A00 = c47472Bi;
        }
        return c47472Bi;
    }

    public File A03() {
        return this.A02.A00.getDatabasePath(this.A04);
    }

    public synchronized void A04() {
        C47472Bi c47472Bi = this.A00;
        if (c47472Bi != null) {
            c47472Bi.close();
            this.A00 = null;
        }
    }
}
