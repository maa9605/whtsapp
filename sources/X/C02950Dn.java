package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.BootReceiver;
import com.whatsapp.TellAFriendReceiver;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.UpdatedOurAppReceiver;
import com.whatsapp.WaImageView;
import com.whatsapp.accounttransfer.AccountTransferReceiver;
import com.whatsapp.appwidget.WidgetProvider;
import com.whatsapp.companiondevice.CompanionDeviceVerificationReceiver;
import com.whatsapp.location.FinalLiveLocationBroadcastReceiver;
import com.whatsapp.notification.MessageNotificationDismissedReceiver;
import com.whatsapp.notification.MissedCallNotificationDismissedReceiver;
import com.whatsapp.phoneid.PhoneIdRequestReceiver;
import com.whatsapp.push.WAFbnsPreloadReceiver;
import com.whatsapp.registration.PreRegNotificationLearnMoreReceiver;
import com.whatsapp.registration.RegRetryVerificationReceiver;
import com.whatsapp.registration.RegistrationCompletedReceiver;
import com.whatsapp.registration.directmigration.MigrationProviderOrderedBroadcastReceiver;
import com.whatsapp.registration.directmigration.MigrationRequesterBroadcastReceiver;
import com.whatsapp.videoplayback.VideoSurfaceView;
import com.whatsapp.wabloks.ui.PrivacyNotice.PrivacyNoticeDialogFragment;
import com.whatsapp.wabloks.ui.PrivacyNotice.PrivacyNoticeFragment;
import com.whatsapp.wabloks.ui.shops.ShopsProductPreviewFragment;
import com.whatsapp.web.WebSessionVerificationReceiver;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0Dn */
/* loaded from: classes.dex */
public final class C02950Dn extends C0C5 {
    public final C02940Dm A00;
    public volatile InterfaceC007103c A0U;
    public volatile InterfaceC007103c A0V;
    public volatile InterfaceC007103c A0W;
    public volatile InterfaceC007103c A0X;
    public volatile InterfaceC007103c A0Y;
    public volatile InterfaceC007103c A0Z;
    public volatile InterfaceC007103c A0a;
    public volatile InterfaceC007103c A0b;
    public volatile InterfaceC007103c A0c;
    public volatile InterfaceC007103c A0d;
    public volatile InterfaceC007103c A0e;
    public volatile InterfaceC007103c A0f;
    public volatile InterfaceC007103c A0g;
    public volatile InterfaceC007103c A0h;
    public volatile InterfaceC007103c A0i;
    public volatile InterfaceC007103c A0j;
    public volatile InterfaceC007103c A0k;
    public volatile InterfaceC007103c A0l;
    public volatile InterfaceC007103c A0m;
    public volatile InterfaceC007103c A0n;
    public volatile InterfaceC007103c A0o;
    public volatile InterfaceC007103c A0p;
    public volatile InterfaceC007103c A0q;
    public volatile InterfaceC007103c A0r;
    public volatile InterfaceC007103c A0s;
    public volatile InterfaceC007103c A0t;
    public volatile InterfaceC007103c A0u;
    public volatile InterfaceC007103c A0v;
    public volatile InterfaceC007103c A0w;
    public volatile InterfaceC007103c A0x;
    public volatile InterfaceC007103c A0y;
    public volatile InterfaceC007103c A0z;
    public volatile InterfaceC007103c A10;
    public volatile InterfaceC007103c A11;
    public volatile InterfaceC007103c A12;
    public volatile InterfaceC007103c A13;
    public volatile InterfaceC007103c A14;
    public volatile InterfaceC007103c A15;
    public volatile InterfaceC007103c A16;
    public volatile InterfaceC007103c A17;
    public volatile InterfaceC007103c A18;
    public volatile InterfaceC007103c A19;
    public volatile InterfaceC007103c A1A;
    public volatile InterfaceC007103c A1B;
    public volatile InterfaceC007103c A1C;
    public volatile Object A02 = new C41111tO();
    public volatile Object A0M = new C41111tO();
    public volatile Object A0K = new C41111tO();
    public volatile Object A0L = new C41111tO();
    public volatile Object A05 = new C41111tO();
    public volatile Object A0N = new C41111tO();
    public volatile Object A0O = new C41111tO();
    public volatile Object A06 = new C41111tO();
    public volatile Object A0Q = new C41111tO();
    public volatile Object A03 = new C41111tO();
    public volatile Object A0P = new C41111tO();
    public volatile Object A0S = new C41111tO();
    public volatile Object A0R = new C41111tO();
    public volatile Object A0F = new C41111tO();
    public volatile Object A0I = new C41111tO();
    public volatile Object A0C = new C41111tO();
    public volatile Object A0A = new C41111tO();
    public volatile Object A09 = new C41111tO();
    public volatile Object A0B = new C41111tO();
    public volatile Object A08 = new C41111tO();
    public volatile Object A0G = new C41111tO();
    public volatile Object A0H = new C41111tO();
    public volatile Object A0D = new C41111tO();
    public volatile Object A04 = new C41111tO();
    public volatile Object A01 = new C41111tO();
    public volatile Object A0T = new C41111tO();
    public volatile Object A07 = new C41111tO();
    public volatile Object A0J = new C41111tO();
    public volatile Object A0E = new C41111tO();

    public C02950Dn(C02940Dm c02940Dm) {
        this.A00 = c02940Dm;
    }

    public static C41151tS A00(C02950Dn c02950Dn) {
        Object obj;
        Object obj2 = c02950Dn.A07;
        if (obj2 instanceof C41111tO) {
            synchronized (obj2) {
                obj = c02950Dn.A07;
                if (obj instanceof C41111tO) {
                    C003701t A00 = C41121tP.A00();
                    InterfaceC002901k A04 = C41131tQ.A04();
                    C05W A002 = C41141tR.A00();
                    C02960Do c02960Do = C02960Do.A02;
                    C02180Ae.A1B(c02960Do);
                    C0C8 A003 = C0C8.A00();
                    C02180Ae.A1B(A003);
                    obj = new C41151tS(A00, A04, A002, c02960Do, A003);
                    C41161tT.A01(c02950Dn.A07, obj);
                    c02950Dn.A07 = obj;
                }
            }
            obj2 = obj;
        }
        return (C41151tS) obj2;
    }

    public static final C41191tW A01() {
        AnonymousClass012 A01 = C41131tQ.A01();
        C05M A00 = C05M.A00();
        C02180Ae.A1B(A00);
        C41181tV A0A = C41171tU.A0A();
        C0C9 A002 = C0C9.A00();
        C02180Ae.A1B(A002);
        C0CB A003 = C0CB.A00();
        C02180Ae.A1B(A003);
        C0CA A004 = C0CA.A00();
        C02180Ae.A1B(A004);
        if (C02970Dp.A0A == null) {
            synchronized (C02970Dp.class) {
                if (C02970Dp.A0A == null) {
                    C02970Dp.A0A = new C02970Dp(C001200o.A01, C02980Dr.A00(), C02L.A00(), C05W.A00(), C02E.A00(), C018708s.A00(), C0CB.A00(), C02O.A00(), C0C7.A00(), C02990Ds.A00());
                }
            }
        }
        C02970Dp c02970Dp = C02970Dp.A0A;
        C02180Ae.A1B(c02970Dp);
        C0C7 A005 = C0C7.A00();
        C02180Ae.A1B(A005);
        return new C41191tW(A01, A00, A0A, A002, A003, A004, c02970Dp, A005);
    }

    public static final C41241tb A02() {
        C001200o c001200o = C001200o.A01;
        C02180Ae.A1B(c001200o);
        C03010Du A00 = C03010Du.A00();
        C02180Ae.A1B(A00);
        C018608r A02 = C018608r.A02();
        C02180Ae.A1B(A02);
        C40261rr A09 = C41171tU.A09();
        if (C41201tX.A05 == null) {
            synchronized (C41201tX.class) {
                if (C41201tX.A05 == null) {
                    C41201tX.A05 = new C41201tX(AnonymousClass012.A00(), C05M.A00(), C41181tV.A00(), AnonymousClass071.A00(), C0C9.A00());
                }
            }
        }
        C41201tX c41201tX = C41201tX.A05;
        C02180Ae.A1B(c41201tX);
        C41221tZ A03 = C41211tY.A03();
        C0C8 A002 = C0C8.A00();
        C02180Ae.A1B(A002);
        C03020Dv A003 = C03020Dv.A00();
        C02180Ae.A1B(A003);
        C010605h c010605h = C010605h.A03;
        C02180Ae.A1B(c010605h);
        C03030Dw A004 = C41231ta.A00();
        C40371s6 A005 = C40371s6.A00();
        C02180Ae.A1B(A005);
        C0C7 A006 = C0C7.A00();
        C02180Ae.A1B(A006);
        return new C41241tb(c001200o, A00, A02, A09, c41201tX, A03, A002, A003, c010605h, A004, A005, A006);
    }

    public static C41251tc A03(C02950Dn c02950Dn) {
        Object obj;
        Object obj2 = c02950Dn.A0I;
        if (obj2 instanceof C41111tO) {
            synchronized (obj2) {
                obj = c02950Dn.A0I;
                if (obj instanceof C41111tO) {
                    obj = new Object() { // from class: X.1tc
                    };
                    C41161tT.A01(c02950Dn.A0I, obj);
                    c02950Dn.A0I = obj;
                }
            }
            obj2 = obj;
        }
        return (C41251tc) obj2;
    }

    public static C91664Fu A04(C02950Dn c02950Dn) {
        Object obj;
        Object obj2 = c02950Dn.A0L;
        if (obj2 instanceof C41111tO) {
            synchronized (obj2) {
                obj = c02950Dn.A0L;
                if (obj instanceof C41111tO) {
                    InterfaceC007103c interfaceC007103c = c02950Dn.A0h;
                    if (interfaceC007103c == null) {
                        interfaceC007103c = new C03040Dx(c02950Dn, 8);
                        c02950Dn.A0h = interfaceC007103c;
                    }
                    C00J A00 = C41161tT.A00(interfaceC007103c);
                    InterfaceC007103c interfaceC007103c2 = c02950Dn.A14;
                    if (interfaceC007103c2 == null) {
                        interfaceC007103c2 = new C03040Dx(c02950Dn, 11);
                        c02950Dn.A14 = interfaceC007103c2;
                    }
                    obj = new InterfaceC41261td(A00, C41161tT.A00(interfaceC007103c2)) { // from class: X.4Fu
                        public final C00J A00;
                        public final C00J A01;

                        {
                            this.A00 = A00;
                            this.A01 = r2;
                        }

                        @Override // X.InterfaceC41261td
                        public void A67() {
                            C000200d.A0g((C000500h) this.A01.get(), "shops_privacy_notice", -1);
                        }

                        @Override // X.InterfaceC41261td
                        public boolean AFs() {
                            C00J c00j = this.A01;
                            int i = ((C000500h) c00j.get()).A00.getInt("shops_privacy_notice", -1);
                            C00J c00j2 = this.A00;
                            C01B c01b = ((C2Lo) c00j2.get()).A00;
                            AnonymousClass039 anonymousClass039 = C01C.A3r;
                            if (i >= c01b.A07(anonymousClass039)) {
                                return true;
                            }
                            ((C000500h) c00j.get()).A00.getInt("shops_privacy_notice", -1);
                            ((C2Lo) c00j2.get()).A00.A07(anonymousClass039);
                            return false;
                        }

                        @Override // X.InterfaceC41261td
                        public void AS9(int i) {
                            C000200d.A0g((C000500h) this.A01.get(), "shops_privacy_notice", i);
                        }
                    };
                    C41161tT.A01(c02950Dn.A0L, obj);
                    c02950Dn.A0L = obj;
                }
            }
            obj2 = obj;
        }
        return (C91664Fu) obj2;
    }

    public static C90244Ag A05(C02950Dn c02950Dn) {
        Object obj;
        Object obj2 = c02950Dn.A0K;
        if (obj2 instanceof C41111tO) {
            synchronized (obj2) {
                obj = c02950Dn.A0K;
                if (obj instanceof C41111tO) {
                    InterfaceC007103c interfaceC007103c = c02950Dn.A0d;
                    if (interfaceC007103c == null) {
                        interfaceC007103c = new C03040Dx(c02950Dn, 6);
                        c02950Dn.A0d = interfaceC007103c;
                    }
                    C00J A00 = C41161tT.A00(interfaceC007103c);
                    InterfaceC007103c interfaceC007103c2 = c02950Dn.A0o;
                    if (interfaceC007103c2 == null) {
                        interfaceC007103c2 = new C03040Dx(c02950Dn, 7);
                        c02950Dn.A0o = interfaceC007103c2;
                    }
                    obj = new C90244Ag(A00, C41161tT.A00(interfaceC007103c2));
                    C41161tT.A01(c02950Dn.A0K, obj);
                    c02950Dn.A0K = obj;
                }
            }
            obj2 = obj;
        }
        return (C90244Ag) obj2;
    }

