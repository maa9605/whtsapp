package X;

import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.status.playback.MyStatusesActivity;

/* renamed from: X.2jL  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C54782jL extends AbstractC53042bn {
    public final /* synthetic */ MyStatusesActivity A00;

    public C54782jL(MyStatusesActivity myStatusesActivity) {
        this.A00 = myStatusesActivity;
    }

    @Override // X.AbstractC53042bn, android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MyStatusesActivity myStatusesActivity = this.A00;
        if (myStatusesActivity.A0u.isEmpty()) {
            super.onItemClick(adapterView, view, i, j);
        } else {
            myStatusesActivity.A1U((AnonymousClass092) myStatusesActivity.A0f.A00.get(i), view);
        }
    }
}
