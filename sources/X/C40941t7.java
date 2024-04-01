package X;

import com.whatsapp.util.Log;
import java.io.EOFException;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1t7 */
/* loaded from: classes2.dex */
public class C40941t7 {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public AbstractC71993Yg A07;
    public File A08;
    public Long A09;
    public boolean A0A;
    public boolean A0C;
    public boolean A0D;
    public volatile File A0G;
    public boolean A0B = false;
    public final List A0F = new CopyOnWriteArrayList();
    public final C72003Yh A0E = new C72003Yh();

    public synchronized int A00() {
        return this.A01;
    }

    public synchronized long A01() {
        long j = this.A04;
        if (j == 0) {
            return this.A03;
        }
        return j;
    }

    public synchronized File A02() {
        return this.A0G;
    }

    public synchronized void A03() {
        File file = this.A08;
        if (file != null) {
            if (!file.delete()) {
                Log.w("DownloadContext/unable to delete chunkstore file");
            }
            this.A08 = null;
        }
    }

    public synchronized void A04(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            for (InterfaceC49332Jq interfaceC49332Jq : this.A0F) {
                interfaceC49332Jq.AJZ(i);
            }
        }
    }

    public synchronized void A05(int i) {
        if (this.A01 != i) {
            this.A01 = i;
            for (InterfaceC49332Jq interfaceC49332Jq : this.A0F) {
                interfaceC49332Jq.AJa(this);
            }
        }
    }

    public synchronized void A06(long j, long j2) {
        this.A06 = j;
        for (InterfaceC49332Jq interfaceC49332Jq : this.A0F) {
            interfaceC49332Jq.AI3(this, j2);
        }
    }

    public synchronized void A07(File file) {
        this.A0G = file;
        for (InterfaceC49332Jq interfaceC49332Jq : this.A0F) {
            interfaceC49332Jq.AKK(this);
        }
    }

    public synchronized boolean A08() {
        return this.A0B;
    }

    public synchronized boolean A09(long j) {
        if (this.A01 == 3) {
            return true;
        }
        if (this.A07 == null) {
            return false;
        }
        if (j <= A01()) {
            return this.A07.A0A(this.A07.A01(j));
        }
        throw new EOFException();
    }
}
