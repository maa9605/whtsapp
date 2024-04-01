package X;

import com.whatsapp.status.StatusesFragment;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.2bq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C53072bq extends C0HS {
    public final C22X A00;
    public final WeakReference A01;

    public C53072bq(C22X c22x, StatusesFragment statusesFragment) {
        this.A00 = c22x;
        this.A01 = new WeakReference(statusesFragment);
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        return this.A00.A02(C011405q.A00);
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        List<AnonymousClass092> list = (List) obj;
        StatusesFragment statusesFragment = (StatusesFragment) this.A01.get();
        if (statusesFragment != null) {
            statusesFragment.A0Y = null;
            List list2 = statusesFragment.A13;
            list2.clear();
            List list3 = statusesFragment.A14;
            list3.clear();
            int size = list.size() - 1;
            for (AnonymousClass092 anonymousClass092 : list) {
                if (C0D6.A00(anonymousClass092.A08, 4) < 0) {
                    if (anonymousClass092 instanceof AnonymousClass097) {
                        C09H c09h = ((AnonymousClass097) anonymousClass092).A02;
                        if (c09h != null && !c09h.A0P && !c09h.A0a) {
                            list2.add(Integer.valueOf(size));
                        } else {
                            list3.add(Integer.valueOf(size));
                        }
                    } else {
                        list3.add(Integer.valueOf(size));
                    }
                }
                size--;
                C0Hr c0Hr = statusesFragment.A0a.A00;
                if (c0Hr != null && c0Hr.A06 == anonymousClass092.A0p) {
                    long j = anonymousClass092.A0D;
                    if (j > 0) {
                        statusesFragment.A0a.A00.A07 = j;
                    }
                }
            }
            statusesFragment.A0b.getFilter().filter(statusesFragment.A0l);
        }
    }
}
