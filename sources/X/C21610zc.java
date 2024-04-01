package X;

import android.media.MediaCodec;

/* renamed from: X.0zc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21610zc {
    public byte[] A00;
    public final MediaCodec.CryptoInfo A01;
    public final C21600zb A02;

    /* JADX WARN: Multi-variable type inference failed */
    public C21610zc() {
        final MediaCodec.CryptoInfo cryptoInfo;
        int i = C08M.A00;
        if (i >= 16) {
            cryptoInfo = new MediaCodec.CryptoInfo();
        } else {
            cryptoInfo = null;
        }
        this.A01 = cryptoInfo;
        this.A02 = i >= 24 ? new Object(cryptoInfo) { // from class: X.0zb
            public final MediaCodec.CryptoInfo.Pattern A00 = new MediaCodec.CryptoInfo.Pattern(0, 0);
            public final MediaCodec.CryptoInfo A01;

            {
                this.A01 = cryptoInfo;
            }
        } : null;
    }
}
