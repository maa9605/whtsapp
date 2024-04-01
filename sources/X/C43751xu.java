package X;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1xu */
/* loaded from: classes2.dex */
public final class C43751xu implements Closeable {
    public int A00;
    public Writer A03;
    public final long A06;
    public final File A07;
    public final File A08;
    public final File A09;
    public long A02 = 0;
    public final LinkedHashMap A0A = new LinkedHashMap(0, 0.75f, true);
    public long A01 = 0;
    public final ExecutorService A0C = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final Callable A0B = new Callable() { // from class: X.2oC
        {
            C43751xu.this = this;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            C43751xu c43751xu = C43751xu.this;
            synchronized (c43751xu) {
                if (c43751xu.A03 == null) {
                    return null;
                }
                c43751xu.A09();
                if (c43751xu.A0C()) {
                    c43751xu.A0A();
                    c43751xu.A00 = 0;
                }
                return null;
            }
        }
    };
    public final int A04 = 1;
    public final int A05 = 1;

    static {
        Charset.forName("UTF-8");
    }

    public C43751xu(File file, long j) {
        this.A07 = file;
        this.A08 = new File(file, "journal");
        this.A09 = new File(file, "journal.tmp");
        this.A06 = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0129, code lost:
        throw new java.io.IOException(X.C000200d.A0H("unexpected journal line: ", r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C43751xu A00(java.io.File r16, long r17) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43751xu.A00(java.io.File, long):X.1xu");
    }

    public static String A01(InputStream inputStream) {
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                throw new EOFException();
            }
            if (read == 10) {
                int length = sb.length();
                if (length > 0) {
                    int i = length - 1;
                    if (sb.charAt(i) == '\r') {
                        sb.setLength(i);
                    }
                }
                return sb.toString();
            }
            sb.append((char) read);
        }
    }

