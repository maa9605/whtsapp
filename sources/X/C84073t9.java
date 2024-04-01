package X;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.3t9  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C84073t9 implements InterfaceC21190yw {
    public boolean A00;
    public final Context A01;

    public C84073t9(Context context, boolean z) {
        this.A01 = context;
        this.A00 = z;
    }

    @Override // X.InterfaceC21190yw
    public C1Z6[] A6v(Handler handler, AnonymousClass137 anonymousClass137, InterfaceC21440zL interfaceC21440zL, AnonymousClass117 anonymousClass117, C10M c10m, InterfaceC21720zn interfaceC21720zn) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C19580vf(this.A01, new C10C() { // from class: X.3t8
            @Override // X.C10C
            public C10A ABv() {
                return null;
            }

            @Override // X.C10C
            public List A9j(String str, boolean z) {
                List<C10A> A03 = C10I.A03(str, z);
                if (A03.isEmpty()) {
                    return A03;
                }
                if (!C84073t9.this.A00) {
                    LinkedList linkedList = new LinkedList();
                    boolean z2 = false;
                    for (C10A c10a : A03) {
                        if (!z2 && c10a.A02.startsWith("OMX.google")) {
                            z2 = true;
                            linkedList.add(0, c10a);
                        } else {
                            linkedList.add(c10a);
                        }
                    }
                    return linkedList;
                }
                A03.get(0);
                return A03;
            }
        }, interfaceC21720zn, handler, anonymousClass137));
        return (C1Z6[]) arrayList.toArray(new C1Z6[0]);
    }
}
