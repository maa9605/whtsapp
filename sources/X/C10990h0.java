package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* renamed from: X.0h0  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C10990h0 extends CheckedTextView {
    public static final int[] A01 = {16843016};
    public final C07990aQ A00;

    public C10990h0(Context context, AttributeSet attributeSet) {
        super(C07970aO.A00(context), attributeSet, 16843720);
        C07990aQ c07990aQ = new C07990aQ(this);
        this.A00 = c07990aQ;
        c07990aQ.A07(attributeSet, 16843720);
        this.A00.A01();
        C0V9 A00 = C0V9.A00(getContext(), attributeSet, A01, 16843720);
        setCheckMarkDrawable(A00.A02(0));
        A00.A02.recycle();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C07990aQ c07990aQ = this.A00;
        if (c07990aQ != null) {
            c07990aQ.A01();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C07O.A0f(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C09L.A01(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C07O.A0K(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C07990aQ c07990aQ = this.A00;
        if (c07990aQ != null) {
            c07990aQ.A04(context, i);
        }
    }
}
