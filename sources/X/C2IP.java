package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I0_2;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I0_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.ClearableEditText;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapeItemView;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2IP */
/* loaded from: classes2.dex */
public class C2IP {
    public float A00;
    public int A02;
    public ValueAnimator A03;
    public ValueAnimator A04;
    public HandlerThread A05;
    public C30L A06;
    public C30M A07;
    public C67953Hm A08;
    public AbstractC636430h A09;
    public C67993Hq A0A;
    public String A0B;
    public Set A0C;
    public boolean A0D;
    public boolean A0E;
    public final Activity A0F;
    public final View A0I;
    public final View A0J;
    public final View A0K;
    public final View A0L;
    public final View A0M;
    public final ViewGroup A0N;
    public final ImageView A0O;
    public final TextView A0P;
    public final TextView A0Q;
    public final ClearableEditText A0R;
    public final C002301c A0S;
    public final C40081rY A0T;
    public final C43811y1 A0U;
    public final C2K0 A0V;
    public final C2OK A0W;
    public final C30K A0Y;
    public final C3HP A0a;
    public final ShapePickerRecyclerView A0b;
    public final C53292cG A0c;
    public final C43791xz A0d;
    public final C2Bk A0f;
    public final C2MB A0g;
    public final InterfaceC002901k A0h;
    public final ConcurrentHashMap A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final Map A0i = new HashMap();
    public final Map A0j = new HashMap();
    public final View.OnClickListener A0H = new ViewOnClickEBaseShape2S0100000_I0_2(this, 49);
    public final View.OnClickListener A0G = new ViewOnClickEBaseShape3S0100000_I0_3(this, 0);
    public final C25R A0e = new C2IO(this);
    public final C3HG A0X = new C3HG(this);
    public final ConcurrentHashMap A0l = new ConcurrentHashMap();
    public final ConcurrentHashMap A0k = new ConcurrentHashMap();
    public int A01 = 2;
    public final C2IQ A0Z = new C2IQ(this);

