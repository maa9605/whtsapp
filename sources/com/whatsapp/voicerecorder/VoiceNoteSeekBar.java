package com.whatsapp.voicerecorder;

import X.AbstractC51972Ze;
import X.C002301c;
import X.C02160Ac;
import X.C08540bf;
import X.C13090ka;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.SeekBar;
import com.google.android.search.verification.client.R;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;

/* loaded from: classes2.dex */
public class VoiceNoteSeekBar extends AbstractC51972Ze {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public SeekBar.OnSeekBarChangeListener A06;
    public C13090ka A07;
    public C002301c A08;
    public boolean A09;
    public final Paint A0A;
    public final RectF A0B;

    public VoiceNoteSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0A = new Paint(1);
        this.A0B = new RectF();
        this.A04 = 20;
        this.A05 = 10;
        this.A03 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.A02 = C02160Ac.A00(context, R.color.voice_note_seekbar_progress);
        this.A01 = C02160Ac.A00(context, R.color.voice_note_seekbar_background);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08540bf.A2p);
            this.A04 = obtainStyledAttributes.getDimensionPixelSize(2, 20);
            this.A05 = obtainStyledAttributes.getDimensionPixelSize(3, 10);
            this.A02 = obtainStyledAttributes.getInteger(1, this.A02);
            this.A01 = obtainStyledAttributes.getInteger(0, this.A01);
            obtainStyledAttributes.recycle();
        }
        this.A07 = new C13090ka(context, new GestureDetector.SimpleOnGestureListener() { // from class: X.3bg
            {
                VoiceNoteSeekBar.this = this;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                VoiceNoteSeekBar voiceNoteSeekBar = VoiceNoteSeekBar.this;
                if (voiceNoteSeekBar.isLongClickable()) {
                    voiceNoteSeekBar.performLongClick();
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0023, code lost:
        if (r1 < r5) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0025, code lost:
        r1 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0041, code lost:
        if (r1 > (r6 - r4)) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0044, code lost:
        r1 = r0 / r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A00(android.view.MotionEvent r8) {
        /*
            r7 = this;
            int r6 = r7.getWidth()
            int r5 = r7.getPaddingLeft()
            int r4 = r7.getPaddingRight()
            int r3 = r6 - r5
            int r3 = r3 - r4
            float r0 = r8.getX()
            int r1 = (int) r0
            X.01c r0 = r7.A08
            boolean r0 = r0.A0N()
            r2 = 0
            if (r0 == 0) goto L3c
            int r6 = r6 - r4
            if (r1 > r6) goto L48
            int r0 = r3 - r1
            int r0 = r0 + r5
            if (r1 >= r5) goto L44
        L25:
            r1 = 1065353216(0x3f800000, float:1.0)
        L27:
            int r0 = r7.getMax()
            float r0 = (float) r0
            float r1 = r1 * r0
            float r1 = r1 + r2
            int r3 = (int) r1
            r7.setProgress(r3)
            android.widget.SeekBar$OnSeekBarChangeListener r2 = r7.A06
            if (r2 == 0) goto L3b
            r1 = 0
            r0 = 1
            r2.onProgressChanged(r1, r3, r0)
        L3b:
            return
        L3c:
            if (r1 < r5) goto L48
            int r6 = r6 - r4
            int r0 = r1 - r5
            if (r1 <= r6) goto L44
            goto L25
        L44:
            float r1 = (float) r0
            float r0 = (float) r3
            float r1 = r1 / r0
            goto L27
        L48:
            r1 = 0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voicerecorder.VoiceNoteSeekBar.A00(android.view.MotionEvent):void");
    }

    public int getProgressColor() {
        return this.A02;
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        float f;
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i = (width - paddingLeft) - paddingRight;
        int i2 = isPressed() ? (this.A04 * 3) / 4 : this.A04 / 2;
        int max = getMax();
        if (max > 0) {
            f = getProgress() / max;
        } else {
            f = 0.0f;
        }
        int i3 = ((int) (f * (i - (i2 << 1)))) + i2;
        int i4 = (isInEditMode() || this.A08.A0M()) ? i3 + paddingLeft : (width - i3) - paddingRight;
        int paddingTop = getPaddingTop() + (((getHeight() - getPaddingTop()) - getPaddingBottom()) / 2);
        Paint paint = this.A0A;
        paint.setColor(this.A01);
        paint.setStyle(Paint.Style.FILL);
        RectF rectF = this.A0B;
        rectF.set(0.0f, paddingTop - (this.A05 / 2), getWidth(), (this.A05 / 2) + paddingTop);
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
        paint.setColor(this.A02);
        if (!isInEditMode() && !this.A08.A0M()) {
            int i5 = this.A05 / 2;
            rectF.set(i4, paddingTop - i5, width - paddingRight, i5 + paddingTop);
        } else {
            float f2 = paddingLeft;
            int i6 = this.A05 / 2;
            rectF.set(f2, paddingTop - i6, i4, i6 + paddingTop);
        }
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
        canvas.drawCircle(i4, paddingTop, i2, paint);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        setMeasuredDimension(SeekBar.resolveSizeAndState(this.A04 << 1, i, 0), SeekBar.resolveSizeAndState(this.A04 << 1, i2, 0));
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            C13090ka c13090ka = this.A07;
            if (c13090ka != null) {
                c13090ka.A00.APj(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                        this.A00 = motionEvent.getX();
                        return true;
                    }
                }
                setPressed(true);
                invalidate();
                this.A09 = true;
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.A06;
                if (onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onStartTrackingTouch(null);
                }
                A00(motionEvent);
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            } else if (action == 1) {
                if (this.A09) {
                    A00(motionEvent);
                    this.A09 = false;
                    SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = this.A06;
                    if (onSeekBarChangeListener2 != null) {
                        onSeekBarChangeListener2.onStopTrackingTouch(null);
                    }
                    setPressed(false);
                } else {
                    this.A09 = true;
                    SeekBar.OnSeekBarChangeListener onSeekBarChangeListener3 = this.A06;
                    if (onSeekBarChangeListener3 != null) {
                        onSeekBarChangeListener3.onStartTrackingTouch(null);
                    }
                    A00(motionEvent);
                    this.A09 = false;
                    SeekBar.OnSeekBarChangeListener onSeekBarChangeListener4 = this.A06;
                    if (onSeekBarChangeListener4 != null) {
                        onSeekBarChangeListener4.onStopTrackingTouch(null);
                    }
                }
                invalidate();
                return true;
            } else if (action != 2) {
                if (action == 3) {
                    if (this.A09) {
                        this.A09 = false;
                        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener5 = this.A06;
                        if (onSeekBarChangeListener5 != null) {
                            onSeekBarChangeListener5.onStopTrackingTouch(null);
                        }
                        setPressed(false);
                    }
                    invalidate();
                }
            } else if (this.A09) {
                A00(motionEvent);
                return true;
            } else if (Math.abs(motionEvent.getX() - this.A00) > this.A03) {
                setPressed(true);
                invalidate();
                this.A09 = true;
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener6 = this.A06;
                if (onSeekBarChangeListener6 != null) {
                    onSeekBarChangeListener6.onStartTrackingTouch(null);
                }
                A00(motionEvent);
                ViewParent parent3 = getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.A06 = onSeekBarChangeListener;
        super.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    public void setProgressColor(int i) {
        this.A02 = i;
        invalidate();
    }
}
