package X;

import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.3d0  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C74283d0 {
    public static final C74283d0 A04 = new C74283d0(1, (byte) 0);
    public final byte A00;
    public final int A01;
    public final VoipStanzaChildNode A02;
    public final byte[] A03;

    public C74283d0(int i, byte b) {
        this.A01 = i;
        this.A02 = null;
        this.A00 = b;
        this.A03 = null;
    }

    public C74283d0(VoipStanzaChildNode voipStanzaChildNode, byte b, byte[] bArr) {
        this.A01 = 0;
        this.A02 = voipStanzaChildNode;
        this.A00 = b;
        this.A03 = bArr;
    }
}
