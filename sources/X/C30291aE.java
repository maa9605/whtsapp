package X;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.1aE  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30291aE implements InterfaceC06380Sv {
    public long A00;
    public Uri A01;
    public Map A02;
    public final InterfaceC06380Sv A03;

    public C30291aE(InterfaceC06380Sv interfaceC06380Sv) {
        if (interfaceC06380Sv != null) {
            this.A03 = interfaceC06380Sv;
            this.A01 = Uri.EMPTY;
            this.A02 = Collections.emptyMap();
            return;
        }
        throw null;
    }

    @Override // X.InterfaceC06380Sv
    public void A5K(C12L c12l) {
        this.A03.A5K(c12l);
    }

    @Override // X.InterfaceC06380Sv
    public Map ACr() {
        return this.A03.ACr();
    }

    @Override // X.InterfaceC06380Sv
    public Uri ADi() {
        return this.A03.ADi();
    }

    @Override // X.InterfaceC06380Sv
    public long AQX(AnonymousClass126 anonymousClass126) {
        this.A01 = anonymousClass126.A05;
        this.A02 = Collections.emptyMap();
        long AQX = this.A03.AQX(anonymousClass126);
        Uri ADi = ADi();
        if (ADi != null) {
            this.A01 = ADi;
            this.A02 = ACr();
            return AQX;
        }
        throw null;
    }

    @Override // X.InterfaceC06380Sv
    public void close() {
        this.A03.close();
    }

    @Override // X.InterfaceC06380Sv
    public int read(byte[] bArr, int i, int i2) {
        int read = this.A03.read(bArr, i, i2);
        if (read != -1) {
            this.A00 += read;
        }
        return read;
    }
}
