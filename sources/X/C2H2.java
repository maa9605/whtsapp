package X;

import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import android.text.Html;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.location.PlaceInfo;
import com.whatsapp.util.WhatsAppLibLoader;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2H2 */
/* loaded from: classes2.dex */
public abstract class C2H2 implements LocationListener {
    public int A00;
    public int A02;
    public int A03;
    public int A04;
    public Bitmap A05;
    public Location A06;
    public Handler A07;
    public Handler A08;
    public HandlerThread A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public View A0I;
    public View A0J;
    public View A0K;
    public View A0L;
    public View A0M;
    public View A0N;
    public View A0O;
    public View A0P;
    public View A0Q;
    public ImageView A0R;
    public ImageView A0S;
    public ListView A0T;
    public ProgressBar A0U;
    public ProgressBar A0V;
    public TextView A0W;
    public ActivityC02320As A0X;
    public C07630Zb A0Y;
    public AbstractC005302j A0Z;
    public C2HZ A0a;
    public C62702yQ A0b;
    public RunnableC62782yY A0c;
    public C67263Ev A0d;
    public C62802ya A0e;
    public PlaceInfo A0f;
    public C2H3 A0g;
    public AnonymousClass241 A0h;
    public Runnable A0i;
    public Runnable A0j;
    public String A0k;
    public boolean A0p;
    public boolean A0q;
    public boolean A0s;
    public boolean A0t;
    public final C018308n A0v;
    public final AbstractC000600i A0w;
    public final C0IK A0x;
    public final C018508q A0y;
    public final C02L A0z;
    public final C018608r A10;
    public final C0L7 A11;
    public final C0LF A12;
    public final C02E A13;
    public final AnonymousClass012 A14;
    public final C001200o A15;
    public final C02F A16;
    public final C000500h A17;
    public final C002301c A18;
    public final C0C9 A19;
    public final C43871y8 A1A;
    public final C40081rY A1B;
    public final C47682Ce A1C;
    public final C2MI A1D;
    public final C003701t A1E;
    public final C455822q A1F;
    public final C41451tw A1G;
    public final C41461tx A1H;
    public final C41471ty A1I;
    public final C62842ye A1K;
    public final C02O A1L;
    public final C40071rX A1M;
    public final C2MB A1N;
    public final InterfaceC002901k A1O;
    public final WhatsAppLibLoader A1P;
    public final PlaceInfo A1J = new PlaceInfo();
    public boolean A0r = false;
    public boolean A0n = false;
    public int A01 = -1;
    public boolean A0u = true;
    public boolean A0l = true;
    public boolean A0o = false;
    public boolean A0m = false;

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public C2H2(C001200o c001200o, AnonymousClass012 anonymousClass012, C003701t c003701t, C455822q c455822q, C018508q c018508q, C2MB c2mb, AbstractC000600i abstractC000600i, C02L c02l, InterfaceC002901k interfaceC002901k, C40081rY c40081rY, C43871y8 c43871y8, C018608r c018608r, C47682Ce c47682Ce, C018308n c018308n, C41471ty c41471ty, C0L7 c0l7, C02E c02e, C40071rX c40071rX, C002301c c002301c, C0C9 c0c9, C62842ye c62842ye, WhatsAppLibLoader whatsAppLibLoader, C2MI c2mi, C41451tw c41451tw, C02F c02f, C000500h c000500h, C0IK c0ik, C41461tx c41461tx, C02O c02o, C0LF c0lf) {
        this.A15 = c001200o;
        this.A14 = anonymousClass012;
        this.A1E = c003701t;
        this.A1F = c455822q;
        this.A0y = c018508q;
        this.A1N = c2mb;
        this.A0w = abstractC000600i;
        this.A0z = c02l;
        this.A1O = interfaceC002901k;
        this.A1B = c40081rY;
        this.A1A = c43871y8;
        this.A10 = c018608r;
        this.A1C = c47682Ce;
        this.A0v = c018308n;
        this.A1I = c41471ty;
        this.A11 = c0l7;
        this.A13 = c02e;
        this.A18 = c002301c;
        this.A1M = c40071rX;
        this.A19 = c0c9;
        this.A1K = c62842ye;
        this.A1P = whatsAppLibLoader;
        this.A1D = c2mi;
        this.A1G = c41451tw;
        this.A16 = c02f;
        this.A17 = c000500h;
        this.A0x = c0ik;
        this.A1H = c41461tx;
        this.A1L = c02o;
        this.A12 = c0lf;
    }

    public int A00() {
        if (!(this instanceof C67183En)) {
            C67153Ek c67153Ek = (C67153Ek) this;
            Location A02 = c67153Ek.A02();
            C0T4 c0t4 = c67153Ek.A01.A03;
            if (c0t4 != null && A02 != null) {
                C18800uL A06 = c0t4.A0R.A06();
                Location location = new Location("");
                C016007m c016007m = A06.A02;
                double d = c016007m.A00;
                C016007m c016007m2 = A06.A03;
                location.setLatitude((d + c016007m2.A00) / 2.0d);
                location.setLongitude((c016007m.A01 + c016007m2.A01) / 2.0d);
                return (int) A02.distanceTo(location);
            }
            return 0;
        }
        C62552yB c62552yB = ((C67183En) this).A01.A0L;
        if (c62552yB != null) {
            LatLng latLng = c62552yB.A00.A02().A03;
            Location location2 = new Location("");
            location2.setLatitude(latLng.A00);
            location2.setLongitude(latLng.A01);
            C31881d6 A01 = c62552yB.A00.A00().A01();
            Location location3 = new Location("");
            LatLng latLng2 = A01.A02;
            double d2 = latLng2.A00;
            LatLng latLng3 = A01.A03;
            location3.setLatitude((d2 + latLng3.A00) / 2.0d);
            location3.setLongitude((latLng2.A01 + latLng3.A01) / 2.0d);
            location2.distanceTo(location3);
            return 0;
        }
        return 0;
    }

