package com.whatsapp.conversation;

import X.AbstractC655437p;
import X.C000200d;
import X.C54172iE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ListAdapter;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class ConversationListView extends AbstractC655437p {
    public C54172iE A00;

    public ConversationListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = new C54172iE();
    }

    @Override // android.widget.ListView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View selectedView;
        if (keyEvent.getKeyCode() == 23 && (selectedView = getSelectedView()) != null) {
            return selectedView.dispatchKeyEvent(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public void onInitializeAccessibilityNodeInfoForItem(View view, int i, AccessibilityNodeInfo accessibilityNodeInfo) {
        ListAdapter adapter = getAdapter();
        if (i == -1 || adapter == null) {
            return;
        }
        if (i >= adapter.getCount()) {
            StringBuilder A0Q = C000200d.A0Q("conversationvistview/onInitializeAccessibilityNodeInfoForItem pos:", i, " count:");
            A0Q.append(adapter.getCount());
            Log.w(A0Q.toString());
            return;
        }
        super.onInitializeAccessibilityNodeInfoForItem(view, i, accessibilityNodeInfo);
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        this.A00.A01();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                view = null;
                break;
            }
            view = getChildAt(i5);
            if (view.isPressed()) {
                break;
            }
            i5++;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (view != null && !view.isPressed()) {
            view.setPressed(true);
        }
        this.A00.A00();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (getTranscriptMode() == 2) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if ((mode == Integer.MIN_VALUE || mode == 1073741824) && size == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(1, mode);
            }
        }
        super.onMeasure(i, i2);
    }
}
