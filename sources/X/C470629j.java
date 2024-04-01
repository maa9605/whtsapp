package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.ContextMenu;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import com.whatsapp.MuteDialogFragment;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfo;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.Collections;

/* renamed from: X.29j  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C470629j implements InterfaceC04730Lp {
    public AbstractC005302j A00;
    public WeakReference A01;
    public WeakReference A02;
    public final int A03;
    public final C018508q A04;
    public final C01B A05;
    public final C018608r A06;
    public final C0L8 A07;
    public final C06K A08;
    public final C05W A09;
    public final C41321tj A0A;
    public final C41221tZ A0B;
    public final C470729k A0C;
    public final AnonymousClass012 A0D;
    public final C000500h A0E;
    public final C002301c A0F;
    public final C41181tV A0G;
    public final C05M A0H;
    public final C0C8 A0I;
    public final C0ES A0J;
    public final C40301ry A0K;
    public final C0CB A0L;
    public final C2AR A0M;
    public final C2MG A0N;
    public final C52762bH A0O;
    public final C2MS A0P;
    public final C2MZ A0Q;
    public final InterfaceC002901k A0R;

    @Override // X.InterfaceC04730Lp
    public void AKm() {
    }

    @Override // X.InterfaceC04730Lp
    public void AKn() {
    }

    public C470629j(Context context, AbstractC02800Cx abstractC02800Cx, AnonymousClass012 anonymousClass012, C018508q c018508q, InterfaceC002901k interfaceC002901k, C05M c05m, C2MG c2mg, C41181tV c41181tV, C01B c01b, C018608r c018608r, C05W c05w, C002301c c002301c, C0ES c0es, C2AR c2ar, C52762bH c52762bH, C0CB c0cb, C0L8 c0l8, C2MS c2ms, C41321tj c41321tj, C40301ry c40301ry, C000500h c000500h, C06K c06k, C41221tZ c41221tZ, C2MZ c2mz, C0C8 c0c8, C470729k c470729k, int i) {
        this.A01 = new WeakReference(context);
        this.A02 = new WeakReference(abstractC02800Cx);
        this.A0D = anonymousClass012;
        this.A04 = c018508q;
        this.A0R = interfaceC002901k;
        this.A0H = c05m;
        this.A0N = c2mg;
        this.A0G = c41181tV;
        this.A05 = c01b;
        this.A06 = c018608r;
        this.A09 = c05w;
        this.A0F = c002301c;
        this.A0J = c0es;
        this.A0M = c2ar;
        this.A0O = c52762bH;
        this.A0L = c0cb;
        this.A07 = c0l8;
        this.A0P = c2ms;
        this.A0A = c41321tj;
        this.A0K = c40301ry;
        this.A0E = c000500h;
        this.A08 = c06k;
        this.A0B = c41221tZ;
        this.A0Q = c2mz;
        this.A0I = c0c8;
        this.A0C = c470729k;
        this.A03 = i;
    }

    public void A00(ContextMenu contextMenu, AbstractC005302j abstractC005302j, boolean z, boolean z2) {
        Context context = (Context) this.A01.get();
        if (context == null) {
            return;
        }
        this.A00 = abstractC005302j;
        C06C A0A = this.A09.A0A(abstractC005302j);
        if (C003101m.A0a(abstractC005302j)) {
            C0ES c0es = this.A0J;
            if (!(abstractC005302j instanceof C05160No)) {
                abstractC005302j = null;
            }
            if (c0es.A0l.contains(abstractC005302j)) {
                return;
            }
            contextMenu.add(0, R.id.menuitem_conversations_delete, 0, R.string.delete_group);
            return;
        }
        boolean A0P = C003101m.A0P(abstractC005302j);
        if (!A0P) {
            contextMenu.add(0, R.id.menuitem_conversations_create_shortcuit, 0, R.string.add_shortcut);
        }
        if (A0A.A08 == null) {
            if (C003101m.A0U(abstractC005302j)) {
                contextMenu.add(0, R.id.menuitem_conversations_group_info, 0, R.string.group_info);
            } else if (A0P) {
                contextMenu.add(0, R.id.menuitem_conversations_group_info, 0, R.string.list_info);
            } else {
                contextMenu.add(0, R.id.menuitem_conversations_add_new_contact, 0, R.string.add_contact);
                contextMenu.add(0, R.id.menuitem_conversations_add_to_existing_contact, 0, R.string.add_exist);
            }
        } else {
            contextMenu.add(0, R.id.menuitem_conversations_contact_info, 0, R.string.view_contact);
        }
        if (C003101m.A0U(abstractC005302j)) {
            C0C8 c0c8 = this.A0I;
            C011005l A03 = C011005l.A03(abstractC005302j);
            if (A03 != null) {
                boolean A0B = c0c8.A01(A03).A0B(c0c8.A01);
                int i = R.string.delete_group;
                if (A0B) {
                    i = R.string.exit_group;
                }
                contextMenu.add(0, R.id.menuitem_conversations_delete, 0, i);
            } else {
                throw null;
            }
        } else if (A0P) {
            contextMenu.add(0, R.id.menuitem_conversations_delete, 0, R.string.delete_list);
        } else {
            contextMenu.add(0, R.id.menuitem_conversations_delete, 0, R.string.delete_chat);
        }
        C05M c05m = this.A0H;
        if (c05m.A0F(abstractC005302j)) {
            if (A0P) {
                contextMenu.add(0, R.id.menuitem_conversations_unarchive, 0, context.getString(R.string.unarchive_broadcast));
            } else {
                contextMenu.add(0, R.id.menuitem_conversations_unarchive, 0, context.getString(R.string.unarchive_conversation));
            }
        } else if (A0P) {
            contextMenu.add(0, R.id.menuitem_conversations_archive, 0, context.getString(R.string.archive_broadcast));
        } else {
            contextMenu.add(0, R.id.menuitem_conversations_archive, 0, context.getString(R.string.archive_conversation));
        }
        if (z2) {
            C01B c01b = this.A05;
            C000500h c000500h = this.A0E;
            boolean A0O = C23X.A0O(abstractC005302j, c05m, c01b, c000500h);
            if (!this.A0L.A07(abstractC005302j).A09() && !A0O) {
                contextMenu.add(0, R.id.menuitem_conversations_mute, 0, R.string.menuitem_mute_notifications);
            } else {
                SpannableString spannableString = new SpannableString(context.getString(R.string.menuitem_unmute_notifications));
                if (C23X.A0O(abstractC005302j, c05m, c01b, c000500h)) {
                    spannableString.setSpan(new ForegroundColorSpan(C02160Ac.A00(context, R.color.list_item_disabled)), 0, spannableString.length(), 0);
                }
                contextMenu.add(0, R.id.menuitem_conversations_unmute, 0, spannableString);
            }
        }
        if (!c05m.A0F(abstractC005302j) && z) {
            if (this.A0L.A07(abstractC005302j).A0E) {
                contextMenu.add(0, R.id.menuitem_conversations_unpin, 0, R.string.menuitem_unpin);
            } else {
                contextMenu.add(0, R.id.menuitem_conversations_pin, 0, R.string.menuitem_pin);
            }
        }
        if (c05m.A01(abstractC005302j) != 0) {
            contextMenu.add(0, R.id.menuitem_conversations_mark_read, 0, R.string.mark_read);
        } else {
            contextMenu.add(0, R.id.menuitem_conversations_mark_unread, 0, R.string.mark_unread);
        }
    }

    public boolean A01(int i) {
        UserJid userJid;
        if (this.A00 != null && i == this.A03) {
            this.A0A.A06();
            C06C A0A = this.A09.A0A(this.A00);
            if (A0A.A0B() && (userJid = (UserJid) A0A.A03(UserJid.class)) != null) {
                this.A08.A01(userJid, null).A00(this);
            }
            this.A0O.A00();
            return true;
        }
        return false;
    }

    public boolean A02(ActivityC02330At activityC02330At, C0BA c0ba, MenuItem menuItem) {
        final AbstractC02800Cx abstractC02800Cx = (AbstractC02800Cx) this.A02.get();
        WeakReference weakReference = this.A01;
        weakReference.get();
        if (weakReference != null && abstractC02800Cx != null && this.A00 != null) {
            if (menuItem.getItemId() == R.id.menuitem_conversations_contact_info) {
                C06C A0A = this.A09.A0A(this.A00);
                if (A0A.A08 != null) {
                    ContactInfoActivity.A03(A0A, activityC02330At, null);
                }
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_delete) {
                this.A0Q.A06(activityC02330At).A01.A03(new C0CG() { // from class: X.39l
                    @Override // X.C0CG
                    public final void A54(Object obj) {
                        C470629j c470629j = C470629j.this;
                        AbstractC02800Cx abstractC02800Cx2 = abstractC02800Cx;
                        C470729k c470729k = c470629j.A0C;
                        AbstractC005302j abstractC005302j = c470629j.A00;
                        c470729k.A0C.A07(new C52932ba(c470729k, abstractC02800Cx2, abstractC005302j), abstractC005302j);
                    }
                }, null);
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_add_new_contact) {
                Intent A01 = this.A0P.A01(this.A09.A0A(this.A00), this.A00, true);
                if (activityC02330At != null) {
                    A01.setComponent(A01.resolveActivity(activityC02330At.getPackageManager()));
                    if (A01.getComponent() != null) {
                        c0ba.A0O(A01, this.A03, null);
                        this.A0O.A02(true, 7);
                        return true;
                    }
                    Log.w("conversations/context system contact list could not found");
                    this.A04.A07(R.string.unimplemented, 0);
                    return true;
                }
                throw null;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_add_to_existing_contact) {
                try {
                    c0ba.A0O(this.A0P.A01(this.A09.A0A(this.A00), this.A00, false), this.A03, null);
                    this.A0O.A02(false, 7);
                    return true;
                } catch (ActivityNotFoundException unused) {
                    this.A04.A07(R.string.activity_not_found, 0);
                    return true;
                }
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_pin) {
                if (((AbstractCollection) this.A0L.A0F()).size() + 1 > 3) {
                    this.A04.A0E(this.A0F.A0A(R.plurals.cannot_pin, 3L, 3), 0);
                    return true;
                }
                this.A0R.AS1(new RunnableEBaseShape2S0100000_I0_2(this, 23));
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_unpin) {
                this.A0R.AS1(new RunnableEBaseShape2S0100000_I0_2(this, 22));
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_mute) {
                MuteDialogFragment.A01(Collections.singleton(this.A00)).A14(abstractC02800Cx, null);
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_unmute) {
                if (!C23X.A0O(this.A00, this.A0H, this.A05, this.A0E)) {
                    this.A0R.AS1(new RunnableEBaseShape2S0100000_I0_2(this, 21));
                    return true;
                } else if (activityC02330At == null) {
                    this.A04.A07(R.string.archived_chats_stay_muted, 0);
                    return true;
                } else {
                    C23X.A0H(activityC02330At, this.A06, activityC02330At.findViewById(R.id.result_list), this.A00);
                    return true;
                }
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_archive) {
                C470729k c470729k = this.A0C;
                AbstractC005302j abstractC005302j = this.A00;
                c470729k.A06.A05(abstractC005302j, true);
                c470729k.A0A.A01(3, abstractC005302j, 0L, 0);
                c470729k.A0D.AS1(new RunnableEBaseShape1S0200000_I0_1(c470729k, abstractC005302j, 28));
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_unarchive) {
                C470729k c470729k2 = this.A0C;
                AbstractC005302j abstractC005302j2 = this.A00;
                c470729k2.A06.A05(abstractC005302j2, false);
                c470729k2.A0A.A01(4, abstractC005302j2, 0L, 0);
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_mark_read) {
                this.A0B.A03(this.A00, true, true);
                this.A0K.A04();
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_mark_unread) {
                this.A0B.A01(this.A00, true);
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_create_shortcuit) {
                this.A07.A06(this.A09.A0A(this.A00));
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_group_info) {
                C06C A0A2 = this.A09.A0A(this.A00);
                if (!A0A2.A0D()) {
                    GroupChatInfo.A01(A0A2, activityC02330At, null);
                    return true;
                } else if (activityC02330At != null) {
                    ListChatInfo.A01(A0A2, activityC02330At, null);
                    return true;
                } else {
                    throw null;
                }
            }
        }
        return false;
    }
}
