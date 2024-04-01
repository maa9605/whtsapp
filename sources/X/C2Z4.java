package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.android.search.verification.client.R;
import com.whatsapp.settings.chat.wallpaper.WallpaperImagePreview;
import com.whatsapp.settings.chat.wallpaper.WallpaperMockChatView;

/* renamed from: X.2Z4 */
/* loaded from: classes2.dex */
public class C2Z4 extends C2Z5 {
    public Resources A00;
    public Button A01;
    public FrameLayout A02;
    public ProgressBar A03;
    public C003701t A04;
    public WallpaperImagePreview A05;
    public WallpaperImagePreview A06;
    public WallpaperImagePreview A07;
    public WallpaperMockChatView A08;

    public C2Z4(Context context, String str, String str2, Resources resources) {
        super(context);
        this.A00 = resources;
        FrameLayout.inflate(context, R.layout.wallpaper_preview_chat_item_view, this);
        this.A06 = (WallpaperImagePreview) C0AT.A0D(this, R.id.wallpaper_preview_background_doodle);
        this.A05 = (WallpaperImagePreview) C0AT.A0D(this, R.id.wallpaper_preview_background);
        WallpaperImagePreview wallpaperImagePreview = (WallpaperImagePreview) C0AT.A0D(this, R.id.wallpaper_preview_blur);
        this.A07 = wallpaperImagePreview;
        wallpaperImagePreview.setImageDrawable(null);
        WallpaperMockChatView wallpaperMockChatView = (WallpaperMockChatView) C0AT.A0D(this, R.id.wallpaper_preview_mock_chat);
        this.A08 = wallpaperMockChatView;
        wallpaperMockChatView.setMessages(str, str2);
        this.A02 = (FrameLayout) C0AT.A0D(this, R.id.wallpaper_preview_download_container);
        this.A03 = (ProgressBar) C0AT.A0D(this, R.id.wallpaper_preview_progress_bar);
        this.A01 = (Button) C0AT.A0D(this, R.id.wallpaper_preview_download_btn);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.A07.setVisibility(8);
        this.A05.setImageDrawable(null);
        this.A05.setBackgroundColor(i);
    }

    public void setDownloadClickListener(View.OnClickListener onClickListener) {
        this.A01.setOnClickListener(onClickListener);
    }

    public void setWallpaper(Bitmap bitmap) {
        this.A07.setVisibility(8);
        this.A05.setImageBitmap(bitmap);
    }

    public void setWallpaper(Drawable drawable) {
        this.A07.setVisibility(8);
        this.A05.setImageDrawable(drawable);
    }
}
