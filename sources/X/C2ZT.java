package X;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;
import com.whatsapp.usernotice.UserNoticeBannerIconView;
import com.whatsapp.usernotice.UserNoticeModalIconView;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.2ZT  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2ZT extends C2ZU {
    public C83583sM A00;
    public InterfaceC002901k A01;

    public abstract int getTargetIconSize();

    public C2ZT(final Context context, final AttributeSet attributeSet) {
        new WaImageView(context, attributeSet) { // from class: X.2ZU
            public boolean A00;

            {
                A00();
            }

            @Override // X.AbstractC08140aj
            public void A00() {
                if (this instanceof C2ZW) {
                    C2ZW c2zw = (C2ZW) this;
                    if (c2zw.A00) {
                        return;
                    }
                    c2zw.A00 = true;
                    ((AbstractC07960aN) c2zw.generatedComponent()).A2u((UserNoticeModalIconView) c2zw);
                } else if (!(this instanceof C2ZS)) {
                    if (this.A00) {
                        return;
                    }
                    this.A00 = true;
                    ((AbstractC07960aN) generatedComponent()).A2t((C2ZT) this);
                } else {
                    C2ZS c2zs = (C2ZS) this;
                    if (c2zs.A00) {
                        return;
                    }
                    c2zs.A00 = true;
                    ((AbstractC07960aN) c2zs.generatedComponent()).A2s((UserNoticeBannerIconView) c2zs);
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0HS, X.3sM] */
    public void A02(final C40801st c40801st) {
        setContentDescription(c40801st.A02);
        C83583sM c83583sM = this.A00;
        if (c83583sM != null) {
            c83583sM.A05(true);
        }
        if (c40801st.A00(getContext()) == null) {
            A03(c40801st);
            return;
        }
        ?? r4 = new C0HS(this, c40801st) { // from class: X.3sM
            public final int A00;
            public final C40801st A01;
            public final WeakReference A02;

            {
                this.A01 = c40801st;
                this.A02 = new WeakReference(this);
                this.A00 = this.getTargetIconSize();
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                View view;
                File[] fileArr = (File[]) objArr;
                if (fileArr == null || fileArr.length == 0 || (view = (View) this.A02.get()) == null) {
                    return null;
                }
                File file = fileArr[0];
                int i = this.A00;
                return new BitmapDrawable(view.getResources(), C002701i.A0L(file, new C0DH(i, i)).A02);
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                Drawable drawable = (Drawable) obj;
                C2ZT c2zt = (C2ZT) this.A02.get();
                if (c2zt != null) {
                    if (drawable == null) {
                        c2zt.A03(this.A01);
                    } else if (!(c2zt instanceof UserNoticeModalIconView)) {
                        c2zt.clearColorFilter();
                        c2zt.setImageDrawable(drawable);
                    } else {
                        UserNoticeModalIconView userNoticeModalIconView = (UserNoticeModalIconView) c2zt;
                        userNoticeModalIconView.setBackground(null);
                        userNoticeModalIconView.setImageDrawable(drawable);
                        userNoticeModalIconView.A00.setVisibility(8);
                    }
                }
            }
        };
        this.A00 = r4;
        this.A01.ARy(r4, c40801st.A00(getContext()));
    }

    public void A03(C40801st c40801st) {
        int i;
        if (!(this instanceof UserNoticeModalIconView)) {
            if (!(c40801st instanceof C2AC)) {
                setColorFilter(getResources().getColor(R.color.user_notice_icon_tint));
                i = R.drawable.user_notice_banner_icon;
            } else {
                i = R.drawable.ga_banner;
            }
            setImageResource(i);
            return;
        }
        UserNoticeModalIconView userNoticeModalIconView = (UserNoticeModalIconView) this;
        userNoticeModalIconView.setBackground(C02160Ac.A03(userNoticeModalIconView.getContext(), R.drawable.user_notice_modal_default_icon_background));
        userNoticeModalIconView.A00.setImageResource(R.drawable.user_notice_banner_icon);
        userNoticeModalIconView.A00.setColorFilter(userNoticeModalIconView.getResources().getColor(R.color.user_notice_icon_tint));
        userNoticeModalIconView.A00.setVisibility(0);
    }
}
