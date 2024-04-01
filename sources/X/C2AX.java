package X;

import android.app.Application;
import android.content.Intent;
import android.os.Message;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.LocationSharingService;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2AX  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2AX implements InterfaceC453921s, InterfaceC453821q {
    public static volatile C2AX A09;
    public final AnonymousClass012 A00;
    public final C001200o A01;
    public final C41461tx A02;
    public final C41471ty A03;
    public final C0EG A04;
    public final C41521u3 A05;
    public final Object A06 = new Object();
    public final Set A07 = new HashSet();
    public final Set A08 = new HashSet();

    @Override // X.InterfaceC453921s
    public void ANe(C0K0 c0k0) {
    }

    @Override // X.InterfaceC453921s
    public void ANf(AbstractC005302j abstractC005302j, UserJid userJid) {
    }

    public C2AX(C001200o c001200o, AnonymousClass012 anonymousClass012, C0EG c0eg, C41471ty c41471ty, C41521u3 c41521u3, C41461tx c41461tx) {
        this.A01 = c001200o;
        this.A00 = anonymousClass012;
        this.A04 = c0eg;
        this.A03 = c41471ty;
        this.A05 = c41521u3;
        this.A02 = c41461tx;
    }

    public static C2AX A00() {
        if (A09 == null) {
            synchronized (C2AX.class) {
                if (A09 == null) {
                    A09 = new C2AX(C001200o.A01, AnonymousClass012.A00(), C0EG.A00(), C41471ty.A00(), C41521u3.A00(), C41461tx.A00());
                }
            }
        }
        return A09;
    }

    public void A01(AbstractC005302j abstractC005302j, C0SE c0se) {
        synchronized (this.A06) {
            this.A07.add(abstractC005302j);
            this.A04.A0J(c0se);
        }
    }

    public void A02(AbstractC005302j abstractC005302j, C04500Kk c04500Kk) {
        synchronized (this.A06) {
            Set set = this.A08;
            set.remove(abstractC005302j);
            if (set.isEmpty()) {
                C41461tx c41461tx = this.A02;
                c41461tx.A0Y.remove(this);
                c41461tx.A0X.remove(this);
            }
            if (!this.A07.contains(abstractC005302j)) {
                this.A04.A0K(new C0Z5(abstractC005302j, c04500Kk));
            }
            C41461tx c41461tx2 = this.A02;
            if (c41461tx2.A0h(abstractC005302j)) {
                Iterator it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (c41461tx2.A0h((AbstractC005302j) it.next())) {
                            break;
                        }
                    } else {
                        Application application = this.A01.A00;
                        C02160Ac.A06(application, new Intent(application, LocationSharingService.class).setAction("com.whatsapp.ShareLocationService.ACTION_STOP_LOCATION_UPDATES_FOR_WEB"));
                        break;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC453921s
    public void ANg(AbstractC005302j abstractC005302j, UserJid userJid) {
        synchronized (this.A06) {
            if (this.A08.contains(abstractC005302j)) {
                C41521u3 c41521u3 = this.A05;
                if (c41521u3.A0F.A04() && abstractC005302j != null) {
                    c41521u3.A0C.A09(Message.obtain(null, 0, 173, 0, new C07510Ym(abstractC005302j, userJid)));
                }
            }
        }
    }

    @Override // X.InterfaceC453821q
    public void AOv(AbstractC005302j abstractC005302j) {
        synchronized (this.A06) {
            if (this.A08.contains(abstractC005302j)) {
                Application application = this.A01.A00;
                C02160Ac.A06(application, new Intent(application, LocationSharingService.class).setAction("com.whatsapp.ShareLocationService.ACTION_START_LOCATION_UPDATES_FOR_WEB").putExtra("duration", 42000L));
            }
        }
    }

    @Override // X.InterfaceC453821q
    public void APC(AbstractC005302j abstractC005302j) {
        synchronized (this.A06) {
            Set set = this.A08;
            if (set.contains(abstractC005302j)) {
                Iterator it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (this.A02.A0h((AbstractC005302j) it.next())) {
                            break;
                        }
                    } else {
                        Application application = this.A01.A00;
                        C02160Ac.A06(application, new Intent(application, LocationSharingService.class).setAction("com.whatsapp.ShareLocationService.ACTION_STOP_LOCATION_UPDATES_FOR_WEB"));
                        break;
                    }
                }
            }
        }
    }
}
