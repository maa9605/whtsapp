package com.whatsapp.util;

import X.AbstractC005302j;
import X.AbstractC12840kA;
import X.AbstractView$OnClickListenerC49532Ky;
import X.ActivityC02320As;
import X.AnonymousClass097;
import X.AnonymousClass334;
import X.C000200d;
import X.C018308n;
import X.C02180Ae;
import X.C06960Vv;
import X.C08950cN;
import X.C0AT;
import X.C0FK;
import X.C1M7;
import X.C2HC;
import X.C2WZ;
import X.C468628o;
import X.C58822rl;
import X.C643232x;
import X.C81393op;
import X.C81433ot;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.PromptDialogFragment;
import com.whatsapp.biz.catalog.CatalogCarouselDetailImageView;
import com.whatsapp.biz.catalog.CatalogImageListActivity;
import com.whatsapp.biz.catalog.CatalogMediaView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.gallerypicker.GalleryPickerLauncher;
import com.whatsapp.jid.UserJid;
import com.whatsapp.settings.chat.wallpaper.DefaultWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaper;
import com.whatsapp.settings.chat.wallpaper.WallpaperCategoriesActivity;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ViewOnClickCListenerShape2S0101000_I1 extends AbstractView$OnClickListenerC49532Ky {
    public int A00;
    public Object A01;
    public final int A02;

    public ViewOnClickCListenerShape2S0101000_I1(C58822rl c58822rl, int i) {
        this.A02 = 3;
        this.A01 = c58822rl;
        this.A00 = i;
    }

    public ViewOnClickCListenerShape2S0101000_I1(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    @Override // X.AbstractView$OnClickListenerC49532Ky
    public void A00(View view) {
        Bundle A01;
        Intent intent;
        switch (this.A02) {
            case 0:
                C643232x c643232x = (C643232x) this.A01;
                if (c643232x.A01.getTag(R.id.loaded_image_url) != null) {
                    ThumbnailButton thumbnailButton = c643232x.A01;
                    CatalogCarouselDetailImageView catalogCarouselDetailImageView = c643232x.A02;
                    String str = catalogCarouselDetailImageView.A05.A09;
                    int i = this.A00;
                    thumbnailButton.setTag(C06960Vv.A01(str, i));
                    CatalogMediaView.A00(catalogCarouselDetailImageView.getContext(), catalogCarouselDetailImageView.A05, new C1M7(catalogCarouselDetailImageView.getContext()), i, c643232x.A01, catalogCarouselDetailImageView.A06);
                    catalogCarouselDetailImageView.A02.A02(6, 25, catalogCarouselDetailImageView.A05.A09, catalogCarouselDetailImageView.A06);
                    return;
                }
                return;
            case 1:
                C643232x c643232x2 = (C643232x) this.A01;
                if (c643232x2.A01.getTag(R.id.loaded_image_url) != null) {
                    CatalogCarouselDetailImageView catalogCarouselDetailImageView2 = c643232x2.A02;
                    C468628o c468628o = catalogCarouselDetailImageView2.A05;
                    ThumbnailButton thumbnailButton2 = c643232x2.A01;
                    int i2 = this.A00;
                    Context context = catalogCarouselDetailImageView2.getContext();
                    UserJid userJid = catalogCarouselDetailImageView2.A06;
                    Activity A0G = C02180Ae.A0G(context, ActivityC02320As.class);
                    if (A0G != null) {
                        Intent intent2 = new Intent(A0G, CatalogImageListActivity.class);
                        intent2.putExtra("product", c468628o);
                        intent2.putExtra("image_index", i2);
                        intent2.putExtra("cached_jid", userJid.getRawString());
                        C0AT.A0e(thumbnailButton2, C000200d.A0H("thumb-transition-", C06960Vv.A01(c468628o.A09, i2)));
                        A0G.startActivity(intent2, C2HC.A04(A0G, thumbnailButton2, C0AT.A0G(thumbnailButton2)));
                    }
                    catalogCarouselDetailImageView2.A02.A02(6, 25, catalogCarouselDetailImageView2.A05.A09, catalogCarouselDetailImageView2.A06);
                    return;
                }
                return;
            case 2:
                Context context2 = view.getContext();
                AnonymousClass334 anonymousClass334 = (AnonymousClass334) this.A01;
                CatalogImageListActivity catalogImageListActivity = anonymousClass334.A03;
                CatalogMediaView.A00(context2, catalogImageListActivity.A08, anonymousClass334.A02, this.A00, view, catalogImageListActivity.A09);
                catalogImageListActivity.A04.A02(9, 28, catalogImageListActivity.A08.A09, catalogImageListActivity.A09);
                return;
            case 3:
                C58822rl c58822rl = (C58822rl) this.A01;
                C2WZ c2wz = c58822rl.A03;
                Intent A0k = c2wz.A0k();
                final ActivityC02320As activityC02320As = (ActivityC02320As) C018308n.A01(c2wz.getContext(), ActivityC02320As.class);
                if (C2HC.A00) {
                    ArrayList arrayList = new ArrayList();
                    int i3 = this.A00;
                    if (i3 >= 3 && c2wz.A07.size() != 4) {
                        int i4 = 0;
                        do {
                            ((C58822rl) c2wz.A0I.get(i4)).A00(arrayList, (AnonymousClass097) c2wz.A07.get(i4));
                            i4++;
                        } while (i4 < 3);
                    } else {
                        A0k.putExtra("start_index", i3);
                        c58822rl.A00(arrayList, (AnonymousClass097) c2wz.A07.get(i3));
                    }
                    A01 = C08950cN.A00(activityC02320As, (C0FK[]) arrayList.toArray(new C0FK[0])).A01();
                    activityC02320As.A0V(new AbstractC12840kA() { // from class: X.38S
                        @Override // X.AbstractC12840kA
                        public void A00(List list, List list2, List list3) {
                            activityC02320As.A0V(null);
                        }

                        @Override // X.AbstractC12840kA
                        public void A01(List list, Map map) {
                            View A05;
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                String str2 = (String) it.next();
                                if (!map.containsKey(str2) && (A05 = C2HC.A05(activityC02320As.getWindow().getDecorView(), str2)) != null) {
                                    map.put(str2, A05);
                                }
                            }
                        }
                    });
                } else {
                    A01 = null;
                }
                activityC02320As.startActivity(A0k, A01);
                return;
            case 4:
                C81433ot c81433ot = (C81433ot) this.A01;
                C81393op c81393op = c81433ot.A09;
                int intValue = ((Number) c81433ot.A0D.get(this.A00)).intValue();
                WallpaperCategoriesActivity wallpaperCategoriesActivity = c81393op.A00;
                boolean z = c81393op.A01;
                if (intValue == 0 || intValue == 1) {
                    AbstractC005302j abstractC005302j = wallpaperCategoriesActivity.A09;
                    boolean z2 = intValue == 0;
                    intent = new Intent(wallpaperCategoriesActivity, DownloadableWallpaperPickerActivity.class);
                    intent.putExtra("chat_jid", abstractC005302j);
                    intent.putExtra("is_using_global_wallpaper", z);
                    intent.putExtra("IS_BRIGHT_KEY", z2);
                } else if (intValue == 2) {
                    AbstractC005302j abstractC005302j2 = wallpaperCategoriesActivity.A09;
                    intent = new Intent(wallpaperCategoriesActivity, SolidColorWallpaper.class);
                    intent.putExtra("chat_jid", abstractC005302j2);
                    intent.putExtra("is_using_global_wallpaper", z);
                } else if (intValue == 3) {
                    AbstractC005302j abstractC005302j3 = wallpaperCategoriesActivity.A09;
                    intent = new Intent(wallpaperCategoriesActivity, GalleryPickerLauncher.class);
                    intent.putExtra("chat_jid", abstractC005302j3);
                    intent.putExtra("is_using_global_wallpaper", z);
                } else if (intValue == 4) {
                    Bundle A012 = C000200d.A01("dialog_id", 112);
                    A012.putString("message", wallpaperCategoriesActivity.getString(R.string.wallpaper_remove_custom_wallpaper_dialog_title));
                    A012.putString("positive_button", wallpaperCategoriesActivity.getString(R.string.wallpaper_remove_custom_wallpaper_dialog_remove_prompt));
                    A012.putString("negative_button", wallpaperCategoriesActivity.getString(R.string.cancel));
                    PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
                    promptDialogFragment.A0P(A012);
                    wallpaperCategoriesActivity.AUh(promptDialogFragment);
                    return;
                } else if (intValue != 5) {
                    return;
                } else {
                    AbstractC005302j abstractC005302j4 = wallpaperCategoriesActivity.A09;
                    intent = new Intent(wallpaperCategoriesActivity, DefaultWallpaperPreview.class);
                    intent.putExtra("chat_jid", abstractC005302j4);
                    intent.putExtra("is_using_global_wallpaper", z);
                }
                wallpaperCategoriesActivity.startActivityForResult(intent, 17);
                return;
            default:
                super.A00(view);
                return;
        }
    }
}
