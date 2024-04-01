package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3A9  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3A9 extends C0HS {
    public final C0HE A00;
    public final InterfaceC59982tj A01;
    public final C40411sD A02;
    public final HashMap A03 = new HashMap();

    public C3A9(C40411sD c40411sD, Collection collection, C0HE c0he, InterfaceC59982tj interfaceC59982tj) {
        File file;
        this.A02 = c40411sD;
        this.A00 = c0he;
        this.A01 = interfaceC59982tj;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
            if (anonymousClass092 instanceof AnonymousClass097) {
                AnonymousClass097 anonymousClass097 = (AnonymousClass097) anonymousClass092;
                String str = anonymousClass097.A06;
                C09H c09h = anonymousClass097.A02;
                if (c09h != null) {
                    file = c09h.A0F;
                } else {
                    file = null;
                }
                if (str != null && file != null) {
                    this.A03.put(str, file);
                }
            }
        }
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.A03.entrySet()) {
            arrayList.addAll(this.A02.A0C((File) entry.getValue(), (String) entry.getKey(), this.A00));
        }
        return arrayList;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        this.A01.AJe((Collection) obj);
    }
}
