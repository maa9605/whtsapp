package X;

import android.app.Notification;

/* renamed from: X.0Np  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C05170Np extends AbstractC05180Nq {
    public CharSequence A00;

    @Override // X.AbstractC05180Nq
    public void A06(InterfaceC12750k0 interfaceC12750k0) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle(((C1TA) interfaceC12750k0).A02).setBigContentTitle(null).bigText(this.A00);
        if (this.A02) {
            bigText.setSummaryText(this.A01);
        }
    }

    public void A07(CharSequence charSequence) {
        this.A00 = C005402l.A00(charSequence);
    }
}
