package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3pm  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C81983pm extends C0HS {
    public final /* synthetic */ MyStatusesActivity A00;

    public C81983pm(MyStatusesActivity myStatusesActivity) {
        this.A00 = myStatusesActivity;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        List A02 = this.A00.A0K.A02(C011405q.A00);
        Collections.reverse(A02);
        return A02;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        List list = (List) obj;
        StringBuilder A0P = C000200d.A0P("mystatuses/loaded ");
        A0P.append(list.size());
        A0P.append(" messages");
        Log.i(A0P.toString());
        if (list.isEmpty()) {
            this.A00.finish();
            return;
        }
        MyStatusesActivity myStatusesActivity = this.A00;
        C53952hn c53952hn = myStatusesActivity.A0f;
        c53952hn.A00 = list;
        c53952hn.notifyDataSetChanged();
        myStatusesActivity.A1T();
        myStatusesActivity.A0Z.A00();
        myStatusesActivity.findViewById(R.id.progress).setVisibility(8);
    }
}
