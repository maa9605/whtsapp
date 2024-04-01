package X;

import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I0_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.SingleSelectionDialogFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.WallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.WallpaperSetConfirmationDialogFragment;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.Serializable;

/* renamed from: X.2PT */
/* loaded from: classes2.dex */
public abstract class C2PT extends C2PU implements InterfaceC04910Mk {
    public Button A00;
    public C05W A01;
    public C018708s A02;

    public String A1P() {
        if (((C2PR) this).A00 == null) {
            if (AnonymousClass029.A1K(this)) {
                return getString(R.string.wallpaper_set_dark_wallpaper_bubble_message);
            }
            return getString(R.string.wallpaper_set_light_wallpaper_bubble_message);
        } else if (((C2PR) this).A01) {
            return getString(R.string.wallpaper_set_without_custom_wallpaper_bubble_message);
        } else {
            return getString(R.string.wallpaper_set_with_custom_wallpaper_bubble_message);
        }
    }

    public void A1Q(AbstractC005302j abstractC005302j) {
        if (this instanceof DownloadableWallpaperPreviewActivity) {
            DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity = (DownloadableWallpaperPreviewActivity) this;
            Intent intent = new Intent();
            int currentItem = downloadableWallpaperPreviewActivity.A01.getCurrentItem();
            if (currentItem < downloadableWallpaperPreviewActivity.A06.size()) {
                Uri uri = (Uri) downloadableWallpaperPreviewActivity.A06.get(downloadableWallpaperPreviewActivity.A01.getCurrentItem());
                AnonymousClass267 anonymousClass267 = downloadableWallpaperPreviewActivity.A02;
                if (anonymousClass267 != null) {
                    String path = uri.getPath();
                    if (path != null) {
                        File A01 = anonymousClass267.A05.A01(new File(path).getName().split("\\.")[0]);
                        if (A01 != null) {
                            intent.setData(Uri.fromFile(A01));
                            intent.putExtra("FROM_INTERNAL_DOWNLOADS_KEY", true);
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            } else {
                intent.putExtra("selected_res_id", (Serializable) downloadableWallpaperPreviewActivity.A07.get(currentItem - downloadableWallpaperPreviewActivity.A06.size()));
            }
            intent.putExtra("chat_jid", abstractC005302j);
            downloadableWallpaperPreviewActivity.setResult(-1, intent);
            downloadableWallpaperPreviewActivity.finish();
        } else if (this instanceof WallpaperPreview) {
            WallpaperPreview wallpaperPreview = (WallpaperPreview) this;
            Intent intent2 = new Intent();
            intent2.putExtra("selected_res_id", (Serializable) wallpaperPreview.A0A.get(wallpaperPreview.A09.getCurrentItem()));
            intent2.putExtra("chat_jid", abstractC005302j);
            wallpaperPreview.setResult(-1, intent2);
            wallpaperPreview.finish();
        } else if (this instanceof SolidColorWallpaperPreview) {
            SolidColorWallpaperPreview solidColorWallpaperPreview = (SolidColorWallpaperPreview) this;
            Intent intent3 = new Intent();
            intent3.putExtra("wallpaper_color_file", solidColorWallpaperPreview.A0D[solidColorWallpaperPreview.A09.getCurrentItem()]);
            if (C03410Fp.A08(((ActivityC02290Ap) solidColorWallpaperPreview).A0B)) {
                intent3.putExtra("wallpaper_doodle_overlay", solidColorWallpaperPreview.A08.isChecked());
            }
            intent3.putExtra("chat_jid", abstractC005302j);
            solidColorWallpaperPreview.setResult(-1, intent3);
            solidColorWallpaperPreview.finish();
        } else if (!(this instanceof GalleryWallpaperPreview)) {
            Intent intent4 = new Intent();
            intent4.putExtra("chat_jid", abstractC005302j);
            intent4.putExtra("is_default", true);
            setResult(-1, intent4);
            finish();
        } else {
            GalleryWallpaperPreview galleryWallpaperPreview = (GalleryWallpaperPreview) this;
            Uri uri2 = galleryWallpaperPreview.A01;
            if (uri2 == null) {
                Log.i("gallerywallpaperpreview/no uri found to save to. generating our own");
                uri2 = galleryWallpaperPreview.A08.A03();
                galleryWallpaperPreview.A01 = uri2;
            }
            File file = new File(uri2.getPath());
            Bitmap fullViewCroppedBitmap = galleryWallpaperPreview.A06.getFullViewCroppedBitmap();
            if (fullViewCroppedBitmap != null) {
                int i = 90;
                OutputStream outputStream = null;
                do {
                    try {
                        try {
                            ContentResolver A07 = galleryWallpaperPreview.A04.A07();
                            if (A07 == null) {
                                Log.w("gallerywallpaperpreview/save cr=null");
                            } else {
                                outputStream = A07.openOutputStream(galleryWallpaperPreview.A01);
                            }
                            if (outputStream != null) {
                                fullViewCroppedBitmap.compress(Bitmap.CompressFormat.JPEG, i, outputStream);
                                i -= 10;
                                AnonymousClass024.A0R(outputStream);
                                if (galleryWallpaperPreview.A00 <= 0 || i <= 0 || !file.exists()) {
                                    break;
                                }
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("gallerywallpaperpreview/outputstream/failed to open output stream for ");
                                sb.append(galleryWallpaperPreview.A01.getPath());
                                Log.i(sb.toString());
                                galleryWallpaperPreview.setResult(0, new Intent().putExtra("io-error", true));
                                return;
                            }
                        } catch (FileNotFoundException e) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("gallerywallpaperpreview/file not found at ");
                            sb2.append(galleryWallpaperPreview.A01.getPath());
                            Log.e(sb2.toString(), e);
                            galleryWallpaperPreview.setResult(0, new Intent().putExtra("io-error", true));
                            AnonymousClass024.A0R(outputStream);
                            return;
                        }
                    } catch (Throwable th) {
                        AnonymousClass024.A0R(outputStream);
                        throw th;
                    }
                } while (file.length() > galleryWallpaperPreview.A00);
                if (file.length() == 0 && galleryWallpaperPreview.A03.A02() == 0) {
                    Log.e("gallerywallpaperpreview/no space to save compressed image");
                    galleryWallpaperPreview.setResult(0, new Intent().putExtra("no-space", true));
                    return;
                }
                Intent intent5 = new Intent();
                intent5.setData(galleryWallpaperPreview.A01);
                intent5.putExtra("chat_jid", abstractC005302j);
                galleryWallpaperPreview.setResult(-1, intent5);
                galleryWallpaperPreview.finish();
                return;
            }
            throw null;
        }
    }

    @Override // X.InterfaceC04910Mk
    public void AOi(int i, int i2) {
        if (i != 100) {
            return;
        }
        if (i2 == 0) {
            A1Q(((C2PR) this).A00);
        } else {
            A1Q(null);
        }
    }

    public void lambda$onCreate$2364$AbstractWallpaperPreview(View view) {
        AbstractC005302j abstractC005302j;
        String A08;
        String string;
        if (C03410Fp.A08(((ActivityC02290Ap) this).A0B) && (abstractC005302j = ((C2PR) this).A00) != null && ((C2PR) this).A01) {
            C05W c05w = this.A01;
            C018708s c018708s = this.A02;
            C06C A09 = c05w.A09(abstractC005302j);
            if (A09 != null) {
                if (A09.A0D() && TextUtils.isEmpty(A09.A0F)) {
                    Jid A03 = A09.A03(C0I1.class);
                    if (A03 != null) {
                        A08 = c018708s.A0A((AbstractC011205o) A03);
                    } else {
                        throw null;
                    }
                } else {
                    A08 = c018708s.A08(A09, false);
                }
                String string2 = getString(R.string.wallpaper_dialog_set_wallpaper_for_this_chat, A08);
                if (AnonymousClass029.A1K(this)) {
                    string = getString(R.string.wallpaper_dialog_set_wallpaper_for_all_chats_dark_theme);
                } else {
                    string = getString(R.string.wallpaper_dialog_set_wallpaper_for_all_chats_light_theme);
                }
                String[] strArr = {string2, string};
                WallpaperSetConfirmationDialogFragment wallpaperSetConfirmationDialogFragment = new WallpaperSetConfirmationDialogFragment();
                Bundle A00 = SingleSelectionDialogFragment.A00(100, 0, R.string.wallpaper_dialog_set_wallpaper, strArr);
                A00.putBoolean("showConfirmation", true);
                wallpaperSetConfirmationDialogFragment.A0P(A00);
                AUh(wallpaperSetConfirmationDialogFragment);
                return;
            }
            throw null;
        }
        A1Q(((C2PR) this).A00);
    }

    @Override // X.C2PU, X.C2PR, X.C2PS, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C03410Fp.A08(((ActivityC02290Ap) this).A0B)) {
            setTitle(R.string.wallpaper_preview_header);
        } else {
            setTitle(R.string.wallpaper_preview);
        }
        Button button = (Button) C0VJ.A0A(this, R.id.set_wallpaper_button);
        this.A00 = button;
        button.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 12));
    }
}
