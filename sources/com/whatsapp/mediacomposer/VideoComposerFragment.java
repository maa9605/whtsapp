package com.whatsapp.mediacomposer;

import X.AbstractC000600i;
import X.AbstractC48662Ge;
import X.C002301c;
import X.C003701t;
import X.C018508q;
import X.C01B;
import X.C02160Ac;
import X.C02180Ae;
import X.C02E;
import X.C03120Eg;
import X.C0BA;
import X.C42461vm;
import X.C43091wq;
import X.C48752Gn;
import X.C72653aN;
import X.InterfaceC002901k;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I0_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.VideoTimelineView;
import com.whatsapp.mediacomposer.VideoComposerFragment;
import java.io.File;

/* loaded from: classes2.dex */
public class VideoComposerFragment extends Hilt_VideoComposerFragment {
    public long A01;
    public long A03;
    public long A04;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public ImageView A0B;
    public ImageView A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public AbstractC000600i A0G;
    public C018508q A0H;
    public C01B A0I;
    public VideoTimelineView A0J;
    public C03120Eg A0K;
    public C02E A0L;
    public C002301c A0M;
    public C003701t A0N;
    public C43091wq A0O;
    public C48752Gn A0P;
    public C42461vm A0Q;
    public C72653aN A0R;
    public InterfaceC002901k A0S;
    public AbstractC48662Ge A0T;
    public File A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public int A00 = 640;
    public long A02 = -1;
    public final Runnable A0a = new RunnableEBaseShape4S0100000_I0_4(this, 1);
    public final View.OnAttachStateChangeListener A0Z = new View.OnAttachStateChangeListener() { // from class: X.2zf
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        {
            VideoComposerFragment.this = this;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (view != null) {
                VideoComposerFragment videoComposerFragment = VideoComposerFragment.this;
                view.removeCallbacks(videoComposerFragment.A0a);
                view.removeOnAttachStateChangeListener(videoComposerFragment.A0Z);
            }
        }
    };
    public View.OnClickListener A06 = new ViewOnClickEBaseShape2S0100000_I0_2(this, 43);
    public View.OnClickListener A05 = new ViewOnClickEBaseShape2S0100000_I0_2(this, 45);

    @Override // X.C0BA
    public void A0f() {
        super.A0U = true;
        A16();
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.video_composer_fragment, viewGroup, false);
    }

    @Override // com.whatsapp.mediacomposer.MediaComposerFragment, X.C0BA
    public void A0r() {
        super.A0r();
        this.A0J.A0H = null;
        AbstractC48662Ge abstractC48662Ge = this.A0T;
        if (abstractC48662Ge != null) {
            abstractC48662Ge.A09();
            this.A0T = null;
        }
    }

    @Override // X.C0BA
    public void A0s() {
        super.A0U = true;
        int A02 = this.A0T.A02();
        AbstractC48662Ge abstractC48662Ge = this.A0T;
        int i = A02 + 1;
        if (A02 > 0) {
            i = A02 - 1;
        }
        abstractC48662Ge.A0A(i);
        this.A0T.A0A(A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x01ea, code lost:
        if (r15 != false) goto L29;
     */
    @Override // com.whatsapp.mediacomposer.MediaComposerFragment, X.C0BA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0w(android.view.View r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 971
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.VideoComposerFragment.A0w(android.view.View, android.os.Bundle):void");
    }

    @Override // com.whatsapp.mediacomposer.MediaComposerFragment
    public void A13(Rect rect) {
        super.A13(rect);
        if (((C0BA) this).A0A != null) {
            this.A0A.setPadding(rect.left, A01().getDimensionPixelSize(R.dimen.actionbar_height) + rect.top, rect.right, A01().getDimensionPixelSize(R.dimen.actionbar_height) + rect.bottom);
            this.A09.setPadding(rect.left, rect.top, rect.right, 0);
        }
    }

    @Override // com.whatsapp.mediacomposer.MediaComposerFragment
    public void A14(boolean z) {
        super.A14(z);
        this.A0W = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00a6, code lost:
        if (r15.A0V != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long A17() {
        /*
            Method dump skipped, instructions count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.VideoComposerFragment.A17():long");
    }

    public final void A18() {
        if (this.A0T.A0C()) {
            A16();
            return;
        }
        this.A0T.A05().setBackground(null);
        if (this.A0T.A02() > this.A04 - 2000) {
            this.A0T.A0A((int) this.A03);
        }
        A11();
    }

    public final void A19() {
        Context A00 = A00();
        if (this.A0X) {
            this.A0B.setImageResource(R.drawable.ic_unmute);
            C02180Ae.A17(this.A0B, C02160Ac.A00(A00, R.color.white_alpha_40));
            this.A07.setOnClickListener(null);
            return;
        }
        if (this.A0V) {
            this.A0B.setImageResource(R.drawable.ic_unmute);
            this.A0B.setContentDescription(A0F(R.string.unmute_video));
        } else {
            this.A0B.setImageResource(R.drawable.ic_mute);
            this.A0B.setContentDescription(A0F(R.string.mute_video));
        }
        C02180Ae.A17(this.A0B, C02160Ac.A00(A00, R.color.white_alpha_100));
        this.A07.setOnClickListener(this.A05);
    }
}
