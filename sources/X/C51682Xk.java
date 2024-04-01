package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2Xk */
/* loaded from: classes2.dex */
public class C51682Xk extends AbstractC51692Xl {
    public Bitmap A00;
    public Drawable A01;
    public Drawable A02;
    public Drawable A03;
    public InterfaceC52102a4 A04;
    public boolean A05;

    public C51682Xk(Context context) {
        super(context);
        Drawable A03 = C02160Ac.A03(context, R.drawable.selector_orange_gradient);
        this.A03 = A03;
        A03.setCallback(this);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.A03;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.A03;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // X.C0S5, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A03;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public InterfaceC52102a4 getMediaItem() {
        return this.A04;
    }

    public Bitmap getThumbnail() {
        return this.A00;
    }

    public Uri getUri() {
        return this.A04.A88();
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A03;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x002d, code lost:
        if (r1 != 1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0030, code lost:
        if (r1 == 3) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0034, code lost:
        if (r3 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0036, code lost:
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0038, code lost:
        if (r0 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x003a, code lost:
        if (r3 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x003c, code lost:
        if (r4 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x003e, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0041, code lost:
        if (r1 == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0045, code lost:
        if (r5.A06 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0047, code lost:
        r5.A06 = r5.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x004d, code lost:
        r15.drawText(X.AnonymousClass029.A0g(r5.A07, r1), (r5.A06.getTextSize() / 3.0f) + r0, r5.getHeight() - (r5.A06.getTextSize() / 3.0f), r5.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01c1, code lost:
        r10 = r5.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01c3, code lost:
        if (r10 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01c5, code lost:
        r10 = X.C02160Ac.A03(r5.getContext(), com.google.android.search.verification.client.R.drawable.mark_gif);
        r5.A01 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01d3, code lost:
        r10 = r5.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01d5, code lost:
        if (r10 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x01d7, code lost:
        r10 = X.C02160Ac.A03(r5.getContext(), com.google.android.search.verification.client.R.drawable.mark_video);
        r5.A05 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01e4, code lost:
        if (r10 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01e6, code lost:
        r6 = r5.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x01e8, code lost:
        if (r6 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x01ea, code lost:
        r6 = X.C02160Ac.A03(r5.getContext(), com.google.android.search.verification.client.R.drawable.gallery_album_overlay);
        r5.A04 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01f7, code lost:
        r6.setBounds(0, r5.getHeight() - (r10.getIntrinsicHeight() << 1), r5.getWidth(), r5.getHeight());
        r5.A04.draw(r15);
        r6 = r10.getIntrinsicHeight() >> 2;
        r10.setBounds(r6, (r5.getHeight() - r10.getIntrinsicHeight()) - r6, r10.getIntrinsicWidth() + r6, r5.getHeight() - r6);
        r10.draw(r15);
        r0 = r10.getIntrinsicWidth() + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0239, code lost:
        r1 = r2.A9q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x023f, code lost:
        r4 = false;
     */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDraw(android.graphics.Canvas r15) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51682Xk.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int defaultSize = ImageView.getDefaultSize(getSuggestedMinimumWidth(), i);
        setMeasuredDimension(defaultSize, defaultSize);
    }

    public void setChecked(boolean z) {
        if (this.A05 != z) {
            this.A05 = z;
            setSelected(z);
            invalidate();
        }
    }

    public void setFrameDrawable(Drawable drawable) {
        this.A02 = drawable;
        invalidate();
    }

    public void setMediaItem(InterfaceC52102a4 interfaceC52102a4) {
        int i;
        this.A04 = interfaceC52102a4;
        if (interfaceC52102a4 != null) {
            int type = interfaceC52102a4.getType();
            if (type == 0) {
                i = R.string.conversations_most_recent_image;
            } else if (type == 1) {
                i = R.string.conversations_most_recent_video;
            } else if (type == 2) {
                i = R.string.conversations_most_recent_gif;
            } else if (type == 3) {
                i = R.string.conversations_most_recent_audio;
            } else if (type != 4) {
                return;
            } else {
                i = R.string.conversations_most_recent_document;
            }
            setContentDescription(getContext().getString(i));
        }
    }

    public void setSelector(Drawable drawable) {
        Drawable drawable2 = this.A03;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.A03 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void setThumbnail(Bitmap bitmap) {
        this.A00 = bitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.A03 || super.verifyDrawable(drawable);
    }
}
