package com.whatsapp.numberkeyboard;

import X.AbstractC76923hN;
import X.C002301c;
import X.C02160Ac;
import X.C02E;
import X.C2YF;
import X.C3NG;
import X.C3NH;
import X.C3NK;
import X.C42041uv;
import X.C49582Lf;
import X.C76913hM;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaEditText;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class NumberEntryKeyboard extends C2YF {
    public static final int A0H = (int) Math.floor(20.399999618530273d);
    public int A00;
    public int A01;
    public long A02;
    public Paint A03;
    public RectF A04;
    public View A05;
    public EditText A06;
    public C02E A07;
    public C002301c A08;
    public C76913hM A09;
    public C3NG A0A;
    public Map A0B;
    public Map A0C;
    public boolean A0D;
    public View[][] A0E;
    public C3NH[][] A0F;
    public final View.OnTouchListener A0G;

    public NumberEntryKeyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        C3NG A00;
        this.A0B = new HashMap();
        this.A02 = -1L;
        this.A0G = new View.OnTouchListener() { // from class: X.3NF
            {
                NumberEntryKeyboard.this = this;
            }

            public final void A00() {
                NumberEntryKeyboard numberEntryKeyboard = NumberEntryKeyboard.this;
                numberEntryKeyboard.A05 = null;
                if (numberEntryKeyboard.A0D) {
                    C3NK c3nk = (C3NK) numberEntryKeyboard.A0C.get(Long.valueOf(numberEntryKeyboard.A02));
                    if (c3nk.A02.isRunning()) {
                        c3nk.A05 = true;
                    } else if (c3nk.A03.isRunning()) {
                    } else {
                        c3nk.A03.start();
                    }
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:131:0x0058, code lost:
                if (r3 != 3) goto L28;
             */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean onTouch(android.view.View r22, android.view.MotionEvent r23) {
                /*
                    Method dump skipped, instructions count: 427
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C3NF.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        };
        LinearLayout.inflate(getContext(), R.layout.number_entry_keyboard, this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.custom_key_container);
        if (attributeSet != null && context.getTheme().obtainStyledAttributes(attributeSet, C49582Lf.A1R, 0, 0).getInteger(0, 0) == 1 && (A00 = A00(this.A08)) != null) {
            this.A0A = A00;
            viewGroup.addView(((AbstractC76923hN) A00).A00(context));
        }
        if (this.A08.A0M()) {
            this.A0E = new View[][]{new View[]{findViewById(R.id.one_key), findViewById(R.id.two_key), findViewById(R.id.three_key)}, new View[]{findViewById(R.id.four_key), findViewById(R.id.five_key), findViewById(R.id.six_key)}, new View[]{findViewById(R.id.seven_key), findViewById(R.id.eight_key), findViewById(R.id.nine_key)}, new View[]{viewGroup, findViewById(R.id.zero_key), findViewById(R.id.backspace_key)}};
        } else {
            this.A0E = new View[][]{new View[]{findViewById(R.id.three_key), findViewById(R.id.two_key), findViewById(R.id.one_key)}, new View[]{findViewById(R.id.six_key), findViewById(R.id.five_key), findViewById(R.id.four_key)}, new View[]{findViewById(R.id.nine_key), findViewById(R.id.eight_key), findViewById(R.id.seven_key)}, new View[]{findViewById(R.id.backspace_key), findViewById(R.id.zero_key), viewGroup}};
        }
        if (attributeSet != null && context.getTheme().obtainStyledAttributes(attributeSet, C49582Lf.A1R, 0, 0).getInteger(0, 0) == 1) {
            setCustomKey(A00(this.A08));
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.number_entry_keyboard_horizontal_padding);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        setOrientation(1);
        setBackgroundColor(C02160Ac.A00(getContext(), R.color.number_entry_keyboard_bg_color));
        for (int i2 = 0; i2 < this.A0E.length; i2++) {
            int i3 = 0;
            while (true) {
                View[][] viewArr = this.A0E;
                if (i3 < viewArr[i2].length) {
                    View view = viewArr[i2][i3];
                    if (view != null && (view instanceof TextView)) {
                        TextView textView = (TextView) view;
                        NumberFormat A0G = this.A08.A0G();
                        int id = view.getId();
                        if (id == R.id.zero_key) {
                            i = 0;
                        } else if (id == R.id.one_key) {
                            i = 1;
                        } else if (id == R.id.two_key) {
                            i = 2;
                        } else if (id == R.id.three_key) {
                            i = 3;
                        } else if (id == R.id.four_key) {
                            i = 4;
                        } else if (id == R.id.five_key) {
                            i = 5;
                        } else if (id == R.id.six_key) {
                            i = 6;
                        } else if (id == R.id.seven_key) {
                            i = 7;
                        } else {
                            i = 9;
                            if (id == R.id.eight_key) {
                                i = 8;
                            }
                        }
                        textView.setText(A0G.format(i));
                    }
                    i3++;
                }
            }
        }
        boolean z = Settings.System.getFloat(context.getContentResolver(), "window_animation_scale", 1.0f) == 1.0f;
        this.A0D = z;
        if (z) {
            Paint paint = new Paint(1);
            this.A03 = paint;
            paint.setColor(C02160Ac.A00(context, R.color.number_entry_keyboard_ripple_color));
            this.A03.setStyle(Paint.Style.FILL);
            this.A03.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            this.A04 = new RectF();
            this.A0C = new HashMap();
            this.A09 = new C76913hM(this);
        }
        setOnTouchListener(this.A0G);
    }

    public static C3NG A00(C002301c c002301c) {
        return C42041uv.A05(c002301c).equals(".") ? new AbstractC76923hN() { // from class: X.3vy
            @Override // X.C3NG
            public void ANH(EditText editText) {
                editText.dispatchKeyEvent(new KeyEvent(0L, 0L, 0, 158, 0));
                editText.dispatchKeyEvent(new KeyEvent(0L, 0L, 1, 158, 0));
            }
        } : new AbstractC76923hN() { // from class: X.3vx
            @Override // X.C3NG
            public void ANH(EditText editText) {
                editText.dispatchKeyEvent(new KeyEvent(0L, 0L, 0, 159, 0));
                editText.dispatchKeyEvent(new KeyEvent(0L, 0L, 1, 159, 0));
            }
        };
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A0D) {
            for (Number number : this.A0C.keySet()) {
                C3NK c3nk = (C3NK) this.A0C.get(Long.valueOf(number.longValue()));
                PointF pointF = c3nk.A04;
                float f = c3nk.A00;
                float f2 = pointF.x;
                float f3 = f / 2.0f;
                float f4 = pointF.y;
                this.A04.set(f2 - f3, f4 - f3, f2 + f3, f4 + f3);
                this.A03.setAlpha(c3nk.A01);
                canvas.drawOval(this.A04, this.A03);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            float width = getWidth();
            float height = getHeight();
            View[][] viewArr = this.A0E;
            int length = viewArr[0].length;
            float f2 = width / length;
            int length2 = viewArr.length;
            float f3 = height / length2;
            int floor = ((int) Math.floor(f2)) + 12;
            this.A00 = floor;
            this.A01 = (int) (floor / 2.0f);
            this.A0F = (C3NH[][]) Array.newInstance(C3NH.class, length2, length);
            for (int i6 = 0; i6 < this.A0E.length; i6++) {
                int i7 = 0;
                while (true) {
                    View[][] viewArr2 = this.A0E;
                    int length3 = viewArr2[0].length;
                    if (i7 < length3) {
                        View view = viewArr2[i6][i7];
                        float f4 = i7 * f2;
                        float f5 = i6 * f3;
                        float f6 = f4 + f2;
                        float f7 = f5 + f3;
                        if (i7 == 0) {
                            i5 = getPaddingLeft();
                        } else if (i7 != length3 - 1) {
                            f = 0.0f;
                            C3NH c3nh = new C3NH(new RectF(f4, f5, f6, f7), new PointF(((f4 + f6) / 2.0f) + f, (f5 + f7) / 2.0f));
                            this.A0F[i6][i7] = c3nh;
                            this.A0B.put(view, c3nh);
                            i7++;
                        } else {
                            i5 = -getPaddingRight();
                        }
                        f = i5;
                        C3NH c3nh2 = new C3NH(new RectF(f4, f5, f6, f7), new PointF(((f4 + f6) / 2.0f) + f, (f5 + f7) / 2.0f));
                        this.A0F[i6][i7] = c3nh2;
                        this.A0B.put(view, c3nh2);
                        i7++;
                    }
                }
            }
        }
    }

    public void setCustomKey(C3NG c3ng) {
        this.A0A = c3ng;
        ViewGroup viewGroup = (ViewGroup) this.A0E[3][this.A08.A0M() ? (char) 0 : (char) 2];
        viewGroup.removeAllViews();
        if (c3ng != null) {
            viewGroup.addView(((AbstractC76923hN) c3ng).A00(getContext()));
        }
        invalidate();
    }

    public void setEditText(WaEditText waEditText) {
        this.A06 = waEditText;
    }
}
