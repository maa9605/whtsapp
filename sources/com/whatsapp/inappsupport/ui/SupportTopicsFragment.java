package com.whatsapp.inappsupport.ui;

import X.C018308n;
import X.C61872wr;
import X.C61942wy;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class SupportTopicsFragment extends Hilt_SupportTopicsFragment {
    public C61872wr A00;
    public SupportTopicsActivity A01;
    public ArrayList A02;

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.support_topics_fragment, viewGroup, false);
        inflate.findViewById(R.id.topic_list_header).setVisibility(this.A01.A01 != 2 ? 8 : 0);
        ((AbsListView) inflate.findViewById(R.id.topic_list)).setAdapter((ListAdapter) new C61942wy(this.A01, this.A02));
        return inflate;
    }

    @Override // com.whatsapp.inappsupport.ui.Hilt_SupportTopicsFragment, X.C0BA
    public void A0u(Context context) {
        if (C018308n.A00(context) instanceof SupportTopicsActivity) {
            this.A01 = (SupportTopicsActivity) C018308n.A00(context);
            super.A0u(context);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SupportTopicsFragment");
        sb.append(" can only be used with ");
        sb.append("SupportTopicsActivity");
        throw new IllegalStateException(sb.toString());
    }

    @Override // X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        this.A00 = (C61872wr) A02().getParcelable("parent_topic");
        ArrayList parcelableArrayList = A02().getParcelableArrayList("topics");
        if (parcelableArrayList == null) {
            throw null;
        }
        this.A02 = parcelableArrayList;
    }
}
