package X;

import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;

/* renamed from: X.08P  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C08P extends ViewGroup {
    public boolean A00;

    public abstract void A01(int i, C20450xY c20450xY);

    public abstract void A02(int i, C20450xY c20450xY);

    public abstract int getMountItemCount();

    public C08P(Context context) {
        super(context, null);
        this.A00 = true;
    }

    @Override // android.view.ViewGroup
    public boolean getClipChildren() {
        if (Build.VERSION.SDK_INT < 18) {
            return this.A00;
        }
        return super.getClipChildren();
    }

    @Override // android.view.ViewGroup
    public void setClipChildren(boolean z) {
        if (Build.VERSION.SDK_INT < 18) {
            this.A00 = z;
        }
        super.setClipChildren(z);
    }
}
