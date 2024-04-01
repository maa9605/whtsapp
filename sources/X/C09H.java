package X;

import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.MediaData;
import java.io.File;

/* renamed from: X.09H */
/* loaded from: classes.dex */
public class C09H {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public File A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public byte[] A0Q;
    public byte[] A0R;
    public byte[] A0S;
    public byte[] A0T;
    public byte[] A0U;
    public InteractiveAnnotation[] A0V;
    public transient boolean A0W;
    public transient boolean A0X;
    public transient boolean A0Y;
    public transient boolean A0Z;
    public transient boolean A0a;

    public boolean equals(Object obj) {
        return this == obj;
    }

    public C09H() {
    }

    public C09H(C09H c09h) {
        this.A0Q = c09h.A0Q;
        this.A0G = c09h.A0G;
        this.A0H = c09h.A0H;
        this.A02 = c09h.A02;
        this.A03 = c09h.A03;
        this.A0F = c09h.A0F;
        this.A0A = c09h.A0A;
        this.A04 = c09h.A04;
        this.A0R = c09h.A0R;
        this.A0M = c09h.A0M;
        this.A05 = c09h.A05;
        this.A06 = c09h.A06;
        this.A0S = c09h.A0S;
        this.A0V = c09h.A0V;
        this.A0T = c09h.A0T;
        this.A0I = c09h.A0I;
        this.A0U = c09h.A0U;
        this.A0B = c09h.A0B;
        this.A07 = c09h.A07;
        this.A00 = c09h.A00;
        this.A0P = c09h.A0P;
        this.A08 = c09h.A08;
        this.A0K = c09h.A0K;
        this.A0J = c09h.A0J;
        this.A01 = c09h.A01;
    }

    public static C09H A00(MediaData mediaData) {
        C09H c09h = new C09H();
        c09h.A0a = false;
        c09h.A0Y = false;
        c09h.A0W = false;
        c09h.A0Z = mediaData.A00;
        c09h.A0X = false;
        c09h.A0P = mediaData.transferred;
        c09h.A0C = mediaData.progress;
        c09h.A0F = mediaData.file;
        c09h.A0A = mediaData.fileSize;
        c09h.A0L = mediaData.autodownloadRetryEnabled;
        c09h.A0O = mediaData.transcoded;
        c09h.A07 = mediaData.suspiciousContent;
        c09h.A0D = mediaData.trimFrom;
        c09h.A0E = mediaData.trimTo;
        c09h.A02 = mediaData.faceX;
        c09h.A03 = mediaData.faceY;
        c09h.A0U = mediaData.mediaKey;
        c09h.A0Q = mediaData.cipherKey;
        c09h.A0S = mediaData.hmacKey;
        c09h.A0T = mediaData.iv;
        c09h.A08 = mediaData.width;
        c09h.A06 = mediaData.height;
        c09h.A0H = mediaData.doodleId;
        c09h.A0M = mediaData.hasStreamingSidecar;
        c09h.A09 = mediaData.cachedDownloadedBytes;
        c09h.A05 = mediaData.gifAttribution;
        c09h.A00 = mediaData.thumbnailHeightWidthRatio;
        c09h.A0I = mediaData.mediaJobUuid;
        c09h.A0G = mediaData.directPath;
        c09h.A0V = mediaData.interactiveAnnotations;
        c09h.A0R = mediaData.firstScanSidecar;
        c09h.A04 = mediaData.firstScanLength;
        c09h.A0B = mediaData.mediaKeyTimestampMs;
        c09h.A01 = c09h.A01;
        return c09h;
    }

    public MediaData A01() {
        MediaData mediaData = new MediaData();
        mediaData.cipherKey = this.A0Q;
        mediaData.directPath = this.A0G;
        mediaData.doodleId = this.A0H;
        mediaData.faceX = this.A02;
        mediaData.faceY = this.A03;
        mediaData.file = this.A0F;
        mediaData.fileSize = this.A0A;
        mediaData.firstScanLength = this.A04;
        mediaData.firstScanSidecar = this.A0R;
        mediaData.hasStreamingSidecar = this.A0M;
        mediaData.gifAttribution = this.A05;
        mediaData.height = this.A06;
        mediaData.hmacKey = this.A0S;
        mediaData.interactiveAnnotations = this.A0V;
        mediaData.iv = this.A0T;
        mediaData.mediaJobUuid = this.A0I;
        mediaData.mediaKey = this.A0U;
        mediaData.mediaKeyTimestampMs = this.A0B;
        mediaData.suspiciousContent = this.A07;
        mediaData.thumbnailHeightWidthRatio = this.A00;
        mediaData.transferred = this.A0P;
        mediaData.width = this.A08;
        mediaData.autodownloadRetryEnabled = this.A0L;
        mediaData.progress = this.A0C;
        mediaData.A00 = this.A0Z;
        mediaData.transcoded = this.A0O;
        mediaData.trimFrom = this.A0D;
        mediaData.trimTo = this.A0E;
        return mediaData;
    }

    public C09H A02() {
        C09H c09h = new C09H(this);
        c09h.A0L = this.A0L;
        c09h.A0C = this.A0C;
        c09h.A0Z = this.A0Z;
        c09h.A0O = this.A0O;
        c09h.A0D = this.A0D;
        c09h.A0E = this.A0E;
        c09h.A0M = this.A0M;
        c09h.A0N = this.A0N;
        return c09h;
    }

    public boolean A03() {
        File file = this.A0F;
        if (file != null) {
            return file.exists();
        }
        return false;
    }
}
