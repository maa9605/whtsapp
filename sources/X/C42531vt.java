package X;

import java.util.List;

/* renamed from: X.1vt */
/* loaded from: classes2.dex */
public class C42531vt {
    public int A00;
    public long A01;
    public String A02;
    public List A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final long A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;

    public C42531vt(C2CJ c2cj) {
        String str = c2cj.A0B;
        if (str != null) {
            this.A0D = str;
            String str2 = c2cj.A0D;
            if (str2 != null) {
                this.A0F = str2;
                String str3 = c2cj.A0F;
                if (str3 != null) {
                    this.A0H = str3;
                    this.A09 = c2cj.A02;
                    this.A08 = c2cj.A01;
                    this.A05 = c2cj.A0N;
                    this.A0I = c2cj.A0G;
                    this.A0J = c2cj.A0H;
                    List list = c2cj.A0I;
                    if (list != null) {
                        this.A03 = list;
                        this.A0N = c2cj.A0O;
                        List list2 = c2cj.A0J;
                        if (list2 != null) {
                            this.A04 = list2;
                            this.A0E = c2cj.A0C;
                            this.A01 = c2cj.A00;
                            this.A02 = c2cj.A05;
                            this.A0A = c2cj.A08;
                            this.A0B = c2cj.A09;
                            this.A0L = c2cj.A0L;
                            this.A0G = c2cj.A0E;
                            this.A0C = c2cj.A0A;
                            this.A0K = c2cj.A0K;
                            this.A0M = c2cj.A0M;
                            return;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public String A00() {
        if (this.A0N) {
            return null;
        }
        StringBuilder A0P = C000200d.A0P("https://static.whatsapp.net/sticker?img=");
        A0P.append(this.A0A);
        return A0P.toString();
    }

    public boolean A01() {
        String str;
        String str2 = this.A02;
        return (str2 == null || (str = this.A0E) == null || str2.equals(str)) ? false : true;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("StickerPack{");
        stringBuffer.append("id='");
        C000200d.A1E(stringBuffer, this.A0D, ", name='");
        C000200d.A1E(stringBuffer, this.A0F, ", publisher='");
        C000200d.A1E(stringBuffer, this.A0H, ", description='");
        C000200d.A1E(stringBuffer, this.A09, ", size=");
        stringBuffer.append(this.A08);
        stringBuffer.append(", isDownloading=");
        stringBuffer.append(this.A05);
        stringBuffer.append(", trayImageId='");
        C000200d.A1E(stringBuffer, this.A0I, ", trayImagePreviewId='");
        C000200d.A1E(stringBuffer, this.A0J, ", previewImageIds=");
        stringBuffer.append(this.A03);
        stringBuffer.append(", stickers=");
        stringBuffer.append(this.A04);
        stringBuffer.append(", order=");
        stringBuffer.append(this.A00);
        stringBuffer.append(", isThirdParty=");
        stringBuffer.append(this.A0N);
        stringBuffer.append(", imageDataHash='");
        C000200d.A1E(stringBuffer, this.A0E, ", downloadedSize=");
        stringBuffer.append(this.A01);
        stringBuffer.append(", downloadedImageDataHash='");
        C000200d.A1E(stringBuffer, this.A02, ", downloadedTrayImageId='");
        C000200d.A1E(stringBuffer, this.A0A, ", downloadedTrayImagePreviewId='");
        C000200d.A1E(stringBuffer, this.A0B, ", isUnseen=");
        stringBuffer.append(this.A07);
        stringBuffer.append(", isNew=");
        stringBuffer.append(this.A06);
        stringBuffer.append(", avoidCaching=");
        stringBuffer.append(this.A0L);
        stringBuffer.append(", playLink='");
        C000200d.A1E(stringBuffer, this.A0G, ", iOSLink='");
        C000200d.A1E(stringBuffer, this.A0C, ", animatedPack=");
        stringBuffer.append(this.A0K);
        stringBuffer.append(", downloadedAnimatedPack=");
        stringBuffer.append(this.A0M);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
