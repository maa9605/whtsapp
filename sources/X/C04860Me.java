package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.google.android.search.verification.client.R;

/* renamed from: X.0Me */
/* loaded from: classes.dex */
public class C04860Me extends ImageButton implements InterfaceC02710Co, InterfaceC04870Mf {
    public final C07980aP A00;
    public final C08600bl A01;

    public C04860Me(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public C04860Me(Context context, AttributeSet attributeSet, int i) {
        super(C07970aO.A00(context), attributeSet, i);
        C07980aP c07980aP = new C07980aP(this);
        this.A00 = c07980aP;
        c07980aP.A08(attributeSet, i);
        C08600bl c08600bl = new C08600bl(this);
        this.A01 = c08600bl;
        c08600bl.A02(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            c07980aP.A02();
        }
        C08600bl c08600bl = this.A01;
        if (c08600bl != null) {
            c08600bl.A00();
        }
    }

    @Override // X.InterfaceC02710Co
    public ColorStateList getSupportBackgroundTintList() {
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            return c07980aP.A00();
        }
        return null;
    }

    @Override // X.InterfaceC02710Co
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            return c07980aP.A01();
        }
        return null;
    }

    @Override // X.InterfaceC04870Mf
    public ColorStateList getSupportImageTintList() {
        C08020aT c08020aT;
        C08600bl c08600bl = this.A01;
        if (c08600bl == null || (c08020aT = c08600bl.A00) == null) {
            return null;
        }
        return c08020aT.A00;
    }

    @Override // X.InterfaceC04870Mf
    public PorterDuff.Mode getSupportImageTintMode() {
        C08020aT c08020aT;
        C08600bl c08600bl = this.A01;
        if (c08600bl == null || (c08020aT = c08600bl.A00) == null) {
            return null;
        }
        return c08020aT.A01;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.A01.A03() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            c07980aP.A03();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            c07980aP.A04(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C08600bl c08600bl = this.A01;
        if (c08600bl != null) {
            c08600bl.A00();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C08600bl c08600bl = this.A01;
        if (c08600bl != null) {
            c08600bl.A00();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.A01.A01(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C08600bl c08600bl = this.A01;
        if (c08600bl != null) {
            c08600bl.A00();
        }
    }

    @Override // X.InterfaceC02710Co
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            c07980aP.A06(colorStateList);
        }
    }

    @Override // X.InterfaceC02710Co
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            c07980aP.A07(mode);
        }
    }

    @Override // X.InterfaceC04870Mf
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C08600bl c08600bl = this.A01;
        if (c08600bl != null) {
            C08020aT c08020aT = c08600bl.A00;
            if (c08020aT == null) {
                c08020aT = new C08020aT();
                c08600bl.A00 = c08020aT;
            }
            c08020aT.A00 = colorStateList;
            c08020aT.A02 = true;
            c08600bl.A00();
        }
    }

    @Override // X.InterfaceC04870Mf
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C08600bl c08600bl = this.A01;
        if (c08600bl != null) {
            C08020aT c08020aT = c08600bl.A00;
            if (c08020aT == null) {
                c08020aT = new C08020aT();
                c08600bl.A00 = c08020aT;
            }
            c08020aT.A01 = mode;
            c08020aT.A03 = true;
            c08600bl.A00();
        }
    }
}
