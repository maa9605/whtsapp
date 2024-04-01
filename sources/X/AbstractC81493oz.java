package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickEBaseShape1S0201000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.WallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3oz */
/* loaded from: classes2.dex */
public abstract class AbstractC81493oz extends C0ZT {
    public final Context A00;
    public final Resources A01;

    public AbstractC81493oz(Context context) {
        this.A00 = context;
        this.A01 = null;
    }

    public AbstractC81493oz(Context context, Resources resources) {
        this.A00 = context;
        this.A01 = resources;
    }

    @Override // X.C0ZT
    public Object A0C(ViewGroup viewGroup, int i) {
        Context context;
        String string;
        String string2;
        Pair create;
        String string3;
        String A1P;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        if (this instanceof C86353xI) {
            C86353xI c86353xI = (C86353xI) this;
            if (i == 0) {
                context = ((AbstractC81493oz) c86353xI).A00;
                string = context.getString(R.string.library_preview_chat_content_swipe_left);
            } else {
                int A0B = c86353xI.A0B() - 1;
                context = ((AbstractC81493oz) c86353xI).A00;
                if (i < A0B) {
                    string = context.getString(R.string.wallpaper_preview_swipe_left_or_right);
                } else {
                    string = context.getString(R.string.library_preview_chat_content_swipe_right);
                }
            }
            if (c86353xI.A00 == null) {
                if (AnonymousClass029.A1K(context)) {
                    string2 = context.getString(R.string.wallpaper_set_dark_wallpaper_bubble_message);
                } else {
                    string2 = context.getString(R.string.wallpaper_set_light_wallpaper_bubble_message);
                }
            } else if (c86353xI.A08) {
                string2 = context.getString(R.string.wallpaper_set_without_custom_wallpaper_bubble_message);
            } else {
                string2 = context.getString(R.string.wallpaper_set_with_custom_wallpaper_bubble_message);
            }
            create = Pair.create(string, string2);
        } else if (this instanceof C86343xH) {
            C86343xH c86343xH = (C86343xH) this;
            WallpaperPreview wallpaperPreview = c86343xH.A00;
            int A0B2 = c86343xH.A0B() - 1;
            int i2 = R.string.library_preview_chat_content_swipe_left;
            if (i == A0B2) {
                i2 = R.string.library_preview_chat_content_swipe_right;
            }
            String string4 = wallpaperPreview.getString(i2);
            int i3 = R.string.library_preview_chat_content_swipe_right;
            if (i == 0) {
                i3 = R.string.library_preview_chat_content_swipe_left;
            }
            create = Pair.create(string4, wallpaperPreview.getString(i3));
        } else {
            C86273xA c86273xA = (C86273xA) this;
            SolidColorWallpaperPreview solidColorWallpaperPreview = c86273xA.A02;
            if (!C03410Fp.A08(((ActivityC02290Ap) solidColorWallpaperPreview).A0B)) {
                int A0B3 = c86273xA.A0B() - 1;
                int i4 = R.string.wallpaper_preview_chat_content_swipe_left;
                if (i == A0B3) {
                    i4 = R.string.wallpaper_preview_chat_content_swipe_right;
                }
                string3 = solidColorWallpaperPreview.getString(i4);
            } else if (i == 0) {
                string3 = solidColorWallpaperPreview.getString(R.string.wallpaper_preview_chat_content_swipe_left);
            } else if (i < c86273xA.A0B() - 1) {
                string3 = solidColorWallpaperPreview.getString(R.string.wallpaper_color_preview_swipe_left_or_right);
            } else {
                string3 = solidColorWallpaperPreview.getString(R.string.wallpaper_preview_chat_content_swipe_right);
            }
            if (!C03410Fp.A08(((ActivityC02290Ap) solidColorWallpaperPreview).A0B)) {
                int i5 = R.string.wallpaper_preview_chat_content_swipe_right;
                if (i == 0) {
                    i5 = R.string.wallpaper_preview_chat_content_swipe_left;
                }
                A1P = solidColorWallpaperPreview.getString(i5);
            } else {
                A1P = solidColorWallpaperPreview.A1P();
            }
            create = Pair.create(string3, A1P);
        }
        C2Z4 c2z4 = new C2Z4(this.A00, (String) create.first, (String) create.second, this.A01);
        c2z4.setLayoutParams(layoutParams);
        viewGroup.addView(c2z4);
        if (this instanceof C86353xI) {
            C86353xI c86353xI2 = (C86353xI) this;
            c2z4.setDownloadClickListener(new ViewOnClickEBaseShape1S0201000_I1(c86353xI2, i, c2z4, 4));
            List list = c86353xI2.A04;
            if (i < list.size()) {
                c86353xI2.A0F(c2z4, i);
                return c2z4;
            }
            int size = i - list.size();
            C81503p0 c81503p0 = new C81503p0(c2z4.A04, c2z4.getContext(), c2z4.A07, c2z4.A05, c2z4.A00, ((Number) c86353xI2.A06.get(size)).intValue(), ((Number) c86353xI2.A05.get(size)).intValue());
            c2z4.A02.setVisibility(8);
            DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity = c86353xI2.A02.A01;
            Set set = downloadableWallpaperPreviewActivity.A09;
            Integer valueOf = Integer.valueOf(i);
            set.add(valueOf);
            if (downloadableWallpaperPreviewActivity.A01.getCurrentItem() == i) {
                ((C2PT) downloadableWallpaperPreviewActivity).A00.setEnabled(true);
            }
            C0HS c0hs = (C0HS) c86353xI2.A07.put(valueOf, c81503p0);
            if (c0hs != null) {
                c0hs.A05(true);
            }
            c86353xI2.A03.ARy(c81503p0, new Void[0]);
            return c2z4;
        } else if (!(this instanceof C86343xH)) {
            C86273xA c86273xA2 = (C86273xA) this;
            SolidColorWallpaperPreview solidColorWallpaperPreview2 = c86273xA2.A02;
            c2z4.setBackgroundColor(solidColorWallpaperPreview2.A0C[i]);
            if (C03410Fp.A08(((ActivityC02290Ap) solidColorWallpaperPreview2).A0B)) {
                if (c86273xA2.A00) {
                    Context context2 = c2z4.getContext();
                    c2z4.A06.setImageDrawable(C02180Ae.A0Q(C02180Ae.A0N(context2, R.drawable.whatsapp_doodle), context2.getResources().getIntArray(R.array.wallpaper_doodle_tint_colors)[i]));
                } else {
                    c2z4.A06.setImageDrawable(null);
                }
                Map map = c86273xA2.A01;
                Integer valueOf2 = Integer.valueOf(i);
                map.put(valueOf2, Boolean.valueOf(c86273xA2.A00));
                c2z4.setTag(valueOf2);
            }
            return c2z4;
        } else {
            WallpaperPreview wallpaperPreview2 = ((C86343xH) this).A00;
            C81503p0 c81503p02 = new C81503p0(c2z4.A04, c2z4.getContext(), c2z4.A07, c2z4.A05, c2z4.A00, ((Number) wallpaperPreview2.A0B.get(i)).intValue(), ((Number) wallpaperPreview2.A0A.get(i)).intValue());
            C0HS c0hs2 = (C0HS) wallpaperPreview2.A0D.put(Integer.valueOf(i), c81503p02);
            if (c0hs2 != null) {
                c0hs2.A05(true);
            }
            ((C0HS) c81503p02).A02.execute(new Void[0]);
            return c2z4;
        }
    }

    @Override // X.C0ZT
    public void A0D(ViewGroup viewGroup, int i, Object obj) {
        if (this instanceof C86353xI) {
            viewGroup.removeView((View) obj);
            C0HS c0hs = (C0HS) ((C86353xI) this).A07.remove(Integer.valueOf(i));
            if (c0hs != null) {
                c0hs.A05(true);
            }
        } else if (!(this instanceof C86343xH)) {
            viewGroup.removeView((View) obj);
        } else {
            viewGroup.removeView((View) obj);
            C0HS c0hs2 = (C0HS) ((C86343xH) this).A00.A0D.remove(Integer.valueOf(i));
            if (c0hs2 != null) {
                c0hs2.A05(true);
            }
        }
    }
}