    /* JADX WARN: Type inference failed for: r0v59, types: [X.30M] */
    /* JADX WARN: Type inference failed for: r0v61, types: [X.30L] */
    public C2IP(final Activity activity, final C2MB c2mb, InterfaceC002901k interfaceC002901k, C40081rY c40081rY, C43811y1 c43811y1, C2K0 c2k0, C002301c c002301c, C2Bk c2Bk, C2AS c2as, C53292cG c53292cG, C2OK c2ok, C43791xz c43791xz, View view, C30K c30k) {
        this.A0F = activity;
        this.A0g = c2mb;
        this.A0h = interfaceC002901k;
        this.A0T = c40081rY;
        this.A0U = c43811y1;
        this.A0V = c2k0;
        this.A0S = c002301c;
        this.A0f = c2Bk;
        this.A0c = c53292cG;
        this.A0W = c2ok;
        this.A0d = c43791xz;
        this.A0Y = c30k;
        this.A0o = c43811y1.A01;
        this.A0n = c43811y1.A00;
        this.A0N = (ViewGroup) view;
        this.A0K = C0AT.A0D(view, R.id.search_container);
        this.A0R = (ClearableEditText) C0AT.A0D(view, R.id.search_entry);
        this.A0O = (ImageView) C0AT.A0D(view, R.id.search_icon);
        this.A0J = C0AT.A0D(view, R.id.search_button);
        this.A0Q = (TextView) C0AT.A0D(view, R.id.sticker_tab_button);
        this.A0P = (TextView) C0AT.A0D(view, R.id.emoji_tab_button);
        this.A0L = C0AT.A0D(view, R.id.tab_buttons_container);
        this.A0M = C0AT.A0D(view, R.id.shape_picker_gradient);
        this.A0I = C0AT.A0D(view, R.id.shape_picker_header);
        this.A0R.setHint(activity.getString(R.string.search));
        this.A0R.getBackground().setAlpha(this.A0R.hasFocus() ? 230 : 204);
        this.A0R.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.30D
            {
                C2IP.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                C2IP c2ip = C2IP.this;
                C2MB c2mb2 = c2mb;
                Activity activity2 = activity;
                c2ip.A0R.getBackground().setAlpha(z ? 230 : 204);
                if (z) {
                    c2mb2.A02(view2);
                    activity2.getWindow().setSoftInputMode(5);
                    return;
                }
                c2mb2.A01(view2);
                activity2.getWindow().setSoftInputMode(3);
            }
        });
        this.A0R.addTextChangedListener(new C2JS(this));
        ClearableEditText clearableEditText = this.A0R;
        View.OnClickListener onClickListener = this.A0G;
        clearableEditText.A01 = onClickListener;
        this.A0J.setOnClickListener(onClickListener);
        ShapePickerRecyclerView shapePickerRecyclerView = (ShapePickerRecyclerView) C0AT.A0D(view, R.id.shapes);
        this.A0b = shapePickerRecyclerView;
        shapePickerRecyclerView.setAdapter(this.A0Z);
        List A01 = C30O.A01(this.A0n);
        this.A0m = new ConcurrentHashMap();
        AbstractList abstractList = (AbstractList) A01;
        Iterator it = abstractList.iterator();
        while (it.hasNext()) {
            C2K1 c2k1 = (C2K1) it.next();
            this.A0m.put(c2k1.ADR(), c2k1);
        }
        if (this.A0o) {
            this.A0b.setItemAnimator(null);
            interfaceC002901k.ARy(new C0HS(c2k0, this.A0Z, this.A0m) { // from class: X.3HI
                public final C2K0 A00;
                public final C2IQ A01;
                public final Map A02;

                {
                    this.A00 = c2k0;
                    this.A01 = r2;
                    this.A02 = r3;
                }

                @Override // X.C0HS
                public Object A07(Object[] objArr) {
                    this.A00.A07();
                    return null;
                }

                @Override // X.C0HS
                public void A09(Object obj) {
                    C2K0 c2k02 = this.A00;
                    Iterator it2 = ((AbstractCollection) c2k02.A06(c2k02.A00())).iterator();
                    while (it2.hasNext()) {
                        C2K1 c2k12 = (C2K1) it2.next();
                        this.A02.put(c2k12.ADR(), c2k12);
                    }
                    this.A01.A0I();
                }
            }, new Void[0]);
            this.A08 = new C67953Hm((RecyclerView) view.findViewById(R.id.emoji_shape_subcategories_recyclerview), this.A0b, this.A0X);
            C67993Hq c67993Hq = new C67993Hq(c2as, (RecyclerView) view.findViewById(R.id.sticker_shape_subcategories_recyclerview), this.A0b, this.A0X);
            this.A0A = c67993Hq;
            this.A09 = c67993Hq;
            A0B(true);
            C2C0 c2c0 = new C2C0(c2as, new C25Z(c2ok, this) { // from class: X.3HQ
                public final C2OK A00;
                public final WeakReference A01;

                {
                    this.A00 = c2ok;
                    this.A01 = new WeakReference(this);
                }

                @Override // X.C25Z
                public void AMb(C42531vt c42531vt) {
                    C2IP c2ip = (C2IP) this.A01.get();
                    if (c2ip != null) {
                        List A00 = C2IP.A00(c2ip, c42531vt);
                        C2IP.A01(c2ip, A00);
                        Map map = c2ip.A0i;
                        String str = c42531vt.A0D;
                        map.put(str, c42531vt);
                        c2ip.A0j.put(str, A00);
                        C2IQ c2iq = c2ip.A0Z;
                        c2iq.A04.put(str, c2iq.A0H(c42531vt));
                        c2iq.A0J();
                        ((AbstractC04890Mh) c2iq).A01.A04(c2iq.A05.size(), c2iq.A0C() - c2iq.A05.size(), null);
                        c2iq.A0K();
                    }
                }

                @Override // X.C25Z
                public void AMc(List list) {
                    C2IP c2ip = (C2IP) this.A01.get();
                    if (c2ip != null) {
                        for (int i = 0; i < list.size(); i++) {
                            C42531vt c42531vt = (C42531vt) list.get(i);
                            List A00 = C2IP.A00(c2ip, c42531vt);
                            C2IP.A01(c2ip, A00);
                            Map map = c2ip.A0i;
                            String str = c42531vt.A0D;
                            map.put(str, c42531vt);
                            c2ip.A0j.put(str, A00);
                        }
                        C2IQ c2iq = c2ip.A0Z;
                        C000700j.A07(c2iq.A06);
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            C42531vt c42531vt2 = (C42531vt) it2.next();
                            c2iq.A04.put(c42531vt2.A0D, c2iq.A0H(c42531vt2));
                        }
                        c2iq.A0J();
                        ((AbstractC04890Mh) c2iq).A01.A02(c2iq.A05.size(), c2iq.A0C() - c2iq.A05.size());
                    }
                }

                @Override // X.C25Z
                public void AMd() {
                    C2IP c2ip = (C2IP) this.A01.get();
                    if (c2ip != null) {
                        C2OK c2ok2 = this.A00;
                        synchronized (c2ok2) {
                            c2ok2.A05.clear();
                        }
                        for (Collection collection : c2ip.A0j.values()) {
                            c2ok2.A02(collection);
                        }
                        C2IQ c2iq = c2ip.A0Z;
                        C000700j.A07(c2iq.A06);
                        c2iq.A06 = false;
                        c2iq.A04(c2iq.A0C());
                        c2iq.A0K();
                    }
                }

                @Override // X.C25Z
                public void AMe(String str) {
                    C2IP c2ip = (C2IP) this.A01.get();
                    if (c2ip != null) {
                        c2ip.A0i.remove(str);
                        c2ip.A0j.remove(str);
                        c2ip.A0Z.A0L(str);
                    }
                }
            });
            C2IQ c2iq = this.A0Z;
            C000700j.A07(!c2iq.A06);
            c2iq.A06 = true;
            c2iq.A03(c2iq.A05.size());
            interfaceC002901k.ARy(c2c0, new Void[0]);
            this.A0D = false;
            this.A0C = new LinkedHashSet();
            InterfaceC49102Im interfaceC49102Im = new InterfaceC49102Im() { // from class: X.3HB
                {
                    C2IP.this = this;
                }

                @Override // X.InterfaceC49102Im
                public final void AP4(List list) {
                    C2IP c2ip = C2IP.this;
                    c2ip.A08(list, false);
                    c2ip.A0D = true;
                    c2ip.A0Z.A0I();
                }
            };
            if (c2as != null) {
                c2as.A0S.ARy(new C82673qt(c2as, interfaceC49102Im), new Void[0]);
                this.A0J.setVisibility(0);
                this.A0O.setVisibility(0);
                this.A0L.setVisibility(0);
                this.A0R.setVisibility(4);
                this.A0R.setAlwaysShowClearIcon(true);
                view.findViewById(R.id.shape_picker_header_background).setVisibility(0);
                this.A0Q.setOnClickListener(this.A0H);
                this.A0P.setOnClickListener(this.A0H);
                if (c002301c.A0N()) {
                    this.A0Q.setBackgroundResource(R.drawable.shape_picker_right_tab_background);
                    this.A0P.setBackgroundResource(R.drawable.shape_picker_left_tab_background);
                }
                this.A0b.setClipToPadding(true);
                int dimensionPixelSize = this.A0F.getResources().getDimensionPixelSize(R.dimen.shape_picker_search_entry_extra_left_padding);
                ClearableEditText clearableEditText2 = this.A0R;
                clearableEditText2.setPadding(dimensionPixelSize, clearableEditText2.getPaddingTop(), this.A0R.getPaddingRight(), this.A0R.getPaddingBottom());
                ViewGroup.LayoutParams layoutParams = this.A0R.getLayoutParams();
                layoutParams.height = this.A0F.getResources().getDimensionPixelOffset(R.dimen.shape_picker_expanded_search_height);
                this.A0R.setLayoutParams(layoutParams);
                this.A0M.setVisibility(8);
                this.A0b.A0k(new AbstractC08920cK(c002301c.A0N(), this.A0F.getResources().getDimensionPixelSize(R.dimen.shape_picker_shape_top_margin), this.A0F.getResources().getDimensionPixelSize(R.dimen.shape_picker_section_top_margin)) { // from class: X.3HJ
                    public final int A00;
                    public final int A01;
                    public final boolean A02;

                    {
                        C2IP.this = this;
                        this.A02 = r2;
                        this.A01 = r3;
                        this.A00 = r4;
                    }

                    @Override // X.AbstractC08920cK
                    public void A01(Rect rect, View view2, RecyclerView recyclerView, C0Y0 c0y0) {
                        view2.getLayoutParams();
                        rect.set(0, 0, 0, 0);
                        C000700j.A06(recyclerView instanceof ShapePickerRecyclerView);
                        ShapePickerRecyclerView shapePickerRecyclerView2 = (ShapePickerRecyclerView) recyclerView;
                        int A00 = RecyclerView.A00(view2);
                        if (A00 != -1) {
                            C30H A0G = C2IP.this.A0Z.A0G(A00);
                            shapePickerRecyclerView2.A12();
                            int i = shapePickerRecyclerView2.A03;
                            int shapePickerV2Spacing = shapePickerRecyclerView2.getShapePickerV2Spacing();
                            int i2 = A0G.A02;
                            if (i2 == 0) {
                                int i3 = A0G.A01 % i;
                                int i4 = (i3 * shapePickerV2Spacing) / i;
                                int i5 = shapePickerV2Spacing - (((i3 + 1) * shapePickerV2Spacing) / i);
                                boolean z = this.A02;
                                int i6 = i4;
                                if (z) {
                                    i6 = i5;
                                }
                                rect.left = i6;
                                if (!z) {
                                    i4 = i5;
                                }
                                rect.right = i4;
                                rect.top = this.A01;
                            } else if (i2 != 1) {
                            } else {
                                rect.top = this.A00;
                            }
                        }
                    }
                });
                c2Bk.A01(this.A0e);
            } else {
                throw null;
            }
        }
        C3HP c3hp = new C3HP(this, this.A0F);
        this.A0a = c3hp;
        this.A0b.A0m(c3hp);
        HandlerThread handlerThread = new HandlerThread("Shapes Thread", 10);
        this.A05 = handlerThread;
        handlerThread.start();
        this.A07 = new Handler(this.A0F, this.A05.getLooper()) { // from class: X.30M
            public final Context A00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r4);
                C2IP.this = this;
                if (r4 != null) {
                    this.A00 = r3;
                    return;
                }
                throw null;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                Object obj;
                C2IP c2ip = C2IP.this;
                Bundle data = message.getData();
                if (c2ip != null) {
                    String string = data.getString("tag_bundle_key");
                    if (string != null) {
                        ConcurrentHashMap concurrentHashMap = c2ip.A0l;
                        Reference reference = (Reference) concurrentHashMap.get(string);
                        if (reference == null || (obj = reference.get()) == null) {
                            Context context = this.A00;
                            if (c2ip != null) {
                                Resources resources = context.getResources();
                                boolean z = c2ip.A0o;
                                int i = R.dimen.doodle_shape_picker_grid_size;
                                if (z) {
                                    i = R.dimen.shape_picker_new_shape_size;
                                }
                                int dimensionPixelSize2 = resources.getDimensionPixelSize(i);
                                C2K1 c2k12 = (C2K1) c2ip.A0m.get(string);
                                ConcurrentHashMap concurrentHashMap2 = c2ip.A0k;
                                Reference reference2 = (Reference) concurrentHashMap2.get(string);
                                C2HG c2hg = reference2 != null ? (C2HG) reference2.get() : null;
                                if (c2hg == null) {
                                    if (c2k12 != null) {
                                        c2hg = c2k12.A6w(context, c2ip.A0S, true);
                                        concurrentHashMap2.put(string, new SoftReference(c2hg));
                                        if (c2hg == null) {
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                if (c2hg.A0C()) {
                                    if ((!(c2hg instanceof C68693Lb) ? 1 : ((C68693Lb) c2hg).A01) == 1) {
                                        c2hg.A08(c2ip.A02);
                                    }
                                }
                                if (c2hg.A0D()) {
                                    c2hg.A06(c2ip.A00);
                                }
                                if (!(c2hg instanceof C3L7)) {
                                    obj = !(c2hg instanceof C3L6) ? null : ((C3L6) c2hg).A00;
                                } else {
                                    obj = ((C3L7) c2hg).A01;
                                }
                                if (obj == null) {
                                    float f = dimensionPixelSize2;
                                    c2hg.A0F(new RectF(), 0.0f, 0.0f, f, f);
                                    Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize2, dimensionPixelSize2, Bitmap.Config.ARGB_8888);
                                    c2hg.A09(new Canvas(createBitmap));
                                    obj = new BitmapDrawable(context.getResources(), createBitmap);
                                }
                            } else {
                                throw null;
                            }
                        }
                        concurrentHashMap.put(string, new SoftReference(obj));
                        View view2 = (View) message.obj;
                        if (view2 != null) {
                            view2.setTag(obj);
                            Message obtain = Message.obtain(c2ip.A06, 0, 0, 0, view2);
                            Bundle bundle = new Bundle();
                            bundle.putString("tag_bundle_key", string);
                            obtain.setData(bundle);
                            obtain.sendToTarget();
                            return;
                        }
                        return;
                    }
                    throw null;
                }
                throw null;
            }
        };
        this.A06 = new Handler(this.A0F.getMainLooper()) { // from class: X.30L
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r3);
                C2IP.this = this;
                if (r3 != null) {
                    return;
                }
                throw null;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.obj != null) {
                    C2IP c2ip = C2IP.this;
                    Bundle data = message.getData();
                    if (c2ip != null) {
                        String string = data.getString("tag_bundle_key");
                        if (string != null) {
                            ShapeItemView shapeItemView = (ShapeItemView) message.obj;
                            if (string.equals(shapeItemView.A00)) {
                                shapeItemView.setImageDrawable((Drawable) shapeItemView.getTag());
                                return;
                            }
                            return;
                        }
                        throw null;
                    }
                    throw null;
                }
            }
        };
        int A03 = A03(R.dimen.doodle_shape_picker_grid_size);
        for (int min = Math.min(((this.A0F.getResources().getDisplayMetrics().widthPixels * this.A0F.getResources().getDisplayMetrics().heightPixels) / (A03 * A03)) + 1, abstractList.size() - 1); min >= 0; min--) {
            Message obtain = Message.obtain(this.A07, 0, 0, 0, null);
            String ADR = ((C2K1) abstractList.get(min)).ADR();
            Bundle bundle = new Bundle();
            bundle.putString("tag_bundle_key", ADR);
            obtain.setData(bundle);
            obtain.sendToTarget();
        }
        if (this.A0o) {
            c53292cG.A00 = new InterfaceC61502wG() { // from class: X.3HC
                {
                    C2IP.this = this;
                }

                @Override // X.InterfaceC61502wG
                public final void AOQ(boolean z) {
                    C2IP c2ip = C2IP.this;
                    c2ip.A0K.post(new RunnableEBaseShape0S0110000_I0(c2ip, z, 9));
                }
            };
            A0A(c53292cG.A02);
            c53292cG.A01();
        }
        A0C(false, 0L);
        A04(0);
        this.A0L.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.30A
            {
                C2IP.this = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C2IP c2ip = C2IP.this;
                TextView textView = c2ip.A0Q;
                int width = textView.getWidth();
                TextView textView2 = c2ip.A0P;
                int width2 = textView2.getWidth();
                if (width > width2) {
                    textView = textView2;
                }
                int max = Math.max(width, width2);
                ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                if (max != layoutParams2.width) {
                    layoutParams2.width = max;
                    textView.post(new RunnableEBaseShape3S0200000_I0_3(textView, layoutParams2, 6));
                }
                if (c2ip.A0E) {
                    View view3 = c2ip.A0I;
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                    int A032 = c2ip.A03(R.dimen.shape_picker_landscape_button_spacing) + c2ip.A03(R.dimen.shape_picker_search_collapsed_width) + (max << 1);
                    if (marginLayoutParams.width != A032) {
                        marginLayoutParams.width = A032;
                        view3.post(new RunnableEBaseShape3S0200000_I0_3(c2ip, marginLayoutParams, 7));
                    }
                }
            }
        });
    }

    public static List A00(C2IP c2ip, C42531vt c42531vt) {
        if (c2ip != null) {
            ArrayList arrayList = new ArrayList();
            for (C0JM c0jm : c42531vt.A04) {
                arrayList.add(new C2K2(c0jm, c2ip.A0U, c2ip.A0d));
            }
            return arrayList;
        }
        throw null;
    }

    public static void A01(C2IP c2ip, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2K2 c2k2 = (C2K2) it.next();
            c2ip.A0m.put(c2k2.ADR(), c2k2);
        }
    }

    public static final void A02(List list, Collection collection) {
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            list.add(new C30H((C2K2) it.next(), 0, i));
            i++;
        }
    }

    public final int A03(int i) {
        return this.A0F.getResources().getDimensionPixelSize(i);
    }

    public final void A04(int i) {
        TextView textView;
        TextView textView2;
        if (this.A01 == i || i == 2) {
            return;
        }
        if (i == 0) {
            textView = this.A0Q;
            textView2 = this.A0P;
        } else {
            textView = this.A0P;
            textView2 = this.A0Q;
        }
        Activity activity = this.A0F;
        textView.setTextColor(C02160Ac.A00(activity, R.color.shape_picker_tab_selected_text_color));
        textView.getBackground().setAlpha(230);
        textView2.setTextColor(C02160Ac.A00(activity, R.color.shape_picker_tab_deselected_text_color));
        textView2.getBackground().setAlpha(51);
        this.A01 = i;
        C2IQ c2iq = this.A0Z;
        c2iq.A03 = null;
        c2iq.A02 = null;
        c2iq.A0I();
        ((AbstractC04890Mh) c2iq).A01.A00();
        this.A0b.A0Y(0);
        A0B(false);
        this.A09 = this.A01 == 0 ? this.A0A : this.A08;
        A0B(true);
    }

    public final void A05(final int i, final int i2, long j, AnimatorListenerAdapter animatorListenerAdapter) {
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.A03 = ofFloat;
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        } else {
            valueAnimator.removeAllUpdateListeners();
            this.A03.removeAllListeners();
        }
        this.A03.setDuration(j);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A0K.getLayoutParams();
        this.A03.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.30B
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i3 = i2;
                int i4 = i;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                float animatedFraction = valueAnimator2.getAnimatedFraction();
                float f = 1.0f - animatedFraction;
                marginLayoutParams2.setMargins(0, (int) ((f * i4) + (animatedFraction * i3)), 0, 0);
            }
        });
        this.A03.addListener(animatorListenerAdapter);
        this.A03.start();
    }

    public final void A06(final int i, final int i2, long j, AnimatorListenerAdapter animatorListenerAdapter) {
        ValueAnimator valueAnimator = this.A04;
        if (valueAnimator == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.A04 = ofFloat;
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        } else {
            valueAnimator.removeAllUpdateListeners();
            this.A04.removeAllListeners();
        }
        this.A04.setDuration(j);
        View view = this.A0J;
        final ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.setVisibility(0);
        final int width = view.getWidth();
        final int height = view.getHeight();
        this.A04.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.30C
            {
                C2IP.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C2IP c2ip = C2IP.this;
                ViewGroup.LayoutParams layoutParams2 = layoutParams;
                int i3 = i;
                int i4 = width;
                int i5 = i2;
                int i6 = height;
                float animatedFraction = valueAnimator2.getAnimatedFraction();
                float f = 1.0f - animatedFraction;
                layoutParams2.width = (int) ((i3 * animatedFraction) + (i4 * f));
                layoutParams2.height = (int) ((animatedFraction * i5) + (f * i6));
                c2ip.A0J.setLayoutParams(layoutParams2);
            }
        });
        this.A04.addListener(animatorListenerAdapter);
        this.A04.start();
    }

    public final void A07(String str) {
        this.A0B = str;
        C53292cG c53292cG = this.A0c;
        if (c53292cG.A02) {
            if (TextUtils.isEmpty(str)) {
                C2IQ c2iq = this.A0Z;
                c2iq.A03 = null;
                c2iq.A02 = null;
                c2iq.A0I();
                ((AbstractC04890Mh) c2iq).A01.A00();
                return;
            }
            C2IQ c2iq2 = this.A0Z;
            C61512wH A00 = c53292cG.A00(str, this.A01 == 1, false);
            C61512wH c61512wH = c2iq2.A02;
            if (c61512wH != null) {
                c61512wH.A00(null);
            }
            c2iq2.A02 = A00;
            c2iq2.A03 = str;
            A00.A00(c2iq2);
        }
    }

    public final void A08(Collection collection, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C2K2 c2k2 = new C2K2((C0JM) it.next(), this.A0U, this.A0d);
            this.A0m.put(c2k2.ADR(), c2k2);
            linkedHashSet.add(c2k2);
        }
        Set set = this.A0C;
        if (z) {
            linkedHashSet.addAll(set);
            this.A0C = linkedHashSet;
        } else {
            set.addAll(linkedHashSet);
        }
        C2OK c2ok = this.A0W;
        Set<C2K1> set2 = this.A0C;
        synchronized (c2ok) {
            Map map = c2ok.A04;
            map.clear();
            for (C2K1 c2k1 : set2) {
                C2OK.A01(c2k1, map);
            }
        }
    }

    public final void A09(List list, C30N[] c30nArr) {
        C2K1[] c2k1Arr;
        for (C30N c30n : c30nArr) {
            boolean z = this.A0o;
            if (z) {
                list.add(new C30H(this.A0F.getString(c30n.sectionResId), 1));
            }
            int i = 0;
            for (C2K1 c2k1 : c30n.shapeData) {
                int ACY = c2k1.ACY(z);
                int i2 = -1;
                if (z) {
                    i2 = i;
                }
                list.add(new C30H(c2k1, ACY, i2));
                i++;
            }
        }
    }

    public final void A0A(boolean z) {
        if (z) {
            this.A0K.setVisibility(0);
            if (this.A0N.getVisibility() != 0) {
                this.A0b.A0Y(0);
                this.A0a.A01 = 0;
                return;
            }
            return;
        }
        this.A0K.setVisibility(4);
        this.A0b.A0Y(0);
        this.A0a.A01 = 0;
    }

    public final void A0B(boolean z) {
        AbstractC636430h abstractC636430h = this.A09;
        if (abstractC636430h != null) {
            abstractC636430h.A01 = z;
            abstractC636430h.A00();
        }
    }

    public final void A0C(boolean z, long j) {
        if (this.A0o) {
            if (z) {
                int width = this.A0R.getWidth();
                Activity activity = this.A0F;
                int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.shape_picker_expanded_search_height);
                AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: X.30E
                    {
                        C2IP.this = this;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        C2IP c2ip = C2IP.this;
                        c2ip.A0J.setVisibility(4);
                        ClearableEditText clearableEditText = c2ip.A0R;
                        clearableEditText.setVisibility(0);
                        c2ip.A0O.setImageResource(R.drawable.ic_shape_picker_search_active);
                        clearableEditText.requestFocus();
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        C2IP c2ip = C2IP.this;
                        c2ip.A0J.setClickable(false);
                        c2ip.A0L.setVisibility(4);
                    }
                };
                A06(width, dimensionPixelSize, j, animatorListenerAdapter);
                if (!this.A0E) {
                    A05(A03(R.dimen.search_container_top_margin), activity.getResources().getDimensionPixelSize(R.dimen.search_container_expanded_top_margin), j, animatorListenerAdapter);
                    return;
                }
                return;
            }
            Activity activity2 = this.A0F;
            int dimensionPixelSize2 = activity2.getResources().getDimensionPixelSize(R.dimen.shape_picker_search_collapsed_width);
            int dimensionPixelSize3 = activity2.getResources().getDimensionPixelSize(R.dimen.shape_picker_collapsed_search_height);
            AnimatorListenerAdapter animatorListenerAdapter2 = new AnimatorListenerAdapter() { // from class: X.30F
                {
                    C2IP.this = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    C2IP c2ip = C2IP.this;
                    c2ip.A0J.setClickable(true);
                    c2ip.A0L.setVisibility(0);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    C2IP c2ip = C2IP.this;
                    ClearableEditText clearableEditText = c2ip.A0R;
                    clearableEditText.clearFocus();
                    c2ip.A0O.setImageResource(R.drawable.ic_shape_picker_search);
                    c2ip.A0J.setVisibility(0);
                    clearableEditText.setVisibility(4);
                }
            };
            A06(dimensionPixelSize2, dimensionPixelSize3, j, animatorListenerAdapter2);
            if (this.A0E) {
                return;
            }
            A05(A03(R.dimen.search_container_expanded_top_margin), A03(R.dimen.search_container_top_margin), j, animatorListenerAdapter2);
        }
    }
}
