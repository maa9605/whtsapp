package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.settings.chat.wallpaper.WallpaperImagePreview;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.3p0  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C81503p0 extends C0HS {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final Resources A03;
    public final C003701t A04;
    public final WallpaperImagePreview A05;
    public final WallpaperImagePreview A06;

    public C81503p0(C003701t c003701t, Context context, WallpaperImagePreview wallpaperImagePreview, WallpaperImagePreview wallpaperImagePreview2, Resources resources, int i, int i2) {
        this.A04 = c003701t;
        this.A02 = context;
        this.A06 = wallpaperImagePreview;
        this.A05 = wallpaperImagePreview2;
        this.A03 = resources;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.C0HS
    public void A06() {
        Resources resources = this.A03;
        if (resources != null) {
            WallpaperImagePreview wallpaperImagePreview = this.A06;
            wallpaperImagePreview.setImageDrawable(resources.getDrawable(this.A00));
            wallpaperImagePreview.setVisibility(0);
        }
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        Resources resources = this.A03;
        if (resources != null) {
            Point A00 = AbstractC40441sG.A00(this.A02);
            try {
                InputStream openRawResource = resources.openRawResource(this.A01);
                Bitmap bitmap = C002701i.A0M(openRawResource, AbstractC40441sG.A01(A00, true, this.A04)).A02;
                if (openRawResource != null) {
                    openRawResource.close();
                }
                return bitmap;
            } catch (IOException | OutOfMemoryError e) {
                Log.e("LoadWallpaperImageTask/error when loading wallpaper resource", e);
            }
        }
        return null;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            if (!A04()) {
                this.A05.setImageBitmap(bitmap);
                this.A06.animate().setDuration(500L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).setListener(new AnimatorListenerAdapter() { // from class: X.3Wd
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                        super.onAnimationCancel(animator);
                        C81503p0.this.A06.setImageDrawable(null);
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C81503p0.this.A06.setImageDrawable(null);
                    }
                });
                return;
            }
            bitmap.recycle();
        }
    }
}
