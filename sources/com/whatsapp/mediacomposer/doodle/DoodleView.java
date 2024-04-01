package com.whatsapp.mediacomposer.doodle;

import X.AbstractC48802Gu;
import X.C002301c;
import X.C2EK;
import X.C2HF;
import X.C2HG;
import X.C2HH;
import X.C2HJ;
import X.C2HL;
import X.C3H4;
import X.C3H8;
import X.C3L1;
import X.C3L3;
import X.C3La;
import X.C40081rY;
import X.C43791xz;
import X.C43811y1;
import X.C48792Gs;
import X.C63502zt;
import X.C63512zu;
import X.C63542zx;
import X.C63552zy;
import X.C63562zz;
import X.C67823Gz;
import X.C67883Hf;
import X.InterfaceC48812Gv;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.util.Log;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class DoodleView extends AbstractC48802Gu implements InterfaceC48812Gv {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public C002301c A04;
    public C40081rY A05;
    public C43811y1 A06;
    public C3H4 A07;
    public C63542zx A08;
    public C63562zz A09;
    public C3H8 A0A;
    public C43791xz A0B;
    public boolean A0C;
    public final RectF A0D;
    public final Handler A0E;
    public final C2HL A0F;
    public final C63512zu A0G;
    public final C63552zy A0H;
    public final C2HF A0I;
    public final Runnable A0J;

    public DoodleView(Context context) {
        super(context);
        this.A03 = -65536;
        this.A01 = 8.0f;
        this.A02 = 8.0f;
        this.A0C = true;
        this.A0E = new Handler();
        this.A0J = new RunnableEBaseShape4S0100000_I0_4(this, 4);
        this.A0I = new C2HF();
        C63512zu c63512zu = new C63512zu();
        this.A0G = c63512zu;
        this.A0H = new C63552zy(c63512zu);
        this.A0F = new C2HL(this.A0G, this.A0I, new C67823Gz(this));
        this.A0D = new RectF();
        new Matrix();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28 || (i >= 23 && this.A06.A00)) {
            setLayerType(2, null);
        }
    }

    public DoodleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = -65536;
        this.A01 = 8.0f;
        this.A02 = 8.0f;
        this.A0C = true;
        this.A0E = new Handler();
        this.A0J = new RunnableEBaseShape4S0100000_I0_4(this, 4);
        this.A0I = new C2HF();
        C63512zu c63512zu = new C63512zu();
        this.A0G = c63512zu;
        this.A0H = new C63552zy(c63512zu);
        this.A0F = new C2HL(this.A0G, this.A0I, new C67823Gz(this));
        this.A0D = new RectF();
        new Matrix();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28 || (i >= 23 && this.A06.A00)) {
            setLayerType(2, null);
        }
    }

    public C2HG A00(MotionEvent motionEvent) {
        if (A06() && motionEvent.getPointerCount() == 1) {
            return this.A0I.A00(this.A0H.A00(motionEvent.getX(), motionEvent.getY()));
        }
        return null;
    }

    public C2HG A01(MotionEvent motionEvent) {
        if (A06() && motionEvent.getPointerCount() == 2) {
            C63552zy c63552zy = this.A0H;
            PointF A00 = c63552zy.A00(motionEvent.getX(0), motionEvent.getY(0));
            PointF A002 = c63552zy.A00(motionEvent.getX(1), motionEvent.getY(1));
            C2HF c2hf = this.A0I;
            C2HG A003 = c2hf.A00(A00);
            if (A003 == null) {
                C2HG A004 = c2hf.A00(A002);
                return A004 == null ? c2hf.A00(new PointF((A00.x + A002.x) / 2.0f, (A00.y + A002.y) / 2.0f)) : A004;
            }
            return A003;
        }
        return null;
    }

    public void A02() {
        C2HL c2hl = this.A0F;
        c2hl.A0C = true;
        c2hl.A05 = SystemClock.elapsedRealtime();
        invalidate();
    }

    public final void A03(float f, float f2) {
        boolean z;
        boolean z2;
        C2HF c2hf = this.A0I;
        c2hf.A02 = null;
        c2hf.A00 = null;
        C2HG c2hg = c2hf.A01;
        C3H4 c3h4 = this.A07;
        if (c3h4 != null) {
            C3L3 c3l3 = (C3L3) c3h4;
            C48792Gs c48792Gs = c3l3.A00.A02;
            if (c48792Gs instanceof C3L1) {
                C3L1 c3l1 = (C3L1) c48792Gs;
                z2 = true;
                if (c2hg != null) {
                    View view = c3l1.A00.A08;
                    float height = view.getHeight() / 2.0f;
                    float x = (view.getX() + height) - f;
                    float y = (view.getY() + height) - f2;
                    if ((y * y) + (x * x) > height * height) {
                        z2 = false;
                    }
                }
                c3l1.A00.A18();
            } else {
                z2 = false;
            }
            if (z2) {
                return;
            }
            if (c2hg instanceof C67883Hf) {
                c3l3.A00.A09((C67883Hf) c2hg);
            }
        }
        if (c2hg != null) {
            if (c2hg instanceof C2HH) {
                C2HH c2hh = (C2HH) c2hg;
                c2hh.A0M.A00(c2hh.A0L);
                z = true;
            } else if (!(c2hg instanceof C3La)) {
                if (c2hg instanceof C2HJ) {
                    C2HJ c2hj = (C2HJ) c2hg;
                    c2hj.A0E.A00(c2hj.A0D);
                    z = true;
                } else {
                    z = false;
                }
            } else {
                C3La c3La = (C3La) c2hg;
                c3La.A0G.A00(c3La.A0F);
                z = true;
            }
            if (z) {
                invalidate();
            }
        }
    }

    public void A04(float f, int i) {
        C2HF c2hf = this.A0I;
        C2HG c2hg = c2hf.A01;
        if (c2hg != null && c2hg != c2hf.A02 && (c2hg.A0D() || c2hg.A0C())) {
            c2hf.A00 = c2hg.A01();
            c2hg = c2hf.A01;
            c2hf.A02 = c2hg;
        }
        this.A02 = f;
        float f2 = this.A00;
        if (f2 == 0.0f) {
            this.A01 = f;
        } else {
            this.A01 = f / f2;
        }
        this.A03 = i;
        if (this.A08.A02 || c2hg == null) {
            return;
        }
        if (c2hg.A0D() || c2hg.A0C()) {
            if (c2hg.A0C()) {
                c2hg.A08(i);
            }
            C2HG c2hg2 = c2hf.A01;
            if (c2hg2.A0D()) {
                c2hg2.A06(this.A01);
            }
            C2HG c2hg3 = c2hf.A01;
            if (c2hg3 instanceof C67883Hf) {
                C67883Hf c67883Hf = (C67883Hf) c2hg3;
                float f3 = C2HG.A08;
                float f4 = C2HG.A05;
                float f5 = (f3 - f4) / 4.0f;
                if (f < f4 + f5) {
                    c67883Hf.A0I(0);
                } else if (f < (2.0f * f5) + f4) {
                    c67883Hf.A0I(1);
                } else if (f < (f5 * 3.0f) + f4) {
                    c67883Hf.A0I(2);
                } else {
                    c67883Hf.A0I(3);
                }
            }
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05(X.C2HG r12) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.DoodleView.A05(X.2HG):void");
    }

    public boolean A06() {
        C63512zu c63512zu = this.A0G;
        return (c63512zu.A06 == null || c63512zu.A07 == null) ? false : true;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x005c, code lost:
        if (r3.A02 == ((int) r7.height())) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0134, code lost:
        if (r3.A0E.getAlpha() < 255) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x01e3, code lost:
        if (r13 == false) goto L60;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r15) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.DoodleView.draw(android.graphics.Canvas):void");
    }

    private PointF getCenterPoint() {
        C63512zu c63512zu = this.A0G;
        if (c63512zu.A05 != null) {
            return this.A0H.A00(getX() + (getMeasuredWidth() >> 1), getY() + (getMeasuredHeight() >> 1));
        }
        return new PointF(c63512zu.A07.centerX(), c63512zu.A07.centerY());
    }

    public C2HL getDoodleRender() {
        return this.A0F;
    }

    public C63552zy getPointsUtil() {
        return this.A0H;
    }

    public C2HF getShapeRepository() {
        return this.A0I;
    }

    public C63512zu getState() {
        return this.A0G;
    }

    public float getStrokeScale() {
        return this.A00;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A0I.A04()) {
            this.A0E.postDelayed(this.A0J, 1000L);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.A0E.removeCallbacks(this.A0J);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C63512zu c63512zu = this.A0G;
        RectF rectF = c63512zu.A07;
        if (rectF == null) {
            return;
        }
        RectF rectF2 = this.A0D;
        rectF2.set(rectF);
        c63512zu.A09.mapRect(rectF2);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float width = rectF2.width() / rectF2.height();
        if ((1.0f * measuredWidth) / measuredHeight < width) {
            measuredHeight = measuredWidth / width;
        } else {
            measuredWidth = measuredHeight * width;
        }
        c63512zu.A00 = measuredWidth / rectF2.width();
        if (this.A00 == 0.0f || !(!this.A0I.A04.isEmpty())) {
            float f = c63512zu.A00;
            this.A00 = f;
            this.A01 = this.A02 / f;
        }
        c63512zu.A0B.set((getMeasuredWidth() - measuredWidth) / 2.0f, (getMeasuredHeight() - measuredHeight) / 2.0f, (getMeasuredWidth() + measuredWidth) / 2.0f, (getMeasuredHeight() + measuredHeight) / 2.0f);
        c63512zu.A08 = getResources().getDisplayMetrics();
        c63512zu.A03 = getMeasuredHeight();
        c63512zu.A04 = getMeasuredWidth();
        C2HL c2hl = this.A0F;
        if (c2hl.A02(false)) {
            c2hl.A01();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        C63502zt c63502zt = (C63502zt) parcelable;
        String str = c63502zt.A01;
        if (!TextUtils.isEmpty(str)) {
            C2EK A03 = C2EK.A03(str, getContext(), this.A05, this.A04, this.A0B);
            if (A03 != null) {
                C63512zu c63512zu = this.A0G;
                c63512zu.A00(A03);
                C2HF c2hf = this.A0I;
                c2hf.A01();
                c2hf.A04.addAll(A03.A04);
                c63512zu.A08 = getResources().getDisplayMetrics();
                this.A0F.A01();
            }
            C2HF c2hf2 = this.A0I;
            String str2 = c63502zt.A02;
            if (c2hf2 == null) {
                throw null;
            }
            if (str2 != null) {
                try {
                    c2hf2.A03.A02(str2, c2hf2.A04);
                } catch (JSONException e) {
                    Log.e("ShapeRepository/loadUndoState", e);
                }
            }
        }
        this.A08.A02 = c63502zt.A03;
        this.A02 = c63502zt.A00;
        requestLayout();
        this.A0F.A0D = false;
        invalidate();
        super.onRestoreInstanceState(c63502zt.getSuperState());
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        String str;
        RectF rectF;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        C63512zu c63512zu = this.A0G;
        RectF rectF2 = c63512zu.A06;
        String str2 = null;
        if (rectF2 != null && (rectF = c63512zu.A07) != null) {
            str = new C2EK(rectF2, rectF, c63512zu.A02, this.A0I.A05).A04();
        } else {
            str = null;
        }
        C2HF c2hf = this.A0I;
        if (c2hf != null) {
            try {
                str2 = c2hf.A03.A01(c2hf.A04);
            } catch (JSONException e) {
                Log.e("ShapeRepository/getUndoJson", e);
            }
            return new C63502zt(onSaveInstanceState, str, str2, this.A08.A02, this.A02);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x0029, code lost:
        if (r0 != 6) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x00a8, code lost:
        if (r1 != 6) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x00b3, code lost:
        if (r14.A0I.A01 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x01d7, code lost:
        if (r3.getStrokeWidth() == r5.A01) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0310, code lost:
        if (r0 != 6) goto L165;
     */
    /* JADX WARN: Removed duplicated region for block: B:209:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00ba A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:385:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 1001
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.DoodleView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDoodle(C2EK c2ek) {
        C63512zu c63512zu = this.A0G;
        c63512zu.A00(c2ek);
        C2HF c2hf = this.A0I;
        c2hf.A01();
        c2hf.A04.addAll(c2ek.A04);
        c63512zu.A08 = getResources().getDisplayMetrics();
        C2HL c2hl = this.A0F;
        c2hl.A01();
        requestLayout();
        c2hl.A0D = false;
        invalidate();
    }

    public void setDoodleViewListener(C3H4 c3h4) {
        this.A07 = c3h4;
        this.A08.A00 = c3h4;
    }

    public void setStrokeColor(int i) {
        this.A03 = i;
    }

    public void setStrokeScale(float f) {
        this.A00 = f;
    }
}
