package X;

import android.util.SparseArray;
import com.google.android.search.verification.client.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Du */
/* loaded from: classes.dex */
public class C25031Du {
    public static InterfaceC020509l A00(int i, C09P c09p, C021109r c021109r, AnonymousClass087 anonymousClass087) {
        C1E1 c1e1;
        List emptyList;
        C020209i c020209i = (C020209i) anonymousClass087.A00(R.id.bk_context_key_tree);
        C25051Dw c25051Dw = (C25051Dw) anonymousClass087.A00(R.id.bk_context_key_scoped_client_id_mapper);
        synchronized (c25051Dw.A00) {
            c1e1 = (C1E1) c25051Dw.A01.get(Integer.valueOf(i));
        }
        if (c1e1 != null) {
            emptyList = c1e1.A01;
        } else {
            emptyList = Collections.emptyList();
        }
        C33321fi c33321fi = new C33321fi(new int[]{0}, c020209i);
        Map map = c020209i.A07;
        InterfaceC25071Dy interfaceC25071Dy = anonymousClass087.A02;
        C25311Ew c25311Ew = C09M.A00().A09;
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(R.id.bloks_global_bloks_host, interfaceC25071Dy);
        sparseArray.put(R.id.bloks_global_parser_map, c25311Ew);
        sparseArray.put(R.id.bloks_global_bloks_context, anonymousClass087);
        sparseArray.put(R.id.bloks_interpreter_callback, c33321fi);
        sparseArray.put(R.id.bloks_interpreter_variables_override, null);
        sparseArray.put(R.id.bloks_interpreter_manifest_entries, map);
        sparseArray.put(R.id.bloks_interpreter_keypath, emptyList);
        C25021Dt c25021Dt = new C25021Dt(new C09w());
        InterfaceC24961Dn interfaceC24961Dn = ((C892046c) interfaceC25071Dy).A02;
        if (interfaceC24961Dn != null) {
            C09w c09w = c25021Dt.A00;
            if (c09w != null) {
                C09v c09v = new C09v(c09w);
                InterfaceC021309t interfaceC021309t = C09M.A00().A0A;
                if (interfaceC24961Dn != null) {
                    return C25011Ds.A00(c09p, c021109r, new C021209s(sparseArray, c09v, interfaceC021309t));
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
