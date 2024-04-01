package X;

import android.content.ClipData;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2KV */
/* loaded from: classes2.dex */
public abstract class C2KV implements C0O8 {
    public MenuItem A00;
    public MenuItem A01;
    public MenuItem A02;
    public MenuItem A03;
    public MenuItem A04;
    public MenuItem A05;
    public MenuItem A06;
    public MenuItem A07;
    public MenuItem A08;
    public MenuItem A09;
    public MenuItem A0A;
    public MenuItem A0B;
    public MenuItem A0C;
    public MenuItem A0D;
    public MenuItem A0E;
    public final ActivityC02320As A0F;
    public final C018308n A0G;
    public final C018508q A0H;
    public final C02L A0I;
    public final C01B A0J;
    public final C018608r A0K;
    public final C41541u6 A0L;
    public final C05W A0M;
    public final C018708s A0N;
    public final C52922bZ A0O = new C52922bZ();
    public final C02E A0P;
    public final C002301c A0Q;
    public final C0C8 A0R;
    public final C43081wp A0S;
    public final C0ED A0T;
    public final AnonymousClass011 A0U;
    public final C0ES A0V;
    public final C41771uU A0W;
    public final C42451vl A0X;
    public final C02980Dr A0Y;
    public final C02O A0Z;
    public final C2MN A0a;
    public final C2AR A0b;
    public final C2M4 A0c;
    public final C2AT A0d;
    public final C2MG A0e;
    public final InterfaceC002901k A0f;

    public C2KV(ActivityC02320As activityC02320As, C018508q c018508q, C02980Dr c02980Dr, C2M4 c2m4, C02L c02l, InterfaceC002901k interfaceC002901k, C2MG c2mg, AnonymousClass011 anonymousClass011, C01B c01b, C41541u6 c41541u6, C018608r c018608r, C2MN c2mn, C018308n c018308n, C05W c05w, C0ED c0ed, C02E c02e, C018708s c018708s, C002301c c002301c, C0ES c0es, C2AR c2ar, C2AT c2at, C43081wp c43081wp, C42451vl c42451vl, C41771uU c41771uU, C0C8 c0c8, C02O c02o) {
        this.A0F = activityC02320As;
        this.A0H = c018508q;
        this.A0Y = c02980Dr;
        this.A0c = c2m4;
        this.A0I = c02l;
        this.A0f = interfaceC002901k;
        this.A0e = c2mg;
        this.A0U = anonymousClass011;
        this.A0J = c01b;
        this.A0L = c41541u6;
        this.A0K = c018608r;
        this.A0a = c2mn;
        this.A0G = c018308n;
        this.A0M = c05w;
        this.A0T = c0ed;
        this.A0P = c02e;
        this.A0N = c018708s;
        this.A0Q = c002301c;
        this.A0V = c0es;
        this.A0b = c2ar;
        this.A0d = c2at;
        this.A0S = c43081wp;
        this.A0X = c42451vl;
        this.A0W = c41771uU;
        this.A0R = c0c8;
        this.A0Z = c02o;
    }

