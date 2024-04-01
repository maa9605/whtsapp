package X;

import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.052  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass052 {
    public final C01B A00;
    public final C04o A01;
    public final AnonymousClass012 A02;
    public final JniBridge A03;

    public AnonymousClass052(AnonymousClass012 anonymousClass012, JniBridge jniBridge, C01B c01b, C04o c04o) {
        this.A02 = anonymousClass012;
        this.A03 = jniBridge;
        this.A00 = c01b;
        this.A01 = c04o;
    }

    public final List A00(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            JniBridge jniBridge = this.A03;
            Object jvidispatchOOO = JniBridge.jvidispatchOOO(1, jniBridge.getWajContext(), ((C0IR) it.next()).A01);
            if (jvidispatchOOO == null) {
                Log.e("wamsys/convertToNativePublicKeyList/public-key-conversion-failed");
                return null;
            }
            arrayList.add(jvidispatchOOO);
        }
        return arrayList;
    }
}
