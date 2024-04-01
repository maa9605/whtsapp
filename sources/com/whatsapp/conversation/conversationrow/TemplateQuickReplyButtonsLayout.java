package com.whatsapp.conversation.conversationrow;

import X.AbstractC658738w;
import X.C000700j;
import X.C003301p;
import X.C02160Ac;
import X.C0PZ;
import X.C656037v;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.redex.ViewOnClickEBaseShape1S0201000_I1;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class TemplateQuickReplyButtonsLayout extends AbstractC658738w {
    public List A00;
    public View[] A01;
    public View[] A02;

    public TemplateQuickReplyButtonsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = new View[3];
        this.A02 = new View[3];
        ViewGroup.inflate(context, R.layout.template_quick_reply_buttons, this);
    }

    public int A00(int i) {
        int size;
        int i2;
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        int i3 = 0;
        do {
            View[] viewArr = this.A01;
            if (viewArr[i3] != null && this.A02[i3] != null && viewArr[i3].getVisibility() == 0) {
                this.A01[i3].measure(View.MeasureSpec.makeMeasureSpec(i - (applyDimension << 1), EditorInfoCompat.IME_FLAG_FORCE_ASCII), View.MeasureSpec.makeMeasureSpec(0, 0));
                this.A02[i3].measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            i3++;
        } while (i3 < 3);
        if (!A02(i, applyDimension) && !A03(i, applyDimension)) {
            size = this.A00.size();
        } else {
            size = this.A00.size() - 1;
        }
        View view = this.A01[0];
        if (view != null) {
            i2 = (((int) TypedValue.applyDimension(1, 11.0f, view.getResources().getDisplayMetrics())) << 1) + ((int) ((TextView) view).getTextSize());
        } else {
            i2 = 0;
        }
        int i4 = i2 * size;
        if (i4 != 0) {
            i4 += (int) TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics());
        }
        measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        return i4;
    }

    public void A01(C656037v c656037v, List list) {
        View view;
        View view2;
        ViewOnClickEBaseShape1S0201000_I1 viewOnClickEBaseShape1S0201000_I1;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (int i = 0; i < list.size() && arrayList.size() < 3; i++) {
                if (((C0PZ) list.get(i)).A03 == 1) {
                    arrayList.add(list.get(i));
                }
            }
        }
        this.A00 = arrayList;
        boolean z = !arrayList.isEmpty();
        setVisibility(z ? 0 : 8);
        if (z) {
            int i2 = 0;
            do {
                boolean z2 = this.A00.size() > i2;
                if (z2) {
                    C000700j.A06(i2 < 3);
                    View[] viewArr = this.A01;
                    if (viewArr[i2] == null) {
                        if (i2 == 0) {
                            viewArr[i2] = findViewById(R.id.quick_reply_btn_1);
                        } else if (i2 == 1) {
                            viewArr[i2] = findViewById(R.id.quick_reply_btn_2);
                        } else if (i2 == 2) {
                            viewArr[i2] = findViewById(R.id.quick_reply_btn_3);
                        }
                        C003301p.A06((TextView) this.A01[i2]);
                    }
                    view = this.A01[i2];
                } else {
                    view = this.A01[i2];
                }
                TextView textView = (TextView) view;
                if (z2) {
                    C000700j.A06(i2 < 3);
                    View[] viewArr2 = this.A02;
                    if (viewArr2[i2] == null) {
                        if (i2 == 0) {
                            viewArr2[i2] = findViewById(R.id.quick_reply_btn_background_1);
                        } else if (i2 == 1) {
                            viewArr2[i2] = findViewById(R.id.quick_reply_btn_background_2);
                        } else if (i2 == 2) {
                            viewArr2[i2] = findViewById(R.id.quick_reply_btn_background_3);
                        }
                        View view3 = this.A02[i2];
                        if (view3 != null) {
                            view3.setBackground(C02160Ac.A03(getContext(), R.drawable.balloon_incoming_normal_stkr));
                        } else {
                            throw null;
                        }
                    }
                    view2 = this.A02[i2];
                } else {
                    view2 = this.A02[i2];
                }
                if (textView != null && view2 != null) {
                    textView.setVisibility(z2 ? 0 : 8);
                    view2.setVisibility(z2 ? 0 : 8);
                }
                if (z2) {
                    if (textView != null) {
                        if (view2 != null) {
                            boolean z3 = ((C0PZ) this.A00.get(i2)).A01;
                            textView.setText(((C0PZ) this.A00.get(i2)).A04);
                            Context context = textView.getContext();
                            int i3 = R.color.conversation_template_row_button_text_color;
                            if (z3) {
                                i3 = R.color.conversation_template_used_button_text_color;
                            }
                            textView.setTextColor(C02160Ac.A00(context, i3));
                            if (!z3) {
                                viewOnClickEBaseShape1S0201000_I1 = new ViewOnClickEBaseShape1S0201000_I1(this, i2, c656037v, 1);
                            } else {
                                viewOnClickEBaseShape1S0201000_I1 = null;
                            }
                            view2.setOnClickListener(viewOnClickEBaseShape1S0201000_I1);
                            view2.setContentDescription(((C0PZ) this.A00.get(i2)).A04);
                            view2.setClickable(!z3);
                            view2.setLongClickable(true);
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                }
                i2++;
            } while (i2 < 3);
        }
    }

    public final boolean A02(int i, int i2) {
        int i3;
        return this.A00.size() > 1 && this.A01[0].getMeasuredWidth() <= (i3 = (i >> 1) - (i2 << 1)) && this.A01[1].getMeasuredWidth() <= i3;
    }

    public final boolean A03(int i, int i2) {
        int i3;
        return !A02(i, i2) && this.A00.size() > 2 && this.A01[1].getMeasuredWidth() <= (i3 = (i / 2) - (i2 << 1)) && this.A01[2].getMeasuredWidth() <= i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
        if (r21 == false) goto L37;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.TemplateQuickReplyButtonsLayout.onLayout(boolean, int, int, int, int):void");
    }
}
