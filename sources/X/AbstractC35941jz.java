package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* renamed from: X.1jz */
/* loaded from: classes.dex */
public abstract class AbstractC35941jz extends C0HH {
    public AbstractC59942tf A00;
    public final C02L A01;
    public final C03310Fe A02;
    public final C03290Fc A03;
    public final C0Fi A04;

    public abstract int A08();

    public abstract C0HN A09(C27321Mx c27321Mx, String str);

    public abstract C27321Mx A0B(RandomAccessFile randomAccessFile);

    public abstract C27321Mx A0C(byte[] bArr);

    public abstract EnumC03450Ft A0F();

    public AbstractC35941jz(C03280Fb c03280Fb, C02L c02l, C03290Fc c03290Fc, C03310Fe c03310Fe, C000400f c000400f, C0Fi c0Fi, File file) {
        super(file, c03280Fb, c000400f);
        this.A01 = c02l;
        this.A03 = c03290Fc;
        this.A02 = c03310Fe;
        this.A04 = c0Fi;
    }

    @Override // X.C0HH
    public C0HN A01() {
        AbstractC59942tf abstractC59942tf;
        StringBuilder A0P = C000200d.A0P("EncryptedBackupFile/verifyIntegrity/");
        EnumC03450Ft A0F = A0F();
        A0P.append(A0F);
        Log.i(A0P.toString());
        C0HC c0hc = new C0HC("BackupFile/getFileDigestWithoutFooter/calculating-actual-digest");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        StringBuilder A0P2 = C000200d.A0P("BackupFile/getFileDigestWithoutFooter/initial digest = ");
        A0P2.append(C02A.A04(messageDigest.digest()));
        Log.i(A0P2.toString());
        File file = super.A02;
        String A0C = AnonymousClass024.A0C(file, file.length() - A08(), messageDigest);
        c0hc.A01();
        StringBuilder sb = new StringBuilder("msgstore-integrity-checker/verify-integrity/actual-digest/  ");
        sb.append(A0C);
        Log.i(sb.toString());
        C27321Mx A0A = A0A();
        C0Fi c0Fi = this.A04;
        StringBuilder A0P3 = C000200d.A0P("EncryptedBackupFile/verifyIntegrity/");
        A0P3.append(A0F);
        A0P3.append(" ");
        A0P3.append(file);
        A0P3.append(" size=");
        A0P3.append(file.length());
        A0P3.append(" modification time = ");
        A0P3.append(file.lastModified());
        A0P3.append("footer: ");
        A0P3.append(A0A);
        A0P3.append("actualDigest: ");
        A0P3.append(A0C);
        c0Fi.A01(A0P3.toString(), 2);
        if (A0A == null) {
            return new C0HN(2, null);
        }
        if (A0C == null) {
            byte[] bArr = A0A.A01;
            return new C0HN(2, bArr != null ? Arrays.toString(bArr) : "null");
        }
        String A0H = A0H();
        if (A0H != null && (abstractC59942tf = this.A00) != null && abstractC59942tf.A03(A0H)) {
            return new C0HN(4, this.A00.A00());
        }
        return A09(A0A, A0C);
    }

