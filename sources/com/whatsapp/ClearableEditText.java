package com.whatsapp;

import X.AbstractC02790Cw;
import X.AbstractC08150al;
import X.C002301c;
import X.C002701i;
import X.C0AT;
import X.C49582Lf;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.ClearableEditText;
import java.util.List;

/* loaded from: classes.dex */
public class ClearableEditText extends AbstractC08150al implements View.OnTouchListener, TextWatcher {
    public Drawable A00;
    public View.OnClickListener A01;
    public C002301c A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Rect A06;

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public ClearableEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A05 = true;
        this.A06 = new Rect();
        int i = R.drawable.ic_backup_cancel;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C49582Lf.A0X);
            this.A04 = obtainStyledAttributes.getBoolean(1, false);
            this.A05 = obtainStyledAttributes.getBoolean(3, true);
            this.A03 = obtainStyledAttributes.getBoolean(0, false);
            i = obtainStyledAttributes.getResourceId(2, R.drawable.ic_backup_cancel);
            obtainStyledAttributes.recycle();
        }
        this.A00 = C002701i.A0D(getResources(), i, null);
        setOnTouchListener(this);
        addTextChangedListener(this);
        C0AT.A0c(this, new AbstractC02790Cw(this) { // from class: X.1YL
            {
                ClearableEditText.this = this;
            }

            @Override // X.AbstractC02790Cw
            public int A06(float f, float f2) {
                int i2 = (int) f;
                int i3 = (int) f2;
                Rect clearBounds = ClearableEditText.getClearBounds(ClearableEditText.this);
                if (i2 < clearBounds.left || i2 > clearBounds.right || i3 < clearBounds.top || i3 > clearBounds.bottom) {
                    return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                }
                return 1;
            }

            @Override // X.AbstractC02790Cw
            public void A0A(int i2, C08420bS c08420bS) {
                if (i2 == 1) {
                    AccessibilityNodeInfo accessibilityNodeInfo = c08420bS.A02;
                    accessibilityNodeInfo.setClickable(true);
                    accessibilityNodeInfo.addAction(16);
                    ClearableEditText clearableEditText = ClearableEditText.this;
                    accessibilityNodeInfo.setContentDescription(clearableEditText.getContext().getString(R.string.entry_clear_button_content_description));
                    accessibilityNodeInfo.setBoundsInParent(ClearableEditText.getClearBounds(clearableEditText));
                }
            }

            @Override // X.AbstractC02790Cw
            public void A0C(List list) {
                if (ClearableEditText.this.getClearIconDrawable() != null) {
                    list.add(1);
                }
            }

            @Override // X.AbstractC02790Cw
            public boolean A0F(int i2, int i3, Bundle bundle) {
                if (i2 == 1 && i3 == 16) {
                    ClearableEditText clearableEditText = ClearableEditText.this;
                    View.OnClickListener onClickListener = clearableEditText.A01;
                    if (onClickListener != null) {
                        onClickListener.onClick(clearableEditText);
                    }
                    clearableEditText.setText("");
                    clearableEditText.requestFocus();
                    return true;
                }
                return false;
            }
        });
    }

    public final void A00(Editable editable) {
        if (!this.A03 && (TextUtils.isEmpty(editable) || !isFocusable() || !isEnabled())) {
            if (getClearIconDrawable() != null) {
                setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        } else if (this.A00 == null) {
        } else {
            if (this.A02.A0N()) {
                setCompoundDrawablesWithIntrinsicBounds(this.A00, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.A00, (Drawable) null);
            }
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        A00(editable);
    }

    public static Rect getClearBounds(ClearableEditText clearableEditText) {
        int width;
        Drawable clearIconDrawable = clearableEditText.getClearIconDrawable();
        if (clearIconDrawable == null) {
            return new Rect();
        }
        int width2 = clearableEditText.A02.A0N() ? 0 : (clearableEditText.getWidth() - clearableEditText.getPaddingRight()) - clearIconDrawable.getIntrinsicWidth();
        if (clearableEditText.A02.A0N()) {
            width = clearIconDrawable.getIntrinsicWidth() + clearableEditText.getPaddingLeft();
        } else {
            width = clearableEditText.getWidth();
        }
        int bottom = ((clearableEditText.getBottom() - clearableEditText.getTop()) >> 1) - (clearIconDrawable.getIntrinsicHeight() >> 1);
        int bottom2 = (clearableEditText.getBottom() - clearableEditText.getTop()) >> 1;
        Rect rect = clearableEditText.A06;
        rect.left = width2;
        rect.right = width;
        rect.top = bottom;
        rect.bottom = (clearIconDrawable.getIntrinsicHeight() >> 1) + bottom2;
        return rect;
    }

    public Drawable getClearIconDrawable() {
        return this.A02.A0N() ? getCompoundDrawables()[0] : getCompoundDrawables()[2];
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (this.A04 && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            clearFocus();
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (getClearIconDrawable() != null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                Rect clearBounds = getClearBounds(this);
                if (x < clearBounds.left || x > clearBounds.right || y < clearBounds.top || y > clearBounds.bottom) {
                    return false;
                }
                View.OnClickListener onClickListener = this.A01;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                setText("");
                requestFocus();
                return this.A05;
            }
            return false;
        }
        return false;
    }

    public void setAlwaysShowClearIcon(boolean z) {
        if (z != this.A03) {
            this.A03 = z;
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        A00(getText());
    }

    public void setOnClearIconClickedListener(View.OnClickListener onClickListener) {
        this.A01 = onClickListener;
    }
}
