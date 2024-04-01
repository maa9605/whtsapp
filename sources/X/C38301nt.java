package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.search.verification.client.R;

/* renamed from: X.1nt  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38301nt extends C0S5 implements InterfaceC10980gy {
    public final /* synthetic */ C38311nu A00;

    @Override // X.InterfaceC10980gy
    public boolean AGb() {
        return false;
    }

    @Override // X.InterfaceC10980gy
    public boolean AGc() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38301nt(C38311nu c38311nu, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.A00 = c38311nu;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        C07O.A0c(this, getContentDescription());
        setOnTouchListener(new AbstractView$OnTouchListenerC11180hK(this) { // from class: X.1S2
            @Override // X.AbstractView$OnTouchListenerC11180hK
            public InterfaceC10880gn A00() {
                C1S3 c1s3 = C38301nt.this.A00.A0A;
                if (c1s3 == null) {
                    return null;
                }
                return c1s3.A00();
            }

            @Override // X.AbstractView$OnTouchListenerC11180hK
            public boolean A02() {
                C38311nu c38311nu2 = C38301nt.this.A00;
                if (c38311nu2.A08 != null) {
                    return false;
                }
                c38311nu2.A01();
                return true;
            }

            @Override // X.AbstractView$OnTouchListenerC11180hK
            public boolean A03() {
                C38301nt.this.A00.A03();
                return true;
            }
        });
    }

    @Override // android.view.View
    public boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.A00.A03();
        return true;
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) >> 1;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) >> 1;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) >> 1;
            C07O.A0Y(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
