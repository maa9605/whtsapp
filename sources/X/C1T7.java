package X;

import android.app.Notification;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1T7  reason: invalid class name */
/* loaded from: classes.dex */
public class C1T7 extends AbstractC05180Nq {
    public ArrayList A00 = new ArrayList();

    @Override // X.AbstractC05180Nq
    public void A06(InterfaceC12750k0 interfaceC12750k0) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((C1TA) interfaceC12750k0).A02).setBigContentTitle(null);
        if (this.A02) {
            bigContentTitle.setSummaryText(this.A01);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine((CharSequence) it.next());
        }
    }
}
