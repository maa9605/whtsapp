package X;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

/* renamed from: X.1AK  reason: invalid class name */
/* loaded from: classes.dex */
public class C1AK extends Property {
    public static final Property A00 = new C1AK();

    public C1AK() {
        super(Float.class, "childrenAlpha");
    }

    @Override // android.util.Property
    public Object get(Object obj) {
        Object tag = ((View) obj).getTag(R.id.mtrl_internal_children_alpha_tag);
        return tag == null ? Float.valueOf(1.0f) : tag;
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        float floatValue = ((Number) obj2).floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
