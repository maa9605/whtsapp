package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallGroupInfo;

/* renamed from: X.0Mt */
/* loaded from: classes.dex */
public class C0Mt {
    public final int A00;
    public final C27V A01;
    public final CallGroupInfo A02;
    public final boolean A03;
    public final byte[] A04;

    public C0Mt(C27V c27v, byte[] bArr, int i, CallGroupInfo callGroupInfo, boolean z) {
        this.A01 = c27v;
        this.A04 = bArr;
        this.A00 = i;
        this.A02 = callGroupInfo;
        this.A03 = z;
    }

    public UserJid A00() {
        DeviceJid deviceJid = (DeviceJid) ((C04990Mu) this.A01).A00;
        if (deviceJid != null) {
            return deviceJid.userJid;
        }
        throw null;
    }
}
