package X;

import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1oW  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38541oW extends C1UZ {
    public final C0AS A00;
    public final C0AS A01;
    public final RecyclerView A02;

    public C38541oW(RecyclerView recyclerView) {
        super(recyclerView);
        this.A00 = ((C1UZ) this).A00;
        this.A01 = new C0AS() { // from class: X.1U2
            @Override // X.C0AS
            public void A04(View view, C08420bS c08420bS) {
                Preference A0G;
                C38541oW c38541oW = C38541oW.this;
                c38541oW.A00.A04(view, c08420bS);
                int A00 = RecyclerView.A00(view);
                AbstractC04890Mh abstractC04890Mh = c38541oW.A02.A0N;
                if ((abstractC04890Mh instanceof C1U1) && (A0G = ((C1U1) abstractC04890Mh).A0G(A00)) != null) {
                    A0G.A0G(c08420bS);
                }
            }

            @Override // X.C0AS
            public boolean A05(View view, int i, Bundle bundle) {
                return C38541oW.this.A00.A05(view, i, bundle);
            }
        };
        this.A02 = recyclerView;
    }

    @Override // X.C1UZ
    public C0AS A06() {
        return this.A01;
    }
}
