package X;

import android.app.Notification;
import android.graphics.Bitmap;

/* renamed from: X.1T5  reason: invalid class name */
/* loaded from: classes.dex */
public class C1T5 extends AbstractC05180Nq {
    public Bitmap A00;
    public boolean A01;

    @Override // X.AbstractC05180Nq
    public void A06(InterfaceC12750k0 interfaceC12750k0) {
        Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(((C1TA) interfaceC12750k0).A02).setBigContentTitle(null).bigPicture(this.A00);
        if (this.A01) {
            bigPicture.bigLargeIcon((Bitmap) null);
        }
        if (this.A02) {
            bigPicture.setSummaryText(super.A01);
        }
    }
}
