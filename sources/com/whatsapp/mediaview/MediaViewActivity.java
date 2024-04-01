package com.whatsapp.mediaview;

import X.AbstractC005302j;
import X.AbstractC02800Cx;
import X.AnonymousClass094;
import X.C02820Cz;
import X.C0LD;
import X.C2HC;
import X.C2OM;
import X.InterfaceC05780Qf;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class MediaViewActivity extends C2OM implements InterfaceC05780Qf {
    public MediaViewFragment A00;

    @Override // X.InterfaceC05780Qf
    public void AJT() {
    }

    @Override // X.InterfaceC05780Qf
    public void APP() {
    }

    @Override // X.InterfaceC05780Qf
    public boolean AUZ() {
        return true;
    }

    @Override // X.InterfaceC05780Qf
    public void AM0() {
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        MediaViewFragment mediaViewFragment = this.A00;
        if (mediaViewFragment != null) {
            ((MediaViewBaseFragment) mediaViewFragment).A0B.A08();
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        MediaViewFragment mediaViewFragment = this.A00;
        if (mediaViewFragment != null) {
            mediaViewFragment.A15();
        }
        super.onBackPressed();
    }

    @Override // X.C2OM, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (C2HC.A00) {
            Window window = getWindow();
            window.requestFeature(12);
            window.requestFeature(13);
        }
        super.onCreate(bundle);
        setContentView(R.layout.media_view_activity);
        AbstractC02800Cx A0N = A0N();
        MediaViewFragment mediaViewFragment = (MediaViewFragment) A0N.A0Q.A01("media_view_fragment");
        this.A00 = mediaViewFragment;
        if (mediaViewFragment == null) {
            Intent intent = getIntent();
            AnonymousClass094 A02 = C0LD.A02(intent);
            if (A02 == null) {
                Log.e("mediaview/message key parameter is missing");
                finish();
                return;
            }
            this.A00 = MediaViewFragment.A01(A02, AbstractC005302j.A02(intent.getStringExtra("jid")), intent.getBooleanExtra("gallery", false), intent.getBooleanExtra("nogallery", false), intent.getIntExtra("video_play_origin", 5), intent.getLongExtra("start_t", 0L), intent.getBundleExtra("animation_bundle"), intent.getIntExtra("menu_style", 1), intent.getBooleanExtra("menu_set_wallpaper", false), 1);
        }
        C02820Cz c02820Cz = new C02820Cz(A0N);
        c02820Cz.A01(R.id.media_view_fragment_container, this.A00, "media_view_fragment");
        c02820Cz.A04();
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        super.onStop();
        MediaViewBaseFragment.A05(this, true);
    }
}
