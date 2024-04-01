package X;

import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2bS  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52852bS extends C0HS {
    public WeakReference A00;
    public final C41711uO A01;
    public final C00Y A02;
    public final C41991uq A03;

    public C52852bS(C41991uq c41991uq, C41711uO c41711uO, C00Y c00y, InterfaceC52742bF interfaceC52742bF) {
        this.A03 = c41991uq;
        this.A01 = c41711uO;
        this.A02 = c00y;
        this.A00 = new WeakReference(interfaceC52742bF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        ?? arrayList;
        int i;
        List A04 = this.A03.A04();
        List A05 = this.A01.A05();
        C00X c00x = (C00X) this.A02;
        if (!c00x.A01.A01()) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            C00E c00e = c00x.A03;
            Iterator it = ((AbstractCollection) c00e.A04()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Number number = (Number) c00x.A02.A00.A00.get(str);
                if (number != null) {
                    i = number.intValue();
                } else {
                    i = R.string.unknown_instrumentation_device_name;
                }
                arrayList.add(new C1PP(str, i, c00e.A02().getLong(C00E.A01(str, "metadata/last_active_time"), 0L)));
            }
        }
        return new C57452pO(A04, A05, arrayList);
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        C57452pO c57452pO = (C57452pO) obj;
        InterfaceC52742bF interfaceC52742bF = (InterfaceC52742bF) this.A00.get();
        if (interfaceC52742bF != null) {
            interfaceC52742bF.AMj(c57452pO.A02, c57452pO.A00, c57452pO.A01);
        }
    }
}
