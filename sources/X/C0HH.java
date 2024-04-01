package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* renamed from: X.0HH */
/* loaded from: classes.dex */
public abstract class C0HH {
    public final C000400f A00;
    public final C03280Fb A01;
    public final File A02;

    public abstract C0HN A01();

    public abstract C0HN A02(C001200o c001200o, File file, int i, int i2, boolean z, C34531hf c34531hf);

    public abstract C0HI A03(Context context);

    public abstract void A04(File file, C0HG c0hg);

    public abstract boolean A05(Context context);

    public abstract boolean A06(C0HJ c0hj);

    public abstract boolean A07(String str);

    public C0HH(File file, C03280Fb c03280Fb, C000400f c000400f) {
        this.A02 = file;
        this.A01 = c03280Fb;
        this.A00 = c000400f;
    }

    public static C0HH A00(EnumC03450Ft enumC03450Ft, C03280Fb c03280Fb, C02L c02l, C03290Fc c03290Fc, C03310Fe c03310Fe, C000400f c000400f, C0Fi c0Fi, File file) {
        int i = enumC03450Ft.version;
        if (i == EnumC03450Ft.UNENCRYPTED.version) {
            return new C0HH(file, c03280Fb, c000400f) { // from class: X.1k1
                @Override // X.C0HH
                public boolean A05(Context context) {
                    return true;
                }

                @Override // X.C0HH
                public boolean A07(String str) {
                    return false;
                }

                @Override // X.C0HH
                public C0HN A01() {
                    return new C0HN(1, null);
                }

                @Override // X.C0HH
                public C0HN A02(C001200o c001200o, File file2, int i2, int i3, boolean z, C34531hf c34531hf) {
                    C02D c02d = new C02D(this.A00.A04, file2);
                    try {
                        FileInputStream fileInputStream = new FileInputStream(this.A02);
                        FileChannel channel = fileInputStream.getChannel();
                        WritableByteChannel newChannel = Channels.newChannel(c02d);
                        long j = 0;
                        for (long j2 = 0; j2 < channel.size(); j2 += 131072) {
                            j += channel.transferTo(j2, Math.min(131072L, channel.size() - j2), newChannel);
                            if (c34531hf != null && i3 > 0) {
                                c34531hf.A00.A0F(j, channel.size(), i2, i3);
                            }
                        }
                        c02d.A03.flush();
                        C0HN c0hn = new C0HN(1, null);
                        fileInputStream.close();
                        return c0hn;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } finally {
                            try {
                                c02d.close();
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }

                @Override // X.C0HH
                public C0HI A03(Context context) {
                    return new C0HI(this) { // from class: X.1k0
                        public boolean A00;
                        public final FileOutputStream A01;
                        public final ZipOutputStream A02;

                        {
                            FileOutputStream fileOutputStream = new FileOutputStream(this.A02);
                            this.A01 = fileOutputStream;
                            this.A02 = this.A01.A05(fileOutputStream, EnumC03450Ft.UNENCRYPTED, null, null);
                        }

                        @Override // X.C0HI
                        public void AWI(File file2) {
                            if (file2 != null && file2.isFile() && file2.exists()) {
                                FileInputStream fileInputStream = new FileInputStream(file2);
                                try {
                                    ZipOutputStream zipOutputStream = this.A02;
                                    zipOutputStream.putNextEntry(new ZipEntry(file2.getName()));
                                    AnonymousClass024.A0V(fileInputStream, zipOutputStream);
                                    zipOutputStream.closeEntry();
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } finally {
                                        try {
                                            fileInputStream.close();
                                        } catch (Throwable unused) {
                                        }
                                    }
                                }
                            }
                        }

                        @Override // java.io.Closeable, java.lang.AutoCloseable
                        public void close() {
                            if (this.A00) {
                                return;
                            }
                            this.A02.close();
                            this.A01.close();
                            this.A00 = true;
                        }
                    };
                }

                @Override // X.C0HH
                public void A04(File file2, C0HG c0hg) {
                    C000400f c000400f2 = this.A00;
                    C02D c02d = new C02D(c000400f2.A05, this.A02);
                    try {
                        WritableByteChannel newChannel = Channels.newChannel(c02d);
                        try {
                            FileChannel channel = new FileInputStream(file2).getChannel();
                            C03460Fu.A0B(channel, newChannel);
                            channel.close();
                            if (newChannel != null) {
                                newChannel.close();
                            }
                            c02d.close();
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            try {
                                c02d.close();
                            } catch (Throwable unused) {
                            }
                            throw th2;
                        }
                    }
                }

                @Override // X.C0HH
                public boolean A06(C0HJ c0hj) {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.A02));
                    try {
                        ZipInputStream A04 = this.A01.A04(bufferedInputStream, EnumC03450Ft.UNENCRYPTED, null, null, new AtomicLong());
                        try {
                            for (ZipEntry nextEntry = A04.getNextEntry(); nextEntry != null; nextEntry = A04.getNextEntry()) {
                                File file2 = (File) c0hj.A5S(nextEntry.getName());
                                if (file2 != null) {
                                    try {
                                        AnonymousClass024.A0V(A04, new C02D(this.A00.A04, file2));
                                    } finally {
                                    }
                                }
                                A04.closeEntry();
                            }
                            A04.close();
                            bufferedInputStream.close();
                            return true;
                        } catch (Exception e) {
                            Log.e("unencrypted-backup-file/restore-multi-file-backup/restore failed", e);
                            A04.close();
                            bufferedInputStream.close();
                            return false;
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            try {
                                bufferedInputStream.close();
                            } catch (Throwable unused) {
                            }
                            throw th2;
                        }
                    }
                }
            };
        }
        if (i == EnumC03450Ft.CRYPT12.version) {
            return new C1Q0(c03280Fb, c02l, c03290Fc, c03310Fe, c000400f, c0Fi, file);
        }
        if (i == EnumC03450Ft.CRYPT13.version) {
            return new C1Q0(c03280Fb, c02l, c03290Fc, c03310Fe, c000400f, c0Fi, file) { // from class: X.12i
                @Override // X.C1Q0, X.AbstractC35941jz
                public int A08() {
                    return 0;
                }

                @Override // X.C1Q0, X.AbstractC35941jz
                public C27321Mx A0B(RandomAccessFile randomAccessFile) {
                    return null;
                }

                @Override // X.C1Q0, X.AbstractC35941jz
                public C27321Mx A0C(byte[] bArr) {
                    return null;
                }

                @Override // X.AbstractC35941jz, X.C0HH
                public C0HN A01() {
                    return new C0HN(1, null);
                }
            };
        }
        if (i == EnumC03450Ft.CRYPT14.version) {
            return new C1PM(c03280Fb, c02l, c03290Fc, c03310Fe, c000400f, c0Fi, file);
        }
        if (i == EnumC03450Ft.CRYPT15.version) {
            return new C1PM(c03280Fb, c02l, c03290Fc, c03310Fe, c000400f, c0Fi, file) { // from class: X.12h
                @Override // X.C1PM, X.AbstractC35941jz
                public AbstractC59942tf A0D(Context context) {
                    if (((AbstractC35941jz) this).A02 != null) {
                        return null;
                    }
                    throw null;
                }

                @Override // X.C1PM, X.AbstractC35941jz
                public AbstractC59942tf A0E(InputStream inputStream) {
                    String str;
                    String str2;
                    C87083z5 A09 = C87083z5.A09(inputStream);
                    if (A09.A0j() != EnumC79083l3.HSM_CONTROLLED) {
                        return null;
                    }
                    byte[] A06 = A09.A0k().A01.A06();
                    byte[] A01 = ((AbstractC35941jz) this).A02.A00.A01();
                    C000700j.A0A(A01 != null, "root key is not defined");
                    byte[] A1Y = C002701i.A1Y(A01, C03310Fe.A06, 32);
                    Arrays.toString(A1Y);
                    if ((A09.A00 & 8) == 8) {
                        C87063z3 A0i = A09.A0i();
                        int i2 = A0i.A00;
                        if ((i2 & 1) == 1) {
                            str2 = A0i.A01;
                        } else {
                            str2 = null;
                        }
                        str = (i2 & 4) == 4 ? A0i.A03 : null;
                        r2 = str2;
                    } else {
                        str = null;
                    }
                    return new C3A8(A1Y, A06, r2, str);
                }

                @Override // X.C1PM, X.AbstractC35941jz
                public EnumC03450Ft A0F() {
                    return EnumC03450Ft.CRYPT15;
                }
            };
        }
        StringBuilder sb = new StringBuilder("BackupFile/verify-integrity/unknown-version: ");
        sb.append(enumC03450Ft);
        sb.append(" ");
        sb.append(file);
        c0Fi.A01(sb.toString(), 4);
        throw new IOException("BackupFile/verify-integrity/unknown-version");
    }
}
