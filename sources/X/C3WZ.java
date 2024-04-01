package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import com.google.android.search.verification.client.R;
import com.whatsapp.settings.chat.wallpaper.WallpaperPreview;

/* renamed from: X.3WZ */
/* loaded from: classes2.dex */
public class C3WZ implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ WallpaperPreview A04;

    public C3WZ(WallpaperPreview wallpaperPreview, int i, int i2, int i3, int i4) {
        this.A04 = wallpaperPreview;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A00 = i4;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        WallpaperPreview wallpaperPreview = this.A04;
        wallpaperPreview.A08.getViewTreeObserver().removeOnPreDrawListener(this);
        View findViewById = wallpaperPreview.findViewById(R.id.wallpaper_preview_mock_chat);
        int[] iArr = new int[2];
        wallpaperPreview.A09.getLocationOnScreen(iArr);
        wallpaperPreview.A02 = this.A02 - iArr[0];
        wallpaperPreview.A03 = this.A03 - iArr[1];
        wallpaperPreview.A00 = this.A01 / wallpaperPreview.A09.getWidth();
        wallpaperPreview.A01 = this.A00 / wallpaperPreview.A09.getHeight();
        int i = (int) (wallpaperPreview.getResources().getDisplayMetrics().density * 20.0f);
        wallpaperPreview.A09.setPivotX(0.0f);
        wallpaperPreview.A09.setPivotY(0.0f);
        wallpaperPreview.A09.setScaleX(wallpaperPreview.A00);
        wallpaperPreview.A09.setScaleY(wallpaperPreview.A01);
        wallpaperPreview.A09.setTranslationX(wallpaperPreview.A02);
        wallpaperPreview.A09.setTranslationY(wallpaperPreview.A03);
        wallpaperPreview.A05.setAlpha(0.0f);
        wallpaperPreview.A07.setAlpha(0.0f);
        if (findViewById != null) {
            findViewById.setAlpha(0.0f);
            findViewById.setTranslationY(i);
        }
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        wallpaperPreview.A06.setBackgroundColor(0);
        wallpaperPreview.A05.animate().setDuration(250L).alpha(1.0f).setInterpolator(decelerateInterpolator);
        wallpaperPreview.A09.animate().setDuration(250L).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setInterpolator(decelerateInterpolator).setListener(new C3WY(this, findViewById, decelerateInterpolator));
        return true;
    }
}
