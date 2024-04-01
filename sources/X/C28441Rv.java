package X;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.1Rv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28441Rv extends FrameLayout implements InterfaceC07620Za {
    public final CollapsibleActionView A00;

    public C28441Rv(View view) {
        super(view.getContext());
        this.A00 = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // X.InterfaceC07620Za
    public void onActionViewCollapsed() {
        this.A00.onActionViewCollapsed();
    }

    @Override // X.InterfaceC07620Za
    public void onActionViewExpanded() {
        this.A00.onActionViewExpanded();
    }
}
