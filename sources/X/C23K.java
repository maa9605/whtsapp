package X;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.23K  reason: invalid class name */
/* loaded from: classes2.dex */
public class C23K extends AbstractC43161wx {
    public final C06K A00;
    public final C05W A01;
    public final C011505r A02;
    public final C001200o A03;
    public final C002301c A04;
    public final C40951t8 A05;

    public C23K(C001200o c001200o, C40951t8 c40951t8, C05W c05w, C002301c c002301c, C011505r c011505r, C06K c06k, ThreadPoolExecutor threadPoolExecutor) {
        super(new C007203d(null, threadPoolExecutor));
        this.A03 = c001200o;
        this.A05 = c40951t8;
        this.A01 = c05w;
        this.A04 = c002301c;
        this.A02 = c011505r;
        this.A00 = c06k;
    }

    public void A07() {
        Iterator it = ((AbstractCollection) A02()).iterator();
        while (it.hasNext()) {
            A06(it.next());
        }
        synchronized (this) {
            ((ThreadPoolExecutor) super.A00.get()).shutdown();
        }
    }
}
