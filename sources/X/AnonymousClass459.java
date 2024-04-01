package X;

import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.Collections;
import java.util.List;

/* renamed from: X.459  reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass459 extends AbstractC886243v implements Cloneable {
    public Rect A00;
    public Rect A01;
    public C42C A02;
    public C42C A03;
    public C42C A04;
    public C42C A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Double A0A;
    public Double A0B;
    public Double A0C;
    public Float A0D;
    public Float A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public Integer A0I;
    public Integer A0J;
    public Integer A0K;
    public Integer A0L;
    public Integer A0M;
    public Integer A0N;
    public Integer A0O;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Integer A0S;
    public Integer A0T;
    public Long A0U;
    public String A0V;
    public String A0W;
    public List A0X;
    public List A0Y;
    public final AnonymousClass458 A0Z;
    public final int[] A0a;

    public AnonymousClass459(Camera.Parameters parameters, AnonymousClass458 anonymousClass458) {
        List emptyList;
        int i;
        List emptyList2;
        Camera.Size size;
        C42C c42c;
        Camera.Size size2;
        Boolean bool = Boolean.FALSE;
        this.A06 = bool;
        this.A07 = bool;
        this.A0H = 0;
        this.A0a = new int[2];
        this.A0Q = 0;
        this.A09 = bool;
        Double valueOf = Double.valueOf(0.0d);
        this.A0A = valueOf;
        this.A0C = valueOf;
        this.A0B = valueOf;
        this.A0U = 0L;
        this.A0N = 0;
        this.A0K = 0;
        this.A0W = parameters.flatten();
        this.A0Z = anonymousClass458;
        this.A0J = Integer.valueOf(C07K.A0J(parameters.getFocusMode()));
        this.A0F = Integer.valueOf(C07K.A0G(parameters.getAntibanding()));
        this.A0G = Integer.valueOf(C07K.A0H(parameters.getColorEffect()));
        if (((Boolean) anonymousClass458.A00(AbstractC885543o.A01)).booleanValue()) {
            this.A06 = Boolean.valueOf(parameters.getAutoExposureLock());
        }
        if (((Boolean) anonymousClass458.A00(AbstractC885543o.A03)).booleanValue()) {
            this.A07 = Boolean.valueOf(parameters.getAutoWhiteBalanceLock());
        }
        this.A0I = Integer.valueOf(C07K.A0I(parameters.getFlashMode()));
        if (((Boolean) anonymousClass458.A00(AbstractC885543o.A05)).booleanValue()) {
            this.A0H = Integer.valueOf(parameters.getExposureCompensation());
        }
        if (((Boolean) anonymousClass458.A00(AbstractC885543o.A0E)).booleanValue()) {
            emptyList = C885843r.A00(C885943s.A03(parameters.get("focus-areas")));
        } else {
            emptyList = Collections.emptyList();
        }
        this.A0X = emptyList;
        this.A0D = Float.valueOf(parameters.getHorizontalViewAngle());
        this.A0E = Float.valueOf(parameters.getVerticalViewAngle());
        this.A0L = Integer.valueOf(parameters.getJpegQuality());
        try {
            i = parameters.getJpegThumbnailQuality();
        } catch (NumberFormatException e) {
            StringBuilder A0P = C000200d.A0P("Invalid jpeg thumbnail quality parameter string=");
            A0P.append(parameters.get("jpeg-thumbnail-quality"));
            Log.e("ParametersHelper", A0P.toString(), e);
            i = 85;
        }
        this.A0M = Integer.valueOf(i);
        try {
            Camera.Size jpegThumbnailSize = parameters.getJpegThumbnailSize();
            this.A02 = new C42C(jpegThumbnailSize.width, jpegThumbnailSize.height);
        } catch (NumberFormatException unused) {
        }
        if (((Boolean) anonymousClass458.A00(AbstractC885543o.A0F)).booleanValue()) {
            emptyList2 = C885843r.A00(C885943s.A03(parameters.get("metering-areas")));
        } else {
            emptyList2 = Collections.emptyList();
        }
        this.A0Y = emptyList2;
        this.A0O = Integer.valueOf(parameters.getPictureFormat());
        try {
            size = parameters.getPictureSize();
        } catch (NumberFormatException unused2) {
            size = null;
        }
        C886143u c886143u = AbstractC886243v.A0Z;
        if (size != null) {
            c42c = new C42C(size.width, size.height);
        } else {
            c42c = null;
        }
        A02(c886143u, c42c);
        this.A0P = Integer.valueOf(parameters.getPreviewFormat());
        parameters.getPreviewFpsRange(this.A0a);
        if (!anonymousClass458.A0U.isEmpty()) {
            this.A0Q = Integer.valueOf(parameters.getPreviewFrameRate());
        }
        this.A0R = Integer.valueOf(C07K.A0K(parameters.getSceneMode()));
        this.A08 = Boolean.valueOf(parameters.getVideoStabilization());
        this.A0S = Integer.valueOf(C07K.A0L(parameters.getWhiteBalance()));
        this.A0T = Integer.valueOf(parameters.getZoom());
        try {
            size2 = parameters.getPreviewSize();
        } catch (NumberFormatException unused3) {
            size2 = null;
        }
        A02(AbstractC886243v.A0e, size2 != null ? new C42C(size2.width, size2.height) : null);
    }

    public String A01() {
        StringBuilder sb = new StringBuilder((int) SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        sb.append("mFocusMode");
        sb.append('=');
        sb.append(this.A0J);
        sb.append(",mAntibanding");
        sb.append('=');
        sb.append(this.A0F);
        sb.append(",mColorEffect");
        sb.append('=');
        sb.append(this.A0G);
        sb.append(",mIsAutoExposureLock");
        sb.append('=');
        sb.append(this.A06);
        sb.append(",mIsAutoWhiteBalanceLock");
        sb.append('=');
        sb.append(this.A07);
        sb.append(",mFlashMode");
        sb.append('=');
        sb.append(this.A0I);
        sb.append(",mExposureCompensation");
        sb.append('=');
        sb.append(this.A0H);
        sb.append(",mFocusAreas");
        sb.append('=');
        sb.append(C885943s.A01(this.A0X));
        sb.append(",mHorizontalViewAngle");
        sb.append('=');
        sb.append(this.A0D);
        sb.append(",mVerticalViewAngle");
        sb.append('=');
        sb.append(this.A0E);
        sb.append(",mJpegQuality");
        sb.append('=');
        sb.append(this.A0L);
        sb.append(",mJpegThumbnailQuality");
        sb.append('=');
        sb.append(this.A0M);
        sb.append(",mJpegThumbnailSize");
        sb.append('=');
        C42C c42c = this.A02;
        if (c42c != null) {
            sb.append(c42c.A01);
            sb.append('x');
            sb.append(c42c.A00);
        } else {
            sb.append("null");
        }
        sb.append(",mMeteringAreas");
        sb.append('=');
        sb.append(C885943s.A01(this.A0Y));
        sb.append(",mPictureFormat");
        sb.append('=');
        sb.append(this.A0O);
        sb.append(",mPictureSize");
        sb.append('=');
        C42C c42c2 = this.A03;
        if (c42c2 != null) {
            sb.append(c42c2.A01);
            sb.append('x');
            sb.append(c42c2.A00);
        } else {
            sb.append("null");
        }
        sb.append(",mPreviewFormat");
        sb.append('=');
        sb.append(this.A0P);
        sb.append(",mPreviewFpsRange");
        sb.append('=');
        int[] iArr = this.A0a;
        sb.append(iArr[0]);
        sb.append('-');
        sb.append(iArr[1]);
        sb.append(",mPreviewSize");
        sb.append('=');
        C42C c42c3 = this.A04;
        if (c42c3 != null) {
            sb.append(c42c3.A01);
            sb.append('x');
            sb.append(c42c3.A00);
        } else {
            sb.append("null");
        }
        sb.append(",mIsoSensitivity");
        sb.append('=');
        sb.append(this.A0K);
        sb.append(",mSceneMode");
        sb.append('=');
        sb.append(this.A0R);
        sb.append(",mIsVideoStabilizationEnabled");
        sb.append('=');
        sb.append(this.A08);
        sb.append(",mVideoSize");
        sb.append('=');
        C42C c42c4 = this.A05;
        if (c42c4 != null) {
            sb.append(c42c4.A01);
            sb.append('x');
            sb.append(c42c4.A00);
        } else {
            sb.append("null");
        }
        sb.append(",mWhiteBalance");
        sb.append('=');
        sb.append(this.A0S);
        sb.append(",mZoom");
        sb.append('=');
        sb.append(this.A0T);
        sb.append(",mPreviewRect");
        sb.append("=(");
        Rect rect = this.A01;
        sb.append(rect != null ? rect.flattenToString() : "null");
        sb.append(')');
        sb.append(",mPictureRect");
        sb.append("=(");
        Rect rect2 = this.A00;
        sb.append(rect2 != null ? rect2.flattenToString() : "null");
        sb.append(')');
        sb.append(",mRecordingHint");
        sb.append('=');
        sb.append(this.A09);
        sb.append(",mGpsAltitude");
        sb.append('=');
        sb.append(this.A0A);
        sb.append(",mGpsLongitude");
        sb.append('=');
        sb.append(this.A0C);
        sb.append(",mGpsLatitude");
        sb.append('=');
        sb.append(this.A0B);
        sb.append(",mGpsProcessingMethod");
        sb.append('=');
        sb.append(this.A0V);
        sb.append(",mGpsTimestamp");
        sb.append('=');
        sb.append(this.A0U);
        sb.append(",mPhotoRotation");
        sb.append('=');
        sb.append(this.A0N);
        sb.append(",mIsoSensitivity");
        sb.append('=');
        sb.append(this.A0K);
        sb.append(",mSourceConfig");
        sb.append('=');
        sb.append(this.A0W);
        return sb.toString();
    }

    public void A02(C886143u c886143u, Object obj) {
        int i = c886143u.A00;
        switch (i) {
            case 0:
                this.A06 = (Boolean) obj;
                return;
            case 1:
                this.A07 = (Boolean) obj;
                return;
            case 2:
                if (((Boolean) this.A0Z.A00(AbstractC885543o.A07)).booleanValue()) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    A02(AbstractC886243v.A0g, Integer.valueOf(booleanValue ? 17 : 0));
                    if (booleanValue) {
                        A02(AbstractC886243v.A0f, Boolean.FALSE);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                this.A08 = (Boolean) obj;
                return;
            case 4:
            case 5:
            case 6:
            case 7:
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
            case C0M6.A01 /* 20 */:
            case 27:
            case 28:
            case 39:
            case 40:
            default:
                StringBuilder A0P = C000200d.A0P("Cannot directly set: ");
                A0P.append(i);
                throw new RuntimeException(A0P.toString());
            case 8:
                this.A09 = (Boolean) obj;
                return;
            case 9:
                this.A0J = (Integer) obj;
                return;
            case 10:
                this.A0I = (Integer) obj;
                return;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                this.A0F = (Integer) obj;
                return;
            case 12:
                this.A0G = (Integer) obj;
                return;
            case 13:
                this.A0H = (Integer) obj;
                return;
            case 14:
                this.A0L = (Integer) obj;
                return;
            case 15:
                this.A0M = (Integer) obj;
                return;
            case 17:
                this.A0O = (Integer) obj;
                return;
            case 18:
                this.A0P = (Integer) obj;
                return;
            case 19:
                this.A0Q = (Integer) obj;
                return;
            case 21:
                this.A0N = (Integer) obj;
                return;
            case 22:
                this.A0K = (Integer) obj;
                return;
            case 23:
                this.A0R = (Integer) obj;
                return;
            case 24:
                this.A0S = (Integer) obj;
                return;
            case 25:
                this.A0T = (Integer) obj;
                return;
            case 26:
                this.A0U = (Long) obj;
                return;
            case 29:
                this.A0A = (Double) obj;
                return;
            case 30:
                this.A0C = (Double) obj;
                return;
            case 31:
                this.A0B = (Double) obj;
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                C42C c42c = (C42C) obj;
                this.A04 = c42c;
                this.A01 = c42c != null ? new Rect(0, 0, c42c.A01, c42c.A00) : null;
                return;
            case 33:
                C42C c42c2 = (C42C) obj;
                this.A03 = c42c2;
                this.A00 = c42c2 != null ? new Rect(0, 0, c42c2.A01, c42c2.A00) : null;
                return;
            case 34:
                this.A05 = (C42C) obj;
                return;
            case 35:
                this.A02 = (C42C) obj;
                return;
            case 36:
                this.A0X = C885843r.A00((List) obj);
                return;
            case 37:
                this.A0Y = C885843r.A00((List) obj);
                return;
            case 38:
                int[] iArr = (int[]) obj;
                if (iArr != null && iArr.length == 2) {
                    int[] iArr2 = this.A0a;
                    iArr2[0] = iArr[0];
                    iArr2[1] = iArr[1];
                    return;
                }
                return;
            case 41:
                this.A0V = (String) obj;
                return;
        }
    }

    public Object clone() {
        return super.clone();
    }
}
