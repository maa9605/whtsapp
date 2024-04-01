package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.0dB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC09380dB {
    public abstract Object A04(Object obj);

    public abstract Object A05(Object obj);

    public abstract Object A06(Object obj, Object obj2, Object obj3);

    public abstract void A07(ViewGroup viewGroup, Object obj);

    public abstract void A09(Object obj, Rect rect);

    public abstract void A0A(Object obj, View view);

    public abstract void A0B(Object obj, View view);

    public abstract void A0C(Object obj, View view);

    public abstract void A0D(Object obj, View view, ArrayList arrayList);

    public abstract void A0E(Object obj, View view, ArrayList arrayList);

    public abstract void A0F(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void A0G(Object obj, ArrayList arrayList);

    public abstract void A0H(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract void A0I(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract boolean A0J(Object obj);

    public static void A00(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
    }

    public static void A01(List list, View view) {
        int i;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2) == view) {
                return;
            }
        }
        list.add(view);
        for (int i3 = size; i3 < list.size(); i3++) {
            View view2 = (View) list.get(i3);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = viewGroup.getChildAt(i4);
                    while (true) {
                        if (i < size) {
                            i = list.get(i) != childAt ? i + 1 : 0;
                        } else {
                            list.add(childAt);
                            break;
                        }
                    }
                }
            }
        }
    }

    public void A02(ArrayList arrayList, View view) {
        Boolean bool;
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (Build.VERSION.SDK_INT < 21 ? !(((bool = (Boolean) viewGroup.getTag(R.id.tag_transition_group)) == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C0AT.A0G(viewGroup) == null) : viewGroup.isTransitionGroup()) {
                    arrayList.add(viewGroup);
                    return;
                }
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    A02(arrayList, viewGroup.getChildAt(i));
                }
                return;
            }
            arrayList.add(view);
        }
    }

    public void A03(Map map, View view) {
        if (view.getVisibility() == 0) {
            String A0G = C0AT.A0G(view);
            if (A0G != null) {
                map.put(A0G, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    A03(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    public void A08(C0BA c0ba, Object obj, C0HE c0he, Runnable runnable) {
        runnable.run();
    }
}
