package org.npci.commonlibrary.widget;

import X.C002301c;
import X.C02160Ac;
import X.C4BW;
import X.C61982x8;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import org.npci.commonlibrary.widget.Keypad;

/* loaded from: classes3.dex */
public class Keypad extends TableLayout {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public C4BW A04;

    public Keypad(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C002301c.A00();
        this.A02 = 61;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C61982x8.A1M, 0, 0);
        this.A03 = obtainStyledAttributes.getColor(3, C02160Ac.A00(getContext(), R.color.npci_keypad_bg_color));
        this.A01 = obtainStyledAttributes.getColor(0, C02160Ac.A00(getContext(), R.color.npci_key_digit_color));
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(2, 36);
        this.A02 = obtainStyledAttributes.getDimensionPixelSize(1, 61);
        obtainStyledAttributes.recycle();
        setBackgroundColor(this.A03);
        TableLayout.LayoutParams layoutParams = new TableLayout.LayoutParams(-1, 0, 1.0f);
        final int i = 1;
        for (int i2 = 0; i2 < 3; i2++) {
            TableRow tableRow = new TableRow(getContext());
            tableRow.setLayoutParams(layoutParams);
            tableRow.setWeightSum(3.0f);
            int i3 = 0;
            do {
                TextView textView = new TextView(getContext());
                textView.setGravity(17);
                textView.setLayoutParams(getItemParams());
                textView.setTextColor(this.A01);
                textView.setTextSize(2, this.A00);
                textView.setText(String.valueOf(i));
                textView.setClickable(true);
                setClickFeedback(textView);
                textView.setOnClickListener(new View.OnClickListener() { // from class: X.4BS
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        C4BW c4bw = Keypad.this.A04;
                        if (c4bw != null) {
                            c4bw.ALF(view, i + 7);
                        }
                    }
                });
                tableRow.addView(textView);
                i++;
                i3++;
            } while (i3 < 3);
            addView(tableRow);
        }
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.ic_action_backspace);
        imageView.setLayoutParams(getItemParams());
        imageView.setClickable(true);
        setClickFeedback(imageView);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: X.4BT
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C4BW c4bw = Keypad.this.A04;
                if (c4bw != null) {
                    c4bw.ALF(view, 67);
                }
            }
        });
        TextView textView2 = new TextView(getContext());
        textView2.setLayoutParams(getItemParams());
        textView2.setGravity(17);
        textView2.setText(String.valueOf(0));
        textView2.setTextColor(this.A01);
        textView2.setTextSize(2, this.A00);
        textView2.setClickable(true);
        setClickFeedback(textView2);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: X.4BU
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C4BW c4bw = Keypad.this.A04;
                if (c4bw != null) {
                    c4bw.ALF(view, 7);
                }
            }
        });
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.ic_action_submit);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setAdjustViewBounds(true);
        TableRow.LayoutParams itemParams = getItemParams();
        itemParams.height = (int) (((int) (this.A02 * (getResources().getDisplayMetrics().densityDpi / 160))) * 1.25f);
        imageView2.setLayoutParams(itemParams);
        imageView2.setClickable(true);
        imageView2.setContentDescription(getContext().getString(R.string.cl_done));
        setClickFeedback(imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: X.4BV
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C4BW c4bw = Keypad.this.A04;
                if (c4bw != null) {
                    c4bw.ALF(view, 66);
                }
            }
        });
        TableRow tableRow2 = new TableRow(getContext());
        tableRow2.setLayoutParams(layoutParams);
        tableRow2.setWeightSum(3.0f);
        tableRow2.addView(imageView);
        tableRow2.addView(textView2);
        tableRow2.addView(imageView2);
        addView(tableRow2);
    }

    private TableRow.LayoutParams getItemParams() {
        return new TableRow.LayoutParams(0, (int) (this.A02 * (getResources().getDisplayMetrics().densityDpi / 160)), 1.0f);
    }

    private void setClickFeedback(View view) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
    }

    public void setOnKeyPressCallback(C4BW c4bw) {
        this.A04 = c4bw;
    }
}
