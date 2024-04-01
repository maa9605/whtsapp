package com.whatsapp.conversation.conversationrow;

import X.AbstractC658538u;
import X.C000700j;
import X.C003301p;
import X.C02160Ac;
import X.C0AS;
import X.C0AT;
import X.C2D3;
import X.C655937u;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.redex.ViewOnClickEBaseShape1S0201000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.DynamicButtonsLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class DynamicButtonsLayout extends AbstractC658538u {
    public final List A00;
    public final View[] A01;
    public final View[] A02;

    public DynamicButtonsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A01 = new View[3];
        this.A02 = new View[3];
        this.A00 = new ArrayList();
        ViewGroup.inflate(context, R.layout.template_quick_reply_buttons, this);
    }

    public static final int A00(View view) {
        if (view != null) {
            int applyDimension = (int) TypedValue.applyDimension(1, 11.0f, view.getResources().getDisplayMetrics());
            int textSize = (int) ((TextView) view).getTextSize();
            return Math.max((applyDimension << 1) + textSize, (int) TypedValue.applyDimension(1, 40.0f, view.getResources().getDisplayMetrics()));
        }
        return 0;
    }

    public int A01(int i) {
        View[] viewArr;
        int size;
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        int i2 = 0;
        do {
            viewArr = this.A01;
            if (viewArr[i2] != null) {
                View[] viewArr2 = this.A02;
                if (viewArr2[i2] != null && viewArr[i2].getVisibility() == 0) {
                    viewArr[i2].measure(View.MeasureSpec.makeMeasureSpec(i - (applyDimension << 1), EditorInfoCompat.IME_FLAG_FORCE_ASCII), View.MeasureSpec.makeMeasureSpec(0, 0));
                    viewArr2[i2].measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                }
            }
            i2++;
        } while (i2 < 3);
        if (A05(getMeasuredWidth(), applyDimension)) {
            size = this.A00.size() - 1;
        } else {
            size = this.A00.size();
        }
        int A00 = A00(viewArr[0]) * size;
        if (A00 != 0) {
            A00 += (int) TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics());
        }
        measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(A00, 1073741824));
        return A00;
    }

    public final View A02(int i) {
        C000700j.A06(i < 3);
        View[] viewArr = this.A02;
        if (viewArr[i] == null) {
            if (i == 0) {
                viewArr[i] = findViewById(R.id.quick_reply_btn_background_1);
            } else if (i == 1) {
                viewArr[i] = findViewById(R.id.quick_reply_btn_background_2);
            } else if (i == 2) {
                viewArr[i] = findViewById(R.id.quick_reply_btn_background_3);
            }
            View view = viewArr[i];
            if (view != null) {
                view.setBackground(C02160Ac.A03(getContext(), R.drawable.balloon_incoming_normal_stkr));
            } else {
                throw null;
            }
        }
        return viewArr[i];
    }

    public final View A03(int i) {
        C000700j.A06(i < 3);
        View[] viewArr = this.A01;
        if (viewArr[i] == null) {
            if (i == 0) {
                viewArr[i] = findViewById(R.id.quick_reply_btn_1);
            } else if (i == 1) {
                viewArr[i] = findViewById(R.id.quick_reply_btn_2);
            } else if (i == 2) {
                viewArr[i] = findViewById(R.id.quick_reply_btn_3);
            }
            C003301p.A06((TextView) viewArr[i]);
        }
        return viewArr[i];
    }

    public void A04(C655937u c655937u, List list) {
        boolean z;
        View view;
        View view2;
        List list2 = this.A00;
        list2.clear();
        int min = Math.min(3, list.size());
        for (int i = 0; i < min; i++) {
            list2.add(list.get(i));
        }
        final int i2 = 0;
        do {
            if (list2.size() > i2) {
                z = true;
                view = A03(i2);
                view2 = A02(i2);
            } else {
                z = false;
                view = this.A02[i2];
                view2 = this.A01[i2];
            }
            if (view != null && view2 != null) {
                view.setVisibility(z ? 0 : 8);
                view2.setVisibility(z ? 0 : 8);
            }
            if (z) {
                TextView textView = (TextView) A03(i2);
                textView.setVisibility(0);
                textView.setText(((C2D3) list2.get(i2)).A03);
                Context context = textView.getContext();
                boolean z2 = ((C2D3) list2.get(i2)).A00;
                int i3 = R.color.conversation_template_row_button_text_color;
                if (z2) {
                    i3 = R.color.conversation_template_used_button_text_color;
                }
                textView.setTextColor(C02160Ac.A00(context, i3));
                View A02 = A02(i2);
                A02.setVisibility(0);
                if (((C2D3) list2.get(i2)).A00) {
                    A02.setClickable(false);
                } else {
                    A02.setClickable(true);
                    A02.setOnClickListener(new ViewOnClickEBaseShape1S0201000_I1(this, i2, c655937u, 0));
                }
                A02.setContentDescription(((C2D3) list2.get(i2)).A03);
                A02.setLongClickable(true);
                C0AT.A0c(A02, new C0AS() { // from class: X.38o
                    @Override // X.C0AS
                    public void A04(View view3, C08420bS c08420bS) {
                        super.A01.onInitializeAccessibilityNodeInfo(view3, c08420bS.A02);
                        DynamicButtonsLayout dynamicButtonsLayout = DynamicButtonsLayout.this;
                        c08420bS.A06(new C08440bU(16, dynamicButtonsLayout.getContext().getString(R.string.accessibility_action_click_message_button, ((C2D3) dynamicButtonsLayout.A00.get(i2)).A03)));
                    }
                });
            }
            i2++;
        } while (i2 < 3);
    }

    public final boolean A05(int i, int i2) {
        if (this.A00.size() == 2) {
            View[] viewArr = this.A01;
            int i3 = (i / 2) - (i2 << 1);
            return viewArr[0].getMeasuredWidth() <= i3 && viewArr[1].getMeasuredWidth() <= i3;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        int applyDimension2 = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        int right = getRight() - getLeft();
        View[] viewArr = this.A01;
        int A00 = A00(viewArr[0]);
        boolean A05 = A05(getMeasuredWidth(), applyDimension);
        int i5 = applyDimension2 >> 1;
        int i6 = i5;
        int i7 = 0;
        while (viewArr[i7] != null) {
            View[] viewArr2 = this.A02;
            if (viewArr2[i7] == null || viewArr[i7].getVisibility() != 0) {
                return;
            }
            if (i7 == 0 && A05) {
                int width = getWidth();
                View view = viewArr[i7];
                View view2 = viewArr2[i7];
                View view3 = viewArr[1];
                View view4 = viewArr2[1];
                int i8 = width >> 1;
                int measuredHeight = (A00 - view.getMeasuredHeight()) >> 1;
                int measuredHeight2 = (A00 - view3.getMeasuredHeight()) >> 1;
                int max = Math.max((i8 - view.getMeasuredWidth()) >> 1, applyDimension);
                int max2 = Math.max((i8 - view3.getMeasuredWidth()) >> 1, applyDimension);
                int i9 = A00 + i6 + applyDimension2;
                view2.layout(-applyDimension2, i6, i8 + i5, i9);
                view4.layout(i8 - i5, i6, width + applyDimension2, i9);
                view.layout(max, measuredHeight + i6, i8 - max, view.getMeasuredHeight() + measuredHeight + i6);
                view3.layout(i8 + max2, measuredHeight2 + i6, width - max2, view.getMeasuredHeight() + measuredHeight2 + i6);
                i7 = 2;
            } else {
                int width2 = getWidth();
                View view5 = viewArr[i7];
                View view6 = viewArr2[i7];
                int max3 = Math.max((right - view5.getMeasuredWidth()) >> 1, applyDimension);
                int measuredHeight3 = (A00 - view5.getMeasuredHeight()) >> 1;
                view6.layout(-applyDimension2, i6, width2 + applyDimension2, A00 + i6 + applyDimension2);
                int i10 = measuredHeight3 + i6;
                view5.layout(max3, i10, width2 - max3, view5.getMeasuredHeight() + i10 + applyDimension2);
                i7++;
            }
            i6 += A00;
            if (i7 >= 3) {
                return;
            }
        }
    }
}
