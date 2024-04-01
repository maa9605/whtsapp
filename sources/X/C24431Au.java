package X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.1Au */
/* loaded from: classes.dex */
public final class C24431Au extends AbstractC39341py {
    public byte A00;
    public byte A01;
    public int A02;
    public int A03;
    public List A05;
    public List A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public static final int[] A0E = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A0D = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A0I = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] A0C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, C0M6.A03, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] A0F = {174, MediaCodecVideoEncoder.MIN_ENCODER_WIDTH, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] A0G = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] A0H = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public final C223812f A0A = new C223812f();
    public final ArrayList A0B = new ArrayList();
    public AnonymousClass119 A04 = new AnonymousClass119(0, 4);

    public C24431Au(String str, int i) {
        this.A08 = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i != 3 && i != 4) {
            this.A09 = 1;
        } else {
            this.A09 = 2;
        }
        A05(0);
        A04();
    }

    @Override // X.AbstractC39341py
    public AnonymousClass114 A00() {
        List list = this.A05;
        this.A06 = list;
        return new C30081Zr(list);
    }

    @Override // X.AbstractC39341py
    public void A01(C39321pw c39321pw) {
        int i;
        C223812f c223812f = this.A0A;
        byte[] array = c39321pw.A01.array();
        int limit = c39321pw.A01.limit();
        c223812f.A02 = array;
        c223812f.A00 = limit;
        c223812f.A01 = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int i2 = c223812f.A00 - c223812f.A01;
            int i3 = this.A08;
            if (i2 >= i3) {
                byte A01 = i3 == 2 ? (byte) -4 : (byte) c223812f.A01();
                byte A012 = (byte) (c223812f.A01() & 127);
                byte A013 = (byte) (c223812f.A01() & 127);
                if ((A01 & 6) == 4 && ((i = this.A09) != 1 || (A01 & 1) == 0)) {
                    if (i != 2 || (A01 & 1) == 1) {
                        if (A012 != 0 || A013 != 0) {
                            int i4 = A012 & 247;
                            if (i4 == 17 && (A013 & 240) == 48) {
                                this.A04.A05.append((char) A0F[A013 & 15]);
                            } else if ((A012 & 246) == 18 && (A013 & 224) == 32) {
                                this.A04.A01();
                                if ((A012 & 1) == 0) {
                                    this.A04.A05.append((char) A0G[A013 & 31]);
                                } else {
                                    this.A04.A05.append((char) A0H[A013 & 31]);
                                }
                            } else if ((A012 & 224) == 0) {
                                int i5 = A012 & 240;
                                z2 = false;
                                if (i5 == 16) {
                                    z2 = true;
                                    if (this.A07 && this.A00 == A012 && this.A01 == A013) {
                                        this.A07 = false;
                                    } else {
                                        this.A07 = true;
                                        this.A00 = A012;
                                        this.A01 = A013;
                                    }
                                }
                                if (i4 == 17 && (A013 & 240) == 32) {
                                    AnonymousClass119 anonymousClass119 = this.A04;
                                    StringBuilder sb = anonymousClass119.A05;
                                    sb.append(' ');
                                    anonymousClass119.A06.add(new AnonymousClass118((A013 >> 1) & 7, (A013 & 1) == 1, sb.length()));
                                } else if (i5 == 16 && (A013 & 192) == 64) {
                                    int i6 = A0E[A012 & 7];
                                    if ((A013 & 32) != 0) {
                                        i6++;
                                    }
                                    AnonymousClass119 anonymousClass1192 = this.A04;
                                    if (i6 != anonymousClass1192.A03) {
                                        if (this.A02 != 1 && (!anonymousClass1192.A06.isEmpty() || !anonymousClass1192.A07.isEmpty() || anonymousClass1192.A05.length() != 0)) {
                                            AnonymousClass119 anonymousClass1193 = new AnonymousClass119(this.A02, this.A03);
                                            this.A04 = anonymousClass1193;
                                            this.A0B.add(anonymousClass1193);
                                        }
                                        anonymousClass1192 = this.A04;
                                        anonymousClass1192.A03 = i6;
                                    }
                                    boolean z3 = (A013 & 16) == 16;
                                    boolean z4 = (A013 & 1) == 1;
                                    int i7 = (A013 >> 1) & 7;
                                    int i8 = i7;
                                    if (z3) {
                                        i8 = 8;
                                    }
                                    anonymousClass1192.A06.add(new AnonymousClass118(i8, z4, anonymousClass1192.A05.length()));
                                    if (z3) {
                                        this.A04.A02 = A0D[i7];
                                    }
                                } else if (i4 == 23) {
                                    if (A013 >= 33 && A013 <= 35) {
                                        this.A04.A04 = A013 - 32;
                                    }
                                } else if (i4 == 20 && (A013 & 240) == 32) {
                                    if (A013 == 32) {
                                        A05(2);
                                    } else if (A013 != 41) {
                                        switch (A013) {
                                            case 37:
                                                A05(1);
                                                this.A03 = 2;
                                                this.A04.A01 = 2;
                                                break;
                                            case 38:
                                                A05(1);
                                                this.A03 = 3;
                                                this.A04.A01 = 3;
                                                break;
                                            case 39:
                                                A05(1);
                                                this.A03 = 4;
                                                this.A04.A01 = 4;
                                                break;
                                            default:
                                                int i9 = this.A02;
                                                if (i9 != 0) {
                                                    if (A013 != 33) {
                                                        switch (A013) {
                                                            case 44:
                                                                this.A05 = Collections.emptyList();
                                                                int i10 = this.A02;
                                                                if (i10 == 1 || i10 == 3) {
                                                                    A04();
                                                                    break;
                                                                }
                                                            case 45:
                                                                if (i9 == 1) {
                                                                    AnonymousClass119 anonymousClass1194 = this.A04;
                                                                    if (!anonymousClass1194.A06.isEmpty() || !anonymousClass1194.A07.isEmpty() || anonymousClass1194.A05.length() != 0) {
                                                                        AnonymousClass119 anonymousClass1195 = this.A04;
                                                                        anonymousClass1195.A07.add(anonymousClass1195.A00());
                                                                        anonymousClass1195.A05.setLength(0);
                                                                        anonymousClass1195.A06.clear();
                                                                        int min = Math.min(anonymousClass1195.A01, anonymousClass1195.A03);
                                                                        while (true) {
                                                                            List list = anonymousClass1195.A07;
                                                                            if (list.size() < min) {
                                                                                break;
                                                                            } else {
                                                                                list.remove(0);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
                                                                A04();
                                                                break;
                                                            case 47:
                                                                this.A05 = A03();
                                                                A04();
                                                                break;
                                                        }
                                                    } else {
                                                        this.A04.A01();
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    } else {
                                        A05(3);
                                    }
                                }
                            } else {
                                AnonymousClass119 anonymousClass1196 = this.A04;
                                int[] iArr = A0C;
                                StringBuilder sb2 = anonymousClass1196.A05;
                                sb2.append((char) iArr[(A012 & Byte.MAX_VALUE) - 32]);
                                if ((A013 & 224) != 0) {
                                    sb2.append((char) iArr[(A013 & Byte.MAX_VALUE) - 32]);
                                }
                            }
                            z = true;
                        }
                    }
                }
            } else if (z) {
                if (!z2) {
                    this.A07 = false;
                }
                int i11 = this.A02;
                if (i11 == 1 || i11 == 3) {
                    this.A05 = A03();
                    return;
                }
                return;
            } else {
                return;
            }
        }
    }

    @Override // X.AbstractC39341py
    public boolean A02() {
        return this.A05 != this.A06;
    }

    public final List A03() {
        float f;
        int i;
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (true) {
            ArrayList arrayList2 = this.A0B;
            if (i4 >= arrayList2.size()) {
                return arrayList;
            }
            AnonymousClass119 anonymousClass119 = (AnonymousClass119) arrayList2.get(i4);
            if (anonymousClass119 != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i5 = 0; i5 < anonymousClass119.A07.size(); i5++) {
                    spannableStringBuilder.append((CharSequence) anonymousClass119.A07.get(i5));
                    spannableStringBuilder.append('\n');
                }
                spannableStringBuilder.append((CharSequence) anonymousClass119.A00());
                if (spannableStringBuilder.length() != 0) {
                    int i6 = anonymousClass119.A02 + anonymousClass119.A04;
                    int length = (32 - i6) - spannableStringBuilder.length();
                    int i7 = i6 - length;
                    if (anonymousClass119.A00 == 2 && (Math.abs(i7) < 3 || length < 0)) {
                        f = 0.5f;
                        i = 1;
                    } else if (anonymousClass119.A00 != 2 || i7 <= 0) {
                        f = ((i6 / 32.0f) * 0.8f) + 0.1f;
                        i = 0;
                    } else {
                        f = (((32 - length) / 32.0f) * 0.8f) + 0.1f;
                        i = 2;
                    }
                    if (anonymousClass119.A00 == 1 || (i2 = anonymousClass119.A03) > 7) {
                        i2 = (anonymousClass119.A03 - 15) - 2;
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    arrayList.add(new AnonymousClass113(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, i2, 1, i3, f, i, Float.MIN_VALUE));
                }
                i4++;
            } else {
                throw null;
            }
        }
    }

    public final void A04() {
        this.A04.A02(this.A02);
        ArrayList arrayList = this.A0B;
        arrayList.clear();
        arrayList.add(this.A04);
    }

    public final void A05(int i) {
        int i2 = this.A02;
        if (i2 == i) {
            return;
        }
        this.A02 = i;
        A04();
        if (i2 == 3 || i == 1 || i == 0) {
            this.A05 = Collections.emptyList();
        }
    }

    @Override // X.AbstractC39341py, X.InterfaceC21620zd
    public void flush() {
        super.flush();
        this.A05 = null;
        this.A06 = null;
        A05(0);
        this.A03 = 4;
        this.A04.A01 = 4;
        A04();
        this.A07 = false;
        this.A00 = (byte) 0;
        this.A01 = (byte) 0;
    }
}
