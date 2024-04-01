package X;

import android.widget.Filter;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallsFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.2cF  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C53282cF extends Filter {
    public ArrayList A00;
    public boolean A01;
    public final Object A02 = new Object();
    public final /* synthetic */ CallsFragment A03;

    public C53282cF(CallsFragment callsFragment) {
        this.A03 = callsFragment;
    }

    public static void A00(C53282cF c53282cF) {
        synchronized (c53282cF.A02) {
            c53282cF.A00 = null;
        }
    }

    public final ArrayList A01(Collection collection) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C53202c3 c53202c3 = (C53202c3) it.next();
            if (AnonymousClass029.A1O(this.A03.A05)) {
                ArrayList arrayList3 = c53202c3.A03;
                if (!arrayList3.isEmpty() && ((C0D3) arrayList3.get(0)).A0D) {
                    arrayList2.add(new C54862jT(c53202c3));
                }
            }
            arrayList.add(new C53252cC(c53202c3));
        }
        if (!arrayList2.isEmpty()) {
            arrayList.addAll(0, arrayList2);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009e, code lost:
        if (r10.A01.A0G(r3, r6, true) != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e0 A[SYNTHETIC] */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r14) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53282cF.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        CallsFragment callsFragment;
        Object obj = filterResults.values;
        if (obj == null) {
            Log.e("voip/CallsFragment/publishResults got null values: exception in performFiltering?");
            callsFragment = this.A03;
            callsFragment.A0W = A01(callsFragment.A0X.values());
        } else {
            callsFragment = this.A03;
            callsFragment.A0W = (ArrayList) obj;
        }
        callsFragment.A0U = charSequence;
        callsFragment.A0V = C09940f2.A03(charSequence == null ? null : charSequence.toString(), callsFragment.A0H);
        callsFragment.A13();
        callsFragment.A0Q.notifyDataSetChanged();
    }
}
