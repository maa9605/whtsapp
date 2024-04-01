package X;

import X.C2GV;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.ContactLiveLocationThumbnail;
import com.whatsapp.location.DragBottomSheetIndicator;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1;
import com.whatsapp.util.ViewOnClickCListenerShape9S0100000_I0_1;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2GV */
/* loaded from: classes2.dex */
public abstract class C2GV implements LocationListener, C0EM, View.OnCreateContextMenuListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A05;
    public float A07;
    public float A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0D;
    public Activity A0E;
    public Bitmap A0G;
    public Bitmap A0H;
    public Drawable A0I;
    public Location A0J;
    public View A0K;
    public View A0L;
    public View A0M;
    public View A0N;
    public View A0O;
    public View A0P;
    public View A0Q;
    public View A0R;
    public View A0S;
    public View A0T;
    public View A0U;
    public TextView A0V;
    public TextView A0W;
    public RecyclerView A0X;
    public RecyclerView A0Y;
    public BottomSheetBehavior A0Z;
    public BottomSheetBehavior A0a;
    public C0Zn A0b;
    public AbstractC005302j A0c;
    public UserJid A0d;
    public ContactLiveLocationThumbnail A0e;
    public ContactLiveLocationThumbnail A0f;
    public DragBottomSheetIndicator A0g;
    public C48852Hb A0h;
    public C48852Hb A0i;
    public C62622yI A0j;
    public C2H0 A0k;
    public C2H1 A0l;
    public C0K0 A0m;
    public C0K0 A0n;
    public C0K0 A0o;
    public boolean A0q;
    public boolean A0r;
    public final C018308n A0w;
    public final C0IK A0x;
    public final C018508q A0y;
    public final C02L A0z;
    public final C03320Ff A11;
    public final C0L7 A12;
    public final C05W A13;
    public final AnonymousClass008 A15;
    public final C018708s A16;
    public final C0L5 A17;
    public final C0LF A18;
    public final AnonymousClass012 A19;
    public final C02F A1A;
    public final C002301c A1B;
    public final C00A A1D;
    public final C03360Fk A1F;
    public final C41461tx A1I;
    public final C2AX A1J;
    public final C41471ty A1K;
    public final C010605h A1L;
    public final C2IY A1M;
    public volatile boolean A1V;
    public boolean A0t = false;
    public final Set A1U = new LinkedHashSet();
    public boolean A0s = false;
    public boolean A0u = false;
    public final List A1Q = new ArrayList();
    public final List A1S = new ArrayList();
    public final List A1R = new ArrayList();
    public final Handler A0v = new Handler(Looper.getMainLooper());
    public long A0C = 30000;
    public final Map A1T = new HashMap();
    public final Runnable A1P = new RunnableEBaseShape3S0100000_I0_3(this, 35);
    public final Runnable A1O = new RunnableEBaseShape3S0100000_I0_3(this, 34);
    public float A04 = 0.0f;
    public float A06 = 0.0f;
    public final InterfaceC453821q A1G = new InterfaceC453821q() { // from class: X.3EY
        {
            C2GV.this = this;
        }

        @Override // X.InterfaceC453821q
        public void AOv(AbstractC005302j abstractC005302j) {
            C2GV c2gv = C2GV.this;
            if (abstractC005302j.equals(c2gv.A0c)) {
                c2gv.A0J();
                c2gv.A0E.invalidateOptionsMenu();
            }
        }

        @Override // X.InterfaceC453821q
        public void APC(AbstractC005302j abstractC005302j) {
            C2GV c2gv = C2GV.this;
            if (abstractC005302j.equals(c2gv.A0c)) {
                C0K0 c0k0 = c2gv.A0o;
                if (c0k0 != null && c2gv.A0z.A0A(c0k0.A06)) {
                    c2gv.A0o = null;
                }
                c2gv.A0J();
                c2gv.A0E.invalidateOptionsMenu();
            }
        }
    };
    public final InterfaceC453921s A1H = new InterfaceC453921s() { // from class: X.3EZ
        {
            C2GV.this = this;
        }

        @Override // X.InterfaceC453921s
        public void ANe(C0K0 c0k0) {
            C21O c21o;
            C2GV c2gv = C2GV.this;
            C41461tx c41461tx = c2gv.A1I;
            AbstractC005302j abstractC005302j = c2gv.A0c;
            UserJid userJid = c0k0.A06;
            synchronized (c41461tx.A0S) {
                Map map = (Map) c41461tx.A0C().get(abstractC005302j);
                if (map != null) {
                    if (userJid == null) {
                        c21o = (C21O) map.get(abstractC005302j);
                    } else {
                        c21o = (C21O) map.get(userJid);
                    }
                    if (c21o != null) {
                        if (C41461tx.A02(c21o.A00, c41461tx.A0G.A05())) {
                            c2gv.A0T(c0k0);
                        }
                    }
                }
            }
        }

        @Override // X.InterfaceC453921s
        public void ANf(AbstractC005302j abstractC005302j, UserJid userJid) {
            C2GV c2gv = C2GV.this;
            if (c2gv.A0c.equals(abstractC005302j)) {
                c2gv.A0J();
            }
        }

        @Override // X.InterfaceC453921s
        public void ANg(AbstractC005302j abstractC005302j, UserJid userJid) {
            C2GV c2gv = C2GV.this;
            if (c2gv.A0c.equals(abstractC005302j)) {
                if (userJid == null) {
                    userJid = UserJid.of(abstractC005302j);
                }
                C0K0 c0k0 = c2gv.A0o;
                if (c0k0 != null && c0k0.A06.equals(userJid)) {
                    c2gv.A0o = null;
                }
                Set set = c2gv.A1U;
                synchronized (set) {
                    set.add(userJid);
                }
                c2gv.A0J();
            }
        }
    };
    public final Runnable A1N = new RunnableEBaseShape3S0100000_I0_3(this, 37);
    public final C00T A1C = new C00T() { // from class: X.3Ea
        {
            C2GV.this = this;
        }

        @Override // X.C00T
        public void A0C(AnonymousClass092 anonymousClass092, int i) {
            if (anonymousClass092 instanceof C04300Jq) {
                C2GV c2gv = C2GV.this;
                if (c2gv.A0c.equals(anonymousClass092.A0n.A00)) {
                    int i2 = ((C04300Jq) anonymousClass092).A00;
                    if (i2 == 5 || i2 == 7) {
                        C02L c02l = c2gv.A0z;
                        c02l.A05();
                        UserJid userJid = c02l.A03;
                        if (userJid != null) {
                            if (userJid.equals(anonymousClass092.A0A())) {
                                c2gv.A0E.finish();
                                return;
                            }
                            return;
                        }
                        throw null;
                    }
                }
            }
        }
    };
    public final C0GA A14 = new C0GA() { // from class: X.3Eb
        {
            C2GV.this = this;
        }

        @Override // X.C0GA
        public void A00() {
            ((AbstractC04890Mh) C2GV.this.A0h).A01.A00();
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            ((AbstractC04890Mh) C2GV.this.A0h).A01.A00();
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            ((AbstractC04890Mh) C2GV.this.A0h).A01.A00();
        }
    };
    public final C0GC A10 = new C0GC() { // from class: X.3Ec
        {
            C2GV.this = this;
        }

        @Override // X.C0GC
        public void A00(AbstractC005302j abstractC005302j) {
            ((AbstractC04890Mh) C2GV.this.A0h).A01.A00();
        }
    };
    public final C0GE A1E = new C0GE() { // from class: X.3Ed
        {
            C2GV.this = this;
        }

        @Override // X.C0GE
        public void A00(Set set) {
            ((AbstractC04890Mh) C2GV.this.A0h).A01.A00();
        }
    };
    public boolean A0p = false;
    public BroadcastReceiver A0F = new BroadcastReceiver() { // from class: X.2yG
        {
            C2GV.this = this;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction() == null || !intent.getAction().matches("android.location.PROVIDERS_CHANGED")) {
                return;
            }
            C2GV c2gv = C2GV.this;
            boolean A08 = c2gv.A0x.A08();
            if (c2gv.A0q != A08) {
                c2gv.A0q = A08;
                C0K0 c0k0 = c2gv.A0n;
                if (c0k0 != null) {
                    if (A08) {
                        c2gv.A0p = true;
                    } else {
                        c0k0.A05 = 0L;
                        c2gv.A0J();
                    }
                }
                c2gv.A0D = 0L;
                c2gv.A0K();
            }
        }
    };

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public C2GV(AnonymousClass012 anonymousClass012, C018508q c018508q, C02L c02l, C2IY c2iy, C018308n c018308n, C0L5 c0l5, C41471ty c41471ty, C0L7 c0l7, C05W c05w, C018708s c018708s, C002301c c002301c, AnonymousClass008 anonymousClass008, C00A c00a, C03320Ff c03320Ff, C02F c02f, C0IK c0ik, C41461tx c41461tx, C0LF c0lf, C03360Fk c03360Fk, C2AX c2ax, C010605h c010605h) {
        this.A19 = anonymousClass012;
        this.A0y = c018508q;
        this.A0z = c02l;
        this.A1M = c2iy;
        this.A0w = c018308n;
        this.A17 = c0l5;
        this.A1K = c41471ty;
        this.A12 = c0l7;
        this.A13 = c05w;
        this.A16 = c018708s;
        this.A1B = c002301c;
        this.A15 = anonymousClass008;
        this.A1D = c00a;
        this.A11 = c03320Ff;
        this.A0x = c0ik;
        this.A1A = c02f;
        this.A1I = c41461tx;
        this.A0r = c02f.A04();
        this.A18 = c0lf;
        this.A1F = c03360Fk;
        this.A1J = c2ax;
        this.A1L = c010605h;
    }

    public static double A00(double d) {
        double sin = Math.sin((d * 3.141592653589793d) / 180.0d);
        return Math.max(Math.min(Math.log((sin + 1.0d) / (1.0d - sin)) / 2.0d, 3.141592653589793d), -3.141592653589793d) / 2.0d;
    }

    public static final String A01(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0K0) it.next()).A06.getRawString());
        }
        Collections.sort(arrayList);
        return TextUtils.join("|", arrayList);
    }

    public static boolean A02(LatLngBounds latLngBounds) {
        LatLng latLng = latLngBounds.A01;
        double d = latLng.A00;
        LatLng latLng2 = latLngBounds.A00;
        if (d - latLng2.A00 > 80.0d) {
            return false;
        }
        double d2 = latLng2.A01 - latLng.A01;
        if (d2 < 0.0d) {
            d2 += 360.0d;
        }
        return d2 <= 90.0d;
    }

    public Dialog A03(int i) {
        if (i != 0) {
            if (i != 2) {
                return null;
            }
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.2xt
                {
                    C2GV.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C2GV c2gv = C2GV.this;
                    c2gv.A0E.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 0);
                    C002701i.A18(c2gv.A0E, 2);
                }
            };
            C019208x c019208x = new C019208x(this.A0E);
            C002301c c002301c = this.A1B;
            String A06 = c002301c.A06(R.string.gps_required_title);
            C019308y c019308y = c019208x.A01;
            c019308y.A0I = A06;
            c019308y.A0E = c002301c.A06(R.string.gps_required_body);
            c019308y.A0J = true;
            c019208x.A08(c002301c.A06(R.string.ok), onClickListener);
            return c019208x.A00();
        }
        C019208x c019208x2 = new C019208x(this.A0E);
        C002301c c002301c2 = this.A1B;
        String A062 = c002301c2.A06(R.string.live_location_stop_sharing_dialog);
        C019308y c019308y2 = c019208x2.A01;
        c019308y2.A0E = A062;
        c019308y2.A0J = true;
        c019308y2.A0F = c002301c2.A06(R.string.cancel);
        c019308y2.A03 = null;
        c019208x2.A08(c002301c2.A06(R.string.live_location_stop), new DialogInterface.OnClickListener() { // from class: X.2xu
            {
                C2GV.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C2GV c2gv = C2GV.this;
                C002701i.A18(c2gv.A0E, 0);
                AbstractC005302j abstractC005302j = c2gv.A0c;
                if (abstractC005302j != null) {
                    c2gv.A1I.A0R(abstractC005302j);
                }
            }
        });
        DialogInterfaceC019408z A00 = c019208x2.A00();
        A00.requestWindowFeature(1);
        return A00;
    }

    public Bitmap A04(C2H1 c2h1) {
        ContactLiveLocationThumbnail contactLiveLocationThumbnail;
        View view;
        List list;
        boolean z;
        Bitmap A00;
        ArrayList arrayList = new ArrayList();
        int i = c2h1.A00;
        if (i == 1) {
            contactLiveLocationThumbnail = this.A0f;
            view = this.A0Q;
            list = c2h1.A04;
            if (list.size() == 1) {
                C06C A0A = this.A13.A0A(((C0K0) list.get(0)).A06);
                C0LF c0lf = this.A18;
                Activity activity = this.A0E;
                Bitmap A02 = c0lf.A02(activity, A0A, activity.getResources().getDimensionPixelSize(R.dimen.live_location_selected_avatar_size), this.A0E.getResources().getDimension(R.dimen.live_location_selected_avatar_radius), true);
                if (A02 == null) {
                    C0L7 c0l7 = this.A12;
                    A02 = c0l7.A00.A00(this.A0E, c0l7.A03(A0A));
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(A02);
            } else {
                for (int i2 = 0; i2 < Math.min(list.size(), 4); i2++) {
                    C06C A0A2 = this.A13.A0A(((C0K0) list.get(i2)).A06);
                    C0LF c0lf2 = this.A18;
                    Activity activity2 = this.A0E;
                    Bitmap A022 = c0lf2.A02(activity2, A0A2, activity2.getResources().getDimensionPixelSize(R.dimen.live_location_selected_avatar_size), 0.0f, true);
                    if (A022 == null) {
                        A022 = this.A0H;
                    }
                    arrayList.add(A022);
                }
                z = false;
            }
            contactLiveLocationThumbnail.setAlpha(1.0f);
        } else {
            contactLiveLocationThumbnail = this.A0e;
            view = this.A0K;
            list = c2h1.A04;
            if (list.size() == 1) {
                C06C A0A3 = this.A13.A0A(((C0K0) list.get(0)).A06);
                C0LF c0lf3 = this.A18;
                Activity activity3 = this.A0E;
                Bitmap A023 = c0lf3.A02(activity3, A0A3, activity3.getResources().getDimensionPixelSize(R.dimen.small_avatar_size), this.A0E.getResources().getDimension(R.dimen.small_avatar_radius), true);
                if (A023 == null) {
                    C0L7 c0l72 = this.A12;
                    A023 = c0l72.A00.A00(this.A0E, c0l72.A03(A0A3));
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(A023);
            } else {
                for (int i3 = 0; i3 < Math.min(list.size(), 4); i3++) {
                    C06C A0A4 = this.A13.A0A(((C0K0) list.get(i3)).A06);
                    C0LF c0lf4 = this.A18;
                    Activity activity4 = this.A0E;
                    Bitmap A024 = c0lf4.A02(activity4, A0A4, activity4.getResources().getDimensionPixelSize(R.dimen.small_avatar_size), 0.0f, true);
                    if (A024 == null) {
                        A024 = this.A0G;
                    }
                    arrayList.add(A024);
                }
                z = false;
            }
            if (i == 2) {
                contactLiveLocationThumbnail.setAlpha(0.3f);
            } else {
                contactLiveLocationThumbnail.setAlpha(1.0f);
            }
        }
        if (arrayList.size() == 1) {
            A00 = (Bitmap) arrayList.get(0);
        } else {
            A00 = C0L5.A00(arrayList, 0.0f);
        }
        contactLiveLocationThumbnail.setImageBitmap(A00);
        int i4 = c2h1.A01;
        if (i4 == 0) {
            contactLiveLocationThumbnail.A01 = C02160Ac.A00(this.A0E, R.color.live_location_live_location_marker_glow);
        } else if (i4 == 1) {
            contactLiveLocationThumbnail.A01 = C02160Ac.A00(this.A0E, R.color.live_location_stale_location_marker);
        } else if (i4 == 2) {
            contactLiveLocationThumbnail.A01 = 0;
        }
        contactLiveLocationThumbnail.A03 = z;
        contactLiveLocationThumbnail.A02 = list.size();
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public LatLng A05() {
        if (this.A0d != null) {
            for (C0K0 c0k0 : this.A1Q) {
                if (c0k0 != null && c0k0.A05 > 0 && c0k0.A06.equals(this.A0d)) {
                    return new LatLng(c0k0.A00, c0k0.A01);
                }
            }
        }
        Location A03 = this.A0x.A03("group-chat-live-location-ui");
        if (A03 != null) {
            return new LatLng(A03.getLatitude(), A03.getLongitude());
        }
        return null;
    }

    public C2H1 A06(LatLng latLng) {
        C2Gz A08 = A08();
        if (A08 == null) {
            return null;
        }
        Point A00 = A08.A00(latLng);
        Point point = new Point(A00.x - (this.A0B >> 1), A00.y - (this.A0A >> 1));
        Point point2 = new Point((this.A0B >> 1) + A00.x, (this.A0A >> 1) + A00.y);
        C237918d c237918d = new C237918d();
        c237918d.A01(A08.A01(point));
        c237918d.A01(A08.A01(point2));
        LatLngBounds A002 = c237918d.A00();
        for (C2H1 c2h1 : this.A1R) {
            if (A002.A00(c2h1.A00())) {
                return c2h1;
            }
        }
        return null;
    }

    public C2H1 A07(C0K0 c0k0) {
        if (c0k0 != null) {
            for (C2H1 c2h1 : this.A1R) {
                List list = c2h1.A04;
                if (list.size() > 1 && list.contains(c0k0)) {
                    return c2h1;
                }
            }
            return null;
        }
        return null;
    }

    public C2Gz A08() {
        if (!(this instanceof C48912Hj)) {
            C0T4 c0t4 = ((C48922Hk) this).A00.A05;
            if (c0t4 != null) {
                return new C2Gz(c0t4.A0R);
            }
            return null;
        }
        C0S8 c0s8 = ((C48912Hj) this).A00.A06;
        if (c0s8 != null) {
            return new C2Gz(c0s8.A00());
        }
        return null;
    }

    public String A09(C2H1 c2h1) {
        List<C0K0> list = c2h1.A04;
        if (list.size() == 1 && this.A0z.A0A(((C0K0) list.get(0)).A06)) {
            return this.A1B.A06(R.string.your_live_location_marker_content_description);
        }
        ArrayList arrayList = new ArrayList();
        for (C0K0 c0k0 : list) {
            arrayList.add(c0k0.A06);
        }
        C002301c c002301c = this.A1B;
        return c002301c.A0A(R.plurals.live_location_marker_content_description, arrayList.size(), c002301c.A0E(this.A16.A0B(arrayList)));
    }

    public void A0A() {
        if (!(this instanceof C48912Hj)) {
            GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = ((C48922Hk) this).A00;
            if (!(!((ActivityC02290Ap) groupChatLiveLocationsActivity).A0M) && groupChatLiveLocationsActivity.A05 != null) {
                if (groupChatLiveLocationsActivity.A0M.A0o != null && !groupChatLiveLocationsActivity.A0X) {
                    groupChatLiveLocationsActivity.A0X = true;
                    C0K0 c0k0 = groupChatLiveLocationsActivity.A0M.A0o;
                    C016007m c016007m = new C016007m(c0k0.A00, c0k0.A01);
                    float A00 = GroupChatLiveLocationsActivity.A00(groupChatLiveLocationsActivity, c0k0.A02, -1.0f);
                    if (A00 <= groupChatLiveLocationsActivity.A05.A02().A02 && A00 != -1.0f) {
                        groupChatLiveLocationsActivity.A05.A08(C07K.A0i(c016007m, A00), 1500, groupChatLiveLocationsActivity.A04);
                        return;
                    } else {
                        groupChatLiveLocationsActivity.A05.A08(C07K.A0h(c016007m), 1500, groupChatLiveLocationsActivity.A04);
                        return;
                    }
                } else if (groupChatLiveLocationsActivity.A0M.A0u) {
                    return;
                } else {
                    groupChatLiveLocationsActivity.A1T(true);
                    return;
                }
            }
            return;
        }
        C48912Hj c48912Hj = (C48912Hj) this;
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = c48912Hj.A00;
        if (!(!((ActivityC02290Ap) groupChatLiveLocationsActivity2).A0M) && groupChatLiveLocationsActivity2.A06 != null && !groupChatLiveLocationsActivity2.A0Y) {
            C2GV c2gv = groupChatLiveLocationsActivity2.A0N;
            if (c2gv.A0o != null && !c48912Hj.A0t) {
                groupChatLiveLocationsActivity2.A0Y = true;
                C0K0 c0k02 = groupChatLiveLocationsActivity2.A0N.A0o;
                LatLng latLng = new LatLng(c0k02.A00, c0k02.A01);
                float A002 = GroupChatLiveLocationsActivity2.A00(groupChatLiveLocationsActivity2, c0k02.A02, -1.0f);
                if (A002 <= groupChatLiveLocationsActivity2.A06.A02().A02 && A002 != -1.0f) {
                    groupChatLiveLocationsActivity2.A06.A0A(AnonymousClass088.A0V(latLng, A002), groupChatLiveLocationsActivity2.A05);
                    return;
                } else {
                    groupChatLiveLocationsActivity2.A06.A0A(AnonymousClass088.A0U(latLng), groupChatLiveLocationsActivity2.A05);
                    return;
                }
            }
            C2H1 c2h1 = c2gv.A0l;
            if (c2h1 != null) {
                LatLng A003 = c2h1.A00();
                if (groupChatLiveLocationsActivity2.A06.A00().A01().A04.A00(A003)) {
                    return;
                }
                C2GV c2gv2 = groupChatLiveLocationsActivity2.A0N;
                if (c2gv2.A0t) {
                    if (!groupChatLiveLocationsActivity2.A1V(c2gv2.A0l.A00())) {
                        return;
                    }
                    groupChatLiveLocationsActivity2.A0N.A0B();
                    return;
                }
                groupChatLiveLocationsActivity2.A0Y = true;
                groupChatLiveLocationsActivity2.A06.A0A(AnonymousClass088.A0U(A003), groupChatLiveLocationsActivity2.A05);
            } else if (c2gv.A0u) {
            } else {
                groupChatLiveLocationsActivity2.A1T(true);
            }
        }
    }

    public void A0B() {
        this.A0o = null;
        this.A0j = null;
        A0P(null);
        A0H();
        ((AbstractC04890Mh) this.A0h).A01.A00();
    }

    public void A0C() {
        this.A0b.A00();
        this.A15.A00(this.A14);
        this.A1D.A00(this.A1C);
        this.A11.A00(this.A10);
        this.A1F.A00(this.A1E);
    }

    public void A0D() {
        this.A1L.A01(this);
        this.A0D = 0L;
        Handler handler = this.A0v;
        handler.removeCallbacks(this.A1N);
        C2AX c2ax = this.A1J;
        AbstractC005302j abstractC005302j = this.A0c;
        synchronized (c2ax.A06) {
            c2ax.A07.remove(abstractC005302j);
            if (!c2ax.A08.contains(abstractC005302j)) {
                c2ax.A04.A0K(new C0Z5(abstractC005302j, null));
            }
        }
        handler.removeCallbacks(this.A1P);
        handler.removeCallbacks(this.A1O);
        this.A0x.A06(this);
        this.A0J = null;
        this.A0E.unregisterReceiver(this.A0F);
        C41461tx c41461tx = this.A1I;
        c41461tx.A0Y.remove(this.A1H);
        c41461tx.A0X.remove(this.A1G);
    }

    public void A0E() {
        C0IK c0ik = this.A0x;
        this.A0q = c0ik.A08();
        this.A0r = this.A1A.A04();
        Context applicationContext = this.A0E.getApplicationContext();
        C41461tx c41461tx = this.A1I;
        LocationSharingService.A01(applicationContext, c41461tx);
        if (this.A0m == null) {
            c41461tx.A0X(this.A1G);
            c41461tx.A0Y(this.A1H);
            C67093Ee c67093Ee = new C67093Ee(this, this.A0c);
            Handler handler = this.A0v;
            Runnable runnable = this.A1N;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, this.A0C);
            this.A1J.A01(this.A0c, c67093Ee);
        }
        A0J();
        this.A0E.invalidateOptionsMenu();
        this.A0E.registerReceiver(this.A0F, new IntentFilter("android.location.PROVIDERS_CHANGED"));
        if (c41461tx.A0h(this.A0c)) {
            c0ik.A05(3, 5000L, 1000L, this, "group-chat-live-location-ui-onresume");
        }
        this.A1L.A00(this);
    }

    public void A0F() {
        if (!(this instanceof C48912Hj)) {
            C48922Hk c48922Hk = (C48922Hk) this;
            GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = c48922Hk.A00;
            if (!(!((ActivityC02290Ap) groupChatLiveLocationsActivity).A0M)) {
                groupChatLiveLocationsActivity.A1R();
                c48922Hk.A0A();
                if (!groupChatLiveLocationsActivity.A0M.A0u) {
                    groupChatLiveLocationsActivity.A0L.setLocationMode(2);
                    return;
                }
                return;
            }
            return;
        }
        C48912Hj c48912Hj = (C48912Hj) this;
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = c48912Hj.A00;
        if (!(!((ActivityC02290Ap) groupChatLiveLocationsActivity2).A0M)) {
            groupChatLiveLocationsActivity2.A1R();
            c48912Hj.A0A();
            if (!groupChatLiveLocationsActivity2.A0N.A0u) {
                groupChatLiveLocationsActivity2.A0M.setLocationMode(2);
            }
        }
    }

    public final void A0G() {
        C002301c c002301c = this.A1B;
        List list = this.A1S;
        this.A0V.setText(c002301c.A0A(R.plurals.live_location_marker_title, list.size(), Integer.valueOf(list.size())));
        ((AbstractC04890Mh) this.A0i).A01.A00();
        if (this.A0R != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.A0E.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int min = Math.min((int) (Math.min(4.5d, list.size()) * this.A07), displayMetrics.heightPixels >> 1);
            BottomSheetBehavior bottomSheetBehavior = this.A0Z;
            bottomSheetBehavior.A0J = true;
            bottomSheetBehavior.A0O(5);
            if (this.A0a.A0B != 3) {
                this.A0Y.setLayoutParams(new LinearLayout.LayoutParams(-1, min));
                this.A0a.A0O(3);
            } else if (min == this.A0Y.getHeight()) {
            } else {
                this.A0Y.clearAnimation();
                Animation animation = new Animation(this.A0Y, min) { // from class: X.2yH
                    public final int A00;
                    public final int A01;
                    public final View A02;

                    @Override // android.view.animation.Animation
                    public boolean willChangeBounds() {
                        return true;
                    }

                    {
                        C2GV.this = this;
                        this.A02 = r3;
                        this.A01 = min;
                        this.A00 = r3.getHeight();
                    }

                    @Override // android.view.animation.Animation
                    public void applyTransformation(float f, Transformation transformation) {
                        int i;
                        int i2 = this.A00 + ((int) ((this.A01 - i) * f));
                        View view = this.A02;
                        view.getLayoutParams().height = i2;
                        view.requestLayout();
                        C2GV c2gv = C2GV.this;
                        float height = c2gv.A0S.getHeight() + i2;
                        c2gv.A06 = height;
                        c2gv.A0L(Math.max(c2gv.A04, height), false);
                    }
                };
                animation.setDuration((int) (min / this.A0E.getResources().getDisplayMetrics().density));
                A0M(this.A0Z.A0I(), false);
                this.A0Y.startAnimation(animation);
            }
        } else if (this.A0M.getTranslationY() == 0.0f) {
        } else {
            this.A0M.clearAnimation();
            View view = this.A0M;
            view.setTranslationY(view.getHeight());
            C0AT.A0E(this.A0M).A03(0.0f);
        }
    }

    public final void A0H() {
        this.A1S.clear();
        ((AbstractC04890Mh) this.A0i).A01.A00();
        A0P(null);
        if (this.A0R != null) {
            this.A0Y.clearAnimation();
            BottomSheetBehavior bottomSheetBehavior = this.A0Z;
            if (bottomSheetBehavior.A0B != 4) {
                bottomSheetBehavior.A0O(4);
                A0X(true);
            }
            BottomSheetBehavior bottomSheetBehavior2 = this.A0a;
            if (bottomSheetBehavior2.A0B != 5) {
                bottomSheetBehavior2.A0O(5);
            } else {
                this.A06 = 0.0f;
                A0L(Math.max(this.A04, 0.0f), true);
            }
        } else {
            this.A0M.clearAnimation();
            C0AT.A0E(this.A0M).A03(this.A0M.getHeight());
        }
        A0F();
    }

    public final void A0I() {
        if (this.A0T.getVisibility() != 0) {
            this.A0T.setVisibility(0);
            this.A0T.startAnimation(AnimationUtils.loadAnimation(this.A0E, R.anim.bottom_up));
        }
        boolean z = this.A1Q.size() > 2;
        DragBottomSheetIndicator dragBottomSheetIndicator = this.A0g;
        if (dragBottomSheetIndicator != null) {
            dragBottomSheetIndicator.setVisibility(z ? 4 : 8);
            this.A0L.setVisibility(8);
        }
    }

    public final void A0J() {
        C018508q c018508q = this.A0y;
        c018508q.A02.post(new RunnableEBaseShape3S0100000_I0_3(this, 28));
    }

    public final void A0K() {
        ArrayList arrayList;
        C06C A09;
        if (this.A0D > System.currentTimeMillis()) {
            return;
        }
        this.A0W.setOnClickListener(null);
        C41461tx c41461tx = this.A1I;
        if (c41461tx.A0h(this.A0c) && !this.A0r) {
            this.A0W.setText(R.string.live_location_fix_location_update);
            this.A0W.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 41));
            A0I();
        } else if (c41461tx.A0h(this.A0c) && !this.A0q) {
            this.A0W.setText(R.string.live_location_fix_location_update);
            this.A0W.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 42));
            A0I();
        } else {
            Set set = this.A1U;
            if (!set.isEmpty()) {
                synchronized (set) {
                    arrayList = new ArrayList(set);
                    set.clear();
                }
                int size = arrayList.size();
                if (size == 1 && (A09 = this.A13.A09((AbstractC005302j) arrayList.get(0))) != null) {
                    this.A0W.setText(this.A1B.A0D(R.string.live_location_stopped_sharing_name, this.A16.A06(A09)));
                } else {
                    this.A0W.setText(this.A1B.A0A(R.plurals.live_location_stopped_sharing_count, size, Integer.valueOf(size)));
                }
                this.A0D = System.currentTimeMillis() + 3000;
                this.A0v.postDelayed(this.A1P, 3000L);
                A0I();
                return;
            }
            List list = this.A1Q;
            if (list.isEmpty()) {
                this.A0W.setText(R.string.live_location_no_one_sharing);
                A0I();
                return;
            }
            if (this.A0T.getVisibility() == 0) {
                this.A0T.setVisibility(0);
                Animation loadAnimation = AnimationUtils.loadAnimation(this.A0E, R.anim.bottom_down);
                loadAnimation.setAnimationListener(new C0DJ() { // from class: X.3EU
                    {
                        C2GV.this = this;
                    }

                    @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        C2GV.this.A0T.setVisibility(8);
                    }
                });
                this.A0T.startAnimation(loadAnimation);
            }
            boolean z = list.size() > 2;
            DragBottomSheetIndicator dragBottomSheetIndicator = this.A0g;
            if (dragBottomSheetIndicator == null) {
                return;
            }
            dragBottomSheetIndicator.setVisibility(z ? 0 : 8);
            this.A0L.setVisibility(z ? 0 : 8);
        }
    }

    public void A0L(float f, boolean z) {
        if (!(this instanceof C48912Hj)) {
            C48922Hk c48922Hk = (C48922Hk) this;
            GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = c48922Hk.A00;
            int i = (int) f;
            groupChatLiveLocationsActivity.A01 = i;
            C0T4 c0t4 = groupChatLiveLocationsActivity.A05;
            if (c0t4 != null) {
                c0t4.A07(0, 0, i);
            }
            if (z) {
                c48922Hk.A0A();
                return;
            }
            return;
        }
        C48912Hj c48912Hj = (C48912Hj) this;
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = c48912Hj.A00;
        int i2 = (int) f;
        groupChatLiveLocationsActivity2.A01 = i2;
        C0S8 c0s8 = groupChatLiveLocationsActivity2.A06;
        if (c0s8 != null) {
            c0s8.A07(0, 0, i2);
        }
        if (z) {
            c48912Hj.A0A();
        }
    }

    public final void A0M(float f, boolean z) {
        this.A04 = f;
        if (this.A0g.getVisibility() != 8) {
            this.A04 -= this.A0E.getResources().getDisplayMetrics().density * 20.0f;
        }
        float f2 = this.A04;
        float max = Math.max(f2, this.A06);
        this.A0P.setTranslationY(-f2);
        A0L(max, z);
    }

    /* JADX WARN: Type inference failed for: r0v60, types: [X.2Hb] */
    /* JADX WARN: Type inference failed for: r0v65, types: [X.2Hb] */
    public void A0N(Activity activity, Bundle bundle) {
        this.A0E = activity;
        this.A05 = activity.getResources().getDimension(R.dimen.group_participant_row_height);
        this.A07 = activity.getResources().getDimension(R.dimen.live_location_selected_row_height);
        this.A00 = activity.getResources().getDimension(R.dimen.live_location_list_drag_indicator_height);
        this.A08 = activity.getResources().getDimension(R.dimen.tab_height);
        this.A03 = activity.getResources().getDimension(R.dimen.live_location_row_spacing);
        this.A01 = activity.getResources().getDimension(R.dimen.live_location_row_divider_inset_left);
        this.A02 = activity.getResources().getDimension(R.dimen.live_location_row_divider_inset_right);
        this.A0b = this.A17.A04(activity);
        AbstractC005302j A02 = AbstractC005302j.A02(activity.getIntent().getStringExtra("jid"));
        if (A02 != null) {
            this.A0c = A02;
            this.A0d = UserJid.getNullable(activity.getIntent().getStringExtra("target"));
            UserJid nullable = UserJid.getNullable(activity.getIntent().getStringExtra("final_location_jid"));
            long longExtra = activity.getIntent().getLongExtra("final_location_timestamp", 0L);
            if (nullable != null && longExtra > 0) {
                C0K0 c0k0 = new C0K0(nullable);
                this.A0m = c0k0;
                c0k0.A05 = longExtra;
                c0k0.A00 = activity.getIntent().getDoubleExtra("final_location_latitude", 0.0d);
                this.A0m.A01 = activity.getIntent().getDoubleExtra("final_location_longitude", 0.0d);
            }
            this.A0q = this.A0x.A08();
            A0W("group-chat-live-location-ui-oncreate");
            this.A0X = (RecyclerView) activity.findViewById(R.id.user_list);
            this.A0N = activity.findViewById(R.id.list_holder);
            this.A0g = (DragBottomSheetIndicator) activity.findViewById(R.id.drag_indicator);
            this.A0P = activity.findViewById(R.id.map_bottom);
            this.A0O = activity.findViewById(R.id.list_holder_shadow);
            View view = this.A0N;
            int i = 8;
            if (view != null) {
                view.setVisibility(8);
                this.A0O.setVisibility(8);
                this.A0g.setVisibility(8);
                this.A0Z = new BottomSheetBehavior() { // from class: com.whatsapp.location.GroupChatLiveLocationsUi$13
                    {
                        C2GV.this = this;
                    }

                    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC08910cJ
                    public boolean A0B(CoordinatorLayout coordinatorLayout, View view2, MotionEvent motionEvent) {
                        return C2GV.this.A0a.A0B == 5 && super.A0B(coordinatorLayout, view2, motionEvent);
                    }
                };
                BottomSheetBehavior bottomSheetBehavior = this.A0Z;
                ((C08930cL) this.A0N.getLayoutParams()).A00(bottomSheetBehavior);
                bottomSheetBehavior.A0J = false;
                bottomSheetBehavior.A0E = new AbstractC08940cM() { // from class: X.3EV
                    {
                        C2GV.this = this;
                    }

                    @Override // X.AbstractC08940cM
                    public void A00(View view2, float f) {
                        int A0I;
                        if (f >= 0.0f) {
                            int height = view2.getHeight();
                            C2GV c2gv = C2GV.this;
                            c2gv.A0M(c2gv.A0Z.A0I() + ((height - A0I) * f), false);
                        } else if (!Float.isNaN(f)) {
                            C2GV c2gv2 = C2GV.this;
                            float A0I2 = c2gv2.A0Z.A0I();
                            c2gv2.A0M(A0I2 + (A0I2 * f), false);
                        }
                        C2GV.this.A0g.setOffset(f);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:35:0x001c, code lost:
                        if (r10 == 2) goto L18;
                     */
                    @Override // X.AbstractC08940cM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public void A01(android.view.View r9, int r10) {
                        /*
                            r8 = this;
                            r7 = 5
                            r4 = 4
                            r6 = 3
                            r3 = 0
                            r2 = 1
                            if (r10 != r6) goto L49
                            X.2GV r5 = X.C2GV.this
                            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r5.A0a
                            int r0 = r0.A0B
                            if (r0 != r6) goto L2e
                            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r5.A0Z
                            r0.A0O(r7)
                        L14:
                            X.2GV r6 = X.C2GV.this
                            com.whatsapp.location.DragBottomSheetIndicator r5 = r6.A0g
                            r1 = 2
                            if (r10 == r2) goto L1e
                            r0 = 0
                            if (r10 != r1) goto L1f
                        L1e:
                            r0 = 1
                        L1f:
                            r5.setUpdating(r0)
                            if (r10 == r1) goto L28
                            if (r10 == r2) goto L28
                            if (r10 != r4) goto L2d
                        L28:
                            androidx.recyclerview.widget.RecyclerView r0 = r6.A0X
                            r0.A0Y(r3)
                        L2d:
                            return
                        L2e:
                            int r1 = r9.getHeight()
                            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r5.A0Z
                            int r0 = r0.A0I()
                            int r1 = r1 - r0
                            float r1 = (float) r1
                            float r0 = (float) r0
                            float r0 = r0 + r1
                            r5.A0M(r0, r2)
                            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r5.A0Z
                            r0.A0J = r3
                            com.whatsapp.location.DragBottomSheetIndicator r0 = r5.A0g
                            r0.setExpanded(r2)
                            goto L14
                        L49:
                            if (r10 != r4) goto L14
                            X.2GV r1 = X.C2GV.this
                            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r1.A0a
                            int r0 = r0.A0B
                            if (r0 != r6) goto L59
                            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r1.A0Z
                            r0.A0O(r7)
                            goto L14
                        L59:
                            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r1.A0Z
                            r0.A0J = r3
                            int r0 = r0.A0I()
                            float r0 = (float) r0
                            r1.A0M(r0, r2)
                            com.whatsapp.location.DragBottomSheetIndicator r0 = r1.A0g
                            r0.setExpanded(r3)
                            goto L14
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C3EV.A01(android.view.View, int):void");
                    }
                };
                this.A0L = activity.findViewById(R.id.drag_indicator_click);
                ViewOnClickCListenerShape9S0100000_I0_1 viewOnClickCListenerShape9S0100000_I0_1 = new ViewOnClickCListenerShape9S0100000_I0_1(this, 43);
                this.A0g.setOnClickListener(viewOnClickCListenerShape9S0100000_I0_1);
                this.A0L.setOnClickListener(viewOnClickCListenerShape9S0100000_I0_1);
            }
            this.A0S = activity.findViewById(R.id.selected_list_title_holder);
            this.A0V = (TextView) activity.findViewById(R.id.selected_list_title);
            this.A0Y = (RecyclerView) activity.findViewById(R.id.selected_list);
            activity.findViewById(R.id.selected_cancel).setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 44));
            this.A0R = activity.findViewById(R.id.selected_list_holder);
            View findViewById = activity.findViewById(R.id.landscape_selected_list_holder);
            this.A0M = findViewById;
            View view2 = this.A0R;
            if (view2 != null) {
                BottomSheetBehavior A00 = BottomSheetBehavior.A00(view2);
                this.A0a = A00;
                A00.A0E = new AbstractC08940cM() { // from class: X.3EW
                    {
                        C2GV.this = this;
                    }

                    @Override // X.AbstractC08940cM
                    public void A00(View view3, float f) {
                        C2GV c2gv = C2GV.this;
                        float A0I = c2gv.A0a.A0I() + (view3.getHeight() * f);
                        c2gv.A06 = A0I;
                        c2gv.A0L(Math.max(c2gv.A04, A0I), false);
                    }

                    @Override // X.AbstractC08940cM
                    public void A01(View view3, int i2) {
                        if (i2 == 5) {
                            C2GV c2gv = C2GV.this;
                            c2gv.A0Y.setLayoutParams(new LinearLayout.LayoutParams(-1, 0));
                            c2gv.A06 = 0.0f;
                            c2gv.A0L(Math.max(c2gv.A04, 0.0f), true);
                            c2gv.A0H();
                        } else if (i2 == 3) {
                            C2GV c2gv2 = C2GV.this;
                            BottomSheetBehavior bottomSheetBehavior2 = c2gv2.A0Z;
                            if (bottomSheetBehavior2.A0B != 5) {
                                bottomSheetBehavior2.A0J = true;
                                bottomSheetBehavior2.A0O(5);
                            } else {
                                c2gv2.A0M(0.0f, false);
                            }
                            float height = view3.getHeight() + c2gv2.A0a.A0I();
                            c2gv2.A06 = height;
                            c2gv2.A0L(Math.max(c2gv2.A04, height), true);
                            c2gv2.A0F();
                        }
                        C2GV c2gv3 = C2GV.this;
                        if (c2gv3.A1S.isEmpty()) {
                            c2gv3.A0H();
                        }
                    }
                };
                A00.A0N = true;
                A00.A0O(5);
            } else {
                findViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.2yF
                    {
                        C2GV.this = this;
                    }

                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        C2GV c2gv = C2GV.this;
                        if (c2gv.A0M.getHeight() <= 0 || !c2gv.A1S.isEmpty()) {
                            return true;
                        }
                        c2gv.A0M.getViewTreeObserver().removeOnPreDrawListener(this);
                        View view3 = c2gv.A0M;
                        view3.setTranslationY(view3.getHeight());
                        return true;
                    }
                });
            }
            this.A0I = C02160Ac.A03(activity, R.drawable.live_location_list_divider);
            AbstractC08920cK abstractC08920cK = new AbstractC08920cK() { // from class: X.3EX
                {
                    C2GV.this = this;
                }

                @Override // X.AbstractC08920cK
                public void A00(Canvas canvas, RecyclerView recyclerView, C0Y0 c0y0) {
                    int paddingLeft = recyclerView.getPaddingLeft();
                    C2GV c2gv = C2GV.this;
                    int i2 = paddingLeft + ((int) c2gv.A01);
                    int width = (recyclerView.getWidth() - ((int) c2gv.A02)) - recyclerView.getPaddingRight();
                    for (int i3 = 0; i3 < recyclerView.getChildCount(); i3++) {
                        View childAt = recyclerView.getChildAt(i3);
                        C15170oC c15170oC = (C15170oC) childAt.getLayoutParams();
                        int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) c15170oC).bottomMargin;
                        int intrinsicHeight = c2gv.A0I.getIntrinsicHeight() + bottom;
                        if (c15170oC.A00.A01() == 0 && c2gv.A0n == null) {
                            c2gv.A0I.setBounds(0, bottom, recyclerView.getWidth(), intrinsicHeight);
                            c2gv.A0I.draw(canvas);
                        } else {
                            c2gv.A0I.setBounds(i2, bottom, width, intrinsicHeight);
                            c2gv.A0I.draw(canvas);
                        }
                    }
                }
            };
            List<C0K0> list = this.A1Q;
            this.A0h = new AbstractC04890Mh(list, false) { // from class: X.2Hb
                public final List A00;
                public final boolean A01;

                {
                    C2GV.this = this;
                    this.A00 = list;
                    this.A01 = r3;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0013, code lost:
                    if (r3.A01 != false) goto L10;
                 */
                @Override // X.AbstractC04890Mh
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public int A0C() {
                    /*
                        r3 = this;
                        java.util.List r0 = r3.A00
                        int r2 = r0.size()
                        X.2GV r1 = X.C2GV.this
                        X.0K0 r0 = r1.A0n
                        if (r0 != 0) goto L15
                        X.0K0 r0 = r1.A0m
                        if (r0 != 0) goto L15
                        boolean r1 = r3.A01
                        r0 = 1
                        if (r1 == 0) goto L16
                    L15:
                        r0 = 0
                    L16:
                        int r2 = r2 + r0
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C48852Hb.A0C():int");
                }

                @Override // X.AbstractC04890Mh
                public int A0D(int i2) {
                    if (this.A01) {
                        return 2;
                    }
                    C2GV c2gv = C2GV.this;
                    if (c2gv.A0n == null && c2gv.A0m == null) {
                        i2--;
                        if (i2 == 0) {
                            return 3;
                        }
                    }
                    List list2 = this.A00;
                    if (list2.get(i2) == c2gv.A0m) {
                        return 4;
                    }
                    return list2.get(i2) == c2gv.A0n ? 0 : 1;
                }

                @Override // X.AbstractC04890Mh
                public C0TS A0E(ViewGroup viewGroup, int i2) {
                    int i3 = R.layout.location_sharing_participant_my_row;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            i3 = R.layout.location_sharing_participant_row;
                        } else if (i2 != 3) {
                            i3 = R.layout.location_sharing_participant_ended;
                            if (i2 != 4) {
                                i3 = R.layout.location_sharing_participant_selected_row;
                            }
                        } else {
                            i3 = R.layout.location_sharing_participant_share_back_row;
                        }
                    }
                    C2GV c2gv = C2GV.this;
                    View inflate = c2gv.A0E.getLayoutInflater().inflate(i3, viewGroup, false);
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                return new C68613Ks(c2gv, inflate);
                            }
                            return new C68603Kr(c2gv, inflate);
                        }
                        return new C68633Ku(c2gv, inflate);
                    }
                    return new C68623Kt(c2gv, inflate);
                }

                @Override // X.AbstractC04890Mh
                public void A0F(C0TS c0ts, int i2) {
                    C0K0 c0k02;
                    String str;
                    String A0D;
                    String str2;
                    String A0D2;
                    int i3;
                    AbstractC67103Ef abstractC67103Ef = (AbstractC67103Ef) c0ts;
                    C2GV c2gv = C2GV.this;
                    if (c2gv.A0n != null || c2gv.A0m != null || this.A01) {
                        c0k02 = (C0K0) this.A00.get(i2);
                    } else if (i2 != 0) {
                        c0k02 = (C0K0) this.A00.get(i2 - 1);
                    } else {
                        return;
                    }
                    C06C A09 = c2gv.A13.A09(c0k02.A06);
                    if (A09 != null) {
                        if (abstractC67103Ef instanceof C68623Kt) {
                            C68623Kt c68623Kt = (C68623Kt) abstractC67103Ef;
                            c68623Kt.A00 = A09;
                            c68623Kt.A0H.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1(c68623Kt, c0k02, 9));
                            C06C c06c = c68623Kt.A00;
                            C2GV c2gv2 = c68623Kt.A04;
                            C02L c02l = c2gv2.A0z;
                            c02l.A05();
                            if (c06c.equals(c02l.A01)) {
                                c68623Kt.A02.setText(R.string.you);
                                String A0j = AnonymousClass029.A0j(c2gv2.A1B, c2gv2.A1I.A05(c2gv2.A0c) - c2gv2.A19.A05());
                                TextEmojiLabel textEmojiLabel = c68623Kt.A03;
                                textEmojiLabel.setText(A0j);
                                textEmojiLabel.setVisibility(0);
                            } else {
                                c68623Kt.A02.setText(c2gv2.A16.A08(c68623Kt.A00, false));
                                if (c68623Kt.A00.A0A()) {
                                    TextEmojiLabel textEmojiLabel2 = c68623Kt.A03;
                                    textEmojiLabel2.setVisibility(0);
                                    String str3 = c68623Kt.A00.A0O;
                                    if (str3 != null) {
                                        StringBuilder A0P = C000200d.A0P("~");
                                        A0P.append(str3);
                                        str = A0P.toString();
                                    } else {
                                        str = null;
                                    }
                                    textEmojiLabel2.A03(str);
                                } else {
                                    c68623Kt.A03.setVisibility(8);
                                }
                            }
                            c2gv2.A0b.A03(c68623Kt.A00, c68623Kt.A01);
                        } else if (!(abstractC67103Ef instanceof C68613Ks)) {
                            if (abstractC67103Ef instanceof C68603Kr) {
                                C68603Kr c68603Kr = (C68603Kr) abstractC67103Ef;
                                TextView textView = c68603Kr.A00;
                                C2GV c2gv3 = c68603Kr.A01;
                                AnonymousClass012 anonymousClass012 = c2gv3.A19;
                                long A06 = anonymousClass012.A06(c0k02.A05);
                                int A002 = C02620Cd.A00(anonymousClass012.A05(), A06);
                                if (A002 <= 6) {
                                    if (A002 == 0) {
                                        i3 = R.string.live_location_final_update_today;
                                    } else if (A002 == 1) {
                                        i3 = R.string.live_location_final_update_yesterday;
                                    } else {
                                        Calendar calendar = Calendar.getInstance();
                                        calendar.setTimeInMillis(A06);
                                        switch (calendar.get(7)) {
                                            case 1:
                                                i3 = R.string.live_location_final_update_sunday;
                                                break;
                                            case 2:
                                                i3 = R.string.live_location_final_update_monday;
                                                break;
                                            case 3:
                                                i3 = R.string.live_location_final_update_tuesday;
                                                break;
                                            case 4:
                                                i3 = R.string.live_location_final_update_wednesday;
                                                break;
                                            case 5:
                                                i3 = R.string.live_location_final_update_thursday;
                                                break;
                                            case 6:
                                                i3 = R.string.live_location_final_update_friday;
                                                break;
                                            case 7:
                                                i3 = R.string.live_location_final_update_saturday;
                                                break;
                                            default:
                                                i3 = 0;
                                                break;
                                        }
                                    }
                                    C002301c c002301c = c2gv3.A1B;
                                    A0D2 = AbstractC40621sZ.A01(c002301c, c002301c.A0D(i3, AbstractC40621sZ.A00(c002301c, A06)), A06);
                                } else {
                                    C002301c c002301c2 = c2gv3.A1B;
                                    A0D2 = c002301c2.A0D(R.string.live_location_final_update, AnonymousClass029.A0e(c002301c2, A002, A06));
                                }
                                textView.setText(A0D2);
                            }
                        } else {
                            C68613Ks c68613Ks = (C68613Ks) abstractC67103Ef;
                            c68613Ks.A00 = A09;
                            c68613Ks.A0H.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1(c68613Ks, c0k02, 8));
                            C2GV c2gv4 = c68613Ks.A06;
                            AnonymousClass012 anonymousClass0122 = c2gv4.A19;
                            long A05 = anonymousClass0122.A05();
                            C06C c06c2 = c68613Ks.A00;
                            C02L c02l2 = c2gv4.A0z;
                            c02l2.A05();
                            if (c06c2.equals(c02l2.A01)) {
                                c68613Ks.A04.setText(R.string.you);
                                c68613Ks.A02.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1(c68613Ks, 18));
                                long A052 = c2gv4.A1I.A05(c2gv4.A0c) - A05;
                                if (A052 >= 0) {
                                    String A0j2 = AnonymousClass029.A0j(c2gv4.A1B, A052);
                                    TextView textView2 = c68613Ks.A03;
                                    textView2.setText(A0j2);
                                    textView2.setVisibility(0);
                                } else {
                                    c68613Ks.A03.setVisibility(8);
                                }
                            } else {
                                c68613Ks.A04.setText(c2gv4.A16.A08(c68613Ks.A00, false));
                                long j = c0k02.A05;
                                if (A05 - j < 60000) {
                                    A0D = c2gv4.A1B.A06(R.string.location_just_now);
                                } else {
                                    C002301c c002301c3 = c2gv4.A1B;
                                    A0D = c002301c3.A0D(R.string.live_location_last_updated, AbstractC40621sZ.A00(c002301c3, anonymousClass0122.A06(j)));
                                }
                                c68613Ks.A02.setText(A0D);
                                if (c68613Ks.A00.A0A()) {
                                    TextEmojiLabel textEmojiLabel3 = c68613Ks.A05;
                                    textEmojiLabel3.setVisibility(0);
                                    String str4 = c68613Ks.A00.A0O;
                                    if (str4 != null) {
                                        StringBuilder A0P2 = C000200d.A0P("~");
                                        A0P2.append(str4);
                                        str2 = A0P2.toString();
                                    } else {
                                        str2 = null;
                                    }
                                    textEmojiLabel3.A03(str2);
                                } else {
                                    c68613Ks.A05.setVisibility(8);
                                }
                            }
                            c2gv4.A0b.A03(c68613Ks.A00, c68613Ks.A01);
                        }
                    }
                }
            };
            this.A0X.setLayoutManager(new LinearLayoutManager(1));
            this.A0X.setAdapter(this.A0h);
            RecyclerView recyclerView = this.A0X;
            recyclerView.A0i = true;
            recyclerView.setOnCreateContextMenuListener(this);
            this.A0X.A0k(abstractC08920cK);
            List list2 = this.A1S;
            this.A0i = new AbstractC04890Mh(list2, true) { // from class: X.2Hb
                public final List A00;
                public final boolean A01;

                {
                    C2GV.this = this;
                    this.A00 = list2;
                    this.A01 = r3;
                }

                @Override // X.AbstractC04890Mh
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public int A0C() {
                    /*
                        r3 = this;
                        java.util.List r0 = r3.A00
                        int r2 = r0.size()
                        X.2GV r1 = X.C2GV.this
                        X.0K0 r0 = r1.A0n
                        if (r0 != 0) goto L15
                        X.0K0 r0 = r1.A0m
                        if (r0 != 0) goto L15
                        boolean r1 = r3.A01
                        r0 = 1
                        if (r1 == 0) goto L16
                    L15:
                        r0 = 0
                    L16:
                        int r2 = r2 + r0
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C48852Hb.A0C():int");
                }

                @Override // X.AbstractC04890Mh
                public int A0D(int i2) {
                    if (this.A01) {
                        return 2;
                    }
                    C2GV c2gv = C2GV.this;
                    if (c2gv.A0n == null && c2gv.A0m == null) {
                        i2--;
                        if (i2 == 0) {
                            return 3;
                        }
                    }
                    List list22 = this.A00;
                    if (list22.get(i2) == c2gv.A0m) {
                        return 4;
                    }
                    return list22.get(i2) == c2gv.A0n ? 0 : 1;
                }

                @Override // X.AbstractC04890Mh
                public C0TS A0E(ViewGroup viewGroup, int i2) {
                    int i3 = R.layout.location_sharing_participant_my_row;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            i3 = R.layout.location_sharing_participant_row;
                        } else if (i2 != 3) {
                            i3 = R.layout.location_sharing_participant_ended;
                            if (i2 != 4) {
                                i3 = R.layout.location_sharing_participant_selected_row;
                            }
                        } else {
                            i3 = R.layout.location_sharing_participant_share_back_row;
                        }
                    }
                    C2GV c2gv = C2GV.this;
                    View inflate = c2gv.A0E.getLayoutInflater().inflate(i3, viewGroup, false);
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                return new C68613Ks(c2gv, inflate);
                            }
                            return new C68603Kr(c2gv, inflate);
                        }
                        return new C68633Ku(c2gv, inflate);
                    }
                    return new C68623Kt(c2gv, inflate);
                }

                @Override // X.AbstractC04890Mh
                public void A0F(C0TS c0ts, int i2) {
                    C0K0 c0k02;
                    String str;
                    String A0D;
                    String str2;
                    String A0D2;
                    int i3;
                    AbstractC67103Ef abstractC67103Ef = (AbstractC67103Ef) c0ts;
                    C2GV c2gv = C2GV.this;
                    if (c2gv.A0n != null || c2gv.A0m != null || this.A01) {
                        c0k02 = (C0K0) this.A00.get(i2);
                    } else if (i2 != 0) {
                        c0k02 = (C0K0) this.A00.get(i2 - 1);
                    } else {
                        return;
                    }
                    C06C A09 = c2gv.A13.A09(c0k02.A06);
                    if (A09 != null) {
                        if (abstractC67103Ef instanceof C68623Kt) {
                            C68623Kt c68623Kt = (C68623Kt) abstractC67103Ef;
                            c68623Kt.A00 = A09;
                            c68623Kt.A0H.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1(c68623Kt, c0k02, 9));
                            C06C c06c = c68623Kt.A00;
                            C2GV c2gv2 = c68623Kt.A04;
                            C02L c02l = c2gv2.A0z;
                            c02l.A05();
                            if (c06c.equals(c02l.A01)) {
                                c68623Kt.A02.setText(R.string.you);
                                String A0j = AnonymousClass029.A0j(c2gv2.A1B, c2gv2.A1I.A05(c2gv2.A0c) - c2gv2.A19.A05());
                                TextEmojiLabel textEmojiLabel = c68623Kt.A03;
                                textEmojiLabel.setText(A0j);
                                textEmojiLabel.setVisibility(0);
                            } else {
                                c68623Kt.A02.setText(c2gv2.A16.A08(c68623Kt.A00, false));
                                if (c68623Kt.A00.A0A()) {
                                    TextEmojiLabel textEmojiLabel2 = c68623Kt.A03;
                                    textEmojiLabel2.setVisibility(0);
                                    String str3 = c68623Kt.A00.A0O;
                                    if (str3 != null) {
                                        StringBuilder A0P = C000200d.A0P("~");
                                        A0P.append(str3);
                                        str = A0P.toString();
                                    } else {
                                        str = null;
                                    }
                                    textEmojiLabel2.A03(str);
                                } else {
                                    c68623Kt.A03.setVisibility(8);
                                }
                            }
                            c2gv2.A0b.A03(c68623Kt.A00, c68623Kt.A01);
                        } else if (!(abstractC67103Ef instanceof C68613Ks)) {
                            if (abstractC67103Ef instanceof C68603Kr) {
                                C68603Kr c68603Kr = (C68603Kr) abstractC67103Ef;
                                TextView textView = c68603Kr.A00;
                                C2GV c2gv3 = c68603Kr.A01;
                                AnonymousClass012 anonymousClass012 = c2gv3.A19;
                                long A06 = anonymousClass012.A06(c0k02.A05);
                                int A002 = C02620Cd.A00(anonymousClass012.A05(), A06);
                                if (A002 <= 6) {
                                    if (A002 == 0) {
                                        i3 = R.string.live_location_final_update_today;
                                    } else if (A002 == 1) {
                                        i3 = R.string.live_location_final_update_yesterday;
                                    } else {
                                        Calendar calendar = Calendar.getInstance();
                                        calendar.setTimeInMillis(A06);
                                        switch (calendar.get(7)) {
                                            case 1:
                                                i3 = R.string.live_location_final_update_sunday;
                                                break;
                                            case 2:
                                                i3 = R.string.live_location_final_update_monday;
                                                break;
                                            case 3:
                                                i3 = R.string.live_location_final_update_tuesday;
                                                break;
                                            case 4:
                                                i3 = R.string.live_location_final_update_wednesday;
                                                break;
                                            case 5:
                                                i3 = R.string.live_location_final_update_thursday;
                                                break;
                                            case 6:
                                                i3 = R.string.live_location_final_update_friday;
                                                break;
                                            case 7:
                                                i3 = R.string.live_location_final_update_saturday;
                                                break;
                                            default:
                                                i3 = 0;
                                                break;
                                        }
                                    }
                                    C002301c c002301c = c2gv3.A1B;
                                    A0D2 = AbstractC40621sZ.A01(c002301c, c002301c.A0D(i3, AbstractC40621sZ.A00(c002301c, A06)), A06);
                                } else {
                                    C002301c c002301c2 = c2gv3.A1B;
                                    A0D2 = c002301c2.A0D(R.string.live_location_final_update, AnonymousClass029.A0e(c002301c2, A002, A06));
                                }
                                textView.setText(A0D2);
                            }
                        } else {
                            C68613Ks c68613Ks = (C68613Ks) abstractC67103Ef;
                            c68613Ks.A00 = A09;
                            c68613Ks.A0H.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1(c68613Ks, c0k02, 8));
                            C2GV c2gv4 = c68613Ks.A06;
                            AnonymousClass012 anonymousClass0122 = c2gv4.A19;
                            long A05 = anonymousClass0122.A05();
                            C06C c06c2 = c68613Ks.A00;
                            C02L c02l2 = c2gv4.A0z;
                            c02l2.A05();
                            if (c06c2.equals(c02l2.A01)) {
                                c68613Ks.A04.setText(R.string.you);
                                c68613Ks.A02.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1(c68613Ks, 18));
                                long A052 = c2gv4.A1I.A05(c2gv4.A0c) - A05;
                                if (A052 >= 0) {
                                    String A0j2 = AnonymousClass029.A0j(c2gv4.A1B, A052);
                                    TextView textView2 = c68613Ks.A03;
                                    textView2.setText(A0j2);
                                    textView2.setVisibility(0);
                                } else {
                                    c68613Ks.A03.setVisibility(8);
                                }
                            } else {
                                c68613Ks.A04.setText(c2gv4.A16.A08(c68613Ks.A00, false));
                                long j = c0k02.A05;
                                if (A05 - j < 60000) {
                                    A0D = c2gv4.A1B.A06(R.string.location_just_now);
                                } else {
                                    C002301c c002301c3 = c2gv4.A1B;
                                    A0D = c002301c3.A0D(R.string.live_location_last_updated, AbstractC40621sZ.A00(c002301c3, anonymousClass0122.A06(j)));
                                }
                                c68613Ks.A02.setText(A0D);
                                if (c68613Ks.A00.A0A()) {
                                    TextEmojiLabel textEmojiLabel3 = c68613Ks.A05;
                                    textEmojiLabel3.setVisibility(0);
                                    String str4 = c68613Ks.A00.A0O;
                                    if (str4 != null) {
                                        StringBuilder A0P2 = C000200d.A0P("~");
                                        A0P2.append(str4);
                                        str2 = A0P2.toString();
                                    } else {
                                        str2 = null;
                                    }
                                    textEmojiLabel3.A03(str2);
                                } else {
                                    c68613Ks.A05.setVisibility(8);
                                }
                            }
                            c2gv4.A0b.A03(c68613Ks.A00, c68613Ks.A01);
                        }
                    }
                }
            };
            this.A0Y.setLayoutManager(new LinearLayoutManager(1));
            this.A0Y.setAdapter(this.A0i);
            RecyclerView recyclerView2 = this.A0Y;
            recyclerView2.A0i = true;
            recyclerView2.A0k(abstractC08920cK);
            this.A0W = (TextView) activity.findViewById(R.id.status);
            this.A0T = activity.findViewById(R.id.status_panel);
            A0X(true);
            this.A1D.A01(this.A1C);
            this.A15.A01(this.A14);
            this.A11.A01(this.A10);
            this.A1F.A01(this.A1E);
            View inflate = View.inflate(this.A0E, R.layout.contact_live_location_marker, null);
            this.A0K = inflate;
            this.A0e = (ContactLiveLocationThumbnail) inflate.findViewById(R.id.contact_photo);
            C0L7 c0l7 = this.A12;
            int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.small_avatar_size);
            if (c0l7 != null) {
                this.A0G = C0L7.A01(activity, R.drawable.avatar_contact, dimensionPixelSize, 0.0f);
                int dimensionPixelSize2 = activity.getResources().getDimensionPixelSize(R.dimen.live_location_selected_avatar_size);
                if (c0l7 != null) {
                    this.A0H = C0L7.A01(activity, R.drawable.avatar_contact, dimensionPixelSize2, 0.0f);
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                    this.A0K.measure(makeMeasureSpec, makeMeasureSpec);
                    this.A0K.layout(0, 0, this.A0K.getMeasuredWidth(), this.A0K.getMeasuredHeight());
                    View inflate2 = View.inflate(this.A0E, R.layout.contact_live_location_selected_marker, null);
                    this.A0Q = inflate2;
                    this.A0f = (ContactLiveLocationThumbnail) inflate2.findViewById(R.id.contact_photo);
                    this.A0Q.measure(makeMeasureSpec, makeMeasureSpec);
                    this.A0B = this.A0Q.getMeasuredWidth();
                    int measuredHeight = this.A0Q.getMeasuredHeight();
                    this.A0A = measuredHeight;
                    this.A0Q.layout(0, 0, this.A0B, measuredHeight);
                    if (bundle != null) {
                        this.A0s = bundle.getBoolean("map_follow_user", false);
                        this.A0u = bundle.getBoolean("map_touched", false);
                        AbstractC005302j A022 = AbstractC005302j.A02(bundle.getString("selected_user_jid"));
                        if (A022 != null) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C0K0 c0k02 = (C0K0) it.next();
                                if (c0k02.A06.equals(A022)) {
                                    this.A0o = c0k02;
                                    break;
                                }
                            }
                        }
                        HashSet hashSet = new HashSet();
                        C003101m.A0M(UserJid.class, bundle.getStringArrayList("selected_user_jids"), hashSet);
                        if (!hashSet.isEmpty()) {
                            for (C0K0 c0k03 : list) {
                                if (hashSet.contains(c0k03.A06)) {
                                    list2.add(c0k03);
                                }
                            }
                            Collections.sort(list2, new C48842Ha(this.A0z, this.A13, this.A16));
                            ((AbstractC04890Mh) this.A0i).A01.A00();
                            A0G();
                        }
                    }
                    View findViewById2 = activity.findViewById(R.id.zoom_out);
                    this.A0U = findViewById2;
                    findViewById2.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 45));
                    View view3 = this.A0U;
                    if (this.A0u && this.A0m == null) {
                        i = 0;
                    }
                    view3.setVisibility(i);
                    this.A0k = new C2H0(new C48842Ha(this.A0z, this.A13, this.A16), this.A0B, this.A0A, this.A1K);
                    LocationSharingService.A01(activity.getApplicationContext(), this.A1I);
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public void A0O(Bundle bundle) {
        bundle.putBoolean("map_follow_user", this.A0s);
        bundle.putBoolean("map_touched", this.A0u);
        C0K0 c0k0 = this.A0o;
        if (c0k0 != null) {
            bundle.putString("selected_user_jid", c0k0.A06.getRawString());
        }
        List<C0K0> list = this.A1S;
        if (list.isEmpty()) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>(list.size());
        for (C0K0 c0k02 : list) {
            arrayList.add(c0k02.A06.getRawString());
        }
        bundle.putStringArrayList("selected_user_jids", arrayList);
    }

    public final void A0P(C2H1 c2h1) {
        ArrayList arrayList = new ArrayList();
        List<C2H1> list = this.A1R;
        synchronized (list) {
            if (c2h1 == null) {
                this.A0l = null;
                for (C2H1 c2h12 : list) {
                    arrayList.add(new C2H1(c2h12.A04, 0, this.A1K));
                }
            } else {
                for (C2H1 c2h13 : list) {
                    if (c2h13 == c2h1) {
                        arrayList.add(new C2H1(c2h13.A04, 1, this.A1K));
                        this.A0l = c2h13;
                    } else {
                        arrayList.add(new C2H1(c2h13.A04, 2, this.A1K));
                    }
                }
            }
            list.clear();
            list.addAll(arrayList);
            this.A0t = false;
        }
    }

    public void A0Q(C2H1 c2h1, boolean z) {
        A0P(c2h1);
        List list = c2h1.A04;
        if (list.size() == 1) {
            A0S((C0K0) list.get(0));
            return;
        }
        this.A0o = null;
        List list2 = this.A1S;
        list2.clear();
        list2.addAll(list);
        Collections.sort(list2, new C48842Ha(this.A0z, this.A13, this.A16));
        ((AbstractC04890Mh) this.A0i).A01.A00();
        A0G();
        if (z) {
            A0J();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.List] */
    public void A0R(C2Gz c2Gz) {
        ?? arrayList;
        C2H0 c2h0 = this.A0k;
        C0K0 c0k0 = this.A0m;
        if (c0k0 != null) {
            arrayList = Collections.singletonList(c0k0);
        } else {
            long A05 = this.A19.A05();
            arrayList = new ArrayList();
            for (C0K0 c0k02 : this.A1Q) {
                if (c0k02 != null && (c0k02.A05 + 86400000 > A05 || this.A0z.A0A(c0k02.A06))) {
                    arrayList.add(c0k02);
                }
            }
        }
        C0K0 c0k03 = this.A0o;
        C2H1 c2h1 = null;
        if (c2h0 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (C0K0 c0k04 : arrayList) {
                arrayList2.add(new C0FK(c0k04, c2Gz.A00(new LatLng(c0k04.A00, c0k04.A01))));
            }
            Collections.sort(arrayList2, new Comparator() { // from class: X.2yf
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Point) ((C0FK) obj).A01).x - ((Point) ((C0FK) obj2).A01).x;
                }
            });
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            int i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            while (it.hasNext()) {
                C0FK c0fk = (C0FK) it.next();
                if (c0fk.A00 != c0k03) {
                    float f = i + c2h0.A00;
                    int i2 = ((Point) c0fk.A01).x;
                    if (f < i2) {
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(c0fk);
                        arrayList3.add(arrayList4);
                        i = i2;
                    } else {
                        ((List) arrayList3.get(arrayList3.size() - 1)).add(c0fk);
                    }
                }
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                List<C0FK> list = (List) it2.next();
                Collections.sort(list, new Comparator() { // from class: X.2yg
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ((Point) ((C0FK) obj).A01).y - ((Point) ((C0FK) obj2).A01).y;
                    }
                });
                int i3 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                for (C0FK c0fk2 : list) {
                    Object obj = c0fk2.A00;
                    if (obj != c0k03) {
                        float f2 = i3 + c2h0.A01;
                        int i4 = ((Point) c0fk2.A01).y;
                        if (f2 < i4) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.add(obj);
                            arrayList5.add(arrayList6);
                            i3 = i4;
                        } else {
                            ((List) arrayList5.get(arrayList5.size() - 1)).add(obj);
                        }
                    }
                }
            }
            if (c0k03 != null) {
                ArrayList arrayList7 = new ArrayList();
                arrayList7.add(c0k03);
                arrayList5.add(arrayList7);
            }
            ArrayList arrayList8 = new ArrayList();
            Iterator it3 = arrayList5.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                List list2 = (List) it3.next();
                Collections.sort(list2, c2h0.A03);
                arrayList8.add(new C2H1(list2, 0, c2h0.A02));
            }
            List<C2H1> list3 = this.A1R;
            synchronized (list3) {
                list3.clear();
                list3.addAll(arrayList8);
                int i5 = 1;
                if (this.A0m != null) {
                    list3.clear();
                    list3.add(new C2H1(this.A0m, this.A0o != null ? 1 : 0));
                } else {
                    List list4 = this.A1S;
                    if (!list4.isEmpty()) {
                        for (C2H1 c2h12 : list3) {
                            List list5 = c2h12.A04;
                            ArrayList arrayList9 = new ArrayList(list4);
                            arrayList9.retainAll(list5);
                            if (arrayList9.size() > i5) {
                                i5 = arrayList9.size();
                                c2h1 = c2h12;
                            }
                        }
                        if (c2h1 == null) {
                            A0B();
                        } else {
                            A0Q(c2h1, false);
                        }
                    } else {
                        C0K0 c0k05 = this.A0o;
                        if (c0k05 != null) {
                            A0U(c0k05);
                        }
                    }
                }
            }
            return;
        }
        throw null;
    }

    public final void A0S(C0K0 c0k0) {
        this.A0o = null;
        A0H();
        A0U(c0k0);
        this.A0o = c0k0;
        if (!(this instanceof C48912Hj)) {
            C48922Hk c48922Hk = (C48922Hk) this;
            GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = c48922Hk.A00;
            C0T4 c0t4 = groupChatLiveLocationsActivity.A05;
            if (c0t4 != null) {
                c0t4.A06();
                c48922Hk.A0u = true;
                c48922Hk.A0U.setVisibility(groupChatLiveLocationsActivity.A0M.A0m == null ? 0 : 8);
                groupChatLiveLocationsActivity.A0L.setLocationMode(2);
                C016007m c016007m = new C016007m(c0k0.A00, c0k0.A01);
                float A00 = GroupChatLiveLocationsActivity.A00(groupChatLiveLocationsActivity, c0k0.A02, 16.0f);
                groupChatLiveLocationsActivity.A0X = true;
                if (groupChatLiveLocationsActivity.A05.A02().A02 < A00) {
                    Point A04 = groupChatLiveLocationsActivity.A05.A0R.A04(c016007m);
                    int i = A04.x;
                    if (i > 0 && A04.y > 0 && i < groupChatLiveLocationsActivity.A0L.getWidth() && A04.y < groupChatLiveLocationsActivity.A0L.getHeight()) {
                        groupChatLiveLocationsActivity.A05.A08(C07K.A0i(c016007m, A00), 1500, groupChatLiveLocationsActivity.A04);
                    } else {
                        groupChatLiveLocationsActivity.A05.A08(C07K.A0h(c016007m), 1500, groupChatLiveLocationsActivity.A04);
                    }
                } else {
                    groupChatLiveLocationsActivity.A05.A08(C07K.A0h(c016007m), 1500, groupChatLiveLocationsActivity.A04);
                }
                groupChatLiveLocationsActivity.A1R();
            } else {
                throw null;
            }
        } else {
            C48912Hj c48912Hj = (C48912Hj) this;
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = c48912Hj.A00;
            C0S8 c0s8 = groupChatLiveLocationsActivity2.A06;
            if (c0s8 != null) {
                try {
                    c0s8.A01.AV9();
                    c48912Hj.A0u = true;
                    c48912Hj.A0U.setVisibility(groupChatLiveLocationsActivity2.A0N.A0m == null ? 0 : 8);
                    groupChatLiveLocationsActivity2.A0M.setLocationMode(2);
                    if (!groupChatLiveLocationsActivity2.A0Y) {
                        groupChatLiveLocationsActivity2.A0Y = true;
                        LatLng latLng = new LatLng(c0k0.A00, c0k0.A01);
                        float A002 = GroupChatLiveLocationsActivity2.A00(groupChatLiveLocationsActivity2, c0k0.A02, 16.0f);
                        groupChatLiveLocationsActivity2.A06.A05();
                        if (groupChatLiveLocationsActivity2.A06.A02().A02 < A002) {
                            Point A003 = groupChatLiveLocationsActivity2.A06.A00().A00(latLng);
                            int i2 = A003.x;
                            if (i2 > 0 && A003.y > 0 && i2 < groupChatLiveLocationsActivity2.A0M.getWidth() && A003.y < groupChatLiveLocationsActivity2.A0M.getHeight()) {
                                groupChatLiveLocationsActivity2.A06.A05();
                                groupChatLiveLocationsActivity2.A06.A0A(AnonymousClass088.A0V(latLng, A002), groupChatLiveLocationsActivity2.A05);
                            } else {
                                groupChatLiveLocationsActivity2.A06.A0A(AnonymousClass088.A0U(latLng), groupChatLiveLocationsActivity2.A05);
                            }
                        } else {
                            groupChatLiveLocationsActivity2.A06.A0A(AnonymousClass088.A0U(latLng), groupChatLiveLocationsActivity2.A05);
                        }
                    }
                    groupChatLiveLocationsActivity2.A1R();
                } catch (RemoteException e) {
                    throw new C09Y(e);
                }
            }
        }
        BottomSheetBehavior bottomSheetBehavior = this.A0Z;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.A0O(4);
        }
    }

    public final void A0T(C0K0 c0k0) {
        Map map = this.A1T;
        synchronized (map) {
            map.put(c0k0.A06, c0k0);
        }
        this.A0v.postDelayed(this.A1O, 3000L);
    }

    public final void A0U(C0K0 c0k0) {
        if (c0k0 != null) {
            for (C2H1 c2h1 : this.A1R) {
                if (c2h1.A02 == c0k0) {
                    break;
                }
            }
        }
        c2h1 = null;
        A0P(c2h1);
    }

    public void A0V(Float f) {
        C62622yI c62622yI = this.A0j;
        if (c62622yI == null) {
            return;
        }
        if (f == null || Math.abs(c62622yI.A00 - f.floatValue()) <= 0.05d) {
            String A01 = A01(c62622yI.A01);
            this.A0j = null;
            for (C2H1 c2h1 : this.A1R) {
                if (A01.equals(A01(c2h1.A04))) {
                    A0Q(c2h1, false);
                    return;
                }
            }
        }
    }

    public final void A0W(String str) {
        if (this.A0m != null) {
            List list = this.A1Q;
            list.clear();
            list.add(this.A0m);
            this.A0n = null;
            this.A0J = null;
            this.A0x.A06(this);
            return;
        }
        List list2 = this.A1Q;
        list2.clear();
        C41461tx c41461tx = this.A1I;
        list2.addAll(c41461tx.A09(this.A0c));
        if (c41461tx.A0h(this.A0c)) {
            if (this.A0n == null) {
                C02L c02l = this.A0z;
                c02l.A05();
                C0K1 c0k1 = c02l.A01;
                if (c0k1 != null) {
                    UserJid userJid = (UserJid) c0k1.A09;
                    if (userJid != null) {
                        this.A0n = new C0K0(userJid);
                        C0IK c0ik = this.A0x;
                        Location A03 = c0ik.A03(str);
                        if (A03 != null) {
                            this.A0n.A00 = A03.getLatitude();
                            this.A0n.A01 = A03.getLongitude();
                            this.A0n.A05 = A03.getTime();
                            this.A0n.A02 = A03.getSpeed();
                            this.A0n.A03 = (int) A03.getAccuracy();
                            this.A0n.A04 = (int) A03.getBearing();
                        }
                        c0ik.A05(3, 5000L, 1000L, this, str);
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
            list2.add(0, this.A0n);
            return;
        }
        this.A0n = null;
        this.A0J = null;
        this.A0x.A06(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0X(boolean r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2GV.A0X(boolean):void");
    }

    public boolean A0Y(int i, int i2) {
        Activity activity = this.A0E;
        if (activity != null) {
            LocationSharingService.A01(activity.getApplicationContext(), this.A1I);
        }
        if (i == 34) {
            if (i2 == -1) {
                this.A1K.A08(this.A0E, this.A0c);
                return true;
            }
            return false;
        } else if (i == 100) {
            if (i2 == 1000) {
                C018308n c018308n = this.A0w;
                Activity activity2 = this.A0E;
                c018308n.A07(activity2, Conversation.A02(activity2, this.A0c));
                this.A0E.finish();
            }
            return true;
        } else {
            return false;
        }
    }

    @Override // X.C0EM
    public void AIL(boolean z) {
        if (z) {
            C67093Ee c67093Ee = new C67093Ee(this, this.A0c);
            Handler handler = this.A0v;
            Runnable runnable = this.A1N;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, this.A0C);
            this.A1J.A01(this.A0c, c67093Ee);
        }
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (C41481tz.A04(location, this.A0J)) {
            this.A0J = location;
            C0K0 c0k0 = this.A0n;
            if (c0k0 != null) {
                c0k0.A00 = location.getLatitude();
                this.A0n.A01 = location.getLongitude();
                this.A0n.A05 = location.getTime();
                this.A0n.A02 = location.getSpeed();
                this.A0n.A03 = (int) location.getAccuracy();
                this.A0n.A04 = (int) location.getBearing();
                ((AbstractC04890Mh) this.A0h).A01.A00();
                if (this.A0p) {
                    this.A0p = false;
                    A0J();
                    return;
                }
                A0T(this.A0n);
            } else if (!this.A1I.A0h(this.A0c)) {
            } else {
                A0J();
            }
        }
    }
}
