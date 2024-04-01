package X;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.util.ViewOnClickCListenerShape2S0101000_I1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3ot  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C81433ot extends AbstractC04890Mh {
    public final ContentResolver A00;
    public final Handler A01;
    public final AbstractC000600i A02;
    public final C01B A03;
    public final C011605s A04;
    public final C001200o A05;
    public final C02F A06;
    public final C003701t A07;
    public final C2AQ A08;
    public final C81393op A09;
    public final C81413or A0A;
    public final C02C A0B;
    public final InterfaceC002901k A0C;
    public final List A0D;
    public final Map A0E;

    public C81433ot(List list, C81393op c81393op, Handler handler, ContentResolver contentResolver, C011605s c011605s, C003701t c003701t, AbstractC000600i abstractC000600i, C001200o c001200o, InterfaceC002901k interfaceC002901k, C01B c01b, C2AQ c2aq, C02F c02f, C02C c02c) {
        HashMap hashMap = new HashMap();
        this.A0E = hashMap;
        this.A0A = new C81413or(hashMap);
        this.A0D = list;
        this.A09 = c81393op;
        this.A01 = handler;
        this.A00 = contentResolver;
        this.A04 = c011605s;
        this.A07 = c003701t;
        this.A02 = abstractC000600i;
        this.A05 = c001200o;
        this.A0C = interfaceC002901k;
        this.A03 = c01b;
        this.A08 = c2aq;
        this.A06 = c02f;
        this.A0B = c02c;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A0D.size();
    }

    @Override // X.AbstractC04890Mh
    public int A0D(int i) {
        return ((Number) this.A0D.get(i)).intValue();
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        if (i == 5) {
            final C81413or c81413or = this.A0A;
            final View inflate = LayoutInflater.from(context).inflate(R.layout.wallpaper_category_use_default_wallpaper, (ViewGroup) null);
            return new AbstractC81443ou(inflate, c81413or) { // from class: X.3xD
            };
        } else if (i == 4) {
            final C81413or c81413or2 = this.A0A;
            final View inflate2 = LayoutInflater.from(context).inflate(R.layout.wallpaper_category_remove_custom_wallpaper, (ViewGroup) null);
            return new AbstractC81443ou(inflate2, c81413or2) { // from class: X.3xC
            };
        } else if (i == 3) {
            Handler handler = this.A01;
            ContentResolver contentResolver = this.A00;
            C011605s c011605s = this.A04;
            return new C86283xB(new C86313xE(context), new C52132a7(c011605s, contentResolver, handler), this.A07, this.A02, this.A05, this.A0C, this.A03, this.A08, this.A06, this.A0B, this.A0A);
        } else {
            return new C86323xF(new C86313xE(context), this.A0A);
        }
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        String string;
        GradientDrawable gradientDrawable;
        AbstractC81443ou abstractC81443ou = (AbstractC81443ou) c0ts;
        abstractC81443ou.A0H.setOnClickListener(new ViewOnClickCListenerShape2S0101000_I1(this, i, 4));
        Integer num = (Integer) this.A0D.get(i);
        if (!(abstractC81443ou instanceof C86323xF)) {
            if (abstractC81443ou instanceof C86283xB) {
                C86283xB c86283xB = (C86283xB) abstractC81443ou;
                Context context = c86283xB.A0H.getContext();
                String string2 = context.getString(R.string.wallpaper_categories_my_photos);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setSize(1, 1);
                gradientDrawable2.setColor(C02160Ac.A00(context, R.color.wallpaper_category_my_photos_background));
                c86283xB.A09.A00(string2, gradientDrawable2, C02180Ae.A0O(context, R.drawable.ic_attachment_gallery, R.color.wallpaper_category_my_photos_placeholder_tint));
                if (!c86283xB.A01 && c86283xB.A00 == null) {
                    final C81453ov c81453ov = new C81453ov(c86283xB, string2);
                    final C001200o c001200o = c86283xB.A04;
                    final AbstractC000600i abstractC000600i = c86283xB.A02;
                    final C01B c01b = c86283xB.A03;
                    final C2AQ c2aq = c86283xB.A08;
                    final C02F c02f = c86283xB.A05;
                    final C02C c02c = c86283xB.A0A;
                    C0HS c0hs = new C0HS(c81453ov, c001200o, abstractC000600i, c01b, c2aq, c02f, c02c) { // from class: X.3BO
                        public final AbstractC000600i A00;
                        public final C01B A01;
                        public final C001200o A02;
                        public final C02F A03;
                        public final C2AQ A04;
                        public final C81453ov A05;
                        public final C02C A06;

                        {
                            this.A05 = c81453ov;
                            this.A02 = c001200o;
                            this.A00 = abstractC000600i;
                            this.A01 = c01b;
                            this.A04 = c2aq;
                            this.A03 = c02f;
                            this.A06 = c02c;
                        }

                        @Override // X.C0HS
                        public Object A07(Object[] objArr) {
                            C001200o c001200o2 = this.A02;
                            AbstractC000600i abstractC000600i2 = this.A00;
                            C01B c01b2 = this.A01;
                            C2AQ c2aq2 = this.A04;
                            C02F c02f2 = this.A03;
                            C02C c02c2 = this.A06;
                            InterfaceC52102a4 interfaceC52102a4 = null;
                            C61112vc c61112vc = new C61112vc();
                            c61112vc.A01 = 2;
                            c61112vc.A00 = 1;
                            c61112vc.A02 = 2;
                            c61112vc.A03 = null;
                            InterfaceC52142a8 A00 = C61122vd.A00(c001200o2, abstractC000600i2, c01b2, c2aq2, c02f2, c02c2, c61112vc);
                            for (int i2 = 0; i2 < A00.getCount() && interfaceC52102a4 == null; i2++) {
                                interfaceC52102a4 = A00.AB8(i2);
                            }
                            return interfaceC52102a4;
                        }

                        @Override // X.C0HS
                        public void A09(Object obj) {
                            final InterfaceC52102a4 interfaceC52102a4 = (InterfaceC52102a4) obj;
                            if (interfaceC52102a4 == null) {
                                C86283xB c86283xB2 = this.A05.A00;
                                c86283xB2.A00 = null;
                                ((AbstractC81443ou) c86283xB2).A00.A00.remove(Integer.valueOf(c86283xB2.A00()));
                            } else if (A04()) {
                            } else {
                                C81453ov c81453ov2 = this.A05;
                                final C86283xB c86283xB3 = c81453ov2.A00;
                                final String str = c81453ov2.A01;
                                final Context context2 = c86283xB3.A0H.getContext();
                                final int dimensionPixelSize = c86283xB3.A04.A00.getResources().getDimensionPixelSize(R.dimen.gallery_picker_folder_thumb_size);
                                final InterfaceC61152vg interfaceC61152vg = new InterfaceC61152vg() { // from class: X.3ow
                                    @Override // X.InterfaceC61152vg
                                    public String ADR() {
                                        return "MY_PHOTOS_VIEW_HOLDER_TAG";
                                    }

                                    @Override // X.InterfaceC61152vg
                                    public Bitmap AG1() {
                                        if (C86283xB.this.A09.getTag() != this) {
                                            return null;
                                        }
                                        Bitmap AVV = interfaceC52102a4.AVV(dimensionPixelSize);
                                        return AVV == null ? MediaGalleryFragmentBase.A0Q : AVV;
                                    }
                                };
                                InterfaceC61162vh interfaceC61162vh = new InterfaceC61162vh() { // from class: X.3ox
                                    @Override // X.InterfaceC61162vh
                                    public void A5d() {
                                    }

                                    @Override // X.InterfaceC61162vh
                                    public /* synthetic */ void AKC() {
                                    }

                                    @Override // X.InterfaceC61162vh
                                    public void APF(Bitmap bitmap, boolean z) {
                                        C86283xB c86283xB4 = C86283xB.this;
                                        C86313xE c86313xE = c86283xB4.A09;
                                        if (c86313xE.getTag() != interfaceC61152vg || bitmap == MediaGalleryFragmentBase.A0Q) {
                                            return;
                                        }
                                        c86283xB4.A01 = true;
                                        c86313xE.A00(str, new BitmapDrawable(context2.getResources(), bitmap), null);
                                    }
                                };
                                c86283xB3.A09.setTag(interfaceC61152vg);
                                c86283xB3.A07.A02(interfaceC61152vg, interfaceC61162vh);
                                ((AbstractC81443ou) c86283xB3).A00.A00.remove(Integer.valueOf(c86283xB3.A00()));
                            }
                        }
                    };
                    c86283xB.A00 = c0hs;
                    c86283xB.A0B.ARy(c0hs, new Object[0]);
                }
            }
        } else {
            C86323xF c86323xF = (C86323xF) abstractC81443ou;
            Context context2 = c86323xF.A0H.getContext();
            int intValue = num.intValue();
            Drawable drawable = null;
            if (intValue == 0) {
                string = context2.getString(R.string.wallpaper_categories_bright);
                gradientDrawable = C02180Ae.A0N(context2, R.drawable.ic_wallpaper_thumb_bright);
            } else if (intValue == 1) {
                string = context2.getString(R.string.wallpaper_categories_dark);
                gradientDrawable = C02180Ae.A0N(context2, R.drawable.ic_wallpaper_thumb_dark);
            } else if (intValue == 2) {
                string = context2.getString(R.string.solid_color_wallpaper);
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setSize(1, 1);
                gradientDrawable3.setColor(C02160Ac.A00(context2, R.color.wallpaper_color_scandal_green));
                gradientDrawable = new LayerDrawable(new Drawable[]{gradientDrawable3, C02180Ae.A0Q(C02180Ae.A0N(context2, R.drawable.whatsapp_doodle), C02160Ac.A00(context2, R.color.wallpaper_doodle_tint_color_scandal_green))});
            } else if (intValue == 3) {
                string = context2.getString(R.string.wallpaper_categories_my_photos);
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setSize(1, 1);
                gradientDrawable4.setColor(C02160Ac.A00(context2, R.color.btn_gray_normal));
                drawable = C02180Ae.A0O(context2, R.drawable.ic_attachment_gallery, R.color.white);
                gradientDrawable = gradientDrawable4;
            } else {
                StringBuilder sb = new StringBuilder("Unknown categoryType: ");
                sb.append(num);
                throw new RuntimeException(sb.toString());
            }
            C86313xE c86313xE = c86323xF.A00;
            c86313xE.A00(string, gradientDrawable, drawable);
            c86313xE.setPreviewScaleType(intValue == 2 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_CROP);
        }
        C0HS c0hs2 = !(abstractC81443ou instanceof C86283xB) ? null : ((C86283xB) abstractC81443ou).A00;
        if (c0hs2 != null) {
            this.A0E.put(Integer.valueOf(i), c0hs2);
        }
    }
}
