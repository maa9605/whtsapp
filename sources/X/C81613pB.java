package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3pB */
/* loaded from: classes2.dex */
public class C81613pB extends AbstractC04890Mh {
    public final Resources A00;
    public final C003701t A01;
    public final C81633pD A02;
    public final InterfaceC002901k A03;
    public final Map A05 = new HashMap();
    public final List A04 = new ArrayList();

    public C81613pB(C003701t c003701t, InterfaceC002901k interfaceC002901k, Resources resources, C81633pD c81633pD) {
        this.A01 = c003701t;
        this.A03 = interfaceC002901k;
        this.A00 = resources;
        this.A02 = c81633pD;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A04.size();
    }

    @Override // X.AbstractC04890Mh
    public int A0D(int i) {
        return ((AbstractC71473Wg) this.A04.get(i)).A00;
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        if (i != 0 && i != 1) {
            LayoutInflater from = LayoutInflater.from(context);
            if (i == 3) {
                return new AbstractC81553p5(from.inflate(R.layout.downloadable_wallpaper_footer_view, (ViewGroup) null)) { // from class: X.3xJ
                };
            }
            C86373xK c86373xK = new C86373xK(from.inflate(R.layout.downloadable_wallpaper_header_view, (ViewGroup) null));
            c86373xK.A0H.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1(this, 15));
            return c86373xK;
        }
        C003701t c003701t = this.A01;
        InterfaceC002901k interfaceC002901k = this.A03;
        C86333xG c86333xG = new C86333xG(context);
        c86333xG.setScaleType(ImageView.ScaleType.CENTER_CROP);
        C86383xL c86383xL = new C86383xL(c86333xG, c003701t, interfaceC002901k);
        c86383xL.A0H.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, c86383xL, 15));
        return c86383xL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0HS, X.3pG] */
    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        AbstractC81553p5 abstractC81553p5 = (AbstractC81553p5) c0ts;
        List list = this.A04;
        int i2 = ((AbstractC71473Wg) list.get(i)).A00;
        if (i2 == 0) {
            File file = (File) ((AbstractC71473Wg) list.get(i)).A01;
            C86383xL c86383xL = (C86383xL) abstractC81553p5;
            C81663pG c81663pG = c86383xL.A00;
            if (c81663pG != null) {
                c81663pG.A05(true);
            }
            ?? r2 = new C0HS(c86383xL.A01, c86383xL.A0H.getContext(), c86383xL.A02, file) { // from class: X.3pG
                public final Context A00;
                public final ImageView A01;
                public final C003701t A02;
                public final File A03;

                {
                    this.A02 = r1;
                    this.A00 = r2;
                    this.A01 = r3;
                    this.A03 = file;
                }

                @Override // X.C0HS
                public Object A07(Object[] objArr) {
                    Point A00 = AbstractC40441sG.A00(this.A00);
                    try {
                        FileInputStream fileInputStream = new FileInputStream(this.A03);
                        Bitmap bitmap = C002701i.A0M(fileInputStream, AbstractC40441sG.A01(A00, true, this.A02)).A02;
                        fileInputStream.close();
                        return bitmap;
                    } catch (IOException | OutOfMemoryError e) {
                        Log.e("LoadThumbnailWallpaperImageTask/error when loading wallpaper resource", e);
                        return null;
                    }
                }

                @Override // X.C0HS
                public void A09(Object obj) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap != null) {
                        if (!A04()) {
                            this.A01.setImageBitmap(bitmap);
                        } else {
                            bitmap.recycle();
                        }
                    }
                }
            };
            c86383xL.A00 = r2;
            c86383xL.A03.ARy(r2, new Void[0]);
            this.A05.put(Integer.valueOf(i), c86383xL.A00);
        } else if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            C86373xK c86373xK = (C86373xK) abstractC81553p5;
            int i3 = ((Boolean) ((AbstractC71473Wg) list.get(i)).A01).booleanValue() ? 0 : 4;
            c86373xK.A00.setVisibility(i3);
            c86373xK.A01.setVisibility(i3);
        } else {
            C86383xL c86383xL2 = (C86383xL) abstractC81553p5;
            int intValue = ((Number) ((AbstractC71473Wg) list.get(i)).A01).intValue();
            Resources resources = this.A00;
            if (resources != null) {
                Drawable drawable = resources.getDrawable(intValue);
                C81663pG c81663pG2 = c86383xL2.A00;
                if (c81663pG2 != null) {
                    c81663pG2.A05(true);
                    c86383xL2.A00 = null;
                }
                c86383xL2.A02.setImageDrawable(drawable);
                return;
            }
            throw null;
        }
    }

    public void A0G(List list, C0FK c0fk, int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new AbstractC71473Wg((File) it.next()) { // from class: X.3p8
            });
        }
        if (i != 0) {
            if (i == 1) {
                arrayList.add(new AbstractC71473Wg(Boolean.TRUE) { // from class: X.3pA
                });
                arrayList.add(new AbstractC71473Wg() { // from class: X.3p9
                    {
                        Boolean bool = Boolean.FALSE;
                    }
                });
            } else {
                arrayList.add(new AbstractC71473Wg(Boolean.FALSE) { // from class: X.3pA
                });
                Object obj = c0fk.A00;
                if (obj == null) {
                    throw null;
                }
                for (Integer num : (List) obj) {
                    arrayList.add(new AbstractC71473Wg(num) { // from class: X.3p7
                    });
                }
            }
        }
        List list2 = this.A04;
        C14770nY A00 = C14820nd.A00(new AbstractC14760nX(list2, arrayList) { // from class: X.3p6
            public final List A00;
            public final List A01;

            {
                this.A01 = list2;
                this.A00 = arrayList;
            }

            @Override // X.AbstractC14760nX
            public int A00() {
                return this.A00.size();
            }

            @Override // X.AbstractC14760nX
            public int A01() {
                return this.A01.size();
            }

            @Override // X.AbstractC14760nX
            public boolean A03(int i2, int i3) {
                return ((AbstractC71473Wg) this.A01.get(i2)).A01.equals(((AbstractC71473Wg) this.A00.get(i3)).A01);
            }

            @Override // X.AbstractC14760nX
            public boolean A04(int i2, int i3) {
                return ((AbstractC71473Wg) this.A01.get(i2)).A00 == ((AbstractC71473Wg) this.A00.get(i3)).A00;
            }
        });
        list2.clear();
        list2.addAll(arrayList);
        A00.A02(new C1U9(this));
    }
}
