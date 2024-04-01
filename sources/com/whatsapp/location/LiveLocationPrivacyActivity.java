package com.whatsapp.location;

import X.AbstractC005302j;
import X.ActivityC02310Ar;
import X.AnonymousClass012;
import X.AnonymousClass094;
import X.C018708s;
import X.C019208x;
import X.C02F;
import X.C05W;
import X.C0AT;
import X.C0C9;
import X.C0L5;
import X.C0U1;
import X.C0Zn;
import X.C2OJ;
import X.C41461tx;
import X.C453221i;
import X.C62652yL;
import X.DialogInterfaceC019408z;
import X.InterfaceC453821q;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.location.LiveLocationPrivacyActivity;
import com.whatsapp.util.ViewOnClickCListenerShape9S0100000_I0_1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class LiveLocationPrivacyActivity extends C2OJ {
    public View A00;
    public View A01;
    public View A02;
    public Button A03;
    public ListView A04;
    public ScrollView A05;
    public TextView A06;
    public C018708s A07;
    public C0Zn A08;
    public C0L5 A09;
    public AnonymousClass012 A0A;
    public C02F A0B;
    public C0C9 A0C;
    public C62652yL A0D;
    public C41461tx A0E;
    public final List A0G = new ArrayList();
    public final InterfaceC453821q A0F = new InterfaceC453821q() { // from class: X.3Ei
        {
            LiveLocationPrivacyActivity.this = this;
        }

        @Override // X.InterfaceC453821q
        public void AOv(AbstractC005302j abstractC005302j) {
            LiveLocationPrivacyActivity.this.A1P();
        }

        @Override // X.InterfaceC453821q
        public void APC(AbstractC005302j abstractC005302j) {
            LiveLocationPrivacyActivity.this.A1P();
        }
    };

    public final void A1P() {
        ArrayList arrayList;
        List list = this.A0G;
        list.clear();
        C41461tx c41461tx = this.A0E;
        synchronized (c41461tx.A0T) {
            Map A0D = c41461tx.A0D();
            arrayList = new ArrayList(A0D.size());
            long A05 = c41461tx.A0G.A05();
            for (C453221i c453221i : A0D.values()) {
                if (C41461tx.A02(c453221i.A01, A05)) {
                    C05W c05w = c41461tx.A0E;
                    AnonymousClass094 anonymousClass094 = c453221i.A02;
                    AbstractC005302j abstractC005302j = anonymousClass094.A00;
                    if (abstractC005302j != null) {
                        arrayList.add(new Pair(c05w.A09(abstractC005302j), anonymousClass094));
                    } else {
                        throw null;
                    }
                }
            }
        }
        list.addAll(arrayList);
        this.A0D.notifyDataSetChanged();
        if (list.isEmpty()) {
            this.A06.setVisibility(8);
            this.A01.setVisibility(8);
            this.A02.setVisibility(8);
            this.A04.setVisibility(8);
            this.A05.setVisibility(0);
            this.A03.setVisibility(8);
            return;
        }
        this.A06.setText(((ActivityC02310Ar) this).A01.A0A(R.plurals.live_location_currently_sharing, list.size(), Integer.valueOf(list.size())));
        this.A06.setVisibility(0);
        this.A01.setVisibility(0);
        this.A05.setVisibility(8);
        this.A02.setVisibility(0);
        this.A04.setVisibility(0);
        this.A03.setVisibility(0);
    }

    @Override // X.C2OJ, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RequestPermissionActivity.A0O(this, this.A0B, R.string.permission_location_access_on_updating_location_request, R.string.permission_location_access_on_updating_location, 0);
        setContentView(R.layout.live_location_privacy);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            A0c.A08(R.string.settings_privacy_live_location);
            this.A08 = this.A09.A04(this);
            this.A0D = new C62652yL(this);
            this.A02 = findViewById(R.id.list_view_container);
            this.A04 = (ListView) findViewById(R.id.list_view);
            View inflate = getLayoutInflater().inflate(R.layout.live_location_list_header, (ViewGroup) null, false);
            C0AT.A0V(inflate, 2);
            this.A06 = (TextView) inflate.findViewById(R.id.title);
            this.A05 = (ScrollView) findViewById(R.id.live_location_not_sharing);
            this.A00 = findViewById(R.id.bottom_button_container);
            this.A03 = (Button) findViewById(R.id.stop_sharing_btn);
            this.A04.addHeaderView(inflate);
            View inflate2 = getLayoutInflater().inflate(R.layout.live_location_privacy_footer, (ViewGroup) null, false);
            this.A01 = inflate2;
            this.A04.addFooterView(inflate2);
            this.A04.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: X.2xw
                {
                    LiveLocationPrivacyActivity.this = this;
                }

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    LiveLocationPrivacyActivity liveLocationPrivacyActivity = LiveLocationPrivacyActivity.this;
                    int i2 = i - 1;
                    if (i2 >= 0 && i2 < liveLocationPrivacyActivity.A0D.getCount()) {
                        AnonymousClass092 A0F = liveLocationPrivacyActivity.A0C.A0F((AnonymousClass094) ((Pair) liveLocationPrivacyActivity.A0D.A00.A0G.get(i2)).second);
                        AnonymousClass094 anonymousClass094 = A0F.A0n;
                        Intent putExtra = Conversation.A01(liveLocationPrivacyActivity, anonymousClass094.A00).putExtra("row_id", A0F.A0p);
                        C0LD.A00(putExtra, anonymousClass094);
                        C018308n c018308n = ((ActivityC02270An) liveLocationPrivacyActivity).A00;
                        if (c018308n != null) {
                            c018308n.A08(liveLocationPrivacyActivity, putExtra, "LiveLocationPrivacyActivity");
                            return;
                        }
                        throw null;
                    }
                }
            });
            this.A04.setAdapter((ListAdapter) this.A0D);
            if (Build.VERSION.SDK_INT >= 21) {
                final int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation);
                this.A04.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: X.2yK
                    @Override // android.widget.AbsListView.OnScrollListener
                    public void onScrollStateChanged(AbsListView absListView, int i) {
                    }

                    {
                        LiveLocationPrivacyActivity.this = this;
                    }

                    @Override // android.widget.AbsListView.OnScrollListener
                    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                        if (i + i2 == i3) {
                            int bottom = absListView.getChildAt(i2 - 1).getBottom();
                            LiveLocationPrivacyActivity liveLocationPrivacyActivity = LiveLocationPrivacyActivity.this;
                            if (bottom == liveLocationPrivacyActivity.A04.getBottom() - liveLocationPrivacyActivity.A04.getPaddingBottom()) {
                                liveLocationPrivacyActivity.A00.setElevation(0.0f);
                                return;
                            } else {
                                liveLocationPrivacyActivity.A00.setElevation(dimensionPixelSize);
                                return;
                            }
                        }
                        LiveLocationPrivacyActivity.this.A00.setElevation(dimensionPixelSize);
                    }
                });
            }
            this.A03.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 46));
            A1P();
            this.A0E.A0X(this.A0F);
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i != 0) {
            return super.onCreateDialog(i);
        }
        C019208x c019208x = new C019208x(this);
        c019208x.A02(R.string.live_location_stop_sharing_dialog);
        c019208x.A01.A0J = true;
        c019208x.A04(R.string.cancel, null);
        c019208x.A06(R.string.live_location_stop, new DialogInterface.OnClickListener() { // from class: X.2xx
            {
                LiveLocationPrivacyActivity.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                LiveLocationPrivacyActivity liveLocationPrivacyActivity = LiveLocationPrivacyActivity.this;
                C000200d.A0j(((ActivityC02290Ap) liveLocationPrivacyActivity).A0F, "live_location_is_new_user", true);
                liveLocationPrivacyActivity.A0E.A0F();
            }
        });
        DialogInterfaceC019408z A00 = c019208x.A00();
        A00.requestWindowFeature(1);
        return A00;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C41461tx c41461tx = this.A0E;
        c41461tx.A0X.remove(this.A0F);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        LocationSharingService.A01(getApplicationContext(), this.A0E);
    }
}
