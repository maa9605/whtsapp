package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.MuteDialogFragment;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.support.ReportSpamDialogFragment;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.2JA */
/* loaded from: classes2.dex */
public abstract class C2JA extends C06020Rf implements InterfaceC06230Sb {
    public C06C A00;
    public final ActivityC02320As A02;
    public final C0B5 A03;
    public final C018508q A04;
    public final C02L A05;
    public final C01B A06;
    public final C018608r A07;
    public final C0L8 A08;
    public final C1M7 A09;
    public final C03320Ff A0B;
    public final AnonymousClass008 A0D;
    public final C0M0 A0E;
    public final C2MW A0F;
    public final C000400f A0G;
    public final C000500h A0H;
    public final C002301c A0I;
    public final C05M A0J;
    public final C0DK A0K;
    public final C41711uO A0L;
    public final C03300Fd A0M;
    public final C03360Fk A0O;
    public final AbstractC005302j A0P;
    public final C0CB A0Q;
    public final C2AR A0R;
    public final C2MG A0S;
    public final C2MZ A0T;
    public final InterfaceC002901k A0U;
    public final C0L6 A0V;
    public final boolean A0W = true;
    public final C0GA A0C = new C0GA() { // from class: X.37c
        {
            C2JA.this = this;
        }

        @Override // X.C0GA
        public void A00() {
            C2JA c2ja = C2JA.this;
            c2ja.A00 = c2ja.A0K.A02(c2ja.A0P);
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            if (userJid != null) {
                C2JA c2ja = C2JA.this;
                AbstractC005302j abstractC005302j = c2ja.A0P;
                if (userJid.equals(abstractC005302j)) {
                    boolean A0B = c2ja.A00.A0B();
                    C06C A02 = c2ja.A0K.A02(abstractC005302j);
                    c2ja.A00 = A02;
                    if (A0B != A02.A0B()) {
                        c2ja.A02.invalidateOptionsMenu();
                    }
                }
            }
        }
    };
    public final C0GC A0A = new C0GC() { // from class: X.37d
        {
            C2JA.this = this;
        }

        @Override // X.C0GC
        public void A00(AbstractC005302j abstractC005302j) {
            C2JA c2ja = C2JA.this;
            c2ja.A00 = c2ja.A0K.A02(c2ja.A0P);
        }
    };
    public final C0GE A0N = new C0GE() { // from class: X.37e
        {
            C2JA.this = this;
        }

        @Override // X.C0GE
        public void A00(Set set) {
            C2JA c2ja = C2JA.this;
            c2ja.A00 = c2ja.A0K.A02(c2ja.A0P);
        }
    };
    public final int A01 = 17;

    public C2JA(ActivityC02320As activityC02320As, C0B5 c0b5, C0M0 c0m0, C018508q c018508q, C02L c02l, InterfaceC002901k interfaceC002901k, C05M c05m, C2MG c2mg, C01B c01b, C018608r c018608r, C0L6 c0l6, C002301c c002301c, C1M7 c1m7, C03300Fd c03300Fd, AnonymousClass008 anonymousClass008, C2AR c2ar, C0CB c0cb, C000400f c000400f, C0L8 c0l8, C03320Ff c03320Ff, C000500h c000500h, C2MW c2mw, C41711uO c41711uO, C2MZ c2mz, C0DK c0dk, C03360Fk c03360Fk, AbstractC005302j abstractC005302j, C06C c06c) {
        this.A02 = activityC02320As;
        this.A03 = c0b5;
        this.A0E = c0m0;
        this.A04 = c018508q;
        this.A05 = c02l;
        this.A0U = interfaceC002901k;
        this.A0J = c05m;
        this.A0S = c2mg;
        this.A06 = c01b;
        this.A07 = c018608r;
        this.A0V = c0l6;
        this.A0I = c002301c;
        this.A09 = c1m7;
        this.A0M = c03300Fd;
        this.A0D = anonymousClass008;
        this.A0R = c2ar;
        this.A0Q = c0cb;
        this.A0G = c000400f;
        this.A08 = c0l8;
        this.A0B = c03320Ff;
        this.A0H = c000500h;
        this.A0F = c2mw;
        this.A0L = c41711uO;
        this.A0T = c2mz;
        this.A0K = c0dk;
        this.A0O = c03360Fk;
        this.A0P = abstractC005302j;
        this.A00 = c06c;
    }