    public Dialog A01(int i) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return null;
                }
                return A03(4);
            }
            return A03(3);
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.2y2
            {
                C2H2.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C2H2 c2h2 = C2H2.this;
                c2h2.A0X.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 0);
                C002701i.A18(c2h2.A0X, 2);
            }
        };
        C019208x c019208x = new C019208x(this.A0X);
        c019208x.A03(R.string.gps_required_title);
        c019208x.A02(R.string.gps_required_body);
        c019208x.A01.A0J = true;
        c019208x.A06(R.string.ok, onClickListener);
        return c019208x.A00();
    }

    public Location A02() {
        if (!(this instanceof C67183En)) {
            C0T4 c0t4 = ((C67153Ek) this).A01.A03;
            if (c0t4 != null) {
                C016007m c016007m = c0t4.A02().A03;
                Location location = new Location("");
                location.setLatitude(c016007m.A00);
                location.setLongitude(c016007m.A01);
                return location;
            }
            return null;
        }
        C62552yB c62552yB = ((C67183En) this).A01.A0L;
        if (c62552yB != null) {
            LatLng latLng = c62552yB.A00.A02().A03;
            Location location2 = new Location("");
            location2.setLatitude(latLng.A00);
            location2.setLongitude(latLng.A01);
            return location2;
        }
        return null;
    }

    public final DialogInterfaceC019408z A03(final int i) {
        String string;
        int i2;
        String string2;
        Uri A03;
        View inflate = this.A0X.getLayoutInflater().inflate(R.layout.location_new_user_dialog, (ViewGroup) null, false);
        ImageView imageView = (ImageView) C0AT.A0D(inflate, R.id.header_logo);
        if (i == 3) {
            string = this.A0X.getString(R.string.share_live_location);
        } else if (i == 4) {
            string = this.A0X.getString(R.string.send_this_location);
        } else {
            throw new IllegalArgumentException(C000200d.A0D("Unknown new user dialog type: ", i));
        }
        imageView.setContentDescription(string);
        if (i == 3) {
            i2 = R.drawable.nux_live_location;
        } else if (i == 4) {
            i2 = R.drawable.nux_location;
        } else {
            throw new IllegalArgumentException(C000200d.A0D("Unknown new user dialog type: ", i));
        }
        imageView.setImageResource(i2);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) inflate.findViewById(R.id.location_new_user_description);
        Application application = this.A15.A00;
        C018508q c018508q = this.A0y;
        C018308n c018308n = this.A0v;
        C02E c02e = this.A13;
        if (i == 3) {
            ActivityC02320As activityC02320As = this.A0X;
            boolean A0C = this.A1E.A0C(332);
            int i3 = R.string.live_location_first_use_dialog_description;
            if (A0C) {
                i3 = R.string.live_location_new_user_dialog_description;
            }
            string2 = activityC02320As.getString(i3, "learn-more");
        } else if (i == 4) {
            string2 = this.A0X.getString(R.string.nearby_location_new_user_dialog_description, "learn-more");
        } else {
            throw new IllegalArgumentException(C000200d.A0D("Unknown new user dialog type: ", i));
        }
        C003701t c003701t = this.A1E;
        if (c003701t.A0C(332)) {
            C40071rX c40071rX = this.A1M;
            Uri.Builder A00 = C40071rX.A00();
            A00.appendPath("android");
            A00.appendPath("chats");
            A00.appendPath("how-to-use-location-features");
            c40071rX.A04(A00);
            A03 = A00.build();
        } else {
            A03 = this.A1M.A03("general", "26000049", null);
        }
        AnonymousClass029.A16(application, c018508q, c018308n, c02e, textEmojiLabel, string2, new C72613aJ(A03));
        C019208x c019208x = new C019208x(this.A0X);
        C019308y c019308y = c019208x.A01;
        c019308y.A0C = inflate;
        c019308y.A01 = 0;
        c019308y.A0J = true;
        c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.2y3
            {
                C2H2.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C2H2 c2h2 = C2H2.this;
                C002701i.A18(c2h2.A0X, i);
                if (c2h2.A0o) {
                    c2h2.A08();
                }
            }
        });
        c019308y.A02 = new DialogInterface.OnCancelListener() { // from class: X.2y1
            {
                C2H2.this = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C2H2 c2h2 = C2H2.this;
                if (c2h2.A0o) {
                    c2h2.A08();
                }
            }
        };
        boolean A0C2 = c003701t.A0C(332);
        int i4 = R.string.btn_continue;
        if (A0C2) {
            i4 = R.string.agree;
        }
        c019208x.A06(i4, new DialogInterface.OnClickListener() { // from class: X.2xy
            {
                C2H2.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                C2H2 c2h2 = C2H2.this;
                int i6 = i;
                C002701i.A18(c2h2.A0X, i6);
                if (i6 == 3) {
                    C000200d.A0j(c2h2.A17, "live_location_is_new_user", false);
                    c2h2.A0R(true);
                } else if (i6 != 4) {
                } else {
                    C000200d.A0j(c2h2.A17, "nearby_location_new_user", false);
                    Runnable runnable = c2h2.A0i;
                    if (runnable == null) {
                        throw null;
                    }
                    runnable.run();
                }
            }
        });
        return c019208x.A00();
    }

    public void A04() {
        if (!(this instanceof C67183En)) {
            LocationPicker locationPicker = ((C67153Ek) this).A01;
            C0T4 c0t4 = locationPicker.A03;
            if (c0t4 != null) {
                locationPicker.A07 = null;
                c0t4.A05();
                return;
            }
            return;
        }
        LocationPicker2 locationPicker2 = ((C67183En) this).A01;
        C0S8 c0s8 = locationPicker2.A01;
        if (c0s8 != null) {
            locationPicker2.A05 = null;
            try {
                c0s8.A01.clear();
            } catch (RemoteException e) {
                throw new C09Y(e);
            }
        }
    }

    public void A05() {
        C2H3 c2h3;
        C2H3 c2h32;
        if (!(this instanceof C67183En)) {
            C67153Ek c67153Ek = (C67153Ek) this;
            LocationPicker locationPicker = c67153Ek.A01;
            if (locationPicker.A03 != null) {
                if (!c67153Ek.A0s && locationPicker.A07 == null) {
                    c67153Ek.A04();
                }
                if (!c67153Ek.A0s && (c2h32 = c67153Ek.A0g) != null) {
                    for (PlaceInfo placeInfo : c2h32.A08) {
                        C18750uG c18750uG = new C18750uG();
                        c18750uG.A02 = new C016007m(placeInfo.A01, placeInfo.A02);
                        if (!TextUtils.isEmpty(placeInfo.A06)) {
                            c18750uG.A04 = placeInfo.A06;
                        }
                        if (!TextUtils.isEmpty(placeInfo.A0B)) {
                            c18750uG.A03 = placeInfo.A0B;
                        }
                        c18750uG.A01 = locationPicker.A05;
                        float[] fArr = c18750uG.A06;
                        fArr[0] = 0.5f;
                        fArr[1] = 0.5f;
                        C0T4 c0t4 = locationPicker.A03;
                        C0SJ c0sj = new C0SJ(c0t4, c18750uG);
                        c0t4.A09(c0sj);
                        c0sj.A0I = c0t4;
                        c0sj.A0L = placeInfo;
                        placeInfo.A0D = c0sj;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C67183En c67183En = (C67183En) this;
        LocationPicker2 locationPicker2 = c67183En.A01;
        if (locationPicker2.A01 != null) {
            if (!c67183En.A0s && locationPicker2.A05 == null) {
                c67183En.A04();
            }
            if (!c67183En.A0s && (c2h3 = c67183En.A0g) != null) {
                for (PlaceInfo placeInfo2 : c2h3.A08) {
                    C31871d5 c31871d5 = new C31871d5();
                    c31871d5.A08 = new LatLng(placeInfo2.A01, placeInfo2.A02);
                    if (!TextUtils.isEmpty(placeInfo2.A06)) {
                        c31871d5.A09 = placeInfo2.A06;
                    }
                    if (!TextUtils.isEmpty(placeInfo2.A0B)) {
                        c31871d5.A0A = placeInfo2.A0B;
                    }
                    c31871d5.A07 = locationPicker2.A03;
                    c31871d5.A02 = 0.5f;
                    c31871d5.A03 = 0.5f;
                    C0SL A03 = locationPicker2.A01.A03(c31871d5);
                    if (A03 != null) {
                        try {
                            A03.A00.AXF(new BinderC06190Rw(placeInfo2));
                            placeInfo2.A0D = A03;
                        } catch (RemoteException e) {
                            throw new C09Y(e);
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
    }

    public void A06() {
        Handler handler = this.A08;
        if (handler != null) {
            handler.removeCallbacks(this.A0j);
        }
        C67263Ev c67263Ev = this.A0d;
        if (c67263Ev != null) {
            c67263Ev.A05(true);
            this.A0d = null;
        }
        this.A0h.A00();
        C2HZ c2hz = this.A0a;
        c2hz.A01.getViewTreeObserver().removeGlobalOnLayoutListener(c2hz.A02);
        c2hz.A07.A07();
        this.A09.quit();
    }

    public void A07() {
        if (this.A0o || this.A0s) {
            A0R(false);
        }
        this.A0x.A05(3, 5000L, 1000L, this, "location-picker-onresume");
        A0T(false, null);
        System.currentTimeMillis();
    }

    public final void A08() {
        this.A0s = false;
        if (this.A0o) {
            this.A0X.finish();
            return;
        }
        View currentFocus = this.A0X.getCurrentFocus();
        if (currentFocus != null) {
            this.A1N.A01(currentFocus);
        }
        if (this.A0A != null) {
            this.A0J.clearAnimation();
            if (this.A0J.getVisibility() == 0) {
                A0S(false, null);
                TranslateAnimation translateAnimation = new TranslateAnimation() { // from class: X.2yS
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
                        C2H2.this = this;
                    }

                    @Override // android.view.animation.TranslateAnimation, android.view.animation.Animation
                    public void applyTransformation(float f, Transformation transformation) {
                        super.applyTransformation(f, transformation);
                        C2H2 c2h2 = C2H2.this;
                        c2h2.A0G((int) ((1.0f - f) * c2h2.A0J.getHeight()));
                    }
                };
                translateAnimation.setDuration(350L);
                translateAnimation.setAnimationListener(new C0DJ() { // from class: X.3Er
                    {
                        C2H2.this = this;
                    }

                    @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        C2H2 c2h2 = C2H2.this;
                        c2h2.A0J.setVisibility(8);
                        c2h2.A0G(0);
                    }
                });
                translateAnimation.setInterpolator(new AccelerateInterpolator());
                this.A0J.startAnimation(translateAnimation);
            } else {
                this.A0J.setVisibility(8);
                A0G(0);
            }
            if (this.A0b != null) {
                this.A0A.clearAnimation();
                if (this.A0A.getVisibility() != 0) {
                    this.A0A.setVisibility(0);
                    A0S(false, null);
                    final C62702yQ c62702yQ = this.A0b;
                    final C0DJ c0dj = new C0DJ() { // from class: X.3Et
                        {
                            C2H2.this = this;
                        }

                        @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation) {
                            C2H2 c2h2 = C2H2.this;
                            c2h2.A0J(c2h2.A02(), c2h2.A00(), null, false);
                        }

                        @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation) {
                            C2H2 c2h2 = C2H2.this;
                            c2h2.A0K(c2h2.A06, c2h2.A0A.getHeight(), true, Float.valueOf(-0.5f));
                        }
                    };
                    if (c62702yQ != null) {
                        TranslateAnimation translateAnimation2 = new TranslateAnimation() { // from class: X.2yN
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                            }

                            @Override // android.view.animation.TranslateAnimation, android.view.animation.Animation
                            public void applyTransformation(float f, Transformation transformation) {
                                super.applyTransformation(f, transformation);
                                C62702yQ c62702yQ2 = c62702yQ;
                                c62702yQ2.A02.A00(c62702yQ2.A01.getHeight() * f);
                            }
                        };
                        translateAnimation2.setAnimationListener(new C0DJ() { // from class: X.3Ep
                            @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                            public void onAnimationEnd(Animation animation) {
                                C62702yQ c62702yQ2 = c62702yQ;
                                c62702yQ2.A02.A00(c62702yQ2.A01.getHeight());
                                c0dj.onAnimationEnd(animation);
                            }

                            @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                            public void onAnimationStart(Animation animation) {
                                c0dj.onAnimationStart(animation);
                            }
                        });
                        translateAnimation2.setDuration(400L);
                        translateAnimation2.setInterpolator(new AccelerateInterpolator());
                        c62702yQ.A01.startAnimation(translateAnimation2);
                        return;
                    }
                    throw null;
                }
                this.A0A.setVisibility(0);
                if (this.A0A.getHeight() == 0) {
                    this.A0A.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.2yW
                        {
                            C2H2.this = this;
                        }

                        @Override // android.view.ViewTreeObserver.OnPreDrawListener
                        public boolean onPreDraw() {
                            C2H2 c2h2 = C2H2.this;
                            c2h2.A0A.getViewTreeObserver().removeOnPreDrawListener(this);
                            C62702yQ c62702yQ2 = c2h2.A0b;
                            c62702yQ2.A02.A00(c2h2.A0A.getHeight());
                            c2h2.A0J(c2h2.A02(), c2h2.A00(), null, false);
                            c2h2.A0T(true, null);
                            return true;
                        }
                    });
                    return;
                }
                C62702yQ c62702yQ2 = this.A0b;
                c62702yQ2.A02.A00(this.A0A.getHeight());
                A0J(A02(), A00(), null, false);
                A0T(true, null);
                return;
            }
            return;
        }
        A0S(false, null);
        A0J(A02(), A00(), null, false);
        A0T(true, null);
    }

    public final void A09() {
        int indexOf;
        PlaceInfo placeInfo = this.A0f;
        if (placeInfo != null && (indexOf = this.A0g.A08.indexOf(placeInfo)) >= 0) {
            A0D();
            ListView listView = this.A0T;
            listView.smoothScrollToPosition(listView.getHeaderViewsCount() + indexOf);
        }
    }

    public final void A0A() {
        if (this.A1E.A0C(332) && this.A17.A00.getBoolean("nearby_location_new_user", true)) {
            this.A0i = new RunnableEBaseShape3S0100000_I0_3(this, 26);
            C002701i.A19(this.A0X, 4);
            return;
        }
        if (this.A0t) {
            Intent intent = new Intent();
            intent.putExtra("locations_string", this.A0k);
            PlaceInfo placeInfo = this.A1J;
            intent.putExtra("longitude", placeInfo.A02);
            intent.putExtra("latitude", placeInfo.A01);
            this.A0X.setResult(-1, intent);
        } else {
            Location location = this.A06;
            AnonymousClass092 anonymousClass092 = null;
            if (location != null && location.getAccuracy() > 200.0f) {
                location = null;
            }
            long longExtra = this.A0X.getIntent().getLongExtra("quoted_message_row_id", 0L);
            C011005l A04 = C011005l.A04(this.A0X.getIntent().getStringExtra("quoted_group_jid"));
            if (longExtra > 0) {
                anonymousClass092 = this.A19.A0C(longExtra);
            } else if (A04 != null) {
                anonymousClass092 = C05U.A00(A04, this.A14.A05());
            }
            AbstractC005302j abstractC005302j = this.A0Z;
            if (abstractC005302j != null) {
                C018608r c018608r = this.A10;
                boolean booleanExtra = this.A0X.getIntent().getBooleanExtra("has_number_from_url", false);
                C05U c05u = c018608r.A12;
                AnonymousClass012 anonymousClass012 = c018608r.A0J;
                long A05 = anonymousClass012.A05();
                C05V c05v = c05u.A07;
                C0LP c0lp = new C0LP(C05V.A00(c05v.A01, c05v.A00, abstractC005302j, true), A05, location);
                c05u.A05(c0lp, anonymousClass092);
                if (booleanExtra) {
                    c0lp.A0U(4);
                }
                c018608r.A0R(c0lp);
                C0C9 c0c9 = c018608r.A0U;
                c0c9.A0F.A01(new C1O1(c0c9, c0lp, 2), 26);
                C2Ec c2Ec = new C2Ec(anonymousClass012, c018608r.A01, c0c9, c018608r.A0b, c018608r.A0c, c018608r.A0l, c018608r.A0L, c018608r.A03, c018608r.A0m, c018608r.A0X, c0lp);
                c2Ec.A01 = 15;
                c018608r.A1B.ARy(c2Ec, new Void[0]);
            }
            this.A0X.setResult(-1);
        }
        this.A0X.finish();
    }

    public final void A0B() {
        String str;
        C2H3 c2h3 = this.A0g;
        if (c2h3 == null || c2h3.A08.isEmpty()) {
            str = null;
        } else if (c2h3.A0E == 3) {
            str = this.A0X.getString(R.string.location_data_provided_by_fousquare, "<a href='https://foursquare.com/'>foursquare</a>");
        } else {
            str = c2h3.A03;
        }
        this.A0M.setVisibility(8);
        if (str != null && !this.A0n) {
            this.A0W.setText(Html.fromHtml(str));
            this.A0W.setVisibility(0);
            return;
        }
        this.A0W.setVisibility(8);
    }

    public final void A0C() {
        TextView textView;
        if (!this.A0m) {
            textView = (TextView) this.A0X.findViewById(R.id.location_accuracy);
        } else if (this.A0n) {
            return;
        } else {
            textView = (TextView) this.A0G.findViewById(R.id.location_description);
        }
        if (textView != null) {
            if (this.A0t && !TextUtils.isEmpty(this.A0k)) {
                textView.setVisibility(0);
                textView.setText(this.A0k);
            } else if (!this.A0t && this.A01 > 0) {
                textView.setVisibility(0);
                C002301c c002301c = this.A18;
                int i = this.A01;
                textView.setText(c002301c.A0A(R.plurals.location_accuracy, i, Integer.valueOf(i)));
            } else {
                textView.setVisibility(8);
            }
        }
    }

    public final void A0D() {
        ArrayList arrayList;
        C62802ya c62802ya = this.A0e;
        C2H3 c2h3 = this.A0g;
        if (c2h3 != null) {
            arrayList = c2h3.A08;
        } else {
            arrayList = null;
        }
        c62802ya.A01 = arrayList;
        c62802ya.A00 = this.A0f;
        c62802ya.notifyDataSetChanged();
    }

    public void A0E(double d, double d2) {
        PlaceInfo placeInfo = this.A1J;
        placeInfo.A01 = d;
        placeInfo.A02 = d2;
        placeInfo.A06 = null;
        placeInfo.A04 = null;
        if ((!this.A0n || this.A0r) && !(this.A0t && TextUtils.isEmpty(this.A0k))) {
            return;
        }
        if (this.A0f == null && this.A0m) {
            this.A0B.setVisibility(0);
        }
        this.A07.removeCallbacks(this.A0c);
        RunnableC62782yY runnableC62782yY = new RunnableC62782yY(this, d, d2);
        this.A0c = runnableC62782yY;
        this.A07.post(runnableC62782yY);
    }

    public void A0F(int i) {
        if (!(this instanceof C67183En)) {
            C0T4 c0t4 = ((C67153Ek) this).A01.A03;
            if (c0t4 != null) {
                c0t4.A07(0, 0, i);
                return;
            }
            return;
        }
        C0S8 c0s8 = ((C67183En) this).A01.A01;
        if (c0s8 != null) {
            c0s8.A07(0, 0, i);
        }
    }

    public final void A0G(int i) {
        this.A02 = i;
        int max = Math.max(this.A00, i);
        this.A0K.setPadding(0, 0, 0, max);
        this.A0K.requestLayout();
        A0F(max);
    }

    public final void A0H(int i, boolean z, Float f) {
        this.A0A.clearAnimation();
        A0K(A02(), i, z, f);
        C62702yQ c62702yQ = this.A0b;
        if (c62702yQ != null) {
            if (z) {
                Animation animation = new Animation(c62702yQ.A01, i) { // from class: X.2yP
                    public final int A00;
                    public final int A01;

                    @Override // android.view.animation.Animation
                    public boolean willChangeBounds() {
                        return true;
                    }

                    {
                        this.A01 = i;
                        this.A00 = r3.getHeight();
                    }

                    @Override // android.view.animation.Animation
                    public void applyTransformation(float f2, Transformation transformation) {
                        int i2 = this.A00;
                        int i3 = i2 + ((int) ((this.A01 - i2) * f2));
                        C62702yQ c62702yQ2 = C62702yQ.this;
                        View view = c62702yQ2.A01;
                        view.getLayoutParams().height = i3;
                        view.requestLayout();
                        c62702yQ2.A02.A00(i3);
                    }
                };
                animation.setDuration((int) (i / c62702yQ.A00.getDisplayMetrics().density));
                c62702yQ.A01.startAnimation(animation);
                return;
            }
            c62702yQ.A01.getLayoutParams().height = i;
            c62702yQ.A01.requestLayout();
            c62702yQ.A02.A00(i);
        }
    }

    public void A0I(Intent intent) {
        if ("android.intent.action.SEARCH".equals(intent.getAction())) {
            A0J(A02(), Math.max(A00(), 50000), intent.getStringExtra("query"), true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Ev, X.0HS] */
    public final void A0J(Location location, int i, String str, boolean z) {
        this.A08.removeCallbacks(this.A0j);
        if (this.A0n) {
            this.A0V.setVisibility(0);
        } else {
            this.A0U.setVisibility(0);
        }
        this.A0f = null;
        A04();
        this.A0X.findViewById(R.id.places_empty).setVisibility(8);
        this.A0W.setVisibility(8);
        this.A0M.setVisibility(8);
        this.A0g = new C2H3();
        A0D();
        ?? r3 = new C0HS(location, i, str, z) { // from class: X.3Ev
            public int A00;
            public Location A01;
            public String A02;
            public boolean A03;

            {
                C2H2.this = this;
                this.A01 = location;
                this.A02 = str;
                this.A00 = i;
                this.A03 = z;
            }

            /* JADX WARN: Code restructure failed: missing block: B:249:0x02d0, code lost:
                if (r12 != null) goto L96;
             */
            /* JADX WARN: Code restructure failed: missing block: B:250:0x02d2, code lost:
                r1 = r12.optJSONObject("icon");
             */
            /* JADX WARN: Code restructure failed: missing block: B:251:0x02d8, code lost:
                if (r1 == null) goto L106;
             */
            /* JADX WARN: Code restructure failed: missing block: B:252:0x02da, code lost:
                r12 = r1.optString("prefix");
                r11.A05 = r12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:253:0x02e2, code lost:
                if (r12 == null) goto L106;
             */
            /* JADX WARN: Code restructure failed: missing block: B:254:0x02e4, code lost:
                r11.A05 = X.C000200d.A0L(new java.lang.StringBuilder(), r12, "64.png");
             */
            @Override // X.C0HS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object A07(java.lang.Object[] r26) {
                /*
                    Method dump skipped, instructions count: 938
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C67263Ev.A07(java.lang.Object[]):java.lang.Object");
            }

            /* JADX WARN: Removed duplicated region for block: B:140:0x0143  */
            /* JADX WARN: Removed duplicated region for block: B:144:0x014f  */
            /* JADX WARN: Removed duplicated region for block: B:160:0x01c9  */
            /* JADX WARN: Removed duplicated region for block: B:169:0x0217  */
            @Override // X.C0HS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A09(java.lang.Object r33) {
                /*
                    Method dump skipped, instructions count: 649
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C67263Ev.A09(java.lang.Object):void");
            }
        };
        this.A0d = r3;
        this.A1O.ARy(r3, new Void[0]);
    }

    public void A0K(Location location, int i, boolean z, Float f) {
        if (!(this instanceof C67183En)) {
            C67153Ek c67153Ek = (C67153Ek) this;
            LocationPicker locationPicker = c67153Ek.A01;
            if (locationPicker.A03 != null && location != null) {
                C016007m c016007m = new C016007m(location.getLatitude(), location.getLongitude());
                float floatValue = locationPicker.A03.A02().A02 + (f == null ? 0.0f : f.floatValue());
                locationPicker.A03.A07(0, 0, i);
                C015807k A0i = C07K.A0i(c016007m, floatValue);
                C0T4 c0t4 = locationPicker.A03;
                if (z) {
                    c0t4.A08(A0i, 400, c67153Ek.A00);
                    return;
                } else {
                    c0t4.A08(A0i, 0, null);
                    return;
                }
            }
            return;
        }
        C67183En c67183En = (C67183En) this;
        C62552yB c62552yB = c67183En.A01.A0L;
        if (c62552yB != null) {
            Integer valueOf = Integer.valueOf(i);
            C18E c18e = c67183En.A00;
            if (location != null) {
                LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
                C0S8 c0s8 = c62552yB.A00;
                float floatValue2 = c0s8.A02().A02 + (f == null ? 0.0f : f.floatValue());
                if (valueOf != null) {
                    c0s8.A07(0, 0, valueOf.intValue());
                }
                C09X A0V = AnonymousClass088.A0V(latLng, floatValue2);
                if (z) {
                    c0s8.A0B(A0V, c18e);
                } else {
                    c0s8.A09(A0V);
                }
            }
        }
    }

    public void A0L(Bundle bundle) {
        bundle.putParcelable("places", this.A0g);
        bundle.putBoolean("show_live_location_setting", this.A0s);
        bundle.putBoolean("fullscreen", this.A0n);
        bundle.putBoolean("zoom_to_user", this.A0u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x00e0, code lost:
        if (r5 != false) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0M(final X.ActivityC02320As r30, android.os.Bundle r31) {
        /*
            Method dump skipped, instructions count: 1213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2H2.A0M(X.0As, android.os.Bundle):void");
    }

    public final void A0N(PlaceInfo placeInfo) {
        AnonymousClass092 A00;
        if (this.A1E.A0C(332) && this.A17.A00.getBoolean("nearby_location_new_user", true)) {
            this.A0i = new RunnableEBaseShape2S0200000_I0_2(this, placeInfo, 34);
            C002701i.A19(this.A0X, 4);
            return;
        }
        if (this.A0t) {
            Intent intent = new Intent();
            intent.putExtra("locations_string", placeInfo.A06);
            PlaceInfo placeInfo2 = this.A1J;
            intent.putExtra("longitude", placeInfo2.A02);
            intent.putExtra("latitude", placeInfo2.A01);
            this.A0X.setResult(-1, intent);
        } else {
            long longExtra = this.A0X.getIntent().getLongExtra("quoted_message_row_id", 0L);
            C011005l A04 = C011005l.A04(this.A0X.getIntent().getStringExtra("quoted_group_jid"));
            if (longExtra > 0) {
                A00 = this.A19.A0C(longExtra);
            } else {
                A00 = A04 != null ? C05U.A00(A04, this.A14.A05()) : null;
            }
            AbstractC005302j abstractC005302j = this.A0Z;
            if (abstractC005302j != null) {
                C018608r c018608r = this.A10;
                boolean booleanExtra = this.A0X.getIntent().getBooleanExtra("has_number_from_url", false);
                C05U c05u = c018608r.A12;
                AnonymousClass012 anonymousClass012 = c018608r.A0J;
                long A05 = anonymousClass012.A05();
                C05V c05v = c05u.A07;
                C0LP c0lp = new C0LP(C05V.A00(c05v.A01, c05v.A00, abstractC005302j, true), A05, placeInfo);
                c05u.A05(c0lp, A00);
                if (booleanExtra) {
                    c0lp.A0U(4);
                }
                c018608r.A0R(c0lp);
                C0C9 c0c9 = c018608r.A0U;
                c0c9.A0F.A01(new C1O1(c0c9, c0lp, 2), 26);
                c018608r.A1B.ARy(new C2Ec(anonymousClass012, c018608r.A01, c0c9, c018608r.A0b, c018608r.A0c, c018608r.A0l, c018608r.A0L, c018608r.A03, c018608r.A0m, c018608r.A0X, c0lp), new Void[0]);
            }
            this.A0X.setResult(-1);
        }
        this.A0X.finish();
    }

    public void A0O(Object obj) {
        Iterator it = this.A0g.A08.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            PlaceInfo placeInfo = (PlaceInfo) it.next();
            if (obj.equals(placeInfo.A0D)) {
                this.A0f = placeInfo;
                break;
            }
        }
        A09();
    }

    public void A0P(String str, Object obj) {
        if (str == null) {
            return;
        }
        for (PlaceInfo placeInfo : this.A0g.A08) {
            if (obj.equals(placeInfo.A0D)) {
                A0N(placeInfo);
                return;
            }
        }
    }

    public void A0Q(boolean z) {
        if (!(this instanceof C67183En)) {
            C67153Ek c67153Ek = (C67153Ek) this;
            LocationPicker locationPicker = c67153Ek.A01;
            if (locationPicker.A03 != null) {
                if (locationPicker.A07 == null) {
                    c67153Ek.A04();
                }
                Location location = c67153Ek.A06;
                if (location != null) {
                    C016007m c016007m = new C016007m(location.getLatitude(), c67153Ek.A06.getLongitude());
                    LocationPicker.A00(locationPicker, c016007m);
                    locationPicker.A03.A0B(false);
                    C015907l c015907l = new C015907l(c016007m, 15.0f, Float.MIN_VALUE, 0.0f);
                    C0T4 c0t4 = locationPicker.A03;
                    C015807k A0g = C07K.A0g(c015907l);
                    if (z) {
                        c0t4.A08(A0g, 400, c67153Ek.A00);
                        return;
                    } else {
                        c0t4.A08(A0g, 0, null);
                        return;
                    }
                }
                return;
            }
            return;
        }
        C67183En c67183En = (C67183En) this;
        LocationPicker2 locationPicker2 = c67183En.A01;
        if (locationPicker2.A01 != null) {
            if (locationPicker2.A05 == null) {
                c67183En.A04();
            }
            Location location2 = c67183En.A06;
            if (location2 != null) {
                LatLng latLng = new LatLng(location2.getLatitude(), c67183En.A06.getLongitude());
                LocationPicker2.A00(locationPicker2, latLng);
                locationPicker2.A01.A0J(false);
                CameraPosition cameraPosition = new CameraPosition(latLng, 15.0f, 0.0f, 0.0f);
                C0S8 c0s8 = locationPicker2.A01;
                C09X A0T = AnonymousClass088.A0T(cameraPosition);
                if (z) {
                    c0s8.A0B(A0T, c67183En.A00);
                } else {
                    c0s8.A09(A0T);
                }
            }
        }
    }

    public final void A0R(boolean z) {
        if (this.A17.A00.getBoolean("live_location_is_new_user", true)) {
            C002701i.A19(this.A0X, 3);
            return;
        }
        LocationManager A09 = this.A13.A09();
        if (A09 != null && !A09.isProviderEnabled("gps") && !A09.isProviderEnabled("network")) {
            C002701i.A19(this.A0X, 2);
        } else if (!this.A16.A04()) {
            this.A0s = false;
            A0T(false, null);
        } else {
            this.A0g = new C2H3();
            this.A0s = true;
            View view = this.A0A;
            if (view != null) {
                if (this.A0b != null) {
                    view.clearAnimation();
                    final C62702yQ c62702yQ = this.A0b;
                    if (z && c62702yQ.A01.getVisibility() == 0) {
                        TranslateAnimation translateAnimation = new TranslateAnimation() { // from class: X.2yO
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
                            }

                            @Override // android.view.animation.TranslateAnimation, android.view.animation.Animation
                            public void applyTransformation(float f, Transformation transformation) {
                                super.applyTransformation(f, transformation);
                                C62702yQ c62702yQ2 = c62702yQ;
                                c62702yQ2.A02.A00((1.0f - f) * c62702yQ2.A01.getHeight());
                            }
                        };
                        translateAnimation.setAnimationListener(new C0DJ() { // from class: X.3Eq
                            @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                            public void onAnimationEnd(Animation animation) {
                                C62702yQ c62702yQ2 = c62702yQ;
                                c62702yQ2.A01.setVisibility(8);
                                c62702yQ2.A02.A00(0.0f);
                            }
                        });
                        translateAnimation.setDuration(350L);
                        translateAnimation.setInterpolator(new AccelerateInterpolator());
                        c62702yQ.A01.startAnimation(translateAnimation);
                    } else {
                        c62702yQ.A01.setVisibility(8);
                        c62702yQ.A02.A00(0.0f);
                    }
                }
                this.A0J.clearAnimation();
                if (z && this.A0J.getVisibility() != 0) {
                    this.A0J.setVisibility(0);
                    A0S(false, null);
                    TranslateAnimation translateAnimation2 = new TranslateAnimation() { // from class: X.2yX
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                            C2H2.this = this;
                        }

                        @Override // android.view.animation.TranslateAnimation, android.view.animation.Animation
                        public void applyTransformation(float f, Transformation transformation) {
                            super.applyTransformation(f, transformation);
                            C2H2 c2h2 = C2H2.this;
                            c2h2.A0G((int) (c2h2.A0J.getHeight() * f));
                        }
                    };
                    translateAnimation2.setDuration(400L);
                    translateAnimation2.setAnimationListener(new C0DJ() { // from class: X.3Eu
                        {
                            C2H2.this = this;
                        }

                        @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation) {
                            C2H2 c2h2 = C2H2.this;
                            c2h2.A0G(c2h2.A0J.getHeight());
                            c2h2.A0S(true, null);
                        }

                        @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation) {
                            C2H2 c2h2 = C2H2.this;
                            c2h2.A0F(c2h2.A0J.getHeight());
                            c2h2.A0Q(true);
                        }
                    });
                    translateAnimation2.setInterpolator(new AccelerateInterpolator());
                    this.A0J.startAnimation(translateAnimation2);
                    return;
                }
                this.A0J.setVisibility(0);
                if (this.A0J.getHeight() == 0) {
                    this.A0J.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.2yR
                        {
                            C2H2.this = this;
                        }

                        @Override // android.view.ViewTreeObserver.OnPreDrawListener
                        public boolean onPreDraw() {
                            C2H2 c2h2 = C2H2.this;
                            c2h2.A0J.getViewTreeObserver().removeOnPreDrawListener(this);
                            c2h2.A0G(c2h2.A0J.getHeight());
                            c2h2.A0Q(false);
                            c2h2.A0S(false, null);
                            return true;
                        }
                    });
                    return;
                }
                A0G(this.A0J.getHeight());
                A0Q(false);
                A0S(false, null);
                return;
            }
            A0Q(true);
            A0T(true, null);
        }
    }

    public void A0S(boolean z, Float f) {
        boolean z2;
        PlaceInfo placeInfo;
        Object obj;
        PlaceInfo placeInfo2;
        Object obj2;
        PlaceInfo placeInfo3;
        Object obj3;
        int height;
        PlaceInfo placeInfo4;
        Object obj4;
        if (!(this instanceof C67183En)) {
            z2 = false;
            if (((C67153Ek) this).A01.A03 != null) {
                z2 = true;
            }
        } else {
            z2 = false;
            if (((C67183En) this).A01.A01 != null) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.A0s) {
                if (this.A0Y.A05()) {
                    this.A0Y.A04(true);
                }
                this.A0n = false;
                this.A0R.setVisibility(8);
                this.A0P.setVisibility(8);
                this.A0E.setVisibility(8);
                this.A0B.setVisibility(8);
                this.A0X.invalidateOptionsMenu();
                return;
            }
            C02F c02f = this.A16;
            if (c02f.A04()) {
                if (!(this instanceof C67183En)) {
                    LocationPicker locationPicker = ((C67153Ek) this).A01;
                    if (locationPicker.A03 != null && locationPicker.A0G.A04()) {
                        locationPicker.A03.A0B(true);
                    }
                } else {
                    LocationPicker2 locationPicker2 = ((C67183En) this).A01;
                    if (locationPicker2.A01 != null && locationPicker2.A0E.A04()) {
                        locationPicker2.A01.A0J(true);
                    }
                }
            }
            A04();
            A05();
            this.A0R.setVisibility(0);
            if (this.A0n) {
                this.A0R.setImageResource(R.drawable.btn_map_fullscreen_off);
                this.A0R.setContentDescription(this.A0X.getString(R.string.show_places_list));
                if (this.A0m) {
                    ImageView imageView = (ImageView) this.A0T.findViewById(R.id.send_current_location_icon);
                    if (imageView != null) {
                        imageView.setImageResource(R.drawable.ic_current_location);
                    }
                    TextView textView = (TextView) this.A0T.findViewById(R.id.send_current_location_text);
                    if (textView != null) {
                        textView.setText(R.string.send_this_location);
                    }
                }
                TextView textView2 = (TextView) this.A0X.findViewById(R.id.location_picker_current_location_text);
                if (this.A0t && textView2 != null) {
                    textView2.setText(R.string.select_this_location);
                }
                if (!(this instanceof C67183En)) {
                    LocationPicker locationPicker3 = ((C67153Ek) this).A01;
                    if (locationPicker3.A03 != null && (placeInfo4 = locationPicker3.A0O.A0f) != null && (obj4 = placeInfo4.A0D) != null) {
                        C0SJ c0sj = (C0SJ) obj4;
                        c0sj.A0H(locationPicker3.A06);
                        c0sj.A0E();
                    }
                } else {
                    LocationPicker2 locationPicker22 = ((C67183En) this).A01;
                    if (locationPicker22.A01 != null && (placeInfo3 = locationPicker22.A0N.A0f) != null && (obj3 = placeInfo3.A0D) != null) {
                        C0SL c0sl = (C0SL) obj3;
                        c0sl.A05(locationPicker22.A04);
                        c0sl.A03();
                    }
                }
                this.A0W.setVisibility(8);
                if (this.A0A != null) {
                    this.A0P.setVisibility(0);
                    this.A0T.setAdapter((ListAdapter) null);
                    this.A0T.setOnScrollListener(null);
                    if (this.A0m) {
                        height = this.A0H.getHeight() + this.A0T.findViewById(R.id.send_current_location_btn).getHeight() + this.A0T.findViewById(R.id.nearby_places_header).getHeight();
                    } else {
                        height = this.A0F.getHeight();
                    }
                    this.A0O.getLayoutParams().height = height;
                    A0H(height, true, f);
                } else {
                    this.A0P.setVisibility(8);
                }
                PlaceInfo placeInfo5 = this.A0f;
                if ((placeInfo5 == null || placeInfo5.A0D == null) && (!this.A0Y.A05() || !C2MB.A00(this.A0Q))) {
                    this.A0E.setVisibility(0);
                } else {
                    this.A0E.setVisibility(8);
                }
            } else {
                if (this.A0m) {
                    ImageView imageView2 = (ImageView) this.A0T.findViewById(R.id.send_current_location_icon);
                    if (imageView2 != null) {
                        imageView2.setImageResource(R.drawable.btn_send_current_location);
                    }
                    TextView textView3 = (TextView) this.A0T.findViewById(R.id.send_current_location_text);
                    if (textView3 != null) {
                        textView3.setText(R.string.send_your_current_location);
                    }
                    A0C();
                }
                TextView textView4 = (TextView) this.A0X.findViewById(R.id.location_picker_current_location_text);
                if (this.A0t && textView4 != null) {
                    textView4.setText(R.string.select_your_current_location);
                }
                this.A0R.setImageResource(R.drawable.btn_map_fullscreen_on);
                this.A0R.setContentDescription(this.A0X.getString(R.string.hide_places_list));
                if (!(this instanceof C67183En)) {
                    LocationPicker locationPicker4 = ((C67153Ek) this).A01;
                    if (locationPicker4.A03 != null && (placeInfo2 = locationPicker4.A0O.A0f) != null && (obj2 = placeInfo2.A0D) != null) {
                        C0SJ c0sj2 = (C0SJ) obj2;
                        c0sj2.A0H(locationPicker4.A06);
                        c0sj2.A0D();
                    }
                } else {
                    LocationPicker2 locationPicker23 = ((C67183En) this).A01;
                    if (locationPicker23.A01 != null && (placeInfo = locationPicker23.A0N.A0f) != null && (obj = placeInfo.A0D) != null) {
                        C0SL c0sl2 = (C0SL) obj;
                        c0sl2.A05(locationPicker23.A04);
                        c0sl2.A02();
                    }
                }
                if (c02f.A04()) {
                    this.A0P.setVisibility(0);
                } else {
                    this.A0P.setVisibility(8);
                }
                A0B();
                if (this.A0A != null) {
                    int i = this.A04;
                    if (C2MB.A00(this.A0Q)) {
                        i >>= 1;
                    }
                    this.A0O.getLayoutParams().height = i;
                    if (c02f.A04()) {
                        A0H(i, z, f);
                    }
                    this.A0T.setAdapter((ListAdapter) this.A0e);
                    A09();
                }
                this.A0E.setVisibility(8);
                this.A0B.setVisibility(8);
            }
            this.A0X.invalidateOptionsMenu();
        }
    }

    public void A0T(boolean z, Float f) {
        boolean A04 = this.A16.A04();
        LocationSharingService.A01(this.A15.A00, this.A1H);
        if (A04) {
            this.A0S.setVisibility(0);
            this.A0N.setVisibility(8);
            if (this.A0s) {
                this.A0F.setVisibility(8);
                this.A0P.setVisibility(8);
                this.A0H.setVisibility(8);
                if (this.A0J == null) {
                    this.A0I.setVisibility(0);
                }
            } else {
                this.A0P.setVisibility(0);
                if (this.A0m) {
                    this.A0H.setVisibility(0);
                    this.A0F.setVisibility(8);
                } else {
                    this.A0H.setVisibility(8);
                    this.A0F.setVisibility(0);
                }
                if (this.A0J == null) {
                    this.A0I.setVisibility(8);
                }
            }
            A0U(true, false, null);
            A0S(z, f);
            return;
        }
        this.A0F.setVisibility(8);
        this.A0H.setVisibility(8);
        this.A0P.setVisibility(8);
        this.A0S.setVisibility(8);
        if (this.A0J == null) {
            this.A0I.setVisibility(8);
        }
        C000500h c000500h = this.A17;
        C000200d.A0j(c000500h, "live_location_is_new_user", true);
        C000200d.A0j(c000500h, "nearby_location_new_user", true);
        A0U(false, z, f);
    }

    public final void A0U(boolean z, boolean z2, final Float f) {
        final View findViewById = this.A0X.findViewById(R.id.permissions_request_minimized);
        if (z) {
            if (findViewById != null) {
                findViewById.setVisibility(4);
                this.A03 = (int) (this.A0L.getMeasuredHeight() * 0.66d);
                ViewGroup.LayoutParams layoutParams = this.A0N.getLayoutParams();
                int i = this.A03;
                layoutParams.height = i;
                A0H(i, z2, f);
                return;
            }
            return;
        }
        this.A0E.setVisibility(8);
        if (this.A0n) {
            this.A0R.setImageResource(R.drawable.btn_map_fullscreen_off);
            if (findViewById != null) {
                findViewById.setVisibility(0);
                if (findViewById.getMeasuredHeight() > 0) {
                    A0H(findViewById.getMeasuredHeight(), z2, f);
                } else {
                    findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.2yT
                        {
                            C2H2.this = this;
                        }

                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public void onGlobalLayout() {
                            View view = findViewById;
                            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            C2H2.this.A0H(view.getMeasuredHeight(), false, f);
                        }
                    });
                }
            }
            this.A0N.setVisibility(8);
            return;
        }
        this.A0R.setImageResource(R.drawable.btn_map_fullscreen_on);
        this.A0N.setVisibility(0);
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(4);
        if (this.A03 <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this.A0N.getLayoutParams();
        int i2 = this.A03;
        layoutParams2.height = i2;
        A0H(i2, z2, f);
    }

    public boolean A0V() {
        if (this.A0Y.A05()) {
            this.A0Y.A04(true);
            return true;
        }
        this.A0a.A05.dismiss();
        if (this.A0s) {
            A08();
            return true;
        }
        return false;
    }

    public boolean A0W(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            this.A0X.onSearchRequested();
            return true;
        } else if (itemId == 1) {
            this.A0l = false;
            A0J(A02(), A00(), null, false);
            return true;
        } else if (itemId != 16908332) {
            return false;
        } else {
            if (!this.A0s) {
                this.A0X.finish();
                return true;
            }
            this.A0a.A05.dismiss();
            A08();
            return true;
        }
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        int i;
        if (C41481tz.A04(location, this.A06)) {
            boolean z = true;
            if (location.hasAccuracy()) {
                i = Math.max(1, (int) location.getAccuracy());
            } else {
                i = -1;
            }
            if (i != this.A01) {
                this.A01 = i;
            }
            A0C();
            C2H3 c2h3 = this.A0g;
            if (c2h3 != null && c2h3.A00() != null && this.A0l && location.getAccuracy() < 200.0f && this.A0g.A00().distanceTo(location) > 1000.0f) {
                this.A0l = false;
            } else {
                z = false;
            }
            this.A06 = location;
            if (this.A0g == null || z) {
                if ((location.getAccuracy() >= 200.0f || location.getTime() + 60000 <= System.currentTimeMillis()) && !this.A0q) {
                    return;
                }
                C018508q c018508q = this.A0y;
                c018508q.A02.post(new RunnableEBaseShape0S0210000_I0(this, location, z, 9));
            }
        }
    }
}
