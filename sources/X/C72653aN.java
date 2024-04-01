package X;

import android.graphics.Bitmap;
import android.os.Build;
import com.whatsapp.GifHelper;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.3aN */
/* loaded from: classes2.dex */
public class C72653aN {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public final C01B A06;
    public final File A07;
    public final boolean A08;
    public final boolean A09;

    public C72653aN(C01B c01b, File file) {
        Bitmap frameAtTime;
        this.A06 = c01b;
        this.A07 = file;
        boolean A0i = C40841sx.A0i(file);
        this.A09 = A0i;
        if (A0i) {
            try {
                C42661w7 A03 = C40851sy.A03(file);
                this.A03 = A03.A01;
                this.A01 = A03.A00;
                return;
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("media_file not found: ");
                sb.append(file);
                Log.e(sb.toString(), e);
                throw new C83663sU();
            }
        }
        C40831sw c40831sw = new C40831sw();
        try {
            try {
                c40831sw.A00(file);
                this.A08 = GifHelper.A02(file);
                String extractMetadata = c40831sw.extractMetadata(9);
                String extractMetadata2 = c40831sw.extractMetadata(18);
                String extractMetadata3 = c40831sw.extractMetadata(19);
                try {
                    long parseLong = Long.parseLong(extractMetadata);
                    this.A04 = parseLong;
                    if (parseLong != 0) {
                        try {
                            this.A03 = Integer.parseInt(extractMetadata2);
                            this.A01 = Integer.parseInt(extractMetadata3);
                        } catch (Exception e2) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("videometa/cannot parse width (");
                            sb2.append(extractMetadata2);
                            sb2.append(") or height (");
                            sb2.append(extractMetadata3);
                            sb2.append(") ");
                            sb2.append(this.A07.getAbsolutePath());
                            sb2.append(" ");
                            sb2.append(this.A07.length());
                            Log.w(sb2.toString(), e2);
                            try {
                                frameAtTime = c40831sw.getFrameAtTime(0L);
                            } catch (Exception | NoSuchMethodError unused) {
                            }
                            if (frameAtTime != null) {
                                this.A03 = frameAtTime.getWidth();
                                int height = frameAtTime.getHeight();
                                this.A01 = height;
                                if (this.A03 == 0 || height == 0) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("videometa/bad width (");
                                    sb3.append(extractMetadata2);
                                    sb3.append(") or height (");
                                    sb3.append(extractMetadata3);
                                    sb3.append(") ");
                                    sb3.append(this.A07.getAbsolutePath());
                                    sb3.append(" ");
                                    sb3.append(this.A07.length());
                                    Log.e(sb3.toString());
                                    throw new C83663sU();
                                }
                            } else {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("videometa/cannot get frame");
                                sb4.append(this.A07.getAbsolutePath());
                                sb4.append(" ");
                                sb4.append(this.A07.length());
                                Log.e(sb4.toString());
                                throw new C83663sU();
                            }
                        }
                        try {
                            this.A00 = Integer.parseInt(c40831sw.extractMetadata(20));
                        } catch (Exception unused2) {
                        }
                        try {
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.A02 = Integer.parseInt(c40831sw.extractMetadata(24));
                            }
                        } catch (Exception unused3) {
                        }
                        return;
                    }
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("videometa/no duration:");
                    sb5.append(extractMetadata);
                    sb5.append(" ");
                    sb5.append(this.A07.getAbsolutePath());
                    sb5.append(" ");
                    sb5.append(this.A07.length());
                    Log.e(sb5.toString());
                    throw new C83663sU();
                } catch (Exception e3) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("videometa/cannot parse duration:");
                    sb6.append(extractMetadata);
                    sb6.append(" ");
                    sb6.append(this.A07.getAbsolutePath());
                    sb6.append(" ");
                    sb6.append(this.A07.length());
                    Log.e(sb6.toString(), e3);
                    throw new C83663sU();
                }
            } catch (Exception e4) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append("videometa/cannot process file:");
                sb7.append(this.A07.getAbsolutePath());
                sb7.append(" ");
                sb7.append(this.A07.length());
                sb7.append(" ");
                sb7.append(this.A07.exists());
                Log.e(sb7.toString(), e4);
                throw new C83663sU();
            }
        } finally {
        }
    }

    public int A00() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        if (this.A04 != 0) {
            return (int) ((this.A07.length() * 8000) / this.A04);
        }
        return 0;
    }

    public int A01() {
        return this.A01;
    }

    public int A02() {
        if (Build.VERSION.SDK_INT < 17 && !this.A05) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                int i = C42591vz.A07(this.A07, true).A05;
                this.A02 = i;
                StringBuilder sb = new StringBuilder();
                sb.append("mediafileutils/VideoMeta/getRotation rotation=");
                sb.append(i);
                sb.append(" rotationExtractionTime=");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                Log.w(sb.toString());
                this.A05 = true;
            } catch (Exception unused) {
            }
        }
        return this.A02;
    }

    public int A03() {
        return this.A03;
    }

    public boolean A04() {
        return Math.abs(A02() % 180) == 90;
    }

    public boolean A05(byte b) {
        int i;
        if (this.A09) {
            return true;
        }
        if (b == 13) {
            if (!this.A08 && this.A07.length() > 262144) {
                int i2 = this.A03;
                int i3 = this.A01;
                return ((double) (((float) A00()) / ((float) (i2 * i3)))) > ((double) C0JA.A00(i2, i3)) * 1.1d;
            }
            return false;
        }
        int i4 = this.A03;
        if (i4 > 640 || (i = this.A01) > 640) {
            int i5 = this.A01;
            if (i4 < i5) {
                i4 = (i4 * 640) / i5;
                i = 640;
            } else {
                i = (i5 * 640) / i4;
                i4 = 640;
            }
        }
        long j = this.A04 / 1000;
        return ((long) ((((((float) (i4 * i)) * C43091wq.A00(this.A06, i4, i, this.A04, 9)) * ((float) j)) / 8.0f) + ((float) ((j * 96000) / 8)))) < this.A07.length();
    }
}
