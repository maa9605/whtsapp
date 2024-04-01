package X;

import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.20v */
/* loaded from: classes2.dex */
public abstract class C20v {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public AbstractC005302j A09;
    public AbstractC005302j A0A;
    public UserJid A0B;
    public UserJid A0C;
    public String A0D;
    public String A0E;
    public String A0G;
    public String A0H;
    public String A0I;
    public List A0J;
    public List A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public byte[] A0Q;
    public byte[] A0R;
    public final AbstractC000600i A0S;
    public final C01B A0T;
    public final AnonymousClass092 A0U;
    public final boolean A0V;
    public int A04 = -1;
    public String A0F = null;

    public C20v(AbstractC000600i abstractC000600i, C01B c01b, AnonymousClass092 anonymousClass092, boolean z) {
        this.A0S = abstractC000600i;
        this.A0T = c01b;
        this.A0U = anonymousClass092;
        this.A0V = z;
    }

    public void A00() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.A0Q;
        }
        if (bArr != null) {
            return;
        }
        byte[] A01 = A01();
        synchronized (this) {
            this.A0Q = A01;
        }
    }

    public final byte[] A01() {
        C0KA A02 = A02();
        byte[] A0B = A02.A01().A0B();
        long A07 = this.A0T.A07(C01C.A4A) * 1024;
        if (A07 <= 0 || A0B.length <= A07) {
            return A0B;
        }
        A02.A02();
        C452821e c452821e = (C452821e) A02.A00;
        c452821e.A0D = null;
        c452821e.A01 &= -3;
        C0RV c0rv = C0RV.OVERSIZED;
        A02.A02();
        C452821e.A0C((C452821e) A02.A00, c0rv);
        return A02.A01().A0B();
    }

    public C0KA A02() {
        C0RV c0rv;
        C0RV c0rv2;
        C451920u c451920u = (C451920u) this;
        C0KA A09 = C452821e.A09();
        C452521b A092 = C452421a.A09();
        A092.A04(c451920u.A0D);
        A092.A07(c451920u.A0L);
        A09.A04(c451920u.A08 / 1000);
        if (c451920u instanceof AnonymousClass215) {
            AnonymousClass215 anonymousClass215 = (AnonymousClass215) c451920u;
            C0RV c0rv3 = C0RV.GROUP_CHANGE_RESTRICT;
            A09.A02();
            C452821e.A0C((C452821e) A09.A00, c0rv3);
            AbstractC005302j abstractC005302j = anonymousClass215.A09;
            AbstractC000600i abstractC000600i = anonymousClass215.A0S;
            AbstractC011105n abstractC011105n = (AbstractC011105n) C451920u.A01(GroupJid.class, abstractC005302j, "GROUP_CHANGE_RESTRICT", abstractC000600i);
            UserJid userJid = (UserJid) C451920u.A01(UserJid.class, anonymousClass215.A0A, "GROUP_CHANGE_RESTRICT", abstractC000600i);
            String[] strArr = new String[1];
            strArr[0] = anonymousClass215.A00 ? "on" : "off";
            C451920u.A02(A09, A092, abstractC011105n, userJid, Arrays.asList(strArr));
        } else if (c451920u instanceof AnonymousClass211) {
            AnonymousClass211 anonymousClass211 = (AnonymousClass211) c451920u;
            C0RV c0rv4 = C0RV.GROUP_CHANGE_NO_FREQUENTLY_FORWARDED;
            A09.A02();
            C452821e.A0C((C452821e) A09.A00, c0rv4);
            AbstractC005302j abstractC005302j2 = anonymousClass211.A09;
            AbstractC000600i abstractC000600i2 = anonymousClass211.A0S;
            AbstractC011105n abstractC011105n2 = (AbstractC011105n) C451920u.A01(GroupJid.class, abstractC005302j2, "GROUP_CHANGE_NO_FREQUENTLY_FORWARDED", abstractC000600i2);
            UserJid userJid2 = (UserJid) C451920u.A01(UserJid.class, anonymousClass211.A0A, "GROUP_CHANGE_NO_FREQUENTLY_FORWARDED", abstractC000600i2);
            String[] strArr2 = new String[1];
            strArr2[0] = anonymousClass211.A00 ? "on" : "off";
            C451920u.A02(A09, A092, abstractC011105n2, userJid2, Arrays.asList(strArr2));
        } else if (c451920u instanceof AnonymousClass214) {
            AnonymousClass214 anonymousClass214 = (AnonymousClass214) c451920u;
            C0RV c0rv5 = C0RV.GROUP_CHANGE_ANNOUNCE;
            A09.A02();
            C452821e.A0C((C452821e) A09.A00, c0rv5);
            AbstractC005302j abstractC005302j3 = anonymousClass214.A09;
            AbstractC000600i abstractC000600i3 = anonymousClass214.A0S;
            AbstractC011105n abstractC011105n3 = (AbstractC011105n) C451920u.A01(GroupJid.class, abstractC005302j3, "GROUP_CHANGE_ANNOUNCE", abstractC000600i3);
            UserJid userJid3 = (UserJid) C451920u.A01(UserJid.class, anonymousClass214.A0A, "GROUP_CHANGE_ANNOUNCE", abstractC000600i3);
            String[] strArr3 = new String[1];
            strArr3[0] = anonymousClass214.A00 ? "on" : "off";
            C451920u.A02(A09, A092, abstractC011105n3, userJid3, Arrays.asList(strArr3));
        } else if (!(c451920u instanceof AnonymousClass210)) {
            int i = c451920u.A00;
            if (i == 24) {
                C0RV c0rv6 = C0RV.GROUP_V4_ADD_INVITE_SENT;
                A09.A02();
                C452821e.A0C((C452821e) A09.A00, c0rv6);
                AbstractC005302j abstractC005302j4 = c451920u.A09;
                AbstractC000600i abstractC000600i4 = c451920u.A0S;
                C451920u.A02(A09, A092, (AbstractC011105n) C451920u.A01(GroupJid.class, abstractC005302j4, "GROUP_V4_ADD_INVITE_SENT", abstractC000600i4), (UserJid) C451920u.A01(UserJid.class, c451920u.A0A, "GROUP_V4_ADD_INVITE_SENT", abstractC000600i4), c451920u.A0J);
            } else if (i == 25) {
                C0RV c0rv7 = C0RV.GROUP_PARTICIPANT_ADD_REQUEST_JOIN;
                A09.A02();
                C452821e.A0C((C452821e) A09.A00, c0rv7);
                AbstractC005302j abstractC005302j5 = c451920u.A09;
                AbstractC000600i abstractC000600i5 = c451920u.A0S;
                C451920u.A02(A09, A092, (AbstractC011105n) C451920u.A01(GroupJid.class, abstractC005302j5, "GROUP_PARTICIPANT_ADD_REQUEST_JOIN", abstractC000600i5), (UserJid) C451920u.A01(UserJid.class, c451920u.A0A, "GROUP_PARTICIPANT_ADD_REQUEST_JOIN", abstractC000600i5), c451920u.A0J);
            } else if (i == 27) {
                C452320z c452320z = (C452320z) c451920u;
                C0RV c0rv8 = C0RV.CHANGE_EPHEMERAL_SETTING;
                A09.A02();
                C452821e.A0C((C452821e) A09.A00, c0rv8);
                AbstractC000600i abstractC000600i6 = c451920u.A0S;
                Jid A01 = C451920u.A01(UserJid.class, c451920u.A0A, "getAuthorJid", abstractC000600i6);
                List asList = Arrays.asList(String.valueOf(c452320z.A00), A01 == null ? null : A01.getRawString());
                AbstractC005302j abstractC005302j6 = c451920u.A09;
                if (C003101m.A0U(abstractC005302j6)) {
                    C451920u.A02(A09, A092, (AbstractC011105n) C451920u.A01(GroupJid.class, abstractC005302j6, "CHANGE_EPHEMERAL_SETTING", abstractC000600i6), null, asList);
                } else if (abstractC005302j6 != null) {
                    A092.A06(abstractC005302j6.getRawString());
                    A09.A02();
                    C452821e c452821e = (C452821e) A09.A00;
                    C0CX c0cx = c452821e.A0B;
                    if (!((C0CY) c0cx).A00) {
                        c452821e.A0B = C0AZ.A05(c0cx);
                    }
                    C0Aa.A08(asList, c452821e.A0B);
                } else {
                    throw null;
                }
            } else if (i == 29) {
                AbstractC005302j abstractC005302j7 = c451920u.A09;
                if (abstractC005302j7 != null) {
                    A092.A06(abstractC005302j7.getRawString());
                    C452220y c452220y = (C452220y) c451920u;
                    switch (c452220y.A00) {
                        case 1:
                            c0rv = C0RV.BLUE_MSG_BSP_FB_UNVERIFIED_TO_SELF_PREMISE_VERIFIED;
                            break;
                        case 2:
                            c0rv = C0RV.BLUE_MSG_BSP_FB_VERIFIED_TO_SELF_PREMISE_UNVERIFIED;
                            break;
                        case 3:
                            c0rv = C0RV.BLUE_MSG_BSP_PREMISE_UNVERIFIED_TO_SELF_PREMISE_VERIFIED;
                            break;
                        case 4:
                            c0rv = C0RV.BLUE_MSG_BSP_PREMISE_VERIFIED_TO_SELF_PREMISE_UNVERIFIED;
                            break;
                        case 5:
                            c0rv = C0RV.BLUE_MSG_SELF_FB_UNVERIFIED_TO_SELF_PREMISE_VERIFIED;
                            break;
                        case 6:
                            c0rv = C0RV.BLUE_MSG_SELF_FB_VERIFIED_TO_SELF_PREMISE_UNVERIFIED;
                            break;
                        case 7:
                            c0rv = C0RV.BLUE_MSG_VERIFIED_TO_UNVERIFIED;
                            break;
                        case 8:
                            c0rv = C0RV.BLUE_MSG_VERIFIED_TO_SELF_FB_UNVERIFIED;
                            break;
                        case 9:
                            c0rv = C0RV.BLUE_MSG_BSP_FB_VERIFIED_TO_SELF_FB_UNVERIFIED;
                            break;
                        case 10:
                            c0rv = C0RV.BLUE_MSG_VERIFIED_TO_BSP_PREMISE_UNVERIFIED;
                            break;
                        case GoogleMigrateImporterActivity.A0E /* 11 */:
                            c0rv = C0RV.BLUE_MSG_SELF_FB_VERIFIED_TO_BSP_PREMISE_UNVERIFIED;
                            break;
                        case 12:
                            c0rv = C0RV.BLUE_MSG_BSP_FB_VERIFIED_TO_BSP_PREMISE_UNVERIFIED;
                            break;
                        case 13:
                            c0rv = C0RV.BLUE_MSG_VERIFIED_TO_BSP_FB_UNVERIFIED;
                            break;
                        case 14:
                            c0rv = C0RV.BLUE_MSG_UNVERIFIED_TO_BSP_FB_VERIFIED;
                            break;
                        case 15:
                            c0rv = C0RV.BLUE_MSG_UNVERIFIED_TO_VERIFIED;
                            break;
                        case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                            c0rv = C0RV.BLUE_MSG_UNVERIFIED_TO_SELF_FB_VERIFIED;
                            break;
                        case 17:
                            c0rv = C0RV.BLUE_MSG_BSP_FB_UNVERIFIED_TO_SELF_FB_VERIFIED;
                            break;
                        case 18:
                            c0rv = C0RV.BLUE_MSG_UNVERIFIED_TO_BSP_PREMISE_VERIFIED;
                            break;
                        case 19:
                            c0rv = C0RV.BLUE_MSG_SELF_FB_UNVERIFIED_TO_BSP_PREMISE_VERIFIED;
                            break;
                        case C0M6.A01 /* 20 */:
                            c0rv = C0RV.BLUE_MSG_BSP_FB_UNVERIFIED_TO_BSP_PREMISE_VERIFIED;
                            break;
                        case 21:
                            c0rv = C0RV.BLUE_MSG_BSP_FB_TO_SELF_PREMISE;
                            break;
                        case 22:
                            c0rv = C0RV.BLUE_MSG_BSP_FB_TO_BSP_PREMISE;
                            break;
                        case 23:
                            c0rv = C0RV.BLUE_MSG_BSP_FB_TO_SELF_FB;
                            break;
                        case 24:
                            c0rv = C0RV.BLUE_MSG_SELF_FB_TO_SELF_PREMISE;
                            break;
                        case 25:
                            c0rv = C0RV.BLUE_MSG_SELF_FB_TO_BSP_PREMISE;
                            break;
                        case 26:
                            c0rv = C0RV.BLUE_MSG_SELF_PREMISE_TO_BSP_PREMISE;
                            break;
                        case 27:
                            c0rv = C0RV.BLUE_MSG_BSP_PREMISE_TO_SELF_PREMISE;
                            break;
                        case 28:
                            c0rv = C0RV.BLUE_MSG_TO_BSP_FB;
                            break;
                        case 29:
                            c0rv = C0RV.BLUE_MSG_TO_SELF_FB;
                            break;
                        case 30:
                            c0rv = C0RV.BLUE_MSG_CONSUMER_TO_SELF_PREMISE_UNVERIFIED;
                            break;
                        case 31:
                            c0rv = C0RV.BLUE_MSG_CONSUMER_TO_SELF_FB_UNVERIFIED;
                            break;
                        case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                            c0rv = C0RV.BLUE_MSG_CONSUMER_TO_BSP_PREMISE_UNVERIFIED;
                            break;
                        case 33:
                            c0rv = C0RV.BLUE_MSG_CONSUMER_TO_BSP_FB_UNVERIFIED;
                            break;
                        default:
                            c0rv = C0RV.BLUE_MSG_TO_CONSUMER;
                            break;
                    }
                    A09.A02();
                    C452821e.A0C((C452821e) A09.A00, c0rv);
                    String str = c452220y.A01;
                    if (!TextUtils.isEmpty(str)) {
                        A09.A05(str);
                    }
                } else {
                    throw null;
                }
            } else if (i != 30) {
                switch (i) {
                    case 0:
                        AbstractC005302j abstractC005302j8 = c451920u.A0A;
                        if (abstractC005302j8 != null) {
                            A092.A06(abstractC005302j8.getRawString());
                            C0RV c0rv9 = C0RV.GENERIC_NOTIFICATION;
                            A09.A02();
                            C452821e.A0C((C452821e) A09.A00, c0rv9);
                            break;
                        } else {
                            throw null;
                        }
                    case 1:
                        C0RV c0rv10 = C0RV.GROUP_CREATE;
                        A09.A02();
                        C452821e.A0C((C452821e) A09.A00, c0rv10);
                        AbstractC005302j abstractC005302j9 = c451920u.A09;
                        AbstractC000600i abstractC000600i7 = c451920u.A0S;
                        C451920u.A02(A09, A092, (AbstractC011105n) C451920u.A01(GroupJid.class, abstractC005302j9, "GROUP_CREATE", abstractC000600i7), (UserJid) C451920u.A01(UserJid.class, c451920u.A0A, "GROUP_CREATE", abstractC000600i7), c451920u.A0J);
                        break;
                    case 2:
                        C0RV c0rv11 = C0RV.GROUP_DELETE;
                        A09.A02();
                        C452821e.A0C((C452821e) A09.A00, c0rv11);
                        AbstractC005302j abstractC005302j10 = c451920u.A09;
                        AbstractC000600i abstractC000600i8 = c451920u.A0S;
                        C451920u.A02(A09, A092, (AbstractC011105n) C451920u.A01(GroupJid.class, abstractC005302j10, "GROUP_DELETE", abstractC000600i8), (UserJid) C451920u.A01(UserJid.class, c451920u.A0A, "GROUP_DELETE", abstractC000600i8), c451920u.A0J);
                        break;
                    case 3:
                        C0RV c0rv12 = C0RV.GROUP_PARTICIPANT_ADD;
                        A09.A02();
                        C452821e.A0C((C452821e) A09.A00, c0rv12);
                        AbstractC005302j abstractC005302j11 = c451920u.A09;
                        AbstractC000600i abstractC000600i9 = c451920u.A0S;
                        C451920u.A02(A09, A092, (AbstractC011105n) C451920u.A01(GroupJid.class, abstractC005302j11, "GROUP_PARTICIPANT_ADD", abstractC000600i9), (UserJid) C451920u.A01(UserJid.class, c451920u.A0A, "GROUP_PARTICIPANT_ADD", abstractC000600i9), c451920u.A0J);
                        break;
                    case 4:
                        C0RV c0rv13 = C0RV.GROUP_PARTICIPANT_REMOVE;
                        A09.A02();
                        C452821e.A0C((C452821e) A09.A00, c0rv13);
                        AbstractC005302j abstractC005302j12 = c451920u.A09;
                        AbstractC000600i abstractC000600i10 = c451920u.A0S;
                        C451920u.A02(A09, A092, (AbstractC011105n) C451920u.A01(GroupJid.class, abstractC005302j12, "GROUP_PARTICIPANT_REMOVE", abstractC000600i10), (UserJid) C451920u.A01(UserJid.class, c451920u.A0A, "GROUP_PARTICIPANT_REMOVE", abstractC000600i10), c451920u.A0J);
                        break;
                    case 5:
                        C0RV c0rv14 = C0RV.GROUP_PARTICIPANT_PROMOTE;
                        A09.A02();
                        C452821e.A0C((C452821e) A09.A00, c0rv14);
                        AbstractC005302j abstractC005302j13 = c451920u.A09;
                        AbstractC000600i abstractC000600i11 = c451920u.A0S;
                        C451920u.A02(A09, A092, (AbstractC011105n) C451920u.A01(GroupJid.class, abstractC005302j13, "GROUP_PARTICIPANT_PROMOTE", abstractC000600i11), (UserJid) C451920u.A01(UserJid.class, c451920u.A0A, "GROUP_PARTICIPANT_PROMOTE", abstractC000600i11), c451920u.A0J);
                        break;
                    case 6:
                        C0RV c0rv15 = C0RV.GROUP_PARTICIPANT_DEMOTE;
                        A09.A02();
                        C452821e.A0C((C452821e) A09.A00, c0rv15);
                        AbstractC005302j abstractC005302j14 = c451920u.A09;
                        AbstractC000600i abstractC000600i12 = c451920u.A0S;
                        C451920u.A02(A09, A092, (AbstractC011105n) C451920u.A01(GroupJid.class, abstractC005302j14, "GROUP_PARTICIPANT_DEMOTE", abstractC000600i12), (UserJid) C451920u.A01(UserJid.class, c451920u.A0A, "GROUP_PARTICIPANT_DEMOTE", abstractC000600i12), c451920u.A0J);
                        break;
                    case 7:
                        C0RV c0rv16 = C0RV.GROUP_PARTICIPANT_LEAVE;
                        A09.A02();
                        C452821e.A0C((C452821e) A09.A00, c0rv16);
                        AbstractC005302j abstractC005302j15 = c451920u.A09;
                        AbstractC000600i abstractC000600i13 = c451920u.A0S;
                        C451920u.A02(A09, A092, (AbstractC011105n) C451920u.A01(GroupJid.class, abstractC005302j15, "GROUP_PARTICIPANT_LEAVE", abstractC000600i13), (UserJid) C451920u.A01(UserJid.class, c451920u.A0A, "GROUP_PARTICIPANT_LEAVE", abstractC000600i13), c451920u.A0J);
                        break;
                    case 8:
                        C0RV c0rv17 = C0RV.GROUP_CHANGE_ICON;
                        A09.A02();
                        C452821e.A0C((C452821e) A09.A00, c0rv17);
                        AbstractC005302j abstractC005302j16 = c451920u.A09;
                        AbstractC000600i abstractC000600i14 = c451920u.A0S;
                        C451920u.A02(A09, A092, (AbstractC011105n) C451920u.A01(GroupJid.class, abstractC005302j16, "GROUP_CHANGE_ICON", abstractC000600i14), (UserJid) C451920u.A01(UserJid.class, c451920u.A0A, "GROUP_CHANGE_ICON", abstractC000600i14), Arrays.asList(new String[0]));
                        String str2 = c451920u.A0G;
                        if (str2 == null) {
                            str2 = "remove";
                        }
                        A09.A02();
                        C452821e.A0D((C452821e) A09.A00, str2);
                        break;
                    case 9:
                        C0RV c0rv18 = C0RV.GROUP_PARTICIPANT_CHANGE_NUMBER;
                        A09.A02();
                        C452821e.A0C((C452821e) A09.A00, c0rv18);
                        AbstractC005302j abstractC005302j17 = c451920u.A09;
                        AbstractC000600i abstractC000600i15 = c451920u.A0S;
                        C451920u.A02(A09, A092, (AbstractC011105n) C451920u.A01(GroupJid.class, abstractC005302j17, "GROUP_PARTICIPANT_CHANGE_NUMBER", abstractC000600i15), (UserJid) C451920u.A01(UserJid.class, c451920u.A0A, "GROUP_PARTICIPANT_CHANGE_NUMBER", abstractC000600i15), c451920u.A0J);
                        break;
                    case 10:
                        C0RV c0rv19 = C0RV.GROUP_CHANGE_SUBJECT;
                        A09.A02();
                        C452821e.A0C((C452821e) A09.A00, c0rv19);
                        AbstractC005302j abstractC005302j18 = c451920u.A09;
                        AbstractC000600i abstractC000600i16 = c451920u.A0S;
                        C451920u.A02(A09, A092, (AbstractC011105n) C451920u.A01(GroupJid.class, abstractC005302j18, "GROUP_CHANGE_SUBJECT", abstractC000600i16), (UserJid) C451920u.A01(UserJid.class, c451920u.A0A, "GROUP_CHANGE_SUBJECT", abstractC000600i16), Arrays.asList(new String[0]));
                        A09.A05(c451920u.A0G);
                        break;
                    case GoogleMigrateImporterActivity.A0E /* 11 */:
                        AbstractC005302j abstractC005302j19 = c451920u.A09;
                        if (abstractC005302j19 != null) {
                            A092.A06(abstractC005302j19.getRawString());
                            C0RV c0rv20 = C0RV.BROADCAST_CREATE;
                            A09.A02();
                            C452821e.A0C((C452821e) A09.A00, c0rv20);
                            A09.A05(Integer.toString(c451920u.A01));
                            break;
                        } else {
                            throw null;
                        }
                    case 12:
                        C0RV c0rv21 = C0RV.BROADCAST_ADD;
                        A09.A02();
                        C452821e.A0C((C452821e) A09.A00, c0rv21);
                        AbstractC005302j abstractC005302j20 = c451920u.A09;
                        AbstractC000600i abstractC000600i17 = c451920u.A0S;
                        C451920u.A02(A09, A092, (AbstractC011105n) C451920u.A01(C0I1.class, abstractC005302j20, "BROADCAST_ADD", abstractC000600i17), (UserJid) C451920u.A01(UserJid.class, c451920u.A0A, "BROADCAST_ADD", abstractC000600i17), c451920u.A0J);
                        break;
                    case 13:
                        C0RV c0rv22 = C0RV.BROADCAST_REMOVE;
                        A09.A02();
                        C452821e.A0C((C452821e) A09.A00, c0rv22);
                        AbstractC005302j abstractC005302j21 = c451920u.A09;
                        AbstractC000600i abstractC000600i18 = c451920u.A0S;
                        C451920u.A02(A09, A092, (AbstractC011105n) C451920u.A01(C0I1.class, abstractC005302j21, "BROADCAST_REMOVE", abstractC000600i18), (UserJid) C451920u.A01(UserJid.class, c451920u.A0A, "BROADCAST_REMOVE", abstractC000600i18), c451920u.A0J);
                        break;
                    case 14:
                        AbstractC005302j abstractC005302j22 = c451920u.A09;
                        if (abstractC005302j22 != null) {
                            A092.A06(abstractC005302j22.getRawString());
                            C0RV c0rv23 = C0RV.E2E_IDENTITY_CHANGED;
                            A09.A02();
                            C452821e.A0C((C452821e) A09.A00, c0rv23);
                            AbstractC005302j abstractC005302j23 = c451920u.A0A;
                            if (abstractC005302j23 != null) {
                                A09.A05(abstractC005302j23.getRawString());
                                break;
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    case 15:
                        AbstractC005302j abstractC005302j24 = c451920u.A09;
                        if (abstractC005302j24 != null) {
                            A092.A06(abstractC005302j24.getRawString());
                            C21A c21a = (C21A) c451920u;
                            switch (c21a.A00) {
                                case 1:
                                    c0rv2 = C0RV.BLUE_MSG_BSP_PREMISE_VERIFIED;
                                    break;
                                case 2:
                                    c0rv2 = C0RV.BLUE_MSG_SELF_FB_VERIFIED;
                                    break;
                                case 3:
                                    c0rv2 = C0RV.BLUE_MSG_BSP_FB_VERIFIED;
                                    break;
                                case 4:
                                    c0rv2 = C0RV.BLUE_MSG_BSP_PREMISE_UNVERIFIED;
                                    break;
                                case 5:
                                    c0rv2 = C0RV.BLUE_MSG_SELF_FB_UNVERIFIED;
                                    break;
                                case 6:
                                    c0rv2 = C0RV.BLUE_MSG_BSP_FB_UNVERIFIED;
                                    break;
                                default:
                                    c0rv2 = C0RV.E2E_ENCRYPTED;
                                    break;
                            }
                            A09.A02();
                            C452821e.A0C((C452821e) A09.A00, c0rv2);
                            if (!TextUtils.isEmpty(c21a.A01)) {
                                A09.A05(c21a.A01);
                                break;
                            }
                        } else {
                            throw null;
                        }
                        break;
                    case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                        C20t c20t = (C20t) c451920u;
                        AbstractC005302j abstractC005302j25 = c20t.A0A;
                        if (abstractC005302j25 != null) {
                            A092.A06(abstractC005302j25.getRawString());
                            C0RV c0rv24 = c20t.A00;
                            A09.A02();
                            C452821e.A0C((C452821e) A09.A00, c0rv24);
                            A09.A04(c20t.A08);
                            break;
                        } else {
                            throw null;
                        }
                    case 17:
                        C0RV c0rv25 = C0RV.GROUP_PARTICIPANT_INVITE;
                        A09.A02();
                        C452821e.A0C((C452821e) A09.A00, c0rv25);
                        AbstractC005302j abstractC005302j26 = c451920u.A09;
                        AbstractC000600i abstractC000600i19 = c451920u.A0S;
                        C451920u.A02(A09, A092, (AbstractC011105n) C451920u.A01(GroupJid.class, abstractC005302j26, "GROUP_PARTICIPANT_INVITE", abstractC000600i19), (UserJid) C451920u.A01(UserJid.class, c451920u.A0A, "GROUP_PARTICIPANT_INVITE", abstractC000600i19), c451920u.A0J);
                        break;
                    case 18:
                        C0RV c0rv26 = C0RV.GROUP_CHANGE_INVITE_LINK;
                        A09.A02();
                        C452821e.A0C((C452821e) A09.A00, c0rv26);
                        AbstractC005302j abstractC005302j27 = c451920u.A09;
                        AbstractC000600i abstractC000600i20 = c451920u.A0S;
                        C451920u.A02(A09, A092, (AbstractC011105n) C451920u.A01(GroupJid.class, abstractC005302j27, "GROUP_CHANGE_INVITE_LINK", abstractC000600i20), (UserJid) C451920u.A01(UserJid.class, c451920u.A0A, "GROUP_CHANGE_INVITE_LINK", abstractC000600i20), Arrays.asList(new String[0]));
                        break;
                    case 19:
                        C0RV c0rv27 = C0RV.GROUP_CHANGE_DESCRIPTION;
                        A09.A02();
                        C452821e.A0C((C452821e) A09.A00, c0rv27);
                        AbstractC005302j abstractC005302j28 = c451920u.A09;
                        AbstractC000600i abstractC000600i21 = c451920u.A0S;
                        C451920u.A02(A09, A092, (AbstractC011105n) C451920u.A01(GroupJid.class, abstractC005302j28, "GROUP_CHANGE_DESCRIPTION", abstractC000600i21), (UserJid) C451920u.A01(UserJid.class, c451920u.A0A, "GROUP_CHANGE_DESCRIPTION", abstractC000600i21), Arrays.asList(new String[0]));
                        break;
                }
            } else {
                AbstractC005302j abstractC005302j29 = c451920u.A09;
                if (abstractC005302j29 != null) {
                    A092.A06(abstractC005302j29.getRawString());
                    C0RV c0rv28 = ((C452020w) c451920u).A00 ? C0RV.E2E_ENCRYPTED_NOW : C0RV.E2E_IDENTITY_UNAVAILABLE;
                    A09.A02();
                    C452821e.A0C((C452821e) A09.A00, c0rv28);
                } else {
                    throw null;
                }
            }
        } else {
            AnonymousClass210 anonymousClass210 = (AnonymousClass210) c451920u;
            AbstractC005302j abstractC005302j30 = anonymousClass210.A09;
            if (abstractC005302j30 != null) {
                A092.A06(abstractC005302j30.getRawString());
                C0RV c0rv29 = C0RV.E2E_DEVICE_CHANGED;
                A09.A02();
                C452821e.A0C((C452821e) A09.A00, c0rv29);
                AbstractC005302j abstractC005302j31 = anonymousClass210.A0A;
                if (abstractC005302j31 != null) {
                    A09.A05(abstractC005302j31.getRawString());
                    A09.A05(String.valueOf(anonymousClass210.A00));
                    A09.A05(String.valueOf(anonymousClass210.A01));
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        A09.A02();
        C452821e.A0B((C452821e) A09.A00, (C452421a) A092.A01());
        return A09;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("[id: ");
        A0P.append(this.A0D);
        A0P.append(" jid: ");
        A0P.append(this.A0A);
        A0P.append(" relay: ");
        A0P.append(this.A0V);
        A0P.append("]");
        return A0P.toString();
    }
}
