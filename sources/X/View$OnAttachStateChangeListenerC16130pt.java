package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.0pt */
/* loaded from: classes.dex */
public class View$OnAttachStateChangeListenerC16130pt implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public ViewGroup A00;
    public AbstractC16120ps A01;

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    public View$OnAttachStateChangeListenerC16130pt(AbstractC16120ps abstractC16120ps, ViewGroup viewGroup) {
        this.A01 = abstractC16120ps;
        this.A00 = viewGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0285  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.View$OnAttachStateChangeListenerC16130pt.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.A00.getViewTreeObserver().removeOnPreDrawListener(this);
        this.A00.removeOnAttachStateChangeListener(this);
        C16140pu.A02.remove(this.A00);
        AbstractCollection abstractCollection = (AbstractCollection) C16140pu.A00().get(this.A00);
        if (abstractCollection != null && abstractCollection.size() > 0) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                ((AbstractC16120ps) it.next()).A0G(this.A00);
            }
        }
        this.A01.A0O(true);
    }
}
