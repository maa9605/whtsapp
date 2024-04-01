package X;

import com.whatsapp.voipcalling.VideoPort;

/* renamed from: X.3u8  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C84673u8 implements InterfaceC74493dM {
    public final /* synthetic */ AbstractC74483dL A00;

    public C84673u8(AbstractC74483dL abstractC74483dL) {
        this.A00 = abstractC74483dL;
    }

    public void A00(VideoPort videoPort) {
        StringBuilder sb = new StringBuilder();
        AbstractC74483dL abstractC74483dL = this.A00;
        sb.append(abstractC74483dL.A07);
        sb.append("onConnected ");
        sb.append(videoPort.hashCode());
        sb.append(" for ");
        C000200d.A1J(sb, abstractC74483dL.A03);
        abstractC74483dL.A02 = true;
        abstractC74483dL.A04();
    }

    public void A01(VideoPort videoPort) {
        StringBuilder sb = new StringBuilder();
        AbstractC74483dL abstractC74483dL = this.A00;
        sb.append(abstractC74483dL.A07);
        sb.append("onDisconnecting ");
        sb.append(videoPort.hashCode());
        sb.append(" for ");
        C000200d.A1J(sb, abstractC74483dL.A03);
        abstractC74483dL.A02();
        abstractC74483dL.A02 = false;
    }
}
