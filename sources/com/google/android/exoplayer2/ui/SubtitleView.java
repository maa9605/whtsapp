package com.google.android.exoplayer2.ui;

import X.AnonymousClass112;
import X.AnonymousClass117;
import X.C08M;
import X.C222911v;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class SubtitleView extends View implements AnonymousClass117 {
    public float A00;
    public float A01;
    public AnonymousClass112 A02;
    public List A03;
    public boolean A04;
    public boolean A05;
    public final List A06;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = new ArrayList();
        this.A01 = 0.0533f;
        this.A05 = true;
        this.A04 = true;
        this.A02 = AnonymousClass112.A06;
        this.A00 = 0.08f;
    }

    public void A00() {
        AnonymousClass112 anonymousClass112;
        if (C08M.A00 >= 19 && ((CaptioningManager) getContext().getSystemService("captioning")).isEnabled() && !isInEditMode()) {
            anonymousClass112 = getUserCaptionStyleV19();
        } else {
            anonymousClass112 = AnonymousClass112.A06;
        }
        setStyle(anonymousClass112);
    }

    public void A01() {
        setFractionalTextSize(((C08M.A00 < 19 || isInEditMode()) ? 1.0f : getUserCaptionFontScaleV19()) * 0.0533f);
    }

    @Override // X.AnonymousClass117
    public void AJA(List list) {
        setCues(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0485 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void dispatchDraw(android.graphics.Canvas r38) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.SubtitleView.dispatchDraw(android.graphics.Canvas):void");
    }

    private float getUserCaptionFontScaleV19() {
        return ((CaptioningManager) getContext().getSystemService("captioning")).getFontScale();
    }

    private AnonymousClass112 getUserCaptionStyleV19() {
        CaptioningManager.CaptionStyle userStyle = ((CaptioningManager) getContext().getSystemService("captioning")).getUserStyle();
        if (C08M.A00 >= 21) {
            return new AnonymousClass112(userStyle.hasForegroundColor() ? userStyle.foregroundColor : AnonymousClass112.A06.A03, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : AnonymousClass112.A06.A00, userStyle.hasWindowColor() ? userStyle.windowColor : AnonymousClass112.A06.A04, userStyle.hasEdgeType() ? userStyle.edgeType : AnonymousClass112.A06.A02, userStyle.hasEdgeColor() ? userStyle.edgeColor : AnonymousClass112.A06.A01, userStyle.getTypeface());
        }
        return new AnonymousClass112(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        if (this.A04 == z) {
            return;
        }
        this.A04 = z;
        invalidate();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        if (this.A05 == z && this.A04 == z) {
            return;
        }
        this.A05 = z;
        this.A04 = z;
        invalidate();
    }

    public void setBottomPaddingFraction(float f) {
        if (this.A00 == f) {
            return;
        }
        this.A00 = f;
        invalidate();
    }

    public void setCues(List list) {
        if (this.A03 == list) {
            return;
        }
        this.A03 = list;
        int size = list == null ? 0 : list.size();
        while (true) {
            List list2 = this.A06;
            if (list2.size() < size) {
                list2.add(new C222911v(getContext()));
            } else {
                invalidate();
                return;
            }
        }
    }

    public void setFractionalTextSize(float f) {
        if (this.A01 != f) {
            this.A01 = f;
            invalidate();
        }
    }

    public void setStyle(AnonymousClass112 anonymousClass112) {
        if (this.A02 == anonymousClass112) {
            return;
        }
        this.A02 = anonymousClass112;
        invalidate();
    }
}
