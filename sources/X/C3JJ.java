package X;

import android.content.DialogInterface;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.JoinableEducationDialogFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3JJ  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3JJ extends C2JA {
    public final C05W A00;
    public final C000500h A01;
    public final C0C8 A02;
    public final C00B A03;
    public final C011005l A04;
    public final C22I A05;

    public C3JJ(ActivityC02320As activityC02320As, C0B5 c0b5, C0M0 c0m0, C018508q c018508q, C02L c02l, InterfaceC002901k interfaceC002901k, C05M c05m, C2MG c2mg, C01B c01b, C018608r c018608r, C0L6 c0l6, C05W c05w, C018708s c018708s, C002301c c002301c, C22I c22i, C1M7 c1m7, C03300Fd c03300Fd, AnonymousClass008 anonymousClass008, C2AR c2ar, C0CB c0cb, C000400f c000400f, C0L8 c0l8, C03320Ff c03320Ff, C00B c00b, C43081wp c43081wp, C000500h c000500h, C2MW c2mw, C41711uO c41711uO, C2MZ c2mz, C0C8 c0c8, C0DK c0dk, C03360Fk c03360Fk, C011005l c011005l, C06C c06c) {
        super(activityC02320As, c0b5, c0m0, c018508q, c02l, interfaceC002901k, c05m, c2mg, c01b, c018608r, c0l6, c002301c, c1m7, c03300Fd, anonymousClass008, c2ar, c0cb, c000400f, c0l8, c03320Ff, c000500h, c2mw, c41711uO, c2mz, c0dk, c03360Fk, c011005l, c06c);
        this.A00 = c05w;
        this.A05 = c22i;
        this.A03 = c00b;
        this.A01 = c000500h;
        this.A02 = c0c8;
        this.A04 = c011005l;
    }

    public final void A05() {
        C0C8 c0c8 = this.A02;
        C011005l c011005l = this.A04;
        ArrayList arrayList = new ArrayList(c0c8.A01(c011005l).A04().A02());
        C02L c02l = super.A05;
        c02l.A05();
        arrayList.remove(c02l.A03);
        AnonymousClass029.A1E(this.A00, c011005l, arrayList, null, super.A02, true, 24);
    }

    public final boolean A06() {
        C04250Jl c04250Jl;
        if (C0L6.A02() || ((Conversation) this.A0E).A2T() || (super.A00.A0Q && !this.A02.A06(this.A04))) {
            return false;
        }
        C07D A04 = this.A02.A01(this.A04).A04();
        Set set = A04.A00;
        if (set.size() == 1) {
            C02L c02l = super.A05;
            c02l.A05();
            if (set.contains(c02l.A03)) {
                return false;
            }
        }
        int size = set.size();
        C01B c01b = this.A06;
        if (size <= Math.min(c01b.A07(C01C.A34), c01b.A07(C01C.A3c))) {
            return true;
        }
        Iterator it = A04.iterator();
        do {
            c04250Jl = (C04250Jl) it;
            if (!c04250Jl.hasNext()) {
                return false;
            }
        } while (!this.A00.A0R((UserJid) c04250Jl.next()));
        return true;
    }

    @Override // X.InterfaceC06230Sb
    public void AJ9(Menu menu) {
        Log.i("groupconversationmenu/oncreateoptionsmenu");
        C0C8 c0c8 = this.A02;
        C011005l c011005l = this.A04;
        if (c0c8.A05(c011005l) && !super.A00.A0S) {
            C01B c01b = this.A06;
            if (c01b.A0E(C01C.A10) && c0c8.A01(c011005l).A01.size() <= Math.min(c01b.A07(C01C.A34), c01b.A07(C01C.A3c))) {
                boolean A06 = A06();
                MenuItem A00 = C2JA.A00(menu, 26, R.string.video_call);
                A00.setActionView(R.layout.video_call_menu_item);
                A04(A00, R.string.video_call, A06);
                MenuItem A002 = C2JA.A00(menu, 25, R.string.audio_call);
                A002.setActionView(R.layout.audio_call_menu_item);
                A002.getActionView().setContentDescription(super.A02.getString(R.string.audio_call));
                A04(A002, R.string.audio_call, A06);
                A00.setShowAsAction(2);
                A002.setShowAsAction(2);
            } else {
                boolean A062 = A06();
                MenuItem A003 = C2JA.A00(menu, 24, R.string.group_call);
                A003.setActionView(R.layout.group_call_menu_item);
                A04(A003, R.string.group_call, A062);
                A003.setShowAsAction(2);
            }
        }
        C2JA.A00(menu, 21, R.string.group_info);
        C2JA.A00(menu, 6, R.string.view_group_media);
        C2JA.A00(menu, 7, R.string.search);
        C2JA.A00(menu, 4, A01());
        C2JA.A00(menu, 5, R.string.wallpaper);
        SubMenu addSubMenu = menu.addSubMenu(0, 1, 0, R.string.more);
        addSubMenu.clearHeader();
        C2JA.A00(addSubMenu, 9, R.string.report_spam);
        C2JA.A00(addSubMenu, 23, R.string.exit_group);
        C2JA.A00(addSubMenu, 8, R.string.clear_chat);
        A02(addSubMenu);
        C2JA.A00(addSubMenu, 2, R.string.add_shortcut_short);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C2JA, X.InterfaceC06230Sb
    public boolean AMZ(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 21:
                C06C c06c = super.A00;
                ActivityC02320As activityC02320As = super.A02;
                GroupChatInfo.A01(c06c, activityC02320As, C2HC.A04(activityC02320As, activityC02320As.findViewById(R.id.transition_start), this.A09.A00(R.string.transition_photo)));
                return true;
            case 22:
                break;
            case 23:
                C0B5 c0b5 = super.A03;
                c0b5.AUr(0, R.string.register_wait_message);
                this.A05.A06(this.A0P);
                this.A0U.ARy(new C66713Cd(c0b5, this.A03, this.A04), new Object[0]);
                break;
            case 24:
                C01B c01b = this.A06;
                C000500h c000500h = this.A01;
                if (AnonymousClass029.A1P(c01b, c000500h)) {
                    JoinableEducationDialogFragment A00 = JoinableEducationDialogFragment.A00(false, new DialogInterface.OnDismissListener() { // from class: X.2qs
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            C3JJ.this.A05();
                        }
                    });
                    AbstractC02800Cx A0N = super.A02.A0N();
                    if (A0N != null) {
                        C02820Cz c02820Cz = new C02820Cz(A0N);
                        c02820Cz.A09(0, A00, null, 1);
                        c02820Cz.A05();
                        c000500h.A0N();
                        return true;
                    }
                    throw null;
                }
                A05();
                return true;
            case 25:
                ((Conversation) this.A0E).A2G(super.A00, false);
                return true;
            case 26:
                ((Conversation) this.A0E).A2G(super.A00, true);
                return true;
            default:
                return super.AMZ(menuItem);
        }
        return true;
    }

    @Override // X.C2JA, X.InterfaceC06230Sb
    public boolean ANF(Menu menu) {
        StringBuilder A0P = C000200d.A0P("groupconversationmenu/onprepareoptionsmenu ");
        A0P.append(menu.size());
        Log.i(A0P.toString());
        if (menu.size() == 0) {
            return false;
        }
        A03(menu.findItem(4));
        menu.findItem(1).getSubMenu().findItem(23).setVisible(this.A02.A05(this.A04));
        super.ANF(menu);
        return true;
    }
}