    public static MenuItem A00(Menu menu, int i, int i2) {
        return menu.add(0, i, 0, i2);
    }

    public int A01() {
        C0CB c0cb = this.A0Q;
        AbstractC005302j abstractC005302j = this.A0P;
        if (!c0cb.A0Q(abstractC005302j) && !C23X.A0O(abstractC005302j, this.A0J, this.A06, this.A0H)) {
            return R.string.menuitem_mute_notifications;
        }
        return R.string.menuitem_unmute_notifications;
    }

    public void A02(Menu menu) {
        if (this.A06.A0E(C01C.A0q)) {
            A00(menu, 3, R.string.export_attachment);
        }
    }

    public void A03(MenuItem menuItem) {
        ActivityC02320As activityC02320As = this.A02;
        SpannableString spannableString = new SpannableString(activityC02320As.getString(A01()));
        if (C23X.A0O(this.A0P, this.A0J, this.A06, this.A0H)) {
            spannableString.setSpan(new ForegroundColorSpan(C02160Ac.A00(activityC02320As, R.color.list_item_disabled)), 0, spannableString.length(), 0);
        }
        menuItem.setTitle(spannableString);
    }

    public void A04(MenuItem menuItem, final int i, boolean z) {
        View actionView = menuItem.getActionView();
        actionView.setAlpha(z ? 1.0f : 0.4f);
        actionView.setEnabled(z);
        if (z) {
            if (this.A0I.A0M()) {
                actionView.setOnTouchListener(new View$OnTouchListenerC49522Kw(0.0f, 0.0f, 0.2f, 0.0f));
            } else {
                actionView.setOnTouchListener(new View$OnTouchListenerC49522Kw(0.2f, 0.0f, 0.0f, 0.0f));
            }
            actionView.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0_0(this, menuItem, 9));
            actionView.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.2qo
                {
                    C2JA.this = this;
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    C2JA c2ja = C2JA.this;
                    Toast A01 = c2ja.A04.A01(view.getContext().getString(i), 0);
                    int[] iArr = new int[2];
                    Rect rect = new Rect();
                    view.getLocationOnScreen(iArr);
                    view.getWindowVisibleDisplayFrame(rect);
                    int height = (iArr[1] + view.getHeight()) - rect.top;
                    int i2 = iArr[0];
                    if (c2ja.A0I.A0M()) {
                        Point point = new Point();
                        c2ja.A02.getWindowManager().getDefaultDisplay().getSize(point);
                        if (A01.getView() != null) {
                            A01.getView().measure(point.x, point.y);
                            i2 -= A01.getView().getMeasuredWidth();
                        }
                    } else {
                        i2 += view.getWidth();
                    }
                    A01.setGravity(51, i2, height);
                    A01.show();
                    return true;
                }
            });
        }
    }

    @Override // X.InterfaceC06230Sb
    public boolean AMZ(MenuItem menuItem) {
        this.A0M.A01 = 6;
        int itemId = menuItem.getItemId();
        if (itemId != 16908332) {
            switch (itemId) {
                case 2:
                    this.A08.A06(this.A00);
                    return true;
                case 3:
                    if (this.A0G.A08()) {
                        Log.w("conversation/email-attachment/need-sd-card");
                        C0B5 c0b5 = this.A03;
                        boolean A01 = C000400f.A01();
                        int i = R.string.need_sd_card_shared_storage;
                        if (A01) {
                            i = R.string.need_sd_card;
                        }
                        c0b5.AUj(i);
                        return true;
                    }
                    C2MW c2mw = this.A0F;
                    ActivityC02320As activityC02320As = this.A02;
                    C0B5 c0b52 = this.A03;
                    AbstractC005302j abstractC005302j = this.A0P;
                    C06C c06c = this.A00;
                    if (c2mw.A04.A0B(abstractC005302j, 1, null, 2).size() > 0) {
                        C002701i.A19(activityC02320As, 10);
                        return true;
                    }
                    c2mw.A01(activityC02320As, c0b52, c06c, false);
                    return true;
                case 4:
                    AbstractC005302j abstractC005302j2 = this.A0P;
                    if (C23X.A0O(abstractC005302j2, this.A0J, this.A06, this.A0H)) {
                        ActivityC02320As activityC02320As2 = this.A02;
                        C23X.A0H(activityC02320As2, this.A07, activityC02320As2.findViewById(R.id.footer), abstractC005302j2);
                        return true;
                    } else if (this.A0Q.A0Q(abstractC005302j2)) {
                        this.A0U.AS1(new RunnableEBaseShape1S0100000_I0_1(this, 47));
                        return true;
                    } else {
                        MuteDialogFragment.A00(abstractC005302j2).A14(this.A02.A0N(), "MuteDialogFragment");
                        return true;
                    }
                case 5:
                    Log.i("conversation/menu/wallpaper/");
                    C03410Fp.A07(this.A06, this.A02, this.A0P, this.A03, this.A01);
                    return true;
                case 6:
                    ActivityC02320As activityC02320As3 = this.A02;
                    Intent intent = new Intent(activityC02320As3, MediaGalleryActivity.class);
                    intent.putExtra("jid", this.A0P.getRawString());
                    activityC02320As3.startActivity(intent);
                    return true;
                case 7:
                    this.A02.onSearchRequested();
                    return true;
                case 8:
                    C0CI A06 = this.A0T.A06(this.A02);
                    A06.A01.A03(new C0CG() { // from class: X.37R
                        {
                            C2JA.this = this;
                        }

                        @Override // X.C0CG
                        public final void A54(Object obj) {
                            final C2JA c2ja = C2JA.this;
                            c2ja.A0T.A07(new C2II() { // from class: X.37f
                                @Override // X.C2II
                                public void A6d() {
                                    C002701i.A19(c2ja.A02, 0);
                                }

                                @Override // X.C2II
                                public void AEA(boolean z) {
                                    if (z) {
                                        C002701i.A19(c2ja.A02, 0);
                                    } else {
                                        C002701i.A19(c2ja.A02, 20);
                                    }
                                }
                            }, c2ja.A0P);
                        }
                    }, null);
                    return true;
                case 9:
                    C0CI A02 = this.A0L.A02();
                    A02.A01.A03(new C0CG() { // from class: X.37S
                        {
                            C2JA.this = this;
                        }

                        @Override // X.C0CG
                        public final void A54(Object obj) {
                            C2JA c2ja = C2JA.this;
                            Boolean bool = (Boolean) obj;
                            C0B5 c0b53 = c2ja.A03;
                            if (!c0b53.AFE()) {
                                c0b53.AUh(ReportSpamDialogFragment.A00(c2ja.A0P, "overflow_menu", bool.booleanValue()));
                            }
                        }
                    }, null);
                    return true;
                default:
                    return false;
            }
        }
        this.A02.finish();
        return true;
    }

    @Override // X.InterfaceC06230Sb
    public boolean ANF(Menu menu) {
        boolean z = ((Conversation) this.A0E).A1S.getCount() > 0;
        menu.findItem(8).setVisible(z);
        menu.findItem(7).setVisible(z);
        MenuItem findItem = menu.findItem(3);
        if (findItem != null) {
            findItem.setVisible(z);
        }
        MenuItem findItem2 = menu.findItem(9);
        if (findItem2 != null) {
            findItem2.setVisible(true);
        }
        MenuItem findItem3 = menu.findItem(1);
        if (findItem3.getSubMenu().hasVisibleItems()) {
            findItem3.setVisible(true);
            return true;
        }
        findItem3.setVisible(false);
        return true;
    }

    @Override // X.C06020Rf, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.A0D.A01(this.A0C);
        this.A0B.A01(this.A0A);
        this.A0O.A01(this.A0N);
    }

    @Override // X.C06020Rf, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.A0D.A00(this.A0C);
        this.A0B.A00(this.A0A);
        this.A0O.A00(this.A0N);
    }
}
