package X;

import android.content.DialogInterface;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* renamed from: X.4DI  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4DI extends AbstractView$OnClickListenerC49532Ky {
    public final /* synthetic */ C4KJ A00;

    public C4DI(C4KJ c4kj) {
        this.A00 = c4kj;
    }

    @Override // X.AbstractView$OnClickListenerC49532Ky
    public void A00(View view) {
        C4KJ c4kj = this.A00;
        C019208x c019208x = new C019208x(c4kj);
        c019208x.A01.A0E = c4kj.getBaseContext().getString(R.string.dyi_export_report_dialog);
        c019208x.A04(R.string.cancel, null);
        c019208x.A06(R.string.dyi_export_report_diablog_positive_label, new DialogInterface.OnClickListener() { // from class: X.3Oi
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C4DI.this.A01();
            }
        });
        DialogInterfaceC019408z A00 = c019208x.A00();
        A00.show();
        c4kj.A1Q(A00);
    }

    public void A01() {
        C92074Hk c92074Hk = this.A00.A0P;
        if (c92074Hk != null) {
            Log.i("DyiViewModel/export-report");
            c92074Hk.A07.AS1(new C3RT(c92074Hk));
            return;
        }
        throw null;
    }
}
