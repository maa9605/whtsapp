package java.lang;

import X.AbstractC005302j;
import X.AbstractC04890Mh;
import X.AnonymousClass012;
import X.AnonymousClass024;
import X.AnonymousClass092;
import X.AnonymousClass094;
import X.AnonymousClass223;
import X.AnonymousClass227;
import X.AnonymousClass228;
import X.AnonymousClass229;
import X.C000200d;
import X.C000700j;
import X.C002701i;
import X.C003101m;
import X.C011005l;
import X.C012005w;
import X.C01J;
import X.C02180Ae;
import X.C02L;
import X.C03790Hb;
import X.C04010Ib;
import X.C04020Ic;
import X.C04050If;
import X.C04130Ir;
import X.C04140Is;
import X.C05320Of;
import X.C06350Ss;
import X.C06F;
import X.C07D;
import X.C09B;
import X.C0CD;
import X.C0CK;
import X.C0DC;
import X.C0E3;
import X.C0ES;
import X.C0F4;
import X.C0F8;
import X.C0G5;
import X.C0IO;
import X.C0JV;
import X.C0LO;
import X.C0M6;
import X.C0QS;
import X.C0T4;
import X.C0T8;
import X.C0TH;
import X.C0Zq;
import X.C20M;
import X.C23Z;
import X.C2BE;
import X.C2BP;
import X.C2BR;
import X.C2BW;
import X.C2BZ;
import X.C2H2;
import X.C2JJ;
import X.C2JL;
import X.C2JM;
import X.C2JO;
import X.C2JY;
import X.C2K5;
import X.C2K8;
import X.C2KB;
import X.C2KD;
import X.C2KE;
import X.C40451sH;
import X.C40941t7;
import X.C41461tx;
import X.C41711uO;
import X.C41741uR;
import X.C41771uU;
import X.C43121wt;
import X.C43131wu;
import X.C43221x3;
import X.C44551zG;
import X.C454622d;
import X.C47212Ai;
import X.C48292Er;
import X.C48352Ex;
import X.C49202Ja;
import X.C49222Jd;
import X.C49262Ji;
import X.C49272Jj;
import X.C49292Jm;
import X.C49302Jn;
import X.C49312Jo;
import X.C49322Jp;
import X.C49342Jr;
import X.C83793sh;
import X.InterfaceC48332Ev;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.graphics.BitmapFactory;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.gif_search.GifSearchContainer;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.group.NewGroup;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.invites.InviteGroupParticipantsActivity;
import com.whatsapp.invites.PromptSendGroupInviteDialogFragment;
import com.whatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.RotateSignedPreKeyJob;
import com.whatsapp.location.PlaceInfo;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.File;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class RunnableEBaseShape2S0200000_I0_2 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public RunnableEBaseShape2S0200000_I0_2(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        C09B c09b;
        C0CD c0cd;
        int i;
        C04050If A00;
        switch (this.A02) {
            case 0:
                ((C41711uO) this.A00).A05.A05(2, 0L, 0L, (LocationListener) this.A01, "CompanionDevice");
                return;
            case 1:
                C41711uO c41711uO = (C41711uO) this.A00;
                C20M c20m = (C20M) this.A01;
                C0JV c0jv = c20m.A01;
                C0F4 c0f4 = c41711uO.A0F;
                C02L c02l = c0f4.A01;
                c02l.A05();
                UserJid userJid = c02l.A03;
                if (userJid != null) {
                    DeviceJid deviceJid = c0jv.A05;
                    C07D A002 = C07D.A00(deviceJid);
                    C0CD A04 = c0f4.A02.A04();
                    try {
                        C03790Hb A003 = A04.A00();
                        C0F8 c0f8 = c0f4.A04;
                        C07D A02 = c0f8.A01().A02();
                        C0CD A004 = c0f8.A02.A00();
                        C03790Hb A005 = A004.A00();
                        synchronized (c0f8) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("device_id", deviceJid.getRawString());
                            contentValues.put("platform_type", Integer.valueOf(c0jv.A06.value));
                            contentValues.put("device_os", c0jv.A07);
                            contentValues.put("last_active", Long.valueOf(c0jv.A00));
                            contentValues.put("login_time", Long.valueOf(c0jv.A04));
                            contentValues.put("logout_time", Long.valueOf(c0jv.A01));
                            contentValues.put("adv_key_index", Integer.valueOf(c0jv.A03));
                            contentValues.put("place_name", c0jv.A02);
                            A004.A02.A05("devices", contentValues);
                            A005.A00();
                            c0f8.A00 = null;
                        }
                        A005.close();
                        A004.close();
                        C07D c07d = C07D.A01;
                        C05320Of c05320Of = c0f4.A00;
                        if (c05320Of != null) {
                            c05320Of.A03(userJid, A02, A002, c07d);
                        }
                        A003.A00();
                        A003.close();
                        A04.close();
                        c0f4.A03();
                        C05320Of c05320Of2 = c0f4.A00;
                        if (c05320Of2 != null) {
                            c05320Of2.A02(userJid, A02, A002, c07d);
                        }
                        c41711uO.A0D.A00.execute(new RunnableEBaseShape0S0300000_I0_0(c41711uO, deviceJid, c20m.A00, 19));
                        c41711uO.A0L.add(deviceJid);
                        c41711uO.A07(c20m);
                        return;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            try {
                                A04.close();
                            } catch (Throwable unused) {
                            }
                            throw th2;
                        }
                    }
                }
                throw null;
            case 2:
                ((C41711uO) this.A00).A05.A06((LocationListener) this.A01);
                return;
            case 3:
                C05320Of c05320Of3 = (C05320Of) this.A00;
                Iterator it = ((C07D) this.A01).iterator();
                while (it.hasNext()) {
                    C0IO A0T = C002701i.A0T((DeviceJid) it.next());
                    C01J c01j = c05320Of3.A03;
                    c01j.A0H.A00();
                    c01j.A0C.A01(A0T);
                    c01j.A0L(A0T);
                }
                return;
            case 4:
                C41741uR c41741uR = (C41741uR) this.A00;
                Jid jid = (Jid) this.A01;
                C0CK c0ck = c41741uR.A00;
                Map map = (Map) c0ck.A00();
                if (map != null) {
                    C000700j.A00();
                    C0CD A01 = c41741uR.A01.A01();
                    try {
                        Cursor A07 = A01.A02.A07("SELECT device_id, status FROM msg_history_sync WHERE device_id=? AND status=? LIMIT 1", new String[]{jid.getRawString(), String.valueOf(1)});
                        if (A07 != null) {
                            r2 = A07.getCount() > 0;
                            A07.close();
                        }
                        A01.close();
                        map.put(jid, Boolean.valueOf(r2));
                        c0ck.A04(map);
                        return;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            try {
                                A01.close();
                            } catch (Throwable unused2) {
                            }
                            throw th4;
                        }
                    }
                }
                return;
            case 5:
                AnonymousClass223 anonymousClass223 = (AnonymousClass223) this.A01;
                ((Dialog) this.A00).getWindow().setSoftInputMode(1);
                if (anonymousClass223.A01()) {
                    anonymousClass223.A00(true);
                    return;
                }
                return;
            case 6:
                C49342Jr c49342Jr = (C49342Jr) this.A00;
                CharSequence charSequence = (CharSequence) this.A01;
                c49342Jr.A00 = null;
                String charSequence2 = charSequence.toString();
                EmojiSearchContainer emojiSearchContainer = c49342Jr.A02;
                if (charSequence2.equals(emojiSearchContainer.A0C) || emojiSearchContainer.getVisibility() != 0) {
                    return;
                }
                emojiSearchContainer.A00(charSequence.toString());
                return;
            case 7:
                C49322Jp c49322Jp = (C49322Jp) this.A00;
                Object obj = this.A01;
                C83793sh c83793sh = c49322Jp.A0C;
                if (c83793sh == null || (c09b = c49322Jp.A0A) == null) {
                    return;
                }
                C40941t7 c40941t7 = c49322Jp.A0B;
                int A006 = c40941t7.A00();
                synchronized (obj) {
                }
                if (A006 == 4) {
                    String A0h = C02180Ae.A0h(c49322Jp.A08.A00, c49322Jp.A06, c49322Jp.A09, c09b, c40941t7);
                    c83793sh.A00(A0h != null ? A0h : "", c40941t7.A08(), 1);
                    return;
                }
                c83793sh.A00("", false, 0);
                return;
            case 8:
                C49302Jn c49302Jn = (C49302Jn) this.A01;
                AnonymousClass228 anonymousClass228 = ((C49292Jm) this.A00).A02;
                C000700j.A01();
                Iterator it2 = anonymousClass228.A00.iterator();
                while (true) {
                    C0G5 c0g5 = (C0G5) it2;
                    if (!c0g5.hasNext()) {
                        return;
                    }
                    ((AnonymousClass229) c0g5.next()).A01(new C49312Jo(c49302Jn, 0L));
                }
            case 9:
                C48352Ex c48352Ex = (C48352Ex) this.A00;
                c48352Ex.A0H((View) this.A01, c48352Ex.A00);
                return;
            case 10:
                C47212Ai c47212Ai = ((C2BE) this.A00).A00;
                C47212Ai.A01(c47212Ai, c47212Ai.A05.A0F((AnonymousClass094) this.A01));
                return;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                C47212Ai c47212Ai2 = ((C2BE) this.A00).A00;
                C47212Ai.A01(c47212Ai2, c47212Ai2.A05.A0F((AnonymousClass094) this.A01));
                return;
            case 12:
                C47212Ai c47212Ai3 = (C47212Ai) this.A00;
                C2BR A007 = C2BR.A00((C0LO) this.A01);
                if (c47212Ai3.A03(A007)) {
                    c47212Ai3.A08.A0B(A007);
                    return;
                }
                return;
            case 13:
                C47212Ai c47212Ai4 = (C47212Ai) this.A00;
                C2BR c2br = (C2BR) this.A01;
                AnonymousClass227 anonymousClass227 = c47212Ai4.A09;
                anonymousClass227.A00.A02.post(new RunnableEBaseShape2S0200000_I0_2(anonymousClass227, c2br, 17));
                C2BZ c2bz = anonymousClass227.A02;
                String str = c2br.A04;
                c0cd = new C0CD(null, c2bz.A00, true);
                try {
                    c0cd.A02.A01("starred_gifs", "plaintext_hash = ?", new String[]{str});
                    c0cd.close();
                    if (c47212Ai4.A08.A0C(c2br.A04)) {
                        return;
                    }
                    C012005w c012005w = c47212Ai4.A01;
                    File file = new File(c012005w.A0C(), c2br.A04);
                    if (c012005w != null) {
                        AnonymousClass024.A0f(file);
                        c47212Ai4.A07.A02().A00(c2br);
                        return;
                    }
                    throw null;
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } finally {
                        try {
                            c0cd.close();
                        } catch (Throwable unused3) {
                        }
                    }
                }
            case 14:
                C47212Ai c47212Ai5 = (C47212Ai) this.A00;
                C2BR c2br2 = (C2BR) this.A01;
                C2BP c2bp = c47212Ai5.A08;
                c2bp.A00.A02.post(new RunnableEBaseShape2S0200000_I0_2(c2bp, c2br2, 16));
                c2bp.A05(new C2BW(c2br2.A04));
                AnonymousClass227 anonymousClass2272 = c47212Ai5.A09;
                String str2 = c2br2.A04;
                C000700j.A00();
                C2BZ c2bz2 = anonymousClass2272.A02;
                if (c2bz2 != null) {
                    String[] strArr = {"plaintext_hash"};
                    String[] strArr2 = {str2};
                    c0cd = new C0CD(null, c2bz2.A00, false);
                    try {
                        Cursor A09 = c0cd.A02.A09("starred_gifs", strArr, "plaintext_hash = ?", strArr2, null, "isGifInStarredDB/QUERY_STARRED_GIF");
                        boolean z = A09.getCount() > 0;
                        A09.close();
                        if (z) {
                            return;
                        }
                        C012005w c012005w2 = c47212Ai5.A01;
                        File file2 = new File(c012005w2.A0C(), c2br2.A04);
                        if (c012005w2 != null) {
                            AnonymousClass024.A0f(file2);
                            c47212Ai5.A07.A02().A00(c2br2);
                            return;
                        }
                        throw null;
                    } catch (Throwable th6) {
                        try {
                            throw th6;
                        } finally {
                            try {
                                c0cd.close();
                            } catch (Throwable unused4) {
                            }
                        }
                    }
                }
                throw null;
            case 15:
                C49272Jj c49272Jj = (C49272Jj) this.A00;
                CharSequence charSequence3 = (CharSequence) this.A01;
                c49272Jj.A00 = null;
                String charSequence4 = charSequence3.toString();
                GifSearchContainer gifSearchContainer = c49272Jj.A02;
                if (charSequence4.equals(gifSearchContainer.A0F) || gifSearchContainer.getVisibility() != 0) {
                    return;
                }
                GifSearchContainer.A00(gifSearchContainer, charSequence3);
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                AnonymousClass228 anonymousClass2282 = ((C2BP) this.A00).A01;
                String str3 = ((C2BR) this.A01).A04;
                if (anonymousClass2282 != null) {
                    C000700j.A01();
                    Iterator it3 = anonymousClass2282.A00.iterator();
                    while (true) {
                        C0G5 c0g52 = (C0G5) it3;
                        if (!c0g52.hasNext()) {
                            return;
                        }
                        AnonymousClass229 anonymousClass229 = (AnonymousClass229) c0g52.next();
                        if (!(anonymousClass229 instanceof C2JL)) {
                            if (anonymousClass229 instanceof C2JM) {
                                C2JO c2jo = ((C2JM) anonymousClass229).A00.A0A;
                                c2jo.A02(str3);
                                c2jo.A01();
                            }
                        } else {
                            C2JO c2jo2 = ((C2JL) anonymousClass229).A00;
                            c2jo2.A02(str3);
                            c2jo2.A01();
                        }
                    }
                } else {
                    throw null;
                }
            case 17:
                C2BR c2br3 = (C2BR) this.A01;
                AnonymousClass228 anonymousClass2283 = ((AnonymousClass227) this.A00).A01;
                C000700j.A01();
                Iterator it4 = anonymousClass2283.A00.iterator();
                while (true) {
                    C0G5 c0g53 = (C0G5) it4;
                    if (!c0g53.hasNext()) {
                        return;
                    }
                    ((AnonymousClass229) c0g53.next()).A01(new C2JJ(c2br3, 0L));
                }
            case 18:
                ((C23Z) this.A00).A05.A00((AbstractC005302j) this.A01);
                return;
            case 19:
                C23Z c23z = (C23Z) this.A00;
                C01J c01j2 = c23z.A02;
                String rawString = ((AnonymousClass092) this.A01).A0n.A00.getRawString();
                C02L c02l2 = c23z.A01;
                c02l2.A05();
                DeviceJid deviceJid2 = c02l2.A02;
                if (deviceJid2 != null) {
                    c01j2.A0Q(new C0QS(rawString, C002701i.A0T(deviceJid2)));
                    return;
                }
                throw null;
            case C0M6.A01 /* 20 */:
                C2KE c2ke = (C2KE) this.A01;
                GroupChatInfo groupChatInfo = ((C2KD) this.A00).A00;
                Set keySet = c2ke.A02.keySet();
                Intent A008 = InviteGroupParticipantsActivity.A00(groupChatInfo, c2ke);
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("jids", C003101m.A0E(keySet));
                bundle.putParcelable("invite_intent", A008);
                PromptSendGroupInviteDialogFragment promptSendGroupInviteDialogFragment = new PromptSendGroupInviteDialogFragment();
                bundle.putInt("invite_intent_code", 17);
                promptSendGroupInviteDialogFragment.A0P(bundle);
                groupChatInfo.AUh(promptSendGroupInviteDialogFragment);
                return;
            case 21:
                C49222Jd c49222Jd = (C49222Jd) this.A00;
                List list = (List) this.A01;
                GroupChatInfo groupChatInfo2 = (GroupChatInfo) c49222Jd.A05.get();
                if (groupChatInfo2 == null || c49222Jd.A04()) {
                    return;
                }
                C49262Ji c49262Ji = groupChatInfo2.A12;
                c49262Ji.A01 = list;
                ((AbstractC04890Mh) c49262Ji).A01.A00();
                if (list.isEmpty()) {
                    groupChatInfo2.A06.setVisibility(8);
                } else {
                    groupChatInfo2.A0E.setText(((ChatInfoActivity) groupChatInfo2).A09.A0G().format(list.size()));
                    groupChatInfo2.A06.setVisibility(0);
                }
                ((AbstractC04890Mh) groupChatInfo2.A12).A01.A00();
                return;
            case 22:
                ((C0ES) this.A00).A0Y.A02((Set) this.A01);
                return;
            case 23:
                ((C0ES) this.A00).A0l.remove(this.A01);
                return;
            case 24:
                ((C0ES) this.A00).A0X.A00(((AnonymousClass092) this.A01).A0n.A00);
                return;
            case 25:
                ((C0ES) this.A00).A0Y.A02(Collections.singleton(this.A01));
                return;
            case 26:
                ((C2KB) this.A00).A00.A00.A0I(this.A01.toString(), 0);
                return;
            case 27:
                C011005l c011005l = (C011005l) this.A01;
                NewGroup newGroup = ((C49202Ja) this.A00).A00;
                newGroup.ARS();
                if (newGroup.AFE()) {
                    return;
                }
                StringBuilder A0P = C000200d.A0P("newgroup/onConversationChanged/ok/");
                A0P.append(newGroup.A0c);
                Log.i(A0P.toString());
                NewGroup.A01(newGroup, c011005l);
                newGroup.finish();
                return;
            case 28:
                NewGroup newGroup2 = ((C2K8) this.A00).A00;
                newGroup2.A0V.A09(newGroup2.A0A.A0A((AbstractC005302j) this.A01));
                return;
            case 29:
                IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) this.A00;
                if (!((DeviceJid) this.A01).userJid.equals(identityVerificationActivity.A0K.A03(UserJid.class)) || identityVerificationActivity.isFinishing()) {
                    return;
                }
                identityVerificationActivity.A06.setVisibility(8);
                identityVerificationActivity.A0I = null;
                identityVerificationActivity.A01 = 0;
                identityVerificationActivity.A00 = 0;
                identityVerificationActivity.A1S();
                return;
            case 30:
                ((C0T8) this.A00).A02((IBinder) this.A01);
                return;
            case 31:
                byte[] bArr = (byte[]) this.A01;
                ViewGroupInviteActivity viewGroupInviteActivity = ((C2JY) this.A00).A00;
                if (viewGroupInviteActivity.AFE()) {
                    return;
                }
                StringBuilder A0P2 = C000200d.A0P("ViewGroupInviteActivity/fetchGroupProfilePicture: ");
                A0P2.append(bArr == null ? "null" : Integer.valueOf(bArr.length));
                Log.i(A0P2.toString());
                if (bArr != null) {
                    viewGroupInviteActivity.A0J.A00(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                    return;
                }
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                RotateSignedPreKeyJob rotateSignedPreKeyJob = (RotateSignedPreKeyJob) this.A00;
                if (MessageDigest.isEqual((byte[]) this.A01, rotateSignedPreKeyJob.A01.A0W())) {
                    return;
                }
                rotateSignedPreKeyJob.A01.A0K();
                rotateSignedPreKeyJob.A00.A04();
                return;
            case 33:
                ((C0T4) this.A01).A06();
                ((C2K5) this.A00).A02 = 0;
                return;
            case 34:
                ((C2H2) this.A00).A0N((PlaceInfo) this.A01);
                return;
            case 35:
                ((C41461tx) this.A00).A0L.A05((AbstractC005302j) this.A01);
                return;
            case 36:
                ((C41461tx) this.A00).A0L.A05((AbstractC005302j) this.A01);
                return;
            case 37:
                ((C41461tx) this.A00).A0L.A05((AbstractC005302j) this.A01);
                return;
            case 38:
                ((C41461tx) this.A00).A0L.A05(((AnonymousClass092) this.A01).A0n.A00);
                return;
            case 39:
                ((C41461tx) this.A00).A0L.A05((AbstractC005302j) this.A01);
                return;
            case 40:
                ((C41461tx) this.A00).A0L.A05((AbstractC005302j) this.A01);
                return;
            case 41:
                ((C41461tx) this.A00).A0L.A05((AbstractC005302j) this.A01);
                return;
            case 42:
                ((C41461tx) this.A00).A0J.A0P(new C0QS(C0Zq.A00.getRawString(), (C0IO) this.A01));
                return;
            case 43:
                ((C44551zG) this.A00).A08((C454622d) this.A01);
                return;
            case 44:
                ((C44551zG) this.A00).A09.A06((C04140Is) this.A01);
                return;
            case 45:
                ((C41771uU) this.A00).A05.A06(Collections.unmodifiableList(((C04130Ir) this.A01).A01), 12);
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
                C41771uU c41771uU = (C41771uU) this.A00;
                AnonymousClass092 anonymousClass092 = (AnonymousClass092) this.A01;
                c41771uU.A02.A0D(anonymousClass092, 6, 1, c41771uU.A03.A05() - anonymousClass092.A0E, true, false);
                return;
            case 47:
                C41771uU c41771uU2 = (C41771uU) this.A00;
                C04130Ir c04130Ir = (C04130Ir) this.A01;
                final C48292Er c48292Er = c41771uU2.A0A;
                C48292Er.A01(Boolean.TRUE, c04130Ir, new InterfaceC48332Ev() { // from class: X.3Ez
                    @Override // X.InterfaceC48332Ev
                    public final boolean A5T(Object obj2, AnonymousClass097 anonymousClass097, C09H c09h) {
                        if (!C0DB.A0J(c48292Er.A00, anonymousClass097)) {
                            anonymousClass097.A0Y(1);
                        }
                        c09h.A0a = true;
                        c09h.A0C = 0L;
                        return true;
                    }
                });
                c41771uU2.A05.A06(c04130Ir.A01, -1);
                return;
            case 48:
                C43121wt c43121wt = (C43121wt) this.A00;
                C04140Is c04140Is = (C04140Is) this.A01;
                synchronized (c43121wt) {
                    C000700j.A00();
                    C06F c06f = c43121wt.A00;
                    StringBuilder sb = new StringBuilder();
                    sb.append(c04140Is.A0C);
                    sb.append(c04140Is.A0A);
                    c06f.A08(sb.toString(), c04140Is);
                    AnonymousClass012 anonymousClass012 = c43121wt.A01;
                    anonymousClass012.A05();
                    C40451sH c40451sH = c43121wt.A02;
                    synchronized (c40451sH) {
                    }
                    try {
                        C0CD A012 = c40451sH.A01();
                        try {
                            A012.A02.A02("media_job", c43121wt.A01(c04140Is));
                            anonymousClass012.A05();
                        } catch (Throwable th7) {
                            try {
                                throw th7;
                            } finally {
                                try {
                                    A012.close();
                                } catch (Throwable unused5) {
                                }
                            }
                        }
                    } catch (SQLiteDatabaseCorruptException e) {
                        Log.e("mediajobdb/insert", e);
                        throw e;
                    } catch (Error e2) {
                        e = e2;
                        Log.e(e);
                        throw e;
                    } catch (RuntimeException e3) {
                        e = e3;
                        Log.e(e);
                        throw e;
                    }
                }
                return;
            case 49:
                C43221x3 c43221x3 = (C43221x3) this.A00;
                C04020Ic c04020Ic = (C04020Ic) this.A01;
                C43131wu c43131wu = c43221x3.A0V;
                double A013 = c43221x3.A02.A01();
                C04010Ib c04010Ib = c43221x3.A0Z;
                int i2 = c04010Ib.A04;
                int i3 = c43221x3.A06;
                switch (i3) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    case 3:
                        i = 3;
                        break;
                    case 4:
                        i = 4;
                        break;
                    default:
                        C000200d.A0p("MediaDownload/downloadOriginTypeToMediaOriginType/invalid downloadOriginType = ", i3);
                    case 5:
                    case 6:
                    case 7:
                        i = 0;
                        break;
                }
                c43131wu.A03(A013, i2, i, c04020Ic.A02(), c43221x3.A0p != 0);
                C0E3 c0e3 = c43221x3.A0C;
                C06350Ss c06350Ss = c43221x3.A02;
                File A03 = c43221x3.A0Y.A03();
                C04020Ic c04020Ic2 = c06350Ss.A04;
                int A014 = C002701i.A01(c04020Ic2 == null ? -1 : c04020Ic2.A01);
                C0DC c0dc = c04010Ib.A08;
                C0DC c0dc2 = C0DC.A0I;
                if (c0dc == c0dc2) {
                    if (A014 == 1 || A014 == 15) {
                        C0TH c0th = new C0TH();
                        c0th.A01 = Double.valueOf(c04010Ib.A06);
                        c0th.A02 = Integer.valueOf(i2);
                        if (c0dc == c0dc2 && A03 != null && A03.exists() && (A00 = C04050If.A00(WebpUtils.fetchWebpMetadata(A03.getAbsolutePath()))) != null) {
                            c0th.A00 = Boolean.valueOf(A00.A05);
                        }
                        c0e3.A04.A0B(c0th, null, false);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
