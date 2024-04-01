package X;

import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: X.0JL  reason: invalid class name */
/* loaded from: classes.dex */
public class C0JL implements InterfaceC02170Ad {
    public final Boolean A00;
    public final HttpURLConnection A01;

    public C0JL(HttpURLConnection httpURLConnection) {
        this.A01 = httpURLConnection;
        this.A00 = null;
    }

    public C0JL(HttpURLConnection httpURLConnection, Boolean bool) {
        this.A01 = httpURLConnection;
        this.A00 = bool;
    }

    @Override // X.InterfaceC02170Ad
    public int A6H() {
        return this.A01.getResponseCode();
    }

    @Override // X.InterfaceC02170Ad
    public InputStream AAe() {
        return this.A01.getInputStream();
    }

    @Override // X.InterfaceC02170Ad
    public String AEa(String str) {
        return this.A01.getHeaderField(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A01.disconnect();
    }

    @Override // X.InterfaceC02170Ad
    public long getContentLength() {
        return this.A01.getContentLength();
    }
}
