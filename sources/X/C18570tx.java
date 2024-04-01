package X;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: X.0tx */
/* loaded from: classes.dex */
public final class C18570tx implements Closeable {
    public static final OutputStream A0E;
    public static final Charset A0F = Charset.forName("US-ASCII");
    public static final Pattern A0G;
    public int A00;
    public long A01;
    public Writer A04;
    public final File A07;
    public final File A08;
    public final File A09;
    public final File A0A;
    public long A03 = 0;
    public final LinkedHashMap A0B = new LinkedHashMap(0, 0.75f, true);
    public long A02 = 0;
    public final ThreadPoolExecutor A0D = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final Callable A0C = new Callable() { // from class: X.0tp
        {
            C18570tx.this = this;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            C18570tx c18570tx = C18570tx.this;
            synchronized (c18570tx) {
                if (c18570tx.A04 == null) {
                    return null;
                }
                c18570tx.A05();
                if (c18570tx.A08()) {
                    c18570tx.A06();
                    c18570tx.A00 = 0;
                }
                return null;
            }
        }
    };
    public final int A05 = 2;
    public final int A06 = 1;

    static {
        Charset.forName("UTF-8");
        A0G = Pattern.compile("[a-z0-9_-]{1,120}");
        A0E = new OutputStream() { // from class: X.0tq
            @Override // java.io.OutputStream
            public void write(int i) {
            }
        };
    }

    public C18570tx(File file, long j) {
        this.A07 = file;
        this.A08 = new File(file, "journal");
        this.A0A = new File(file, "journal.tmp");
        this.A09 = new File(file, "journal.bkp");
        this.A01 = j;
    }

    public static void A00(C18570tx c18570tx, C18520ts c18520ts, boolean z) {
        long[] jArr;
        synchronized (c18570tx) {
            C18530tt c18530tt = c18520ts.A02;
            if (c18530tt.A01 == c18520ts) {
                if (z && !c18530tt.A02) {
                    for (int i = 0; i < c18570tx.A06; i++) {
                        if (c18520ts.A03[i]) {
                            if (!c18530tt.A01(i).exists()) {
                                A00(c18520ts.A04, c18520ts, false);
                                return;
                            }
                        } else {
                            A00(c18520ts.A04, c18520ts, false);
                            StringBuilder sb = new StringBuilder();
                            sb.append("Newly created entry didn't create value for index ");
                            sb.append(i);
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                }
                for (int i2 = 0; i2 < c18570tx.A06; i2++) {
                    File A01 = c18530tt.A01(i2);
                    if (z) {
                        if (A01.exists()) {
                            File A00 = c18530tt.A00(i2);
                            A01.renameTo(A00);
                            long[] jArr2 = c18530tt.A04;
                            long j = jArr2[i2];
                            long length = A00.length();
                            jArr2[i2] = length;
                            c18570tx.A03 = (c18570tx.A03 - j) + length;
                        }
                    } else {
                        A03(A01);
                    }
                }
                c18570tx.A00++;
                c18530tt.A01 = null;
                if (c18530tt.A02 | z) {
                    c18530tt.A02 = true;
                    Writer writer = c18570tx.A04;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CLEAN ");
                    sb2.append(c18530tt.A03);
                    StringBuilder sb3 = new StringBuilder();
                    for (long j2 : c18530tt.A04) {
                        sb3.append(' ');
                        sb3.append(j2);
                    }
                    sb2.append(sb3.toString());
                    sb2.append('\n');
                    writer.write(sb2.toString());
                    if (z) {
                        long j3 = c18570tx.A02;
                        c18570tx.A02 = 1 + j3;
                        c18530tt.A00 = j3;
                    }
                } else {
                    LinkedHashMap linkedHashMap = c18570tx.A0B;
                    String str = c18530tt.A03;
                    linkedHashMap.remove(str);
                    Writer writer2 = c18570tx.A04;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("REMOVE ");
                    sb4.append(str);
                    sb4.append('\n');
                    writer2.write(sb4.toString());
                }
                c18570tx.A04.flush();
                if (c18570tx.A03 > c18570tx.A01 || c18570tx.A08()) {
                    c18570tx.A0D.submit(c18570tx.A0C);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void A01(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void A02(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    A02(file2);
                }
                if (!file2.delete()) {
                    StringBuilder sb = new StringBuilder("failed to delete file: ");
                    sb.append(file2);
                    throw new IOException(sb.toString());
                }
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("not a readable directory: ");
        sb2.append(file);
        throw new IOException(sb2.toString());
    }

    public static void A03(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static final void A04(String str) {
        if (!A0G.matcher(str).matches()) {
            throw new IllegalArgumentException(C000200d.A0I("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public final void A05() {
        while (this.A03 > this.A01) {
            A07((String) ((Map.Entry) this.A0B.entrySet().iterator().next()).getKey());
        }
    }

    public final synchronized void A06() {
        long[] jArr;
        Writer writer = this.A04;
        if (writer != null) {
            writer.close();
        }
        File file = this.A0A;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        Charset charset = A0F;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, charset));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.A05));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.A06));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (C18530tt c18530tt : this.A0B.values()) {
            if (c18530tt.A01 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("DIRTY ");
                sb.append(c18530tt.A03);
                sb.append('\n');
                bufferedWriter.write(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CLEAN ");
                sb2.append(c18530tt.A03);
                StringBuilder sb3 = new StringBuilder();
                for (long j : c18530tt.A04) {
                    sb3.append(' ');
                    sb3.append(j);
                }
                sb2.append(sb3.toString());
                sb2.append('\n');
                bufferedWriter.write(sb2.toString());
            }
        }
        bufferedWriter.close();
        File file2 = this.A08;
        if (file2.exists()) {
            File file3 = this.A09;
            A03(file3);
            if (!file2.renameTo(file3)) {
                throw new IOException();
            }
        }
        if (file.renameTo(file2)) {
            this.A09.delete();
            this.A04 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2, true), charset));
        } else {
            throw new IOException();
        }
    }

    public synchronized void A07(String str) {
        if (this.A04 != null) {
            A04(str);
            LinkedHashMap linkedHashMap = this.A0B;
            C18530tt c18530tt = (C18530tt) linkedHashMap.get(str);
            if (c18530tt != null && c18530tt.A01 == null) {
                for (int i = 0; i < this.A06; i++) {
                    File A00 = c18530tt.A00(i);
                    if (A00.exists() && !A00.delete()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("failed to delete ");
                        sb.append(A00);
                        throw new IOException(sb.toString());
                    }
                    long j = this.A03;
                    long[] jArr = c18530tt.A04;
                    this.A03 = j - jArr[i];
                    jArr[i] = 0;
                }
                this.A00++;
                Writer writer = this.A04;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("REMOVE ");
                sb2.append(str);
                sb2.append('\n');
                writer.append((CharSequence) sb2.toString());
                linkedHashMap.remove(str);
                if (A08()) {
                    this.A0D.submit(this.A0C);
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean A08() {
        int i = this.A00;
        return i >= 2000 && i >= this.A0B.size();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.A04 == null) {
            return;
        }
        Iterator it = new ArrayList(this.A0B.values()).iterator();
        while (it.hasNext()) {
            C18520ts c18520ts = ((C18530tt) it.next()).A01;
            if (c18520ts != null) {
                A00(c18520ts.A04, c18520ts, false);
            }
        }
        A05();
        this.A04.close();
        this.A04 = null;
    }
}
