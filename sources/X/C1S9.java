package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.1S9  reason: invalid class name */
/* loaded from: classes.dex */
public class C1S9 extends AutoCompleteTextView implements InterfaceC02710Co {
    public static final int[] A02 = {16843126};
    public final C07980aP A00;
    public final C07990aQ A01;

    public C1S9(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public C1S9(Context context, AttributeSet attributeSet, int i) {
        super(C07970aO.A00(context), attributeSet, R.attr.autoCompleteTextViewStyle);
        C0V9 A00 = C0V9.A00(getContext(), attributeSet, A02, R.attr.autoCompleteTextViewStyle);
        TypedArray typedArray = A00.A02;
        if (typedArray.hasValue(0)) {
            setDropDownBackgroundDrawable(A00.A02(0));
        }
        typedArray.recycle();
        C07980aP c07980aP = new C07980aP(this);
        this.A00 = c07980aP;
        c07980aP.A08(attributeSet, R.attr.autoCompleteTextViewStyle);
        C07990aQ c07990aQ = new C07990aQ(this);
        this.A01 = c07990aQ;
        c07990aQ.A07(attributeSet, R.attr.autoCompleteTextViewStyle);
        this.A01.A01();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            c07980aP.A02();
        }
        C07990aQ c07990aQ = this.A01;
        if (c07990aQ != null) {
            c07990aQ.A01();
        }
    }

    @Override // X.InterfaceC02710Co
    public ColorStateList getSupportBackgroundTintList() {
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            return c07980aP.A00();
        }
        return null;
    }

    @Override // X.InterfaceC02710Co
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            return c07980aP.A01();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C07O.A0f(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            c07980aP.A03();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            c07980aP.A04(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C07O.A0K(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C09L.A01(getContext(), i));
    }

    @Override // X.InterfaceC02710Co
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            c07980aP.A06(colorStateList);
        }
    }

    @Override // X.InterfaceC02710Co
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            c07980aP.A07(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C07990aQ c07990aQ = this.A01;
        if (c07990aQ != null) {
            c07990aQ.A04(context, i);
        }
    }
}
