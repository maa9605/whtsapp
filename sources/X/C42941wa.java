package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.IOException;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.1wa  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42941wa extends C0AZ implements C0AY {
    public static final C42941wa A0h;
    public static volatile C0RQ A0i;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public int A0Y;
    public int A0Z;
    public int A0a;
    public int A0b;
    public int A0c;
    public int A0d;
    public int A0e;
    public int A0f;
    public int A0g;

    static {
        C42941wa c42941wa = new C42941wa();
        A0h = c42941wa;
        c42941wa.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        int ordinal = c0rl.ordinal();
        int i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        boolean z = false;
        switch (ordinal) {
            case 0:
                return A0h;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C42941wa c42941wa = (C42941wa) obj2;
                int i2 = this.A01;
                boolean z2 = (i2 & 1) == 1;
                int i3 = this.A0E;
                int i4 = c42941wa.A01;
                this.A0E = c0rm.AW5(z2, i3, (i4 & 1) == 1, c42941wa.A0E);
                this.A0f = c0rm.AW5((i2 & 2) == 2, this.A0f, (i4 & 2) == 2, c42941wa.A0f);
                this.A0C = c0rm.AW5((i2 & 4) == 4, this.A0C, (i4 & 4) == 4, c42941wa.A0C);
                this.A0B = c0rm.AW5((i2 & 8) == 8, this.A0B, (i4 & 8) == 8, c42941wa.A0B);
                this.A04 = c0rm.AW5((i2 & 16) == 16, this.A04, (i4 & 16) == 16, c42941wa.A04);
                this.A0M = c0rm.AW5((i2 & 32) == 32, this.A0M, (i4 & 32) == 32, c42941wa.A0M);
                this.A0H = c0rm.AW5((i2 & 64) == 64, this.A0H, (i4 & 64) == 64, c42941wa.A0H);
                this.A0N = c0rm.AW5((i2 & 128) == 128, this.A0N, (i4 & 128) == 128, c42941wa.A0N);
                this.A0e = c0rm.AW5((i2 & 256) == 256, this.A0e, (i4 & 256) == 256, c42941wa.A0e);
                this.A0O = c0rm.AW5((i2 & 512) == 512, this.A0O, (i4 & 512) == 512, c42941wa.A0O);
                this.A0L = c0rm.AW5((i2 & 1024) == 1024, this.A0L, (i4 & 1024) == 1024, c42941wa.A0L);
                this.A0V = c0rm.AW5((i2 & 2048) == 2048, this.A0V, (i4 & 2048) == 2048, c42941wa.A0V);
                this.A0G = c0rm.AW5((i2 & 4096) == 4096, this.A0G, (i4 & 4096) == 4096, c42941wa.A0G);
                this.A0F = c0rm.AW5((i2 & 8192) == 8192, this.A0F, (i4 & 8192) == 8192, c42941wa.A0F);
                this.A0K = c0rm.AW5((i2 & 16384) == 16384, this.A0K, (i4 & 16384) == 16384, c42941wa.A0K);
                this.A0J = c0rm.AW5((i2 & 32768) == 32768, this.A0J, (i4 & 32768) == 32768, c42941wa.A0J);
                this.A0c = c0rm.AW5((i2 & 65536) == 65536, this.A0c, (i4 & 65536) == 65536, c42941wa.A0c);
                this.A0b = c0rm.AW5((i2 & C42271vT.A09) == 131072, this.A0b, (i4 & C42271vT.A09) == 131072, c42941wa.A0b);
                this.A0U = c0rm.AW5((i2 & 262144) == 262144, this.A0U, (i4 & 262144) == 262144, c42941wa.A0U);
                this.A0g = c0rm.AW5((i2 & 524288) == 524288, this.A0g, (i4 & 524288) == 524288, c42941wa.A0g);
                this.A0Z = c0rm.AW5((i2 & 1048576) == 1048576, this.A0Z, (i4 & 1048576) == 1048576, c42941wa.A0Z);
                this.A08 = c0rm.AW5((i2 & 2097152) == 2097152, this.A08, (i4 & 2097152) == 2097152, c42941wa.A08);
                this.A0D = c0rm.AW5((i2 & 4194304) == 4194304, this.A0D, (i4 & 4194304) == 4194304, c42941wa.A0D);
                this.A0R = c0rm.AW5((i2 & 8388608) == 8388608, this.A0R, (i4 & 8388608) == 8388608, c42941wa.A0R);
                this.A03 = c0rm.AW5((i2 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 16777216, this.A03, (i4 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 16777216, c42941wa.A03);
                this.A0T = c0rm.AW5((i2 & 33554432) == 33554432, this.A0T, (i4 & 33554432) == 33554432, c42941wa.A0T);
                this.A0d = c0rm.AW5((i2 & 67108864) == 67108864, this.A0d, (i4 & 67108864) == 67108864, c42941wa.A0d);
                this.A0Y = c0rm.AW5((i2 & 134217728) == 134217728, this.A0Y, (i4 & 134217728) == 134217728, c42941wa.A0Y);
                this.A0X = c0rm.AW5((i2 & 268435456) == 268435456, this.A0X, (i4 & 268435456) == 268435456, c42941wa.A0X);
                this.A07 = c0rm.AW5((i2 & 536870912) == 536870912, this.A07, (i4 & 536870912) == 536870912, c42941wa.A07);
                this.A05 = c0rm.AW5((i2 & 1073741824) == 1073741824, this.A05, (i4 & 1073741824) == 1073741824, c42941wa.A05);
                this.A0P = c0rm.AW5((i2 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) == Integer.MIN_VALUE, this.A0P, (i4 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) == Integer.MIN_VALUE, c42941wa.A0P);
                int i5 = this.A02;
                boolean z3 = (i5 & 1) == 1;
                int i6 = this.A0Q;
                int i7 = c42941wa.A02;
                this.A0Q = c0rm.AW5(z3, i6, (i7 & 1) == 1, c42941wa.A0Q);
                this.A0a = c0rm.AW5((i5 & 2) == 2, this.A0a, (i7 & 2) == 2, c42941wa.A0a);
                this.A0W = c0rm.AW5((i5 & 4) == 4, this.A0W, (i7 & 4) == 4, c42941wa.A0W);
                this.A0A = c0rm.AW5((i5 & 8) == 8, this.A0A, (i7 & 8) == 8, c42941wa.A0A);
                this.A09 = c0rm.AW5((i5 & 16) == 16, this.A09, (i7 & 16) == 16, c42941wa.A09);
                this.A0S = c0rm.AW5((i5 & 32) == 32, this.A0S, (i7 & 32) == 32, c42941wa.A0S);
                this.A00 = c0rm.AW5((i5 & 64) == 64, this.A00, (i7 & 64) == 64, c42941wa.A00);
                this.A06 = c0rm.AW5((i5 & 128) == 128, this.A06, (i7 & 128) == 128, c42941wa.A06);
                this.A0I = c0rm.AW5((i5 & 256) == 256, this.A0I, (i7 & 256) == 256, c42941wa.A0I);
                if (c0rm == C0RN.A00) {
                    this.A01 = i2 | i4;
                    this.A02 = i5 | i7;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!z) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            switch (A03) {
                                case 0:
                                    break;
                                case 8:
                                    int A02 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A02) == null) {
                                        super.A0F(1, A02);
                                        continue;
                                    } else {
                                        this.A01 |= 1;
                                        this.A0E = A02;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                                    int A022 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A022) == null) {
                                        super.A0F(2, A022);
                                        continue;
                                    } else {
                                        this.A01 |= 2;
                                        this.A0f = A022;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 24:
                                    int A023 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A023) == null) {
                                        super.A0F(3, A023);
                                        continue;
                                    } else {
                                        this.A01 |= 4;
                                        this.A0C = A023;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                                    int A024 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A024) == null) {
                                        super.A0F(4, A024);
                                        continue;
                                    } else {
                                        this.A01 |= 8;
                                        this.A0B = A024;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 40:
                                    int A025 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A025) == null) {
                                        super.A0F(5, A025);
                                        continue;
                                    } else {
                                        this.A01 |= 16;
                                        this.A04 = A025;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 48:
                                    int A026 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A026) == null) {
                                        super.A0F(6, A026);
                                        continue;
                                    } else {
                                        this.A01 |= 32;
                                        this.A0M = A026;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 56:
                                    int A027 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A027) == null) {
                                        super.A0F(7, A027);
                                        continue;
                                    } else {
                                        this.A01 |= 64;
                                        this.A0H = A027;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 64:
                                    int A028 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A028) == null) {
                                        super.A0F(8, A028);
                                        continue;
                                    } else {
                                        this.A01 |= 128;
                                        this.A0N = A028;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case C0M6.A02 /* 72 */:
                                    int A029 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A029) == null) {
                                        super.A0F(9, A029);
                                        continue;
                                    } else {
                                        this.A01 |= 256;
                                        this.A0e = A029;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 80:
                                    int A0210 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0210) == null) {
                                        super.A0F(10, A0210);
                                        continue;
                                    } else {
                                        this.A01 |= 512;
                                        this.A0O = A0210;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 88:
                                    int A0211 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0211) == null) {
                                        super.A0F(11, A0211);
                                        continue;
                                    } else {
                                        this.A01 |= 1024;
                                        this.A0L = A0211;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 96:
                                    int A0212 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0212) == null) {
                                        super.A0F(12, A0212);
                                        continue;
                                    } else {
                                        this.A01 |= 2048;
                                        this.A0V = A0212;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 104:
                                    int A0213 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0213) == null) {
                                        super.A0F(13, A0213);
                                        continue;
                                    } else {
                                        this.A01 |= 4096;
                                        this.A0G = A0213;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 112:
                                    int A0214 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0214) == null) {
                                        super.A0F(14, A0214);
                                        continue;
                                    } else {
                                        this.A01 |= 8192;
                                        this.A0F = A0214;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 120:
                                    int A0215 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0215) == null) {
                                        super.A0F(15, A0215);
                                        continue;
                                    } else {
                                        this.A01 |= 16384;
                                        this.A0K = A0215;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /* 144 */:
                                    int A0216 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0216) == null) {
                                        super.A0F(18, A0216);
                                        continue;
                                    } else {
                                        this.A01 |= 32768;
                                        this.A0J = A0216;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 152:
                                    int A0217 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0217) == null) {
                                        super.A0F(19, A0217);
                                        continue;
                                    } else {
                                        this.A01 |= 65536;
                                        this.A0c = A0217;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 160:
                                    int A0218 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0218) == null) {
                                        super.A0F(20, A0218);
                                        continue;
                                    } else {
                                        this.A01 |= C42271vT.A09;
                                        this.A0b = A0218;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 168:
                                    int A0219 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0219) == null) {
                                        super.A0F(21, A0219);
                                        continue;
                                    } else {
                                        this.A01 |= 262144;
                                        this.A0U = A0219;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /* 176 */:
                                    int A0220 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0220) == null) {
                                        super.A0F(22, A0220);
                                        continue;
                                    } else {
                                        this.A01 |= 524288;
                                        this.A0g = A0220;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 184:
                                    int A0221 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0221) == null) {
                                        super.A0F(23, A0221);
                                        continue;
                                    } else {
                                        this.A01 |= 1048576;
                                        this.A0Z = A0221;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 192:
                                    int A0222 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0222) == null) {
                                        super.A0F(24, A0222);
                                        continue;
                                    } else {
                                        this.A01 |= 2097152;
                                        this.A08 = A0222;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 200:
                                    int A0223 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0223) == null) {
                                        super.A0F(25, A0223);
                                        continue;
                                    } else {
                                        this.A01 |= 4194304;
                                        this.A0D = A0223;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 208:
                                    int A0224 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0224) == null) {
                                        super.A0F(26, A0224);
                                        continue;
                                    } else {
                                        this.A01 |= 8388608;
                                        this.A0R = A0224;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 216:
                                    int A0225 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0225) == null) {
                                        super.A0F(27, A0225);
                                        continue;
                                    } else {
                                        this.A01 |= EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                        this.A03 = A0225;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 224:
                                    int A0226 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0226) == null) {
                                        super.A0F(28, A0226);
                                        continue;
                                    } else {
                                        this.A01 |= 33554432;
                                        this.A0T = A0226;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 232:
                                    int A0227 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0227) == null) {
                                        super.A0F(29, A0227);
                                        continue;
                                    } else {
                                        this.A01 |= 67108864;
                                        this.A0d = A0227;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 240:
                                    int A0228 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0228) == null) {
                                        super.A0F(30, A0228);
                                        continue;
                                    } else {
                                        this.A01 |= 134217728;
                                        this.A0Y = A0228;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 248:
                                    int A0229 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0229) == null) {
                                        super.A0F(31, A0229);
                                        continue;
                                    } else {
                                        this.A01 |= 268435456;
                                        this.A0X = A0229;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 256:
                                    int A0230 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0230) == null) {
                                        super.A0F(32, A0230);
                                        continue;
                                    } else {
                                        this.A01 |= 536870912;
                                        this.A07 = A0230;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 264:
                                    int A0231 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0231) == null) {
                                        super.A0F(33, A0231);
                                        continue;
                                    } else {
                                        this.A01 |= 1073741824;
                                        this.A05 = A0231;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 272:
                                    int A0232 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0232) == null) {
                                        super.A0F(34, A0232);
                                        continue;
                                    } else {
                                        this.A01 |= i;
                                        this.A0P = A0232;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 288:
                                    int A0233 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0233) == null) {
                                        super.A0F(36, A0233);
                                        continue;
                                    } else {
                                        this.A02 |= 1;
                                        this.A0Q = A0233;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 296:
                                    int A0234 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0234) == null) {
                                        super.A0F(37, A0234);
                                        continue;
                                    } else {
                                        this.A02 |= 2;
                                        this.A0a = A0234;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 312:
                                    int A0235 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0235) == null) {
                                        super.A0F(39, A0235);
                                        continue;
                                    } else {
                                        this.A02 |= 4;
                                        this.A0W = A0235;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 320:
                                    int A0236 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0236) == null) {
                                        super.A0F(40, A0236);
                                        continue;
                                    } else {
                                        this.A02 |= 8;
                                        this.A0A = A0236;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 328:
                                    int A0237 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0237) == null) {
                                        super.A0F(41, A0237);
                                        continue;
                                    } else {
                                        this.A02 |= 16;
                                        this.A09 = A0237;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 336:
                                    int A0238 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0238) == null) {
                                        super.A0F(42, A0238);
                                        continue;
                                    } else {
                                        this.A02 |= 32;
                                        this.A0S = A0238;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 344:
                                    int A0239 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0239) == null) {
                                        super.A0F(43, A0239);
                                        continue;
                                    } else {
                                        this.A02 |= 64;
                                        this.A00 = A0239;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 352:
                                    int A0240 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0240) == null) {
                                        super.A0F(44, A0240);
                                        continue;
                                    } else {
                                        this.A02 |= 128;
                                        this.A06 = A0240;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                case 368:
                                    int A0241 = c0ro.A02();
                                    if (EnumC42931wZ.A00(A0241) == null) {
                                        super.A0F(46, A0241);
                                        continue;
                                    } else {
                                        this.A02 |= 256;
                                        this.A0I = A0241;
                                    }
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                default:
                                    if (!A0I(A03, c0ro)) {
                                        break;
                                    } else {
                                        continue;
                                        i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                    }
                            }
                            z = true;
                            i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
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
                return null;
            case 4:
                return new C42941wa();
            case 5:
                return new C0CT() { // from class: X.41P
                    {
                        C42941wa c42941wa2 = C42941wa.A0h;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0i == null) {
                    synchronized (C42941wa.class) {
                        if (A0i == null) {
                            A0i = new C0RR(A0h);
                        }
                    }
                }
                return A0i;
            default:
                throw new UnsupportedOperationException();
        }
        return A0h;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = this.A01;
        int A04 = (i2 & 1) == 1 ? 0 + C0RS.A04(1, this.A0E) : 0;
        if ((i2 & 2) == 2) {
            A04 += C0RS.A04(2, this.A0f);
        }
        if ((i2 & 4) == 4) {
            A04 += C0RS.A04(3, this.A0C);
        }
        if ((i2 & 8) == 8) {
            A04 += C0RS.A04(4, this.A0B);
        }
        if ((i2 & 16) == 16) {
            A04 += C0RS.A04(5, this.A04);
        }
        if ((i2 & 32) == 32) {
            A04 += C0RS.A04(6, this.A0M);
        }
        if ((i2 & 64) == 64) {
            A04 += C0RS.A04(7, this.A0H);
        }
        if ((i2 & 128) == 128) {
            A04 += C0RS.A04(8, this.A0N);
        }
        if ((i2 & 256) == 256) {
            A04 += C0RS.A04(9, this.A0e);
        }
        if ((i2 & 512) == 512) {
            A04 += C0RS.A04(10, this.A0O);
        }
        if ((i2 & 1024) == 1024) {
            A04 += C0RS.A04(11, this.A0L);
        }
        if ((i2 & 2048) == 2048) {
            A04 += C0RS.A04(12, this.A0V);
        }
        if ((i2 & 4096) == 4096) {
            A04 += C0RS.A04(13, this.A0G);
        }
        if ((i2 & 8192) == 8192) {
            A04 += C0RS.A04(14, this.A0F);
        }
        if ((i2 & 16384) == 16384) {
            A04 += C0RS.A04(15, this.A0K);
        }
        if ((i2 & 32768) == 32768) {
            A04 += C0RS.A04(18, this.A0J);
        }
        if ((i2 & 65536) == 65536) {
            A04 += C0RS.A04(19, this.A0c);
        }
        if ((i2 & C42271vT.A09) == 131072) {
            A04 += C0RS.A04(20, this.A0b);
        }
        if ((i2 & 262144) == 262144) {
            A04 += C0RS.A04(21, this.A0U);
        }
        if ((i2 & 524288) == 524288) {
            A04 += C0RS.A04(22, this.A0g);
        }
        if ((i2 & 1048576) == 1048576) {
            A04 += C0RS.A04(23, this.A0Z);
        }
        if ((i2 & 2097152) == 2097152) {
            A04 += C0RS.A04(24, this.A08);
        }
        if ((i2 & 4194304) == 4194304) {
            A04 += C0RS.A04(25, this.A0D);
        }
        if ((i2 & 8388608) == 8388608) {
            A04 += C0RS.A04(26, this.A0R);
        }
        if ((i2 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 16777216) {
            A04 += C0RS.A04(27, this.A03);
        }
        if ((i2 & 33554432) == 33554432) {
            A04 += C0RS.A04(28, this.A0T);
        }
        if ((i2 & 67108864) == 67108864) {
            A04 += C0RS.A04(29, this.A0d);
        }
        if ((i2 & 134217728) == 134217728) {
            A04 += C0RS.A04(30, this.A0Y);
        }
        if ((i2 & 268435456) == 268435456) {
            A04 += C0RS.A04(31, this.A0X);
        }
        if ((i2 & 536870912) == 536870912) {
            A04 += C0RS.A04(32, this.A07);
        }
        if ((i2 & 1073741824) == 1073741824) {
            A04 += C0RS.A04(33, this.A05);
        }
        if ((i2 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) == Integer.MIN_VALUE) {
            A04 += C0RS.A04(34, this.A0P);
        }
        int i3 = this.A02;
        if ((i3 & 1) == 1) {
            A04 += C0RS.A04(36, this.A0Q);
        }
        if ((i3 & 2) == 2) {
            A04 += C0RS.A04(37, this.A0a);
        }
        if ((i3 & 4) == 4) {
            A04 += C0RS.A04(39, this.A0W);
        }
        if ((i3 & 8) == 8) {
            A04 += C0RS.A04(40, this.A0A);
        }
        if ((i3 & 16) == 16) {
            A04 += C0RS.A04(41, this.A09);
        }
        if ((i3 & 32) == 32) {
            A04 += C0RS.A04(42, this.A0S);
        }
        if ((i3 & 64) == 64) {
            A04 += C0RS.A04(43, this.A00);
        }
        if ((i3 & 128) == 128) {
            A04 += C0RS.A04(44, this.A06);
        }
        if ((i3 & 256) == 256) {
            A04 += C0RS.A04(46, this.A0I);
        }
        int A00 = this.unknownFields.A00() + A04;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A01 & 1) == 1) {
            c0rs.A0I(1, this.A0E);
        }
        if ((this.A01 & 2) == 2) {
            c0rs.A0I(2, this.A0f);
        }
        if ((this.A01 & 4) == 4) {
            c0rs.A0I(3, this.A0C);
        }
        if ((this.A01 & 8) == 8) {
            c0rs.A0I(4, this.A0B);
        }
        if ((this.A01 & 16) == 16) {
            c0rs.A0I(5, this.A04);
        }
        if ((this.A01 & 32) == 32) {
            c0rs.A0I(6, this.A0M);
        }
        if ((this.A01 & 64) == 64) {
            c0rs.A0I(7, this.A0H);
        }
        if ((this.A01 & 128) == 128) {
            c0rs.A0I(8, this.A0N);
        }
        if ((this.A01 & 256) == 256) {
            c0rs.A0I(9, this.A0e);
        }
        if ((this.A01 & 512) == 512) {
            c0rs.A0I(10, this.A0O);
        }
        if ((this.A01 & 1024) == 1024) {
            c0rs.A0I(11, this.A0L);
        }
        if ((this.A01 & 2048) == 2048) {
            c0rs.A0I(12, this.A0V);
        }
        if ((this.A01 & 4096) == 4096) {
            c0rs.A0I(13, this.A0G);
        }
        if ((this.A01 & 8192) == 8192) {
            c0rs.A0I(14, this.A0F);
        }
        if ((this.A01 & 16384) == 16384) {
            c0rs.A0I(15, this.A0K);
        }
        if ((this.A01 & 32768) == 32768) {
            c0rs.A0I(18, this.A0J);
        }
        if ((this.A01 & 65536) == 65536) {
            c0rs.A0I(19, this.A0c);
        }
        if ((this.A01 & C42271vT.A09) == 131072) {
            c0rs.A0I(20, this.A0b);
        }
        if ((this.A01 & 262144) == 262144) {
            c0rs.A0I(21, this.A0U);
        }
        if ((this.A01 & 524288) == 524288) {
            c0rs.A0I(22, this.A0g);
        }
        if ((this.A01 & 1048576) == 1048576) {
            c0rs.A0I(23, this.A0Z);
        }
        if ((this.A01 & 2097152) == 2097152) {
            c0rs.A0I(24, this.A08);
        }
        if ((this.A01 & 4194304) == 4194304) {
            c0rs.A0I(25, this.A0D);
        }
        if ((this.A01 & 8388608) == 8388608) {
            c0rs.A0I(26, this.A0R);
        }
        if ((this.A01 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 16777216) {
            c0rs.A0I(27, this.A03);
        }
        if ((this.A01 & 33554432) == 33554432) {
            c0rs.A0I(28, this.A0T);
        }
        if ((this.A01 & 67108864) == 67108864) {
            c0rs.A0I(29, this.A0d);
        }
        if ((this.A01 & 134217728) == 134217728) {
            c0rs.A0I(30, this.A0Y);
        }
        if ((this.A01 & 268435456) == 268435456) {
            c0rs.A0I(31, this.A0X);
        }
        if ((this.A01 & 536870912) == 536870912) {
            c0rs.A0I(32, this.A07);
        }
        if ((this.A01 & 1073741824) == 1073741824) {
            c0rs.A0I(33, this.A05);
        }
        if ((this.A01 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) == Integer.MIN_VALUE) {
            c0rs.A0I(34, this.A0P);
        }
        if ((this.A02 & 1) == 1) {
            c0rs.A0I(36, this.A0Q);
        }
        if ((this.A02 & 2) == 2) {
            c0rs.A0I(37, this.A0a);
        }
        if ((this.A02 & 4) == 4) {
            c0rs.A0I(39, this.A0W);
        }
        if ((this.A02 & 8) == 8) {
            c0rs.A0I(40, this.A0A);
        }
        if ((this.A02 & 16) == 16) {
            c0rs.A0I(41, this.A09);
        }
        if ((this.A02 & 32) == 32) {
            c0rs.A0I(42, this.A0S);
        }
        if ((this.A02 & 64) == 64) {
            c0rs.A0I(43, this.A00);
        }
        if ((this.A02 & 128) == 128) {
            c0rs.A0I(44, this.A06);
        }
        if ((this.A02 & 256) == 256) {
            c0rs.A0I(46, this.A0I);
        }
        this.unknownFields.A02(c0rs);
    }
}