    @Override // X.C0HH
    public C0HN A02(C001200o c001200o, File file, int i, int i2, boolean z, C34531hf c34531hf) {
        InputStream A01;
        C02D c02d = new C02D(super.A00.A04, file);
        try {
            InputStream A0G = A0G();
            AbstractC59942tf A0E = A0E(A0G);
            this.A00 = A0E;
            if (A0E == null) {
                C0HN c0hn = new C0HN(5, null);
                ((C43351xG) A0G).A02.close();
                c02d.close();
                return c0hn;
            }
            C0HN A012 = A01();
            if (A012.A00 != 1) {
                ((C43351xG) A0G).A02.close();
                c02d.close();
                return A012;
            }
            Log.i("BackupFile/restoreSingleFileBackup/file-integrity-check/success");
            StringBuilder sb = new StringBuilder();
            sb.append("BackupFile/restoreSingleFileBackup/key ");
            EnumC03450Ft A0F = A0F();
            sb.append(A0F);
            Log.i(sb.toString());
            File file2 = super.A02;
            file2.length();
            C03280Fb c03280Fb = super.A01;
            long length = file2.length();
            AbstractC59942tf abstractC59942tf = this.A00;
            byte[] A05 = abstractC59942tf.A05();
            byte[] A04 = abstractC59942tf.A04();
            c03280Fb.A06();
            AtomicLong atomicLong = new AtomicLong();
            synchronized (c03280Fb) {
                int ordinal = A0F.ordinal();
                if (ordinal == 1) {
                    A01 = C03280Fb.A01(A0G, c03280Fb.A00, A05, A04, atomicLong);
                } else if (ordinal == 3) {
                    A01 = C03280Fb.A01(A0G, c03280Fb.A01, A05, A04, atomicLong);
                } else if (ordinal == 4) {
                    A01 = C03280Fb.A01(A0G, c03280Fb.A02, A05, A04, atomicLong);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("unsupported key selector ");
                    sb2.append(A0F);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
            try {
                byte[] bArr = new byte[C42271vT.A09];
                while (true) {
                    int read = A01.read(bArr);
                    if (read < 0) {
                        break;
                    }
                    c02d.write(bArr, 0, read);
                    if (c34531hf != null && i2 > 0) {
                        c34531hf.A00.A0F(atomicLong.get(), length, i, i2);
                    }
                }
                A01.close();
                c02d.A03.flush();
                if (z) {
                    this.A00.A01(c001200o);
                }
                ((C43351xG) A0G).A02.close();
                c02d.close();
                return A012;
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
    public C0HI A03(Context context) {
        if (!A05(context)) {
            Log.e("EncryptedBackupFile/failed to prepare for backup");
            return null;
        }
        return new C0HI(this) { // from class: X.1jy
            public boolean A00;
            public final FileOutputStream A01;
            public final ZipOutputStream A02;

            {
                C000700j.A0A(this.A00 != null, "prefix has not been initialized");
                FileOutputStream fileOutputStream = new FileOutputStream(((C0HH) this).A02);
                this.A01 = fileOutputStream;
                this.A00.A02(fileOutputStream);
                C03280Fb c03280Fb = ((C0HH) this).A01;
                FileOutputStream fileOutputStream2 = this.A01;
                EnumC03450Ft A0F = this.A0F();
                AbstractC59942tf abstractC59942tf = this.A00;
                this.A02 = c03280Fb.A05(fileOutputStream2, A0F, abstractC59942tf.A05(), abstractC59942tf.A04());
            }

            @Override // X.C0HI
            public void AWI(File file) {
                if (file != null && file.isFile() && file.exists()) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        ZipOutputStream zipOutputStream = this.A02;
                        zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
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
    public void A04(File file, C0HG c0hg) {
        DeflaterOutputStream deflaterOutputStream;
        C000700j.A0A(this.A00 != null, "prefix has not been initialized");
        final File A01 = super.A00.A05.A01("");
        FileOutputStream fileOutputStream = new FileOutputStream(A01);
        EnumC03450Ft A0F = A0F();
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        StringBuilder A0P = C000200d.A0P("BackupFile/get-output-stream/initial digest = ");
        A0P.append(C02A.A04(messageDigest.digest()));
        Log.i(A0P.toString());
        messageDigest.reset();
        DigestOutputStream digestOutputStream = new DigestOutputStream(fileOutputStream, messageDigest) { // from class: X.1Mz
            public boolean A01 = false;
            public long A00 = 0;

            {
                AbstractC35941jz.this = this;
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                if (this.A01) {
                    Log.i("BackupFile/get-output-stream/close/already-closed");
                    return;
                }
                flush();
                byte[] digest = getMessageDigest().digest();
                StringBuilder A0P2 = C000200d.A0P("BackupFile/get-output-stream/close/writing-digest ");
                A0P2.append(C02A.A04(digest));
                A0P2.append(" bytes written = ");
                C000200d.A1I(A0P2, this.A00);
                AbstractC35941jz abstractC35941jz = AbstractC35941jz.this;
                C27321Mx A0C = abstractC35941jz.A0C(digest);
                if (A0C != null) {
                    byte[] bArr = A0C.A01;
                    byte[][] bArr2 = bArr == null ? new byte[][]{A0C.A00} : new byte[][]{A0C.A00, bArr};
                    int i = 0;
                    for (byte[] bArr3 : bArr2) {
                        Arrays.toString(bArr3);
                        i += bArr3.length;
                        write(bArr3);
                    }
                    C000200d.A0q("BackupFile/write-backup-footer/size=", i);
                }
                super.close();
                this.A01 = true;
                File file2 = ((C0HH) abstractC35941jz).A02;
                file2.delete();
                File file3 = A01;
                if (file3.renameTo(file2)) {
                    return;
                }
                StringBuilder A0P3 = C000200d.A0P("File.renameTo failed: ");
                A0P3.append(file3);
                A0P3.append(" ");
                A0P3.append(file3.exists());
                A0P3.append(" ");
                A0P3.append(file2);
                A0P3.append(" ");
                A0P3.append(file2.exists());
                throw new IOException(A0P3.toString());
            }

            @Override // java.security.DigestOutputStream, java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                super.write(i);
                this.A00++;
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr) {
                int length;
                super.write(bArr, 0, bArr.length);
                this.A00 += length - 0;
            }

            @Override // java.security.DigestOutputStream, java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                super.write(bArr, i, i2);
                this.A00 += i2 - i;
            }
        };
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            this.A00.A02(digestOutputStream);
            C03280Fb c03280Fb = super.A01;
            AbstractC59942tf abstractC59942tf = this.A00;
            byte[] A05 = abstractC59942tf.A05();
            byte[] A04 = abstractC59942tf.A04();
            synchronized (c03280Fb) {
                c03280Fb.A06();
                int ordinal = A0F.ordinal();
                if (ordinal == 1) {
                    deflaterOutputStream = new DeflaterOutputStream(C03280Fb.A03(digestOutputStream, c03280Fb.A03, A05, A04), new Deflater(1, false));
                } else if (ordinal == 3) {
                    deflaterOutputStream = new DeflaterOutputStream(C03280Fb.A03(digestOutputStream, c03280Fb.A04, A05, A04), new Deflater(1, false));
                } else if (ordinal == 4) {
                    deflaterOutputStream = new DeflaterOutputStream(C03280Fb.A03(digestOutputStream, c03280Fb.A05, A05, A04), new Deflater(1, false));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected key selector (");
                    sb.append(A0F);
                    sb.append(")");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            try {
                long length = file.length();
                byte[] bArr = new byte[C42271vT.A09];
                long j = 0;
                int i = -1;
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read >= 0) {
                        deflaterOutputStream.write(bArr, 0, read);
                        j += read;
                        int i2 = (int) ((100 * j) / length);
                        if (i != i2) {
                            String.format(Locale.ENGLISH, "encrypter/encrypt %d/%d (%d%%)", Long.valueOf(j), Long.valueOf(length), Integer.valueOf(i2));
                            if (c0hg != null) {
                                c0hg.A5q(Integer.valueOf(i2));
                            }
                            i = i2;
                        }
                    } else {
                        deflaterOutputStream.close();
                        fileInputStream.close();
                        digestOutputStream.close();
                        return;
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    digestOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    @Override // X.C0HH
    public boolean A05(Context context) {
        AbstractC59942tf A0D = A0D(context);
        this.A00 = A0D;
        return A0D != null;
    }

    @Override // X.C0HH
    public boolean A06(C0HJ c0hj) {
        File file = super.A02;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            AbstractC59942tf A0E = A0E(bufferedInputStream);
            this.A00 = A0E;
            if (A0E == null) {
                Log.e("EncryptedBackupFile/restore-multi-file-backup/restore/failed to read prefix");
                bufferedInputStream.close();
                return false;
            }
            file.length();
            AtomicLong atomicLong = new AtomicLong();
            C03280Fb c03280Fb = super.A01;
            EnumC03450Ft A0F = A0F();
            AbstractC59942tf abstractC59942tf = this.A00;
            ZipInputStream A04 = c03280Fb.A04(bufferedInputStream, A0F, abstractC59942tf.A05(), abstractC59942tf.A04(), atomicLong);
            try {
                for (ZipEntry nextEntry = A04.getNextEntry(); nextEntry != null; nextEntry = A04.getNextEntry()) {
                    File file2 = (File) c0hj.A5S(nextEntry.getName());
                    if (file2 != null) {
                        try {
                            AnonymousClass024.A0V(A04, new C02D(super.A00.A04, file2));
                        } finally {
                        }
                    }
                    A04.closeEntry();
                }
                A04.close();
                bufferedInputStream.close();
                return true;
            } catch (Exception e) {
                Log.e("EncryptedBackupFile/restore-multi-file-backup/restore", e);
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

    @Override // X.C0HH
    public boolean A07(String str) {
        if (this.A00 == null) {
            try {
                InputStream A0G = A0G();
                this.A00 = A0E(A0G);
                ((C43351xG) A0G).A02.close();
                AbstractC59942tf abstractC59942tf = this.A00;
                if (abstractC59942tf != null) {
                    if (abstractC59942tf.A03(str)) {
                        return true;
                    }
                } else {
                    throw new IOException("No prefix found");
                }
            } catch (C03840Hi e) {
                throw new IOException("failed to read prefix", e);
            }
        }
        C27321Mx A0A = A0A();
        if (A0A != null) {
            return A0A.A02(str);
        }
        return false;
    }

    public final C27321Mx A0A() {
        File file = super.A02;
        long length = file.length() - A08();
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        if (length >= 0) {
            try {
                randomAccessFile.seek(length);
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return A0B(randomAccessFile);
    }

    public AbstractC59942tf A0D(Context context) {
        if (this.A02 != null) {
            try {
                C0HZ A03 = C03460Fu.A03(context);
                if (A03 == null) {
                    this.A04.A01("msgstore/backupDatabase/key is null", 3);
                    return null;
                }
                C03780Ha c03780Ha = A03.A00;
                return new C3A7(c03780Ha, A03.A02, A03.A01, c03780Ha.A01);
            } catch (Exception e) {
                Log.w("msgstore/backupDatabase/key/error", e);
                return null;
            }
        }
        throw null;
    }

    public AbstractC59942tf A0E(InputStream inputStream) {
        C03780Ha A01 = C03460Fu.A01(inputStream);
        C03290Fc c03290Fc = this.A03;
        if (c03290Fc != null) {
            C05740Qa c05740Qa = (C05740Qa) c03290Fc.A01.get(new C05750Qb(A01.A00, A01.A04));
            if (c05740Qa == null) {
                StringBuilder A0P = C000200d.A0P("msgstore/restore/cipher result is null for ");
                A0P.append(A0F());
                Log.e(A0P.toString());
                return null;
            }
            A01.toString();
            byte[] bArr = c05740Qa.A02;
            Arrays.toString(bArr);
            return new C3A7(A01, c05740Qa.A01, bArr, A01.A01);
        }
        throw null;
    }

    public InputStream A0G() {
        File file = super.A02;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        long length = file.length();
        int A08 = A08();
        long j = length - A08;
        String.format(Locale.ENGLISH, "BackupFile/get-input-stream size-without-footer:%d footer-size:%d", Long.valueOf(j), Integer.valueOf(A08));
        return new C43351xG(bufferedInputStream, j);
    }

    public final String A0H() {
        C02L c02l = this.A01;
        c02l.A05();
        if (c02l.A00 == null) {
            Log.e("backup/BackupFileCrypt12/getUserJid MeManager.me is null");
            return null;
        }
        c02l.A05();
        UserJid userJid = c02l.A03;
        if (userJid == null) {
            Log.e("backup/BackupFileCrypt12/getUserJid MeManager.getMyJidObject() is null");
            return null;
        }
        return userJid.user;
    }
}
