package X;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1UZ */
/* loaded from: classes.dex */
public class C1UZ extends C0AS {
    public final C0AS A00 = new C0AS(this) { // from class: X.1UY
        public final C1UZ A00;

        {
            this.A00 = this;
        }

        @Override // X.C0AS
        public void A04(View view, C08420bS c08420bS) {
            C0SV c0sv;
            this.A01.onInitializeAccessibilityNodeInfo(view, c08420bS.A02);
            C1UZ c1uz = this.A00;
            if (c1uz.A07() || (c0sv = c1uz.A01.A0S) == null) {
                return;
            }
            c0sv.A0Q(view, c08420bS);
        }

        @Override // X.C0AS
        public boolean A05(View view, int i, Bundle bundle) {
            if (super.A05(view, i, bundle)) {
                return true;
            }
            C1UZ c1uz = this.A00;
            return (c1uz.A07() || c1uz.A01.A0S != null) ? false : false;
        }
    };
    public final RecyclerView A01;

    public C1UZ(RecyclerView recyclerView) {
        this.A01 = recyclerView;
    }

    @Override // X.C0AS
    public void A02(View view, AccessibilityEvent accessibilityEvent) {
        C0SV c0sv;
        super.A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if (!(view instanceof RecyclerView) || A07() || (c0sv = ((RecyclerView) view).A0S) == null) {
            return;
        }
        c0sv.A0y(accessibilityEvent);
    }

    @Override // X.C0AS
    public void A04(View view, C08420bS c08420bS) {
        C0SV c0sv;
        C13230ko c13230ko;
        View.AccessibilityDelegate accessibilityDelegate = super.A01;
        AccessibilityNodeInfo accessibilityNodeInfo = c08420bS.A02;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(RecyclerView.class.getName());
        if (A07() || (c0sv = this.A01.A0S) == null) {
            return;
        }
        RecyclerView recyclerView = c0sv.A07;
        C15230oI c15230oI = recyclerView.A0x;
        C0Y0 c0y0 = recyclerView.A0z;
        if (recyclerView.canScrollVertically(-1) || c0sv.A07.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (c0sv.A07.canScrollVertically(1) || c0sv.A07.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        int A0f = c0sv.A0f(c15230oI, c0y0);
        int A0e = c0sv.A0e(c15230oI, c0y0);
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            c13230ko = new C13230ko(AccessibilityNodeInfo.CollectionInfo.obtain(A0f, A0e, false, 0));
        } else if (i >= 19) {
            c13230ko = new C13230ko(AccessibilityNodeInfo.CollectionInfo.obtain(A0f, A0e, false));
        } else {
            c13230ko = new C13230ko(null);
        }
        c08420bS.A09(c13230ko);
    }

    @Override // X.C0AS
    public boolean A05(View view, int i, Bundle bundle) {
        C0SV c0sv;
        RecyclerView recyclerView;
        int i2;
        int A0D;
        if (super.A05(view, i, bundle)) {
            return true;
        }
        if (A07() || (c0sv = this.A01.A0S) == null || (recyclerView = c0sv.A07) == null) {
            return false;
        }
        if (i == 4096) {
            if (recyclerView.canScrollVertically(1)) {
                i2 = (c0sv.A00 - c0sv.A0F()) - c0sv.A0C();
            } else {
                i2 = 0;
            }
            if (c0sv.A07.canScrollHorizontally(1)) {
                A0D = (c0sv.A03 - c0sv.A0D()) - c0sv.A0E();
            }
            A0D = 0;
        } else if (i != 8192) {
            return false;
        } else {
            if (recyclerView.canScrollVertically(-1)) {
                i2 = -((c0sv.A00 - c0sv.A0F()) - c0sv.A0C());
            } else {
                i2 = 0;
            }
            if (c0sv.A07.canScrollHorizontally(-1)) {
                A0D = -((c0sv.A03 - c0sv.A0D()) - c0sv.A0E());
            }
            A0D = 0;
        }
        if (i2 == 0 && A0D == 0) {
            return false;
        }
        c0sv.A07.A0d(A0D, i2);
        return true;
    }

    public C0AS A06() {
        return this.A00;
    }

    public boolean A07() {
        RecyclerView recyclerView = this.A01;
        if (recyclerView.A0h && !recyclerView.A0e) {
            if (!(recyclerView.A0J.A04.size() > 0)) {
                return false;
            }
        }
        return true;
    }
}