    public static void A02(C43751xu c43751xu, C43761xv c43761xv, boolean z) {
        long[] jArr;
        synchronized (c43751xu) {
            C43771xw c43771xw = c43761xv.A01;
            if (c43771xw.A01 == c43761xv) {
                if (z && !c43771xw.A02) {
                    for (int i = 0; i < c43751xu.A05; i++) {
                        if (!c43771xw.A01(i).exists()) {
                            A02(c43761xv.A02, c43761xv, false);
                            StringBuilder sb = new StringBuilder();
                            sb.append("edit didn't create file ");
                            sb.append(i);
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                }
                for (int i2 = 0; i2 < c43751xu.A05; i2++) {
                    File A01 = c43771xw.A01(i2);
                    if (z) {
                        if (A01.exists()) {
                            File A00 = c43771xw.A00(i2);
                            A01.renameTo(A00);
                            long[] jArr2 = c43771xw.A04;
                            long j = jArr2[i2];
                            long length = A00.length();
                            jArr2[i2] = length;
                            c43751xu.A02 = (c43751xu.A02 - j) + length;
                        }
                    } else {
                        A05(A01);
                    }
                }
                c43751xu.A00++;
                c43771xw.A01 = null;
                if (c43771xw.A02 | z) {
                    c43771xw.A02 = true;
                    Writer writer = c43751xu.A03;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CLEAN ");
                    sb2.append(c43771xw.A03);
                    StringBuilder sb3 = new StringBuilder();
                    for (long j2 : c43771xw.A04) {
                        sb3.append(' ');
                        sb3.append(j2);
                    }
                    sb2.append(sb3.toString());
                    sb2.append('\n');
                    writer.write(sb2.toString());
                    if (z) {
                        long j3 = c43751xu.A01;
                        c43751xu.A01 = 1 + j3;
                        c43771xw.A00 = j3;
                    }
                } else {
                    LinkedHashMap linkedHashMap = c43751xu.A0A;
                    String str = c43771xw.A03;
                    linkedHashMap.remove(str);
                    Writer writer2 = c43751xu.A03;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("REMOVE ");
                    sb4.append(str);
                    sb4.append('\n');
                    writer2.write(sb4.toString());
                }
                if (c43751xu.A02 > c43751xu.A06 || c43751xu.A0C()) {
                    c43751xu.A0C.submit(c43751xu.A0B);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public static void A03(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void A04(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    A04(file2);
                }
                if (!file2.delete()) {
                    StringBuilder sb = new StringBuilder("failed to delete file: ");
                    sb.append(file2);
                    throw new IOException(sb.toString());
                }
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("not a directory: ");
        sb2.append(file);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void A05(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static final void A06(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            throw new IllegalArgumentException(C000200d.A0I("keys must not contain spaces or newlines: \"", str, "\""));
        }
    }

    public C43761xv A07(String str) {
        synchronized (this) {
            if (this.A03 != null) {
                A06(str);
                LinkedHashMap linkedHashMap = this.A0A;
                C43771xw c43771xw = (C43771xw) linkedHashMap.get(str);
                if (c43771xw == null) {
                    c43771xw = new C43771xw(this, str);
                    linkedHashMap.put(str, c43771xw);
                } else if (c43771xw.A01 != null) {
                    return null;
                }
                C43761xv c43761xv = new C43761xv(this, c43771xw);
                c43771xw.A01 = c43761xv;
                Writer writer = this.A03;
                StringBuilder sb = new StringBuilder();
                sb.append("DIRTY ");
                sb.append(str);
                sb.append('\n');
                writer.write(sb.toString());
                this.A03.flush();
                return c43761xv;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized C43781xx A08(String str) {
        if (this.A03 != null) {
            A06(str);
            C43771xw c43771xw = (C43771xw) this.A0A.get(str);
            if (c43771xw == null) {
                return null;
            }
            if (c43771xw.A02) {
                int i = this.A05;
                InputStream[] inputStreamArr = new InputStream[i];
                for (int i2 = 0; i2 < i; i2++) {
                    try {
                        inputStreamArr[i2] = new FileInputStream(c43771xw.A00(i2));
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
                this.A00++;
                this.A03.append((CharSequence) "READ").append(' ').append((CharSequence) str).append('\n');
                if (A0C()) {
                    this.A0C.submit(this.A0B);
                }
                return new C43781xx(this, inputStreamArr);
            }
            return null;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final void A09() {
        while (this.A02 > this.A06) {
            A0B((String) ((Map.Entry) this.A0A.entrySet().iterator().next()).getKey());
        }
    }

    public final synchronized void A0A() {
        long[] jArr;
        Writer writer = this.A03;
        if (writer != null) {
            writer.close();
        }
        File file = this.A09;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file), 8192);
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.A04));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.A05));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (C43771xw c43771xw : this.A0A.values()) {
            if (c43771xw.A01 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("DIRTY ");
                sb.append(c43771xw.A03);
                sb.append('\n');
                bufferedWriter.write(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CLEAN ");
                sb2.append(c43771xw.A03);
                StringBuilder sb3 = new StringBuilder();
                for (long j : c43771xw.A04) {
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
        file.renameTo(file2);
        this.A03 = new BufferedWriter(new FileWriter(file2, true), 8192);
    }

    public synchronized void A0B(String str) {
        if (this.A03 != null) {
            A06(str);
            LinkedHashMap linkedHashMap = this.A0A;
            C43771xw c43771xw = (C43771xw) linkedHashMap.get(str);
            if (c43771xw != null && c43771xw.A01 == null) {
                for (int i = 0; i < this.A05; i++) {
                    File A00 = c43771xw.A00(i);
                    if (A00.delete()) {
                        long j = this.A02;
                        long[] jArr = c43771xw.A04;
                        this.A02 = j - jArr[i];
                        jArr[i] = 0;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("failed to delete ");
                        sb.append(A00);
                        throw new IOException(sb.toString());
                    }
                }
                this.A00++;
                this.A03.append((CharSequence) "REMOVE").append(' ').append((CharSequence) str).append('\n');
                linkedHashMap.remove(str);
                if (A0C()) {
                    this.A0C.submit(this.A0B);
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean A0C() {
        int i = this.A00;
        return i >= 2000 && i >= this.A0A.size();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.A03 == null) {
            return;
        }
        Iterator it = new ArrayList(this.A0A.values()).iterator();
        while (it.hasNext()) {
            C43761xv c43761xv = ((C43771xw) it.next()).A01;
            if (c43761xv != null) {
                A02(c43761xv.A02, c43761xv, false);
            }
        }
        A09();
        this.A03.close();
        this.A03 = null;
    }
}
