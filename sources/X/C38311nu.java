package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

/* renamed from: X.1nu */
/* loaded from: classes.dex */
public class C38311nu extends AbstractC28381Ro {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Drawable A05;
    public C1S0 A06;
    public C1S1 A07;
    public RunnableC10970gx A08;
    public C38301nt A09;
    public C1S3 A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final SparseBooleanArray A0F;
    public final C1S4 A0G;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1S4] */
    public C38311nu(Context context) {
        super(context);
        this.A0F = new SparseBooleanArray();
        this.A0G = new C0VF() { // from class: X.1S4
            {
                C38311nu.this = this;
            }

            @Override // X.C0VF
            public void AIe(C06650Uk c06650Uk, boolean z) {
                if (c06650Uk instanceof SubMenuC38291ns) {
                    c06650Uk.A01().A0F(false);
                }
                C0VF c0vf = ((AbstractC28381Ro) C38311nu.this).A06;
                if (c0vf != null) {
                    c0vf.AIe(c06650Uk, z);
                }
            }

            @Override // X.C0VF
            public boolean AMY(C06650Uk c06650Uk) {
                if (c06650Uk == null) {
                    return false;
                }
                C38311nu c38311nu = C38311nu.this;
                c38311nu.A03 = ((SubMenuC38291ns) c06650Uk).A01.A0R;
                C0VF c0vf = ((AbstractC28381Ro) c38311nu).A06;
                if (c0vf != null) {
                    return c0vf.AMY(c06650Uk);
                }
                return false;
            }
        };
    }

    @Override // X.AbstractC28381Ro
    public View A00(C28421Rt c28421Rt, View view, ViewGroup viewGroup) {
        View actionView = c28421Rt.getActionView();
        if (actionView == null || c28421Rt.A02()) {
            actionView = super.A00(c28421Rt, view, viewGroup);
        }
        actionView.setVisibility(c28421Rt.A0N ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public boolean A01() {
        InterfaceC06630Ui interfaceC06630Ui;
        RunnableC10970gx runnableC10970gx = this.A08;
        if (runnableC10970gx != null && (interfaceC06630Ui = super.A07) != null) {
            ((View) interfaceC06630Ui).removeCallbacks(runnableC10970gx);
            this.A08 = null;
            return true;
        }
        C1S3 c1s3 = this.A0A;
        if (c1s3 != null) {
            c1s3.A01();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x000d, code lost:
        if (r0.AFo() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A02() {
        /*
            r2 = this;
            X.1S3 r0 = r2.A0A
            if (r0 == 0) goto L13
            X.1Rx r0 = r0.A03
            if (r0 == 0) goto Lf
            boolean r0 = r0.AFo()
            r1 = 1
            if (r0 != 0) goto L10
        Lf:
            r1 = 0
        L10:
            r0 = 1
            if (r1 != 0) goto L14
        L13:
            r0 = 0
        L14:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38311nu.A02():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.1S3] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0gx, java.lang.Runnable] */
    public boolean A03() {
        C06650Uk c06650Uk;
        if (!this.A0D || A02() || (c06650Uk = super.A05) == null || super.A07 == null || this.A08 != null) {
            return false;
        }
        c06650Uk.A05();
        if (c06650Uk.A08.isEmpty()) {
            return false;
        }
        ?? r1 = new Runnable(new C10860gl(super.A02, super.A05, this.A09) { // from class: X.1S3
            {
                C38311nu.this = this;
                super.A00 = 8388613;
                C1S4 c1s4 = this.A0G;
                this.A04 = c1s4;
                C1Rx c1Rx = this.A03;
                if (c1Rx != null) {
                    c1Rx.ASo(c1s4);
                }
            }

            @Override // X.C10860gl
            public void A02() {
                C38311nu c38311nu = C38311nu.this;
                C06650Uk c06650Uk2 = ((AbstractC28381Ro) c38311nu).A05;
                if (c06650Uk2 != null) {
                    c06650Uk2.A0F(true);
                }
                c38311nu.A0A = null;
                super.A02();
            }
        }) { // from class: X.0gx
            public C1S3 A00;

            {
                C38311nu.this = this;
                this.A00 = r2;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0CO c0co;
                C38311nu c38311nu = C38311nu.this;
                C06650Uk c06650Uk2 = ((AbstractC28381Ro) c38311nu).A05;
                if (c06650Uk2 != null && (c0co = c06650Uk2.A03) != null) {
                    c0co.AM2(c06650Uk2);
                }
                View view = (View) ((AbstractC28381Ro) c38311nu).A07;
                if (view != null && view.getWindowToken() != null && A04()) {
                    c38311nu.A0A = this.A00;
                }
                c38311nu.A08 = null;
            }
        };
        this.A08 = r1;
        ((View) super.A07).post(r1);
        super.APD(null);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x00ed, code lost:
        if (r15 != 0) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0VC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A7r() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38311nu.A7r():boolean");
    }

    @Override // X.C0VC
    public void AEt(Context context, C06650Uk c06650Uk) {
        super.A02 = context;
        LayoutInflater.from(context);
        super.A05 = c06650Uk;
        Resources resources = context.getResources();
        if (!this.A0E) {
            this.A0D = Build.VERSION.SDK_INT < 19 ? true ^ ViewConfiguration.get(context).hasPermanentMenuKey() : true;
        }
        int i = 2;
        this.A04 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.A01 = i;
        int i4 = this.A04;
        if (this.A0D) {
            if (this.A09 == null) {
                C38301nt c38301nt = new C38301nt(this, super.A03);
                this.A09 = c38301nt;
                if (this.A0C) {
                    c38301nt.setImageDrawable(this.A05);
                    this.A05 = null;
                    this.A0C = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.A09.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.A09.getMeasuredWidth();
        } else {
            this.A09 = null;
        }
        this.A00 = i4;
        this.A02 = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // X.C0VC
    public void AIe(C06650Uk c06650Uk, boolean z) {
        A01();
        C1S0 c1s0 = this.A06;
        if (c1s0 != null) {
            c1s0.A01();
        }
        C0VF c0vf = super.A06;
        if (c0vf != null) {
            c0vf.AIe(c06650Uk, z);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0gl, X.1S0] */
    @Override // X.AbstractC28381Ro, X.C0VC
    public boolean APD(SubMenuC38291ns subMenuC38291ns) {
        boolean z = false;
        if (subMenuC38291ns.hasVisibleItems()) {
            SubMenuC38291ns subMenuC38291ns2 = subMenuC38291ns;
            while (true) {
                C06650Uk c06650Uk = subMenuC38291ns2.A00;
                if (c06650Uk == super.A05) {
                    break;
                }
                subMenuC38291ns2 = (SubMenuC38291ns) c06650Uk;
            }
            C28421Rt c28421Rt = subMenuC38291ns2.A01;
            ViewGroup viewGroup = (ViewGroup) super.A07;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if (!(childAt instanceof InterfaceC10870gm) || ((InterfaceC10870gm) childAt).getItemData() != c28421Rt) {
                        i++;
                    } else if (childAt != null) {
                        int size = subMenuC38291ns.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                break;
                            }
                            MenuItem item = subMenuC38291ns.getItem(i2);
                            if (item.isVisible() && item.getIcon() != null) {
                                z = true;
                                break;
                            }
                            i2++;
                        }
                        ?? r1 = new C10860gl(super.A02, subMenuC38291ns, childAt) { // from class: X.1S0
                            {
                                C38311nu.this = this;
                                if ((subMenuC38291ns.A01.A02 & 32) != 32) {
                                    View view = this.A09;
                                    this.A01 = view == null ? (View) ((AbstractC28381Ro) this).A07 : view;
                                }
                                C1S4 c1s4 = this.A0G;
                                this.A04 = c1s4;
                                C1Rx c1Rx = this.A03;
                                if (c1Rx != null) {
                                    c1Rx.ASo(c1s4);
                                }
                            }

                            @Override // X.C10860gl
                            public void A02() {
                                C38311nu c38311nu = C38311nu.this;
                                c38311nu.A06 = null;
                                c38311nu.A03 = 0;
                                super.A02();
                            }
                        };
                        this.A06 = r1;
                        r1.A05 = z;
                        C1Rx c1Rx = r1.A03;
                        if (c1Rx != null) {
                            c1Rx.A07(z);
                        }
                        if (r1.A04()) {
                            C0VF c0vf = super.A06;
                            if (c0vf != null) {
                                c0vf.AMY(subMenuC38291ns);
                            }
                            return true;
                        }
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // X.AbstractC28381Ro, X.C0VC
    public void AVo(boolean z) {
        ArrayList arrayList;
        int size;
        super.AVo(z);
        ((View) super.A07).requestLayout();
        C06650Uk c06650Uk = super.A05;
        if (c06650Uk != null) {
            c06650Uk.A05();
            ArrayList arrayList2 = c06650Uk.A06;
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                arrayList2.get(i);
            }
        }
        C06650Uk c06650Uk2 = super.A05;
        if (c06650Uk2 != null) {
            c06650Uk2.A05();
            arrayList = c06650Uk2.A08;
        } else {
            arrayList = null;
        }
        if (this.A0D && arrayList != null && ((size = arrayList.size()) != 1 ? size > 0 : (!((C28421Rt) arrayList.get(0)).A0N))) {
            C38301nt c38301nt = this.A09;
            if (c38301nt == null) {
                c38301nt = new C38301nt(this, super.A03);
                this.A09 = c38301nt;
            }
            ViewGroup viewGroup = (ViewGroup) c38301nt.getParent();
            if (viewGroup != super.A07) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.A09);
                }
                C38301nt c38301nt2 = this.A09;
                C1S6 c1s6 = new C1S6();
                ((C11190hL) c1s6).A01 = 16;
                c1s6.A04 = true;
                ((ViewGroup) super.A07).addView(c38301nt2, c1s6);
            }
        } else {
            C38301nt c38301nt3 = this.A09;
            if (c38301nt3 != null) {
                ViewParent parent = c38301nt3.getParent();
                InterfaceC06630Ui interfaceC06630Ui = super.A07;
                if (parent == interfaceC06630Ui) {
                    ((ViewGroup) interfaceC06630Ui).removeView(this.A09);
                }
            }
        }
        ((ActionMenuView) super.A07).A0B = this.A0D;
    }
}
