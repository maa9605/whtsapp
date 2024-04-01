package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.3rM  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C82963rM implements InterfaceC70493Sm {
    public int A00;
    public int A02;
    public AbstractC461425c A04;
    public C82953rL A05;
    public ArrayList A06;
    public final Context A07;
    public final View A08;
    public final LinearLayoutManager A09;
    public final RecyclerView A0A;
    public final C002301c A0B;
    public final HashMap A0C = new HashMap();
    public long A03 = 0;
    public int A01 = -1;

    public C82963rM(Context context, C002301c c002301c, View view) {
        this.A07 = context;
        this.A0B = c002301c;
        this.A08 = view.findViewById(R.id.sticker_picker_header);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.sticker_header_recycler);
        this.A0A = recyclerView;
        recyclerView.A0i = false;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        this.A09 = linearLayoutManager;
        linearLayoutManager.A1Y(0);
        this.A0A.setLayoutManager(this.A09);
        C38551oa c38551oa = new C38551oa() { // from class: X.3yk
            @Override // X.C38551oa, X.C0TQ
            public boolean A0C(C0TS c0ts, int i, int i2, int i3, int i4) {
                if (!(c0ts instanceof C82923rI) || ((C82923rI) c0ts).A00) {
                    return super.A0C(c0ts, i, i2, i3, i4);
                }
                return false;
            }
        };
        ((C0TQ) c38551oa).A00 = false;
        this.A0A.setItemAnimator(c38551oa);
        this.A09.A1i(c002301c.A0N());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[LOOP:0: B:23:0x0063->B:24:0x0065, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A00(X.AbstractC461525e[] r9) {
        /*
            r8 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r7 = r9.length
            r4 = 0
            if (r7 <= 0) goto L7c
            r1 = r9[r4]
            boolean r0 = r1 instanceof X.C86493xd
            if (r0 == 0) goto L7c
            java.lang.String r1 = r1.getId()
            X.3YJ r0 = new X.3YJ
            r0.<init>(r4, r1)
            r3.add(r0)
            r6 = 1
        L1c:
            if (r6 >= r7) goto L32
            r1 = r9[r6]
            boolean r0 = r1 instanceof X.C25d
            if (r0 == 0) goto L32
            java.lang.String r1 = r1.getId()
            X.3YJ r0 = new X.3YJ
            r0.<init>(r6, r1)
            r3.add(r0)
            int r6 = r6 + 1
        L32:
            if (r6 >= r7) goto L48
            r1 = r9[r6]
            boolean r0 = r1 instanceof X.C2IX
            if (r0 == 0) goto L48
            java.lang.String r1 = r1.getId()
            X.3YJ r0 = new X.3YJ
            r0.<init>(r6, r1)
            r3.add(r0)
            int r6 = r6 + 1
        L48:
            r5 = -1
            if (r6 >= r7) goto L72
            r0 = r9[r6]
            boolean r0 = r0 instanceof X.C86503xe
            if (r0 == 0) goto L72
            X.3rH r1 = new X.3rH
            r1.<init>(r6)
            int r0 = r8.A02
            r2 = 0
            if (r0 != r5) goto L5c
            r2 = 1
        L5c:
            r8.A02 = r6
            r3.add(r1)
            int r6 = r6 + 4
        L63:
            if (r6 >= r7) goto L7e
            r1 = r9[r6]
            X.3YJ r0 = new X.3YJ
            r0.<init>(r6, r1)
            r3.add(r0)
            int r6 = r6 + 1
            goto L63
        L72:
            int r0 = r8.A02
            if (r0 == r5) goto L7a
            r8.A02 = r5
            r2 = 1
            goto L63
        L7a:
            r2 = 0
            goto L63
        L7c:
            r6 = 0
            goto L1c
        L7e:
            androidx.recyclerview.widget.LinearLayoutManager r0 = r8.A09
            boolean r0 = r0.A08
            if (r0 == 0) goto L87
            java.util.Collections.reverse(r3)
        L87:
            java.util.ArrayList r0 = r8.A06
            if (r0 != 0) goto L9b
            X.01c r0 = r8.A0B
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L99
            int r0 = r3.size()
            int r4 = r0 + (-1)
        L99:
            r8.A01 = r4
        L9b:
            r8.A06 = r3
            X.3rL r0 = r8.A05
            if (r0 == 0) goto Lad
            if (r2 != 0) goto Lad
            r0.A01 = r9
            r0.A00 = r3
            X.0S7 r0 = r0.A01
            r0.A00()
            return
        Lad:
            X.3rL r1 = new X.3rL
            r1.<init>(r8, r9, r3)
            r8.A05 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r8.A0A
            r0.setAdapter(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82963rM.A00(X.25e[]):void");
    }

    @Override // X.InterfaceC70493Sm
    public View ADr() {
        return this.A08;
    }

    @Override // X.InterfaceC70493Sm
    public void AMi(int i) {
        int i2;
        int i3;
        int i4 = this.A00;
        if (i != i4) {
            ArrayList arrayList = this.A06;
            if (arrayList != null) {
                i2 = 0;
                while (i2 < arrayList.size()) {
                    if (((C3YJ) arrayList.get(i2)).A00(i4)) {
                        break;
                    }
                    i2++;
                }
            }
            i2 = -1;
            this.A00 = i;
            if (this.A05 != null) {
                ArrayList arrayList2 = this.A06;
                if (arrayList2 != null) {
                    i3 = 0;
                    while (i3 < arrayList2.size()) {
                        if (((C3YJ) arrayList2.get(i3)).A00(i)) {
                            break;
                        }
                        i3++;
                    }
                }
                i3 = -1;
                if (i3 != i2) {
                    LinearLayoutManager linearLayoutManager = this.A09;
                    int A1F = linearLayoutManager.A1F();
                    int A1H = linearLayoutManager.A1H();
                    int i5 = A1H - A1F;
                    if (this.A0B.A0N() && this.A02 != -1) {
                        View A0H = linearLayoutManager.A0H(linearLayoutManager.A0A() - 1);
                        int i6 = this.A02;
                        if (A1H < i6 && i3 < i6) {
                            this.A0A.clearChildFocus(A0H);
                        } else {
                            this.A0A.requestChildFocus(A0H, A0H);
                        }
                    }
                    int i7 = (i5 << 1) / 5;
                    int i8 = i3 - i7;
                    if (i8 < A1F) {
                        if (i8 < 0) {
                            i8 = 0;
                        }
                        final Context context = this.A08.getContext();
                        C1UM c1um = new C1UM(context) { // from class: X.3xb
                            @Override // X.C1UM
                            public float A04(DisplayMetrics displayMetrics) {
                                return 40.0f / TypedValue.applyDimension(1, 40.0f, displayMetrics);
                            }
                        };
                        ((AbstractC15270oM) c1um).A00 = i8;
                        linearLayoutManager.A0W(c1um);
                    } else {
                        int i9 = i3 + i7;
                        if (i9 > A1H) {
                            if (i9 >= linearLayoutManager.A0B()) {
                                i9 = linearLayoutManager.A0B() - 1;
                            }
                            final Context context2 = this.A08.getContext();
                            C1UM c1um2 = new C1UM(context2) { // from class: X.3xb
                                @Override // X.C1UM
                                public float A04(DisplayMetrics displayMetrics) {
                                    return 40.0f / TypedValue.applyDimension(1, 40.0f, displayMetrics);
                                }
                            };
                            ((AbstractC15270oM) c1um2).A00 = i9;
                            linearLayoutManager.A0W(c1um2);
                        }
                    }
                }
                ((AbstractC04890Mh) this.A05).A01.A00();
            }
        }
    }

    @Override // X.InterfaceC70493Sm
    public void ASt(AbstractC461425c abstractC461425c) {
        this.A04 = abstractC461425c;
        if (abstractC461425c != null) {
            AMi(abstractC461425c.A00());
        }
    }
}
