package X;

import android.util.Base64;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.3Yo  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C72073Yo {
    public C62932yn A00;
    public C05080Nf A01;
    public C72013Yi A02;
    public Exception A03;
    public String A04;
    public String A05;
    public byte[] A06;
    public final AbstractC000600i A07;
    public final C012005w A08;
    public final C0E3 A09;
    public final Mp4Ops A0A;
    public final C0EL A0B;
    public final C000400f A0C;
    public final C001200o A0D;
    public final C42621w3 A0E;
    public final C04000Ia A0F;
    public final C41571uA A0G;
    public final C43221x3 A0H;
    public final C43211x2 A0I;
    public final C04010Ib A0J;
    public final C40941t7 A0K;
    public final C43141wv A0L;
    public final File A0M;
    public final File A0N;
    public final File A0O;
    public final URL A0P;
    public final int[] A0Q;

    public C72073Yo(C001200o c001200o, Mp4Ops mp4Ops, AbstractC000600i abstractC000600i, C012005w c012005w, C0EL c0el, C0E3 c0e3, C000400f c000400f, C41571uA c41571uA, C43141wv c43141wv, C40941t7 c40941t7, byte[] bArr, int[] iArr, URL url, File file, File file2, File file3, C43221x3 c43221x3, C04010Ib c04010Ib, C43211x2 c43211x2, C04000Ia c04000Ia, C05080Nf c05080Nf) {
        this.A0D = c001200o;
        this.A0A = mp4Ops;
        this.A07 = abstractC000600i;
        this.A08 = c012005w;
        this.A0B = c0el;
        this.A09 = c0e3;
        this.A0C = c000400f;
        this.A0G = c41571uA;
        this.A0L = c43141wv;
        this.A06 = bArr;
        this.A0J = c04010Ib;
        this.A0I = c43211x2;
        this.A0Q = iArr;
        this.A0F = c04000Ia;
        this.A0E = C42041uv.A03(C002701i.A1Y(c04010Ib.A0U, c04010Ib.A08.A03, 80));
        this.A0H = c43221x3;
        this.A0K = c40941t7;
        this.A0P = url;
        this.A0O = file;
        this.A0N = file2;
        this.A0M = file3;
        this.A01 = c05080Nf;
        C000700j.A07(c04010Ib.A00());
        if (c04010Ib.A02 == 3) {
            if (c04010Ib.A0H == null) {
                this.A0I.A08 = 4;
            } else {
                this.A0I.A08 = 6;
            }
        }
    }

    public final InterfaceC02170Ad A00(URL url, long j, long j2) {
        InterfaceC02170Ad A02 = this.A0F.A02(url, j, j2, this.A01);
        if (this.A00 == null) {
            C0JL c0jl = (C0JL) A02;
            this.A00 = new C62932yn(c0jl.A01.getHeaderField("X-WA-Metadata"), c0jl.A00);
        }
        return A02;
    }

    public final void A01() {
        int[] iArr;
        byte[] bArr;
        C04010Ib c04010Ib = this.A0J;
        C0DC c0dc = c04010Ib.A08;
        boolean z = c04010Ib.A0Q;
        if (C0HW.A02(c0dc) && z && !c04010Ib.A0K && (iArr = this.A0Q) != null) {
            C43211x2 c43211x2 = this.A0I;
            if (c43211x2.A0B() == null) {
                try {
                    InputStream A02 = C43141wv.A02(this.A0N, iArr[0]);
                    bArr = AnonymousClass088.A2D(A02);
                    A02.close();
                } catch (IOException e) {
                    Log.e("ProgressiveJpegUtils/generateThumbnailFromFirstScan/errorGeneratingThumbnail", e);
                    bArr = null;
                }
                synchronized (c43211x2) {
                    c43211x2.A0J = bArr;
                }
            }
        }
    }

    public final boolean A02(long j) {
        long j2;
        int i = this.A0H.A0p;
        if (i == 2 || i == 3) {
            C04010Ib c04010Ib = this.A0J;
            if (c04010Ib.A0Q && C0HW.A03(c04010Ib.A08) && i == 3) {
                long j3 = c04010Ib.A06;
                long j4 = c04010Ib.A05;
                j2 = j4 == 0 ? 0L : (long) Math.ceil((((float) j3) / ((float) j4)) * 5.0f);
            } else {
                int[] iArr = this.A0Q;
                j2 = iArr != null ? iArr[0] : 262144L;
            }
            return j >= j2;
        }
        return false;
    }

    public final boolean A03(AbstractC71993Yg abstractC71993Yg) {
        int[] iArr;
        String str;
        C04010Ib c04010Ib = this.A0J;
        if (c04010Ib.A02 == 3 && abstractC71993Yg != null && (iArr = this.A0Q) != null && iArr.length == 4 && (str = c04010Ib.A0H) != null && abstractC71993Yg.A0A(0) && abstractC71993Yg.A0A(1) && abstractC71993Yg.A0A(2)) {
            try {
                if (this.A0L.A03(this.A0N, iArr[0], c04010Ib.A0Q) && A04(str)) {
                    return A05(iArr);
                }
                return false;
            } catch (IOException e) {
                Log.e("StreamMediaDownloadHandler/attemptSetPartialProgressiveJpegOnDownloadFailure", e);
            }
        }
        return false;
    }

    /* JADX WARN: Finally extract failed */
    public final boolean A04(String str) {
        if (str == null) {
            return false;
        }
        try {
            File file = this.A0N;
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new C43351xG(C0DD.A0I(file), C43141wv.A00(this.A0Q)));
            try {
                C40841sx.A0d(bufferedInputStream, messageDigest);
                String encodeToString = Base64.encodeToString(messageDigest.digest(), 2);
                bufferedInputStream.close();
                if (str.equals(encodeToString)) {
                    return true;
                }
                Log.e("ProgressiveJpegUtils/setPartialImageFailed plaintextHashes did not match");
                return false;
            } finally {
            }
        } catch (IOException | NoSuchAlgorithmException e) {
            Log.e("ProgressiveJpegUtils/validatePartialHashesFailed", e);
            return false;
        }
    }

    public final boolean A05(int[] iArr) {
        byte[] bArr;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.A0N, "rw");
            long j = iArr[0] + iArr[1] + iArr[2];
            randomAccessFile.seek(j);
            randomAccessFile.write(C41961un.A0A);
            randomAccessFile.setLength(j + bArr.length);
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
            C43211x2 c43211x2 = this.A0I;
            synchronized (c43211x2) {
                c43211x2.A0H = true;
            }
            this.A0K.A04(3);
            return true;
        } catch (IOException unused) {
            Log.e("ProgressiveJpegUtils/setPartialImageToReadableFile/failed to set file");
            this.A0I.A06();
            return false;
        }
    }
}
