package X;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: X.0tw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C18560tw implements Closeable {
    public int A00;
    public int A01;
    public byte[] A02;
    public final InputStream A03;
    public final Charset A04;
    public final /* synthetic */ C18570tx A05;

    public C18560tw(C18570tx c18570tx, InputStream inputStream, Charset charset) {
        this.A05 = c18570tx;
        if (charset != null) {
            if (charset.equals(C18570tx.A0F)) {
                this.A03 = inputStream;
                this.A04 = charset;
                this.A02 = new byte[8192];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
        if (r3[r2] == 13) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A00() {
        /*
            r8 = this;
            java.io.InputStream r4 = r8.A03
            monitor-enter(r4)
            byte[] r0 = r8.A02     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L7c
            int r1 = r8.A01     // Catch: java.lang.Throwable -> L84
            int r0 = r8.A00     // Catch: java.lang.Throwable -> L84
            if (r1 < r0) goto L10
            r8.A01()     // Catch: java.lang.Throwable -> L84
        L10:
            int r7 = r8.A01     // Catch: java.lang.Throwable -> L84
            r5 = r7
        L13:
            int r0 = r8.A00     // Catch: java.lang.Throwable -> L84
            r6 = 10
            if (r7 == r0) goto L42
            byte[] r3 = r8.A02     // Catch: java.lang.Throwable -> L84
            r0 = r3[r7]     // Catch: java.lang.Throwable -> L84
            if (r0 != r6) goto L20
            goto L23
        L20:
            int r7 = r7 + 1
            goto L13
        L23:
            if (r7 == r5) goto L26
            goto L28
        L26:
            r2 = r7
            goto L30
        L28:
            int r2 = r7 + (-1)
            r1 = r3[r2]     // Catch: java.lang.Throwable -> L84
            r0 = 13
            if (r1 != r0) goto L26
        L30:
            int r2 = r2 - r5
            java.nio.charset.Charset r0 = r8.A04     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> L84
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L84
            r1.<init>(r3, r5, r2, r0)     // Catch: java.lang.Throwable -> L84
            int r0 = r7 + 1
            r8.A01 = r0     // Catch: java.lang.Throwable -> L84
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L84
            return r1
        L42:
            int r0 = r0 - r5
            int r0 = r0 + 80
            X.0tv r5 = new X.0tv     // Catch: java.lang.Throwable -> L84
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L84
        L4a:
            byte[] r2 = r8.A02     // Catch: java.lang.Throwable -> L84
            int r1 = r8.A01     // Catch: java.lang.Throwable -> L84
            int r0 = r8.A00     // Catch: java.lang.Throwable -> L84
            int r0 = r0 - r1
            r5.write(r2, r1, r0)     // Catch: java.lang.Throwable -> L84
            r0 = -1
            r8.A00 = r0     // Catch: java.lang.Throwable -> L84
            r8.A01()     // Catch: java.lang.Throwable -> L84
            int r3 = r8.A01     // Catch: java.lang.Throwable -> L84
            r2 = r3
        L5d:
            int r0 = r8.A00     // Catch: java.lang.Throwable -> L84
            if (r3 == r0) goto L4a
            byte[] r1 = r8.A02     // Catch: java.lang.Throwable -> L84
            r0 = r1[r3]     // Catch: java.lang.Throwable -> L84
            if (r0 != r6) goto L68
            goto L6b
        L68:
            int r3 = r3 + 1
            goto L5d
        L6b:
            if (r3 == r2) goto L72
            int r0 = r3 - r2
            r5.write(r1, r2, r0)     // Catch: java.lang.Throwable -> L84
        L72:
            int r0 = r3 + 1
            r8.A01 = r0     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L84
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L84
            return r0
        L7c:
            java.lang.String r1 = "LineReader is closed"
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L84
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L84
            throw r0     // Catch: java.lang.Throwable -> L84
        L84:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L84
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18560tw.A00():java.lang.String");
    }

    public final void A01() {
        InputStream inputStream = this.A03;
        byte[] bArr = this.A02;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.A01 = 0;
            this.A00 = read;
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = this.A03;
        synchronized (inputStream) {
            if (this.A02 != null) {
                this.A02 = null;
                inputStream.close();
            }
        }
    }
}
