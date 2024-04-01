package X;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* renamed from: X.0Xy  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07370Xy {
    public int A00;
    public final ColorStateList A01;
    public final Shader A02;

    public C07370Xy(Shader shader, ColorStateList colorStateList, int i) {
        this.A02 = shader;
        this.A01 = colorStateList;
        this.A00 = i;
    }

    public boolean A00() {
        ColorStateList colorStateList;
        return this.A02 == null && (colorStateList = this.A01) != null && colorStateList.isStateful();
    }
}
