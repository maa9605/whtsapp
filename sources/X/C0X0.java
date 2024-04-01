package X;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: X.0X0  reason: invalid class name */
/* loaded from: classes.dex */
public class C0X0 {
    public static final ArrayList A03 = new ArrayList();
    public WeakHashMap A02 = null;
    public SparseArray A00 = null;
    public WeakReference A01 = null;

    public final View A00(View view, KeyEvent keyEvent) {
        int size;
        WeakHashMap weakHashMap = this.A02;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View A00 = A00(viewGroup.getChildAt(childCount), keyEvent);
                    if (A00 != null) {
                        return A00;
                    }
                }
            }
            AbstractList abstractList = (AbstractList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (abstractList != null && (size = abstractList.size() - 1) >= 0) {
                abstractList.get(size);
                throw null;
            }
        }
        return null;
    }
}
