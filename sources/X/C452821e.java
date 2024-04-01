package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.IOException;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.21e */
/* loaded from: classes2.dex */
public final class C452821e extends C0AZ implements C0AY {
    public static final C452821e A0V;
    public static volatile C0RQ A0W;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A07;
    public long A08;
    public C0CX A0A;
    public C0CX A0B;
    public C21Y A0C;
    public C40531sQ A0D;
    public C452421a A0E;
    public C24A A0F;
    public C21Z A0G;
    public C21Z A0H;
    public C2GD A0I;
    public String A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public byte A00 = -1;
    public int A06 = 1;
    public String A0J = "";
    public String A0K = "";
    public C0AN A09 = C0AN.A01;

    static {
        C452821e c452821e = new C452821e();
        A0V = c452821e;
        c452821e.A0E();
    }

    public C452821e() {
        C0RU c0ru = C0RU.A01;
        this.A0B = c0ru;
        this.A0A = c0ru;
        this.A0L = "";
    }

    public static C0KA A09() {
        return (C0KA) A0V.AVX();
    }

    public static void A0A(C452821e c452821e, C452521b c452521b) {
        if (c452821e != null) {
            c452821e.A0E = (C452421a) c452521b.A01();
            c452821e.A01 |= 1;
            return;
        }
        throw null;
    }

    public static void A0B(C452821e c452821e, C452421a c452421a) {
        if (c452421a != null) {
            c452821e.A0E = c452421a;
            c452821e.A01 |= 1;
            return;
        }
        throw null;
    }

    public static void A0C(C452821e c452821e, C0RV c0rv) {
        if (c0rv != null) {
            c452821e.A01 |= 8192;
            c452821e.A05 = c0rv.value;
            return;
        }
        throw null;
    }

