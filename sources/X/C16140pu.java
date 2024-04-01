package X;

import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0pu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16140pu {
    public static AbstractC16120ps A00 = new C1V1() { // from class: X.1oj
        {
            ((C1V1) this).A03 = false;
            A0W(new C38661om(2));
            A0W(new C28971Uq());
            A0W(new C38661om(1));
        }
    };
    public static ThreadLocal A01 = new ThreadLocal();
    public static ArrayList A02 = new ArrayList();

    public static C006702y A00() {
        C006702y c006702y;
        Reference reference = (Reference) A01.get();
        if (reference == null || (c006702y = (C006702y) reference.get()) == null) {
            C006702y c006702y2 = new C006702y();
            A01.set(new WeakReference(c006702y2));
            return c006702y2;
        }
        return c006702y;
    }

    public static void A01(ViewGroup viewGroup, AbstractC16120ps abstractC16120ps) {
        if (!A02.contains(viewGroup) && C0AT.A0h(viewGroup)) {
            A02.add(viewGroup);
            if (abstractC16120ps == null) {
                abstractC16120ps = A00;
            }
            AbstractC16120ps clone = abstractC16120ps.clone();
            AbstractCollection abstractCollection = (AbstractCollection) A00().getOrDefault(viewGroup, null);
            if (abstractCollection != null && abstractCollection.size() > 0) {
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    ((AbstractC16120ps) it.next()).A0F(viewGroup);
                }
            }
            if (clone != null) {
                clone.A0J(viewGroup, true);
            }
            viewGroup.getTag(R.id.transition_current_scene);
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (clone != null) {
                View$OnAttachStateChangeListenerC16130pt view$OnAttachStateChangeListenerC16130pt = new View$OnAttachStateChangeListenerC16130pt(clone, viewGroup);
                viewGroup.addOnAttachStateChangeListener(view$OnAttachStateChangeListenerC16130pt);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(view$OnAttachStateChangeListenerC16130pt);
            }
        }
    }
}
