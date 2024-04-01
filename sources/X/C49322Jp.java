package X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.whatsapp.util.Log;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.2Jp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C49322Jp implements InterfaceC06380Sv, InterfaceC49332Jq {
    public long A00;
    public long A01;
    public long A02;
    public RandomAccessFile A03;
    public boolean A04;
    public final Handler A05 = new Handler(Looper.getMainLooper());
    public final C018708s A06;
    public final C000400f A07;
    public final C001200o A08;
    public final C0DK A09;
    public final C09B A0A;
    public final C40941t7 A0B;
    public final C83793sh A0C;

    @Override // X.InterfaceC06380Sv
    public void A5K(C12L c12l) {
    }

    @Override // X.InterfaceC49332Jq
    public void AI3(C40941t7 c40941t7, long j) {
    }

    @Override // X.InterfaceC49332Jq
    public void AJZ(int i) {
    }

    @Override // X.InterfaceC49332Jq
    public void ANy() {
    }

    public C49322Jp(C001200o c001200o, C018708s c018708s, C000400f c000400f, C0DK c0dk, C09B c09b, C40941t7 c40941t7, C83793sh c83793sh) {
        this.A08 = c001200o;
        this.A06 = c018708s;
        this.A07 = c000400f;
        this.A09 = c0dk;
        this.A0A = c09b;
        this.A0B = c40941t7;
        this.A0C = c83793sh;
    }

    @Override // X.InterfaceC06380Sv
    public /* synthetic */ Map ACr() {
        return Collections.emptyMap();
    }

    @Override // X.InterfaceC06380Sv
    public Uri ADi() {
        return Uri.fromFile(this.A0B.A02());
    }

    @Override // X.InterfaceC49332Jq
    public void AJa(C40941t7 c40941t7) {
        this.A05.post(new RunnableEBaseShape2S0200000_I0_2(this, c40941t7, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    @Override // X.InterfaceC49332Jq
    public void AKK(C40941t7 c40941t7) {
        RandomAccessFile randomAccessFile;
        ?? r1;
        File A02 = this.A0B.A02();
        if (!this.A04 || (randomAccessFile = this.A03) == null) {
            return;
        }
        try {
            long filePointer = randomAccessFile.getFilePointer();
            RandomAccessFile randomAccessFile2 = null;
            try {
                this.A03.close();
                try {
                    r1 = "r";
                    RandomAccessFile randomAccessFile3 = new RandomAccessFile(A02, "r");
                    this.A03 = randomAccessFile3;
                    randomAccessFile3.seek(filePointer);
                } catch (IOException e) {
                    Log.e(e);
                    randomAccessFile2 = r1;
                    Log.e("WhatsappChunkAwareDataSource/hotswap failed");
                }
            } catch (IOException e2) {
                Log.e(e2);
            } finally {
                this.A03 = randomAccessFile2;
            }
        } catch (IOException e3) {
            Log.e(e3);
        }
    }

    @Override // X.InterfaceC06380Sv
    public long AQX(AnonymousClass126 anonymousClass126) {
        this.A00 = 0L;
        long j = anonymousClass126.A04;
        this.A02 = j;
        C40941t7 c40941t7 = this.A0B;
        synchronized (c40941t7) {
            c40941t7.A0F.add(this);
        }
        C72003Yh c72003Yh = c40941t7.A0E;
        long j2 = this.A02;
        Handler handler = c72003Yh.A02;
        handler.removeCallbacks(c72003Yh.A01);
        RunnableEBaseShape0S0100100_I0 runnableEBaseShape0S0100100_I0 = new RunnableEBaseShape0S0100100_I0(c72003Yh, j2, 6);
        c72003Yh.A01 = runnableEBaseShape0S0100100_I0;
        handler.postDelayed(runnableEBaseShape0S0100100_I0, 200L);
        long A01 = c40941t7.A01() - j;
        this.A01 = A01;
        return A01;
    }

    @Override // X.InterfaceC06380Sv
    public void close() {
        RandomAccessFile randomAccessFile = this.A03;
        if (randomAccessFile != null) {
            try {
                try {
                    randomAccessFile.close();
                } catch (IOException e) {
                    throw new AnonymousClass128(e);
                }
            } finally {
                this.A03 = null;
                if (this.A04) {
                    this.A04 = false;
                }
            }
        }
        C40941t7 c40941t7 = this.A0B;
        synchronized (c40941t7) {
            c40941t7.A0F.remove(this);
        }
    }

    @Override // X.InterfaceC06380Sv
    public int read(byte[] bArr, int i, int i2) {
        long A01;
        C40941t7 c40941t7 = this.A0B;
        if (c40941t7.A00() == 0 || c40941t7.A00() == 2) {
            return 0;
        }
        C000700j.A08(c40941t7.A02() != null, "downloadFile is null");
        if (!this.A04) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(c40941t7.A02(), "r");
                this.A03 = randomAccessFile;
                randomAccessFile.seek(this.A02);
                this.A04 = true;
            } catch (IOException e) {
                throw new AnonymousClass128(e);
            }
        }
        int min = (int) Math.min(i2, this.A01 - this.A00);
        if (min == 0) {
            return -1;
        }
        RandomAccessFile randomAccessFile2 = this.A03;
        if (randomAccessFile2 != null) {
            if (c40941t7.A09(randomAccessFile2.getFilePointer())) {
                long filePointer = this.A03.getFilePointer();
                synchronized (c40941t7) {
                    if (c40941t7.A01 == 3) {
                        A01 = c40941t7.A04 - filePointer;
                    } else if (!c40941t7.A09(filePointer)) {
                        return 0;
                    } else {
                        if (filePointer <= c40941t7.A01()) {
                            long A07 = c40941t7.A07.A07(filePointer);
                            A01 = A07 == -1 ? c40941t7.A01() - filePointer : A07 - filePointer;
                        } else {
                            throw new EOFException();
                        }
                    }
                    if (A01 != 0) {
                        int read = this.A03.read(bArr, i, (int) Math.min(min, A01));
                        if (read == -1) {
                            if (this.A01 == this.A00) {
                                return -1;
                            }
                            throw new EOFException();
                        }
                        this.A00 += read;
                        return read;
                    }
                    return 0;
                }
            }
            return 0;
        }
        throw null;
    }
}
