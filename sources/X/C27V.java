package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.27V  reason: invalid class name */
/* loaded from: classes2.dex */
public class C27V extends C04990Mu {
    public final long A00;
    public final long A01;
    public final long A02;
    public final DeviceJid A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public C27V(String str, Jid jid, String str2, VoipStanzaChildNode voipStanzaChildNode, DeviceJid deviceJid, String str3, String str4, long j, long j2, boolean z, long j3) {
        super(str, jid, str2, voipStanzaChildNode);
        this.A03 = deviceJid;
        this.A05 = str3;
        this.A04 = str4;
        this.A01 = j;
        this.A00 = j2;
        this.A06 = z;
        this.A02 = j3;
    }

    public static boolean A00(String str) {
        switch (str.hashCode()) {
            case -1423461112:
                if (str.equals("accept")) {
                    return false;
                }
                break;
            case -934710369:
                if (str.equals("reject")) {
                    return false;
                }
                break;
            case 105650780:
                if (str.equals("offer")) {
                    return false;
                }
                break;
            case 1063018407:
                if (str.equals("enc_rekey")) {
                    return false;
                }
                break;
            case 2035990113:
                if (str.equals("terminate")) {
                    return false;
                }
                break;
        }
        return true;
    }

    public DeviceJid A01() {
        Jid jid = super.A00;
        if (jid instanceof DeviceJid) {
            return (DeviceJid) jid;
        }
        return null;
    }
}
