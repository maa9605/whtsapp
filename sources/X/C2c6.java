package X;

import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.voipcalling.CallsFragment;

/* renamed from: X.2c6  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2c6 extends AbstractC53042bn {
    public final /* synthetic */ CallsFragment A00;

    public C2c6(CallsFragment callsFragment) {
        this.A00 = callsFragment;
    }

    @Override // X.AbstractC53042bn, android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (this.A00.A01 == null) {
            super.onItemClick(adapterView, view, i, j);
        } else {
            A00(adapterView, view, i, j);
        }
    }
}
