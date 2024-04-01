package com.google.android.material.internal;

import X.C04860Me;
import X.C0AS;
import X.C0AT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.ImageButton;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class CheckableImageButton extends C04860Me implements Checkable {
    public static final int[] A01 = {16842912};
    public boolean A00;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        C0AT.A0c(this, new C0AS() { // from class: X.1eW
            @Override // X.C0AS
            public void A02(View view, AccessibilityEvent accessibilityEvent) {
                this.A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
            }

            @Override // X.C0AS
            public void A04(View view, C08420bS c08420bS) {
                View.AccessibilityDelegate accessibilityDelegate = this.A01;
                AccessibilityNodeInfo accessibilityNodeInfo = c08420bS.A02;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(CheckableImageButton.this.isChecked());
            }
        });
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.A00;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.A00) {
            int[] iArr = A01;
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.A00);
    }
}