    public static C91704Fy A06(C02950Dn c02950Dn) {
        Object obj;
        Object obj2 = c02950Dn.A04;
        if (obj2 instanceof C41111tO) {
            synchronized (obj2) {
                obj = c02950Dn.A04;
                if (obj instanceof C41111tO) {
                    InterfaceC007103c interfaceC007103c = c02950Dn.A0u;
                    if (interfaceC007103c == null) {
                        interfaceC007103c = new C03040Dx(c02950Dn, 23);
                        c02950Dn.A0u = interfaceC007103c;
                    }
                    C00J A00 = C41161tT.A00(interfaceC007103c);
                    InterfaceC007103c interfaceC007103c2 = c02950Dn.A15;
                    if (interfaceC007103c2 == null) {
                        interfaceC007103c2 = new C03040Dx(c02950Dn, 20);
                        c02950Dn.A15 = interfaceC007103c2;
                    }
                    obj = new C46T(A00, C41161tT.A00(interfaceC007103c2), C41161tT.A00(c02950Dn.A2Y())) { // from class: X.4Fy
                    };
                    C41161tT.A01(c02950Dn.A04, obj);
                    c02950Dn.A04 = obj;
                }
            }
            obj2 = obj;
        }
        return (C91704Fy) obj2;
    }

    public static C4G1 A07(C02950Dn c02950Dn) {
        Object obj;
        Object obj2 = c02950Dn.A0M;
        if (obj2 instanceof C41111tO) {
            synchronized (obj2) {
                obj = c02950Dn.A0M;
                if (obj instanceof C41111tO) {
                    obj = new InterfaceC41271te(C41161tT.A00(c02950Dn.A2X())) { // from class: X.4G1
                        public final C00J A00;

                        {
                            this.A00 = r1;
                        }

                        @Override // X.InterfaceC41271te
                        public C0BA A6x(String str) {
                            Bundle A02 = C000200d.A02("shopUrl", str);
                            ShopsProductPreviewFragment shopsProductPreviewFragment = new ShopsProductPreviewFragment();
                            shopsProductPreviewFragment.A0P(A02);
                            return shopsProductPreviewFragment;
                        }

                        @Override // X.InterfaceC41271te
                        public void AUq(AbstractC02800Cx abstractC02800Cx, String str) {
                            PrivacyNoticeFragment privacyNoticeFragment = new PrivacyNoticeFragment();
                            Bundle bundle = new Bundle();
                            bundle.putString("screen_name", "com.bloks.www.minishops.whatsapp.privacy_notice");
                            privacyNoticeFragment.A0P(bundle);
                            PrivacyNoticeDialogFragment privacyNoticeDialogFragment = new PrivacyNoticeDialogFragment();
                            Bundle bundle2 = new Bundle();
                            StringBuilder A0P = C000200d.A0P("bk_dialog_fragment");
                            A0P.append(privacyNoticeFragment.hashCode());
                            String obj3 = A0P.toString();
                            bundle2.putString("bk_dialog_fragment", obj3);
                            bundle2.putString("fragment_tag", "TOSFragment");
                            ((C46M) this.A00.get()).A02("bk_dialog_fragment", obj3, privacyNoticeFragment);
                            privacyNoticeDialogFragment.A0P(bundle2);
                            privacyNoticeDialogFragment.A14(abstractC02800Cx, str);
                        }
                    };
                    C41161tT.A01(c02950Dn.A0M, obj);
                    c02950Dn.A0M = obj;
                }
            }
            obj2 = obj;
        }
        return (C4G1) obj2;
    }

    public static C4G4 A08(C02950Dn c02950Dn) {
        Object obj;
        Object obj2 = c02950Dn.A0T;
        if (obj2 instanceof C41111tO) {
            synchronized (obj2) {
                obj = c02950Dn.A0T;
                if (obj instanceof C41111tO) {
                    InterfaceC007103c interfaceC007103c = c02950Dn.A0Z;
                    if (interfaceC007103c == null) {
                        interfaceC007103c = new C03040Dx(c02950Dn, 25);
                        c02950Dn.A0Z = interfaceC007103c;
                    }
                    obj = new InterfaceC41281tf(interfaceC007103c) { // from class: X.4G4
                        public final InterfaceC007103c A00;

                        {
                            this.A00 = interfaceC007103c;
                        }

                        @Override // X.InterfaceC41281tf
                        public AbstractC75073eJ ADy(ActivityC02290Ap activityC02290Ap, Intent intent) {
                            AbstractC75073eJ abstractC75073eJ = (AbstractC75073eJ) this.A00.get();
                            if (abstractC75073eJ.A00 == null) {
                                abstractC75073eJ.A00 = intent;
                                abstractC75073eJ.A01 = activityC02290Ap;
                            }
                            return abstractC75073eJ;
                        }
                    };
                    C41161tT.A01(c02950Dn.A0T, obj);
                    c02950Dn.A0T = obj;
                }
            }
            obj2 = obj;
        }
        return (C4G4) obj2;
    }

    public static C90304Am A09(C02950Dn c02950Dn) {
        Object obj;
        Object obj2 = c02950Dn.A01;
        if (obj2 instanceof C41111tO) {
            synchronized (obj2) {
                obj = c02950Dn.A01;
                if (obj instanceof C41111tO) {
                    InterfaceC007103c interfaceC007103c = c02950Dn.A0V;
                    if (interfaceC007103c == null) {
                        interfaceC007103c = new C03040Dx(c02950Dn, 39);
                        c02950Dn.A0V = interfaceC007103c;
                    }
                    obj = new C90304Am(interfaceC007103c);
                    C41161tT.A01(c02950Dn.A01, obj);
                    c02950Dn.A01 = obj;
                }
            }
            obj2 = obj;
        }
        return (C90304Am) obj2;
    }

    public static C90364As A0A(C02950Dn c02950Dn) {
        InterfaceC007103c interfaceC007103c = c02950Dn.A0a;
        if (interfaceC007103c == null) {
            interfaceC007103c = new C03040Dx(c02950Dn, 22);
            c02950Dn.A0a = interfaceC007103c;
        }
        C41161tT.A00(interfaceC007103c);
        InterfaceC007103c interfaceC007103c2 = c02950Dn.A0g;
        if (interfaceC007103c2 == null) {
            interfaceC007103c2 = new C03040Dx(c02950Dn, 35);
            c02950Dn.A0g = interfaceC007103c2;
        }
        C00J A00 = C41161tT.A00(interfaceC007103c2);
        C00J A002 = C41161tT.A00(c02950Dn.A2X());
        InterfaceC007103c interfaceC007103c3 = c02950Dn.A0t;
        if (interfaceC007103c3 == null) {
            interfaceC007103c3 = new C03040Dx(c02950Dn, 36);
            c02950Dn.A0t = interfaceC007103c3;
        }
        return new C90364As(A00, A002, C41161tT.A00(interfaceC007103c3));
    }

    public static final Set A0B() {
        ArrayList arrayList = new ArrayList(2);
        Set<Object> singleton = Collections.singleton(new C46F() { // from class: X.4GA
        });
        C02180Ae.A1B(singleton);
        for (Object obj : singleton) {
            if (obj == null) {
                throw new NullPointerException("Set contributions cannot be null");
            }
        }
        arrayList.addAll(singleton);
        Set<Object> singleton2 = Collections.singleton(new C46F() { // from class: X.46p
        });
        C02180Ae.A1B(singleton2);
        for (Object obj2 : singleton2) {
            if (obj2 == null) {
                throw new NullPointerException("Set contributions cannot be null");
            }
        }
        arrayList.addAll(singleton2);
        if (arrayList.isEmpty()) {
            return Collections.emptySet();
        }
        if (arrayList.size() == 1) {
            return Collections.singleton(arrayList.get(0));
        }
        return Collections.unmodifiableSet(new HashSet(arrayList));
    }

    public static InterfaceC007103c A0C(C02950Dn c02950Dn) {
        InterfaceC007103c interfaceC007103c = c02950Dn.A0q;
        if (interfaceC007103c == null) {
            C03040Dx c03040Dx = new C03040Dx(c02950Dn, 40);
            c02950Dn.A0q = c03040Dx;
            return c03040Dx;
        }
        return interfaceC007103c;
    }

    public static InterfaceC007103c A0D(C02950Dn c02950Dn) {
        InterfaceC007103c interfaceC007103c = c02950Dn.A0Y;
        if (interfaceC007103c == null) {
            C03040Dx c03040Dx = new C03040Dx(c02950Dn, 34);
            c02950Dn.A0Y = c03040Dx;
            return c03040Dx;
        }
        return interfaceC007103c;
    }

    public static InterfaceC007103c A0E(C02950Dn c02950Dn) {
        InterfaceC007103c interfaceC007103c = c02950Dn.A0r;
        if (interfaceC007103c == null) {
            C03040Dx c03040Dx = new C03040Dx(c02950Dn, 28);
            c02950Dn.A0r = c03040Dx;
            return c03040Dx;
        }
        return interfaceC007103c;
    }