    public static void A00(Collection collection, Context context, C018508q c018508q, C02980Dr c02980Dr, C02L c02l, C05W c05w, C002301c c002301c, C02E c02e, C018708s c018708s, C02O c02o) {
        String A0G;
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
            if (anonymousClass092.A11() && anonymousClass092.A0D().A00 != null) {
                A0G = C40731sm.A0U(anonymousClass092.A0G(), anonymousClass092.A0D().A00);
            } else {
                byte b = anonymousClass092.A0m;
                if (b != 0 && b != 32 && b != 46) {
                    if (anonymousClass092 instanceof AnonymousClass097) {
                        A0G = ((AnonymousClass097) anonymousClass092).A1A();
                    } else if (anonymousClass092 instanceof C1MI) {
                        A0G = ((C1MI) anonymousClass092).A1E();
                    } else {
                        A0G = null;
                        if (anonymousClass092 instanceof C0LU) {
                            C0LU c0lu = (C0LU) anonymousClass092;
                            A0G = "";
                            if (!TextUtils.isEmpty(c0lu.A1A())) {
                                StringBuilder A0P = C000200d.A0P("");
                                A0P.append(c0lu.A1A());
                                A0G = A0P.toString();
                            }
                            if (!TextUtils.isEmpty(c0lu.A18())) {
                                if (A0G.length() > 0) {
                                    A0G = C000200d.A0H(A0G, "\n");
                                }
                                StringBuilder A0P2 = C000200d.A0P(A0G);
                                A0P2.append(c0lu.A18());
                                A0G = A0P2.toString();
                            }
                            if (!TextUtils.isEmpty(c0lu.A19())) {
                                if (A0G.length() > 0) {
                                    A0G = C000200d.A0H(A0G, "\n");
                                }
                                StringBuilder A0P3 = C000200d.A0P(A0G);
                                A0P3.append(c0lu.A19());
                                A0G = A0P3.toString();
                            }
                        }
                    }
                } else {
                    A0G = anonymousClass092.A0G();
                }
            }
            if (!TextUtils.isEmpty(A0G)) {
                StringBuilder sb3 = new StringBuilder();
                if (sb.length() != 0) {
                    sb3.append('\n');
                }
                if (collection.size() > 1) {
                    sb3.append('[');
                    sb3.append(DateUtils.formatDateTime(context, anonymousClass092.A0E, 655377));
                    sb3.append("] ");
                    if (anonymousClass092.A0n.A02) {
                        sb3.append(c02l.A02());
                    } else {
                        sb3.append(c018708s.A08(c05w.A0A(anonymousClass092.A0B()), false));
                    }
                    sb3.append(": ");
                }
                sb.append((CharSequence) sb3);
                sb2.append((CharSequence) sb3);
                sb2.append(A0G);
                List list = anonymousClass092.A0c;
                if (list != null) {
                    sb.append(c02980Dr.A01(context, A0G, list));
                    hashSet.addAll(anonymousClass092.A0c);
                } else {
                    sb.append(A0G);
                }
            }
        }
        String obj = sb.toString();
        SharedPreferences.Editor edit = c02o.A01(C02M.A02).edit();
        if (!hashSet.isEmpty()) {
            edit.putString("copied_message", obj);
            edit.putString("copied_message_without_mentions", sb2.toString());
            edit.putString("copied_message_jids", AnonymousClass029.A0v(hashSet));
        } else {
            edit.remove("copied_message");
            edit.remove("copied_message_without_mentions");
            edit.remove("copied_message_jids");
        }
        edit.apply();
        try {
            c02e.A06().setPrimaryClip(ClipData.newPlainText(obj, obj));
            if (collection.size() == 1) {
                c018508q.A07(R.string.message_copied, 0);
            } else {
                c018508q.A0E(c002301c.A0A(R.plurals.messages_copied, collection.size(), Integer.valueOf(collection.size())), 0);
            }
        } catch (NullPointerException e) {
            Log.e("conversation/copymessage/npe", e);
            c018508q.A07(R.string.view_contact_unsupport, 0);
        }
    }

    public AnonymousClass092 A01() {
        Map A02 = A02();
        if (A02 != null) {
            return (AnonymousClass092) ((Map.Entry) A02.entrySet().iterator().next()).getValue();
        }
        throw null;
    }

    public Map A02() {
        if (this instanceof C86533xi) {
            return ((C86533xi) this).A00.A0G;
        }
        if (this instanceof C86393xN) {
            return ((C86393xN) this).A00.A0u;
        }
        if (this instanceof C3K9) {
            return ((C3K9) this).A00.A0G;
        }
        return !(this instanceof C68353Jh) ? ((AbstractActivityC04650Lh) ((C68333Jf) this).A00).A0G : ((AbstractActivityC04650Lh) ((C68353Jh) this).A00).A0G;
    }

    public void A03() {
        if (this instanceof C86533xi) {
            C0U0 c0u0 = ((C86533xi) this).A00.A06;
            if (c0u0 != null) {
                c0u0.A05();
            }
        } else if (this instanceof C86393xN) {
            C0U0 c0u02 = ((C86393xN) this).A00.A01;
            if (c0u02 != null) {
                c0u02.A05();
            }
        } else if (this instanceof C3K9) {
            C0U0 c0u03 = ((C3K9) this).A00.A07;
            if (c0u03 != null) {
                c0u03.A05();
            }
        } else if (this instanceof C68353Jh) {
            C0U0 c0u04 = ((AbstractActivityC04650Lh) ((C68353Jh) this).A00).A00;
            if (c0u04 != null) {
                c0u04.A05();
            }
        } else {
            C0U0 c0u05 = ((AbstractActivityC04650Lh) ((C68333Jf) this).A00).A00;
            if (c0u05 != null) {
                c0u05.A05();
            }
        }
    }

    public void A04(Menu menu) {
        boolean z;
        UserJid A01;
        if (this instanceof C86533xi) {
            this.A0C.setVisible(false);
            this.A03.setVisible(false);
            this.A02.setVisible(false);
            this.A06.setVisible(false);
            this.A01.setVisible(false);
            this.A08.setVisible(false);
            this.A0A.setVisible(false);
            this.A0B.setVisible(false);
            this.A07.setVisible(false);
        } else if (this instanceof C86393xN) {
            C86393xN c86393xN = (C86393xN) this;
            boolean z2 = false;
            c86393xN.A0C.setVisible(false);
            c86393xN.A03.setVisible(false);
            c86393xN.A02.setVisible(false);
            c86393xN.A06.setVisible(false);
            c86393xN.A01.setVisible(false);
            c86393xN.A08.setVisible(false);
            ((C2KV) c86393xN).A00.setVisible(false);
            c86393xN.A09.setVisible(false);
            c86393xN.A0A.setVisible(false);
            c86393xN.A0B.setVisible(false);
            MyStatusesActivity myStatusesActivity = c86393xN.A00;
            for (AnonymousClass092 anonymousClass092 : myStatusesActivity.A0u.values()) {
                if (anonymousClass092 instanceof AnonymousClass097) {
                    C09H c09h = ((AnonymousClass097) anonymousClass092).A02;
                    if (c09h != null) {
                        if (c09h == null || !c09h.A0O || c09h.A0a || !c09h.A0P) {
                            z = false;
                            break;
                        }
                    } else {
                        throw null;
                    }
                }
            }
            z = true;
            c86393xN.A0D.setVisible(z);
            MenuItem menuItem = c86393xN.A0E;
            if (z && myStatusesActivity.A0d.A01()) {
                z2 = true;
            }
            menuItem.setVisible(z2);
        } else if (this instanceof C3K9) {
            this.A0C.setVisible(false);
            this.A03.setVisible(false);
            this.A02.setVisible(false);
            this.A06.setVisible(false);
            this.A01.setVisible(false);
            this.A08.setVisible(false);
            this.A0A.setVisible(false);
            this.A0B.setVisible(false);
        } else if (!(this instanceof C68353Jh)) {
            this.A01.setVisible(false);
            this.A08.setVisible(false);
        } else {
            C68353Jh c68353Jh = (C68353Jh) this;
            c68353Jh.A01.setVisible(false);
            c68353Jh.A0A.setVisible(false);
            c68353Jh.A0B.setVisible(false);
            StarredMessagesActivity starredMessagesActivity = c68353Jh.A00;
            C59232sQ c59232sQ = ((AbstractActivityC04650Lh) starredMessagesActivity).A0G;
            if (c59232sQ == null || c59232sQ.size() != 1 || (A01 = C0ES.A01(c68353Jh.A01())) == null || C003101m.A0Y(A01)) {
                return;
            }
            C06C A0A = ((AbstractActivityC04650Lh) starredMessagesActivity).A06.A0A(A01);
            if (A0A.A08 == null) {
                c68353Jh.A01.setVisible(true);
            }
            c68353Jh.A08.setVisible(true);
            c68353Jh.A08.setTitle(starredMessagesActivity.getString(R.string.message_contact_name, starredMessagesActivity.A09.A04(A0A)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:254:0x00f3, code lost:
        if (X.C0DB.A0j(r13, r19.A0J) != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0034  */
    @Override // X.C0O8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean AGv(X.C0U0 r20, android.view.MenuItem r21) {
        /*
            Method dump skipped, instructions count: 1134
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2KV.AGv(X.0U0, android.view.MenuItem):boolean");
    }

    @Override // X.C0O8
    public boolean AJ5(C0U0 c0u0, Menu menu) {
        this.A0A = menu.add(0, R.id.menuitem_reply, 0, R.string.notification_quick_reply).setIcon(R.drawable.ic_action_reply);
        this.A00 = menu.add(0, R.id.menuitem_star, 0, R.string.add_star).setIcon(R.drawable.ic_action_star);
        this.A09 = menu.add(0, R.id.menuitem_unstar, 0, R.string.remove_star).setIcon(R.drawable.ic_action_unstar);
        this.A06 = menu.add(0, R.id.menuitem_details, 0, R.string.info).setIcon(R.drawable.ic_action_info);
        this.A05 = menu.add(0, R.id.menuitem_delete, 0, R.string.delete).setIcon(R.drawable.ic_action_delete);
        this.A04 = menu.add(0, R.id.menuitem_copy, 0, R.string.copy).setIcon(R.drawable.ic_action_copy);
        this.A0C = menu.add(0, R.id.menuitem_share, 0, R.string.share).setIcon(R.drawable.ic_action_share);
        this.A03 = menu.add(0, R.id.menuitem_cancel_upload, 0, R.string.cancel).setIcon(R.drawable.ic_action_cancel);
        this.A02 = menu.add(0, R.id.menuitem_cancel_download, 0, R.string.cancel).setIcon(R.drawable.ic_action_cancel);
        this.A07 = menu.add(0, R.id.menuitem_forward, 0, R.string.conversation_menu_forward).setIcon(R.drawable.ic_action_forward);
        this.A0B = menu.add(0, R.id.menuitem_reply_privately, 0, R.string.reply_privately);
        this.A01 = menu.add(0, R.id.menuitem_add_to_contacts, 0, R.string.add_contact);
        this.A08 = menu.add(0, R.id.menuitem_message_contact, 0, R.string.message_contact_name);
        this.A0D = menu.add(0, R.id.menuitem_share_third_party, 0, R.string.menuitem_status_share);
        this.A0E = menu.add(0, R.id.menuitem_share_cross, 0, R.string.menuitem_status_share_with_fb);
        C52922bZ c52922bZ = this.A0O;
        c52922bZ.A00(R.id.menuitem_reply_privately);
        c52922bZ.A00(R.id.menuitem_add_to_contacts);
        c52922bZ.A00(R.id.menuitem_message_contact);
        c52922bZ.A00(R.id.menuitem_share_third_party);
        c52922bZ.A00(R.id.menuitem_share_cross);
        Set set = c52922bZ.A01;
        set.add(Integer.valueOf((int) R.id.menuitem_forward));
        set.add(Integer.valueOf((int) R.id.menuitem_delete));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x00dc, code lost:
        if (r1.A02 != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0103, code lost:
        if (X.C0D6.A00(r4.A08, 4) < 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0195, code lost:
        if (r10 != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x01a0, code lost:
        if (r10 != false) goto L141;
     */
    @Override // X.C0O8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean ANE(X.C0U0 r13, android.view.Menu r14) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2KV.ANE(X.0U0, android.view.Menu):boolean");
    }
}
