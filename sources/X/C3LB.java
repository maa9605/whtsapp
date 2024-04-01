package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.3LB  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3LB extends AbstractC35271is {
    public AnonymousClass311 A00;
    public final /* synthetic */ MediaViewBaseFragment A01;

    @Override // X.C0ZT
    public CharSequence A03(int i) {
        return "";
    }

    public C3LB(MediaViewBaseFragment mediaViewBaseFragment, AnonymousClass311 anonymousClass311) {
        this.A01 = mediaViewBaseFragment;
        this.A00 = anonymousClass311;
    }

    @Override // X.C0ZT
    public void A08(ViewGroup viewGroup) {
        this.A00.AKX();
    }

    @Override // X.C0ZT
    public int A0B() {
        return this.A00.getCount();
    }

    @Override // X.AbstractC35271is
    public int A0F(Object obj) {
        Object obj2;
        C0FK c0fk = (C0FK) obj;
        if (c0fk.A00 == null || (obj2 = c0fk.A01) == null) {
            return -2;
        }
        return this.A00.ACV(obj2);
    }

    @Override // X.AbstractC35271is
    public Object A0G(ViewGroup viewGroup, int i) {
        C0FK A70 = this.A00.A70(i);
        Object obj = A70.A00;
        if (obj != null) {
            View view = (View) obj;
            Object obj2 = A70.A01;
            if (MediaViewBaseFragment.A0H) {
                this.A01.A18(view);
            }
            view.setTag(obj2);
            viewGroup.addView(view, 0);
        }
        return A70;
    }

    @Override // X.AbstractC35271is
    public void A0I(ViewGroup viewGroup, int i, Object obj) {
        Object obj2 = ((C0FK) obj).A00;
        if (obj2 != null) {
            View view = (View) obj2;
            viewGroup.removeView(view);
            PhotoView.A00(view);
        }
        this.A00.A7C(i);
    }

    @Override // X.AbstractC35271is
    public boolean A0J(View view, Object obj) {
        return view == ((C0FK) obj).A00;
    }
}
