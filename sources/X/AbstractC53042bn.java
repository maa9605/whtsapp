package X;

import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.status.Hilt_StatusesFragment;
import com.whatsapp.status.SetStatus;
import com.whatsapp.status.StatusesFragment;
import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.util.Log;
import java.util.Collections;

/* renamed from: X.2bn */
/* loaded from: classes2.dex */
public abstract class AbstractC53042bn implements AdapterView.OnItemClickListener {
    public long A00;

    public void A00(AdapterView adapterView, View view, int i, long j) {
        if (this instanceof C2c6) {
            C2c6 c2c6 = (C2c6) this;
            AbstractC53222c9 abstractC53222c9 = (AbstractC53222c9) view.getTag();
            if (abstractC53222c9 == null) {
                Log.e("voip/CallsFragment/onItemClick/empty");
            } else {
                c2c6.A00.A17(abstractC53222c9.A00, abstractC53222c9);
            }
        } else if (this instanceof C54782jL) {
            MyStatusesActivity myStatusesActivity = ((C54782jL) this).A00;
            if (myStatusesActivity.A0u.isEmpty()) {
                AnonymousClass092 anonymousClass092 = (AnonymousClass092) myStatusesActivity.A0f.A00.get(i);
                C0U0 c0u0 = myStatusesActivity.A01;
                if (c0u0 != null) {
                    c0u0.A05();
                }
                Intent intent = new Intent(myStatusesActivity, StatusPlaybackActivity.class);
                intent.putExtra("jid", C003101m.A07(anonymousClass092.A0A()));
                C0LD.A00(intent, anonymousClass092.A0n);
                myStatusesActivity.startActivity(intent);
                if (myStatusesActivity.A0L.A06() != null) {
                    myStatusesActivity.A0a.A07(Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
                }
            }
        } else if (!(this instanceof C53032bm)) {
            ((C54792jM) this).A00.A1R((String) SetStatus.A09.get(i));
        } else {
            C53032bm c53032bm = (C53032bm) this;
            C54802jN c54802jN = (C54802jN) view.getTag();
            if (c54802jN != null) {
                if (C011405q.A03(c54802jN.A01) && c54802jN.A00 == 0) {
                    c53032bm.A00.A15();
                    return;
                }
                StatusesFragment statusesFragment = c53032bm.A00;
                Intent intent2 = new Intent(((Hilt_StatusesFragment) statusesFragment).A00, StatusPlaybackActivity.class);
                intent2.putExtra("jid", c54802jN.A01.getRawString());
                statusesFragment.A0i(intent2);
                C2EQ c2eq = statusesFragment.A0c;
                AnonymousClass266 anonymousClass266 = statusesFragment.A0a;
                c2eq.A07(anonymousClass266.A02, anonymousClass266.A03, anonymousClass266.A01);
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.A00 > 1000) {
            this.A00 = elapsedRealtime;
            A00(adapterView, view, i, j);
        }
    }
}
