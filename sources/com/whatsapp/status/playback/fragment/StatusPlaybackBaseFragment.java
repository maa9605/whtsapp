package com.whatsapp.status.playback.fragment;

import X.ActivityC02330At;
import X.C002301c;
import X.C018508q;
import X.C02160Ac;
import X.C02E;
import X.C0We;
import X.C2Q3;
import X.C2Q5;
import X.C3XX;
import X.C53962ho;
import X.InterfaceC71723Xf;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackFragment;
import com.whatsapp.status.playback.widget.AudioVolumeView;
import com.whatsapp.status.playback.widget.StatusPlaybackProgressView;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0_2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class StatusPlaybackBaseFragment extends Hilt_StatusPlaybackBaseFragment {
    public C018508q A00;
    public C02E A01;
    public C002301c A02;
    public C53962ho A03;
    public C2Q5 A05;
    public boolean A07;
    public Runnable A06 = new RunnableEBaseShape6S0100000_I0_6(this, 36);
    public InterfaceC71723Xf A04 = new InterfaceC71723Xf() { // from class: X.3q6
        @Override // X.InterfaceC71723Xf
        public void AHU(boolean z) {
        }

        {
            StatusPlaybackBaseFragment.this = this;
        }

        @Override // X.InterfaceC71723Xf
        public void AHX(int i, int i2, int i3) {
            StatusPlaybackBaseFragment statusPlaybackBaseFragment = StatusPlaybackBaseFragment.this;
            if (!((StatusPlaybackFragment) statusPlaybackBaseFragment).A00 || i3 == 0) {
                return;
            }
            int i4 = i2 + 1;
            if (i2 == 0) {
                i4 = 0;
            }
            C53962ho A14 = statusPlaybackBaseFragment.A14();
            A14.A0B.setVolume((i4 * 1.0f) / (i3 + 1));
            A14.A0B.setVisibility(0);
            A14.A0B.removeCallbacks(statusPlaybackBaseFragment.A06);
            A14.A0B.postDelayed(statusPlaybackBaseFragment.A06, 1500L);
        }
    };

    @Override // com.whatsapp.status.playback.fragment.StatusPlaybackFragment, X.C0BA
    public void A0f() {
        super.A0f();
        C2Q5 c2q5 = this.A05;
        InterfaceC71723Xf interfaceC71723Xf = this.A04;
        List list = c2q5.A04;
        if (list != null) {
            list.remove(interfaceC71723Xf);
        }
    }

    @Override // X.C0BA
    public void A0j(Bundle bundle) {
        this.A0U = true;
        A15(((StatusPlaybackFragment) this).A01);
        C2Q3 c2q3 = (C2Q3) A09();
        if (c2q3 != null) {
            c2q3.ALD(A0y());
        }
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.status_playback_fragment, viewGroup, false);
        C53962ho A14 = A14();
        A14.A03 = viewGroup;
        A14.A07 = (FrameLayout) inflate.findViewById(R.id.root_view);
        A14.A0C = (StatusPlaybackProgressView) inflate.findViewById(R.id.playback_progress);
        A14.A06 = (ViewGroup) inflate.findViewById(R.id.status_container);
        A14.A0B = (AudioVolumeView) inflate.findViewById(R.id.volume);
        A14.A08 = (ImageView) inflate.findViewById(R.id.back);
        A14.A0A = (TextView) inflate.findViewById(R.id.date);
        A14.A05 = inflate.findViewById(R.id.title_bar);
        A14.A04 = inflate.findViewById(R.id.title_protection);
        A14.A00 = inflate.findViewById(R.id.header);
        A14.A02 = inflate.findViewById(R.id.menu);
        A14.A01 = inflate.findViewById(R.id.progress);
        A14.A09 = (ImageView) inflate.findViewById(R.id.profile_picture);
        return inflate;
    }

    @Override // com.whatsapp.status.playback.fragment.StatusPlaybackFragment, X.C0BA
    public void A0s() {
        super.A0s();
        C2Q5 c2q5 = this.A05;
        InterfaceC71723Xf interfaceC71723Xf = this.A04;
        List list = c2q5.A04;
        if (list == null) {
            list = new ArrayList();
            c2q5.A04 = list;
        }
        list.add(interfaceC71723Xf);
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        ActivityC02330At A0A = A0A();
        C53962ho A14 = A14();
        ViewOnClickCListenerShape10S0100000_I0_2 viewOnClickCListenerShape10S0100000_I0_2 = new ViewOnClickCListenerShape10S0100000_I0_2(this, 47);
        A14.A08.setImageDrawable(new C0We(this.A02, C02160Ac.A03(A0A, R.drawable.ic_cam_back)));
        A14.A08.setOnClickListener(viewOnClickCListenerShape10S0100000_I0_2);
        View view2 = A14.A02;
        view2.setOnClickListener(new C3XX(A0A, view2, this.A02, this));
    }

    public final C53962ho A14() {
        C53962ho c53962ho = this.A03;
        if (c53962ho == null) {
            C53962ho c53962ho2 = new C53962ho();
            this.A03 = c53962ho2;
            return c53962ho2;
        }
        return c53962ho;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0132, code lost:
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00ef, code lost:
        if (r0 == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A15(android.graphics.Rect r7) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment.A15(android.graphics.Rect):void");
    }

    public void A16(boolean z) {
        StringBuilder sb = new StringBuilder("playbackFragment/onDragChanged dragging=");
        sb.append(z);
        sb.append("; ");
        sb.append(this);
        Log.i(sb.toString());
    }
}
