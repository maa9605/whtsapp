package X;

import android.app.Application;
import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.09M */
/* loaded from: classes.dex */
public class C09M {
    public static C09M A0C;
    public C09O A00;
    public final Context A01;
    public final C25001Dr A02;
    public final InterfaceC020109h A03;
    public final InterfaceC25081Dz A04;
    public final C03250Ey A05;
    public final C0AK A06;
    public final C0AJ A07;
    public final C33821gW A08;
    public final C25311Ew A09;
    public final InterfaceC021309t A0A;
    public final Map A0B;

    public C09M(Context context, InterfaceC021309t interfaceC021309t, C25311Ew c25311Ew, InterfaceC25081Dz interfaceC25081Dz, C25001Dr c25001Dr, C33821gW c33821gW, Map map, C0AJ c0aj, C03250Ey c03250Ey, C0AK c0ak, C09O c09o, InterfaceC020109h interfaceC020109h) {
        this.A01 = context;
        this.A0A = interfaceC021309t;
        this.A09 = c25311Ew;
        this.A04 = interfaceC25081Dz;
        this.A02 = c25001Dr;
        this.A08 = c33821gW;
        this.A0B = map;
        this.A07 = c0aj;
        this.A05 = c03250Ey;
        this.A06 = c0ak;
        this.A00 = c09o;
        this.A03 = interfaceC020109h;
        Class cls = new Class[]{AnonymousClass080.class}[0];
        if (c25311Ew.A00.containsKey(cls)) {
            return;
        }
        StringBuilder sb = new StringBuilder("Missing parser support for type ");
        sb.append(cls);
        throw new IllegalStateException(sb.toString());
    }

    public static C09M A00() {
        C09M c09m = A0C;
        if (c09m != null) {
            return c09m;
        }
        throw new IllegalStateException("Can't find bloks instance. Is it initialized?");
    }

    public static void A01(FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 0) {
            if (frameLayout.getChildCount() == 1) {
                if (frameLayout.getTag(R.id.bloks_tag_component_tree) != null) {
                    ((C39131pd) frameLayout.getChildAt(0)).setRenderState(null);
                    frameLayout.setTag(R.id.bloks_tag_component_tree, null);
                } else {
                    throw new IllegalStateException("Host view has a child but no tree to unbind");
                }
            } else {
                throw new IllegalStateException("found more than one root view");
            }
        }
        frameLayout.removeAllViews();
    }

    public void A02(InterfaceC25071Dy interfaceC25071Dy, C33391fp c33391fp, FrameLayout frameLayout) {
        A03(interfaceC25071Dy, c33391fp, frameLayout, false);
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [X.1fq] */
    public final void A03(InterfaceC25071Dy interfaceC25071Dy, C33391fp c33391fp, FrameLayout frameLayout, boolean z) {
        if (frameLayout.getChildCount() == 0) {
            Context context = frameLayout.getContext();
            if (context != null) {
                SparseArray sparseArray = new SparseArray();
                sparseArray.put(R.id.bk_context_key_states, new HashMap());
                sparseArray.put(R.id.bk_context_key_tree, c33391fp.A00);
                sparseArray.put(R.id.bk_context_key_controllers_for_models, Collections.synchronizedMap(new HashMap()));
                sparseArray.put(R.id.bk_context_key_create_controllers_locks, new HashMap());
                sparseArray.put(R.id.bk_context_key_scoped_client_id_mapper, new C25051Dw());
                AnonymousClass087 anonymousClass087 = new AnonymousClass087(context, interfaceC25071Dy, sparseArray);
                C020209i c020209i = (C020209i) anonymousClass087.A00(R.id.bk_context_key_tree);
                C39131pd c39131pd = new C39131pd(context);
                c39131pd.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                C33371fn c33371fn = new C33371fn(c020209i);
                if (anonymousClass087.A02 != null) {
                    C20540xh c20540xh = new C20540xh(context, c33371fn, anonymousClass087);
                    c39131pd.setRenderState(c20540xh);
                    C25021Dt c25021Dt = new C25021Dt(new C09w());
                    if (((C892046c) interfaceC25071Dy).A02 != null) {
                        C09w c09w = c25021Dt.A00;
                        if (c09w != null) {
                            C09v c09v = new C09v(c09w);
                            c20540xh.A02(new C33511g1(c020209i.A03, c09v, (C25051Dw) anonymousClass087.A00(R.id.bk_context_key_scoped_client_id_mapper)));
                            C33521g2 c33521g2 = new C33521g2(c20540xh, c020209i, c09v, anonymousClass087);
                            c020209i.A04 = new WeakReference(anonymousClass087);
                            final Application application = (Application) anonymousClass087.A00.getApplicationContext();
                            c020209i.A00 = new Object() { // from class: X.1fq
                            };
                            c020209i.A01 = c33521g2;
                            Map map = Collections.EMPTY_MAP;
                            Pair A00 = c020209i.A00(map, map, Collections.singletonList(c020209i.A05));
                            Map map2 = (Map) A00.first;
                            c020209i.A08 = map2;
                            c020209i.A07 = (Map) A00.second;
                            new Pair(c020209i.A03, map2);
                            frameLayout.addView(c39131pd);
                            frameLayout.setTag(R.id.bloks_tag_component_tree, c33391fp);
                            return;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw new IllegalArgumentException("Host view must have a context");
        } else if (frameLayout.getChildCount() == 1) {
            Object tag = frameLayout.getTag(R.id.bloks_tag_component_tree);
            if (tag == null) {
                throw new IllegalStateException("Host view has a child but no bound tree");
            }
            if (c33391fp != tag) {
                if (z) {
                    A01(frameLayout);
                    A03(interfaceC25071Dy, c33391fp, frameLayout, false);
                    return;
                }
                throw new IllegalStateException("binding to new component before unbinding");
            }
        } else {
            throw new IllegalStateException("found more than one root view");
        }
    }
}
