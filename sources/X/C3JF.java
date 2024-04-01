package X;

import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3JF  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3JF extends C2JA {
    public final C018308n A00;
    public final C03230Ew A01;
    public final C02L A02;
    public final C2Ln A03;
    public final C06K A04;
    public final C49462Ko A05;
    public final C40261rr A06;
    public final AnonymousClass075 A07;
    public final AnonymousClass011 A08;
    public final InterfaceC41261td A09;

    public C3JF(ActivityC02320As activityC02320As, C0B5 c0b5, C0M0 c0m0, C018508q c018508q, C02L c02l, InterfaceC002901k interfaceC002901k, C05M c05m, C2MG c2mg, AnonymousClass011 anonymousClass011, C01B c01b, C018608r c018608r, C03230Ew c03230Ew, C018308n c018308n, C0L6 c0l6, C018708s c018708s, C002301c c002301c, InterfaceC41261td interfaceC41261td, C1M7 c1m7, C03300Fd c03300Fd, AnonymousClass008 anonymousClass008, C40261rr c40261rr, C2AR c2ar, C0CB c0cb, C000400f c000400f, C0L8 c0l8, C03320Ff c03320Ff, C43081wp c43081wp, AnonymousClass075 anonymousClass075, C000500h c000500h, C2Ln c2Ln, C2MW c2mw, C06K c06k, C49462Ko c49462Ko, C41711uO c41711uO, C2MZ c2mz, C0DK c0dk, C03360Fk c03360Fk, AbstractC005302j abstractC005302j, C06C c06c) {
        super(activityC02320As, c0b5, c0m0, c018508q, c02l, interfaceC002901k, c05m, c2mg, c01b, c018608r, c0l6, c002301c, c1m7, c03300Fd, anonymousClass008, c2ar, c0cb, c000400f, c0l8, c03320Ff, c000500h, c2mw, c41711uO, c2mz, c0dk, c03360Fk, abstractC005302j, c06c);
        this.A02 = c02l;
        this.A08 = anonymousClass011;
        this.A01 = c03230Ew;
        this.A00 = c018308n;
        this.A09 = interfaceC41261td;
        this.A06 = c40261rr;
        this.A07 = anonymousClass075;
        this.A03 = c2Ln;
        this.A04 = c06k;
        this.A05 = c49462Ko;
    }

    @Override // X.InterfaceC06230Sb
    public void AJ9(final Menu menu) {
        boolean z;
        boolean z2;
        Log.i("contactconversationmenu/oncreateoptionsmenu");
        AbstractC005302j abstractC005302j = this.A0P;
        if (C003101m.A0Y(abstractC005302j)) {
            C2JA.A00(menu, 21, R.string.view_contact);
            C2JA.A00(menu, 6, R.string.view_conversation_media);
            C2JA.A00(menu, 7, R.string.search);
            C2JA.A00(menu, 4, A01());
            C2JA.A00(menu, 5, R.string.wallpaper);
            SubMenu addSubMenu = menu.addSubMenu(0, 1, 0, R.string.more);
            addSubMenu.clearHeader();
            addSubMenu.clearHeader();
            C2JA.A00(addSubMenu, 8, R.string.clear_chat);
            A02(addSubMenu);
            return;
        }
        C02L c02l = this.A02;
        c02l.A0A(abstractC005302j);
        if (!super.A00.A0B()) {
            if (!C0L6.A02() && !((Conversation) this.A0E).A2T()) {
                z2 = !c02l.A0A(abstractC005302j);
            } else {
                z2 = false;
            }
            MenuItem A00 = C2JA.A00(menu, 26, R.string.video_call);
            A00.setActionView(R.layout.video_call_menu_item);
            A04(A00, R.string.video_call, z2);
            MenuItem A002 = C2JA.A00(menu, 25, R.string.audio_call);
            A002.setActionView(R.layout.audio_call_menu_item);
            A002.getActionView().setContentDescription(super.A02.getString(R.string.audio_call));
            A04(A002, R.string.audio_call, z2);
            A00.setShowAsAction(2);
            A002.setShowAsAction(2);
        } else {
            UserJid userJid = (UserJid) abstractC005302j;
            if (userJid != null) {
                C06K c06k = this.A04;
                c06k.A08.ARy(new C36331kd(c06k, userJid, new C1N6() { // from class: X.37O
                    @Override // X.C1N6
                    public final void AI2(C05210Nt c05210Nt) {
                        C3JF c3jf = C3JF.this;
                        Menu menu2 = menu;
                        if (c05210Nt != null) {
                            if (c3jf.A03.A00(c05210Nt)) {
                                MenuItem add = menu2.add(0, 30, 1, R.string.view_shop);
                                add.setActionView(R.layout.view_shop_menu_item);
                                View actionView = add.getActionView();
                                actionView.setTag(R.id.tag_shop_url, c05210Nt.A05);
                                actionView.setContentDescription(((C2JA) c3jf).A02.getString(R.string.view_shop));
                                c3jf.A04(add, R.string.view_shop, true);
                                add.setShowAsAction(2);
                            } else if (!c05210Nt.A09) {
                            } else {
                                MenuItem A003 = C2JA.A00(menu2, 29, R.string.view_catalog);
                                ActivityC02320As activityC02320As = ((C2JA) c3jf).A02;
                                ImageView imageView = (ImageView) View.inflate(activityC02320As, R.layout.view_menu_item_image_button_placeholder, null);
                                imageView.setImageDrawable(C02160Ac.A03(activityC02320As, R.drawable.ic_action_view_catalog));
                                imageView.setContentDescription(activityC02320As.getString(R.string.view_catalog));
                                A003.setActionView(imageView);
                                c3jf.A04(A003, R.string.view_catalog, true);
                                A003.setShowAsAction(2);
                            }
                        }
                    }
                }), new Void[0]);
            }
            if (!this.A07.A02((UserJid) super.A00.A03(UserJid.class))) {
                if (!C0L6.A02() && !((Conversation) this.A0E).A2T()) {
                    z = !c02l.A0A(abstractC005302j);
                } else {
                    z = false;
                }
                MenuItem add = menu.add(0, 28, 5, R.string.call);
                add.setActionView(R.layout.audio_video_call_menu_item);
                add.getActionView().setContentDescription(super.A02.getString(R.string.call));
                A04(add, R.string.call, z);
                add.setShowAsAction(2);
            }
        }
        if (super.A00.A0B()) {
            C2JA.A00(menu, 21, R.string.view_contact);
            C2JA.A00(menu, 22, R.string.add_contact);
            C2JA.A00(menu, 9, R.string.report_spam);
            C2JA.A00(menu, 23, R.string.block);
            C2JA.A00(menu, 24, R.string.unblock);
            C2JA.A00(menu, 7, R.string.search);
            C2JA.A00(menu, 4, A01());
            C2JA.A00(menu, 5, R.string.wallpaper);
            SubMenu addSubMenu2 = menu.addSubMenu(0, 1, 0, R.string.more);
            addSubMenu2.clearHeader();
            addSubMenu2.clearHeader();
            C2JA.A00(addSubMenu2, 6, R.string.view_conversation_media);
            C2JA.A00(addSubMenu2, 8, R.string.clear_chat);
            A02(addSubMenu2);
            C2JA.A00(addSubMenu2, 2, R.string.add_shortcut_short);
            return;
        }
        C2JA.A00(menu, 21, R.string.view_contact);
        C2JA.A00(menu, 22, R.string.add_contact);
        C2JA.A00(menu, 6, R.string.view_conversation_media);
        C2JA.A00(menu, 7, R.string.search);
        C2JA.A00(menu, 4, A01());
        C2JA.A00(menu, 5, R.string.wallpaper);
        SubMenu addSubMenu3 = menu.addSubMenu(0, 1, 0, R.string.more);
        addSubMenu3.clearHeader();
        addSubMenu3.clearHeader();
        C2JA.A00(addSubMenu3, 9, R.string.report_spam);
        C2JA.A00(addSubMenu3, 23, R.string.block);
        C2JA.A00(addSubMenu3, 24, R.string.unblock);
        C2JA.A00(addSubMenu3, 8, R.string.clear_chat);
        A02(addSubMenu3);
        C2JA.A00(addSubMenu3, 2, R.string.add_shortcut_short);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
        if (r10.A00.A0B() == false) goto L21;
     */
    @Override // X.C2JA, X.InterfaceC06230Sb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean AMZ(android.view.MenuItem r11) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3JF.AMZ(android.view.MenuItem):boolean");
    }

    @Override // X.C2JA, X.InterfaceC06230Sb
    public boolean ANF(Menu menu) {
        StringBuilder A0P = C000200d.A0P("contactconversationmenu/onprepareoptionsmenu ");
        A0P.append(menu.size());
        Log.i(A0P.toString());
        if (menu.size() == 0) {
            return false;
        }
        A03(menu.findItem(4));
        AbstractC005302j abstractC005302j = this.A0P;
        if (!C003101m.A0Y(abstractC005302j)) {
            menu.findItem(21).setVisible(super.A00.A08 != null);
            menu.findItem(22).setVisible(super.A00.A08 == null);
            boolean A0H = this.A06.A0H(UserJid.of(abstractC005302j));
            menu.findItem(23).setVisible(!A0H);
            menu.findItem(24).setVisible(A0H);
        }
        super.ANF(menu);
        return true;
    }
}
