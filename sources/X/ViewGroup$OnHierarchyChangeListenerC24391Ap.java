package X;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;

/* renamed from: X.1Ap  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class ViewGroup$OnHierarchyChangeListenerC24391Ap implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener A00;
    public final /* synthetic */ C32651eT A01;

    public ViewGroup$OnHierarchyChangeListenerC24391Ap(C32651eT c32651eT) {
        this.A01 = c32651eT;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        int hashCode;
        C32651eT c32651eT = this.A01;
        if (view == c32651eT && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                if (Build.VERSION.SDK_INT >= 17) {
                    hashCode = View.generateViewId();
                } else {
                    hashCode = view2.hashCode();
                }
                view2.setId(hashCode);
            }
            ((Chip) view2).setOnCheckedChangeListenerInternal(c32651eT.A07);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.A00;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        if (view == this.A01 && (view2 instanceof Chip)) {
            ((Chip) view2).setOnCheckedChangeListenerInternal(null);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.A00;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
