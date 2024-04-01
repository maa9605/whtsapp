package X;

import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import com.facebook.soloader.Api18TraceUtils;
import com.facebook.soloader.SoLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Arrays;

/* renamed from: X.03q */
/* loaded from: classes.dex */
public class C008403q extends AbstractC008203o {
    public final int A00;
    public final File A01;

    public C008403q(File file, int i) {
        this.A01 = file;
        this.A00 = i;
    }

    @Override // X.AbstractC008203o
    public int A01(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return A03(str, i, this.A01, threadPolicy);
    }

    public int A03(String str, int i, File file, StrictMode.ThreadPolicy threadPolicy) {
        long A00;
        int i2;
        short s;
        long j;
        long j2;
        long A01;
        long A002;
        long A012;
        long j3;
        long A013;
        long A003;
        long A004;
        long A005;
        long A014;
        File file2 = new File(file, str);
        if (!file2.exists()) {
            StringBuilder A0V = C000200d.A0V(str, " not found on ");
            A0V.append(file.getCanonicalPath());
            Log.d("SoLoader", A0V.toString());
            return 0;
        }
        StringBuilder A0V2 = C000200d.A0V(str, " found on ");
        A0V2.append(file.getCanonicalPath());
        Log.d("SoLoader", A0V2.toString());
        if ((i & 1) != 0 && (this.A00 & 2) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" loaded implicitly");
            Log.d("SoLoader", sb.toString());
            return 2;
        }
        if ((this.A00 & 1) != 0) {
            boolean z = SoLoader.A0A;
            if (z) {
                Api18TraceUtils.A00("SoLoader.getElfDependencies[", file2.getName());
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file2);
                FileChannel channel = fileInputStream.getChannel();
                ByteBuffer allocate = ByteBuffer.allocate(8);
                allocate.order(ByteOrder.LITTLE_ENDIAN);
                if (C002501g.A01(channel, allocate, 0L) == 1179403647) {
                    C002501g.A0M(channel, allocate, 1, 4L);
                    boolean z2 = ((short) (allocate.get() & 255)) == 1;
                    C002501g.A0M(channel, allocate, 1, 5L);
                    if (((short) (allocate.get() & 255)) == 2) {
                        allocate.order(ByteOrder.BIG_ENDIAN);
                    }
                    if (z2) {
                        A00 = C002501g.A01(channel, allocate, 28L);
                        i2 = 2;
                        C002501g.A0M(channel, allocate, 2, 44L);
                        s = 65535;
                        j = allocate.getShort() & 65535;
                        j2 = 42;
                    } else {
                        A00 = C002501g.A00(channel, allocate, 32L);
                        i2 = 2;
                        C002501g.A0M(channel, allocate, 2, 56L);
                        s = 65535;
                        j = allocate.getShort() & 65535;
                        j2 = 54;
                    }
                    C002501g.A0M(channel, allocate, i2, j2);
                    int i3 = allocate.getShort() & s;
                    if (j == 65535) {
                        if (z2) {
                            j = C002501g.A01(channel, allocate, C002501g.A01(channel, allocate, 32L) + 28);
                        } else {
                            j = C002501g.A01(channel, allocate, C002501g.A00(channel, allocate, 40L) + 44);
                        }
                    }
                    long j4 = A00;
                    long j5 = 0;
                    while (true) {
                        if (j5 >= j) {
                            break;
                        }
                        long j6 = j4 + 0;
                        if (z2) {
                            A01 = C002501g.A01(channel, allocate, j6);
                        } else {
                            A01 = C002501g.A01(channel, allocate, j6);
                        }
                        if (A01 == 2) {
                            if (z2) {
                                A002 = C002501g.A01(channel, allocate, j4 + 4);
                            } else {
                                A002 = C002501g.A00(channel, allocate, j4 + 8);
                            }
                            if (A002 != 0) {
                                long j7 = A002;
                                long j8 = 0;
                                int i4 = 0;
                                do {
                                    A012 = z2 ? C002501g.A01(channel, allocate, j7 + 0) : C002501g.A00(channel, allocate, j7 + 0);
                                    if (A012 != 1) {
                                        if (A012 == 5) {
                                            j8 = z2 ? C002501g.A01(channel, allocate, j7 + 4) : C002501g.A00(channel, allocate, j7 + 8);
                                        }
                                    } else if (i4 == Integer.MAX_VALUE) {
                                        throw new C20700y0("malformed DT_NEEDED section");
                                    } else {
                                        i4++;
                                    }
                                    j3 = 16;
                                    j7 += z2 ? 8L : 16L;
                                } while (A012 != 0);
                                if (j8 != 0) {
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= j) {
                                            break;
                                        }
                                        long j9 = A00 + 0;
                                        if (z2) {
                                            A013 = C002501g.A01(channel, allocate, j9);
                                        } else {
                                            A013 = C002501g.A01(channel, allocate, j9);
                                        }
                                        if (A013 == 1) {
                                            if (z2) {
                                                A003 = C002501g.A01(channel, allocate, A00 + 8);
                                                A004 = C002501g.A01(channel, allocate, A00 + 20);
                                            } else {
                                                A003 = C002501g.A00(channel, allocate, A00 + j3);
                                                A004 = C002501g.A00(channel, allocate, A00 + 40);
                                            }
                                            if (A003 <= j8 && j8 < A004 + A003) {
                                                if (z2) {
                                                    A005 = C002501g.A01(channel, allocate, A00 + 4);
                                                } else {
                                                    A005 = C002501g.A00(channel, allocate, A00 + 8);
                                                }
                                                long j10 = A005 + (j8 - A003);
                                                if (j10 != 0) {
                                                    String[] strArr = new String[i4];
                                                    int i6 = 0;
                                                    do {
                                                        long j11 = A002 + 0;
                                                        A014 = z2 ? C002501g.A01(channel, allocate, j11) : C002501g.A00(channel, allocate, j11);
                                                        if (A014 == 1) {
                                                            long A015 = (z2 ? C002501g.A01(channel, allocate, A002 + 4) : C002501g.A00(channel, allocate, A002 + 8)) + j10;
                                                            StringBuilder sb2 = new StringBuilder();
                                                            while (true) {
                                                                long j12 = A015 + 1;
                                                                C002501g.A0M(channel, allocate, 1, A015);
                                                                short s2 = (short) (allocate.get() & 255);
                                                                if (s2 == 0) {
                                                                    break;
                                                                }
                                                                sb2.append((char) s2);
                                                                A015 = j12;
                                                            }
                                                            strArr[i6] = sb2.toString();
                                                            if (i6 == Integer.MAX_VALUE) {
                                                                throw new C20700y0("malformed DT_NEEDED section");
                                                            }
                                                            i6++;
                                                        }
                                                        A002 += z2 ? 8L : 16L;
                                                    } while (A014 != 0);
                                                    if (i6 == i4) {
                                                        fileInputStream.close();
                                                        StringBuilder A0P = C000200d.A0P("Loading lib dependencies: ");
                                                        A0P.append(Arrays.toString(strArr));
                                                        Log.d("SoLoader", A0P.toString());
                                                        for (int i7 = 0; i7 < i4; i7++) {
                                                            String str2 = strArr[i7];
                                                            if (!str2.startsWith("/")) {
                                                                SoLoader.A04(str2, null, (i | 1) & (-3), threadPolicy);
                                                            }
                                                        }
                                                    } else {
                                                        throw new C20700y0("malformed DT_NEEDED section");
                                                    }
                                                }
                                            }
                                        }
                                        A00 += i3;
                                        i5++;
                                        j3 = 16;
                                    }
                                    throw new C20700y0("did not find file offset of DT_STRTAB table");
                                }
                                throw new C20700y0("Dynamic section string-table not found");
                            }
                        } else {
                            j4 += i3;
                            j5++;
                        }
                    }
                    throw new C20700y0("ELF file does not contain dynamic linking information");
                }
                throw new C20700y0("file is not ELF");
            } finally {
                if (z) {
                    Trace.endSection();
                }
            }
        }
        StringBuilder sb3 = new StringBuilder("Not resolving dependencies for ");
        sb3.append(str);
        Log.d("SoLoader", sb3.toString());
        try {
            SoLoader.A02.AG2(file2.getAbsolutePath(), i);
            return 1;
        } catch (UnsatisfiedLinkError e) {
            if (e.getMessage().contains("bad ELF magic")) {
                Log.d("SoLoader", "Corrupted lib file detected");
                return 3;
            }
            throw e;
        }
    }

    @Override // X.AbstractC008203o
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.A01.getCanonicalPath());
        } catch (IOException unused) {
            name = this.A01.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[root = ");
        sb.append(name);
        sb.append(" flags = ");
        sb.append(this.A00);
        sb.append(']');
        return sb.toString();
    }
}
