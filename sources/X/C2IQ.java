package X;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapeItemView;
import com.whatsapp.util.Log;
import java.lang.ref.Reference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2IQ */
/* loaded from: classes2.dex */
public class C2IQ extends AbstractC04890Mh implements C2IR {
    public C61512wH A02;
    public String A03;
    public boolean A06;
    public final /* synthetic */ C2IP A07;
    public LinkedHashMap A04 = new LinkedHashMap();
    public List A05 = new ArrayList();
    public int A00 = 0;
    public int A01 = 0;

    public C2IQ(C2IP c2ip) {
        this.A07 = c2ip;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A05.size() + ((this.A07.A01 == 0 && this.A03 == null) ? this.A01 + (this.A06 ? 1 : 0) : 0);
    }

    @Override // X.AbstractC04890Mh
    public int A0D(int i) {
        return A0G(i).A02;
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        if (i != 0) {
            if (i == 1) {
                boolean z = this.A07.A0o;
                int i2 = R.layout.shape_picker_section;
                if (z) {
                    i2 = R.layout.shape_picker_v2_section;
                }
                return new C3HN(LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false));
            } else if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        C000200d.A0p("shapepicker/onCreateViewHolder/invalid state ", i);
                        return null;
                    }
                    return new C0TS(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.shape_picker_sticker_packs_loading, viewGroup, false)) { // from class: X.3HL
                    };
                }
                return new C0TS(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.shape_picker_loading_section, viewGroup, false)) { // from class: X.3HK
                };
            } else {
                return new C3HM(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.shape_picker_no_results, viewGroup, false));
            }
        }
        return new C3HO(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.shape_picker_grid_item, viewGroup, false));
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        int intValue;
        Drawable drawable;
        C30H A0G = A0G(i);
        int i2 = A0G.A02;
        if (i2 != 0) {
            if (i2 == 1) {
                ((C3HN) c0ts).A00.setText(A0G.A04);
                return;
            } else if (i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    StringBuilder A0P = C000200d.A0P("shapepicker/onBindViewHolder/invalid state ");
                    A0P.append(i2);
                    Log.e(A0P.toString());
                    return;
                }
                return;
            } else {
                C2IP c2ip = this.A07;
                C40081rY c40081rY = c2ip.A0T;
                Activity activity = c2ip.A0F;
                BitmapDrawable A01 = c40081rY.A01(activity, -1, new C43941yG(new int[]{129335}));
                C3HM c3hm = (C3HM) c0ts;
                c3hm.A01.setText(activity.getString(R.string.stickers_no_results, A0G.A04));
                c3hm.A00.setImageDrawable(A01);
                return;
            }
        }
        C3HO c3ho = (C3HO) c0ts;
        ShapeItemView shapeItemView = c3ho.A01;
        C2K1 c2k1 = A0G.A03;
        if (c2k1 != null) {
            C2IP c2ip2 = this.A07;
            Activity activity2 = c2ip2.A0F;
            shapeItemView.setContentDescription(c2k1.A97(activity2));
            c3ho.A00 = c2k1;
            shapeItemView.A00 = c2k1.ADR();
            C2K1 c2k12 = c3ho.A00;
            if (c2k12.ARe()) {
                Reference reference = (Reference) c2ip2.A0l.get(c2k1.ADR());
                Drawable drawable2 = reference == null ? null : (Drawable) reference.get();
                if (drawable2 == null) {
                    drawable = new Drawable() { // from class: X.30I
                        public final Paint A00;

                        @Override // android.graphics.drawable.Drawable
                        public int getOpacity() {
                            return -3;
                        }

                        @Override // android.graphics.drawable.Drawable
                        public void setAlpha(int i3) {
                        }

                        @Override // android.graphics.drawable.Drawable
                        public void setColorFilter(ColorFilter colorFilter) {
                        }

                        {
                            Paint paint = new Paint(1);
                            this.A00 = paint;
                            paint.setColor(285212672);
                            this.A00.setStyle(Paint.Style.FILL);
                        }

                        @Override // android.graphics.drawable.Drawable
                        public void draw(Canvas canvas) {
                            Rect bounds = getBounds();
                            canvas.drawCircle(bounds.centerX(), bounds.centerY(), bounds.width() >> 1, this.A00);
                        }
                    };
                } else {
                    drawable = drawable2;
                }
                shapeItemView.setImageDrawable(drawable);
                if (drawable2 == null) {
                    Message obtain = Message.obtain(c2ip2.A07, 0, 0, 0, shapeItemView);
                    String ADR = c2k1.ADR();
                    Bundle bundle = new Bundle();
                    bundle.putString("tag_bundle_key", ADR);
                    obtain.setData(bundle);
                    c2ip2.A07.sendMessageAtFrontOfQueue(obtain);
                }
            } else {
                C2HG A6w = c2k12.A6w(shapeItemView.getContext(), c2ip2.A0S, true);
                A6w.A08(c2ip2.A02);
                if (A6w.A0D()) {
                    A6w.A06(c2ip2.A00);
                }
                shapeItemView.setImageDrawable(new Drawable(A6w, c2ip2.A0o) { // from class: X.30J
                    public final C2HG A00;
                    public final boolean A01;

                    @Override // android.graphics.drawable.Drawable
                    public int getOpacity() {
                        return -3;
                    }

                    @Override // android.graphics.drawable.Drawable
                    public void setAlpha(int i3) {
                    }

                    @Override // android.graphics.drawable.Drawable
                    public void setColorFilter(ColorFilter colorFilter) {
                    }

                    {
                        this.A00 = A6w;
                        this.A01 = r2;
                    }

                    @Override // android.graphics.drawable.Drawable
                    public void draw(Canvas canvas) {
                        C2HG c2hg;
                        float A00;
                        Rect bounds = getBounds();
                        if (this.A01) {
                            c2hg = this.A00;
                            A00 = c2hg.A00() / 2.0f;
                        } else {
                            c2hg = this.A00;
                            A00 = c2hg.A00();
                        }
                        c2hg.A0F(new RectF(), bounds.left + A00, bounds.top + A00, bounds.right - A00, bounds.bottom - A00);
                        c2hg.A09(canvas);
                    }
                });
            }
            Pair A11 = c2ip2.A0b.A11();
            int i3 = A0G.A00;
            if (i3 == 0) {
                intValue = ((Number) A11.first).intValue();
            } else {
                intValue = ((Number) A11.second).intValue();
            }
            int i4 = A0G.A01 % intValue;
            boolean z = c2ip2.A0o;
            int ABm = z ? 0 : c2k1.ABm(activity2, i3);
            int i5 = ABm << 1;
            int min = Math.min(i5, activity2.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_custom_grid_padding));
            if (z) {
                return;
            }
            if (A0G.A01 >= 0) {
                if (i4 == 0) {
                    shapeItemView.setPadding(min, ABm, i5 - min, ABm);
                    ((LinearLayout) c0ts.A0H).setGravity(19);
                    return;
                } else if (i4 == intValue - 1) {
                    shapeItemView.setPadding(i5 - min, ABm, min, ABm);
                    ((LinearLayout) c0ts.A0H).setGravity(21);
                    return;
                }
            }
            shapeItemView.setPadding(ABm, ABm, ABm, ABm);
            ((LinearLayout) c0ts.A0H).setGravity(17);
            return;
        }
        throw null;
    }

    public final C30H A0G(int i) {
        if (i < this.A05.size()) {
            return (C30H) this.A05.get(i);
        }
        if (this.A06 && i == A0C() - 1) {
            return new C30H(4);
        }
        int size = i - this.A05.size();
        for (List list : this.A04.values()) {
            if (size < list.size()) {
                return (C30H) list.get(size);
            }
            size -= list.size();
        }
        throw new IllegalArgumentException(C000200d.A0E("Could not translate adapter position ", i, " to a grid item."));
    }

    public final List A0H(C42531vt c42531vt) {
        Collection collection = (Collection) this.A07.A0j.get(c42531vt.A0D);
        if (collection != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C30H(c42531vt.A0F, 1));
            C2IP.A02(arrayList, collection);
            return arrayList;
        }
        throw null;
    }

    public void A0I() {
        ArrayList arrayList;
        C30N[] values;
        int size = this.A05.size();
        this.A05.clear();
        C0S7 c0s7 = super.A01;
        c0s7.A03(0, size);
        C2IP c2ip = this.A07;
        int i = this.A00 << 1;
        boolean z = c2ip.A0o;
        boolean z2 = true;
        if (z) {
            int i2 = c2ip.A01;
            if (i2 != 0 && i2 != 2) {
                arrayList = new ArrayList();
                if (c2ip.A0n && c2ip.A08 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    EnumC47722Ci[] values2 = EnumC47722Ci.values();
                    int length = values2.length;
                    int i3 = 0;
                    while (i3 < length) {
                        EnumC47722Ci enumC47722Ci = values2[i3];
                        arrayList2.add(Integer.valueOf(arrayList.size()));
                        arrayList.add(new C30H(c2ip.A0F.getString(enumC47722Ci.titleResId), z2 ? 1 : 0));
                        int i4 = 0;
                        for (int[] iArr : enumC47722Ci.emojiData) {
                            C3HD c3hd = new C3HD(iArr, c2ip.A0T, c2ip.A0U);
                            arrayList.add(new C30H(c3hd, 0, i4));
                            i4++;
                            c2ip.A0m.put(c3hd.ADR(), c3hd);
                        }
                        i3++;
                        z2 = true;
                    }
                    C67953Hm c67953Hm = c2ip.A08;
                    if (c67953Hm != null) {
                        if (arrayList2.size() != C67953Hm.A01.length) {
                            z2 = false;
                        }
                        C000700j.A06(z2);
                        C67973Ho c67973Ho = c67953Hm.A09;
                        c67973Ho.A01 = arrayList2;
                        Collections.sort(arrayList2);
                        ((AbstractC04890Mh) c67973Ho).A01.A00();
                        c67973Ho.A0G();
                        c67953Hm.A00();
                    } else {
                        throw null;
                    }
                } else {
                    c2ip.A09(arrayList, new C30N[]{C30N.PEOPLE, C30N.NATURE, C30N.FOOD, C30N.ACTIVITY, C30N.SYMBOLS, C30N.OBJECTS});
                }
            } else {
                arrayList = new ArrayList();
                if (z) {
                    C67993Hq c67993Hq = c2ip.A0A;
                    if (c67993Hq != null && !c67993Hq.A01) {
                        c67993Hq.A01 = true;
                        C67973Ho c67973Ho2 = c67993Hq.A09;
                        c67973Ho2.A01.add(0);
                        Collections.sort(c67973Ho2.A01);
                        ((AbstractC04890Mh) c67973Ho2).A01.A00();
                        c67973Ho2.A0G();
                        c67993Hq.A00();
                    }
                    C2K0 c2k0 = c2ip.A0V;
                    if (((C2AN) c2k0).A03 != null) {
                        if (c2k0.A00() > 0) {
                            arrayList.add(new C30H(c2ip.A0F.getString(R.string.emoji_recents_title), 1));
                            Iterator it = ((AbstractCollection) c2k0.A06(i)).iterator();
                            int i5 = 0;
                            while (it.hasNext()) {
                                arrayList.add(new C30H((C2K1) it.next(), 1, i5));
                                i5++;
                            }
                        } else {
                            C67993Hq c67993Hq2 = c2ip.A0A;
                            if (c67993Hq2 != null && c67993Hq2.A01) {
                                c67993Hq2.A01 = false;
                                C67973Ho c67973Ho3 = c67993Hq2.A09;
                                c67973Ho3.A01.remove(0);
                                Collections.sort(c67973Ho3.A01);
                                ((AbstractC04890Mh) c67973Ho3).A01.A00();
                                c67973Ho3.A0G();
                                c67993Hq2.A00();
                            }
                        }
                    } else {
                        arrayList.add(new C30H(c2ip.A0F.getString(R.string.emoji_recents_title), 1));
                        arrayList.add(new C30H(3));
                    }
                }
                c2ip.A09(arrayList, new C30N[]{C30N.CONTENT_STICKERS, C30N.SHAPES});
                if (c2ip.A0D && c2ip.A0C.size() > 0) {
                    arrayList.add(new C30H(c2ip.A0F.getString(R.string.shape_picker_favorite_stickers), 1));
                    C2IP.A02(arrayList, c2ip.A0C);
                } else if (!c2ip.A0D) {
                    arrayList.add(new C30H(c2ip.A0F.getString(R.string.shape_picker_favorite_stickers), 1));
                    arrayList.add(new C30H(3));
                }
            }
        } else {
            arrayList = new ArrayList();
            c2ip.A0V.A00();
            for (C30N c30n : C30N.values()) {
                if (z) {
                    arrayList.add(new C30H(c2ip.A0F.getString(c30n.sectionResId), 1));
                }
                C2K1[] c2k1Arr = c30n.shapeData;
                int i6 = 0;
                for (C2K1 c2k1 : c2k1Arr) {
                    int ACY = c2k1.ACY(z);
                    int i7 = -1;
                    if (z) {
                        i7 = i6;
                    }
                    arrayList.add(new C30H(c2k1, ACY, i7));
                    i6++;
                }
            }
        }
        this.A05 = arrayList;
        c0s7.A02(0, arrayList.size());
        if (size != this.A05.size()) {
            A0K();
        }
    }

    public final void A0J() {
        this.A01 = 0;
        for (List list : this.A04.values()) {
            if (list.size() <= 1) {
                return;
            }
            this.A01 = list.size() + this.A01;
        }
    }

    public final void A0K() {
        C2IP c2ip = this.A07;
        if (c2ip.A0A != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = this.A04.entrySet().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (i >= this.A01 - 1) {
                    break;
                }
                arrayList.add(c2ip.A0i.get(entry.getKey()));
                arrayList2.add(Integer.valueOf(this.A05.size() + i));
                i += ((List) entry.getValue()).size();
            }
            C67993Hq c67993Hq = c2ip.A0A;
            if (c67993Hq != null) {
                C000700j.A06(arrayList.size() == arrayList2.size());
                List list = c67993Hq.A03;
                list.clear();
                list.addAll(arrayList);
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (c67993Hq.A01) {
                    arrayList3.add(0);
                }
                C67973Ho c67973Ho = c67993Hq.A09;
                c67973Ho.A01 = arrayList3;
                Collections.sort(arrayList3);
                ((AbstractC04890Mh) c67973Ho).A01.A00();
                c67973Ho.A0G();
                c67993Hq.A00();
                return;
            }
            throw null;
        }
    }

    public void A0L(String str) {
        List list = (List) this.A04.get(str);
        if (list != null) {
            int i = 0;
            for (Map.Entry entry : this.A04.entrySet()) {
                if (str.equals(entry.getKey())) {
                    this.A04.remove(str);
                    A0J();
                    int size = list.size();
                    super.A01.A03(this.A05.size() + i, size);
                    A0K();
                    return;
                }
                i += ((List) entry.getValue()).size();
            }
            throw new IllegalArgumentException(C000200d.A0I("Sticker pack id ", str, " is not contained in data set"));
        }
    }

    @Override // X.C2IR
    public void AOG(C61512wH c61512wH) {
        if (c61512wH.equals(this.A02)) {
            this.A05 = new ArrayList();
            List list = c61512wH.A01;
            if (list.size() > 0) {
                for (int i = 0; i < list.size(); i++) {
                    C2K1 c2k1 = (C2K1) list.get(i);
                    this.A07.A0m.put(c2k1.ADR(), c2k1);
                    this.A05.add(new C30H((C2K1) list.get(i), 0, i));
                }
            } else {
                this.A05.add(new C30H(this.A03, 2));
            }
            super.A01.A00();
        }
    }
}
