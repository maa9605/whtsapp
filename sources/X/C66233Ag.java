package X;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.3Ag  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C66233Ag implements InterfaceC06380Sv {
    public long A00;
    public Uri A01;
    public boolean A02;
    public final InterfaceC06380Sv A03;
    public final Object A04 = new Object();

    @Override // X.InterfaceC06380Sv
    public void A5K(C12L c12l) {
    }

    public C66233Ag(Context context, Uri uri) {
        this.A03 = new C39381q2(context);
        this.A01 = uri;
    }

    @Override // X.InterfaceC06380Sv
    public /* synthetic */ Map ACr() {
        return Collections.emptyMap();
    }

    @Override // X.InterfaceC06380Sv
    public Uri ADi() {
        Uri uri;
        synchronized (this.A04) {
            uri = this.A01;
        }
        return uri;
    }

    @Override // X.InterfaceC06380Sv
    public long AQX(AnonymousClass126 anonymousClass126) {
        long j;
        Uri uri;
        synchronized (this.A04) {
            j = anonymousClass126.A04;
            this.A00 = j;
            uri = this.A01;
        }
        if (uri != null) {
            return this.A03.AQX(new AnonymousClass126(uri, j, -1L));
        }
        throw new IOException("Uri not set");
    }

    @Override // X.InterfaceC06380Sv
    public void close() {
        this.A03.close();
    }

    @Override // X.InterfaceC06380Sv
    public int read(byte[] bArr, int i, int i2) {
        long j;
        Uri uri;
        Object obj = this.A04;
        synchronized (obj) {
            j = this.A00;
            uri = null;
            if (this.A02) {
                this.A02 = false;
                uri = this.A01;
            }
        }
        if (uri != null) {
            InterfaceC06380Sv interfaceC06380Sv = this.A03;
            interfaceC06380Sv.close();
            interfaceC06380Sv.AQX(new AnonymousClass126(uri, j, -1L));
        }
        int read = this.A03.read(bArr, i, i2);
        synchronized (obj) {
            this.A00 += read;
        }
        return read;
    }
}