    @Override // X.C0C5
    public AbstractC000600i A0F() {
        AbstractC000600i A00 = AbstractC000600i.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C03050Dy A0G() {
        return new C03050Dy(this);
    }

    @Override // X.C0C5
    public C03060Dz A0H() {
        return new C03060Dz(this);
    }

    @Override // X.C0C5
    public C0E0 A0I() {
        return new C0E0(this);
    }

    @Override // X.C0C5
    public C012005w A0J() {
        C012005w A00 = C012005w.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C018508q A0K() {
        C018508q A00 = C018508q.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C0E2 A0L() {
        return C0E1.A00();
    }

    @Override // X.C0C5
    public C02L A0M() {
        return C41131tQ.A00();
    }

    @Override // X.C0C5
    public C0E3 A0N() {
        C0E3 A06 = C0E3.A06();
        C02180Ae.A1B(A06);
        return A06;
    }

    @Override // X.C0C5
    public C0E4 A0O() {
        C0E4 A00 = C0E4.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C0E5 A0P() {
        C0E5 A00 = C0E5.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C01B A0Q() {
        C01B A00 = C01B.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C018608r A0R() {
        C018608r A02 = C018608r.A02();
        C02180Ae.A1B(A02);
        return A02;
    }

    @Override // X.C0C5
    public C0E6 A0S() {
        C0E6 A00 = C0E6.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C06K A0T() {
        C06K A00 = C06K.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C41291tg A0U() {
        C41291tg A00 = C41291tg.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C41301th A0V() {
        C41301th c41301th = C41301th.A00;
        C02180Ae.A1B(c41301th);
        return c41301th;
    }

    @Override // X.C0C5
    public C05W A0W() {
        return C41141tR.A00();
    }

    @Override // X.C0C5
    public AnonymousClass075 A0X() {
        AnonymousClass075 A00 = AnonymousClass075.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C018708s A0Y() {
        C018708s A00 = C018708s.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C41321tj A0Z() {
        return C41311ti.A00();
    }

    @Override // X.C0C5
    public C41331tk A0a() {
        C41331tk A00 = C41331tk.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public AnonymousClass034 A0b() {
        AnonymousClass034 A00 = AnonymousClass034.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C0E7 A0c() {
        return C41341tl.A00();
    }

    @Override // X.C0C5
    public AnonymousClass012 A0d() {
        return C41131tQ.A01();
    }

    @Override // X.C0C5
    public C001200o A0e() {
        C001200o c001200o = C001200o.A01;
        C02180Ae.A1B(c001200o);
        return c001200o;
    }

    @Override // X.C0C5
    public C02F A0f() {
        C02F A00 = C02F.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C000500h A0g() {
        return C41131tQ.A02();
    }

    @Override // X.C0C5
    public C002301c A0h() {
        return C41131tQ.A03();
    }

    @Override // X.C0C5
    public C41361tn A0i() {
        return C41351tm.A00();
    }

    @Override // X.C0C5
    public C01J A0j() {
        C01J A00 = C01J.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C01R A0k() {
        C01R c01r = C01R.A02;
        C02180Ae.A1B(c01r);
        return c01r;
    }

    @Override // X.C0C5
    public C05Q A0l() {
        C05Q A00 = C05Q.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C0CA A0m() {
        C0CA A00 = C0CA.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C0C9 A0n() {
        C0C9 A00 = C0C9.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C0D5 A0o() {
        C0D5 A00 = C0D5.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C0C8 A0p() {
        C0C8 A00 = C0C8.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C40411sD A0q() {
        return C41371to.A01();
    }

    @Override // X.C0C5
    public C0E8 A0r() {
        C0E8 A00 = C0E8.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C0CC A0s() {
        C0CC A01 = C0CC.A01();
        C02180Ae.A1B(A01);
        return A01;
    }

    @Override // X.C0C5
    public C05E A0t() {
        C05E A00 = C05E.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C41391tq A0u() {
        return C41381tp.A00();
    }

    @Override // X.C0C5
    public C0E9 A0v() {
        C0E9 A00 = C0E9.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C0EA A0w() {
        C0EA A00 = C0EA.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C0EB A0x() {
        C0EB A00 = C0EB.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C06S A0y() {
        C06S A00 = C06S.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C41401tr A0z() {
        C41401tr A01 = C41401tr.A01();
        C02180Ae.A1B(A01);
        return A01;
    }

    @Override // X.C0C5
    public C0EC A10() {
        C0EC A00 = C0EC.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C40421sE A11() {
        return C41411ts.A00();
    }

    @Override // X.C0C5
    public C41421tt A12() {
        C41421tt A00 = C41421tt.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C0ED A13() {
        C0ED A01 = C0ED.A01();
        C02180Ae.A1B(A01);
        return A01;
    }

    @Override // X.C0C5
    public C01H A14() {
        C01H A00 = C01H.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public AnonymousClass011 A15() {
        return C41121tP.A01();
    }

    @Override // X.C0C5
    public C41431tu A16() {
        C41431tu A00 = C41431tu.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C41451tw A17() {
        return C41441tv.A00();
    }

    @Override // X.C0C5
    public C00C A18() {
        C00C A00 = C00C.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C40351s4 A19() {
        if (C40351s4.A02 == null) {
            synchronized (C40351s4.class) {
                if (C40351s4.A02 == null) {
                    C40351s4.A02 = new C40351s4(C02L.A00(), C05W.A00(), C018708s.A00(), C0C8.A00(), C40371s6.A00(), C0C7.A00());
                }
            }
        }
        C40351s4 c40351s4 = C40351s4.A02;
        C02180Ae.A1B(c40351s4);
        return c40351s4;
    }

    @Override // X.C0C5
    public C00E A1A() {
        C00E A00 = C00E.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C00G A1B() {
        C00G A00 = C00G.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C41461tx A1C() {
        return C41311ti.A01();
    }

    @Override // X.C0C5
    public C41471ty A1D() {
        return C41371to.A04();
    }

    @Override // X.C0C5
    public C41491u0 A1E() {
        return C41371to.A05();
    }

    @Override // X.C0C5
    public C41501u1 A1F() {
        C41501u1 A00 = C41501u1.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C010605h A1G() {
        C010605h c010605h = C010605h.A03;
        C02180Ae.A1B(c010605h);
        return c010605h;
    }

    @Override // X.C0C5
    public C05Y A1H() {
        C05Y A01 = C05Y.A01();
        C02180Ae.A1B(A01);
        return A01;
    }

    @Override // X.C0C5
    public C40291rx A1I() {
        return C41371to.A08();
    }

    @Override // X.C0C5
    public C0EE A1J() {
        C0EE A00 = C0EE.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C0EF A1K() {
        C0EF A00 = C0EF.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C41511u2 A1L() {
        return C41311ti.A02();
    }

    @Override // X.C0C5
    public C0EG A1M() {
        C0EG A00 = C0EG.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C41521u3 A1N() {
        return C41311ti.A03();
    }

    @Override // X.C0C5
    public C0EJ A1O() {
        C0EJ A00 = C0EJ.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C0DV A1P() {
        C0DV A00 = C0DV.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C01V A1Q() {
        C01V A00 = C01V.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C05U A1R() {
        C05U A01 = C05U.A01();
        C02180Ae.A1B(A01);
        return A01;
    }

    @Override // X.C0C5
    public C1u5 A1S() {
        if (C1u5.A1V == null) {
            synchronized (C1u5.class) {
                if (C1u5.A1V == null) {
                    C001200o c001200o = C001200o.A01;
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C003701t A002 = C003701t.A00();
                    C018508q A003 = C018508q.A00();
                    AbstractC000600i A004 = AbstractC000600i.A00();
                    C02L A005 = C02L.A00();
                    InterfaceC002901k A006 = C002801j.A00();
                    C05M A007 = C05M.A00();
                    C0EL A008 = C0EL.A00();
                    AnonymousClass011 A009 = AnonymousClass011.A00();
                    C41181tV A0010 = C41181tV.A00();
                    C0EG A0011 = C0EG.A00();
                    C01B A0012 = C01B.A00();
                    C0EB A0013 = C0EB.A00();
                    C41541u6 A0014 = C41541u6.A00();
                    C0EN A0015 = C0EN.A00();
                    C0E6 A0016 = C0E6.A00();
                    C05W A0017 = C05W.A00();
                    C0ED A01 = C0ED.A01();
                    C0EO A0018 = C0EO.A00();
                    C0E3 A06 = C0E3.A06();
                    C01R c01r = C01R.A02;
                    C0EP A0019 = C0EP.A00();
                    C41521u3 A0020 = C41521u3.A00();
                    C002301c A0021 = C002301c.A00();
                    C05U A012 = C05U.A01();
                    C0DV A0022 = C0DV.A00();
                    C40261rr A0023 = C40261rr.A00();
                    C0C9 A0024 = C0C9.A00();
                    C41561u9 A0025 = C41561u9.A00();
                    C0ER A0026 = C0ER.A00();
                    C0ES A0027 = C0ES.A00();
                    C009905a c009905a = C009905a.A02;
                    C00A c00a = C00A.A00;
                    C0E4 A0028 = C0E4.A00();
                    C0EF A0029 = C0EF.A00();
                    C41571uA A0030 = C41571uA.A00();
                    C41581uB A0031 = C41581uB.A00();
                    C41591uC A0032 = C41591uC.A00();
                    C41601uD A0033 = C41601uD.A00();
                    C40411sD A0034 = C40411sD.A00();
                    C0EE A0035 = C0EE.A00();
                    C41421tt A0036 = C41421tt.A00();
                    C01J A0037 = C01J.A00();
                    C0EC A0038 = C0EC.A00();
                    C06T c06t = C06T.A02;
                    C0ET A0039 = C0ET.A00();
                    C0EU A0040 = C0EU.A00();
                    C0EV A0041 = C0EV.A00();
                    C0E9 A0042 = C0E9.A00();
                    C41611uE A0043 = C41611uE.A00();
                    C0EJ A0044 = C0EJ.A00();
                    C0E7 A0045 = C0E7.A00();
                    C41621uF A0046 = C41621uF.A00();
                    C41631uG A0047 = C41631uG.A00();
                    AnonymousClass075 A0048 = AnonymousClass075.A00();
                    C41641uH A0049 = C41641uH.A00();
                    C41451tw A0050 = C41451tw.A00();
                    C41651uI c41651uI = C41651uI.A00;
                    C41401tr A013 = C41401tr.A01();
                    C41661uJ A0051 = C41661uJ.A00();
                    C07A A014 = C07A.A01();
                    C41671uK A0052 = C41671uK.A00();
                    C0DW A0053 = C0DW.A00();
                    C41681uL A0054 = C41681uL.A00();
                    C41691uM A0055 = C41691uM.A00();
                    C41701uN A0056 = C41701uN.A00();
                    C0EW A0057 = C0EW.A00();
                    C06K A0058 = C06K.A00();
                    C41711uO A0059 = C41711uO.A00();
                    C41721uP A0060 = C41721uP.A00();
                    C013606n A03 = C013606n.A03();
                    C41501u1 A0061 = C41501u1.A00();
                    C41731uQ A0062 = C41731uQ.A00();
                    C41741uR A0063 = C41741uR.A00();
                    C41751uS c41751uS = C41751uS.A00;
                    C013306k A07 = C013306k.A07();
                    C41761uT A0064 = C41761uT.A00();
                    C41771uU A0065 = C41771uU.A00();
                    if (C41781uV.A02 == null) {
                        synchronized (C41781uV.class) {
                            if (C41781uV.A02 == null) {
                                C41781uV.A02 = new C41781uV(C40291rx.A00(), C41641uH.A00());
                            }
                        }
                    }
                    C1u5.A1V = new C1u5(c001200o, A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A01, A0018, A06, c01r, A0019, A0020, A0021, A012, A0022, A0023, A0024, A0025, A0026, A0027, c009905a, c00a, A0028, A0029, A0030, A0031, A0032, A0033, A0034, A0035, A0036, A0037, A0038, c06t, A0039, A0040, A0041, A0042, A0043, A0044, A0045, A0046, A0047, A0048, A0049, A0050, c41651uI, A013, A0051, A014, A0052, A0053, A0054, A0055, A0056, A0057, A0058, A0059, A0060, A03, A0061, A0062, A0063, c41751uS, A07, A0064, A0065, C41781uV.A02, C0C8.A00(), AbstractC41791uW.A00(), AbstractC41801uX.A00(), C0DK.A00(), C41811uY.A00(), C0EX.A00, C41821uZ.A00(), C41831ua.A00(), C41841ub.A00(), C0EY.A00());
                }
            }
        }
        C1u5 c1u5 = C1u5.A1V;
        C02180Ae.A1B(c1u5);
        return c1u5;
    }

    @Override // X.C0C5
    public C41851uc A1T() {
        C41851uc A00 = C41851uc.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public InterfaceC004201y A1U() {
        InterfaceC004201y A00 = C03U.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C05G A1V() {
        C05G A00 = C05G.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C41861ud A1W() {
        C41861ud A00 = C41861ud.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C41881uf A1X() {
        return C41871ue.A09();
    }

    @Override // X.C0C5
    public C41891ug A1Y() {
        C41891ug A00 = C41891ug.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C41901uh A1Z() {
        C41901uh A00 = C41901uh.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C0CB A1a() {
        C0CB A00 = C0CB.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public AbstractC40441sG A1b() {
        return C41311ti.A04();
    }

    @Override // X.C0C5
    public C0EZ A1c() {
        C0EZ A00 = C0EZ.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public AnonymousClass035 A1d() {
        AnonymousClass035 A00 = AnonymousClass035.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C40431sF A1e() {
        return C41311ti.A05();
    }

    @Override // X.C0C5
    public C40401sA A1f() {
        C40401sA A00 = C40401sA.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C03070Ea A1g() {
        C03070Ea A00 = C03070Ea.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C41911ui A1h() {
        return C41311ti.A06();
    }

    @Override // X.C0C5
    public C41921uj A1i() {
        C41921uj A00 = C41921uj.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C41941ul A1j() {
        return C41931uk.A01();
    }

    @Override // X.C0C5
    public C41951um A1k() {
        return C41931uk.A02();
    }

    @Override // X.C0C5
    public C41731uQ A1l() {
        C41731uQ A00 = C41731uQ.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C02C A1m() {
        C02C A00 = C02C.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0C5
    public C41961un A1n() {
        return C41371to.A0C();
    }

    @Override // X.C0C5
    public C40951t8 A1o() {
        return C41931uk.A03();
    }

    @Override // X.C0C5
    public InterfaceC41971uo A1p() {
        Object obj;
        Object obj2 = this.A05;
        if (obj2 instanceof C41111tO) {
            synchronized (obj2) {
                obj = this.A05;
                if (obj instanceof C41111tO) {
                    InterfaceC007103c interfaceC007103c = this.A1B;
                    if (interfaceC007103c == null) {
                        interfaceC007103c = new C03040Dx(this, 0);
                        this.A1B = interfaceC007103c;
                    }
                    C00J A00 = C41161tT.A00(interfaceC007103c);
                    InterfaceC007103c interfaceC007103c2 = this.A19;
                    if (interfaceC007103c2 == null) {
                        interfaceC007103c2 = new C03040Dx(this, 5);
                        this.A19 = interfaceC007103c2;
                    }
                    C00J A002 = C41161tT.A00(interfaceC007103c2);
                    InterfaceC007103c interfaceC007103c3 = this.A0h;
                    if (interfaceC007103c3 == null) {
                        interfaceC007103c3 = new C03040Dx(this, 8);
                        this.A0h = interfaceC007103c3;
                    }
                    C00J A003 = C41161tT.A00(interfaceC007103c3);
                    InterfaceC007103c interfaceC007103c4 = this.A0f;
                    if (interfaceC007103c4 == null) {
                        interfaceC007103c4 = new C03040Dx(this, 9);
                        this.A0f = interfaceC007103c4;
                    }
                    C00J A004 = C41161tT.A00(interfaceC007103c4);
                    InterfaceC007103c interfaceC007103c5 = this.A1A;
                    if (interfaceC007103c5 == null) {
                        interfaceC007103c5 = new C03040Dx(this, 10);
                        this.A1A = interfaceC007103c5;
                    }
                    obj = new C4GE(A00, A002, A003, A004, C41161tT.A00(interfaceC007103c5), C41161tT.A00(A2Z()));
                    C41161tT.A01(this.A05, obj);
                    this.A05 = obj;
                }
            }
            obj2 = obj;
        }
        return (C4GE) obj2;
    }

    @Override // X.C0C5
    public C41981up A1q() {
        return C41931uk.A05();
    }

    @Override // X.C0C5
    public C41991uq A1r() {
        return C41931uk.A06();
    }

    @Override // X.C0C5
    public C42011us A1s() {
        return C42001ur.A0A();
    }

    @Override // X.C0C5
    public C00J A1t() {
        InterfaceC007103c interfaceC007103c = this.A18;
        if (interfaceC007103c == null) {
            interfaceC007103c = new C03040Dx(this, 13);
            this.A18 = interfaceC007103c;
        }
        return C41161tT.A00(interfaceC007103c);
    }

    @Override // X.C0C5
    public void A1u(BootReceiver bootReceiver) {
        bootReceiver.A01 = C41371to.A09();
        bootReceiver.A00 = C41131tQ.A02();
        C03080Ec A00 = C03080Ec.A00();
        C02180Ae.A1B(A00);
        bootReceiver.A02 = A00;
        C05G A002 = C05G.A00();
        C02180Ae.A1B(A002);
        bootReceiver.A06 = A002;
        C03090Ed A003 = C03090Ed.A00();
        C02180Ae.A1B(A003);
        bootReceiver.A03 = A003;
        bootReceiver.A05 = C42001ur.A06();
        bootReceiver.A04 = C42001ur.A02();
    }

    @Override // X.C0C5
    public void A1v(C03100Ee c03100Ee) {
        C03120Eg A00 = C03120Eg.A00();
        C02180Ae.A1B(A00);
        c03100Ee.A01 = A00;
        C03130Eh A002 = C03130Eh.A00();
        C02180Ae.A1B(A002);
        c03100Ee.A00 = A002;
    }

    @Override // X.C0C5
    public void A1w(C03140Ei c03140Ei) {
        c03140Ei.A01 = C42041uv.A01();
        C03150Ej A00 = C03150Ej.A00();
        C02180Ae.A1B(A00);
        c03140Ei.A00 = A00;
    }

    @Override // X.C0C5
    public void A1x(TellAFriendReceiver tellAFriendReceiver) {
        tellAFriendReceiver.A01 = C41121tP.A01();
        C01B A00 = C01B.A00();
        C02180Ae.A1B(A00);
        tellAFriendReceiver.A00 = A00;
    }

    @Override // X.C0C5
    public void A1y(UpdatedOurAppReceiver updatedOurAppReceiver) {
        updatedOurAppReceiver.A00 = C41131tQ.A00();
        updatedOurAppReceiver.A01 = C41131tQ.A02();
    }

    @Override // X.C0C5
    public void A1z(AccountTransferReceiver accountTransferReceiver) {
        accountTransferReceiver.A00 = C41131tQ.A04();
    }

    @Override // X.C0C5
    public void A20(WidgetProvider widgetProvider) {
        C018508q A00 = C018508q.A00();
        C02180Ae.A1B(A00);
        widgetProvider.A00 = A00;
        C05M A002 = C05M.A00();
        C02180Ae.A1B(A002);
        widgetProvider.A05 = A002;
        C03160Eo A003 = C03160Eo.A00();
        C02180Ae.A1B(A003);
        widgetProvider.A02 = A003;
        C03170Ep A004 = C03170Ep.A00();
        C02180Ae.A1B(A004);
        widgetProvider.A03 = A004;
        widgetProvider.A04 = C41131tQ.A03();
        C03180Eq A005 = C03180Eq.A00();
        C02180Ae.A1B(A005);
        widgetProvider.A07 = A005;
        C0CA A006 = C0CA.A00();
        C02180Ae.A1B(A006);
        widgetProvider.A06 = A006;
    }

    @Override // X.C0C5
    public void A21(C42051uw c42051uw) {
        c42051uw.A00 = C42041uv.A01();
    }

    @Override // X.C0C5
    public void A22(CompanionDeviceVerificationReceiver companionDeviceVerificationReceiver) {
        companionDeviceVerificationReceiver.A01 = C41131tQ.A02();
        companionDeviceVerificationReceiver.A02 = C42061uy.A01();
        C42071uz A00 = C42071uz.A00();
        C02180Ae.A1B(A00);
        companionDeviceVerificationReceiver.A00 = A00;
    }

    @Override // X.C0C5
    public void A23(C42081v0 c42081v0) {
        c42081v0.A00 = C41131tQ.A02();
    }

    @Override // X.C0C5
    public void A24(FinalLiveLocationBroadcastReceiver finalLiveLocationBroadcastReceiver) {
        finalLiveLocationBroadcastReceiver.A00 = C41311ti.A01();
    }

    @Override // X.C0C5
    public void A25(MessageNotificationDismissedReceiver messageNotificationDismissedReceiver) {
        messageNotificationDismissedReceiver.A01 = C41371to.A09();
        messageNotificationDismissedReceiver.A00 = C41131tQ.A02();
    }

    @Override // X.C0C5
    public void A26(MissedCallNotificationDismissedReceiver missedCallNotificationDismissedReceiver) {
        C05E A00 = C05E.A00();
        C02180Ae.A1B(A00);
        missedCallNotificationDismissedReceiver.A00 = A00;
        C03080Ec A002 = C03080Ec.A00();
        C02180Ae.A1B(A002);
        missedCallNotificationDismissedReceiver.A01 = A002;
    }

    @Override // X.C0C5
    public void A27(C03190Es c03190Es) {
        C03090Ed A00 = C03090Ed.A00();
        C02180Ae.A1B(A00);
        c03190Es.A00 = A00;
    }

    @Override // X.C0C5
    public void A28(C42091v3 c42091v3) {
        c42091v3.A00 = C42001ur.A06();
    }

    @Override // X.C0C5
    public void A29(PhoneIdRequestReceiver phoneIdRequestReceiver) {
        C42101v5 A00 = C42101v5.A00();
        C02180Ae.A1B(A00);
        phoneIdRequestReceiver.A00 = A00;
    }

    @Override // X.C0C5
    public void A2A(WAFbnsPreloadReceiver wAFbnsPreloadReceiver) {
        wAFbnsPreloadReceiver.A01 = C42111v7.A08();
        C42131v9 A00 = C42131v9.A00();
        C02180Ae.A1B(A00);
        wAFbnsPreloadReceiver.A00 = A00;
    }

    @Override // X.C0C5
    public void A2B(PreRegNotificationLearnMoreReceiver preRegNotificationLearnMoreReceiver) {
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        preRegNotificationLearnMoreReceiver.A00 = A02;
        preRegNotificationLearnMoreReceiver.A03 = C42141vB.A07();
        preRegNotificationLearnMoreReceiver.A02 = C41131tQ.A02();
        C005102h A00 = C005102h.A00();
        C02180Ae.A1B(A00);
        preRegNotificationLearnMoreReceiver.A01 = A00;
    }

    @Override // X.C0C5
    public void A2C(RegRetryVerificationReceiver regRetryVerificationReceiver) {
        regRetryVerificationReceiver.A01 = C41131tQ.A03();
        C005102h A00 = C005102h.A00();
        C02180Ae.A1B(A00);
        regRetryVerificationReceiver.A00 = A00;
        C05G A002 = C05G.A00();
        C02180Ae.A1B(A002);
        regRetryVerificationReceiver.A02 = A002;
    }

    @Override // X.C0C5
    public void A2D(RegistrationCompletedReceiver registrationCompletedReceiver) {
        registrationCompletedReceiver.A00 = C41131tQ.A00();
        registrationCompletedReceiver.A01 = C41131tQ.A02();
    }

    @Override // X.C0C5
    public void A2E(MigrationProviderOrderedBroadcastReceiver migrationProviderOrderedBroadcastReceiver) {
        migrationProviderOrderedBroadcastReceiver.A00 = C41131tQ.A00();
        C01B A00 = C01B.A00();
        C02180Ae.A1B(A00);
        migrationProviderOrderedBroadcastReceiver.A01 = A00;
        migrationProviderOrderedBroadcastReceiver.A05 = C41371to.A0A();
        C03170Ep A002 = C03170Ep.A00();
        C02180Ae.A1B(A002);
        migrationProviderOrderedBroadcastReceiver.A02 = A002;
        migrationProviderOrderedBroadcastReceiver.A03 = C41131tQ.A02();
        migrationProviderOrderedBroadcastReceiver.A06 = C42111v7.A09();
        migrationProviderOrderedBroadcastReceiver.A04 = C42111v7.A02();
    }

    @Override // X.C0C5
    public void A2F(MigrationRequesterBroadcastReceiver migrationRequesterBroadcastReceiver) {
        migrationRequesterBroadcastReceiver.A00 = C41131tQ.A02();
        migrationRequesterBroadcastReceiver.A01 = C42141vB.A06();
    }

    @Override // X.C0C5
    public void A2G(C42191vK c42191vK) {
        c42191vK.A00 = C41131tQ.A02();
        c42191vK.A01 = C42141vB.A06();
    }

    @Override // X.C0C5
    public void A2H(WebSessionVerificationReceiver webSessionVerificationReceiver) {
        webSessionVerificationReceiver.A05 = C41931uk.A06();
        C01B A00 = C01B.A00();
        C02180Ae.A1B(A00);
        webSessionVerificationReceiver.A00 = A00;
        webSessionVerificationReceiver.A02 = C41131tQ.A02();
        webSessionVerificationReceiver.A03 = C41131tQ.A03();
        C0EE A002 = C0EE.A00();
        C02180Ae.A1B(A002);
        webSessionVerificationReceiver.A04 = A002;
        C005102h A003 = C005102h.A00();
        C02180Ae.A1B(A003);
        webSessionVerificationReceiver.A01 = A003;
    }

    public final C47P A2I() {
        Object obj;
        Object obj2 = this.A0P;
        if (obj2 instanceof C41111tO) {
            synchronized (obj2) {
                obj = this.A0P;
                if (obj instanceof C41111tO) {
                    InterfaceC007103c interfaceC007103c = this.A0X;
                    if (interfaceC007103c == null) {
                        interfaceC007103c = new C03040Dx(this, 14);
                        this.A0X = interfaceC007103c;
                    }
                    C00J A00 = C41161tT.A00(interfaceC007103c);
                    C018508q A002 = C018508q.A00();
                    C02180Ae.A1B(A002);
                    InterfaceC002901k A04 = C41131tQ.A04();
                    C03230Ew A003 = C03230Ew.A00();
                    C02180Ae.A1B(A003);
                    C02E A01 = C42041uv.A01();
                    C002301c A03 = C41131tQ.A03();
                    if (C46H.A01 == null) {
                        synchronized (C46H.class) {
                            if (C46H.A01 == null) {
                                C46H.A01 = new C46H(C012005w.A00());
                            }
                        }
                    }
                    C46H c46h = C46H.A01;
                    C02180Ae.A1B(c46h);
                    obj = new C03240Ex(A00, A002, A04, A003, A01, A03, c46h, C893546r.A00(), C91594Fn.A00()) { // from class: X.47P
                        public final C018508q A00;
                        public final C03230Ew A01;
                        public final C46Z A02;
                        public final C45S A03;
                        public final C46H A04;
                        public final C02E A05;
                        public final C002301c A06;
                        public final InterfaceC002901k A07;
                        public final C00J A08;

                        {
                            this.A00 = A002;
                            this.A07 = A04;
                            this.A08 = A00;
                            this.A01 = A003;
                            this.A05 = A01;
                            this.A06 = A03;
                            this.A04 = c46h;
                            this.A03 = r8;
                            this.A02 = r9;
                        }

                        @Override // X.C03240Ex, X.C0AJ
                        public InterfaceC016607s A00(C016107n c016107n, C016807u c016807u, AbstractC016307p abstractC016307p, int i, int i2) {
                            int i3 = c016807u.A01;
                            char c = 0;
                            if (i3 == 13323) {
                                int[] iArr = new int[2];
                                int mode = View.MeasureSpec.getMode(i);
                                int size = View.MeasureSpec.getSize(i);
                                int mode2 = View.MeasureSpec.getMode(i2);
                                int size2 = View.MeasureSpec.getSize(i2);
                                if ((mode == 0 && mode2 == 0) || (mode == 1073741824 && mode2 == 1073741824)) {
                                    iArr[0] = size;
                                    iArr[1] = size2;
                                } else {
                                    int i4 = size;
                                    if (size2 > 0) {
                                        i4 = (int) Math.ceil(size2 * 1.0f);
                                    }
                                    int ceil = size > 0 ? (int) Math.ceil(size / 1.0f) : size2;
                                    if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
                                        c = 0;
                                        if (ceil > size2) {
                                            iArr[0] = i4;
                                            iArr[1] = size2;
                                        } else if (i4 > size) {
                                            iArr[0] = size;
                                            iArr[1] = ceil;
                                        } else {
                                            iArr[0] = i4;
                                            iArr[1] = ceil;
                                        }
                                    } else {
                                        c = 0;
                                        if (mode == 1073741824) {
                                            iArr[0] = size;
                                            if (mode2 == 0 || ceil <= size2) {
                                                iArr[1] = ceil;
                                            } else {
                                                iArr[1] = size2;
                                            }
                                        } else if (mode2 == 1073741824) {
                                            iArr[1] = size2;
                                            if (mode == 0 || i4 <= size) {
                                                iArr[0] = 1073741824;
                                            } else {
                                                iArr[0] = size;
                                            }
                                        } else if (mode == Integer.MIN_VALUE) {
                                            iArr[0] = size;
                                            iArr[1] = ceil;
                                        } else if (mode2 == Integer.MIN_VALUE) {
                                            iArr[0] = i4;
                                            iArr[1] = size2;
                                        }
                                    }
                                }
                                return new C016507r(abstractC016307p, i, i2, iArr[c], iArr[1], iArr);
                            } else if (i3 == 13889) {
                                AnonymousClass087 anonymousClass087 = (AnonymousClass087) c016107n.A03;
                                if (anonymousClass087 != null) {
                                    View inflate = View.inflate(c016107n.A02, R.layout.bloks_video_view, null);
                                    C45Q.A0C(inflate, anonymousClass087, c016807u);
                                    inflate.measure(i, i2);
                                    int[] iArr2 = {inflate.getMeasuredWidth(), inflate.getMeasuredHeight()};
                                    VideoSurfaceView videoSurfaceView = (VideoSurfaceView) C0AT.A0D(inflate, R.id.video_view);
                                    videoSurfaceView.A00();
                                    videoSurfaceView.A03(false);
                                    return new C016507r(abstractC016307p, i, i2, iArr2[0], iArr2[1]);
                                }
                                throw new IllegalArgumentException("Cannot measure WaRcVideoViewComponentBinderUtils's render unit with a null BloksContext");
                            } else if (i3 == 13948) {
                                TextEmojiLabel textEmojiLabel = (TextEmojiLabel) abstractC016307p.A07(c016107n.A02);
                                AnonymousClass087 anonymousClass0872 = (AnonymousClass087) c016107n.A03;
                                if (anonymousClass0872 != null) {
                                    C45Q.A0K(textEmojiLabel, anonymousClass0872, c016807u);
                                    textEmojiLabel.measure(i, i2);
                                    int measuredHeight = textEmojiLabel.getMeasuredHeight();
                                    return new C016507r(abstractC016307p, i, i2, new int[]{textEmojiLabel.getMeasuredWidth(), measuredHeight}[0], measuredHeight);
                                }
                                throw new IllegalArgumentException("Cannot measure WaTextWithEntitiesComponent's render unit with a null BloksContext");
                            } else if (i3 != 14005) {
                                if (i3 != 15763) {
                                    switch (i3) {
                                        case 13496:
                                            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                                            int A012 = AnonymousClass088.A01(displayMetrics.heightPixels, i2);
                                            return new C016507r(abstractC016307p, i, i2, new int[]{AnonymousClass088.A01(displayMetrics.widthPixels, i), A012}[0], A012);
                                        case 13497:
                                            int[] iArr3 = new int[2];
                                            int mode3 = View.MeasureSpec.getMode(i);
                                            int size3 = View.MeasureSpec.getSize(i);
                                            if (mode3 != Integer.MIN_VALUE && mode3 != 1073741824) {
                                                size3 = 0;
                                            }
                                            iArr3[0] = size3;
                                            int mode4 = View.MeasureSpec.getMode(i2);
                                            int size4 = View.MeasureSpec.getSize(i2);
                                            if (mode4 != Integer.MIN_VALUE && mode4 != 1073741824) {
                                                size4 = 0;
                                            }
                                            iArr3[1] = size4;
                                            return new C016507r(abstractC016307p, i, i2, iArr3[0], size4, iArr3);
                                        case 13498:
                                            C002301c c002301c = this.A06;
                                            View view = (View) abstractC016307p.A07(c016107n.A02);
                                            long A004 = C45Q.A00(c016807u);
                                            int[] iArr4 = new int[2];
                                            if (A004 > 0) {
                                                String A0g = AnonymousClass029.A0g(c002301c, A004 / 1000);
                                                TextView textView = (TextView) view.findViewById(R.id.start_message);
                                                textView.setText((String) c016807u.A00.A00(AnonymousClass464.A02));
                                                TextView textView2 = (TextView) view.findViewById(R.id.timer_text);
                                                textView2.setText(A0g);
                                                view.measure(i, i2);
                                                iArr4[0] = view.getMeasuredWidth();
                                                iArr4[1] = view.getMeasuredHeight();
                                                textView.setText("");
                                                textView2.setText("");
                                            }
                                            return new C016507r(abstractC016307p, i, i2, iArr4[0], iArr4[1]);
                                        case 13499:
                                            View view2 = (View) abstractC016307p.A07(c016107n.A02);
                                            view2.measure(i, i2);
                                            int measuredHeight2 = view2.getMeasuredHeight();
                                            return new C016507r(abstractC016307p, i, i2, new int[]{view2.getMeasuredWidth(), measuredHeight2}[0], measuredHeight2);
                                        default:
                                            switch (i3) {
                                                case 13501:
                                                    View view3 = (View) abstractC016307p.A07(c016107n.A02);
                                                    AnonymousClass087 anonymousClass0873 = (AnonymousClass087) c016107n.A03;
                                                    if (anonymousClass0873 != null) {
                                                        String str = (String) c016807u.A00.A00(AnonymousClass466.A0I);
                                                        C890545m.A00(view3, anonymousClass0873, c016807u, str != null ? str : "");
                                                        view3.measure(i, i2);
                                                        return new C016507r(abstractC016307p, i, i2, view3.getMeasuredWidth(), view3.getMeasuredHeight());
                                                    }
                                                    throw new IllegalArgumentException("Cannot measure WaRcFormInputComponentBinderUtils's render unit with a null BloksContext");
                                                case 13502:
                                                    try {
                                                        int A032 = (int) C08i.A03((String) c016807u.A00.A00(AnonymousClass467.A07), 17280.0f);
                                                        try {
                                                            int A013 = AnonymousClass088.A01((int) C08i.A03((String) c016807u.A00.A00(AnonymousClass467.A03), 17280.0f), i2);
                                                            int[] iArr5 = {AnonymousClass088.A01(A032, i), A013};
                                                            return new C016507r(abstractC016307p, i, i2, iArr5[0], A013, iArr5);
                                                        } catch (C018208m e) {
                                                            throw new RuntimeException(e);
                                                        }
                                                    } catch (C018208m e2) {
                                                        throw new RuntimeException(e2);
                                                    }
                                                case 13503:
                                                    C45S c45s = this.A03;
                                                    View view4 = (View) abstractC016307p.A07(c016107n.A02);
                                                    AnonymousClass087 anonymousClass0874 = (AnonymousClass087) c016107n.A03;
                                                    if (anonymousClass0874 != null) {
                                                        C45Q.A0L(c45s, view4, anonymousClass0874, c016807u);
                                                        view4.measure(i, i2);
                                                        int measuredWidth = view4.getMeasuredWidth();
                                                        int measuredHeight3 = view4.getMeasuredHeight();
                                                        ((RecyclerView) view4.findViewById(R.id.recycler_view)).setAdapter(null);
                                                        return new C016507r(abstractC016307p, i, i2, measuredWidth, measuredHeight3);
                                                    }
                                                    throw new IllegalArgumentException("Cannot measure WaRcListViewBinderUtil's render unit with a null BloksContext");
                                                case 13504:
                                                    TextEmojiLabel textEmojiLabel2 = (TextEmojiLabel) abstractC016307p.A07(c016107n.A02);
                                                    AnonymousClass087 anonymousClass0875 = (AnonymousClass087) c016107n.A03;
                                                    if (anonymousClass0875 != null) {
                                                        C890645n.A01(textEmojiLabel2, c016807u, C890645n.A00(c016807u, anonymousClass0875));
                                                        textEmojiLabel2.measure(i, i2);
                                                        return new C016507r(abstractC016307p, i, i2, textEmojiLabel2.getMeasuredWidth(), textEmojiLabel2.getMeasuredHeight());
                                                    }
                                                    throw new IllegalArgumentException("Cannot measure WaRichTextComponent's render unit with a null BloksContext");
                                                default:
                                                    return super.A00(c016107n, c016807u, abstractC016307p, i, i2);
                                            }
                                    }
                                }
                                AnonymousClass087 anonymousClass0876 = (AnonymousClass087) c016107n.A03;
                                if (anonymousClass0876 != null && abstractC016307p != null) {
                                    View view5 = (View) abstractC016307p.A07(c016107n.A02);
                                    C45Q.A0B(view5, anonymousClass0876, c016807u);
                                    view5.measure(i, i2);
                                    int measuredHeight4 = view5.getMeasuredHeight();
                                    int[] iArr6 = {view5.getMeasuredWidth(), measuredHeight4};
                                    return new C016507r(abstractC016307p, i, i2, iArr6[0], measuredHeight4, iArr6);
                                }
                                throw new IllegalArgumentException("Cannot measure WaRcCheckBoxComponentBinderUtils's render unit with a null BloksContext or RenderUnit");
                            } else {
                                return new C016507r(abstractC016307p, i, i2, 1, 1);
                            }
                        }

                        @Override // X.C03240Ex, X.C0AJ
                        public AbstractC016307p A01(AnonymousClass087 anonymousClass087, final C016807u c016807u, C20430xW c20430xW) {
                            int i = c016807u.A01;
                            if (i == 13323) {
                                final C90344Aq c90344Aq = (C90344Aq) this.A08.get();
                                return new AbstractC30911bN(c016807u, anonymousClass087) { // from class: X.47M
                                    @Override // X.AbstractC30911bN, X.AbstractC016307p
                                    public Object A07(Context context) {
                                        return new WaImageView(context);
                                    }

                                    @Override // X.AbstractC30911bN
                                    public View A08(Context context) {
                                        return new WaImageView(context);
                                    }

                                    @Override // X.AbstractC30911bN
                                    public void A0A(View view, AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj3) {
                                        ImageView.ScaleType scaleType;
                                        ImageView imageView = (ImageView) view;
                                        C016807u c016807u3 = c016807u;
                                        String str = (String) c016807u3.A00.A00(C891445w.A03);
                                        if (anonymousClass0872.A03) {
                                            AnonymousClass084 anonymousClass084 = C891445w.A01;
                                            if (!TextUtils.isEmpty((String) c016807u3.A00.A00(anonymousClass084))) {
                                                str = (String) c016807u3.A00.A00(anonymousClass084);
                                            }
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            AnonymousClass088.A0o(anonymousClass0872, c016807u3);
                                            C90344Aq c90344Aq2 = c90344Aq;
                                            Uri parse = Uri.parse(str);
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(parse.getHost());
                                            sb.append(parse.getPath());
                                            c90344Aq2.A00(str, sb.toString(), imageView);
                                        }
                                        String str2 = (String) c016807u3.A00.A00(C891445w.A02);
                                        if (str2 == null) {
                                            scaleType = ImageView.ScaleType.CENTER_CROP;
                                        } else {
                                            try {
                                                scaleType = C08i.A08(str2);
                                            } catch (C018208m e) {
                                                scaleType = ImageView.ScaleType.CENTER_CROP;
                                                AnonymousClass088.A1j("WaRcCoreBloksImageComponentBinderUtils", "Failed to parse Image scaleType", e);
                                            }
                                        }
                                        imageView.setScaleType(scaleType);
                                        AnonymousClass081 anonymousClass081 = (AnonymousClass081) c016807u3.A00.A00(C891445w.A00);
                                        if (anonymousClass081 != null) {
                                            imageView.setColorFilter(AnonymousClass088.A06(anonymousClass081, anonymousClass0872));
                                        }
                                    }

                                    @Override // X.AbstractC30911bN
                                    public void A0B(View view, AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj3) {
                                        ImageView imageView = (ImageView) view;
                                        imageView.setImageDrawable(null);
                                        imageView.setTag(null);
                                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                        imageView.setColorFilter((ColorFilter) null);
                                        imageView.setScaleX(1.0f);
                                    }
                                };
                            } else if (i != 13889) {
                                if (i != 13948) {
                                    if (i != 14005) {
                                        if (i != 15763) {
                                            switch (i) {
                                                case 13496:
                                                    return new C47K(c016807u, anonymousClass087, c016807u);
                                                case 13497:
                                                    return new C47L(c016807u, anonymousClass087);
                                                case 13498:
                                                    return new C47D(c016807u, anonymousClass087, c016807u);
                                                case 13499:
                                                    return new C47E(c016807u, anonymousClass087, c016807u);
                                                default:
                                                    switch (i) {
                                                        case 13501:
                                                            return new AbstractC30911bN(c016807u, anonymousClass087) { // from class: X.47F
                                                                @Override // X.AbstractC30911bN, X.AbstractC016307p
                                                                public Object A07(Context context) {
                                                                    return View.inflate(context, R.layout.wa_bloks_text_input, null);
                                                                }

                                                                @Override // X.AbstractC30911bN
                                                                public View A08(Context context) {
                                                                    return View.inflate(context, R.layout.wa_bloks_text_input, null);
                                                                }

                                                                @Override // X.AbstractC30911bN
                                                                public void A09(View view, AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj3) {
                                                                    ((ViewGroup) view.findViewById(R.id.container)).removeAllViews();
                                                                    C018308n.A00(anonymousClass0872.A00).getWindow().clearFlags(8192);
                                                                }

                                                                @Override // X.AbstractC30911bN
                                                                public void A0A(View view, AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj3) {
                                                                    C889945g c889945g;
                                                                    int i2;
                                                                    long j;
                                                                    C892646i c892646i = (C892646i) AnonymousClass088.A0o(anonymousClass0872, c016807u2);
                                                                    if (c892646i != null) {
                                                                        Activity A004 = C018308n.A00(anonymousClass0872.A00);
                                                                        if (c016807u2.A8Z(AnonymousClass466.A05, false)) {
                                                                            A004.getWindow().setFlags(8192, 8192);
                                                                        }
                                                                        Pair A005 = C890545m.A00(view, anonymousClass0872, c016807u2, c892646i.A05);
                                                                        View view2 = (View) A005.first;
                                                                        TextInputEditText textInputEditText = (TextInputEditText) A005.second;
                                                                        c892646i.A04 = textInputEditText;
                                                                        boolean z = !"true".equals(c016807u2.A00.A00(AnonymousClass466.A0G));
                                                                        textInputEditText.setEnabled(z);
                                                                        textInputEditText.setFocusableInTouchMode(z);
                                                                        textInputEditText.setFocusable(z);
                                                                        textInputEditText.setCursorVisible(z);
                                                                        TextWatcher textWatcher = c892646i.A03;
                                                                        if (textWatcher == null) {
                                                                            Number number = (Number) c016807u2.A00.A00(AnonymousClass466.A0J);
                                                                            if (number != null) {
                                                                                j = number.longValue();
                                                                            } else {
                                                                                j = 0;
                                                                            }
                                                                            textWatcher = new C890445l(c016807u2, anonymousClass0872, c892646i, j);
                                                                            c892646i.A03 = textWatcher;
                                                                        }
                                                                        textInputEditText.addTextChangedListener(textWatcher);
                                                                        ArrayList arrayList = new ArrayList();
                                                                        arrayList.add(new InputFilter() { // from class: X.1Kw
                                                                            @Override // android.text.InputFilter
                                                                            public CharSequence filter(CharSequence charSequence, int i3, int i4, Spanned spanned, int i5, int i6) {
                                                                                while (i3 < i4) {
                                                                                    int codePointAt = Character.codePointAt(charSequence, i3);
                                                                                    int type = Character.getType(codePointAt);
                                                                                    if (codePointAt >= 128512 && codePointAt <= 128591) {
                                                                                        return "";
                                                                                    }
                                                                                    if (codePointAt >= 127744 && codePointAt <= 128511) {
                                                                                        return "";
                                                                                    }
                                                                                    if (codePointAt >= 128640 && codePointAt <= 128767) {
                                                                                        return "";
                                                                                    }
                                                                                    if (codePointAt >= 9984 && codePointAt <= 10175) {
                                                                                        return "";
                                                                                    }
                                                                                    if (codePointAt >= 65024 && codePointAt <= 65039) {
                                                                                        return "";
                                                                                    }
                                                                                    if (codePointAt >= 9728 && codePointAt <= 9983) {
                                                                                        return "";
                                                                                    }
                                                                                    if (codePointAt >= 129280 && codePointAt <= 129535) {
                                                                                        return "";
                                                                                    }
                                                                                    if ((codePointAt >= 8400 && codePointAt <= 8447) || type == 19 || type == 28) {
                                                                                        return "";
                                                                                    }
                                                                                    i3 += Character.charCount(codePointAt);
                                                                                }
                                                                                return null;
                                                                            }
                                                                        });
                                                                        Object A006 = c016807u2.A00.A00(AnonymousClass466.A00);
                                                                        if (A006 != null) {
                                                                            if ("lowercase".equals(A006)) {
                                                                                final C002301c c002301c = c892646i.A06;
                                                                                arrayList.add(new InputFilter.AllCaps() { // from class: X.45k
                                                                                    @Override // android.text.InputFilter.AllCaps, android.text.InputFilter
                                                                                    public CharSequence filter(CharSequence charSequence, int i3, int i4, Spanned spanned, int i5, int i6) {
                                                                                        return String.valueOf(charSequence).toLowerCase(c002301c.A0I());
                                                                                    }
                                                                                });
                                                                            } else if ("uppercase".equals(A006)) {
                                                                                arrayList.add(new InputFilter.AllCaps());
                                                                            }
                                                                        }
                                                                        int A042 = c016807u2.A04(AnonymousClass466.A0B, -1);
                                                                        if (A042 >= 0) {
                                                                            arrayList.add(new InputFilter.LengthFilter(A042));
                                                                        }
                                                                        textInputEditText.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
                                                                        String str = (String) c016807u2.A00.A00(AnonymousClass466.A0A);
                                                                        String str2 = (String) c016807u2.A00.A00(AnonymousClass466.A0C);
                                                                        String str3 = (String) c016807u2.A00.A00(AnonymousClass466.A0L);
                                                                        if (str3 != null) {
                                                                            try {
                                                                                Integer valueOf = Integer.valueOf(C08i.A06(str3));
                                                                                if (valueOf != null && (str2 != null || str != null)) {
                                                                                    if ((valueOf.intValue() & 2) == 2) {
                                                                                        if (str == null) {
                                                                                            str = str2;
                                                                                        }
                                                                                        c889945g = new C889945g(str, textInputEditText) { // from class: X.46e
                                                                                        };
                                                                                        c892646i.A02 = c889945g;
                                                                                    } else {
                                                                                        c889945g = new C889945g(str, textInputEditText);
                                                                                        c892646i.A02 = c889945g;
                                                                                    }
                                                                                    textInputEditText.addTextChangedListener(c889945g);
                                                                                }
                                                                            } catch (C018208m e) {
                                                                                AnonymousClass088.A1j("WaRcFormInputComponentBinderUtils", "Error parsing text input type", e);
                                                                            }
                                                                        }
                                                                        TextWatcher textWatcher2 = c892646i.A02;
                                                                        if (textWatcher2 != null) {
                                                                            textWatcher2.afterTextChanged(textInputEditText.getEditableText());
                                                                        }
                                                                        int i3 = c892646i.A01;
                                                                        if (i3 >= 0 && (i2 = c892646i.A00) >= i3 && i2 <= c892646i.A05.length()) {
                                                                            textInputEditText.setSelection(i3, i2);
                                                                        } else {
                                                                            String str4 = c892646i.A05;
                                                                            if (str4 != null) {
                                                                                textInputEditText.setSelection(str4.length());
                                                                            }
                                                                        }
                                                                        C09P AA3 = c016807u2.AA3(AnonymousClass466.A0D);
                                                                        if (AA3 != null) {
                                                                            View$OnClickListenerC56662nn view$OnClickListenerC56662nn = new View$OnClickListenerC56662nn(c016807u2, AA3, anonymousClass0872);
                                                                            view2.setOnClickListener(view$OnClickListenerC56662nn);
                                                                            View findViewById = view2.findViewById(R.id.text_view);
                                                                            findViewById.setOnClickListener(view$OnClickListenerC56662nn);
                                                                            findViewById.setFocusable(false);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    throw null;
                                                                }

                                                                @Override // X.AbstractC30911bN
                                                                public void A0B(View view, AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj3) {
                                                                    C892646i c892646i = (C892646i) AnonymousClass088.A0o(anonymousClass0872, c016807u2);
                                                                    c892646i.A04 = null;
                                                                    if (((ViewGroup) view.findViewById(R.id.container)).getChildCount() == 0) {
                                                                        return;
                                                                    }
                                                                    TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.default_text_input_layout);
                                                                    EditText editText = (EditText) textInputLayout.findViewById(R.id.text_view);
                                                                    c892646i.A00 = editText.getSelectionEnd();
                                                                    c892646i.A01 = editText.getSelectionStart();
                                                                    c892646i.A05 = editText.getText().toString();
                                                                    editText.removeTextChangedListener(c892646i.A03);
                                                                    editText.setText("");
                                                                    TextWatcher textWatcher = c892646i.A02;
                                                                    if (textWatcher != null) {
                                                                        editText.removeTextChangedListener(textWatcher);
                                                                    }
                                                                    editText.setFilters(C890545m.A00);
                                                                    editText.setTypeface(Typeface.DEFAULT);
                                                                    editText.setEnabled(true);
                                                                    editText.setFocusableInTouchMode(true);
                                                                    editText.setFocusable(true);
                                                                    editText.setCursorVisible(true);
                                                                    textInputLayout.setPasswordVisibilityToggleEnabled(true);
                                                                    textInputLayout.setError(null);
                                                                    textInputLayout.setErrorEnabled(false);
                                                                    textInputLayout.setHint("");
                                                                }
                                                            };
                                                        case 13502:
                                                            return new AbstractC30911bN(c016807u, anonymousClass087) { // from class: X.47N
                                                                @Override // X.AbstractC30911bN, X.AbstractC016307p
                                                                public Object A07(Context context) {
                                                                    return new WaImageView(context);
                                                                }

                                                                @Override // X.AbstractC30911bN
                                                                public View A08(Context context) {
                                                                    return new WaImageView(context);
                                                                }

                                                                @Override // X.AbstractC30911bN
                                                                public void A0A(View view, final AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj3) {
                                                                    ImageView.ScaleType A08;
                                                                    final ImageView imageView = (ImageView) view;
                                                                    C016807u c016807u3 = c016807u;
                                                                    String str = (String) c016807u3.A00.A00(AnonymousClass467.A05);
                                                                    if (str == null) {
                                                                        A08 = ImageView.ScaleType.CENTER_CROP;
                                                                    } else {
                                                                        try {
                                                                            A08 = C08i.A08(str);
                                                                        } catch (C018208m e) {
                                                                            throw new RuntimeException(e);
                                                                        }
                                                                    }
                                                                    imageView.setScaleType(A08);
                                                                    final AnonymousClass081 anonymousClass081 = (AnonymousClass081) c016807u3.A00.A00(AnonymousClass467.A06);
                                                                    if (anonymousClass081 != null) {
                                                                        imageView.setColorFilter(AnonymousClass088.A06(anonymousClass081, anonymousClass0872));
                                                                    }
                                                                    C891145s c891145s = (C891145s) AnonymousClass088.A0o(anonymousClass0872, c016807u3);
                                                                    AnonymousClass084 anonymousClass084 = AnonymousClass467.A02;
                                                                    if (!TextUtils.isEmpty((String) c016807u3.A00.A00(anonymousClass084))) {
                                                                        String str2 = (String) c016807u3.A00.A00(anonymousClass084);
                                                                        final C46Z c46z = c891145s.A00;
                                                                        final String str3 = (String) c016807u3.A00.A00(AnonymousClass467.A04);
                                                                        final String str4 = (String) c016807u3.A00.A00(AnonymousClass467.A00);
                                                                        C45S c45s = c891145s.A01;
                                                                        if (!TextUtils.isEmpty(str3)) {
                                                                            C45Q.A0E(anonymousClass0872, imageView, str3, c46z, str4, anonymousClass081);
                                                                        }
                                                                        AnonymousClass241 A004 = c45s.A00();
                                                                        final WeakReference weakReference = new WeakReference(imageView);
                                                                        final WeakReference weakReference2 = new WeakReference(anonymousClass0872);
                                                                        A004.A03(str2, imageView, null, null, new C3ZK() { // from class: X.46m
                                                                            @Override // X.C3ZK
                                                                            public void ALN() {
                                                                                String str5 = str3;
                                                                                if (TextUtils.isEmpty(str5)) {
                                                                                    return;
                                                                                }
                                                                                C45Q.A0E(anonymousClass0872, imageView, str5, c46z, str4, anonymousClass081);
                                                                            }

                                                                            @Override // X.C3ZK
                                                                            public void APb() {
                                                                                AnonymousClass081 anonymousClass0812;
                                                                                ImageView imageView2 = (ImageView) weakReference.get();
                                                                                AnonymousClass087 anonymousClass0873 = (AnonymousClass087) weakReference2.get();
                                                                                if (imageView2 == null || anonymousClass0873 == null || (anonymousClass0812 = anonymousClass081) == null) {
                                                                                    return;
                                                                                }
                                                                                imageView2.setColorFilter(AnonymousClass088.A06(anonymousClass0812, anonymousClass0873));
                                                                            }
                                                                        });
                                                                        return;
                                                                    }
                                                                    AnonymousClass084 anonymousClass0842 = AnonymousClass467.A04;
                                                                    if (!TextUtils.isEmpty((String) c016807u3.A00.A00(anonymousClass0842))) {
                                                                        C45Q.A0E(anonymousClass0872, imageView, (String) c016807u3.A00.A00(anonymousClass0842), c891145s.A00, (String) c016807u3.A00.A00(AnonymousClass467.A00), anonymousClass081);
                                                                        return;
                                                                    }
                                                                    AnonymousClass084 anonymousClass0843 = AnonymousClass467.A01;
                                                                    if (TextUtils.isEmpty((String) c016807u3.A00.A00(anonymousClass0843))) {
                                                                        return;
                                                                    }
                                                                    File A005 = c891145s.A02.A00((String) c016807u3.A00.A00(anonymousClass0843));
                                                                    if (A005 == null) {
                                                                        return;
                                                                    }
                                                                    imageView.setImageBitmap(BitmapFactory.decodeFile(A005.getAbsolutePath()));
                                                                }

                                                                @Override // X.AbstractC30911bN
                                                                public void A0B(View view, AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj3) {
                                                                    ImageView imageView = (ImageView) view;
                                                                    imageView.setImageBitmap(null);
                                                                    imageView.setImageDrawable(null);
                                                                    imageView.setColorFilter((ColorFilter) null);
                                                                }
                                                            };
                                                        case 13503:
                                                            final C45S c45s = this.A03;
                                                            return new AbstractC30911bN(c016807u, anonymousClass087) { // from class: X.47G
                                                                @Override // X.AbstractC30911bN, X.AbstractC016307p
                                                                public Object A07(Context context) {
                                                                    return View.inflate(context, R.layout.wa_list_view, null);
                                                                }

                                                                @Override // X.AbstractC30911bN
                                                                public View A08(Context context) {
                                                                    return View.inflate(context, R.layout.wa_list_view, null);
                                                                }

                                                                @Override // X.AbstractC30911bN
                                                                public void A0A(View view, AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj3) {
                                                                    C45Q.A0L(c45s, view, anonymousClass0872, c016807u2);
                                                                }

                                                                @Override // X.AbstractC30911bN
                                                                public void A0B(View view, AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj3) {
                                                                    ((RecyclerView) view.findViewById(R.id.recycler_view)).setAdapter(null);
                                                                }
                                                            };
                                                        case 13504:
                                                            return new AbstractC30911bN(c016807u, anonymousClass087) { // from class: X.47H
                                                                @Override // X.AbstractC30911bN, X.AbstractC016307p
                                                                public Object A07(Context context) {
                                                                    return new TextEmojiLabel(context);
                                                                }

                                                                @Override // X.AbstractC30911bN
                                                                public View A08(Context context) {
                                                                    return new TextEmojiLabel(context);
                                                                }

                                                                @Override // X.AbstractC30911bN
                                                                public void A0A(View view, AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj3) {
                                                                    TextEmojiLabel textEmojiLabel = (TextEmojiLabel) view;
                                                                    C890645n.A01(textEmojiLabel, c016807u2, C890645n.A00(c016807u2, anonymousClass0872));
                                                                    textEmojiLabel.setMovementMethod(LinkMovementMethod.getInstance());
                                                                }

                                                                @Override // X.AbstractC30911bN
                                                                public void A0B(View view, AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj3) {
                                                                    TextEmojiLabel textEmojiLabel = (TextEmojiLabel) view;
                                                                    textEmojiLabel.setText("");
                                                                    textEmojiLabel.setGravity(8388659);
                                                                    textEmojiLabel.setMovementMethod(null);
                                                                    textEmojiLabel.A07 = null;
                                                                }
                                                            };
                                                        default:
                                                            return super.A01(anonymousClass087, c016807u, c20430xW);
                                                    }
                                            }
                                        }
                                        return new AbstractC30911bN(c016807u, anonymousClass087) { // from class: X.47C
                                            @Override // X.AbstractC30911bN
                                            public void A0B(View view, AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj3) {
                                            }

                                            @Override // X.AbstractC30911bN, X.AbstractC016307p
                                            public Object A07(Context context) {
                                                return View.inflate(context, R.layout.wa_bloks_checkbox, null);
                                            }

                                            @Override // X.AbstractC30911bN
                                            public View A08(Context context) {
                                                return View.inflate(context, R.layout.wa_bloks_checkbox, null);
                                            }

                                            @Override // X.AbstractC30911bN
                                            public void A0A(View view, AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj3) {
                                                C45Q.A0B(view, anonymousClass0872, c016807u2);
                                            }
                                        };
                                    }
                                    return new AbstractC30911bN(c016807u, anonymousClass087) { // from class: X.47I
                                        @Override // X.AbstractC30911bN
                                        public void A0B(View view, AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj3) {
                                        }

                                        @Override // X.AbstractC30911bN, X.AbstractC016307p
                                        public Object A07(Context context) {
                                            View view = new View(context);
                                            view.setVisibility(8);
                                            return view;
                                        }

                                        @Override // X.AbstractC30911bN
                                        public View A08(Context context) {
                                            View view = new View(context);
                                            view.setVisibility(8);
                                            return view;
                                        }

                                        @Override // X.AbstractC30911bN
                                        public void A0A(View view, AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj3) {
                                            C09P AA3 = c016807u2.AA3(C46A.A00);
                                            if (AA3 != null) {
                                                view.post(new RunnableC56682np(c016807u2, AA3, anonymousClass0872));
                                            }
                                        }
                                    };
                                }
                                return new AbstractC30911bN(c016807u, anonymousClass087) { // from class: X.47J
                                    @Override // X.AbstractC30911bN, X.AbstractC016307p
                                    public Object A07(Context context) {
                                        return new TextEmojiLabel(context);
                                    }

                                    @Override // X.AbstractC30911bN
                                    public View A08(Context context) {
                                        return new TextEmojiLabel(context);
                                    }

                                    @Override // X.AbstractC30911bN
                                    public void A0A(View view, AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj3) {
                                        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) view;
                                        C45Q.A0K(textEmojiLabel, anonymousClass0872, c016807u2);
                                        C016807u c016807u3 = c016807u;
                                        AnonymousClass081 anonymousClass081 = (AnonymousClass081) c016807u3.A00.A00(C46B.A09);
                                        if (anonymousClass081 != null) {
                                            textEmojiLabel.setTextColor(AnonymousClass088.A06(anonymousClass081, anonymousClass0872));
                                        }
                                        C000200d.A0b(textEmojiLabel);
                                    }

                                    @Override // X.AbstractC30911bN
                                    public void A0B(View view, AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj3) {
                                        ((TextView) view).setText("");
                                    }
                                };
                            } else {
                                return new AbstractC30911bN(c016807u, anonymousClass087) { // from class: X.47O
                                    @Override // X.AbstractC30911bN, X.AbstractC016307p
                                    public Object A07(Context context) {
                                        return View.inflate(context, R.layout.bloks_video_view, null);
                                    }

                                    @Override // X.AbstractC30911bN
                                    public View A08(Context context) {
                                        return View.inflate(context, R.layout.bloks_video_view, null);
                                    }

                                    @Override // X.AbstractC30911bN
                                    public void A0A(View view, AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj3) {
                                        C45Q.A0C(view, anonymousClass0872, c016807u2);
                                    }

                                    @Override // X.AbstractC30911bN
                                    public void A0B(View view, AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj3) {
                                        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) C0AT.A0D(view, R.id.video_view);
                                        videoSurfaceView.A00();
                                        videoSurfaceView.A03(false);
                                    }
                                };
                            }
                        }

                        @Override // X.C03240Ex, X.C0AJ
                        public AnonymousClass084 A02(C016807u c016807u) {
                            if (c016807u.A01 != 13504) {
                                return super.A02(c016807u);
                            }
                            return AnonymousClass469.A00;
                        }

                        @Override // X.C03240Ex, X.C0AJ
                        public Object A03(AnonymousClass087 anonymousClass087, C016807u c016807u) {
                            int i = c016807u.A01;
                            if (i != 13323) {
                                if (i != 13889) {
                                    if (i != 13948) {
                                        if (i == 14005 || i == 15763) {
                                            return null;
                                        }
                                        switch (i) {
                                            case 13496:
                                                return new C890845p(this.A00, this.A07, this.A04);
                                            case 13497:
                                                return null;
                                            case 13498:
                                                return new C890245j(this.A06);
                                            case 13499:
                                                return null;
                                            default:
                                                switch (i) {
                                                    case 13501:
                                                        C002301c c002301c = this.A06;
                                                        String str = (String) c016807u.A00.A00(AnonymousClass466.A0I);
                                                        if (str == null) {
                                                            str = "";
                                                        }
                                                        return new C892646i(c002301c, str);
                                                    case 13502:
                                                        return new C891145s(this.A04, this.A03, this.A02);
                                                    case 13503:
                                                    case 13504:
                                                        return null;
                                                    default:
                                                        return super.A03(anonymousClass087, c016807u);
                                                }
                                        }
                                    }
                                    return new C890745o(this.A00, this.A05, this.A01);
                                }
                                return new C891245t(this.A04);
                            }
                            return new C891045r(null);
                        }
                    };
                    C41161tT.A01(this.A0P, obj);
                    this.A0P = obj;
                }
            }
            obj2 = obj;
        }
        return (C47P) obj2;
    }

    public final AnonymousClass478 A2J() {
        Object obj;
        Object obj2 = this.A0Q;
        if (obj2 instanceof C41111tO) {
            synchronized (obj2) {
                obj = this.A0Q;
                if (obj instanceof C41111tO) {
                    obj = new C03250Ey() { // from class: X.478
                        @Override // X.C03250Ey
                        public boolean A01(AnonymousClass080 anonymousClass080) {
                            super.A01(anonymousClass080);
                            return false;
                        }
                    };
                    C41161tT.A01(this.A0Q, obj);
                    this.A0Q = obj;
                }
            }
            obj2 = obj;
        }
        return (AnonymousClass478) obj2;
    }

    public final C47Q A2K() {
        Object obj;
        Object obj2 = this.A0S;
        if (obj2 instanceof C41111tO) {
            synchronized (obj2) {
                obj = this.A0S;
                if (obj instanceof C41111tO) {
                    obj = new C03260Ez(A0B()) { // from class: X.47Q
                        public final SparseArray A00 = new SparseArray();

                        {
                            Iterator it = r5.iterator();
                            while (it.hasNext()) {
                                C46F c46f = (C46F) it.next();
                                this.A00.put(c46f.A00, c46f);
                            }
                        }

                        @Override // X.C03260Ez, X.C0AK
                        public Object A00(AnonymousClass087 anonymousClass087, AnonymousClass080 anonymousClass080) {
                            int ADL = ((AnonymousClass081) anonymousClass080).ADL();
                            SparseArray sparseArray = this.A00;
                            if (sparseArray.indexOfKey(ADL) >= 0) {
                                if (!(((C46F) sparseArray.get(ADL)) instanceof C4GA)) {
                                    return new C889745e();
                                }
                                return new Object() { // from class: X.4Ao
                                };
                            }
                            return super.A00(anonymousClass087, anonymousClass080);
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:67:0x008a, code lost:
                            if (r2 == 8) goto L27;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:70:0x008e, code lost:
                            if (r1 == false) goto L28;
                         */
                        @Override // X.C03260Ez, X.C0AK
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public void A01(final X.AnonymousClass087 r9, java.lang.Object r10, X.AnonymousClass080 r11, X.AnonymousClass080 r12) {
                            /*
                                r8 = this;
                                r3 = r11
                                X.081 r3 = (X.AnonymousClass081) r3
                                r2 = r10
                                android.view.View r2 = (android.view.View) r2
                                r1 = r12
                                X.07v r1 = (X.AbstractC016907v) r1
                                int r5 = r3.ADL()
                                android.util.SparseArray r4 = r8.A00
                                int r0 = r4.indexOfKey(r5)
                                if (r0 < 0) goto L2f
                                java.lang.Object r0 = r4.get(r5)
                                X.46F r0 = (X.C46F) r0
                                boolean r0 = r0 instanceof X.C4GA
                                if (r0 != 0) goto L94
                                X.084 r0 = X.C891545x.A01
                                X.09P r6 = r3.AA3(r0)
                                X.084 r0 = X.C891545x.A02
                                X.09P r5 = r3.AA3(r0)
                                if (r6 != 0) goto L33
                                if (r5 != 0) goto L33
                            L2f:
                                super.A01(r9, r10, r11, r12)
                                return
                            L33:
                                java.lang.Object r7 = X.AnonymousClass088.A0o(r9, r3)
                                X.45e r7 = (X.C889745e) r7
                                int r4 = r1.A00
                                X.084 r0 = X.C891545x.A00
                                java.lang.String r1 = r3.ADJ(r0)
                                java.util.concurrent.atomic.AtomicBoolean r0 = r7.A02
                                boolean r0 = r0.get()
                                if (r0 == 0) goto L65
                                X.1FH r3 = r7.A00
                                r2 = 0
                                X.1FE r0 = new X.1FE
                                r0.<init>(r1)
                                X.2nf r1 = new X.2nf
                                r1.<init>()
                                java.util.List r0 = r0.A01
                                if (r0 != 0) goto L5f
                                java.util.ArrayList r0 = new java.util.ArrayList
                                r0.<init>()
                            L5f:
                                r0.add(r1)
                                if (r3 == 0) goto Lc3
                                throw r2
                            L65:
                                X.45d r3 = r7.A01
                                r3.A00 = r4
                                r3.A01 = r2
                                r3.A02 = r9
                                r3.A05 = r1
                                r3.A03 = r6
                                r3.A04 = r5
                                android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
                                r0.addOnGlobalLayoutListener(r3)
                                android.view.ViewParent r0 = r2.getParent()
                                if (r0 == 0) goto L90
                                int r2 = r2.getVisibility()
                                r0 = 4
                                if (r2 == r0) goto L8c
                                r0 = 8
                                r1 = 1
                                if (r2 != r0) goto L8d
                            L8c:
                                r1 = 0
                            L8d:
                                r0 = 1
                                if (r1 != 0) goto L91
                            L90:
                                r0 = 0
                            L91:
                                r3.A06 = r0
                                goto L2f
                            L94:
                                java.lang.Object r1 = X.AnonymousClass088.A0o(r9, r3)
                                X.084 r0 = X.C891545x.A00
                                r3.ADJ(r0)
                                if (r1 == 0) goto Lc4
                                android.content.Context r0 = r9.A00
                                android.app.Activity r2 = X.C018308n.A00(r0)
                                com.whatsapp.wabloks.ui.WaBloksActivity r2 = (com.whatsapp.wabloks.ui.WaBloksActivity) r2
                                androidx.appcompat.widget.Toolbar r0 = r2.A07
                                if (r0 == 0) goto L2f
                                r1 = 1
                                X.4G5 r0 = r2.A01
                                if (r0 == 0) goto Lb3
                                r0.A00(r1, r3)
                            Lb3:
                                X.4G6 r1 = r2.A02
                                if (r1 == 0) goto L2f
                                X.4An r0 = new X.4An
                                r0.<init>(r3)
                                r1.A03 = r0
                                r1.A00()
                                goto L2f
                            Lc3:
                                throw r2
                            Lc4:
                                r0 = 0
                                throw r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C47Q.A01(X.087, java.lang.Object, X.080, X.080):void");
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:60:0x0061, code lost:
                            if (r2 == 8) goto L26;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:62:0x0064, code lost:
                            if (r0 != false) goto L28;
                         */
                        @Override // X.C03260Ez, X.C0AK
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public void A02(X.AnonymousClass087 r7, java.lang.Object r8, X.AnonymousClass080 r9, X.AnonymousClass080 r10) {
                            /*
                                r6 = this;
                                r2 = r9
                                X.081 r2 = (X.AnonymousClass081) r2
                                int r3 = r2.ADL()
                                android.util.SparseArray r1 = r6.A00
                                int r0 = r1.indexOfKey(r3)
                                if (r0 < 0) goto L29
                                java.lang.Object r0 = r1.get(r3)
                                X.46F r0 = (X.C46F) r0
                                boolean r0 = r0 instanceof X.C4GA
                                if (r0 != 0) goto L7e
                                X.084 r0 = X.C891545x.A01
                                X.09P r1 = r2.AA3(r0)
                                X.084 r0 = X.C891545x.A02
                                X.09P r0 = r2.AA3(r0)
                                if (r1 != 0) goto L2d
                                if (r0 != 0) goto L2d
                            L29:
                                super.A02(r7, r8, r9, r10)
                                return
                            L2d:
                                java.lang.Object r1 = X.AnonymousClass088.A0o(r7, r2)
                                X.45e r1 = (X.C889745e) r1
                                X.084 r0 = X.C891545x.A00
                                r2.ADJ(r0)
                                java.util.concurrent.atomic.AtomicBoolean r0 = r1.A02
                                boolean r0 = r0.get()
                                r5 = 0
                                if (r0 == 0) goto L46
                                X.1FH r0 = r1.A00
                                if (r0 == 0) goto Ld8
                                throw r5
                            L46:
                                X.45d r4 = r1.A01
                                android.view.View r1 = r4.A01
                                if (r1 == 0) goto L29
                                boolean r0 = r4.A06
                                r3 = 0
                                if (r0 == 0) goto L66
                                android.view.ViewParent r0 = r1.getParent()
                                if (r0 == 0) goto L7a
                                int r2 = r1.getVisibility()
                                r0 = 4
                                if (r2 == r0) goto L63
                                r1 = 8
                                r0 = 1
                                if (r2 != r1) goto L64
                            L63:
                                r0 = 0
                            L64:
                                if (r0 == 0) goto L7a
                            L66:
                                android.view.View r0 = r4.A01
                                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                                r0.removeOnGlobalLayoutListener(r4)
                                r4.A01 = r5
                                r4.A02 = r5
                                r4.A03 = r5
                                r4.A04 = r5
                                r4.A06 = r3
                                goto L29
                            L7a:
                                r4.A00()
                                goto L66
                            L7e:
                                boolean r1 = r2.AF7()
                                java.util.concurrent.atomic.AtomicInteger r0 = X.C24951Dm.A00
                                r0.incrementAndGet()
                                X.085 r3 = new X.085
                                r3.<init>(r1)
                                X.084 r1 = X.C891645y.A05
                                java.lang.String r0 = r2.ADJ(r1)
                                r3.A02(r1, r0)
                                X.084 r1 = X.C891645y.A04
                                r4 = 0
                                boolean r0 = r2.A8Z(r1, r4)
                                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                                r3.A02(r1, r0)
                                X.084 r1 = X.C891645y.A03
                                boolean r0 = r2.A8Z(r1, r4)
                                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                                r3.A02(r1, r0)
                                X.084 r1 = X.C891645y.A01
                                java.lang.Object r0 = r2.ABT(r1)
                                r3.A02(r1, r0)
                                X.084 r1 = X.C891645y.A02
                                java.lang.Object r0 = r2.ABT(r1)
                                r3.A02(r1, r0)
                                X.084 r1 = X.C891645y.A00
                                java.lang.String r0 = r2.ADJ(r1)
                                r3.A02(r1, r0)
                                java.lang.Object r1 = X.AnonymousClass088.A0o(r7, r2)
                                X.084 r0 = X.C891545x.A00
                                r2.ADJ(r0)
                                if (r1 != 0) goto L29
                                r0 = 0
                                throw r0
                            Ld8:
                                throw r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C47Q.A02(X.087, java.lang.Object, X.080, X.080):void");
                        }
                    };
                    C41161tT.A01(this.A0S, obj);
                    this.A0S = obj;
                }
            }
            obj2 = obj;
        }
        return (C47Q) obj2;
    }

    public final C893746t A2L() {
        Object obj;
        Object obj2 = this.A0R;
        if (obj2 instanceof C41111tO) {
            synchronized (obj2) {
                obj = this.A0R;
                if (obj instanceof C41111tO) {
                    obj = C893746t.A00;
                    C02180Ae.A1B(obj);
                    C41161tT.A01(this.A0R, obj);
                    this.A0R = obj;
                }
            }
            obj2 = obj;
        }
        return (C893746t) obj2;
    }

    public final C0F1 A2M() {
        C02L A00 = C41131tQ.A00();
        C05W A002 = C41141tR.A00();
        C018708s A003 = C018708s.A00();
        C02180Ae.A1B(A003);
        InterfaceC007103c interfaceC007103c = this.A0j;
        if (interfaceC007103c == null) {
            interfaceC007103c = new C03040Dx(this, 43);
            this.A0j = interfaceC007103c;
        }
        InterfaceC007103c interfaceC007103c2 = this.A0m;
        if (interfaceC007103c2 == null) {
            interfaceC007103c2 = new C03040Dx(this, 44);
            this.A0m = interfaceC007103c2;
        }
        C0F0 A004 = C0F0.A00();
        C02180Ae.A1B(A004);
        C0C7 A005 = C0C7.A00();
        C02180Ae.A1B(A005);
        return new C0F1(A00, A002, A003, interfaceC007103c, interfaceC007103c2, A004, A005);
    }

    public final C42221vO A2N() {
        Object obj;
        Object obj2 = this.A0C;
        if (obj2 instanceof C41111tO) {
            synchronized (obj2) {
                obj = this.A0C;
                if (obj instanceof C41111tO) {
                    Context context = this.A00.A00;
                    C02180Ae.A1B(context);
                    AbstractC000600i A00 = AbstractC000600i.A00();
                    C02180Ae.A1B(A00);
                    C42211vN c42211vN = new C42211vN();
                    InterfaceC007103c interfaceC007103c = this.A0c;
                    if (interfaceC007103c == null) {
                        interfaceC007103c = new C03040Dx(this, 18);
                        this.A0c = interfaceC007103c;
                    }
                    obj = new C42221vO(context, A00, c42211vN, C41161tT.A00(interfaceC007103c));
                    C41161tT.A01(this.A0C, obj);
                    this.A0C = obj;
                }
            }
            obj2 = obj;
        }
        return (C42221vO) obj2;
    }

    public final C42271vT A2O() {
        Object obj;
        Object obj2 = this.A08;
        if (obj2 instanceof C41111tO) {
            synchronized (obj2) {
                obj = this.A08;
                if (obj instanceof C41111tO) {
                    AbstractC000600i A00 = AbstractC000600i.A00();
                    C02180Ae.A1B(A00);
                    C001200o c001200o = C001200o.A01;
                    C02180Ae.A1B(c001200o);
                    C42211vN c42211vN = new C42211vN();
                    InterfaceC007103c interfaceC007103c = this.A0c;
                    if (interfaceC007103c == null) {
                        interfaceC007103c = new C03040Dx(this, 18);
                        this.A0c = interfaceC007103c;
                    }
                    obj = new C42271vT(A00, c001200o, c42211vN, C41161tT.A00(interfaceC007103c), A2N(), A2P(), A2Q(), A2R());
                    C41161tT.A01(this.A08, obj);
                    this.A08 = obj;
                }
            }
            obj2 = obj;
        }
        return (C42271vT) obj2;
    }

    public final C42241vQ A2P() {
        Object obj;
        Object obj2 = this.A0A;
        if (obj2 instanceof C41111tO) {
            synchronized (obj2) {
                obj = this.A0A;
                if (obj instanceof C41111tO) {
                    obj = new C42241vQ();
                    C41161tT.A01(this.A0A, obj);
                    this.A0A = obj;
                }
            }
            obj2 = obj;
        }
        return (C42241vQ) obj2;
    }

    public final C42251vR A2Q() {
        Object obj;
        Object obj2 = this.A09;
        if (obj2 instanceof C41111tO) {
            synchronized (obj2) {
                obj = this.A09;
                if (obj instanceof C41111tO) {
                    Context context = this.A00.A00;
                    C02180Ae.A1B(context);
                    AbstractC000600i A00 = AbstractC000600i.A00();
                    C02180Ae.A1B(A00);
                    InterfaceC007103c interfaceC007103c = this.A0b;
                    if (interfaceC007103c == null) {
                        interfaceC007103c = new C03040Dx(this, 19);
                        this.A0b = interfaceC007103c;
                    }
                    obj = new C42251vR(context, A00, interfaceC007103c);
                    C41161tT.A01(this.A09, obj);
                    this.A09 = obj;
                }
            }
            obj2 = obj;
        }
        return (C42251vR) obj2;
    }

    public final C42261vS A2R() {
        Object obj;
        Object obj2 = this.A0B;
        if (obj2 instanceof C41111tO) {
            synchronized (obj2) {
                obj = this.A0B;
                if (obj instanceof C41111tO) {
                    obj = new C42261vS(A2Q());
                    C41161tT.A01(this.A0B, obj);
                    this.A0B = obj;
                }
            }
            obj2 = obj;
        }
        return (C42261vS) obj2;
    }

    public final C42311vX A2S() {
        Object obj;
        Object obj2 = this.A0D;
        if (obj2 instanceof C41111tO) {
            synchronized (obj2) {
                obj = this.A0D;
                if (obj instanceof C41111tO) {
                    obj = new C42311vX(A2O(), A2V(), A2N(), A2T(), A2P(), A2U());
                    C41161tT.A01(this.A0D, obj);
                    this.A0D = obj;
                }
            }
            obj2 = obj;
        }
        return (C42311vX) obj2;
    }

    public final C42291vV A2T() {
        Object obj;
        Object obj2 = this.A0F;
        if (obj2 instanceof C41111tO) {
            synchronized (obj2) {
                obj = this.A0F;
                if (obj instanceof C41111tO) {
                    obj = new C42291vV();
                    C41161tT.A01(this.A0F, obj);
                    this.A0F = obj;
                }
            }
            obj2 = obj;
        }
        return (C42291vV) obj2;
    }

    public final C42301vW A2U() {
        Object obj;
        Object obj2 = this.A0G;
        if (obj2 instanceof C41111tO) {
            synchronized (obj2) {
                obj = this.A0G;
                if (obj instanceof C41111tO) {
                    obj = new AnonymousClass038() { // from class: X.1vW
                    };
                    C41161tT.A01(this.A0G, obj);
                    this.A0G = obj;
                }
            }
            obj2 = obj;
        }
        return (C42301vW) obj2;
    }

    public final C42281vU A2V() {
        Object obj;
        Object obj2 = this.A0H;
        if (obj2 instanceof C41111tO) {
            synchronized (obj2) {
                obj = this.A0H;
                if (obj instanceof C41111tO) {
                    C05M A00 = C05M.A00();
                    C02180Ae.A1B(A00);
                    C012005w A002 = C012005w.A00();
                    C02180Ae.A1B(A002);
                    C41181tV A0A = C41171tU.A0A();
                    AnonymousClass034 A003 = AnonymousClass034.A00();
                    C02180Ae.A1B(A003);
                    C42301vW A2U = A2U();
                    C41961un A0C = C41371to.A0C();
                    C0C9 A004 = C0C9.A00();
                    C02180Ae.A1B(A004);
                    C42321vY A005 = C42321vY.A00();
                    C02180Ae.A1B(A005);
                    obj = new C42281vU(A00, A002, A0A, A003, A2U, A0C, A004, A005, A2O());
                    C41161tT.A01(this.A0H, obj);
                    this.A0H = obj;
                }
            }
            obj2 = obj;
        }
        return (C42281vU) obj2;
    }

    public final C42361vc A2W() {
        Object obj;
        Object obj2 = this.A0N;
        if (obj2 instanceof C41111tO) {
            synchronized (obj2) {
                obj = this.A0N;
                if (obj instanceof C41111tO) {
                    AbstractC000600i A00 = AbstractC000600i.A00();
                    C02180Ae.A1B(A00);
                    C001200o c001200o = C001200o.A01;
                    C02180Ae.A1B(c001200o);
                    C04Z A002 = C04Z.A00();
                    C02180Ae.A1B(A002);
                    C02180Ae.A1B(C42331vZ.A00());
                    C02180Ae.A1B(C42351vb.A00());
                    C02180Ae.A1B(C0F2.A00());
                    obj = new Object(A00, c001200o, A002) { // from class: X.1vc
                        {
                            new C42551vv(c001200o.A00, A00, A002);
                        }
                    };
                    C41161tT.A01(this.A0N, obj);
                    this.A0N = obj;
                }
            }
            obj2 = obj;
        }
        return (C42361vc) obj2;
    }

    public final InterfaceC007103c A2X() {
        InterfaceC007103c interfaceC007103c = this.A0W;
        if (interfaceC007103c == null) {
            C03040Dx c03040Dx = new C03040Dx(this, 1);
            this.A0W = c03040Dx;
            return c03040Dx;
        }
        return interfaceC007103c;
    }

    public final InterfaceC007103c A2Y() {
        InterfaceC007103c interfaceC007103c = this.A0p;
        if (interfaceC007103c == null) {
            C03040Dx c03040Dx = new C03040Dx(this, 16);
            this.A0p = c03040Dx;
            return c03040Dx;
        }
        return interfaceC007103c;
    }

    public final InterfaceC007103c A2Z() {
        InterfaceC007103c interfaceC007103c = this.A11;
        if (interfaceC007103c == null) {
            C03040Dx c03040Dx = new C03040Dx(this, 12);
            this.A11 = c03040Dx;
            return c03040Dx;
        }
        return interfaceC007103c;
    }
}
