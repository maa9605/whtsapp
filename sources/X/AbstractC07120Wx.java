package X;

import android.os.Build;
import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.0Wx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC07120Wx {
    public final int A00;
    public final int A01;
    public final Class A02;

    public abstract Object A01(View view);

    public abstract void A02(View view, Object obj);

    public abstract boolean A03(Object obj, Object obj2);

    public AbstractC07120Wx() {
        this.A01 = R.id.tag_accessibility_pane_title;
        this.A02 = CharSequence.class;
        this.A00 = 28;
    }

    public AbstractC07120Wx(int i) {
        this.A01 = i;
        this.A02 = Boolean.class;
        this.A00 = 28;
    }

    public Object A00(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= this.A00) {
            return A01(view);
        }
        if (i >= 19) {
            Object tag = view.getTag(this.A01);
            if (this.A02.isInstance(tag)) {
                return tag;
            }
            return null;
        }
        return null;
    }
}
