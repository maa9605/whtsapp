package X;

import java.util.List;
import java.util.UUID;

/* renamed from: X.431  reason: invalid class name */
/* loaded from: classes3.dex */
public class AnonymousClass431 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C888244p A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ UUID A04;
    public final /* synthetic */ boolean A05 = true;

    public AnonymousClass431(C888244p c888244p, List list, int i, String str, UUID uuid) {
        this.A01 = c888244p;
        this.A03 = list;
        this.A00 = i;
        this.A02 = str;
        this.A04 = uuid;
    }

    @Override // java.lang.Runnable
    public void run() {
        List list = this.A03;
        if (0 < list.size()) {
            list.get(0);
            throw null;
        } else if (this.A05) {
            C888244p c888244p = this.A01;
            c888244p.A0a.A02(this.A04);
            c888244p.A7I(null);
        }
    }
}
