package com.whatsapp;

import X.AbstractC04840Ma;
import X.AnonymousClass024;
import X.C002301c;
import X.C1LY;
import X.C49582Lf;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Selection;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.whatsapp.WaEditText;

/* loaded from: classes.dex */
public class WaEditText extends AbstractC04840Ma {
    public Rect A00;
    public C1LY A01;
    public C002301c A02;
    public boolean A03;
    public final Runnable A04;

    public WaEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A04 = new Runnable() { // from class: X.1FI
            {
                WaEditText.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WaEditText waEditText = WaEditText.this;
                if (waEditText.A03) {
                    Object systemService = waEditText.getContext().getSystemService("input_method");
                    if (systemService != null) {
                        ((InputMethodManager) systemService).showSoftInput(waEditText, 0);
                        waEditText.A03 = false;
                        return;
                    }
                    throw null;
                }
            }
        };
        if (attributeSet == null || isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C49582Lf.A2J);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            setContentDescription(this.A02.A06(resourceId));
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            setHint(context.getString(resourceId2));
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId3 != 0) {
            setImeActionLabel(this.A02.A06(resourceId3), getImeActionId());
        }
        int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId4 != 0) {
            setText(this.A02.A06(resourceId4));
        }
        obtainStyledAttributes.recycle();
    }

    public void A01() {
        Object systemService = getContext().getSystemService("input_method");
        if (systemService != null) {
            this.A03 = false;
            removeCallbacks(this.A04);
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 0);
            return;
        }
        throw null;
    }

    public void A02(boolean z) {
        Object systemService = getContext().getSystemService("input_method");
        if (systemService != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (!inputMethodManager.isFullscreenMode() || z) {
                if (inputMethodManager.isActive(this)) {
                    this.A03 = false;
                    removeCallbacks(this.A04);
                    inputMethodManager.showSoftInput(this, 0);
                    return;
                }
                requestFocus();
                this.A03 = true;
                return;
            }
            return;
        }
        throw null;
    }

    public boolean A03(Point point) {
        int i;
        Rect rect = this.A00;
        if (rect != null) {
            int i2 = point.x;
            return i2 >= rect.left && i2 <= rect.right && (i = point.y) >= rect.top && i <= rect.bottom;
        }
        return true;
    }

    @Override // X.C04850Mb, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.A03) {
            Runnable runnable = this.A04;
            removeCallbacks(runnable);
            post(runnable);
        }
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (IndexOutOfBoundsException unused) {
            setText(AnonymousClass024.A09(getText()));
        }
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        C1LY c1ly = this.A01;
        return (c1ly != null && c1ly.APa(i)) || super.onTextContextMenuItem(i);
    }

    public void setCursorPosition_internal(int i, int i2) {
        int length = getText().length();
        Selection.setSelection(getText(), Math.min(i, length), Math.min(i2, length));
    }

    public void setOnContextMenuListener(C1LY c1ly) {
        this.A01 = c1ly;
    }

    public void setSpan_internal(Object obj, int i, int i2, int i3) {
        getText().setSpan(obj, i, Math.min(i2, getText().length()), i3);
    }

    public void setVisibleBounds(Rect rect) {
        this.A00 = rect;
    }
}
