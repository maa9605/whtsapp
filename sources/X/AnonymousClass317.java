package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import com.whatsapp.mediaview.MediaViewActivity;

/* renamed from: X.317  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass317 {
    public final Context A08;
    public AbstractC005302j A03 = null;
    public boolean A07 = false;
    public boolean A05 = false;
    public int A01 = 5;
    public int A00 = 1;
    public boolean A06 = false;
    public AnonymousClass094 A04 = null;
    public View A02 = null;

    public AnonymousClass317(Context context) {
        this.A08 = context;
    }

    public Intent A00() {
        Activity A0G;
        Context context = this.A08;
        Intent intent = new Intent(context, MediaViewActivity.class);
        intent.putExtra("start_t", SystemClock.uptimeMillis());
        intent.putExtra("video_play_origin", this.A01);
        intent.putExtra("nogallery", this.A07);
        intent.putExtra("gallery", this.A05);
        intent.putExtra("menu_style", this.A00);
        intent.putExtra("menu_set_wallpaper", this.A06);
        AnonymousClass094 anonymousClass094 = this.A04;
        if (anonymousClass094 != null) {
            C0LD.A00(intent, anonymousClass094);
        }
        AbstractC005302j abstractC005302j = this.A03;
        if (abstractC005302j != null) {
            intent.putExtra("jid", abstractC005302j.getRawString());
        }
        View view = this.A02;
        if (view != null && (A0G = C02180Ae.A0G(context, ActivityC02320As.class)) != null) {
            intent.putExtra("animation_bundle", C2HC.A03(A0G, view));
        }
        return intent;
    }
}
