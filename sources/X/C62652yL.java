package X;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.location.LiveLocationPrivacyActivity;

/* renamed from: X.2yL  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C62652yL extends BaseAdapter {
    public final /* synthetic */ LiveLocationPrivacyActivity A00;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public C62652yL(LiveLocationPrivacyActivity liveLocationPrivacyActivity) {
        this.A00 = liveLocationPrivacyActivity;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.A00.A0G.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.A00.A0G.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return ((C06C) ((Pair) this.A00.A0G.get(i)).first).A01();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C62662yM c62662yM;
        if (view == null) {
            view = this.A00.getLayoutInflater().inflate(R.layout.live_location_privacy_row, viewGroup, false);
            c62662yM = new C62662yM(null);
            c62662yM.A02 = (TextEmojiLabel) view.findViewById(R.id.name);
            c62662yM.A01 = (TextView) view.findViewById(R.id.time_left);
            c62662yM.A00 = (ImageView) view.findViewById(R.id.avatar);
            view.setTag(c62662yM);
        } else {
            c62662yM = (C62662yM) view.getTag();
        }
        LiveLocationPrivacyActivity liveLocationPrivacyActivity = this.A00;
        C06C c06c = (C06C) ((Pair) liveLocationPrivacyActivity.A0G.get(i)).first;
        if (c06c == null) {
            return view;
        }
        long A05 = liveLocationPrivacyActivity.A0A.A05();
        C41461tx c41461tx = liveLocationPrivacyActivity.A0E;
        Jid A03 = c06c.A03(AbstractC005302j.class);
        if (A03 != null) {
            long A052 = c41461tx.A05((AbstractC005302j) A03);
            c62662yM.A03 = c06c;
            c62662yM.A01.setText(AnonymousClass029.A0j(((ActivityC02310Ar) liveLocationPrivacyActivity).A01, A052 - A05));
            c62662yM.A02.setText(((ActivityC02310Ar) liveLocationPrivacyActivity).A01.A0E(liveLocationPrivacyActivity.A07.A08(c06c, false)));
            C0AT.A0V(c62662yM.A00, 2);
            liveLocationPrivacyActivity.A08.A02(c62662yM.A03, c62662yM.A00);
            return view;
        }
        throw null;
    }
}
