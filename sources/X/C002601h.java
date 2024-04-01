package X;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.01h */
/* loaded from: classes.dex */
public class C002601h {
    public static final int A06;
    public static final int A07;
    public static final String A08;
    public static final byte[] A09;
    public static volatile C002601h A0A;
    public C39991rE A00;
    public MappedByteBuffer A01;
    public final ExecutorC004702d A02;
    public volatile File A03;
    public volatile String A04 = "unknown";
    public volatile boolean A05;

    static {
        String format = String.format(Locale.US, "%07d", Long.valueOf((System.currentTimeMillis() / 1000) % 10000000));
        A08 = format;
        A07 = format.getBytes().length + 1;
        A09 = new byte[]{0, 10};
        A06 = 2;
    }

    public C002601h(InterfaceC002901k interfaceC002901k) {
        this.A02 = new ExecutorC004702d(interfaceC002901k, true);
    }

    public static C002601h A00() {
        if (A0A == null) {
            synchronized (C002601h.class) {
                if (A0A == null) {
                    A0A = new C002601h(C002801j.A00());
                }
            }
        }
        return A0A;
    }

    public static String A01(File file) {
        LinkedList linkedList = new LinkedList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            bufferedReader.readLine();
            for (String readLine = bufferedReader.readLine(); readLine != null && !readLine.equals("\u0000"); readLine = bufferedReader.readLine()) {
                linkedList.addFirst(readLine);
            }
            bufferedReader.close();
        } catch (IOException unused) {
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(":");
        }
        return sb.toString();
    }

    public Map A02() {
        if (!this.A05) {
            return new C006702y();
        }
        C006702y c006702y = new C006702y(5);
        int i = 0;
        do {
            String valueOf = String.valueOf(i);
            if (!valueOf.equals(this.A04)) {
                File file = new File(this.A03, valueOf);
                if (file.exists()) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                        c006702y.put(bufferedReader.readLine(), file);
                        bufferedReader.close();
                    } catch (IOException unused) {
                    }
                }
            }
            i++;
        } while (i < 5);
        return c006702y;
    }

    public final void A03() {
        int i = A07;
        int i2 = i + this.A00.byteSize;
        this.A01.position(i2);
        this.A01.put(A09);
        Iterator<byte[]> it = this.A00.iterator();
        while (it.hasNext()) {
            byte[] next = it.next();
            this.A01.position(i2 - 1);
            this.A01.put((byte) 10);
            MappedByteBuffer mappedByteBuffer = this.A01;
            int length = next.length;
            mappedByteBuffer.position((mappedByteBuffer.position() - 1) - length);
            this.A01.put(next);
            i2 -= length + 1;
        }
        this.A01.position(i + this.A00.byteSize + 2);
    }

    public final void A04(Context context) {
        File file;
        this.A03 = new File(context.getFilesDir(), "app_state");
        if (!this.A03.exists() || !this.A03.isDirectory()) {
            this.A03.delete();
            if (!this.A03.mkdir()) {
                this.A05 = false;
                return;
            }
        }
        int i = 0;
        while (true) {
            File file2 = this.A03;
            String valueOf = String.valueOf(i);
            file = new File(file2, valueOf);
            if (file.exists()) {
                i++;
                if (i >= 5) {
                    this.A04 = String.valueOf(System.currentTimeMillis() % 5);
                    file = new File(this.A03, this.A04);
                    break;
                }
            } else {
                this.A04 = valueOf;
                break;
            }
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.setLength(1024L);
            MappedByteBuffer map = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_WRITE, 0L, 1024L);
            this.A01 = map;
            map.position(0);
            MappedByteBuffer mappedByteBuffer = this.A01;
            byte[] bArr = A09;
            mappedByteBuffer.put(bArr);
            MappedByteBuffer mappedByteBuffer2 = this.A01;
            int i2 = A07;
            mappedByteBuffer2.position(i2 - 1);
            this.A01.put((byte) 10);
            this.A01.put(bArr);
            this.A01.position(0);
            this.A01.put(A08.getBytes());
            this.A01.position(i2 + 2);
            this.A00 = new C39991rE();
            this.A05 = true;
            randomAccessFile.close();
        } catch (IOException unused) {
            this.A05 = false;
        }
    }

    public void A05(Object obj, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj.getClass().getSimpleName());
        sb.append(" ");
        sb.append(str);
        A06(sb.toString());
    }

    public void A06(String str) {
        this.A02.execute(new RunnableEBaseShape0S1100000_I0(this, str, 12));
    }

    public final void A07(String str) {
        if (this.A05) {
            byte[] bytes = str.getBytes();
            int length = bytes.length;
            C000700j.A08(length < 100, "Log entry too large");
            if (this.A01.position() + length + 1 >= 1024) {
                this.A01.position(A07);
                this.A01.put(A09);
                A03();
            }
            MappedByteBuffer mappedByteBuffer = this.A01;
            mappedByteBuffer.position((mappedByteBuffer.position() - 2) + length);
            this.A01.put((byte) 10);
            this.A01.put(A09);
            MappedByteBuffer mappedByteBuffer2 = this.A01;
            mappedByteBuffer2.position(((mappedByteBuffer2.position() - 2) - 1) - length);
            this.A01.put(bytes);
            MappedByteBuffer mappedByteBuffer3 = this.A01;
            mappedByteBuffer3.position(mappedByteBuffer3.position() + 1 + 2);
            this.A00.A00(bytes);
        }
    }
}
