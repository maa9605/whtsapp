package X;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import java.util.Map;

/* renamed from: X.0iP */
/* loaded from: classes.dex */
public final class C11830iP extends AbstractC16470qS {
    public final /* synthetic */ AnonymousClass184 A00;
    public final /* synthetic */ LocationRequest A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11830iP(C0NE c0ne, LocationRequest locationRequest, AnonymousClass184 anonymousClass184) {
        super(c0ne);
        this.A01 = locationRequest;
        this.A00 = anonymousClass184;
    }

    @Override // X.C0NH
    public final void A0C(InterfaceC227113q interfaceC227113q) {
        BinderC39901qu binderC39901qu;
        C16410qM c16410qM = (C16410qM) interfaceC227113q;
        BinderC39891qt binderC39891qt = new BinderC39891qt(this);
        LocationRequest locationRequest = this.A01;
        AnonymousClass184 anonymousClass184 = this.A00;
        C07K.A1c(Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
        Looper myLooper = Looper.myLooper();
        C07K.A1Q(anonymousClass184, "Listener must not be null");
        C07K.A1Q(myLooper, "Looper must not be null");
        C07K.A1Q("LocationListener", "Listener type must not be null");
        C14C c14c = new C14C(myLooper, anonymousClass184);
        C235817h c235817h = c16410qM.A00;
        synchronized (c235817h) {
            C236317m c236317m = c235817h.A01;
            c236317m.A00();
            Map map = c235817h.A02;
            synchronized (map) {
                C14A c14a = c14c.A00;
                binderC39901qu = (BinderC39901qu) map.get(c14a);
                if (binderC39901qu == null) {
                    binderC39901qu = new BinderC39901qu(c14c);
                }
                map.put(c14a, binderC39901qu);
            }
            ((InterfaceC235717g) c236317m.A00.A02()).AWv(new C31661cd(1, new C31651cc(locationRequest, C31651cc.A07, null, false, false, false, null), binderC39901qu, null, null, binderC39891qt.asBinder()));
        }
    }
}
