package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.08A  reason: invalid class name */
/* loaded from: classes.dex */
public class C08A extends AbstractC016307p {
    public static C08C A07 = new C08C() { // from class: X.1Yc
        @Override // X.C08C
        public void A5g(Context context, Object obj, Object obj2, Object obj3) {
            ((View) obj).setBackground(((C08A) obj2).A03);
        }

        @Override // X.C08C
        public boolean AUY(Object obj, Object obj2, Object obj3, Object obj4) {
            Drawable drawable = ((C08A) obj).A03;
            Drawable drawable2 = ((C08A) obj2).A03;
            return drawable == null ? drawable2 != null : (drawable2 == null || drawable.equals(drawable2)) ? false : true;
        }

        @Override // X.C08C
        public void AVh(Context context, Object obj, Object obj2, Object obj3) {
            ((View) obj).setBackground(null);
        }
    };
    public static C08C A08 = new C08C() { // from class: X.1Yd
        @Override // X.C08C
        public void A5g(Context context, Object obj, Object obj2, Object obj3) {
            ((C1YV) obj).setForegroundCompat(((C08A) obj2).A04);
        }

        @Override // X.C08C
        public boolean AUY(Object obj, Object obj2, Object obj3, Object obj4) {
            Drawable drawable = ((C08A) obj).A04;
            Drawable drawable2 = ((C08A) obj2).A04;
            return drawable == null ? drawable2 != null : (drawable2 == null || drawable.equals(drawable2)) ? false : true;
        }

        @Override // X.C08C
        public void AVh(Context context, Object obj, Object obj2, Object obj3) {
            ((C1YV) obj).setForegroundCompat(null);
        }
    };
    public static C08C A09 = new C08C() { // from class: X.1Ye
        @Override // X.C08C
        public void A5g(Context context, Object obj, Object obj2, Object obj3) {
            ((View) obj).setLayerType(((C08A) obj2).A01, null);
        }

        @Override // X.C08C
        public boolean AUY(Object obj, Object obj2, Object obj3, Object obj4) {
            return ((C08A) obj).A01 != ((C08A) obj2).A01;
        }

        @Override // X.C08C
        public void AVh(Context context, Object obj, Object obj2, Object obj3) {
            ((View) obj).setLayerType(0, null);
        }
    };
    public static C08C A0A = new C08C() { // from class: X.1Yf
        @Override // X.C08C
        public void A5g(Context context, Object obj, Object obj2, Object obj3) {
            C1YV c1yv = (C1YV) obj;
            C08A c08a = (C08A) obj2;
            if (c08a != null) {
                c1yv.setOnTouchListener(null);
                c1yv.A02 = null;
                View.OnClickListener onClickListener = c08a.A05;
                if (onClickListener != null) {
                    c1yv.setOnClickListener(onClickListener);
                }
                c1yv.setOnFocusChangeListener(null);
                c1yv.setFocusable(false);
                c1yv.setFocusableInTouchMode(false);
                c1yv.setEnabled(c08a.A06);
                if (c08a.A00 != -1) {
                    c1yv.setClickable(false);
                    return;
                }
                return;
            }
            throw null;
        }

        @Override // X.C08C
        public boolean AUY(Object obj, Object obj2, Object obj3, Object obj4) {
            return true;
        }

        @Override // X.C08C
        public void AVh(Context context, Object obj, Object obj2, Object obj3) {
            C1YV c1yv = (C1YV) obj;
            c1yv.setOnTouchListener(null);
            c1yv.A02 = null;
            c1yv.setOnClickListener(null);
            c1yv.setClickable(false);
            c1yv.setOnLongClickListener(null);
            c1yv.setLongClickable(false);
            c1yv.setOnFocusChangeListener(null);
            c1yv.setFocusable(false);
            c1yv.setFocusableInTouchMode(false);
        }
    };
    public int A00;
    public int A01;
    public long A02;
    public Drawable A03;
    public Drawable A04;
    public View.OnClickListener A05;
    public boolean A06;

    public C08A(long j) {
        super(EnumC20560xj.VIEW);
        this.A01 = 0;
        this.A00 = -1;
        this.A06 = true;
        this.A02 = j;
        C08D[] c08dArr = {new C08D(this, A07), new C08D(this, A08), new C08D(this, A0A), new C08D(this, A09)};
        for (int i = 0; i < 4; i++) {
            A06(c08dArr[i]);
        }
    }

    @Override // X.AbstractC016307p
    public long A04() {
        return this.A02;
    }

    @Override // X.AbstractC016307p
    /* renamed from: A08 */
    public C1YV A07(Context context) {
        return new C1YV(context);
    }
}
