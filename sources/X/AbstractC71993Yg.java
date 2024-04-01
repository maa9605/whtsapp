package X;

import com.whatsapp.util.Log;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Yg */
/* loaded from: classes2.dex */
public abstract class AbstractC71993Yg {
    public final int A00;
    public final long A01;
    public final int[] A02;

    public AbstractC71993Yg(long j, int i, int[] iArr) {
        this.A01 = j;
        this.A00 = i;
        if (iArr == null) {
            this.A02 = new int[i];
        } else {
            this.A02 = iArr;
        }
    }

    public int A00(int i) {
        long j;
        if (!(this instanceof C83333rx)) {
            C83323rw c83323rw = (C83323rw) this;
            if (i == c83323rw.A00 - 1) {
                long j2 = c83323rw.A01;
                j = Math.min(j2, ((AbstractC71993Yg) c83323rw).A01 % j2);
            } else {
                j = c83323rw.A01;
            }
            return (int) j;
        }
        return ((Number) ((C83333rx) this).A00.get(i)).intValue();
    }

    public int A01(long j) {
        int i = 0;
        C000700j.A07(j >= 0);
        C000700j.A07(j < this.A01);
        int i2 = 0;
        while (i < this.A00) {
            i2 += A00(i);
            if (j < i2) {
                return i;
            }
            i++;
        }
        return i;
    }

    public long A02() {
        long j = 0;
        for (int i = 0; i < this.A00; i++) {
            j += A04(i);
        }
        return j;
    }

    public long A03(int i) {
        long j = 0;
        for (int i2 = 0; i2 < i && i2 < this.A00; i2++) {
            j += A00(i2);
        }
        return j;
    }

    public final synchronized long A04(int i) {
        return this.A02[i];
    }

    public long A05(long j) {
        int i;
        if (j >= this.A01) {
            return -1L;
        }
        int A01 = A01(j);
        do {
            A01++;
            i = this.A00;
            if (A01 >= i) {
                break;
            }
        } while (A04(A01) == 0);
        if (A01 == i) {
            return -1L;
        }
        return A03(A01);
    }

    public long A06(long j) {
        int i;
        if (j >= this.A01) {
            return -1L;
        }
        int A01 = A01(j);
        while (true) {
            i = this.A00;
            if (A01 >= i || !A0A(A01)) {
                break;
            }
            A01++;
        }
        if (A01 == i) {
            return -1L;
        }
        return A04(A01) + A03(A01);
    }

    public long A07(long j) {
        int i;
        if (j >= this.A01) {
            return -1L;
        }
        int A01 = A01(j);
        while (true) {
            i = this.A00;
            if (A01 >= i || !A0A(A01)) {
                break;
            }
            A01++;
        }
        if (A01 == i) {
            return -1L;
        }
        return A03(A01);
    }

    public List A08(long j, long j2, boolean z) {
        ArrayList arrayList = new ArrayList();
        while (j2 > 0) {
            int A01 = A01(j);
            long A03 = j - A03(A01);
            C000700j.A07(A03 >= 0);
            C000700j.A07(A03 < ((long) A00(A01)));
            int A012 = A01(j);
            long A04 = A04(A012);
            if (A03 > A04) {
                throw new IllegalStateException("gap in downloaded chunk");
            }
            long j3 = A03 + j2;
            if (j3 < A04) {
                return arrayList;
            }
            int A00 = A00(A012);
            long j4 = A00;
            if (j3 > j4) {
                if (z) {
                    synchronized (this) {
                        this.A02[A012] = A00;
                    }
                }
                j2 = j3 - j4;
                int i = A012 + 1;
                if (i < this.A00) {
                    arrayList.add(Integer.valueOf(A012));
                    j = A03(i);
                } else {
                    throw new IllegalStateException("downloaded more bytes than chunks");
                }
            } else {
                if (z) {
                    int i2 = (int) j3;
                    synchronized (this) {
                        this.A02[A012] = i2;
                    }
                }
                if (j3 == A00(A012)) {
                    arrayList.add(Integer.valueOf(A012));
                }
                j2 = 0;
            }
        }
        return arrayList;
    }

    public void A09(File file) {
        if (!(this instanceof C83333rx)) {
            C83323rw c83323rw = (C83323rw) this;
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                dataOutputStream.writeLong(((AbstractC71993Yg) c83323rw).A01);
                dataOutputStream.writeLong(c83323rw.A01);
                dataOutputStream.writeInt(c83323rw.A00);
                for (int i = 0; i < ((AbstractC71993Yg) c83323rw).A00; i++) {
                    dataOutputStream.writeInt(c83323rw.A02[i]);
                }
                dataOutputStream.flush();
                dataOutputStream.close();
                return;
            } catch (IOException e) {
                Log.e("ChunkStore/chunk store write failed", e);
                return;
            }
        }
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            dataOutputStream2.writeLong(this.A01);
            for (int i2 = 0; i2 < this.A00; i2++) {
                dataOutputStream2.writeInt(this.A02[i2]);
            }
            dataOutputStream2.flush();
            dataOutputStream2.close();
        } catch (IOException e2) {
            Log.e("ChunkStore/chunk store write failed", e2);
        }
    }

    public synchronized boolean A0A(int i) {
        return this.A02[i] == A00(i);
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("totalBytes: ");
        sb2.append(this.A01);
        sb2.append(", ");
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("chunkCount: ");
        int i = this.A00;
        sb3.append(i);
        sb3.append(", ");
        sb.append(sb3.toString());
        int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            if (!A0A(i3)) {
                if (i2 >= 0) {
                    int i4 = i3 - 1;
                    if (i4 != i2) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("-");
                        sb4.append(i4);
                        sb4.append("]");
                        sb.append(sb4.toString());
                    } else {
                        sb.append("]");
                    }
                    i2 = -1;
                }
                int[] iArr = this.A02;
                if (iArr[i3] > 0) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("[");
                    sb5.append(i3);
                    sb5.append("] ");
                    sb5.append(iArr[i3]);
                    sb5.append(", ");
                    sb.append(sb5.toString());
                }
            } else if (i2 < 0) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("[");
                sb6.append(i3);
                sb.append(sb6.toString());
                i2 = i3;
            }
        }
        if (i2 >= 0) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append("[");
            sb7.append(i2);
            sb7.append("-");
            sb7.append(i - 1);
            sb7.append("]");
            sb.append(sb7.toString());
        }
        return sb.toString();
    }
}
