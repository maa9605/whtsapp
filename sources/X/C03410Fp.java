package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.IntentChooserBottomSheetDialogFragment;
import com.whatsapp.gallerypicker.GalleryPickerLauncher;
import com.whatsapp.settings.chat.wallpaper.DefaultWallpaper;
import com.whatsapp.settings.chat.wallpaper.ResetWallpaper;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaper;
import com.whatsapp.settings.chat.wallpaper.WallpaperCategoriesActivity;
import com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity;
import com.whatsapp.settings.chat.wallpaper.WallpaperPicker;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.0Fp */
/* loaded from: classes.dex */
public class C03410Fp {
    public static Drawable A00(Context context, int i, boolean z) {
        int[] intArray;
        if (z) {
            intArray = context.getResources().getIntArray(R.array.solid_color_wallpaperv2_colors);
        } else {
            intArray = context.getResources().getIntArray(R.array.solid_color_wallpaper_colors);
        }
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
        createBitmap.setPixel(0, 0, intArray[i]);
        return new BitmapDrawable(context.getResources(), createBitmap);
    }

    public static Drawable A01(Context context, Resources resources, C003701t c003701t) {
        Bitmap bitmap;
        Point A00 = AbstractC40441sG.A00(context);
        try {
            InputStream openRawResource = resources.openRawResource(R.drawable.default_wallpaper);
            bitmap = C002701i.A0M(openRawResource, AbstractC40441sG.A01(A00, true, c003701t)).A02;
            if (openRawResource != null) {
                openRawResource.close();
            }
        } catch (IOException e) {
            Log.e("wallpaper/exception", e);
            bitmap = null;
        }
        if (bitmap != null) {
            bitmap.setDensity(0);
            return new BitmapDrawable(resources, bitmap);
        }
        Log.w("wallpaper/cannot decode default wallpaper");
        return null;
    }

    public static Drawable A02(C018508q c018508q, Context context, int i, int i2, int i3) {
        Drawable drawable = null;
        try {
            Drawable drawable2 = context.getPackageManager().getResourcesForApplication("com.whatsapp.wallpaper").getDrawable(i);
            try {
                Bitmap bitmap = ((BitmapDrawable) drawable2).getBitmap();
                if (bitmap != null) {
                    float f = i2;
                    float height = bitmap.getHeight() / i3;
                    if (bitmap.getWidth() / f > height) {
                        int width = (int) (bitmap.getWidth() / height);
                        if (width > 0 && i3 > 0 && i2 > 0) {
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, i3, true);
                            bitmap = Bitmap.createBitmap(createScaledBitmap, (createScaledBitmap.getWidth() - i2) >> 1, 0, i2, i3);
                            if (bitmap != createScaledBitmap) {
                                createScaledBitmap.recycle();
                            }
                        }
                    } else {
                        int height2 = (int) ((bitmap.getHeight() * f) / bitmap.getWidth());
                        if (height2 > 0 && i3 > 0 && i2 > 0) {
                            Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(bitmap, i2, height2, true);
                            bitmap = Bitmap.createBitmap(createScaledBitmap2, 0, (createScaledBitmap2.getHeight() - i3) >> 1, i2, i3);
                            if (bitmap != createScaledBitmap2) {
                                createScaledBitmap2.recycle();
                            }
                        }
                    }
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    return new BitmapDrawable((Resources) null, bitmap);
                }
                c018508q.A05(R.string.error_load_wallpaper, 0);
                return drawable2;
            } catch (PackageManager.NameNotFoundException | OutOfMemoryError | RuntimeException e) {
                e = e;
                drawable = drawable2;
                Log.e("wallpaper/set-global-wallpaper", e);
                c018508q.A05(R.string.error_load_wallpaper, 0);
                return drawable;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            e = e2;
        } catch (OutOfMemoryError e3) {
            e = e3;
        } catch (RuntimeException e4) {
            e = e4;
        }
    }

    public static Drawable A03(C003701t c003701t, File file, Context context, Resources resources) {
        if (file.exists()) {
            try {
                Bitmap bitmap = C002701i.A0L(file, AbstractC40441sG.A01(AbstractC40441sG.A00(context), true, c003701t)).A02;
                if (bitmap != null) {
                    return new BitmapDrawable(resources, bitmap);
                }
                return null;
            } catch (OutOfMemoryError e) {
                Log.e(e);
            }
        }
        return null;
    }

    public static C0FK A04(Resources resources) {
        String[] stringArray;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            int identifier = resources.getIdentifier("wallpapers", "array", "com.whatsapp.wallpaper");
            if (identifier != 0) {
                for (String str : resources.getStringArray(identifier)) {
                    int identifier2 = resources.getIdentifier(str, "drawable", "com.whatsapp.wallpaper");
                    if (identifier2 != 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("_small");
                        int identifier3 = resources.getIdentifier(sb.toString(), "drawable", "com.whatsapp.wallpaper");
                        if (identifier3 != 0) {
                            arrayList.add(Integer.valueOf(identifier3));
                            arrayList2.add(Integer.valueOf(identifier2));
                        }
                    }
                }
            }
        } catch (Resources.NotFoundException e) {
            Log.e("WallpaperUtils/resource not found", e);
        }
        return new C0FK(arrayList, arrayList2);
    }

    public static AbstractC005302j A05(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return (AbstractC005302j) extras.getParcelable("chat_jid");
        }
        return null;
    }

    public static void A06(Context context, Drawable drawable, int i) {
        drawable.setColorFilter(new PorterDuffColorFilter(C09990f7.A03(C02160Ac.A00(context, R.color.black), (int) ((i / 100.0f) * 255.0f)), PorterDuff.Mode.DARKEN));
    }

    public static void A07(C01B c01b, Activity activity, AbstractC005302j abstractC005302j, C0B5 c0b5, int i) {
        if (c01b.A0E(C01C.A2W)) {
            if (abstractC005302j != null && !AnonymousClass029.A1K(activity)) {
                activity.startActivity(WallpaperCategoriesActivity.A00(activity, abstractC005302j));
                return;
            } else {
                activity.startActivity(WallpaperCurrentPreviewActivity.A00(activity, abstractC005302j));
                return;
            }
        }
        c0b5.AUh(IntentChooserBottomSheetDialogFragment.A00(R.string.pick_wallpaper_title, Arrays.asList(new C457523l(new Intent(activity, ResetWallpaper.class), R.string.no_wallpaper, R.drawable.clear), new C457523l(new Intent(activity, GalleryPickerLauncher.class), R.string.gallery_picker_label, R.drawable.ic_gallery), new C457523l(new Intent(activity, SolidColorWallpaper.class), R.string.solid_color_wallpaper, R.drawable.ic_menu_solid_color_wallpaper), new C457523l(WallpaperPicker.A00(activity), R.string.wallpaper_package, 0), new C457523l(new Intent(activity, DefaultWallpaper.class), R.string.default_wallpaper, R.drawable.ic_menu_default_wallpaper)), i));
    }

    public static boolean A08(C01B c01b) {
        return c01b.A0E(C01C.A2W);
    }

    public static int[] A09(Context context, C01B c01b) {
        boolean A0E = c01b.A0E(C01C.A2W);
        Resources resources = context.getResources();
        if (A0E) {
            return resources.getIntArray(R.array.solid_color_wallpaperv2_colors);
        }
        return resources.getIntArray(R.array.solid_color_wallpaper_colors);
    }
}
