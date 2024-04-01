package com.whatsapp.mediacomposer;

import X.AbstractC000600i;
import X.AbstractC48662Ge;
import X.C000700j;
import X.C002301c;
import X.C01B;
import X.C02E;
import X.C0K7;
import X.C2EK;
import X.C2EN;
import X.C40841sx;
import X.C48742Gm;
import X.C72653aN;
import X.C83663sU;
import X.C83973sz;
import X.InterfaceC002901k;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public class GifComposerFragment extends Hilt_GifComposerFragment {
    public AbstractC000600i A00;
    public C01B A01;
    public C02E A02;
    public C002301c A03;
    public InterfaceC002901k A04;
    public AbstractC48662Ge A05;

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.gif_composer_fragment, viewGroup, false);
    }

    @Override // com.whatsapp.mediacomposer.MediaComposerFragment, X.C0BA
    public void A0r() {
        super.A0r();
        AbstractC48662Ge abstractC48662Ge = this.A05;
        if (abstractC48662Ge != null) {
            abstractC48662Ge.A09();
            this.A05 = null;
        }
    }

    @Override // com.whatsapp.mediacomposer.MediaComposerFragment, X.C0BA
    public void A0w(View view, Bundle bundle) {
        AbstractC48662Ge A00;
        int i;
        int i2;
        super.A0w(view, bundle);
        C000700j.A07(this.A05 == null);
        C2EN A0y = A0y();
        File AAB = A0y.AAB(((MediaComposerFragment) this).A00);
        if (AAB != null) {
            if (bundle == null) {
                String A9p = A0y.A9p(((MediaComposerFragment) this).A00);
                String A9s = A0y.A9s(((MediaComposerFragment) this).A00);
                if (A9p == null) {
                    C72653aN ADp = A0y.ADp(((MediaComposerFragment) this).A00);
                    if (ADp == null) {
                        try {
                            ADp = new C72653aN(this.A01, AAB);
                        } catch (C83663sU e) {
                            Log.e("GifComposerFragment/bad video", e);
                        }
                    }
                    if (ADp.A04()) {
                        i = ADp.A01;
                    } else {
                        i = ADp.A03;
                    }
                    float f = i;
                    if (ADp.A04()) {
                        i2 = ADp.A03;
                    } else {
                        i2 = ADp.A01;
                    }
                    RectF rectF = new RectF(0.0f, 0.0f, f, i2);
                    C48742Gm c48742Gm = ((MediaComposerFragment) this).A0A;
                    c48742Gm.A0H.A06 = rectF;
                    c48742Gm.A0G.A00 = 0.0f;
                    c48742Gm.A06(rectF);
                } else {
                    C2EK A03 = C2EK.A03(A9p, A00(), ((MediaComposerFragment) this).A05, this.A03, ((MediaComposerFragment) this).A0E);
                    if (A03 != null) {
                        ((MediaComposerFragment) this).A0A.A07(A03, A9s);
                    }
                }
            }
            try {
                if (C40841sx.A0i(AAB)) {
                    A00 = new C83973sz(A0A(), AAB);
                } else {
                    A00 = AbstractC48662Ge.A00(((MediaComposerFragment) this).A01, this.A04, this.A02, this.A03, A00(), AAB, true, A0y.A5v(((MediaComposerFragment) this).A00), C0K7.A01());
                }
                this.A05 = A00;
                A00.A0B(true);
                ((ViewGroup) view.findViewById(R.id.video_player)).addView(this.A05.A05(), new FrameLayout.LayoutParams(-1, -1, 17));
                if (((MediaComposerFragment) this).A00.equals(A0y.A8M())) {
                    this.A05.A05().setAlpha(0.0f);
                    A0A().A0T();
                    return;
                }
                return;
            } catch (IOException e2) {
                Log.e("GifComposerFragment/onViewCreated videoPlayer initialization", e2);
                ((MediaComposerFragment) this).A01.A07(R.string.error_load_gif, 0);
                A0A().finish();
                return;
            }
        }
        throw null;
    }
}
