package X;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape0S0400000_I0;
import com.whatsapp.util.ViewOnClickCListenerShape3S0200000_I0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: X.23X */
/* loaded from: classes2.dex */
public class C23X {
    public static int A00(int i, List list, List list2, List list3) {
        if (i < 0) {
            return 0;
        }
        if (i >= list.size()) {
            return list2.size() - 1;
        }
        for (int size = list3.size() - 1; size >= 0; size--) {
            if (((Number) list3.get(size)).intValue() <= i) {
                return size;
            }
        }
        return 0;
    }

    public static int A01(C000500h c000500h, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return c000500h.A00.getInt("autodownload_roaming_mask", 0);
                    }
                    throw new IllegalArgumentException("network_type not valid");
                }
                return c000500h.A00.getInt("autodownload_cellular_mask", 1);
            }
            return c000500h.A00.getInt("autodownload_wifi_mask", 15);
        }
        return 0;
    }

    public static int A02(C41771uU c41771uU, ProgressBar progressBar, AnonymousClass097 anonymousClass097) {
        C09H c09h = anonymousClass097.A02;
        if (c09h != null) {
            boolean z = false;
            if (c09h.A0a && !c09h.A0Y) {
                progressBar.setVisibility(0);
                long j = c09h.A0C;
                progressBar.setIndeterminate((j == 0 || j == 100) ? true : true);
                int i = (int) c09h.A0C;
                if (c41771uU.A09(anonymousClass097)) {
                    i >>= 1;
                    if (c41771uU.A0A(anonymousClass097)) {
                        i += 50;
                    }
                }
                progressBar.setProgress(i);
                return i;
            }
            progressBar.setVisibility(8);
            return 0;
        }
        throw null;
    }

    public static int A03(C09E c09e, C42461vm c42461vm, C018508q c018508q, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C01B c01b, C018308n c018308n, C40421sE c40421sE, ActivityC02290Ap activityC02290Ap, C02F c02f) {
        if (RequestPermissionActivity.A0Q(activityC02290Ap, c02f)) {
            C09H c09h = ((AnonymousClass097) c09e).A02;
            if (c09h != null) {
                if (c09e.A0n.A02 || c09h.A0P) {
                    File file = c09h.A0F;
                    if (file == null || !file.exists()) {
                        return 2;
                    }
                    C460324r.A0A(c42461vm, c018508q, abstractC000600i, interfaceC002901k, c40421sE, activityC02290Ap, c09e, c018308n);
                    return 3;
                }
                return 1;
            }
            throw null;
        }
        return 0;
    }

    public static Drawable A04(C09G c09g, Context context) {
        boolean z = c09g.A0n.A02;
        int i = ((AnonymousClass092) c09g).A08;
        if (z) {
            if (i == 8) {
                return C02180Ae.A0O(context, R.drawable.msg_status_mic, R.color.msgStatusReadTint);
            }
            return C02180Ae.A0O(context, R.drawable.msg_status_mic, R.color.msgStatusTint);
        } else if (i != 9 && i != 10) {
            return C02180Ae.A0O(context, R.drawable.msg_status_mic, R.color.msgStatusUnplayedTint);
        } else {
            return C02180Ae.A0O(context, R.drawable.msg_status_mic, R.color.msgStatusReadTint);
        }
    }

    public static Pair A05(List list, C002301c c002301c) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        String str = "";
        for (int i = 0; i < size; i++) {
            C06C A93 = ((InterfaceC54742jH) list.get(i)).A93();
            if (A93 != null) {
                String str2 = A93.A0F;
                if (!TextUtils.isEmpty(str2)) {
                    String upperCase = AnonymousClass024.A0K(str2, 1).toUpperCase(c002301c.A0I());
                    upperCase = (Character.isDigit(upperCase.codePointAt(0)) || "+".equals(upperCase)) ? "#" : "#";
                    if (!str.equals(upperCase)) {
                        arrayList.add(upperCase);
                        arrayList2.add(Integer.valueOf(i));
                        str = upperCase;
                    }
                }
            }
        }
        return new Pair(arrayList, arrayList2);
    }

    public static View.OnClickListener A06(final C0KC c0kc, boolean z, final Context context, final C02L c02l, final C41471ty c41471ty) {
        final UserJid A0B = c0kc.A0B();
        UserJid userJid = A0B;
        if (c0kc.A0n.A02) {
            userJid = null;
        }
        if (z) {
            return new ViewOnClickCListenerShape0S0400000_I0(context, userJid, c41471ty, c0kc, 1);
        }
        return new AbstractView$OnClickListenerC49532Ky() { // from class: X.38Z
            @Override // X.AbstractView$OnClickListenerC49532Ky
            public void A00(View view) {
                Class cls;
                UserJid userJid2;
                C0KC c0kc2 = c0kc;
                C0K0 c0k0 = c0kc2.A02;
                if (c0k0 == null) {
                    if (c0kc2.A0n.A02) {
                        C02L c02l2 = c02l;
                        c02l2.A05();
                        C0K1 c0k1 = c02l2.A01;
                        if (c0k1 != null) {
                            userJid2 = (UserJid) c0k1.A09;
                        } else {
                            throw null;
                        }
                    } else {
                        userJid2 = A0B;
                    }
                    if (userJid2 != null) {
                        c0k0 = new C0K0(userJid2);
                        c0k0.A05 = c0kc2.A0E;
                        c0k0.A00 = ((C0KD) c0kc2).A00;
                        c0k0.A01 = ((C0KD) c0kc2).A01;
                    } else {
                        throw null;
                    }
                }
                C41471ty c41471ty2 = c41471ty;
                Context context2 = context;
                AbstractC005302j abstractC005302j = c0kc2.A0n.A00;
                if (abstractC005302j != null) {
                    if (c41471ty2.A07(context2)) {
                        cls = GroupChatLiveLocationsActivity2.class;
                    } else {
                        cls = GroupChatLiveLocationsActivity.class;
                    }
                    Intent intent = new Intent(context2, cls);
                    intent.putExtra("jid", abstractC005302j.getRawString());
                    intent.putExtra("final_location_jid", c0k0.A06.getRawString());
                    intent.putExtra("final_location_timestamp", c0k0.A05);
                    intent.putExtra("final_location_latitude", c0k0.A00);
                    intent.putExtra("final_location_longitude", c0k0.A01);
                    context2.startActivity(intent);
                    return;
                }
                throw null;
            }
        };
    }

    public static AbstractC005302j A07(AnonymousClass092 anonymousClass092, C06C c06c) {
        int i;
        if (anonymousClass092 != null) {
            if ((c06c.A0C() || c06c.A0D()) && (i = anonymousClass092.A08) != 6) {
                AbstractC005302j A0A = anonymousClass092.A0A();
                if (A0A != null && (!anonymousClass092.A0n.A02 || i == 6)) {
                    return A0A;
                }
                if (anonymousClass092.A0n.A02) {
                    return null;
                }
                StringBuilder A0P = C000200d.A0P("conversations_row/missing_rmt_src:");
                A0P.append(C0DB.A08(anonymousClass092));
                Log.e(A0P.toString());
                return null;
            }
            return null;
        }
        return null;
    }

    public static CharSequence A08(C06C c06c, boolean z, C02L c02l, C018708s c018708s, C002301c c002301c) {
        String A06;
        Jid A02;
        if (z) {
            A06 = c002301c.A06(R.string.group_subject_changed_you_pronoun);
        } else if (c06c != null && (A02 = c06c.A02()) != null && !c02l.A0A(A02)) {
            A06 = c018708s.A04(c06c);
        } else {
            A06 = "";
        }
        if (TextUtils.isEmpty(A06)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) A06);
        sb.append(": ");
        String obj = sb.toString();
        if (c002301c.A0M()) {
            return TextUtils.concat("\u200e", obj, String.valueOf((char) 8206));
        }
        return TextUtils.concat("\u200f", obj, String.valueOf((char) 8207));
    }

    public static CharSequence A09(CharSequence charSequence, C06C c06c, boolean z, C02L c02l, C018708s c018708s, C002301c c002301c) {
        CharSequence A08 = A08(c06c, z, c02l, c018708s, c002301c);
        if (!TextUtils.isEmpty(A08)) {
            if (C0LX.A0D(charSequence)) {
                return TextUtils.concat(A08, "\u200e", charSequence, String.valueOf((char) 8206));
            }
            return TextUtils.concat(A08, "\u200f", charSequence, String.valueOf((char) 8207));
        }
        return charSequence;
    }

    public static CharSequence A0A(CharSequence charSequence, CharSequence charSequence2) {
        if (TextUtils.isEmpty(charSequence2)) {
            return charSequence;
        }
        if (C0LX.A0D(charSequence2)) {
            return TextUtils.concat(charSequence, "\u200e", charSequence2, String.valueOf((char) 8206));
        }
        return TextUtils.concat(charSequence, "\u200f", charSequence2, String.valueOf((char) 8207));
    }

    public static Integer A0B(C02E c02e, C02F c02f) {
        int A02 = c02f.A02("android.permission.READ_CONTACTS");
        Integer num = null;
        if (A02 != 0) {
            Log.i("phonebook/getCount/permission_denied");
            return null;
        }
        Cursor A00 = C29U.A00(c02e, "phonebook/get_count/");
        if (A00 != null) {
            try {
                num = Integer.valueOf(A00.getCount());
            } finally {
            }
        }
        if (A00 != null) {
        }
        return num;
    }

    public static String A0C(Context context, C09G c09g, AnonymousClass012 anonymousClass012, C05W c05w, C018708s c018708s, C002301c c002301c) {
        String A0i = AnonymousClass029.A0i(c002301c, Math.max(0, ((AnonymousClass097) c09g).A00 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
        String A00 = AbstractC40621sZ.A00(c002301c, anonymousClass012.A06(c09g.A0E));
        boolean z = ((AnonymousClass092) c09g).A04 == 1;
        if (c09g.A0n.A02) {
            int i = ((AnonymousClass092) c09g).A08;
            if (i == 1) {
                int i2 = R.string.audio_message_description_sent_pending;
                if (z) {
                    i2 = R.string.voice_message_description_sent_pending;
                }
                return context.getString(i2, A0i, A00);
            } else if (i == 5) {
                int i3 = R.string.audio_message_description_sent_delivered;
                if (z) {
                    i3 = R.string.voice_message_description_sent_delivered;
                }
                return context.getString(i3, A0i, A00);
            } else if (i == 13) {
                int i4 = R.string.audio_message_description_sent_read;
                if (z) {
                    i4 = R.string.voice_message_description_sent_read;
                }
                return context.getString(i4, A0i, A00);
            } else if (i == 8) {
                return context.getString(R.string.voice_message_description_sent_played, A0i, A00);
            } else {
                int i5 = R.string.audio_message_description_sent;
                if (z) {
                    i5 = R.string.voice_message_description_sent;
                }
                return context.getString(i5, A0i, A00);
            }
        }
        UserJid A0B = c09g.A0B();
        if (A0B != null) {
            String A06 = c018708s.A06(c05w.A0A(A0B));
            int i6 = ((AnonymousClass092) c09g).A08;
            if (i6 == 9 || i6 == 10) {
                int i7 = R.string.audio_message_description_played;
                if (z) {
                    i7 = R.string.voice_message_description_played;
                }
                return context.getString(i7, A06, A0i, A00);
            } else if (z) {
                if (((AnonymousClass097) c09g).A02.A0F == null) {
                    return context.getString(R.string.voice_message_download_description, A06, A0i, A00, C0DB.A07(c002301c, ((AnonymousClass097) c09g).A01));
                }
                return context.getString(R.string.voice_message_description, A06, A0i, A00);
            } else if (((AnonymousClass097) c09g).A02.A0F == null) {
                return context.getString(R.string.audio_message_download_description, A06, A0i, A00, C0DB.A07(c002301c, ((AnonymousClass097) c09g).A01));
            } else {
                return context.getString(R.string.audio_message_description, A06, A0i, A00);
            }
        }
        throw null;
    }

    public static String A0D(Context context, C0KC c0kc, boolean z, AnonymousClass012 anonymousClass012, C002301c c002301c, C41461tx c41461tx) {
        long A06;
        if (z) {
            long j = c0kc.A0E + (c0kc.A00 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
            if (c0kc.A0n.A02) {
                A06 = c41461tx.A07(c0kc);
            } else {
                A06 = c41461tx.A06(c0kc);
            }
            long A062 = anonymousClass012.A06(A06);
            int i = (A06 > anonymousClass012.A05() ? 1 : (A06 == anonymousClass012.A05() ? 0 : -1));
            Object[] objArr = new Object[1];
            if (i > 0) {
                objArr[0] = AbstractC40621sZ.A00(c002301c, A062);
                return AbstractC40621sZ.A01(c002301c, context.getString(R.string.live_location_live_until, objArr), A062);
            }
            objArr[0] = AbstractC40621sZ.A00(c002301c, j);
            return AbstractC40621sZ.A01(c002301c, context.getString(R.string.live_location_live_until, objArr), j);
        }
        return context.getString(R.string.live_location_sharing_ended);
    }

    public static String A0E(C002301c c002301c, C0JP c0jp) {
        File file;
        C09H c09h = ((AnonymousClass097) c0jp).A02;
        if (c09h == null || (file = c09h.A0F) == null) {
            return "";
        }
        int i = ((AnonymousClass097) c0jp).A00;
        if (i == 0) {
            i = C0DD.A03(file);
            ((AnonymousClass097) c0jp).A00 = i;
        }
        if (i != 0) {
            return AnonymousClass029.A0g(c002301c, i);
        }
        return C02180Ae.A0k(c002301c, ((AnonymousClass097) c0jp).A01);
    }

    public static String A0F(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        sb.append(UUID.randomUUID().toString());
        return sb.toString();
    }

    public static List A0G(MessageDigest messageDigest, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C06C c06c = (C06C) it.next();
            if (!A0P(c06c.A02()) && A0M(c06c, list, messageDigest)) {
                arrayList.add(c06c);
            }
        }
        return arrayList;
    }

    public static void A0H(Context context, C018608r c018608r, View view, AbstractC005302j abstractC005302j) {
        C09250cv A00 = C09250cv.A00(view, context.getString(R.string.archived_chats_stay_muted), 0);
        A00.A06(context.getString(R.string.unarchive_button), new ViewOnClickCListenerShape3S0200000_I0(c018608r, abstractC005302j, 11));
        A00.A05(C02160Ac.A00(context, R.color.bulkArchiveSnackbarButton));
        A00.A04();
    }

    public static void A0I(ActivityC02290Ap activityC02290Ap, final List list, final boolean z, InterfaceC002901k interfaceC002901k, final C018608r c018608r, final C000500h c000500h, final C03340Fh c03340Fh) {
        activityC02290Ap.A12(R.string.register_wait_message);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final WeakReference weakReference = new WeakReference(activityC02290Ap);
        interfaceC002901k.ARy(new C0HS() { // from class: X.2jI
            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                for (C06C c06c : list) {
                    C018608r c018608r2 = c018608r;
                    Jid A03 = c06c.A03(AbstractC005302j.class);
                    if (A03 != null) {
                        c018608r2.A0N((AbstractC005302j) A03, z, true);
                    } else {
                        throw null;
                    }
                }
                ActivityC02290Ap.A06(elapsedRealtime, 300L);
                return null;
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                ActivityC02290Ap activityC02290Ap2 = (ActivityC02290Ap) weakReference.get();
                if (activityC02290Ap2 != null && !activityC02290Ap2.isFinishing()) {
                    activityC02290Ap2.ARS();
                }
                C000500h c000500h2 = c000500h;
                C000200d.A0g(c000500h2, "delete_chat_count", list.size() + c000500h2.A00.getInt("delete_chat_count", 0));
                c03340Fh.A03(0);
            }
        }, new Object[0]);
    }

    public static void A0J(C06C c06c, DialogFragment dialogFragment) {
        Bundle bundle = new Bundle();
        bundle.putString("jid", C003101m.A07(c06c.A02()));
        dialogFragment.A0P(bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x004a, code lost:
        if (r1 == 10) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0K(com.whatsapp.search.views.itemviews.AudioPlayerView r6, com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r7, X.C09G r8) {
        /*
            android.content.Context r5 = r7.getContext()
            X.094 r4 = r8.A0n
            boolean r3 = r4.A02
            if (r3 == 0) goto L3f
            int r1 = r8.A08
            r0 = 8
            r2 = 2131100705(0x7f060421, float:1.78138E38)
            if (r1 != r0) goto L16
            r2 = 2131100704(0x7f060420, float:1.7813797E38)
        L16:
            r7.setMicColorTint(r2)
            int r0 = X.C02160Ac.A00(r5, r2)
            r6.setSeekbarColor(r0)
            X.09H r1 = r8.A02
            if (r1 == 0) goto L50
            boolean r0 = r1.A0a
            if (r0 != 0) goto L3e
            boolean r0 = r1.A0P
            if (r0 != 0) goto L3e
            boolean r0 = r8.A0f
            if (r0 == 0) goto L3a
            if (r3 == 0) goto L3a
            X.02j r0 = r4.A00
            boolean r0 = X.C003101m.A0P(r0)
            if (r0 == 0) goto L3e
        L3a:
            r0 = 0
            r6.setSeekbarColor(r0)
        L3e:
            return
        L3f:
            int r1 = r8.A08
            r0 = 9
            if (r1 == r0) goto L4c
            r0 = 10
            r2 = 2131100703(0x7f06041f, float:1.7813795E38)
            if (r1 != r0) goto L16
        L4c:
            r2 = 2131100704(0x7f060420, float:1.7813797E38)
            goto L16
        L50:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23X.A0K(com.whatsapp.search.views.itemviews.AudioPlayerView, com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView, X.09G):void");
    }

    public static boolean A0L(C01B c01b, C000500h c000500h) {
        return c01b.A0E(C01C.A0j) && c000500h.A00.getBoolean("archive_v2_enabled", false);
    }

    public static boolean A0M(C06C c06c, List list, MessageDigest messageDigest) {
        int i;
        Jid A02 = c06c.A02();
        if (A02 != null) {
            if (A02.equals(C04260Jm.A00)) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(A02.user);
            sb.append("WA_ADD_NOTIF");
            String obj = sb.toString();
            messageDigest.reset();
            messageDigest.update(obj.getBytes());
            byte[] digest = messageDigest.digest();
            for (int i2 = 0; i2 < list.size(); i2++) {
                byte[] bArr = (byte[]) list.get(i2);
                if (digest.length >= bArr.length) {
                    while (i < bArr.length) {
                        i = digest[i] == bArr[i] ? i + 1 : 0;
                    }
                    return true;
                }
            }
            return false;
        }
        throw null;
    }

    public static boolean A0N(C06C c06c, boolean z) {
        C04460Kg c04460Kg = c06c.A08;
        if (c04460Kg == null || TextUtils.isEmpty(c04460Kg.A01)) {
            return true;
        }
        Jid A02 = c06c.A02();
        return A02 == null ? !z : A0P(A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x000b, code lost:
        if (r5.A0l() != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0O(X.AbstractC005302j r2, X.C05M r3, X.C01B r4, X.C000500h r5) {
        /*
            boolean r0 = A0L(r4, r5)
            if (r0 == 0) goto Ld
            boolean r1 = r5.A0l()
            r0 = 1
            if (r1 == 0) goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L17
            boolean r1 = r3.A0F(r2)
            r0 = 1
            if (r1 != 0) goto L18
        L17:
            r0 = 0
        L18:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23X.A0O(X.02j, X.05M, X.01B, X.00h):boolean");
    }

    public static boolean A0P(Jid jid) {
        return !C003101m.A0W(jid) || C003101m.A0Y(jid);
    }

    public static boolean A0Q(AnonymousClass092 anonymousClass092, C05W c05w, C0DK c0dk, C0ES c0es, C02L c02l, C0EA c0ea) {
        C06C c06c;
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        if (anonymousClass094.A02) {
            return true;
        }
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        if (abstractC005302j != null) {
            if (c0ea.A01(abstractC005302j) == 1) {
                return true;
            }
            C06C A02 = c0dk.A02(abstractC005302j);
            if (A02.A0C()) {
                AbstractC005302j A0A = anonymousClass092.A0A();
                if (A0A != null) {
                    C06C A0A2 = c05w.A0A(A0A);
                    UserJid A0D = c05w.A0D((GroupJid) A02.A03(C011005l.class));
                    if (A0D != null) {
                        c06c = c05w.A0A(A0D);
                    } else {
                        c06c = null;
                    }
                    c02l.A05();
                    UserJid userJid = c02l.A03;
                    if (userJid != null) {
                        Jid A03 = A02.A03(C011005l.class);
                        if (A03 != null) {
                            if (c0es.A0O((C011005l) A03)) {
                                return true;
                            }
                            return (c06c != null && (c06c.A08 != null || userJid.equals(c06c.A02()))) || A0A2.A08 != null || A0A2.A03 == 3;
                        }
                        throw null;
                    }
                    throw null;
                }
                return false;
            } else if (A02.A08 == null && A02.A03 != 3) {
                return C003101m.A0X(abstractC005302j);
            } else {
                return true;
            }
        }
        throw null;
    }

    public static boolean A0R(C0KC c0kc, long j, AnonymousClass012 anonymousClass012) {
        long A05 = anonymousClass012.A05();
        long j2 = (c0kc.A00 * 1000) + c0kc.A0E;
        boolean z = c0kc.A0n.A02;
        if (z || j <= A05) {
            if (z) {
                return (j == -1 && j2 > A05) || j > A05;
            }
            return false;
        }
        return true;
    }
}
