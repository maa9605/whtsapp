package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

/* renamed from: X.0VR  reason: invalid class name */
/* loaded from: classes.dex */
public class C0VR extends LayoutInflater {
    public static final String[] A01 = {"android.widget.", "android.webkit."};
    public final C002301c A00;

    public C0VR(C002301c c002301c, LayoutInflater layoutInflater, Context context) {
        super(layoutInflater, context);
        this.A00 = c002301c;
    }

    @Override // android.view.LayoutInflater
    public LayoutInflater cloneInContext(Context context) {
        return new C0VR(this.A00, this, context);
    }

    @Override // android.view.LayoutInflater
    public View inflate(int i, ViewGroup viewGroup, boolean z) {
        View inflate = super.inflate(i, viewGroup, z);
        C002301c c002301c = this.A00;
        if (!(inflate instanceof InterfaceC07020Wd)) {
            if (z && inflate.getTag(R.id.bidilayout_ignore) != null) {
                if (inflate instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) inflate;
                    int childCount = viewGroup2.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        C0LX.A04(c002301c, viewGroup2.getChildAt(i2));
                    }
                }
            } else {
                C0LX.A04(c002301c, inflate);
            }
            inflate.setTag(R.id.bidilayout_ignore, C0LX.A00);
        }
        return inflate;
    }

    @Override // android.view.LayoutInflater
    public View onCreateView(String str, AttributeSet attributeSet) {
        View createView;
        for (String str2 : A01) {
            try {
                createView = createView(str, str2, attributeSet);
            } catch (ClassNotFoundException unused) {
            }
            if (createView != null) {
                return createView;
            }
        }
        return super.onCreateView(str, attributeSet);
    }
}
