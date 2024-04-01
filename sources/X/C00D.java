package X;

import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.00D */
/* loaded from: classes.dex */
public class C00D {
    public static volatile C00D A04;
    public final C00H A00;
    public final C00E A01;
    public final C00F A02;
    public final C00G A03;

    public C00D(C00E c00e, C00F c00f, C00G c00g, C00H c00h) {
        this.A01 = c00e;
        this.A02 = c00f;
        this.A03 = c00g;
        this.A00 = c00h;
    }

    public final Iterable A00() {
        boolean z;
        C00E c00e = this.A01;
        AbstractCollection abstractCollection = (AbstractCollection) c00e.A04();
        if (abstractCollection.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        C00H c00h = this.A00;
        Iterator it = c00h.A01.iterator();
        while (true) {
            C04250Jl c04250Jl = (C04250Jl) it;
            if (!c04250Jl.hasNext()) {
                break;
            }
            arrayList.add(((C00J) c04250Jl.next()).get());
        }
        C07E c07e = c00h.A00;
        Iterator it2 = abstractCollection.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            try {
                z = this.A03.A02(str).A03;
            } catch (PackageManager.NameNotFoundException unused) {
                z = false;
            }
            if (!z) {
                C000200d.A15("InstrumentationChangeDispatcher/verification failed, dropping event for package - ", str);
                c00e.A05(str);
            } else {
                C00J c00j = (C00J) c07e.A00.get(str);
                if (c00j != null) {
                    arrayList.add(c00j.get());
                }
            }
        }
        return arrayList;
    }

    public void A01() {
        for (C07G c07g : A00()) {
            c07g.A01();
        }
        C00E c00e = this.A01;
        Iterator it = ((AbstractCollection) c00e.A04()).iterator();
        while (it.hasNext()) {
            c00e.A05((String) it.next());
        }
        C00F c00f = this.A02;
        if (c00f != null) {
            c00f.A00.A00.revokeUriPermission(Uri.parse("content://com.whatsapp.provider.instrumentation"), 3);
            return;
        }
        throw null;
    }
}
