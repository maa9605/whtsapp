package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: X.0by */
/* loaded from: classes.dex */
public final class C08730by extends Drawable.ConstantState {
    public int A00;
    public ColorStateList A01 = null;
    public PorterDuff.Mode A02;
    public Drawable.ConstantState A03;

    public C08730by(C08730by c08730by) {
        this.A02 = C0Y4.A06;
        if (c08730by != null) {
            this.A00 = c08730by.A00;
            this.A03 = c08730by.A03;
            this.A02 = c08730by.A02;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = this.A00;
        Drawable.ConstantState constantState = this.A03;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C0Y3(this, resources);
        }
        return new C0Y4(this, resources);
    }
}
