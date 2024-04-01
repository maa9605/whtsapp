package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.3sB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C83473sB implements InterfaceC40241rp {
    public final int A00;
    public final int A01;
    public final Drawable A02;
    public final Drawable A03;
    public final C3ZK A04;
    public final String A05;
    public final String A06;
    public final WeakReference A07;

    @Override // X.InterfaceC40241rp
    public boolean A7k() {
        return false;
    }

    @Override // X.InterfaceC40241rp
    public int A8P() {
        return 1;
    }

    @Override // X.InterfaceC40241rp
    public Integer ABf() {
        return null;
    }

    public C83473sB(String str, String str2, ImageView imageView, Drawable drawable, Drawable drawable2, int i, int i2, C3ZK c3zk) {
        WeakReference weakReference;
        if (imageView != null) {
            weakReference = new WeakReference(imageView);
        } else {
            weakReference = null;
        }
        this.A07 = weakReference;
        this.A06 = str;
        this.A05 = str2;
        this.A03 = drawable;
        this.A02 = drawable2;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = c3zk;
    }

    public ImageView A00() {
        WeakReference weakReference = this.A07;
        if (weakReference != null) {
            return (ImageView) weakReference.get();
        }
        return null;
    }

    @Override // X.InterfaceC40241rp
    public int AB5() {
        return this.A00;
    }

    @Override // X.InterfaceC40241rp
    public int AB7() {
        return this.A01;
    }

    @Override // X.InterfaceC40241rp
    public String ADk() {
        return this.A06;
    }

    @Override // X.InterfaceC40241rp
    public String getId() {
        return this.A05;
    }
}
