package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.0DC */
/* loaded from: classes.dex */
public class C0DC implements Parcelable {
    public static final C0DC A04;
    public static final C0DC A05;
    public static final C0DC A06;
    public static final C0DC A07;
    public static final C0DC A08;
    public static final C0DC A09;
    public static final C0DC A0A;
    public static final C0DC A0B;
    public static final C0DC A0C;
    public static final C0DC A0D;
    public static final C0DC A0E;
    public static final C0DC A0F;
    public static final C0DC A0G;
    public static final C0DC A0H;
    public static final C0DC A0I;
    public static final C0DC A0J;
    public static final C0DC A0K;
    public static final C0DC A0L;
    public static final C0DC A0M;
    public static final C0DC A0N;
    public static final C0DC A0O;
    public static final C0DC A0P;
    public static final C0DC A0Q;
    public static final byte[] A0R;
    public static final byte[] A0S;
    public static final byte[] A0T;
    public static final byte[] A0U;
    public static final byte[] A0V;
    public static final byte[] A0W;
    public static final byte[] A0X;
    public static final byte[] A0Y;
    public static final byte[] A0Z;
    public static final byte[] A0a;
    public static final Parcelable.Creator CREATOR;
    public final byte A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    static {
        byte[] bytes = "WhatsApp Audio Keys".getBytes();
        A0R = bytes;
        byte[] bytes2 = "WhatsApp Image Keys".getBytes();
        A0U = bytes2;
        byte[] bytes3 = "WhatsApp Image Thumbnail Keys".getBytes();
        A0V = bytes3;
        byte[] bytes4 = "WhatsApp Video Keys".getBytes();
        A0Z = bytes4;
        byte[] bytes5 = "WhatsApp Video Thumbnail Keys".getBytes();
        A0a = bytes5;
        byte[] bytes6 = "WhatsApp Document Keys".getBytes();
        A0S = bytes6;
        byte[] bytes7 = "WhatsApp Document Thumbnail Keys".getBytes();
        A0T = bytes7;
        byte[] bytes8 = "WhatsApp App State Keys".getBytes();
        A0W = bytes8;
        byte[] bytes9 = "WhatsApp History Keys".getBytes();
        A0X = bytes9;
        A0Y = "walibra_hkdf_info".getBytes();
        A05 = new C0DC((byte) 2, bytes, "audio", "AUD");
        A0D = new C0DC((byte) 2, bytes, "ptt", "PTT");
        A0A = new C0DC((byte) 1, bytes2, "image", "IMG");
        A0B = new C0DC((byte) 1, bytes3, "thumbnail-image");
        A0P = new C0DC((byte) 42, bytes2, "image", "IMG");
        A0H = new C0DC((byte) 23, bytes2, "image", "IMG");
        A06 = new C0DC((byte) 37, bytes2, "image", "IMG");
        A0G = new C0DC((byte) 44, bytes2, "image", "IMG");
        A0I = new C0DC((byte) 20, bytes2, "sticker", "STK");
        A0L = new C0DC((byte) 25, bytes2, "image");
        A0C = new C0DC((byte) 1, bytes2, "kyc-id", null);
        A0N = new C0DC((byte) 3, bytes4, "video", "VID");
        A0O = new C0DC((byte) 3, bytes5, "thumbnail-video");
        A0Q = new C0DC((byte) 43, bytes4, "video", "VID");
        A04 = new C0DC((byte) 13, bytes4, "gif", "VID");
        A09 = new C0DC((byte) 13, bytes5, "thumbnail-gif");
        A0M = new C0DC((byte) 28, bytes4, "video");
        A0K = new C0DC((byte) 29, bytes4, "gif");
        A07 = new C0DC((byte) 9, bytes6, "document", "DOC");
        A0J = new C0DC((byte) 26, bytes6, "document");
        A08 = new C0DC((byte) 9, bytes7, "thumbnail-document");
        A0E = new C0DC((byte) 54, bytes8, "md-app-state");
        A0F = new C0DC((byte) 35, bytes9, "md-msg-hist");
        CREATOR = new Parcelable.Creator() { // from class: X.3TO
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return C0DC.A01(parcel.readByte(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C0DC[i];
            }
        };
    }

    public C0DC(byte b, byte[] bArr, String str) {
        this.A00 = b;
        this.A03 = bArr;
        this.A02 = str;
        this.A01 = null;
    }

    public C0DC(byte b, byte[] bArr, String str, String str2) {
        this.A00 = b;
        this.A03 = bArr;
        this.A02 = str;
        this.A01 = str2;
    }

    public static C0DC A00(byte b) {
        if (b != 1) {
            if (b != 3) {
                if (b != 9) {
                    if (b == 13) {
                        return A09;
                    }
                    throw new IllegalArgumentException(C000200d.A0D("media-file-type: The media type is not supported: type=", b));
                }
                return A08;
            }
            return A0O;
        }
        return A0B;
    }

    public static C0DC A01(byte b, int i) {
        if (b == 1) {
            return i == 6 ? A0C : A0A;
        } else if (b == 2) {
            return i == 1 ? A0D : A05;
        } else if (b != 3) {
            if (b != 9) {
                if (b != 13) {
                    if (b != 20) {
                        if (b != 23) {
                            if (b != 35) {
                                if (b != 37) {
                                    if (b != 54) {
                                        if (b != 25) {
                                            if (b != 26) {
                                                if (b != 28) {
                                                    if (b != 29) {
                                                        switch (b) {
                                                            case 42:
                                                                return A0P;
                                                            case 43:
                                                                return A0Q;
                                                            case 44:
                                                                return A0G;
                                                            default:
                                                                throw new IllegalArgumentException(C000200d.A0F("media-file-type: The media type is not supported: type=", b, ", mediaOrigin=", i));
                                                        }
                                                    }
                                                    return A0K;
                                                }
                                                return A0M;
                                            }
                                            return A0J;
                                        }
                                        return A0L;
                                    }
                                    return A0E;
                                }
                                return A06;
                            }
                            return A0F;
                        }
                        return A0H;
                    }
                    return A0I;
                }
                return A04;
            }
            return A07;
        } else {
            return A0N;
        }
    }

    public static C0DC A02(AnonymousClass092 anonymousClass092) {
        return A01(anonymousClass092.A0m, anonymousClass092.A04);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Byte.valueOf(this.A00)});
    }

    public String toString() {
        int i;
        StringBuilder A0P2 = C000200d.A0P("MmsType{type=");
        A0P2.append((int) this.A00);
        A0P2.append(", origin=");
        if (this == A0D) {
            i = 1;
        } else {
            i = 0;
            if (this == A0C) {
                i = 6;
            }
        }
        A0P2.append(i);
        A0P2.append(", fileType=");
        A0P2.append(this.A02);
        A0P2.append('}');
        return A0P2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeByte(this.A00);
        if (this == A0D) {
            i2 = 1;
        } else {
            i2 = 0;
            if (this == A0C) {
                i2 = 6;
            }
        }
        parcel.writeInt(i2);
    }
}