    public static void A0D(C452821e c452821e, String str) {
        if (str != null) {
            C0CX c0cx = c452821e.A0B;
            if (!((C0CY) c0cx).A00) {
                c0cx = C0AZ.A05(c0cx);
                c452821e.A0B = c0cx;
            }
            c0cx.add(str);
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C2GI c2gi;
        C2GH c2gh;
        C2GG c2gg;
        C2GF c2gf;
        C21X c21x;
        C2GF c2gf2;
        C0RV c0rv;
        C2GE c2ge;
        C40541sR c40541sR;
        C452521b c452521b;
        int ordinal = c0rl.ordinal();
        int i = 4194304;
        int i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
        switch (ordinal) {
            case 0:
                byte b = this.A00;
                if (b == 1) {
                    return A0V;
                }
                if (b == 0) {
                    return null;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if ((this.A01 & 1) == 1) {
                    if (booleanValue) {
                        this.A00 = (byte) 1;
                    }
                    return A0V;
                }
                if (booleanValue) {
                    this.A00 = (byte) 0;
                }
                return null;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C452821e c452821e = (C452821e) obj2;
                this.A0E = (C452421a) c0rm.AW9(this.A0E, c452821e.A0E);
                this.A0D = (C40531sQ) c0rm.AW9(this.A0D, c452821e.A0D);
                int i3 = this.A01;
                boolean z = (i3 & 4) == 4;
                long j = this.A08;
                int i4 = c452821e.A01;
                this.A08 = c0rm.AW8(z, j, (i4 & 4) == 4, c452821e.A08);
                this.A06 = c0rm.AW5((i3 & 8) == 8, this.A06, (i4 & 8) == 8, c452821e.A06);
                this.A0J = c0rm.AWD((i3 & 16) == 16, this.A0J, (i4 & 16) == 16, c452821e.A0J);
                this.A0Q = c0rm.AW1((i3 & 32) == 32, this.A0Q, (i4 & 32) == 32, c452821e.A0Q);
                this.A0S = c0rm.AW1((i3 & 64) == 64, this.A0S, (i4 & 64) == 64, c452821e.A0S);
                this.A0M = c0rm.AW1((i3 & 128) == 128, this.A0M, (i4 & 128) == 128, c452821e.A0M);
                this.A0K = c0rm.AWD((i3 & 256) == 256, this.A0K, (i4 & 256) == 256, c452821e.A0K);
                this.A09 = c0rm.AW2((i3 & 512) == 512, this.A09, (i4 & 512) == 512, c452821e.A09);
                int i5 = this.A01;
                boolean z2 = (i5 & 1024) == 1024;
                boolean z3 = this.A0R;
                int i6 = c452821e.A01;
                this.A0R = c0rm.AW1(z2, z3, (i6 & 1024) == 1024, c452821e.A0R);
                this.A0U = c0rm.AW1((i5 & 2048) == 2048, this.A0U, (i6 & 2048) == 2048, c452821e.A0U);
                this.A0T = c0rm.AW1((i5 & 4096) == 4096, this.A0T, (i6 & 4096) == 4096, c452821e.A0T);
                this.A05 = c0rm.AW5((i5 & 8192) == 8192, this.A05, (i6 & 8192) == 8192, c452821e.A05);
                this.A0N = c0rm.AW1((i5 & 16384) == 16384, this.A0N, (i6 & 16384) == 16384, c452821e.A0N);
                this.A0B = c0rm.AW7(this.A0B, c452821e.A0B);
                this.A03 = c0rm.AW5((this.A01 & 32768) == 32768, this.A03, (c452821e.A01 & 32768) == 32768, c452821e.A03);
                this.A0A = c0rm.AW7(this.A0A, c452821e.A0A);
                this.A0G = (C21Z) c0rm.AW9(this.A0G, c452821e.A0G);
                this.A0C = (C21Y) c0rm.AW9(this.A0C, c452821e.A0C);
                this.A0H = (C21Z) c0rm.AW9(this.A0H, c452821e.A0H);
                int i7 = this.A01;
                boolean z4 = (i7 & 524288) == 524288;
                long j2 = this.A07;
                int i8 = c452821e.A01;
                this.A07 = c0rm.AW8(z4, j2, (i8 & 524288) == 524288, c452821e.A07);
                this.A04 = c0rm.AW5((i7 & 1048576) == 1048576, this.A04, (i8 & 1048576) == 1048576, c452821e.A04);
                this.A0O = c0rm.AW1((i7 & 2097152) == 2097152, this.A0O, (i8 & 2097152) == 2097152, c452821e.A0O);
                this.A0P = c0rm.AW1((i7 & 4194304) == 4194304, this.A0P, (i8 & 4194304) == 4194304, c452821e.A0P);
                this.A02 = c0rm.AW5((i7 & 8388608) == 8388608, this.A02, (i8 & 8388608) == 8388608, c452821e.A02);
                this.A0L = c0rm.AWD((i7 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 16777216, this.A0L, (i8 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 16777216, c452821e.A0L);
                this.A0F = (C24A) c0rm.AW9(this.A0F, c452821e.A0F);
                this.A0I = (C2GD) c0rm.AW9(this.A0I, c452821e.A0I);
                if (c0rm == C0RN.A00) {
                    this.A01 |= c452821e.A01;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                boolean z5 = false;
                while (!z5) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            switch (A03) {
                                case 0:
                                    break;
                                case 10:
                                    if ((this.A01 & 1) == 1) {
                                        c452521b = (C452521b) this.A0E.AVX();
                                    } else {
                                        c452521b = null;
                                    }
                                    C452421a c452421a = (C452421a) c0ro.A09(C452421a.A05.A0C(), c0rp);
                                    this.A0E = c452421a;
                                    if (c452521b != null) {
                                        c452521b.A03(c452421a);
                                        this.A0E = (C452421a) c452521b.A00();
                                    }
                                    this.A01 |= 1;
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 18:
                                    if ((this.A01 & 2) == 2) {
                                        c40541sR = (C40541sR) this.A0D.AVX();
                                    } else {
                                        c40541sR = null;
                                    }
                                    C40531sQ c40531sQ = (C40531sQ) c0ro.A09(C40531sQ.A0c.A0C(), c0rp);
                                    this.A0D = c40531sQ;
                                    if (c40541sR != null) {
                                        c40541sR.A03(c40531sQ);
                                        this.A0D = (C40531sQ) c40541sR.A00();
                                    }
                                    this.A01 |= 2;
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 24:
                                    this.A01 |= 4;
                                    this.A08 = c0ro.A06();
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                                    int A02 = c0ro.A02();
                                    if (A02 == 0) {
                                        c2ge = C2GE.ERROR;
                                    } else if (A02 == 1) {
                                        c2ge = C2GE.PENDING;
                                    } else if (A02 == 2) {
                                        c2ge = C2GE.SERVER_ACK;
                                    } else if (A02 == 3) {
                                        c2ge = C2GE.DELIVERY_ACK;
                                    } else if (A02 != 4) {
                                        c2ge = A02 != 5 ? null : C2GE.PLAYED;
                                    } else {
                                        c2ge = C2GE.READ;
                                    }
                                    if (c2ge == null) {
                                        super.A0F(4, A02);
                                        continue;
                                    } else {
                                        this.A01 |= 8;
                                        this.A06 = A02;
                                    }
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 42:
                                    String A0A = c0ro.A0A();
                                    this.A01 |= 16;
                                    this.A0J = A0A;
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 128:
                                    this.A01 |= 32;
                                    this.A0Q = c0ro.A0F();
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 136:
                                    this.A01 |= 64;
                                    this.A0S = c0ro.A0F();
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /* 144 */:
                                    this.A01 |= 128;
                                    this.A0M = c0ro.A0F();
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 154:
                                    String A0A2 = c0ro.A0A();
                                    this.A01 |= 256;
                                    this.A0K = A0A2;
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 162:
                                    this.A01 |= 512;
                                    this.A09 = c0ro.A08();
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 168:
                                    this.A01 |= 1024;
                                    this.A0R = c0ro.A0F();
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /* 176 */:
                                    this.A01 |= 2048;
                                    this.A0U = c0ro.A0F();
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 184:
                                    this.A01 |= 4096;
                                    this.A0T = c0ro.A0F();
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 192:
                                    int A022 = c0ro.A02();
                                    switch (A022) {
                                        case 0:
                                            c0rv = C0RV.UNKNOWN;
                                            break;
                                        case 1:
                                            c0rv = C0RV.REVOKE;
                                            break;
                                        case 2:
                                            c0rv = C0RV.CIPHERTEXT;
                                            break;
                                        case 3:
                                            c0rv = C0RV.FUTUREPROOF;
                                            break;
                                        case 4:
                                            c0rv = C0RV.NON_VERIFIED_TRANSITION;
                                            break;
                                        case 5:
                                            c0rv = C0RV.UNVERIFIED_TRANSITION;
                                            break;
                                        case 6:
                                            c0rv = C0RV.VERIFIED_TRANSITION;
                                            break;
                                        case 7:
                                            c0rv = C0RV.VERIFIED_LOW_UNKNOWN;
                                            break;
                                        case 8:
                                            c0rv = C0RV.VERIFIED_HIGH;
                                            break;
                                        case 9:
                                            c0rv = C0RV.VERIFIED_INITIAL_UNKNOWN;
                                            break;
                                        case 10:
                                            c0rv = C0RV.VERIFIED_INITIAL_LOW;
                                            break;
                                        case GoogleMigrateImporterActivity.A0E /* 11 */:
                                            c0rv = C0RV.VERIFIED_INITIAL_HIGH;
                                            break;
                                        case 12:
                                            c0rv = C0RV.VERIFIED_TRANSITION_ANY_TO_NONE;
                                            break;
                                        case 13:
                                            c0rv = C0RV.VERIFIED_TRANSITION_ANY_TO_HIGH;
                                            break;
                                        case 14:
                                            c0rv = C0RV.VERIFIED_TRANSITION_HIGH_TO_LOW;
                                            break;
                                        case 15:
                                            c0rv = C0RV.VERIFIED_TRANSITION_HIGH_TO_UNKNOWN;
                                            break;
                                        case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                                            c0rv = C0RV.VERIFIED_TRANSITION_UNKNOWN_TO_LOW;
                                            break;
                                        case 17:
                                            c0rv = C0RV.VERIFIED_TRANSITION_LOW_TO_UNKNOWN;
                                            break;
                                        case 18:
                                            c0rv = C0RV.VERIFIED_TRANSITION_NONE_TO_LOW;
                                            break;
                                        case 19:
                                            c0rv = C0RV.VERIFIED_TRANSITION_NONE_TO_UNKNOWN;
                                            break;
                                        case C0M6.A01 /* 20 */:
                                            c0rv = C0RV.GROUP_CREATE;
                                            break;
                                        case 21:
                                            c0rv = C0RV.GROUP_CHANGE_SUBJECT;
                                            break;
                                        case 22:
                                            c0rv = C0RV.GROUP_CHANGE_ICON;
                                            break;
                                        case 23:
                                            c0rv = C0RV.GROUP_CHANGE_INVITE_LINK;
                                            break;
                                        case 24:
                                            c0rv = C0RV.GROUP_CHANGE_DESCRIPTION;
                                            break;
                                        case 25:
                                            c0rv = C0RV.GROUP_CHANGE_RESTRICT;
                                            break;
                                        case 26:
                                            c0rv = C0RV.GROUP_CHANGE_ANNOUNCE;
                                            break;
                                        case 27:
                                            c0rv = C0RV.GROUP_PARTICIPANT_ADD;
                                            break;
                                        case 28:
                                            c0rv = C0RV.GROUP_PARTICIPANT_REMOVE;
                                            break;
                                        case 29:
                                            c0rv = C0RV.GROUP_PARTICIPANT_PROMOTE;
                                            break;
                                        case 30:
                                            c0rv = C0RV.GROUP_PARTICIPANT_DEMOTE;
                                            break;
                                        case 31:
                                            c0rv = C0RV.GROUP_PARTICIPANT_INVITE;
                                            break;
                                        case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                                            c0rv = C0RV.GROUP_PARTICIPANT_LEAVE;
                                            break;
                                        case 33:
                                            c0rv = C0RV.GROUP_PARTICIPANT_CHANGE_NUMBER;
                                            break;
                                        case 34:
                                            c0rv = C0RV.BROADCAST_CREATE;
                                            break;
                                        case 35:
                                            c0rv = C0RV.BROADCAST_ADD;
                                            break;
                                        case 36:
                                            c0rv = C0RV.BROADCAST_REMOVE;
                                            break;
                                        case 37:
                                            c0rv = C0RV.GENERIC_NOTIFICATION;
                                            break;
                                        case 38:
                                            c0rv = C0RV.E2E_IDENTITY_CHANGED;
                                            break;
                                        case 39:
                                            c0rv = C0RV.E2E_ENCRYPTED;
                                            break;
                                        case 40:
                                            c0rv = C0RV.CALL_MISSED_VOICE;
                                            break;
                                        case 41:
                                            c0rv = C0RV.CALL_MISSED_VIDEO;
                                            break;
                                        case 42:
                                            c0rv = C0RV.INDIVIDUAL_CHANGE_NUMBER;
                                            break;
                                        case 43:
                                            c0rv = C0RV.GROUP_DELETE;
                                            break;
                                        case 44:
                                            c0rv = C0RV.GROUP_ANNOUNCE_MODE_MESSAGE_BOUNCE;
                                            break;
                                        case 45:
                                            c0rv = C0RV.CALL_MISSED_GROUP_VOICE;
                                            break;
                                        case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
                                            c0rv = C0RV.CALL_MISSED_GROUP_VIDEO;
                                            break;
                                        case 47:
                                            c0rv = C0RV.PAYMENT_CIPHERTEXT;
                                            break;
                                        case 48:
                                            c0rv = C0RV.PAYMENT_FUTUREPROOF;
                                            break;
                                        case 49:
                                            c0rv = C0RV.PAYMENT_TRANSACTION_STATUS_UPDATE_FAILED;
                                            break;
                                        case 50:
                                            c0rv = C0RV.PAYMENT_TRANSACTION_STATUS_UPDATE_REFUNDED;
                                            break;
                                        case 51:
                                            c0rv = C0RV.PAYMENT_TRANSACTION_STATUS_UPDATE_REFUND_FAILED;
                                            break;
                                        case 52:
                                            c0rv = C0RV.PAYMENT_TRANSACTION_STATUS_RECEIVER_PENDING_SETUP;
                                            break;
                                        case 53:
                                            c0rv = C0RV.PAYMENT_TRANSACTION_STATUS_RECEIVER_SUCCESS_AFTER_HICCUP;
                                            break;
                                        case 54:
                                            c0rv = C0RV.PAYMENT_ACTION_ACCOUNT_SETUP_REMINDER;
                                            break;
                                        case 55:
                                            c0rv = C0RV.PAYMENT_ACTION_SEND_PAYMENT_REMINDER;
                                            break;
                                        case 56:
                                            c0rv = C0RV.PAYMENT_ACTION_SEND_PAYMENT_INVITATION;
                                            break;
                                        case 57:
                                            c0rv = C0RV.PAYMENT_ACTION_REQUEST_DECLINED;
                                            break;
                                        case 58:
                                            c0rv = C0RV.PAYMENT_ACTION_REQUEST_EXPIRED;
                                            break;
                                        case 59:
                                            c0rv = C0RV.PAYMENT_ACTION_REQUEST_CANCELLED;
                                            break;
                                        case 60:
                                            c0rv = C0RV.BIZ_VERIFIED_TRANSITION_TOP_TO_BOTTOM;
                                            break;
                                        case 61:
                                            c0rv = C0RV.BIZ_VERIFIED_TRANSITION_BOTTOM_TO_TOP;
                                            break;
                                        case 62:
                                            c0rv = C0RV.BIZ_INTRO_TOP;
                                            break;
                                        case 63:
                                            c0rv = C0RV.BIZ_INTRO_BOTTOM;
                                            break;
                                        case 64:
                                            c0rv = C0RV.BIZ_NAME_CHANGE;
                                            break;
                                        case 65:
                                            c0rv = C0RV.BIZ_MOVE_TO_CONSUMER_APP;
                                            break;
                                        case 66:
                                            c0rv = C0RV.BIZ_TWO_TIER_MIGRATION_TOP;
                                            break;
                                        case 67:
                                            c0rv = C0RV.BIZ_TWO_TIER_MIGRATION_BOTTOM;
                                            break;
                                        case 68:
                                            c0rv = C0RV.OVERSIZED;
                                            break;
                                        case 69:
                                            c0rv = C0RV.GROUP_CHANGE_NO_FREQUENTLY_FORWARDED;
                                            break;
                                        case 70:
                                            c0rv = C0RV.GROUP_V4_ADD_INVITE_SENT;
                                            break;
                                        case 71:
                                            c0rv = C0RV.GROUP_PARTICIPANT_ADD_REQUEST_JOIN;
                                            break;
                                        case C0M6.A02 /* 72 */:
                                            c0rv = C0RV.CHANGE_EPHEMERAL_SETTING;
                                            break;
                                        case 73:
                                            c0rv = C0RV.E2E_DEVICE_CHANGED;
                                            break;
                                        case 74:
                                            c0rv = C0RV.VIEWED_ONCE;
                                            break;
                                        case 75:
                                            c0rv = C0RV.E2E_ENCRYPTED_NOW;
                                            break;
                                        case 76:
                                            c0rv = C0RV.BLUE_MSG_BSP_FB_TO_BSP_PREMISE;
                                            break;
                                        case 77:
                                            c0rv = C0RV.BLUE_MSG_BSP_FB_TO_SELF_FB;
                                            break;
                                        case 78:
                                            c0rv = C0RV.BLUE_MSG_BSP_FB_TO_SELF_PREMISE;
                                            break;
                                        case 79:
                                            c0rv = C0RV.BLUE_MSG_BSP_FB_UNVERIFIED;
                                            break;
                                        case 80:
                                            c0rv = C0RV.BLUE_MSG_BSP_FB_UNVERIFIED_TO_SELF_PREMISE_VERIFIED;
                                            break;
                                        case 81:
                                            c0rv = C0RV.BLUE_MSG_BSP_FB_VERIFIED;
                                            break;
                                        case 82:
                                            c0rv = C0RV.BLUE_MSG_BSP_FB_VERIFIED_TO_SELF_PREMISE_UNVERIFIED;
                                            break;
                                        case 83:
                                            c0rv = C0RV.BLUE_MSG_BSP_PREMISE_TO_SELF_PREMISE;
                                            break;
                                        case 84:
                                            c0rv = C0RV.BLUE_MSG_BSP_PREMISE_UNVERIFIED;
                                            break;
                                        case 85:
                                            c0rv = C0RV.BLUE_MSG_BSP_PREMISE_UNVERIFIED_TO_SELF_PREMISE_VERIFIED;
                                            break;
                                        case 86:
                                            c0rv = C0RV.BLUE_MSG_BSP_PREMISE_VERIFIED;
                                            break;
                                        case 87:
                                            c0rv = C0RV.BLUE_MSG_BSP_PREMISE_VERIFIED_TO_SELF_PREMISE_UNVERIFIED;
                                            break;
                                        case 88:
                                            c0rv = C0RV.BLUE_MSG_CONSUMER_TO_BSP_FB_UNVERIFIED;
                                            break;
                                        case 89:
                                            c0rv = C0RV.BLUE_MSG_CONSUMER_TO_BSP_PREMISE_UNVERIFIED;
                                            break;
                                        case 90:
                                            c0rv = C0RV.BLUE_MSG_CONSUMER_TO_SELF_FB_UNVERIFIED;
                                            break;
                                        case 91:
                                            c0rv = C0RV.BLUE_MSG_CONSUMER_TO_SELF_PREMISE_UNVERIFIED;
                                            break;
                                        case 92:
                                            c0rv = C0RV.BLUE_MSG_SELF_FB_TO_BSP_PREMISE;
                                            break;
                                        case 93:
                                            c0rv = C0RV.BLUE_MSG_SELF_FB_TO_SELF_PREMISE;
                                            break;
                                        case 94:
                                            c0rv = C0RV.BLUE_MSG_SELF_FB_UNVERIFIED;
                                            break;
                                        case 95:
                                            c0rv = C0RV.BLUE_MSG_SELF_FB_UNVERIFIED_TO_SELF_PREMISE_VERIFIED;
                                            break;
                                        case 96:
                                            c0rv = C0RV.BLUE_MSG_SELF_FB_VERIFIED;
                                            break;
                                        case 97:
                                            c0rv = C0RV.BLUE_MSG_SELF_FB_VERIFIED_TO_SELF_PREMISE_UNVERIFIED;
                                            break;
                                        case 98:
                                            c0rv = C0RV.BLUE_MSG_SELF_PREMISE_TO_BSP_PREMISE;
                                            break;
                                        case 99:
                                            c0rv = C0RV.BLUE_MSG_SELF_PREMISE_UNVERIFIED;
                                            break;
                                        case C42311vX.A0A /* 100 */:
                                            c0rv = C0RV.BLUE_MSG_SELF_PREMISE_VERIFIED;
                                            break;
                                        case 101:
                                            c0rv = C0RV.BLUE_MSG_TO_BSP_FB;
                                            break;
                                        case 102:
                                            c0rv = C0RV.BLUE_MSG_TO_CONSUMER;
                                            break;
                                        case 103:
                                            c0rv = C0RV.BLUE_MSG_TO_SELF_FB;
                                            break;
                                        case 104:
                                            c0rv = C0RV.BLUE_MSG_UNVERIFIED_TO_BSP_FB_VERIFIED;
                                            break;
                                        case 105:
                                            c0rv = C0RV.BLUE_MSG_UNVERIFIED_TO_BSP_PREMISE_VERIFIED;
                                            break;
                                        case 106:
                                            c0rv = C0RV.BLUE_MSG_UNVERIFIED_TO_SELF_FB_VERIFIED;
                                            break;
                                        case 107:
                                            c0rv = C0RV.BLUE_MSG_UNVERIFIED_TO_VERIFIED;
                                            break;
                                        case C0M6.A03 /* 108 */:
                                            c0rv = C0RV.BLUE_MSG_VERIFIED_TO_BSP_FB_UNVERIFIED;
                                            break;
                                        case 109:
                                            c0rv = C0RV.BLUE_MSG_VERIFIED_TO_BSP_PREMISE_UNVERIFIED;
                                            break;
                                        case 110:
                                            c0rv = C0RV.BLUE_MSG_VERIFIED_TO_SELF_FB_UNVERIFIED;
                                            break;
                                        case 111:
                                            c0rv = C0RV.BLUE_MSG_VERIFIED_TO_UNVERIFIED;
                                            break;
                                        case 112:
                                            c0rv = C0RV.BLUE_MSG_BSP_FB_UNVERIFIED_TO_BSP_PREMISE_VERIFIED;
                                            break;
                                        case 113:
                                            c0rv = C0RV.BLUE_MSG_BSP_FB_UNVERIFIED_TO_SELF_FB_VERIFIED;
                                            break;
                                        case 114:
                                            c0rv = C0RV.BLUE_MSG_BSP_FB_VERIFIED_TO_BSP_PREMISE_UNVERIFIED;
                                            break;
                                        case 115:
                                            c0rv = C0RV.BLUE_MSG_BSP_FB_VERIFIED_TO_SELF_FB_UNVERIFIED;
                                            break;
                                        case 116:
                                            c0rv = C0RV.BLUE_MSG_SELF_FB_UNVERIFIED_TO_BSP_PREMISE_VERIFIED;
                                            break;
                                        case 117:
                                            c0rv = C0RV.BLUE_MSG_SELF_FB_VERIFIED_TO_BSP_PREMISE_UNVERIFIED;
                                            break;
                                        case 118:
                                            c0rv = C0RV.E2E_IDENTITY_UNAVAILABLE;
                                            break;
                                        case 119:
                                            c0rv = C0RV.GROUP_CREATING;
                                            break;
                                        case 120:
                                            c0rv = C0RV.GROUP_CREATE_FAILED;
                                            break;
                                        case 121:
                                            c0rv = C0RV.GROUP_BOUNCED;
                                            break;
                                        case 122:
                                            c0rv = C0RV.BLOCK_CONTACT;
                                            break;
                                        case 123:
                                            c0rv = C0RV.EPHEMERAL_SETTING_NOT_APPLIED;
                                            break;
                                        case 124:
                                            c0rv = C0RV.SYNC_FAILED;
                                            break;
                                        case 125:
                                            c0rv = C0RV.SYNCING;
                                            break;
                                        default:
                                            c0rv = null;
                                            break;
                                    }
                                    if (c0rv == null) {
                                        super.A0F(24, A022);
                                        continue;
                                    } else {
                                        this.A01 |= 8192;
                                        this.A05 = A022;
                                    }
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 200:
                                    this.A01 |= 16384;
                                    this.A0N = c0ro.A0F();
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 210:
                                    String A0A3 = c0ro.A0A();
                                    C0CX c0cx = this.A0B;
                                    if (!((C0CY) c0cx).A00) {
                                        c0cx = C0AZ.A05(c0cx);
                                        this.A0B = c0cx;
                                    }
                                    c0cx.add(A0A3);
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 216:
                                    this.A01 |= 32768;
                                    this.A03 = c0ro.A02();
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 226:
                                    String A0A4 = c0ro.A0A();
                                    C0CX c0cx2 = this.A0A;
                                    if (!((C0CY) c0cx2).A00) {
                                        c0cx2 = C0AZ.A05(c0cx2);
                                        this.A0A = c0cx2;
                                    }
                                    c0cx2.add(A0A4);
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 234:
                                    if ((this.A01 & 65536) == 65536) {
                                        c2gf2 = (C2GF) this.A0G.AVX();
                                    } else {
                                        c2gf2 = null;
                                    }
                                    C21Z c21z = (C21Z) c0ro.A09(C21Z.A0B.A0C(), c0rp);
                                    this.A0G = c21z;
                                    if (c2gf2 != null) {
                                        c2gf2.A03(c21z);
                                        this.A0G = (C21Z) c2gf2.A00();
                                    }
                                    this.A01 |= 65536;
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 242:
                                    if ((this.A01 & C42271vT.A09) == 131072) {
                                        c21x = (C21X) this.A0C.AVX();
                                    } else {
                                        c21x = null;
                                    }
                                    C21Y c21y = (C21Y) c0ro.A09(C21Y.A0B.A0C(), c0rp);
                                    this.A0C = c21y;
                                    if (c21x != null) {
                                        c21x.A03(c21y);
                                        this.A0C = (C21Y) c21x.A00();
                                    }
                                    this.A01 |= C42271vT.A09;
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 250:
                                    if ((this.A01 & 262144) == 262144) {
                                        c2gf = (C2GF) this.A0H.AVX();
                                    } else {
                                        c2gf = null;
                                    }
                                    C21Z c21z2 = (C21Z) c0ro.A09(C21Z.A0B.A0C(), c0rp);
                                    this.A0H = c21z2;
                                    if (c2gf != null) {
                                        c2gf.A03(c21z2);
                                        this.A0H = (C21Z) c2gf.A00();
                                    }
                                    this.A01 |= 262144;
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 256:
                                    this.A01 |= 524288;
                                    this.A07 = c0ro.A06();
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 264:
                                    this.A01 |= 1048576;
                                    this.A04 = c0ro.A02();
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 272:
                                    this.A01 |= 2097152;
                                    this.A0O = c0ro.A0F();
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 280:
                                    this.A01 |= i;
                                    this.A0P = c0ro.A0F();
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 288:
                                    int A023 = c0ro.A02();
                                    if (A023 == 0) {
                                        c2gg = C2GG.E2EE;
                                    } else if (A023 == 1) {
                                        c2gg = C2GG.BSP;
                                    } else if (A023 != 2) {
                                        c2gg = A023 != 3 ? null : C2GG.BSP_AND_FB;
                                    } else {
                                        c2gg = C2GG.FB;
                                    }
                                    if (c2gg == null) {
                                        super.A0F(36, A023);
                                        continue;
                                    } else {
                                        this.A01 |= 8388608;
                                        this.A02 = A023;
                                    }
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 298:
                                    String A0A5 = c0ro.A0A();
                                    this.A01 |= i2;
                                    this.A0L = A0A5;
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 306:
                                    if ((this.A01 & 33554432) == 33554432) {
                                        c2gh = (C2GH) this.A0F.AVX();
                                    } else {
                                        c2gh = null;
                                    }
                                    C24A c24a = (C24A) c0ro.A09(C24A.A02.A0C(), c0rp);
                                    this.A0F = c24a;
                                    if (c2gh != null) {
                                        c2gh.A03(c24a);
                                        this.A0F = (C24A) c2gh.A00();
                                    }
                                    this.A01 |= 33554432;
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                case 314:
                                    if ((this.A01 & 67108864) == 67108864) {
                                        c2gi = (C2GI) this.A0I.AVX();
                                    } else {
                                        c2gi = null;
                                    }
                                    C2GD c2gd = (C2GD) c0ro.A09(C2GD.A04.A0C(), c0rp);
                                    this.A0I = c2gd;
                                    if (c2gi != null) {
                                        c2gi.A03(c2gd);
                                        this.A0I = (C2GD) c2gi.A00();
                                    }
                                    this.A01 = 67108864 | this.A01;
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                default:
                                    if (!A0I(A03, c0ro)) {
                                        break;
                                    } else {
                                        continue;
                                        i = 4194304;
                                        i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                    }
                            }
                            z5 = true;
                            i = 4194304;
                            i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                        } catch (IOException e) {
                            C0JX c0jx = new C0JX(e.getMessage());
                            c0jx.unfinishedMessage = this;
                            throw new RuntimeException(c0jx);
                        }
                    } catch (C0JX e2) {
                        e2.unfinishedMessage = this;
                        throw new RuntimeException(e2);
                    }
                }
                break;
            case 3:
                ((C0CY) this.A0B).A00 = false;
                ((C0CY) this.A0A).A00 = false;
                return null;
            case 4:
                return new C452821e();
            case 5:
                return new C0KA();
            case 6:
                break;
            case 7:
                if (A0W == null) {
                    synchronized (C452821e.class) {
                        if (A0W == null) {
                            A0W = new C0RR(A0V);
                        }
                    }
                }
                return A0W;
            default:
                throw new UnsupportedOperationException();
        }
        return A0V;
    }

    @Override // X.C0AX
    public int AD4() {
        int i;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if ((this.A01 & 1) == 1) {
            C452421a c452421a = this.A0E;
            if (c452421a == null) {
                c452421a = C452421a.A05;
            }
            i = C0RS.A0A(1, c452421a) + 0;
        } else {
            i = 0;
        }
        if ((this.A01 & 2) == 2) {
            C40531sQ c40531sQ = this.A0D;
            if (c40531sQ == null) {
                c40531sQ = C40531sQ.A0c;
            }
            i += C0RS.A0A(2, c40531sQ);
        }
        int i3 = this.A01;
        if ((i3 & 4) == 4) {
            i += C0RS.A08(3, this.A08);
        }
        if ((i3 & 8) == 8) {
            i += C0RS.A04(4, this.A06);
        }
        if ((i3 & 16) == 16) {
            i += C0RS.A0B(5, this.A0J);
        }
        int i4 = this.A01;
        if ((i4 & 32) == 32) {
            i += C0RS.A00(16);
        }
        if ((i4 & 64) == 64) {
            i += C0RS.A00(17);
        }
        if ((i4 & 128) == 128) {
            i += C0RS.A00(18);
        }
        if ((i4 & 256) == 256) {
            i += C0RS.A0B(19, this.A0K);
        }
        int i5 = this.A01;
        if ((i5 & 512) == 512) {
            i += C0RS.A09(20, this.A09);
        }
        if ((i5 & 1024) == 1024) {
            i += C0RS.A00(21);
        }
        if ((i5 & 2048) == 2048) {
            i += C0RS.A00(22);
        }
        if ((i5 & 4096) == 4096) {
            i += C0RS.A00(23);
        }
        if ((i5 & 8192) == 8192) {
            i += C0RS.A04(24, this.A05);
        }
        if ((i5 & 16384) == 16384) {
            i += C0RS.A00(25);
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.A0B.size(); i7++) {
            i6 += C0RS.A0D((String) this.A0B.get(i7));
        }
        int size = (this.A0B.size() << 1) + i + i6;
        if ((this.A01 & 32768) == 32768) {
            size += C0RS.A06(27, this.A03);
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.A0A.size(); i9++) {
            i8 += C0RS.A0D((String) this.A0A.get(i9));
        }
        int size2 = (this.A0A.size() << 1) + size + i8;
        if ((this.A01 & 65536) == 65536) {
            C21Z c21z = this.A0G;
            if (c21z == null) {
                c21z = C21Z.A0B;
            }
            size2 += C0RS.A0A(29, c21z);
        }
        if ((this.A01 & C42271vT.A09) == 131072) {
            C21Y c21y = this.A0C;
            if (c21y == null) {
                c21y = C21Y.A0B;
            }
            size2 += C0RS.A0A(30, c21y);
        }
        if ((this.A01 & 262144) == 262144) {
            C21Z c21z2 = this.A0H;
            if (c21z2 == null) {
                c21z2 = C21Z.A0B;
            }
            size2 += C0RS.A0A(31, c21z2);
        }
        int i10 = this.A01;
        if ((i10 & 524288) == 524288) {
            size2 += C0RS.A08(32, this.A07);
        }
        if ((i10 & 1048576) == 1048576) {
            size2 += C0RS.A06(33, this.A04);
        }
        if ((i10 & 2097152) == 2097152) {
            size2 += C0RS.A00(34);
        }
        if ((i10 & 4194304) == 4194304) {
            size2 += C0RS.A00(35);
        }
        if ((i10 & 8388608) == 8388608) {
            size2 += C0RS.A04(36, this.A02);
        }
        if ((i10 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 16777216) {
            size2 += C0RS.A0B(37, this.A0L);
        }
        if ((this.A01 & 33554432) == 33554432) {
            C24A c24a = this.A0F;
            if (c24a == null) {
                c24a = C24A.A02;
            }
            size2 += C0RS.A0A(38, c24a);
        }
        if ((this.A01 & 67108864) == 67108864) {
            C2GD c2gd = this.A0I;
            if (c2gd == null) {
                c2gd = C2GD.A04;
            }
            size2 += C0RS.A0A(39, c2gd);
        }
        int A00 = this.unknownFields.A00() + size2;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A01 & 1) == 1) {
            C452421a c452421a = this.A0E;
            if (c452421a == null) {
                c452421a = C452421a.A05;
            }
            c0rs.A0O(1, c452421a);
        }
        if ((this.A01 & 2) == 2) {
            C40531sQ c40531sQ = this.A0D;
            if (c40531sQ == null) {
                c40531sQ = C40531sQ.A0c;
            }
            c0rs.A0O(2, c40531sQ);
        }
        if ((this.A01 & 4) == 4) {
            c0rs.A0M(3, this.A08);
        }
        if ((this.A01 & 8) == 8) {
            c0rs.A0I(4, this.A06);
        }
        if ((this.A01 & 16) == 16) {
            c0rs.A0P(5, this.A0J);
        }
        if ((this.A01 & 32) == 32) {
            c0rs.A0Q(16, this.A0Q);
        }
        if ((this.A01 & 64) == 64) {
            c0rs.A0Q(17, this.A0S);
        }
        if ((this.A01 & 128) == 128) {
            c0rs.A0Q(18, this.A0M);
        }
        if ((this.A01 & 256) == 256) {
            c0rs.A0P(19, this.A0K);
        }
        if ((this.A01 & 512) == 512) {
            c0rs.A0N(20, this.A09);
        }
        if ((this.A01 & 1024) == 1024) {
            c0rs.A0Q(21, this.A0R);
        }
        if ((this.A01 & 2048) == 2048) {
            c0rs.A0Q(22, this.A0U);
        }
        if ((this.A01 & 4096) == 4096) {
            c0rs.A0Q(23, this.A0T);
        }
        if ((this.A01 & 8192) == 8192) {
            c0rs.A0I(24, this.A05);
        }
        if ((this.A01 & 16384) == 16384) {
            c0rs.A0Q(25, this.A0N);
        }
        for (int i = 0; i < this.A0B.size(); i++) {
            c0rs.A0P(26, (String) this.A0B.get(i));
        }
        if ((this.A01 & 32768) == 32768) {
            c0rs.A0K(27, this.A03);
        }
        for (int i2 = 0; i2 < this.A0A.size(); i2++) {
            c0rs.A0P(28, (String) this.A0A.get(i2));
        }
        if ((this.A01 & 65536) == 65536) {
            C21Z c21z = this.A0G;
            if (c21z == null) {
                c21z = C21Z.A0B;
            }
            c0rs.A0O(29, c21z);
        }
        if ((this.A01 & C42271vT.A09) == 131072) {
            C21Y c21y = this.A0C;
            if (c21y == null) {
                c21y = C21Y.A0B;
            }
            c0rs.A0O(30, c21y);
        }
        if ((this.A01 & 262144) == 262144) {
            C21Z c21z2 = this.A0H;
            if (c21z2 == null) {
                c21z2 = C21Z.A0B;
            }
            c0rs.A0O(31, c21z2);
        }
        if ((this.A01 & 524288) == 524288) {
            c0rs.A0M(32, this.A07);
        }
        if ((this.A01 & 1048576) == 1048576) {
            c0rs.A0K(33, this.A04);
        }
        if ((this.A01 & 2097152) == 2097152) {
            c0rs.A0Q(34, this.A0O);
        }
        if ((this.A01 & 4194304) == 4194304) {
            c0rs.A0Q(35, this.A0P);
        }
        if ((this.A01 & 8388608) == 8388608) {
            c0rs.A0I(36, this.A02);
        }
        if ((this.A01 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 16777216) {
            c0rs.A0P(37, this.A0L);
        }
        if ((this.A01 & 33554432) == 33554432) {
            C24A c24a = this.A0F;
            if (c24a == null) {
                c24a = C24A.A02;
            }
            c0rs.A0O(38, c24a);
        }
        if ((this.A01 & 67108864) == 67108864) {
            C2GD c2gd = this.A0I;
            if (c2gd == null) {
                c2gd = C2GD.A04;
            }
            c0rs.A0O(39, c2gd);
        }
        this.unknownFields.A02(c0rs);
    }
}
