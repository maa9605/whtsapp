package com.whatsapp.util;

import X.AbstractC49052If;
import X.C0AS;
import X.C0AT;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I0_6;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public class MarqueeToolbar extends AbstractC49052If {
    public Runnable A00;
    public boolean A01;

    public MarqueeToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = false;
    }

    public final void A0K() {
        if (this.A01) {
            return;
        }
        try {
            Field declaredField = Toolbar.class.getDeclaredField("mTitleTextView");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            if (obj == null) {
                return;
            }
            if (!(obj instanceof TextView)) {
                this.A01 = true;
                return;
            }
            TextView textView = (TextView) obj;
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            textView.setMarqueeRepeatLimit(1);
            textView.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I0_6(textView, 7));
            C0AT.A0c(textView, new C0AS() { // from class: X.2a0
                @Override // X.C0AS
                public void A01(View view, int i) {
                    if (i == 4) {
                        return;
                    }
                    this.A01.sendAccessibilityEvent(view, i);
                }

                @Override // X.C0AS
                public void A04(View view, C08420bS c08420bS) {
                    View.AccessibilityDelegate accessibilityDelegate = this.A01;
                    AccessibilityNodeInfo accessibilityNodeInfo = c08420bS.A02;
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    accessibilityNodeInfo.setClickable(false);
                    for (C08440bU c08440bU : c08420bS.A03()) {
                        if (c08440bU.A00() == 16) {
                            c08420bS.A07(c08440bU);
                        }
                    }
                }
            });
            if (this.A00 == null) {
                RunnableEBaseShape4S0200000_I0_4 runnableEBaseShape4S0200000_I0_4 = new RunnableEBaseShape4S0200000_I0_4(this, textView, 42);
                this.A00 = runnableEBaseShape4S0200000_I0_4;
                postDelayed(runnableEBaseShape4S0200000_I0_4, 1000L);
            }
        } catch (IllegalAccessException e) {
            Log.e("util/marqueetoolbar", e);
            this.A01 = true;
        } catch (NoSuchFieldException e2) {
            Log.e("util/marqueetoolbar", e2);
            this.A01 = true;
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.A00;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.A00 = null;
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(int i) {
        super.setTitle(i);
        A0K();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        A0K();
    }
}
