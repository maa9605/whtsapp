package androidx.appcompat.app;

import X.C0UY;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int A00;
    public final int A01;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0UY.A0V);
        this.A00 = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.A01 = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
