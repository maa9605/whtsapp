package X;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2hv */
/* loaded from: classes2.dex */
public class C54022hv extends AbstractC04890Mh {
    public C25P A00;
    public C25P A01;
    public C54012hu A02;
    public C83313rv A03;
    public String A04;
    public List A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final View.OnClickListener A0A;
    public final LinearLayoutManager A0B;
    public final AbstractC000600i A0C;
    public final C018508q A0D;
    public final C01B A0E;
    public final C05W A0F;
    public final C018708s A0G;
    public final C0Zn A0H;
    public final C000400f A0I;
    public final C002301c A0J;
    public final AnonymousClass011 A0K;
    public final C2AR A0L;
    public final C461825l A0M;
    public final InterfaceC002901k A0N;
    public final String A0P;
    public final LinkedHashMap A0Q;
    public List A05 = new ArrayList();
    public final Runnable A0O = new RunnableEBaseShape7S0100000_I0_7(this, 5);

    public C54022hv(C018508q c018508q, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, AnonymousClass011 anonymousClass011, C01B c01b, C05W c05w, C018708s c018708s, C002301c c002301c, C2AR c2ar, C000400f c000400f, LinearLayoutManager linearLayoutManager, C0Zn c0Zn, int i, String str, C461825l c461825l, View.OnClickListener onClickListener) {
        this.A0D = c018508q;
        this.A0C = abstractC000600i;
        this.A0N = interfaceC002901k;
        this.A0K = anonymousClass011;
        this.A0E = c01b;
        this.A0F = c05w;
        this.A0G = c018708s;
        this.A0J = c002301c;
        this.A0L = c2ar;
        this.A0I = c000400f;
        this.A0B = linearLayoutManager;
        this.A0H = c0Zn;
        this.A09 = i;
        this.A0P = str;
        this.A0M = c461825l;
        this.A0A = onClickListener;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A0Q = linkedHashMap;
        linkedHashMap.put(2, Boolean.FALSE);
        this.A0Q.put(1, Boolean.TRUE);
        this.A0Q.put(3, Boolean.FALSE);
        this.A0Q.put(4, Boolean.TRUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x002b, code lost:
        if (A0H() != 0) goto L17;
     */
    @Override // X.AbstractC04890Mh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A0C() {
        /*
            r3 = this;
            int r0 = r3.A0G()
            int r2 = r3.A0H()
            int r2 = r2 + r0
            boolean r0 = r3.A07
            r1 = 0
            if (r0 == 0) goto L21
            boolean r0 = r3.A08
            if (r0 != 0) goto L21
            java.util.List r0 = r3.A05
            int r0 = r0.size()
            if (r0 == 0) goto L20
            int r0 = r3.A0I()
            if (r0 <= 0) goto L21
        L20:
            r1 = 1
        L21:
            int r2 = r2 + r1
            boolean r0 = r3.A08
            if (r0 == 0) goto L2d
            int r1 = r3.A0H()
            r0 = 1
            if (r1 == 0) goto L2e
        L2d:
            r0 = 0
        L2e:
            int r2 = r2 + r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54022hv.A0C():int");
    }

    @Override // X.AbstractC04890Mh
    public int A0D(int i) {
        boolean z;
        int i2 = 0;
        for (Map.Entry entry : this.A0Q.entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                if (i2 == i) {
                    return ((Number) entry.getKey()).intValue();
                }
                i2++;
            }
        }
        boolean z2 = this.A07;
        if (!z2 || (z = this.A08) || !z2 || z || ((this.A05.size() != 0 && A0I() <= 0) || i != A0C() - 1)) {
            return (this.A08 && A0H() == 0) ? 7 : 5;
        }
        return 6;
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        if (i == 1) {
            C83313rv c83313rv = this.A03;
            if (c83313rv == null) {
                C83313rv c83313rv2 = new C83313rv(this.A0C, this.A0J, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.storage_usage_summary_view, viewGroup, false));
                this.A03 = c83313rv2;
                return c83313rv2;
            }
            return c83313rv;
        } else if (i == 2) {
            return new C0TS(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.storage_usage_loading_header, viewGroup, false)) { // from class: X.3ru
            };
        } else {
            if (i == 3) {
                return new C83223rm(this.A0K, this.A0J, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.storage_usage_cleanup_suggestions, viewGroup, false));
            }
            if (i == 4) {
                return new C83203rk(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.storage_usage_chat_search_view, viewGroup, false));
            }
            if (i == 6) {
                return new C83193rj(this.A0J, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.storage_usage_chat_footer_view, viewGroup, false));
            }
            if (i == 7) {
                C86133wu c86133wu = new C86133wu(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_no_result, viewGroup, false));
                c86133wu.A0I(Boolean.TRUE);
                return c86133wu;
            }
            return new C83213rl(this.A0K, this.A0E, this.A0F, this.A0G, this.A0J, this.A0L, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.storage_usage_chat_row_item, viewGroup, false));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x00bc, code lost:
        if (r12.A02.size() < 4) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0108, code lost:
        if (r8.A02.size() < 4) goto L122;
     */
    @Override // X.AbstractC04890Mh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0F(X.C0TS r21, int r22) {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54022hv.A0F(X.0TS, int):void");
    }

    public final int A0G() {
        int i = 0;
        for (Map.Entry entry : this.A0Q.entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    public final int A0H() {
        if (this.A07 && !this.A08) {
            return this.A05.size() - A0I();
        }
        return this.A05.size();
    }

    public final int A0I() {
        Iterator it = this.A05.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C27791Ou) it.next()).A00.A0G == 0) {
                i++;
            }
        }
        return i;
    }

    public final int A0J(int i) {
        int i2 = 0;
        for (Map.Entry entry : this.A0Q.entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                if (((Number) entry.getKey()).intValue() == i) {
                    return i2;
                }
                i2++;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x001a, code lost:
        if (r0.A02.size() < 4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0029, code lost:
        if (r2 < 4) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0K() {
        /*
            r7 = this;
            java.util.LinkedHashMap r6 = r7.A0Q
            r4 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r6.get(r5)
            if (r0 != 0) goto Le
            return
        Le:
            X.25P r0 = r7.A01
            if (r0 == 0) goto L1c
            java.util.List r0 = r0.A02
            int r1 = r0.size()
            r0 = 4
            r3 = 1
            if (r1 >= r0) goto L1d
        L1c:
            r3 = 0
        L1d:
            X.25P r0 = r7.A00
            if (r0 == 0) goto L2b
            java.util.List r0 = r0.A02
            int r2 = r0.size()
            r1 = 4
            r0 = 1
            if (r2 >= r1) goto L2c
        L2b:
            r0 = 0
        L2c:
            if (r3 != 0) goto L41
            if (r0 != 0) goto L41
            java.lang.Object r0 = r6.get(r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L56
            r0 = 0
            r7.A0L(r4, r0)
            return
        L41:
            java.lang.Object r0 = r6.get(r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L56
            boolean r0 = r7.A08
            if (r0 != 0) goto L55
            r0 = 1
            r7.A0L(r4, r0)
        L55:
            return
        L56:
            int r0 = r7.A0J(r4)
            if (r0 < 0) goto L5f
            r7.A02(r0)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54022hv.A0K():void");
    }

    public final void A0L(int i, boolean z) {
        LinkedHashMap linkedHashMap = this.A0Q;
        Integer valueOf = Integer.valueOf(i);
        if (linkedHashMap.get(valueOf) == null || ((Boolean) linkedHashMap.get(valueOf)).booleanValue() == z) {
            return;
        }
        if (z) {
            linkedHashMap.put(valueOf, Boolean.TRUE);
            int A0J = A0J(i);
            A03(A0J);
            if (A0J == 0) {
                LinearLayoutManager linearLayoutManager = this.A0B;
                if (linearLayoutManager.A1F() == 0) {
                    linearLayoutManager.A0u(0);
                    return;
                }
                return;
            }
            return;
        }
        A04(A0J(i));
        linkedHashMap.put(valueOf, Boolean.FALSE);
    }

    public void A0M(boolean z) {
        this.A08 = z;
        int A0I = A0I();
        if (z) {
            A0L(1, false);
            A0L(3, false);
            A0L(4, false);
            super.A01.A04(A0C() - 1, A0I + 1, null);
            return;
        }
        A0L(1, true);
        A0K();
        A0L(4, true);
        super.A01.A04(A0C() - A0I, A0I, null);
    }

    public void A0N(boolean z) {
        C018508q c018508q = this.A0D;
        Runnable runnable = this.A0O;
        Handler handler = c018508q.A02;
        handler.removeCallbacks(runnable);
        if (z) {
            handler.postDelayed(runnable, 1000L);
        } else {
            A0L(2, false);
        }
    }
}
