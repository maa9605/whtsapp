package X;

import android.os.Bundle;
import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.28d  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C467628d {
    public final InterfaceC467728e A00;

    public C467628d(InterfaceC467728e interfaceC467728e) {
        this.A00 = interfaceC467728e;
    }

    public void A00(int i, C02590Ca c02590Ca, C04420Kc c04420Kc) {
        C000200d.A0q("xmpp/reader/on-xmpp-recv type=", i);
        InterfaceC467728e interfaceC467728e = this.A00;
        Message obtain = Message.obtain(null, 0, i, 0, c02590Ca);
        if (c04420Kc != null) {
            obtain.getData().putParcelable("stanzaKey", c04420Kc);
        }
        ((HandlerC467828f) interfaceC467728e).A00(obtain);
    }

    public void A01(DeviceJid deviceJid, int i) {
        Log.i("xmpp/reader/on-get-identity-error");
        InterfaceC467728e interfaceC467728e = this.A00;
        Bundle bundle = new Bundle();
        bundle.putParcelable("jid", deviceJid);
        bundle.putInt("errorCode", i);
        ((HandlerC467828f) interfaceC467728e).A00(Message.obtain(null, 0, MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT, 0, bundle));
    }

    public void A02(C04420Kc c04420Kc) {
        C000200d.A1N(C000200d.A0P("xmpp/reader/on-peer-message-receipt stanza-id:"), c04420Kc.A07);
        ((HandlerC467828f) this.A00).A00(Message.obtain(null, 0, 221, 0, c04420Kc));
    }

    public void A03(C04420Kc c04420Kc) {
        C000200d.A1N(C000200d.A0P("xmpp/reader/on-ack-stanza stanza-id="), c04420Kc.A07);
        ((HandlerC467828f) this.A00).A00(Message.obtain(null, 0, 205, 0, c04420Kc));
    }

    public void A04(C04420Kc c04420Kc, C03950Hv c03950Hv) {
        Log.i("xmpp/reader/read/on-qr-action-set-chat");
        ((HandlerC467828f) this.A00).A00(Message.obtain(null, 0, 39, 0, new C51022Ug(c04420Kc.A01, c04420Kc.A07, c03950Hv, c04420Kc.A00)));
    }

    public void A05(C04420Kc c04420Kc, final C53502h1 c53502h1) {
        StringBuilder sb = new StringBuilder("xmpp/reader/read/on-qr-action-label ");
        sb.append(c53502h1);
        Log.i(sb.toString());
        InterfaceC467728e interfaceC467728e = this.A00;
        final Jid jid = c04420Kc.A01;
        final String str = c04420Kc.A07;
        final long j = c04420Kc.A00;
        ((HandlerC467828f) interfaceC467728e).A00(Message.obtain(null, 0, 173, 0, new C2UH(jid, str, c53502h1, j) { // from class: X.2h2
            public final C53502h1 A00;

            {
                this.A00 = c53502h1;
            }
        }));
    }

    public void A06(C04420Kc c04420Kc, C50962Ua c50962Ua) {
        Log.i("xmpp/reader/read/on-qr-action-set-pic");
        ((HandlerC467828f) this.A00).A00(Message.obtain(null, 0, 34, 0, new C2UZ(c04420Kc.A01, c04420Kc.A07, c50962Ua, c04420Kc.A00)));
    }

    public void A07(C04420Kc c04420Kc, C50982Uc c50982Uc) {
        Log.i("xmpp/reader/read/on-qr-action-set-prs");
        ((HandlerC467828f) this.A00).A00(Message.obtain(null, 0, 35, 0, new C50972Ub(c04420Kc.A01, c04420Kc.A07, c50982Uc, c04420Kc.A00)));
    }

    public void A08(C04420Kc c04420Kc, byte[] bArr, C468328l c468328l) {
        StringBuilder sb = new StringBuilder("xmpp/reader/read/sync-notify-add; stanzaKey=");
        sb.append(c04420Kc);
        sb.append("; jidHash=");
        sb.append(Arrays.toString(bArr));
        Log.i(sb.toString());
        InterfaceC467728e interfaceC467728e = this.A00;
        Message obtain = Message.obtain(null, 0, 24, 0, c468328l);
        Bundle data = obtain.getData();
        data.putParcelable("stanzaKey", c04420Kc);
        data.putByteArray("jidHash", bArr);
        ((HandlerC467828f) interfaceC467728e).A00(obtain);
    }

    public void A09(C2UG c2ug) {
        String str = ((C04990Mu) c2ug).A01.tag;
        String str2 = ((C04990Mu) c2ug).A02;
        StringBuilder sb = new StringBuilder("xmpp/reader/read/on-qr-action-relay-call-stanza-");
        sb.append(str);
        sb.append("; callId=");
        sb.append(str2);
        Log.i(sb.toString());
        ((HandlerC467828f) this.A00).A00(Message.obtain(null, 0, 162, 0, c2ug));
    }

    public void A0A(String str, int i) {
        C000200d.A0q("xmpp/reader/read/on-qr-sync-error ", i);
        ((HandlerC467828f) this.A00).A00(Message.obtain(null, 0, 29, 0, new C2UL(str, i)));
    }

    public void A0B(String str, String str2) {
        Log.i("xmpp/reader/on-attestation-request");
        InterfaceC467728e interfaceC467728e = this.A00;
        Message obtain = Message.obtain(null, 0, 179, 0);
        Bundle data = obtain.getData();
        data.putString("nonce", str);
        data.putString("apiKey", str2);
        ((HandlerC467828f) interfaceC467728e).A00(obtain);
    }

    public void A0C(String str, String str2, int i, String str3) {
        StringBuilder sb = new StringBuilder("xmpp/reader/on-set-two-factor-auth-error errorCode: ");
        sb.append(i);
        sb.append(" errorMessage: ");
        sb.append(str3);
        Log.w(sb.toString());
        InterfaceC467728e interfaceC467728e = this.A00;
        Bundle bundle = new Bundle();
        bundle.putString("code", str);
        bundle.putString("email", str2);
        bundle.putInt("errorCode", i);
        bundle.putString("errorMessage", str3);
        ((HandlerC467828f) interfaceC467728e).A00(Message.obtain(null, 0, 103, 0, bundle));
    }

    public void A0D(DeviceJid[] deviceJidArr, int i) {
        Log.i("xmpp/reader/on-get-pre-key-error");
        InterfaceC467728e interfaceC467728e = this.A00;
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("jids", deviceJidArr);
        bundle.putInt("errorCode", i);
        ((HandlerC467828f) interfaceC467728e).A00(Message.obtain(null, 0, 76, 0, bundle));
    }
}
